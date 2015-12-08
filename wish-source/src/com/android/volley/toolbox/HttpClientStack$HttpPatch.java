// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

// Referenced classes of package com.android.volley.toolbox:
//            HttpClientStack

public static final class setURI extends HttpEntityEnclosingRequestBase
{

    public static final String METHOD_NAME = "PATCH";

    public String getMethod()
    {
        return "PATCH";
    }

    public uestBase()
    {
    }

    public uestBase(String s)
    {
        setURI(URI.create(s));
    }

    public setURI(URI uri)
    {
        setURI(uri);
    }
}
