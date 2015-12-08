// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import java.util.Arrays;
import java.util.List;

public class Global
{

    protected static final List CURRENCYLIST = Arrays.asList(new String[] {
        "USD", "AUD", "CAD", "CHF", "CNY", "DKK", "EUR", "GBP", "MXP", "NOK", 
        "NZD", "RUB", "SEK", "YEN", "TRY", "INR", "IDR", "ILS", "SAR", "ZAR", 
        "AED"
    });
    public static boolean DEBUG = false;
    public static boolean DEBUGERROR = false;
    protected static final String SDK_PROTOCOL = "3";
    public static final String SDK_VERSION = "Android20150511";

    public Global()
    {
    }

    static 
    {
        DEBUG = false;
        DEBUGERROR = false;
    }
}
