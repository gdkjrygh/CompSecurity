// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.a.c;
import com.jiubang.commerce.ad.url.i;
import com.jiubang.commerce.b.b;
import com.jiubang.commerce.b.f;
import com.jiubang.commerce.database.DataBaseHelper;
import com.jiubang.commerce.service.IntelligentPreloadService;
import com.jiubang.commerce.utils.d;
import com.jiubang.commerce.utils.e;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;
import com.jiubang.commerce.utils.p;
import com.jiubang.commerce.utils.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            u, n, aj, a, 
//            z, ad, aa, ab, 
//            ag, ae, y, x, 
//            v, af

public class t
{

    private static boolean a = false;
    private static t b = null;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private boolean j;

    private t()
    {
        c = "1";
        d = "1";
        e = "123456789";
        f = "200";
        g = "4";
        h = "1";
        i = "";
        j = false;
    }

    public static t a()
    {
        if (b == null)
        {
            b = new t();
        }
        return b;
    }

    public static void a(Context context, int l, List list, boolean flag, i i1)
    {
        if (context == null || list == null || list.size() <= 0) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        int j1 = 0;
        while (j1 < list.size()) 
        {
            a a1 = (a)list.get(j1);
            if (a1 != null)
            {
                if (j.a)
                {
                    int k1 = a1.b();
                    com.jiubang.commerce.utils.j.c("Ad_SDK", (new StringBuilder()).append("[vmId:").append(k1).append("]preResolveAdvertUrl(index:").append(j1).append(", moduleId:").append(l).append(", IsAd:").append(a1.p()).append(", AdPreload: ").append(a1.r()).append(", adUrl:").append(a1.q()).append(", ").append(arraylist.size()).append(")").toString());
                }
                if (a1.p() == 1 && !TextUtils.isEmpty(a1.q()) && a1.r() == 1)
                {
                    arraylist.add(a1);
                }
            }
            j1++;
        }
        if (arraylist.size() <= 0) goto _L4; else goto _L3
_L3:
        com.jiubang.commerce.c.a.a(new u(context, l, arraylist, flag, i1));
_L6:
        return;
_L4:
        if (i1 != null)
        {
            i1.a(context);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 != null)
        {
            i1.a(context);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(Context context, String s, String s1, String s2, String s3, String s4)
    {
        try
        {
            if (!TextUtils.isEmpty(s3))
            {
                f.c = p.a(com.jiubang.commerce.b.b.a(s3, s4), Integer.valueOf(-1)).intValue();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        if (context != null);
    }

    public static void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        t t1;
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        t1 = a();
        t1.c = s1;
        t1.d = s2;
        t1.e = s3;
        t1.f = s4;
        t1.g = s5;
        t1.h = s6;
        t1.i = s;
        com.jiubang.commerce.c.a.a();
        a(context, s, s4, s3, s2, s6);
        DataBaseHelper.getInstance(context);
        com.jiubang.commerce.utils.d.a(context);
        com.jiubang.commerce.ad.e.n.a(context);
        com.jiubang.commerce.ad.e.aj.a(context);
        IntelligentPreloadService.a(context, s, s1, s2, s3, s4, s5, s6);
        if (j.a)
        {
            com.jiubang.commerce.ad.d.a();
        }
    }

    private void a(Context context, List list, boolean flag, String s, Integer integer)
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.a("Ad_SDK", (new StringBuilder()).append("syncRequestAdData(begin, virtualModuleId:").append(list).append(")").toString());
        }
        if (!k.a(context))
        {
            if (j.a)
            {
                com.jiubang.commerce.utils.j.a("Ad_SDK", (new StringBuilder()).append("syncRequestAdData(end--Network unavailable, virtualModuleId:").append(list).append(")").toString());
            }
            return;
        }
        com.jiubang.commerce.ad.e.a a1 = com.jiubang.commerce.ad.e.a.a(context);
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(new com.jiubang.commerce.ad.h.d(Integer.valueOf(((Integer)list.next()).intValue()), Integer.valueOf(0)))) { }
        a1.a(context, arraylist, flag, s, integer);
    }

    protected static void a(Context context, boolean flag, com.jiubang.commerce.ad.a.b b1, boolean flag1, boolean flag2, boolean flag3, boolean flag4, af af)
    {
        a(context, b1, flag1, flag2, flag3, flag4, ((ad) (new z(af, flag, b1))));
    }

    public static void a(a a1)
    {
        com/jiubang/commerce/ad/e/t;
        JVM INSTR monitorenter ;
        if (a1 == null) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(a1.q())) goto _L2; else goto _L3
_L3:
        boolean flag = TextUtils.isEmpty(a1.s());
        if (!flag) goto _L4; else goto _L2
_L2:
        com/jiubang/commerce/ad/e/t;
        JVM INSTR monitorexit ;
        return;
_L4:
        String s;
        s = com.jiubang.commerce.utils.e.a(a1.s(), true);
        flag = TextUtils.isEmpty(s);
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s2;
        JSONObject jsonobject;
        jsonobject = new JSONObject(s);
        s2 = jsonobject.optString("hasShowAdUrlList", "");
        String s1 = s2;
        try
        {
            if (TextUtils.isEmpty(s2))
            {
                s1 = (new StringBuilder()).append(s2).append("||").toString();
            }
            jsonobject.put("hasShowAdUrlList", (new StringBuilder()).append(s1).append(a1.q()).append("||").toString());
            com.jiubang.commerce.utils.e.a(a1.s(), p.d(jsonobject), true);
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (a a1) { }
        finally
        {
            com/jiubang/commerce/ad/e/t;
        }
        a1.printStackTrace();
        if (true) goto _L2; else goto _L5
_L5:
        throw a1;
    }

