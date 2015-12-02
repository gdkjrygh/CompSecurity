// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class fdp
{

    public static String a(Context context)
    {
        return c(context).getString("promo_code", "");
    }

    public static void a(Context context, String s)
    {
        c(context).edit().putString("promo_code", s).apply();
    }

    public static void b(Context context)
    {
        c(context).edit().remove("promo_code").apply();
    }

    private static SharedPreferences c(Context context)
    {
        return context.getSharedPreferences("data_received_from_install", 0);
    }
}
