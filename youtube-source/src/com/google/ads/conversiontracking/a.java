// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.conversiontracking;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.ads.conversiontracking:
//            b, g

final class a
    implements Runnable
{

    final String a;
    final boolean b;
    final g c;
    final Context d;

    a(String s, boolean flag, g g, Context context)
    {
        a = s;
        b = flag;
        c = g;
        d = context;
        super();
    }

    public final void run()
    {
        HttpURLConnection httpurlconnection;
        Log.i("GoogleConversionPing", (new StringBuilder("Pinging: ")).append(a).toString());
        httpurlconnection = (HttpURLConnection)(new URL(a)).openConnection();
        int i;
        i = httpurlconnection.getResponseCode();
        Log.i("GoogleConversionPing", (new StringBuilder("Ping responded with response code ")).append(i).toString());
        if (b || c == null || i != 200)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        com.google.ads.conversiontracking.b.a(d, c);
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IOException ioexception)
        {
            Log.e("GoogleConversionPing", "Error sending ping", ioexception);
        }
        break MISSING_BLOCK_LABEL_124;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
