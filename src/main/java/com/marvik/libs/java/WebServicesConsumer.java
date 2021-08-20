package com.marvik.libs.java;

import com.marvik.libs.java.net.WebServicesProvider;

import java.util.Map;

/**
 * Project - marvik-libs-java
 * Package - com.marvik.libs.java
 * <p>
 * WebServicesConsumer -
 * <p>
 * JEE Development Laptop
 * Created by victor on 23-Sep-17 at 1:37 PM.
 * <p>
 * Git repo : https://github.com/victormwenda/marvik-libs-java.git
 *
 * @author Victor Mwenda
 * @author +254(0)718034449
 * @author vmwenda.vm@gmail.com
 */
public class WebServicesConsumer extends WebServicesProvider {
    /**
     * Web services provide class that provides apis
     * for sending requests to the server and has call
     * backs to handle errors and provide information that is incoming from the server
     *
     * @param url
     * @param query
     * @param requestProperties
     */
    public WebServicesConsumer(String url, String query, Map requestProperties) {
        super(url, query, requestProperties);
    }

    /**
     * Called when the url is set
     *
     * @return the set url
     */
    @Override
    public String onSetURL() {
        return null;
    }

    /**
     * Called when the HTTP Process starts
     */
    @Override
    public void onStart() {

    }

    /**
     * Called when a successful connection has been created to the server
     *
     * @param statusCode
     */
    @Override
    public void onConnect(int statusCode) {

    }

    /**
     * Called when the query to send to the server has been set
     *
     * @return the query that had been set
     */
    @Override
    public String onSetQuery() {
        return null;
    }

    /**
     * Called when the set query has been sent to the server
     *
     * @return the sent query which is now appended to the url
     */
    @Override
    public String onSendQuery() {
        return null;
    }

    /**
     * Called when a response has been received from the server
     */
    @Override
    public void onReceiveResponse() {

    }

    /**
     * Called when the server response has started to be read the received response
     *
     * @param readResponse
     */
    @Override
    public void onReadResponse(String readResponse) {

    }

    /**
     * Called when the current read response has been appended to the previously read response
     *
     * @param appendedResponse
     */
    @Override
    public void onAppendResponse(String appendedResponse) {

    }

    /**
     * Called when the reader has finished reading the response sent from the server
     *
     * @param readResponse
     */
    @Override
    public void onFinishedReadingResponse(String readResponse) {
        System.out.println(readResponse);
    }

    /**
     * Called when the HTTP Process ends
     */
    @Override
    public void onFinish() {

    }

    /**
     * Called when an error has occurred making a HTTP_CONNECTION
     *
     * @param errorCode
     */
    @Override
    public void onConnectionError(int errorCode) {

    }

    /**
     * WebServicesProvider#onHTTPResultsFailed
     * <p>
     * Called when a the http results are successful
     *
     * @param resultText
     * @param client
     * @param clientAction
     * @param clientIntent
     * @param build
     */
    @Override
    public void onHttpResultsFailed(String resultText, String client, String clientAction, String clientIntent, String build) {

    }

    /**
     * WebServicesProvider#onHTTPResultsSuccessful
     * <p>
     * Called when a the http results are successful
     *
     * @param resultText
     * @param client
     * @param clientAction
     * @param clientIntent
     * @param build
     */
    @Override
    public void onHttpResultsSuccessful(String resultText, String client, String clientAction, String clientIntent, String build) {

    }
}
