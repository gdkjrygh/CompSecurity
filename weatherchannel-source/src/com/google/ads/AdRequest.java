// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


public final class AdRequest
{

    public static final String LOGTAG = "Ads";
    public static final String TEST_EMULATOR;
    public static final String VERSION = "0.0.0";

    private AdRequest()
    {
    }

    static 
    {
        TEST_EMULATOR = com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR;
    }

    // Unreferenced inner class com/google/ads/AdRequest$ErrorCode
    /* block-local class not found */
    class ErrorCode {}


    // Unreferenced inner class com/google/ads/AdRequest$Gender
    /* block-local class not found */
    class Gender {}

}
