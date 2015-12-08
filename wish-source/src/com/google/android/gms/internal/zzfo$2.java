// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzfo

class zzCC
    implements Callable
{

    final a zzCC;
    final zzfo zzCD;
    final String zztT;

    public Object call()
    {
        Object obj;
        HttpURLConnection httpurlconnection;
        Object obj2;
        obj2 = null;
        obj = null;
        httpurlconnection = null;
        HttpURLConnection httpurlconnection1 = zzCD.zzah(zztT);
        httpurlconnection = httpurlconnection1;
        obj2 = httpurlconnection1;
        obj = httpurlconnection1;
        httpurlconnection1.connect();
        httpurlconnection = httpurlconnection1;
        obj2 = httpurlconnection1;
        obj = httpurlconnection1;
        int i = httpurlconnection1.getResponseCode();
        if (i < 200 || i > 299)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        httpurlconnection = httpurlconnection1;
        obj2 = httpurlconnection1;
        obj = httpurlconnection1;
        Object obj3 = zzCC.zzb(httpurlconnection1.getInputStream());
        if (httpurlconnection1 != null)
        {
            httpurlconnection1.disconnect();
        }
        return obj3;
        if (httpurlconnection1 != null)
        {
            httpurlconnection1.disconnect();
        }
_L2:
        return zzCC.zzem();
        obj2;
        obj = httpurlconnection;
        zzb.zzd("Error making HTTP request.", ((Throwable) (obj2)));
        if (httpurlconnection != null)
        {
            httpurlconnection.disconnect();
        }
        continue; /* Loop/switch isn't completed */
        Object obj1;
        obj1;
        obj = obj2;
        zzb.zzd("Error making HTTP request.", ((Throwable) (obj1)));
        if (obj2 != null)
        {
            ((HttpURLConnection) (obj2)).disconnect();
        }
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (obj != null)
        {
            ((HttpURLConnection) (obj)).disconnect();
        }
        throw obj1;
    }

    a(zzfo zzfo1, String s, a a)
    {
        zzCD = zzfo1;
        zztT = s;
        zzCC = a;
        super();
    }
}
