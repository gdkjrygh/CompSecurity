// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.service;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public class HttpDeleteWithEntity extends HttpEntityEnclosingRequestBase
{

    private static final String METHOD_NAME = "DELETE";

    public HttpDeleteWithEntity()
    {
    }

    public HttpDeleteWithEntity(String s)
    {
        setURI(URI.create(s));
    }

    public HttpDeleteWithEntity(URI uri)
    {
        setURI(uri);
    }

    public String getMethod()
    {
        return "DELETE";
    }
}
