// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.http.AndroidHttpClient;
import android.text.TextUtils;
import android.util.SparseArray;
import com.android.a.a.a;
import com.android.a.a.o;
import com.android.a.s;
import com.jiubang.playsdk.d.d;
import com.jiubang.playsdk.d.e;
import com.jiubang.playsdk.f.f;
import com.jiubang.playsdk.f.i;
import com.jiubang.playsdk.j;
import com.jiubang.playsdk.main.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.jiubang.playsdk.a:
//            x, a, d, n, 
//            w, k, v

public class y
{

    private static volatile y c = null;
    public i a;
    private com.jiubang.playsdk.a.d b;
    private SparseArray d;
    private c e;
    private boolean f;
    private Context g;
    private boolean h;
    private f i;

    public y()
    {
        f = false;
        h = false;
    }

    public static y a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/jiubang/playsdk/a/y;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new y();
        }
        com/jiubang/playsdk/a/y;
        JVM INSTR monitorexit ;
_L2:
        return c;
        Exception exception;
        exception;
        com/jiubang/playsdk/a/y;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        if (list == null || list.size() < 3)
        {
            return list;
        }
        int k = list.size();
        Random random = new Random(System.currentTimeMillis());
        HashSet hashset;
        for (hashset = new HashSet(); hashset.size() < 3; hashset.add(Integer.valueOf(random.nextInt(k)))) { }
        for (Iterator iterator = hashset.iterator(); iterator.hasNext(); arraylist.add(list.get(((Integer)iterator.next()).intValue()))) { }
        return arraylist;
    }

    private s d(Context context)
    {
        String s1 = "volley/0";
        try
        {
            String s2 = context.getPackageName();
            context = context.getPackageManager().getPackageInfo(s2, 0);
            context = (new StringBuilder()).append(s2).append("/").append(((PackageInfo) (context)).versionCode).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = s1;
        }
        context = new a(new x(AndroidHttpClient.newInstance(context)));
        context = new s(new o(), context, 2);
        context.a();
        return context;
    }

    public com.jiubang.playsdk.a.a a(Context context, com.jiubang.playsdk.d.a a1)
    {
        if (context == null || a1 == null)
        {
            return new com.jiubang.playsdk.a.a();
        }
        com.jiubang.playsdk.a.a a2 = new com.jiubang.playsdk.a.a();
        a2.b(a1.c());
        a2.c(a1.j());
        a2.a(a1.i());
        a2.b(a1.s());
        a2.a(a1.b());
        a2.h(a1.e());
        a2.a(a1.d());
        if (a1.a() == 0L)
        {
            a2.d(com.jiubang.playsdk.e.a.a(context, a(a1)));
        } else
        {
            a2.d(String.valueOf(a1.a()));
        }
        a2.e(a1.k());
        return a2;
    }

    public d a(String s1)
    {
        return b.a(s1);
    }

    public String a(com.jiubang.playsdk.d.a a1)
    {
        String s1;
        if (a1 == null)
        {
            s1 = "";
        } else
        {
            String s2 = a1.o();
            s1 = s2;
            if (TextUtils.isEmpty(s2))
            {
                switch (a1.f())
                {
                case 23: // '\027'
                case 27: // '\033'
                case 28: // '\034'
                case 29: // '\035'
                case 30: // '\036'
                case 34: // '"'
                case 35: // '#'
                default:
                    return "";

                case 21: // '\025'
                case 24: // '\030'
                    return "com.gau.go.launcherex";

                case 22: // '\026'
                    return "com.jiubang.goscreenlock";

                case 25: // '\031'
                case 26: // '\032'
                    return "com.jb.gosms";

                case 31: // '\037'
                case 32: // ' '
                case 33: // '!'
                case 36: // '$'
                    return "com.gau.go.launcherex.gowidget.weatherwidget";

                case 37: // '%'
                    return "com.jb.gokeyboard";
                }
            }
        }
        return s1;
    }

    public void a(int k, c c1)
    {
        if (d == null)
        {
            d = new SparseArray();
        }
        if (c1 == d.get(k))
        {
            return;
        } else
        {
            d.put(k, c1);
            return;
        }
    }

    public void a(long l, int k, int i1, int j1, k k1)
    {
        b.a(l, k, i1, j1, k1);
    }

    public void a(long l, k k)
    {
        b.a(l, k);
    }

    public void a(Context context)
    {
        if (f)
        {
            return;
        } else
        {
            g = context.getApplicationContext();
            j.a(g);
            com.jiubang.playsdk.f.j.a(g);
            s s1 = d(g);
            b = new com.jiubang.playsdk.a.d(g, s1, new n());
            f = true;
            i = new f(context);
            a = new i();
            return;
        }
    }

    public void a(Context context, int k, long l)
    {
        if (e != null)
        {
            e.b(context, com.jiubang.playsdk.f.a.a(k));
            com.jiubang.playsdk.e.a.a(context, e.l(), e.l(), l);
        }
    }

    public void a(Context context, e e1, long l)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag = false;
        flag2 = true;
        if (e1 != null && context != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        com.jiubang.playsdk.d.a a1;
        c c1;
        int k;
        a1 = e1.f();
        k = e1.d();
        c1 = a().b();
        if (k != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!com.jiubang.playsdk.f.a.a(context, e1.e()))
        {
            flag = true;
        }
        flag1 = flag;
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        com.jiubang.playsdk.e.a.c(g, c1.l(), a1.b(), c1.m(), a1.a(), a1.s());
_L5:
        if (flag && c1 != null)
        {
            com.jiubang.playsdk.e.a.a(context, c1.l(), a1.b(), c1.m(), l, e1.c());
            c1.a(context, e1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        flag = flag2;
        if (k != 3) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (!com.jiubang.playsdk.f.a.b(context, e1.e()))
        {
            flag = true;
        }
        flag1 = flag;
        if (c1 != null)
        {
            com.jiubang.playsdk.e.a.c(g, c1.l(), a1.b(), c1.m(), a1.a(), a1.s());
            flag1 = flag;
        }
        flag = flag1;
          goto _L5
    }

    public void a(k k)
    {
        b.a(k);
    }

    public void a(c c1)
    {
        if (c1 != null)
        {
            e = c1;
            a(c1.l(), c1);
        }
    }

    public void a(String s1, int k, int l, k k1)
    {
        b.a(s1, k, l, k1);
    }

    public void a(String s1, boolean flag)
    {
        b.a(s1, flag);
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public boolean a(Context context, int k, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        if (k == 2)
        {
            s1 = e(s1);
        } else
        {
            s1 = d(s1);
        }
        return com.jiubang.playsdk.f.a.a(context, k, s1);
    }

    public v b(String s1)
    {
        return b.b(s1);
    }

    public c b()
    {
        return e;
    }

    public String b(Context context)
    {
        if (e == null)
        {
            return "";
        } else
        {
            return e.c(context);
        }
    }

    public List c(Context context)
    {
        if (e != null && e.n() != 0) goto _L2; else goto _L1
_L1:
        Object obj = new ArrayList();
_L4:
        return ((List) (obj));
_L2:
        InputStream inputstream = context.getResources().openRawResource(e.n());
        context = com.jiubang.playsdk.d.f.b(new String(com.jiubang.playsdk.f.c.a(inputstream)));
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        context = a(((com.jiubang.playsdk.a.a.c) (context)).a);
        obj = context;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
                return context;
            }
            return context;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
        }
_L6:
        return new ArrayList();
        context;
        context.printStackTrace();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
        }
        continue; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        context;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception1)
            {
                ioexception1.printStackTrace();
            }
        }
        throw context;
    }

    public void c()
    {
        b.a();
    }

    public boolean c(String s1)
    {
        return b.c(s1);
    }

    public Context d()
    {
        return g;
    }

    public String d(String s1)
    {
        return a.a(s1);
    }

    public int e()
    {
        if (e == null)
        {
            return 80;
        } else
        {
            return e.l();
        }
    }

    public String e(String s1)
    {
        return a.a(e(), s1);
    }

    public boolean f()
    {
        return h;
    }

    public boolean f(String s1)
    {
        return i.a(s1);
    }

    public String g(String s1)
    {
        return i.b(s1);
    }

}
