// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.a.d;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.b.a.i;
import com.jiubang.commerce.ad.i.c;
import com.jiubang.commerce.utils.e;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            af, d, e, f, 
//            g, i, b, j, 
//            c, h, k, l

public class a
{

    private static a b;
    private Context a;

    private a(Context context)
    {
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        a = context;
    }

    public static a a(Context context)
    {
        if (b == null)
        {
            b = new a(context);
        }
        return b;
    }

    static void a(a a1, com.jiubang.commerce.ad.h.a a2, List list, int k, int l, boolean flag, b b1, af af1)
    {
        a1.a(a2, list, k, l, flag, b1, af1);
    }

    private void a(com.jiubang.commerce.ad.h.a a1, List list, int k, int l, boolean flag, b b1, af af1)
    {
        Context context;
        int ai[];
        List list1;
        int i1;
        int k1;
        boolean flag1;
        boolean flag2;
        context = a1.a;
        i1 = a1.b;
        k1 = a1.c;
        flag1 = a1.h;
        flag2 = a1.i;
        ai = a1.j;
        list1 = p.a(a1.k);
        Object obj = a1.l;
        obj = a1.m;
        flag2 = a1.o;
        if (af1 != null) goto _L2; else goto _L1
_L1:
        j.d("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadSingleAdSourceInfo(failure, virtualModuleId:").append(i1).append(", adSourceIndex:").append(k).append(", adCount:").append(k1).append(", loadAdvertDataListener:").append(af1).append(")").toString());
_L9:
        return;
_L2:
        if (b1 == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        byte byte0;
        if (k >= 0 && list != null && list.size() > k)
        {
            obj1 = (f)list.get(k);
        } else
        {
            obj1 = null;
        }
        if (obj1 == null || !((f) (obj1)).t()) goto _L6; else goto _L5
_L5:
        Object obj2 = b1.d();
        if (obj2 != null)
        {
            obj2 = ((com.jiubang.commerce.ad.i.a.a) (obj2)).a();
        } else
        {
            obj2 = null;
        }
        if (!com.jiubang.commerce.ad.a.b.d(((f) (obj1))) && (obj2 == null || ((List) (obj2)).isEmpty())) goto _L6; else goto _L7
_L7:
        byte0 = 1;
_L40:
        if (byte0 == 0 && (b1.c() == null || b1.c().isEmpty())) goto _L4; else goto _L8
_L8:
        af1.a(false, b1);
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadSingleAdSourceInfo(success, virtualModuleId:").append(i1).append(", adSourceIndex:").append(k).append(", adCount:").append(k1).append(")").toString());
            return;
        }
          goto _L9
_L4:
        int j1;
        j1 = k + 1;
        if (list != null && list.size() > j1)
        {
            break MISSING_BLOCK_LABEL_680;
        }
        if (list == null) goto _L11; else goto _L10
_L10:
        if (list.size() != 1) goto _L11; else goto _L12
_L12:
        b1 = (f)list.get(0);
        if (b1 == null) goto _L14; else goto _L13
_L13:
        a1 = b1.v();
_L19:
        if (a1 == null) goto _L11; else goto _L15
_L15:
        if (a1.size() <= 0) goto _L11; else goto _L16
_L16:
        a1 = e.a(f.b(i1), true);
        if (TextUtils.isEmpty(a1)) goto _L11; else goto _L17
_L17:
        af1.a(true, f.a(context, i1, k1, flag2, b1, new JSONObject(a1)));
        if (!j.a) goto _L9; else goto _L18
_L18:
        b1 = (new StringBuilder()).append("[vmId:").append(i1).append("]loadSingleAdSourceInfo(success---AlternateData, virtualModuleId:").append(i1).append(", adSourceIndex:").append(j1).append(", adCount:").append(k1).append(", moduleDataItemList.size:");
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        a1 = Integer.valueOf(list.size());
_L20:
        j.b("Ad_SDK", b1.append(a1).append(")").toString());
        return;
        a1;
        a1.printStackTrace();
_L11:
        af1.a(21);
        if (j.a)
        {
            b1 = (new StringBuilder()).append("[vmId:").append(i1).append("]loadSingleAdSourceInfo(failure, virtualModuleId:").append(i1).append(", adSourceIndex:").append(j1).append(", adCount:").append(k1).append(", moduleDataItemList.size:");
            if (list != null)
            {
                a1 = Integer.valueOf(list.size());
            } else
            {
                a1 = "null";
            }
            j.b("Ad_SDK", b1.append(a1).append(")").toString());
            return;
        }
          goto _L9
_L14:
        a1 = null;
          goto _L19
        a1 = "null";
          goto _L20
        Object obj3;
        obj3 = (f)list.get(j1);
        if (obj3 == null)
        {
            a(a1, list, j1, l, flag, ((b) (null)), af1);
            return;
        }
        if (((f) (obj3)).u()) goto _L22; else goto _L21
_L21:
        if (!((f) (obj3)).t()) goto _L24; else goto _L23
_L23:
        if (flag) goto _L26; else goto _L25
_L25:
        try
        {
            af1.a(false, b1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            b1.printStackTrace();
        }
        j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(i1).append("]loadSingleAdSourceInfo(error, ").append(b1.getMessage()).append(")").toString(), b1);
_L28:
        a(a1, list, j1, l, flag, ((b) (null)), af1);
        return;
_L26:
        if (!com.jiubang.commerce.ad.a.b.b(((f) (obj3))))
        {
            break MISSING_BLOCK_LABEL_882;
        }
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_835;
        }
        if (com.jiubang.commerce.ad.a.b.a(list1))
        {
            break MISSING_BLOCK_LABEL_882;
        }
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_850;
        }
        if (!com.jiubang.commerce.ad.a.b.a(((f) (obj3)), ai))
        {
            break MISSING_BLOCK_LABEL_882;
        }
        c.a().a(a1, ((f) (obj3)), new com.jiubang.commerce.ad.e.d(this, i1, ((f) (obj3)), a1, list, j1, l, flag, af1));
        return;
        if (!com.jiubang.commerce.ad.a.b.c(((f) (obj3))))
        {
            break MISSING_BLOCK_LABEL_948;
        }
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_903;
        }
        if (com.jiubang.commerce.ad.a.b.b(list1))
        {
            break MISSING_BLOCK_LABEL_948;
        }
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_918;
        }
        if (!com.jiubang.commerce.ad.a.b.b(((f) (obj3)), ai))
        {
            break MISSING_BLOCK_LABEL_948;
        }
        c.a().b(a1, ((f) (obj3)), new com.jiubang.commerce.ad.e.e(this, ((f) (obj3)), a1, list, j1, l, flag, af1));
        return;
        if (!com.jiubang.commerce.ad.a.b.d(((f) (obj3))))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_969;
        }
        if (com.jiubang.commerce.ad.a.b.c(list1))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_984;
        }
        if (!com.jiubang.commerce.ad.a.b.d(((f) (obj3)), ai))
        {
            continue; /* Loop/switch isn't completed */
        }
        c.a().d(a1, ((f) (obj3)), new com.jiubang.commerce.ad.e.f(this, ((f) (obj3)), af1, a1, list, j1, l, flag));
        return;
        if (!com.jiubang.commerce.ad.a.b.e(((f) (obj3)))) goto _L28; else goto _L27
