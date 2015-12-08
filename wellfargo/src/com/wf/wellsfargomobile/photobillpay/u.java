// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import android.content.Context;
import android.content.SharedPreferences;
import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.wf.wellsfargomobile.WFApp;

public class u
{

    static Image a = null;
    private static Image b = null;

    public static void a()
    {
        android.content.SharedPreferences.Editor editor = WFApp.g.getSharedPreferences("photo_bill_pay_prefs", 0).edit();
        editor.putBoolean("photo_bill_pay_enable", true);
        editor.apply();
    }

    public static void a(Image image)
    {
        if (image != null)
        {
            image.imageClearBitmap();
            try
            {
                image.imageClearFileBuffer();
            }
            // Misplaced declaration of an exception variable
            catch (Image image) { }
        }
        System.gc();
    }

    public static void b(Image image)
    {
        a = image;
    }

    public static boolean b()
    {
        return WFApp.g.getSharedPreferences("photo_bill_pay_prefs", 0).getBoolean("photo_bill_pay_enable", false);
    }

    public static Image c()
    {
        return a;
    }

}
