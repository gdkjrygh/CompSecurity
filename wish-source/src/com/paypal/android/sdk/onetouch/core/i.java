// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class i
{

    private static final String a = com/paypal/android/sdk/onetouch/core/i.getSimpleName();

    public i()
    {
    }

    private static boolean a(PackageManager packagemanager, String s, String s1, String s2, int j)
    {
        int k;
        int l;
        packagemanager = packagemanager.getPackageInfo(s, 64).signatures;
        l = packagemanager.length;
        k = 0;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        s = new ByteArrayInputStream(packagemanager[k].toByteArray());
        String s3;
        String s4;
        int i1;
        s = (X509Certificate)CertificateFactory.getInstance("X509").generateCertificate(s);
        s3 = s.getSubjectX500Principal().getName();
        s4 = s.getIssuerX500Principal().getName();
        i1 = s.getPublicKey().hashCode();
        (new StringBuilder("Certificate subject: ")).append(s3);
        (new StringBuilder("Certificate issuer: ")).append(s4);
        (new StringBuilder("Certificate public key hash code: ")).append(i1);
        boolean flag;
        if (s1.equals(s3) && s2.equals(s4) && j == i1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        Log.e(a, "App cert is NOT valid.");
        return flag;
        s;
        Log.e(a, "exception parsing cert", s);
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

    protected final boolean a(Context context, boolean flag, String s, String s1, String s2, int j)
    {
        boolean flag2;
        flag2 = false;
        context = context.getPackageManager();
        context.getApplicationInfo(s, 4224);
        boolean flag1;
        if (context.checkPermission("android.permission.AUTHENTICATE_ACCOUNTS", s) == 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag1 = flag2;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        flag = a(((PackageManager) (context)), s, s1, s2, 0x2096f5c);
        flag1 = flag2;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        flag1 = true;
_L2:
        (new StringBuilder("returning isValid:")).append(flag1);
        return flag1;
        context;
        Log.e(a, (new StringBuilder()).append(s).append(" not found.").toString());
        flag1 = flag2;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
