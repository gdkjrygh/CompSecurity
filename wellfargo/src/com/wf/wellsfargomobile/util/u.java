// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.d;

public class u
{

    public static boolean a()
    {
        return Build.MODEL.contains("Nexus 4");
    }

    public static boolean a(Context context)
    {
        return com.google.android.gms.common.d.a(context) == 0;
    }

    public static boolean b()
    {
        return Build.MODEL.contains("Nexus 7");
    }

    public static String c()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static boolean d()
    {
        return Build.MANUFACTURER.contains("Amazon") && (Build.MODEL.contains("KFSAWA") || Build.MODEL.contains("KFSAWI") || Build.MODEL.contains("KFASWI") || Build.MODEL.contains("KFARWI") || Build.MODEL.contains("KFTHWA") || Build.MODEL.contains("KFTHWI") || Build.MODEL.contains("KFAPWI") || Build.MODEL.contains("KFAPWI") || Build.MODEL.contains("KFSOWI") || Build.MODEL.contains("KFJWA") || Build.MODEL.contains("KFJWI") || Build.MODEL.contains("KFTT") || Build.MODEL.contains("KFOT") || Build.MODEL.contains("Kindle Fire"));
    }

    public static boolean e()
    {
        return Build.MODEL.contains("SGH-I527");
    }

    public static boolean f()
    {
        return Build.MODEL.contains("SCH-I535") || Build.MODEL.contains("SGH-T999");
    }

    public static boolean g()
    {
        return Build.MODEL.contains("SGH-M919") || Build.MODEL.contains("SCH-I545") || Build.MODEL.contains("SGH-I337");
    }

    public static boolean h()
    {
        return Build.MODEL.contains("XT1032");
    }
}