    static void a(t t1, Context context, List list, boolean flag, String s, Integer integer)
    {
        t1.a(context, list, flag, s, integer);
    }

    public static boolean a(Context context, com.jiubang.commerce.ad.a.b b1, boolean flag, boolean flag1, boolean flag2, boolean flag3, ad ad1)
    {
        int l;
        boolean flag4;
        Object obj;
        if (flag || flag1)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (b1 != null)
        {
            obj = b1.g();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            l = ((com.jiubang.commerce.ad.b.a.f) (obj)).b();
        } else
        {
            l = -1;
        }
        if (b1 != null)
        {
            b1 = b1.c();
        } else
        {
            b1 = null;
        }
        if (j.a)
        {
            StringBuilder stringbuilder;
            int i1;
            if (obj != null)
            {
                i1 = ((com.jiubang.commerce.ad.b.a.f) (obj)).a();
            } else
            {
                i1 = -1;
            }
            stringbuilder = (new StringBuilder()).append("[vmId:").append(i1).append("]loadAdvertOtherInfo(module:");
            if (obj != null)
            {
                obj = Integer.valueOf(((com.jiubang.commerce.ad.b.a.f) (obj)).b());
            } else
            {
                obj = "-1";
            }
            obj = stringbuilder.append(obj).append(", adSize:");
            if (b1 != null)
            {
                i1 = b1.size();
            } else
            {
                i1 = -1;
            }
            com.jiubang.commerce.utils.j.a("Ad_SDK", ((StringBuilder) (obj)).append(i1).append(", isNeedDownloadImage:").append(flag4).append(", isNeedPreResolve: ").append(flag2).append(", isPreResolveBeforeShow:").append(flag3).append(", isDownloadBanner:").append(flag1).append(")").toString());
        }
        if (b1 == null || b1.isEmpty())
        {
            if (ad1 != null)
            {
                ad1.a();
                ad1.b();
            }
            return false;
        }
        if (!flag3) goto _L2; else goto _L1
_L1:
        if (!flag2) goto _L4; else goto _L3
_L3:
        a(context, l, ((List) (b1)), true, ((i) (new aa(ad1, flag4, b1, flag, flag1))));
_L6:
        return true;
_L4:
        if (ad1 != null)
        {
            ad1.a();
        }
        if (flag4)
        {
            com.jiubang.commerce.ad.e.n.a(context).a(b1, flag, flag1);
            if (ad1 != null)
            {
                ad1.b();
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (ad1 != null)
        {
            ad1.a();
        }
        if (flag2)
        {
            a(context, l, ((List) (b1)), true, ((i) (new ab())));
        }
        if (flag4)
        {
            com.jiubang.commerce.ad.e.n.a(context).a(b1, flag, flag1);
            if (ad1 != null)
            {
                ad1.b();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean i()
    {
        boolean flag;
        String s = a().d();
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if ("4".equals(s))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        flag = "9".equals(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        return true;
        Exception exception;
        exception;
        exception.printStackTrace();
        return false;
    }

    public static boolean j()
    {
        return a;
    }

    public void a(Context context, ae ae1)
    {
        if (context == null || ae1 == null)
        {
            throw new IllegalArgumentException("\u4F20\u5165\u53C2\u6570context\u548Clistener\u4E0D\u80FD\u4E3A\u7A7A");
        }
        c c1 = com.jiubang.commerce.ad.e.ag.a(context).a();
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("maple", (new StringBuilder()).append("AdUserTagInfo->isValid:").append(c1.a(context)).toString());
        }
        if (c1.a(context))
        {
            if (j.a)
            {
                com.jiubang.commerce.utils.j.b("Ad_SDK", (new StringBuilder()).append("\u672C\u5730\u7F13\u5B58\u76F4\u63A5\u83B7\u53D6:ADSdkManager.requestUserTags[ status:Success, tags: ").append(c1.a()).append("  ]").toString());
            }
            ae1.a(c1);
            return;
        } else
        {
            com.jiubang.commerce.ad.b.a.a(context, new y(this, ae1, context));
            return;
        }
    }

    public void a(Context context, List list, String s, Integer integer)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Integer integer1 = (Integer)list.next();
                if (!arraylist.contains(integer1))
                {
                    arraylist.add(integer1);
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                (new Thread(new x(this, context, arraylist, s, integer))).start();
                return;
            }
        }
    }

    public void a(com.jiubang.commerce.ad.h.a a1)
    {
        Context context = a1.a;
        int l = a1.b;
        int i1 = a1.a();
        boolean flag = a1.h;
        boolean flag1 = a1.i;
        String s = a1.l;
        Integer integer = a1.m;
        (new Thread(new v(this, context, a1.p, l, flag, a1.q, i1, a1, flag1, s, integer))).start();
    }

    public boolean a(Context context, int l)
    {
        Object obj = com.jiubang.commerce.ad.e.a.a(context).a(context, l, null);
        if (obj == null || ((List) (obj)).isEmpty())
        {
            return false;
        }
        if (1 == ((List) (obj)).size())
        {
            obj = (com.jiubang.commerce.ad.b.a.f)((List) (obj)).get(0);
            if (((com.jiubang.commerce.ad.b.a.f) (obj)).t() && com.jiubang.commerce.ad.a.b.b(((com.jiubang.commerce.ad.b.a.f) (obj))))
            {
                if (com.jiubang.commerce.utils.b.a(context, "com.facebook.katana") || com.jiubang.commerce.utils.b.a(context, "com.facebook.lite"))
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                return l != 0 && q.b;
            }
        }
        return true;
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return e;
    }

    public String d()
    {
        return d;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public boolean h()
    {
        return j;
    }

}
