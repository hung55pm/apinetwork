package com.ngochung.apinetwork;

import com.android.volley.VolleyError;


public interface StringRequestListener {
    public void onSuccess(String response);

    public void onError(VolleyError error);
}
