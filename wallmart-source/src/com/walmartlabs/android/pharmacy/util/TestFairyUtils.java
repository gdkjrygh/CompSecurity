// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.util;

import android.util.Log;

public class TestFairyUtils
{

    private static String SECURE_VIEW_TAG = "testfairy-secure-viewid";

    public TestFairyUtils()
    {
    }

    public static void hideView(int i)
    {
        Log.v(SECURE_VIEW_TAG, String.valueOf(i));
    }

}
