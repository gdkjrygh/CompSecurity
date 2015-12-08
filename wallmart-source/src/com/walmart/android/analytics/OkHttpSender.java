// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.analytics;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.walmartlabs.anivia.HttpSender;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.io.IOException;

class OkHttpSender
    implements HttpSender
{

    private final OkHttpClient mOkHttpClient = SharedHttpClient.get();

    OkHttpSender()
    {
    }

    public com.walmartlabs.anivia.HttpSender.Response post(String s, String s1, String s2)
    {
        s = (new com.squareup.okhttp.Request.Builder()).url(s).post(RequestBody.create(MediaType.parse(s1), s2)).build();
        try
        {
            s = mOkHttpClient.newCall(s).execute();
            s = new com.walmartlabs.anivia.HttpSender.Response(s.code(), s.body().string());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }
}
