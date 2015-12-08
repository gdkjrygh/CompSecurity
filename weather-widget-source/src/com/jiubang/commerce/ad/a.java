// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.b.a.l;
import com.jiubang.commerce.ad.e.n;
import com.jiubang.commerce.ad.e.p;
import com.jiubang.commerce.ad.e.q;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.h5.H5AdActivity;
import com.jiubang.commerce.ad.url.i;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.database.b.c;
import com.jiubang.commerce.utils.j;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad:
//            e, f, b

public class a
{

    public static void a(Context context, com.jiubang.commerce.ad.a.a a1, String s, String s1)
    {
        if (a1 != null)
        {
            if (j.a)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a1.b()).append("]AdSdkApi::showAdvert(").append("adInfoBean:").append(e.a(a1)).append(", tabCategory:").append(s).append(", remark:").append(s1).append(")").toString());
            }
            b(context, a1, s, s1);
        } else
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("AdSdkApi::showAdvert(error, ").append(a1).append(", ").append(s).append(", ").append(s1).append(")").toString(), new Throwable());
            return;
        }
    }

    public static void a(Context context, com.jiubang.commerce.ad.a.a a1, String s, String s1, boolean flag)
    {
        a(context, a1, s, s1, flag, true);
    }

    public static void a(Context context, com.jiubang.commerce.ad.a.a a1, String s, String s1, boolean flag, boolean flag1)
    {
        if (a1 != null)
        {
            if (j.a)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a1.b()).append("]AdSdkApi::clickAdvertWithToast(").append("adInfoBean:").append(e.a(a1)).append(", tabCategory:").append(s).append(", remark:").append(s1).append(", isShowToast:").append(flag).append(", isShowFloatWindow:").append(flag1).append(")").toString());
            }
            a(context, a1, s, s1, flag, false, flag1, true);
        } else
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("AdSdkApi::clickAdvertWithToast(error, ").append(a1).append(", ").append(s).append(", ").append(s1).append(", ").append(flag).append(")").toString(), new Throwable());
            return;
        }
    }

    private static void a(Context context, com.jiubang.commerce.ad.a.a a1, String s, String s1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        l l1;
        String s7;
        int k;
        int i1;
        int j1;
        int k1;
        int i2;
        if (a1 == null)
        {
            return;
        }
        s2 = s;
        if (TextUtils.isEmpty(s))
        {
            s2 = String.valueOf(a1.b());
        }
        s = a1.f();
        k = a1.c();
        i1 = a1.e();
        j1 = a1.d();
        s3 = a1.k();
        s4 = a1.q();
        k1 = a1.p();
        s5 = a1.n();
        s6 = a1.o();
        l1 = new l();
        l1.a(a1.a());
        s7 = com.jiubang.commerce.b.b.a(a1.t(), a1.d());
        i2 = a1.u();
        q.a(context).c(a1.b());
        if (!flag3) goto _L2; else goto _L1
_L1:
        if (!a1.j()) goto _L4; else goto _L3
_L3:
        H5AdActivity.a(context, s4);
_L2:
        com.jiubang.commerce.b.b.a(context, String.valueOf(i1), String.valueOf(i2), s, s2, String.valueOf(k), s7, String.valueOf(j1), s1, s5, s6);
        return;
_L4:
        if (!flag && !flag1)
        {
            com.jiubang.commerce.ad.url.l.a(context, l1, s, k, i1, j1, s4, s3, k1, true, false, "", flag2);
        } else
        if (flag)
        {
            com.jiubang.commerce.ad.url.l.a(context, l1, s, k, i1, j1, s4, s3, k1, true, true, f.a(context).e("ad_click_tip"), flag2);
        } else
        if (flag1)
        {
            com.jiubang.commerce.ad.url.l.a(context, l1, s, k, i1, j1, s4, s3, k1, true, flag2);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static void a(Context context, f f1, com.jiubang.commerce.ad.i.a.b b1, String s)
    {
        if (f1 == null || b1 == null)
        {
            if (j.a)
            {
                j.a("Ad_SDK", (new StringBuilder()).append("AdSdkApi::sdkAdClickStatistic(baseModuleDataItemBean:").append(f1).append(", adWrapper:").append(b1).append(")").toString(), new Throwable());
            }
            return;
        }
        if (j.a)
        {
            j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(f1.a()).append("]AdSdkApi::sdkAdClickStatistic(").append("baseModuleDataItemBean:").append(e.a(f1)).append(", adWrapper->AppKey:").append(b1.b()).append(")").toString());
        }
        q.a(context).c(f1.a());
        if (TextUtils.isEmpty(s))
        {
            s = String.valueOf(f1.a());
        }
        String s1 = f1.x();
        int k = f1.b();
        int i1 = f1.c();
        String s2 = com.jiubang.commerce.b.b.a(f1.d(), f1.m());
        com.jiubang.commerce.b.b.a(context, b1.b(), String.valueOf(f1.n()), null, s, String.valueOf(k), s2, String.valueOf(i1), s1, null, null);
    }

    public static void a(Context context, String s, p p)
    {
        n.a(context).a(s, p);
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        if (t.j())
        {
            return;
        } else
        {
            t.a(context, s, s1, s2, s3, s4, s5, s6);
            return;
        }
    }

    public static void a(Context context, List list, i k)
    {
        a(context, list, true, k);
    }

    public static void a(Context context, List list, String s, Integer integer)
    {
        if (j.a)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("[vmId:").append(list).append("]AdSdkApi::requestAdData(virtualModuleId:").append(list).append(", buyuserchannel").append(s).append(", cdays:");
            Object obj;
            if (integer != null)
            {
                obj = Integer.valueOf(integer.intValue());
            } else
            {
                obj = "null";
            }
            j.b("Ad_SDK", stringbuilder.append(obj).append(")").toString());
        }
        if (t.j())
        {
            return;
        } else
        {
            t.a().a(context, list, s, integer);
            return;
        }
    }

    public static void a(Context context, List list, boolean flag, i k)
    {
        if (list == null || list.isEmpty())
        {
            if (k != null)
            {
                k.a(context);
            }
            return;
        }
        int i1;
        if (list.get(0) != null)
        {
            i1 = ((com.jiubang.commerce.ad.a.a)list.get(0)).c();
        } else
        {
            i1 = -1;
        }
        t.a(context, i1, list, flag, k);
    }

    public static void a(com.jiubang.commerce.ad.h.a a1)
    {
        if (j.a)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("[vmId:").append(a1.b).append("]AdSdkApi::loadAdBean(virtualModuleId:").append(a1.b).append(", returnAdCount:").append(a1.c).append(", isNeedDownloadIcon:").append(a1.d).append(", isNeedDownloadBanner:").append(a1.e).append(", isNeedPreResolve:").append(a1.f).append(", isRequestData:").append(a1.h).append(", isPreResolveBeforeShow:").append(a1.g).append(", buyuserchannel:").append(a1.l).append(", cdays:");
            Object obj;
            if (a1.m != null)
            {
                obj = Integer.valueOf(a1.m.intValue());
            } else
            {
                obj = "null";
            }
            j.b("Ad_SDK", stringbuilder.append(obj).append(")").toString());
        }
        if (t.j())
        {
            return;
        } else
        {
            com.jiubang.commerce.b.b.c(a1.a, a1.n, String.valueOf(a1.b));
            t.a().a(a1);
            return;
        }
    }

    public static void a(boolean flag)
    {
        j.a(flag);
    }

    public static boolean a(Context context, int k)
    {
        return t.a().a(context, k);
    }

    private static void b(Context context, com.jiubang.commerce.ad.a.a a1, String s, String s1)
    {
        if (a1 == null)
        {
            return;
        } else
        {
            q.a(context).b(a1.b());
            (new Thread(new com.jiubang.commerce.ad.b(s, a1, context, s1, c.a(context)))).start();
            return;
        }
    }

    public static void b(Context context, f f1, com.jiubang.commerce.ad.i.a.b b1, String s)
    {
        if (f1 == null || b1 == null)
        {
            if (j.a)
            {
                j.a("Ad_SDK", (new StringBuilder()).append("AdSdkApi::sdkAdShowStatistic(baseModuleDataItemBean:").append(f1).append(", adWrapper:").append(b1).append(")").toString(), new Throwable());
            }
            return;
        }
        if (j.a)
        {
            j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(f1.a()).append("]AdSdkApi::sdkAdShowStatistic(").append("baseModuleDataItemBean:").append(e.a(f1)).append(", adWrapper->AppKey:").append(b1.b()).append(")").toString());
        }
        q.a(context).b(f1.a());
        if (TextUtils.isEmpty(s))
        {
            s = String.valueOf(f1.a());
        }
        String s1 = f1.x();
        int k = f1.b();
        int i1 = f1.c();
        String s2 = com.jiubang.commerce.b.b.a(f1.d(), f1.m());
        com.jiubang.commerce.b.b.a(context, b1.b(), String.valueOf(f1.n()), s, String.valueOf(k), s2, String.valueOf(i1), s1, null);
    }
}