_L27:
        if (list1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (com.jiubang.commerce.ad.a.b.d(list1)) goto _L28; else goto _L29
_L29:
        if (ai == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.jiubang.commerce.ad.a.b.c(((f) (obj3)), ai)) goto _L28; else goto _L30
_L30:
        c.a().c(a1, ((f) (obj3)), new g(this, i1, ((f) (obj3)), a1, list, j1, l, flag, af1));
        return;
_L24:
        if (list1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (list1.contains(Integer.valueOf(((f) (obj3)).d()))) goto _L28; else goto _L31
_L31:
        if (ai == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.jiubang.commerce.ad.a.b.e(((f) (obj3)), ai)) goto _L28; else goto _L32
_L32:
        b1 = a1.n;
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("loadSingleAdSource:onlineApi:tabCategory=").append(b1).toString());
        }
        com.jiubang.commerce.b.b.a(context, "", b1, ((f) (obj3)));
        obj1 = a(context, ((f) (obj3)), i1, k1, ((f) (obj3)).g(), ((f) (obj3)).m(), flag1, flag2, null);
        byte0 = -1;
        k = byte0;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1232;
        }
        k = byte0;
        if (((b) (obj1)).c() != null)
        {
            k = ((b) (obj1)).c().size();
        }
        com.jiubang.commerce.b.b.a(context, "", b1, k, ((f) (obj3)));
        if (!j.a) goto _L34; else goto _L33
