// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

// Referenced classes of package com.kofax.kmc.kut.utilities:
//            IpLibUtil

public class Licensing
{

    private static int a = 0;

    public Licensing()
    {
    }

    public static int getDaysRemaining()
    {
        return a;
    }

    public static ErrorInfo setMobileSDKLicense(String s)
    {
        ErrorInfo errorinfo = ErrorInfo.KMC_SUCCESS;
        if (IpLibUtil.isIpLicensed())
        {
            return ErrorInfo.KMC_EV_LICENSE_ALREADY_SET;
        }
        if (s == null)
        {
            throw new NullPointerException("'licenseStr' parameter is null");
        }
        int i = IpLibUtil.a(s);
        if (i < 0)
        {
            return (ErrorInfo)IpLibUtil.ipErrHashMap.get(Integer.valueOf(i));
        }
        if (i == 0)
        {
            return ErrorInfo.KMC_EV_LICENSE_EXPIRED;
        } else
        {
            a = i;
            return errorinfo;
        }
    }

}
