// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.b;

import android.content.Context;

// Referenced classes of package com.jiubang.commerce.b:
//            d, f

public class c extends d
{

    private static int a(String s)
    {
        return 400;
    }

    public static void a(Context context, String s, int i)
    {
        String s1 = (new StringBuilder()).append("").append(f.c).toString();
        a(context, a("abtest"), s, "abtest", i, s1, null, null, null, null);
    }

    public static void a(Context context, String s, int i, String s1, String s2, String s3, String s4, String s5)
    {
        s1 = (new StringBuilder()).append("").append(f.c).toString();
        a(context, a("adv_status"), s, "adv_status", i, s1, s2, s3, s4, s5);
    }

    public static void a(Context context, String s, String s1, String s2)
    {
        String s3 = (new StringBuilder()).append("").append(f.c).toString();
        a(context, a("open_gp"), s, "open_gp", 0, s3, null, s1, null, s2);
    }

    public static void a(Context context, String s, String s1, String s2, String s3)
    {
        s = (new StringBuilder()).append("").append(f.c).toString();
        a(context, a("ad_requst"), null, "ad_requst", 0, s, s1, s2, null, s3);
    }

    public static void b(Context context, String s, String s1, String s2)
    {
        String s3 = (new StringBuilder()).append("").append(f.c).toString();
        a(context, a("ad_requst_result"), null, "ad_requst_result", 0, s3, s, s1, null, s2);
    }

    public static void c(Context context, String s, String s1)
    {
        String s2 = (new StringBuilder()).append("").append(f.c).toString();
        a(context, a("gp_on"), null, "gp_on", 0, s2, null, s, null, s1);
    }
}
