package com.marvik.libs.java.security.utils;


import com.marvik.libs.java.security.encryption.EncryptionAlgorithm;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * SecurityUtils
 * Security utilities
 * Created by victor on 7/9/2016.
 */
public class SecurityUtils {

    /**
     * Encrypts the passed text using the set encryption algorithm
     *
     * @param plainText           text to encrypt
     * @param encryptionAlgorithm algorithm to use
     * @return encryptedText
     */
    public static String encrypt(String plainText, EncryptionAlgorithm encryptionAlgorithm) {

        String encryptedText = null;
        String algorithm = null;
        switch (encryptionAlgorithm) {
            case MD5:
                algorithm = "MD5";
                break;
            case SHA1:
                algorithm = "SHA";
                break;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            byte[] input = plainText.getBytes();
            messageDigest.update(input);
            byte[] digest = messageDigest.digest();
            StringBuilder builder = new StringBuilder();
            for (byte _digest : digest) {
                builder.append(Integer.toHexString(_digest & 0xff));
            }
            encryptedText = builder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return encryptedText;
    }

    /**
     * Convert a string into a byte array
     *
     * @param text
     * @param charset
     * @return
     */
    public static String toBytesString(String text, Charset charset) {
        return Arrays.toString(text.getBytes(charset));
    }

    /**
     * Converts bytes array to string
     *
     * @param bytes
     * @param charset
     * @return
     */
    public static String bytesToString(byte[] bytes, Charset charset) {
        return new String(bytes, charset);
    }
}
