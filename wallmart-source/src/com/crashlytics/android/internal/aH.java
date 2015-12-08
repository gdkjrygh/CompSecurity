// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.security.KeyStoreException;
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
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

// Referenced classes of package com.crashlytics.android.internal:
//            aG, aI, v, q, 
//            av

final class aH
    implements X509TrustManager
{

    private final TrustManager a[];
    private final aI b;
    private final long c = -1L;
    private final List d = new LinkedList();
    private final Set e = Collections.synchronizedSet(new HashSet());

    public aH(aI ai, aG ag)
    {
        a = a(ai);
        b = ai;
        ai = ag.c();
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            ag = ai[i];
            d.add(a(ag));
        }

    }

    private boolean a(X509Certificate x509certificate)
        throws CertificateException
    {
        Iterator iterator;
        x509certificate = MessageDigest.getInstance("SHA1").digest(x509certificate.getPublicKey().getEncoded());
        iterator = d.iterator();
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

    private static TrustManager[] a(aI ai)
    {
        try
        {
            TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance("X509");
            trustmanagerfactory.init(ai.a);
            ai = trustmanagerfactory.getTrustManagers();
        }
        // Misplaced declaration of an exception variable
        catch (aI ai)
        {
            throw new AssertionError(ai);
        }
        // Misplaced declaration of an exception variable
        catch (aI ai)
        {
            throw new AssertionError(ai);
        }
        return ai;
    }

    public final void checkClientTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate ax509certificate[], String s)
        throws CertificateException
    {
        if (e.contains(ax509certificate[0]))
        {
            return;
        }
        TrustManager atrustmanager[] = a;
        int k = atrustmanager.length;
        for (int i = 0; i < k; i++)
        {
            ((X509TrustManager)atrustmanager[i]).checkServerTrusted(ax509certificate, s);
        }

        if (c == -1L || System.currentTimeMillis() - c <= 0x39ef8b000L) goto _L2; else goto _L1
_L1:
        v.a().b().c("Crashlytics", (new StringBuilder("Certificate pins are stale, (")).append(System.currentTimeMillis() - c).append(" millis vs 15552000000").append(" millis) falling back to system trust.").toString());
_L4:
        e.add(ax509certificate[0]);
        return;
_L2:
        s = av.a(ax509certificate, b);
        int l = s.length;
        int j = 0;
label0:
        do
        {
label1:
            {
                if (j >= l)
                {
                    break label1;
                }
                if (a(s[j]))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        throw new CertificateException("No valid pins found in chain!");
    }

    public final X509Certificate[] getAcceptedIssuers()
    {
        return null;
    }
}
