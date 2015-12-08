// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            am, al, ap

public final class ao
    implements X509TrustManager
{

    private final ap a;
    private final List b = new LinkedList();
    private final Set c = Collections.synchronizedSet(new HashSet());

    public ao(ap ap)
    {
        a = ap;
        ap = am.a;
        for (int i = 0; i < 2; i++)
        {
            String s = ap[i];
            b.add(a(s));
        }

    }

    private boolean a(X509Certificate x509certificate)
    {
        Iterator iterator;
        x509certificate = MessageDigest.getInstance("SHA1").digest(x509certificate.getPublicKey().getEncoded());
        iterator = b.iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        flag = Arrays.equals((byte[])iterator.next(), x509certificate);
        if (flag)
        {
            return true;
        }
          goto _L1
        return false;
        x509certificate;
        throw new CertificateException(x509certificate);
    }

    private static byte[] a(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
    {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
    {
        if (c.contains(ax509certificate[0]))
        {
            return;
        }
        s = (new al(ax509certificate, a)).a();
        int j = s.length;
        for (int i = 0; i < j;)
        {
            if (!a(s[i]))
            {
                i++;
            } else
            {
                c.add(ax509certificate[0]);
                return;
            }
        }

        throw new CertificateException("No valid pins found in chain!");
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }
}
