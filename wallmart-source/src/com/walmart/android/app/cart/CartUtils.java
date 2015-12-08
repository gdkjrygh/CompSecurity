// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.cart;

import java.util.Locale;

public class CartUtils
{

    public CartUtils()
    {
    }

    public static String formatPrice(int i, int j)
    {
        return String.format(Locale.US, "$%,d.%02d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
    }

    public static String formatPriceForAnalytics(String s)
    {
        return s.replaceAll("\\$", "").replaceAll(",", "");
    }
}
