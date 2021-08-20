package com.marvik.libs.java.security.encryption;

/**
 * Project - marvik-libs-java
 * Package - com.marvik.libs.java.security.encryption
 * <p>
 * Transformation -
 * <p>
 * JEE Development Laptop
 * Created by victor on 21-Mar-18 at 5:34 AM.
 * <p>
 * Git repo : https://github.com/victormwenda/marvik-libs-java.git
 *
 * @author Victor Mwenda
 * @author +254(0)718034449
 * @author vmwenda.vm@gmail.com
 */
public class Transformation {
    //Algorithm
    public static final String RSA = "RSA";
    public static final String OAEP = "OAEP";

    //Models
    public static final String ECB = "ECB";
    public static final String CBC = "CBC";



    public static final String AES_CBC_NOPADDING = "AES/CBC/NoPadding";
    public static final String AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";
    public static final String AES_ECB_NOPADDING = "AES/ECB/NoPadding";
    public static final String AES_ECB_PKCS5PADDING = "AES/ECB/PKCS5Padding";
    public static final String DES_CBC_NOPADDIN = "DES/CBC/NoPaddin";
    public static final String DES_CBC_PKCS5PADDIN = "DES/CBC/PKCS5Paddin";
    public static final String DES_ECB_NOPADDIN = "DES/ECB/NoPaddin";
    public static final String DES_ECB_PKCS5PADDIN = "DES/ECB/PKCS5Paddin";
    public static final String DESEDE_CBC_NOPADDING = "DESede/CBC/NoPadding";
    public static final String DESEDE_CBC_PKCS5PADDING = "DESede/CBC/PKCS5Padding";
    public static final String DESEDE_ECB_NOPADDING = "DESede/ECB/NoPadding";
    public static final String DESEDE_ECB_PKCS5PADDING = "DESede/ECB/PKCS5Padding";
    public static final String RSA_ECB_PKCS1PADDING = "RSA/ECB/PKCS1Padding";
    public static final String RSA_NONE_PKCS1PADDING = "RSA/None/PKCS1Padding";
    public static final String RSA_ECB_OAEPWITHSHA_1ANDMGF1PADDING = "RSA/ECB/OAEPWithSHA1AndMGF1Padding";
    public static final String RSA_ECB_OAEPWITHSHA_256ANDMGF1PADDING = "RSA/ECB/OAEPWithSHA256AndMGF1Padding";
}
