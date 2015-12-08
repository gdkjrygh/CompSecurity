// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class ax extends HttpEntityEnclosingRequestBase
{

    public ax(String s)
    {
        setURI(URI.create(s));
    }

    public final String getMethod()
    {
        return "PATCH";
    }
}
