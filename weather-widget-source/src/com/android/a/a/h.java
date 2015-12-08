// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a.a;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class h extends HttpEntityEnclosingRequestBase
{

    public h()
    {
    }

    public h(String s)
    {
        setURI(URI.create(s));
    }

    public String getMethod()
    {
        return "PATCH";
    }
}
