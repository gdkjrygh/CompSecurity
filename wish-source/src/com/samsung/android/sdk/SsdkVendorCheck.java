// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk;

import android.os.Build;

public class SsdkVendorCheck
{

    private static String strBrand;
    private static String strManufacturer;

    private SsdkVendorCheck()
    {
    }

    public static boolean isSamsungDevice()
    {
        while (strBrand == null || strManufacturer == null || strBrand.compareToIgnoreCase("Samsung") != 0 && strManufacturer.compareToIgnoreCase("Samsung") != 0) 
        {
            return false;
        }
        return true;
    }

    static 
    {
        strBrand = Build.BRAND;
        strManufacturer = Build.MANUFACTURER;
    }
}
