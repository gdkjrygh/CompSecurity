// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;


public class ResultCallBack
{

    private String action;
    private Object data;
    private String nonce;
    private ResultCallBack resultCallback;

    public String getAction()
    {
        return action;
    }

    public Object getData()
    {
        return data;
    }

    public String getNonce()
    {
        return nonce;
    }

    public ResultCallBack getResultCallback()
    {
        return resultCallback;
    }

    public void setAction(String s)
    {
        action = s;
    }

    public void setData(String s)
    {
        data = s;
    }

    public void setNonce(String s)
    {
        nonce = s;
    }

    public void setResultCallback(ResultCallBack resultcallback)
    {
        resultCallback = resultcallback;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Payload{nonce='").append(nonce).append('\'').append(", action='").append(action).append('\'').append(", resultCallback='").append(resultCallback).append('\'').append(", data='").append(data).append('\'').append('}').toString();
    }

    public ResultCallBack()
    {
    }
}