_L33:
        obj3 = (new StringBuilder()).append("[vmId:").append(i1).append("]loadSingleAdSourceInfo(success--onlineAd, virtualModuleId:").append(i1).append(", fbAdvCount:").append(((f) (obj3)).g()).append(", onlineAdvPositionId:").append(((f) (obj3)).m()).append(", getAdCount:");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1673;
        }
        if (((b) (obj1)).c() == null)
        {
            break MISSING_BLOCK_LABEL_1673;
        }
        b1 = Integer.valueOf(((b) (obj1)).c().size());
_L41:
        j.a("Ad_SDK", ((StringBuilder) (obj3)).append(b1).append(")").toString());
_L34:
        a(a1, list, j1, l, flag, ((b) (obj1)), af1);
        return;
_L22:
        if (ai == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.jiubang.commerce.ad.a.b.e(((f) (obj3)), ai)) goto _L28; else goto _L35
_L35:
        String s;
        s = a1.n;
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("loadSingleAdSource:offlineAd:tabCategory=").append(s).toString());
        }
        com.jiubang.commerce.b.b.a(context, "", s, ((f) (obj3)));
        obj1 = e.a(f.b(i1), true);
        flag1 = TextUtils.isEmpty(((CharSequence) (obj1)));
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_1496;
        }
        obj1 = f.a(context, i1, k1, flag2, ((f) (obj3)), new JSONObject(((String) (obj1))));
        b1 = ((b) (obj1));
_L38:
        byte0 = -1;
        k = byte0;
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_1529;
        }
        k = byte0;
        if (b1.c() != null)
        {
            k = b1.c().size();
        }
        com.jiubang.commerce.b.b.a(context, "", s, k, ((f) (obj3)));
        if (!j.a) goto _L37; else goto _L36
_L36:
        obj3 = (new StringBuilder()).append("[vmId:").append(i1).append("]loadSingleAdSourceInfo(success--offlineAd[cache], virtualModuleId:").append(i1).append(", getAdCount:");
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_1659;
        }
        if (b1.c() == null)
        {
            break MISSING_BLOCK_LABEL_1659;
        }
        obj1 = Integer.valueOf(b1.c().size());
_L39:
        j.a("Ad_SDK", ((StringBuilder) (obj3)).append(obj1).append(")").toString());
_L37:
        a(a1, list, j1, l, flag, b1, af1);
        return;
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L38
        obj1 = "-1";
          goto _L39
_L6:
        byte0 = 0;
          goto _L40
        b1 = "-1";
          goto _L41
    }

    public b a(Context context, f f1, int k, int l, int i1, int j1, boolean flag, 
            boolean flag1, List list)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        Object obj = e.a(i.a(j1), true);
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L3
_L3:
        b b1 = i.a(context, f1, j1, l, flag1, list, new JSONObject(((String) (obj))));
        if (b1 == null) goto _L5; else goto _L4
_L4:
        obj = b1.f();
_L15:
        if (obj == null) goto _L2; else goto _L6
_L6:
        if (((List) (obj)).isEmpty()) goto _L2; else goto _L7
_L7:
        obj = b1.h();
        if (obj == null) goto _L9; else goto _L8
_L8:
        long l1 = ((i) (obj)).a();
_L16:
        if (!i.a(l1)) goto _L11; else goto _L10
_L10:
        obj = b1;
        if (!j.a) goto _L13; else goto _L12
_L12:
        int k1;
        obj = (new StringBuilder()).append("loadOnlineAdInfo(end--cacheData, onlineAdPosId:").append(j1).append(", adCount:").append(l).append(", requestAdCount:").append(i1).append(", adSize:");
        if (b1.e() == null)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        k1 = b1.e().size();
_L17:
        j.a("Ad_SDK", ((StringBuilder) (obj)).append(k1).append(")").toString());
        return b1;
_L11:
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("loadOnlineAdInfo(cacheData----cache data expired, loadOnlineAdTime:").append(l1).append(", onlineAdPosId:").append(j1).append(", adCount:").append(l).append(", requestAdCount:").append(i1).append(")").toString());
        }
_L2:
        obj = new ArrayList();
        com.jiubang.commerce.ad.b.a.a(context, i1, j1, new com.jiubang.commerce.ad.e.i(this, j1, context, f1, l, flag1, list, ((List) (obj)), k));
        if (((List) (obj)).size() > 0)
        {
            return (b)((List) (obj)).get(0);
        }
        break; /* Loop/switch isn't completed */
        obj;
        ((Exception) (obj)).printStackTrace();
        if (j.a)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("loadOnlineAdInfo(cacheData---error, Exception:");
            if (obj != null)
            {
                obj = ((Exception) (obj)).getMessage();
            } else
            {
                obj = "";
            }
            j.d("Ad_SDK", stringbuilder.append(((String) (obj))).append(", onlineAdPosId:").append(j1).append(", adCount:").append(l).append(", requestAdCount:").append(i1).append(")").toString());
        }
        if (true) goto _L2; else goto _L14
