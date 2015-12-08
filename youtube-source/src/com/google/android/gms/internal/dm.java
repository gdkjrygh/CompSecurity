// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.android.gms.internal:
//            de, do, dj

public final class dm extends de
{

    private final String a;
    private final Context b;
    private final String c;

    public dm(Context context, String s, String s1)
    {
        b = context;
        a = s;
        c = s1;
    }

    public final void a()
    {
        HttpURLConnection httpurlconnection;
        com.google.android.gms.internal.do.c((new StringBuilder("Pinging URL: ")).append(c).toString());
        httpurlconnection = (HttpURLConnection)(new URL(c)).openConnection();
        int i;
        dj.a(b, a, true, httpurlconnection);
        i = httpurlconnection.getResponseCode();
        if (i >= 200 && i < 300)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        com.google.android.gms.internal.do.d((new StringBuilder("Received non-success response code ")).append(i).append(" from pinging URL: ").append(c).toString());
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IOException ioexception)
        {
            com.google.android.gms.internal.do.d((new StringBuilder("Error while pinging URL: ")).append(c).append(". ").append(ioexception.getMessage()).toString());
        }
        break MISSING_BLOCK_LABEL_150;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }

    public final void v_()
    {
    }
}
