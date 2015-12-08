// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            dg

public final class dd
{

    private static final SecureRandom a = new SecureRandom();

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        StringBuffer stringbuffer = new StringBuffer();
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            int k = abyte0[i] & 0xff;
            if (k < 16)
            {
                stringbuffer.append("0");
            }
            stringbuffer.append(Integer.toHexString(k));
        }

        return stringbuffer.toString().toUpperCase();
    }

    public static X509Certificate a(String s)
    {
        s = Base64.decode(s, 0);
        return (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(s));
    }

    static boolean a(byte abyte0[], byte abyte1[])
    {
        if (abyte0.length == 32)
        {
            int i = 0;
            int j = 0;
            for (; i < abyte0.length; i++)
            {
                j |= abyte0[i] ^ abyte1[i];
            }

            if (j == 0)
            {
                return true;
            }
        }
        return false;
    }

    public static byte[] a(int i)
    {
        byte abyte0[] = new byte[32];
        a.nextBytes(abyte0);
        return abyte0;
    }

    public static byte[] b(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    static 
    {
        dg.a();
    }
}
