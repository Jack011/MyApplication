package com.jackson.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String url = "http://httpbin.org/get?site=code&network=tutsplus";

    JsonObjectRequest jsonRequest= new JsonObjectRequest(Request.Method.POST,url,null,new Response.Listener<JSONObject>(){
        @Override
        public void onResponse(JSONObject jsonObject) {

        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError volleyError) {

        }
    });
}
