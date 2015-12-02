// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            g_, fi, co

class gs
{

    static final int a[];
    static final int b[];
    static final int c[];

    static 
    {
        a = new int[g_.values().length];
        try
        {
            a[g_.PREMIUM_RATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            a[g_.TOLL_FREE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            a[g_.MOBILE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            a[g_.FIXED_LINE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            a[g_.FIXED_LINE_OR_MOBILE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            a[g_.SHARED_COST.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            a[g_.VOIP.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            a[g_.PERSONAL_NUMBER.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            a[g_.PAGER.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            a[g_.UAN.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            a[g_.VOICEMAIL.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        c = new int[fi.values().length];
        try
        {
            c[fi.E164.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            c[fi.INTERNATIONAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            c[fi.RFC3966.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            c[fi.NATIONAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        b = new int[co.values().length];
        try
        {
            b[co.FROM_NUMBER_WITH_PLUS_SIGN.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            b[co.FROM_NUMBER_WITH_IDD.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            b[co.FROM_NUMBER_WITHOUT_PLUS_SIGN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            b[co.FROM_DEFAULT_COUNTRY.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
