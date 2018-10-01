package com.ngochung.apinetwork;

public class CSSResult<T, V> {

    private T httpCode;
    private V httpResp;
    public T getStatus() {
        return httpCode;
    }

    public V getResp() {
        return httpResp;
    }

    protected void set(T t, V v) {
        this.httpCode = t;
        this.httpResp = v;
    }

}
