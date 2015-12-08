// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.mapbar.android.location:
//            b

public class b
{

    public int a;
    public long b;

    public static String a(PackageManager packagemanager, String s)
    {
        int i = 0;
        ApplicationInfo applicationinfo = packagemanager.getApplicationInfo(s, 0);
        if (applicationinfo == null)
        {
            return null;
        }
        if ((applicationinfo.flags & 1) != 0)
        {
            return "SYSTEM";
        }
        packagemanager = packagemanager.getPackageInfo(s, 64);
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        if (((PackageInfo) (packagemanager)).signatures == null || ((PackageInfo) (packagemanager)).signatures.length == 0 || ((PackageInfo) (packagemanager)).signatures[0] == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        packagemanager = ((PackageInfo) (packagemanager)).signatures[0].toByteArray();
        s = MessageDigest.getInstance("MD5");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        packagemanager = s.digest(packagemanager);
        if (packagemanager == null)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        int j;
        s = new StringBuffer(packagemanager.length << 1);
        j = packagemanager.length;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s.append(String.format("%02x", new Object[] {
            Byte.valueOf(packagemanager[i])
        }));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        packagemanager = s.toString();
        return packagemanager;
        packagemanager;
        return null;
        packagemanager;
        return null;
    }

    public eption()
    {
    }

    eption(b b1)
    {
        a = 0;
        b = 0L;
    }
}
