// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            al

public class ap
{

    private static ap a;
    private final HashMap b = a(al.b());

    private ap()
    {
    }

    public static ap a()
    {
        com/paypal/android/sdk/onetouch/core/ap;
        JVM INSTR monitorenter ;
        ap ap1;
        if (a == null)
        {
            a = new ap();
        }
        ap1 = a;
        com/paypal/android/sdk/onetouch/core/ap;
        JVM INSTR monitorexit ;
        return ap1;
        Exception exception;
        exception;
        throw exception;
    }

    private static HashMap a(KeyStore keystore)
    {
        HashMap hashmap;
        Enumeration enumeration;
        hashmap = new HashMap();
        enumeration = keystore.aliases();
_L1:
        Object obj;
        if (!enumeration.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_88;
        }
        obj = (String)enumeration.nextElement();
        com/paypal/android/sdk/onetouch/core/ap.getSimpleName();
        (new StringBuilder("\t adding cert. alias:")).append(((String) (obj)));
        obj = (X509Certificate)keystore.getCertificate(((String) (obj)));
        if (obj != null)
        {
            try
            {
                hashmap.put(((X509Certificate) (obj)).getSubjectX500Principal(), obj);
            }
            // Misplaced declaration of an exception variable
            catch (KeyStore keystore)
            {
                throw new AssertionError(keystore);
            }
        }
          goto _L1
        return hashmap;
    }

    public final boolean a(X509Certificate x509certificate)
    {
        X509Certificate x509certificate1 = (X509Certificate)b.get(x509certificate.getSubjectX500Principal());
        return x509certificate1 != null && x509certificate1.getPublicKey().equals(x509certificate.getPublicKey());
    }

    public final X509Certificate b(X509Certificate x509certificate)
    {
        X509Certificate x509certificate1 = (X509Certificate)b.get(x509certificate.getIssuerX500Principal());
        if (x509certificate1 == null)
        {
            return null;
        }
        if (x509certificate1.getSubjectX500Principal().equals(x509certificate.getSubjectX500Principal()))
        {
            return null;
        }
        try
        {
            x509certificate.verify(x509certificate1.getPublicKey());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return null;
        }
        return x509certificate1;
    }
}
