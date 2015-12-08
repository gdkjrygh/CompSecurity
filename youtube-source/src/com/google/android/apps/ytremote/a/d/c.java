// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.a.d;

import javax.net.ssl.SSLException;
import org.apache.http.conn.ssl.AbstractVerifier;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

public final class c extends AbstractVerifier
{

    public c()
    {
    }

    public final void verify(String s, String as[], String as1[])
    {
        SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER.verify(s, as, as1);
_L1:
        return;
        as1;
        if (as.length <= 0 || as[0] == null || !as[0].endsWith("google.com") || !s.endsWith("youtube.com"))
        {
            throw as1;
        }
          goto _L1
    }
}
