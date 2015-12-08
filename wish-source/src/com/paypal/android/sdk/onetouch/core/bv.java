// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import javax.security.auth.x500.X500Principal;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            bw, bz

class bv
{

    private X509Certificate a[];
    private bz b;

    bv(X509Certificate ax509certificate[], bz bz1)
    {
        a = ax509certificate;
        b = bz1;
    }

    private static boolean a(X509Certificate x509certificate, X509Certificate x509certificate1)
    {
        if (!x509certificate.getSubjectX500Principal().equals(x509certificate1.getIssuerX500Principal()))
        {
            return false;
        }
        try
        {
            x509certificate1.verify(x509certificate.getPublicKey());
        }
        // Misplaced declaration of an exception variable
        catch (X509Certificate x509certificate)
        {
            return false;
        }
        return true;
    }

    static KeyStore b()
    {
        Object obj;
        Object obj2;
        obj = KeyStore.getInstance("BKS");
        obj2 = Base64.decode(bw.b, 0);
_L1:
        try
        {
            obj2 = new ByteArrayInputStream(((byte []) (obj2)));
        }
        catch (KeyStoreException keystoreexception)
        {
            throw new AssertionError(keystoreexception);
        }
        ((KeyStore) (obj)).load(((InputStream) (obj2)), "hunkyhunkyburninglove".toCharArray());
        ((InputStream) (obj2)).close();
        return ((KeyStore) (obj));
        obj;
        obj = KeyStore.getInstance("JKS");
        obj2 = Base64.decode(bw.c, 0);
          goto _L1
        obj2;
        Log.w("SystemKeyStore", ((Throwable) (obj2)));
        return ((KeyStore) (obj));
        Object obj1;
        obj1;
        ((InputStream) (obj2)).close();
_L2:
        IOException ioexception1;
        try
        {
            throw obj1;
        }
        catch (IOException ioexception)
        {
            throw new AssertionError(ioexception);
        }
        obj1;
        throw new AssertionError(obj1);
        ioexception1;
        Log.w("SystemKeyStore", ioexception1);
          goto _L2
        obj1;
        throw new AssertionError(obj1);
        obj1;
        throw new AssertionError(obj1);
    }

    public final X509Certificate[] a()
    {
        boolean flag2 = true;
        LinkedList linkedlist = new LinkedList();
        X509Certificate x509certificate;
        boolean flag;
        boolean flag1;
        int i;
        if (b.a(a[0]))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        linkedlist.add(a[0]);
        i = 1;
        do
        {
            flag1 = flag;
            if (i >= a.length)
            {
                break;
            }
            if (b.a(a[i]))
            {
                flag = true;
            }
            flag1 = flag;
            if (!a(a[i], a[i - 1]))
            {
                break;
            }
            linkedlist.add(a[i]);
            i++;
        } while (true);
        x509certificate = b.b(a[i - 1]);
        if (x509certificate != null)
        {
            linkedlist.add(x509certificate);
            flag = flag2;
        } else
        {
            flag = flag1;
        }
        if (flag)
        {
            return (X509Certificate[])linkedlist.toArray(new X509Certificate[linkedlist.size()]);
        } else
        {
            throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
        }
    }
}
