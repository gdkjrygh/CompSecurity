// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.f;
import com.jiubang.commerce.utils.g;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            m, a, j, AdUrlPreParseLoadingActivity, 
//            c

public class l
{

    public static long a = 10000L;
    private static c b = new m();

    static void a(Context context, String s, boolean flag)
    {
        b(context, s, flag);
    }

    public static boolean a(Context context, com.jiubang.commerce.ad.b.a.l l1, String s, int i, int i1, int j1, String s1, String s2, 
            int k1, boolean flag, boolean flag1)
    {
        return a(context, l1, s, i, i1, j1, s1, s2, k1, flag, true, false, "", flag1);
    }

    public static boolean a(Context context, com.jiubang.commerce.ad.b.a.l l1, String s, int i, int i1, int j1, String s1, String s2, 
            int k1, boolean flag, boolean flag1, String s3, boolean flag2)
    {
        return a(context, l1, s, i, i1, j1, s1, s2, k1, flag, false, flag1, s3, flag2);
    }

    private static boolean a(Context context, com.jiubang.commerce.ad.b.a.l l1, String s, int i, int i1, int j1, String s1, String s2, 
            int k1, boolean flag, boolean flag1, boolean flag2, String s3, boolean flag3)
    {
        if (j.a)
        {
            j.b("Ad_SDK", (new StringBuilder()).append("gotoAppDetails(").append(context).append(", ").append(s1).append(", ").append(s2).append(", ").append(k1).append(", ").append(flag1).append(", ").append(flag2).append(", ").append(s3).append(", ").append(flag3).append(")").toString());
        }
        if (context == null || TextUtils.isEmpty(s1) && TextUtils.isEmpty(s2))
        {
            return false;
        }
        if (com.jiubang.commerce.ad.url.a.a(s1, k1) && k.a(context))
        {
            String s4 = j.a(context).b(s1);
            if (j.a)
            {
                j.a("Ad_SDK", (new StringBuilder()).append("gotoAppDetails(").append(s1).append(", ").append(s2).append(", ").append(s4).append(")").toString());
            }
            if (!TextUtils.isEmpty(s4))
            {
                g.a(context, s4, flag, flag3);
            } else
            {
                if (j.a)
                {
                    j.b("Ad_SDK", (new StringBuilder()).append("gotoAppDetails(302\u8DF3\u8F6C,").append(context).append(", ").append(s1).append(", ").append(s2).append(", ").append(k1).append(", ").append(flag1).append(", ").append(flag2).append(", ").append(s3).append(", ").append(flag3).append(")").toString());
                }
                if (flag1)
                {
                    s3 = new Intent(context, com/jiubang/commerce/ad/url/AdUrlPreParseLoadingActivity);
                    s3.addFlags(0x20000);
                    s3.putExtra("paramsBean", l1);
                    s3.putExtra("pkgName", s);
                    s3.putExtra("moduleId", String.valueOf(i));
                    s3.putExtra("mapId", String.valueOf(i1));
                    s3.putExtra("aId", String.valueOf(j1));
                    s3.putExtra("downloadUrl", s2);
                    s3.putExtra("redirectUrl", s1);
                    s3.putExtra("timeOutDuration", a);
                    s3.putExtra("isShowFloatWindow", flag3);
                    s3.putExtra("isOpenBrowser", flag3);
                    context.startActivity(s3);
                } else
                {
                    com.jiubang.commerce.ad.url.a.a(context, l1, s, String.valueOf(i), String.valueOf(i1), String.valueOf(j1), s1, s2, a, flag3, flag2, s3, b);
                }
            }
        } else
        {
            g.a(context, s2, flag, flag3);
        }
        return true;
    }

    private static void b(Context context, String s, boolean flag)
    {
        if (TextUtils.isEmpty(s))
        {
            Toast.makeText(context, f.a(context).e("desksetting_net_error"), 1).show();
            return;
        } else
        {
            g.a(context, s, true, flag);
            return;
        }
    }

    static 
    {
        if (t.i())
        {
            a = 5000L;
        }
    }
}