_L14:
        obj = null;
_L13:
        return ((b) (obj));
_L5:
        obj = null;
          goto _L15
_L9:
        l1 = -1L;
          goto _L16
        k1 = -1;
          goto _L17
    }

    public List a(Context context, int k, d d1)
    {
        Object obj;
        int l;
        boolean flag;
        flag = false;
        l = -1;
        obj = e.a(f.b(k), true);
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L2; else goto _L1
_L1:
        f f1 = f.a(context, k, new JSONObject(((String) (obj))));
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        d1.a(f1);
        if (f1 == null) goto _L4; else goto _L3
_L3:
        obj = f1.s();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        context = ((Context) (obj));
        if (!((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        context = ((Context) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context = new ArrayList();
        context.add(f1);
_L13:
        if (f1 == null) goto _L6; else goto _L5
_L5:
        boolean flag1 = f.a(f1.q());
_L11:
        if (flag1 || d1 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        d1.a(null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        if (context.isEmpty() || !flag1)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        if (!j.a)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        d1 = (new StringBuilder()).append("[vmId:").append(k).append("]getAdControlInfoFromCacheData(Success, virtualModuleId:").append(k).append(", size:");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        l = context.size();
        j.a("Ad_SDK", d1.append(l).append(")").toString());
        d1 = com.jiubang.commerce.ad.b.a.j.c(k);
        l = ((flag) ? 1 : 0);
        if (!j.a)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        j.a("Ad_SDK", (new StringBuilder()).append("virtualModuleId=").append(k).append(" user=").append(d1.b()).append(" buychanneltype=").append(d1.a()).toString());
        l = ((flag) ? 1 : 0);
_L8:
        if (l >= context.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((f)context.get(l)).a(d1);
        l++;
        if (true) goto _L8; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
        if (!j.a) goto _L2; else goto _L9
_L9:
        d1 = (new StringBuilder()).append("[vmId:").append(k).append("]getAdControlInfoFromCacheData(Fail, virtualModuleId:").append(k).append(", size:");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        l = context.size();
        j.a("Ad_SDK", d1.append(l).append(")").toString());
_L2:
        return null;
        context;
        context.printStackTrace();
        if (true) goto _L2; else goto _L4
_L4:
        context = null;
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = false;
        if (true) goto _L11; else goto _L10
_L10:
        return context;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void a(Context context, int k, int l, boolean flag, String s, Integer integer, k k1)
    {
        if (k1 == null)
        {
            return;
        } else
        {
            com.jiubang.commerce.ad.b.a.a(context, k, l, flag, s, integer, new com.jiubang.commerce.ad.e.b(this, k, context, k1));
            return;
        }
    }

    public void a(Context context, int k, l l)
    {
        if (l == null)
        {
            return;
        } else
        {
            com.jiubang.commerce.ad.b.a.a(context, k, new com.jiubang.commerce.ad.e.j(this, k, context, l));
            return;
        }
    }

    public void a(Context context, List list, boolean flag, String s, Integer integer)
    {
        com.jiubang.commerce.ad.b.a.a(context, list, "", flag, s, integer, new com.jiubang.commerce.ad.e.c(this, list, context));
    }

    public void a(com.jiubang.commerce.ad.h.a a1, boolean flag, int k, boolean flag1, List list)
    {
        Context context = a1.a;
        int l = a1.b;
        flag = a1.d;
        boolean flag2 = a1.e;
        boolean flag3 = a1.f;
        boolean flag4 = a1.g;
        af af1 = a1.p;
        if (j.a && list != null && !list.isEmpty())
        {
            f f1;
            for (Iterator iterator = list.iterator(); iterator.hasNext(); j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(l).append("]\u5E7F\u544A\u6E90\u4FE1\u606F").append(com.jiubang.commerce.ad.e.a(f1)).toString()))
            {
                f1 = (f)iterator.next();
            }

        }
        a(a1, list, -1, k, flag1, ((b) (null)), ((af) (new h(this, l, context, flag, flag2, flag3, flag4, af1))));
    }
}
