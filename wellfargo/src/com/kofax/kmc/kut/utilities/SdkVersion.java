// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.version.KutVersion;

// Referenced classes of package com.kofax.kmc.kut.utilities:
//            ClassifierLibUtil, IpLibUtil

public class SdkVersion
{

    private static String a = "2.3.1.1.0.2388";
    private static ClassifierLibUtil b = new ClassifierLibUtil();

    public SdkVersion()
    {
    }

    public static String getClassifierVersion()
    {
        return b.getClassifierVersion();
    }

    public static String getIpVersion()
    {
        return IpLibUtil.getKippVersion();
    }

    public static String getPackageVersion()
    {
        return KutVersion.getPackageVersion();
    }

    public static String getSdkVersion()
    {
        return a;
    }

    public static Boolean versionCompatible(String s, String s1)
    {
        boolean flag = true;
        s = s.split("\\.");
        s = (new StringBuilder()).append(s[0]).append(s[1]).append(s[2]).append(".").append(s[3]).toString();
        s1 = s1.split("\\.");
        s1 = (new StringBuilder()).append(s1[0]).append(s1[1]).append(s1[2]).append(".").append(s1[3]).toString();
        if (Double.parseDouble(s) < Double.parseDouble(s1))
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

}
