package com.farhan.springcellar.domain;

/**
 * Created by farhan on 8/5/16.
 */
public class RestResponse<T> {
    public boolean status = true;
    public String message = "";
    public T object;
}
