// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import java.io.UnsupportedEncodingException;

public abstract class JsonRequest extends Request
{

    private static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", new Object[] {
        "utf-8"
    });
    private final com.android.volley.Response.Listener mListener;
    private final String mRequestBody;

    public JsonRequest(int i, String s, String s1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
    {
        super(i, s, errorlistener);
        mListener = listener;
        mRequestBody = s1;
    }

    public JsonRequest(String s, String s1, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener)
    {
        this(-1, s, s1, listener, errorlistener);
    }

    protected void deliverResponse(Object obj)
    {
        mListener.onResponse(obj);
    }

    public byte[] getBody()
    {
        if (mRequestBody == null)
        {
            return null;
        }
        byte abyte0[];
        try
        {
            abyte0 = mRequestBody.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", new Object[] {
                mRequestBody, "utf-8"
            });
            return null;
        }
        return abyte0;
    }

    public String getBodyContentType()
    {
        return PROTOCOL_CONTENT_TYPE;
    }

    public byte[] getPostBody()
    {
        return getBody();
    }

    public String getPostBodyContentType()
    {
        return getBodyContentType();
    }

    protected abstract Response parseNetworkResponse(NetworkResponse networkresponse);

}
