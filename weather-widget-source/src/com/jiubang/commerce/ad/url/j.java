// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.text.TextUtils;
import com.jiubang.commerce.database.b.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            k

public class j
{

    private static j a;
    private Context b;
    private k c;
    private volatile List d;
    private volatile Map e;
    private Map f;
    private String g;
    private b h;

    private j(Context context)
    {
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        b = context;
        c = new k(this);
        h = com.jiubang.commerce.database.b.b.a(b);
        a();
    }

    public static j a(Context context)
    {
        if (a == null)
        {
            a = new j(context);
        }
        return a;
    }

    static String a(j j1, String s)
    {
        j1.g = s;
        return s;
    }

    static List a(j j1)
    {
        return j1.d;
    }

    private void a()
    {
        h.a(0xf731400L);
        Object obj = h.a(null);
        if (obj != null && !((List) (obj)).isEmpty())
        {
            if (f == null)
            {
                f = new HashMap();
            }
            com.jiubang.commerce.database.a.b b1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); f.put(b1.b(), b1))
            {
                b1 = (com.jiubang.commerce.database.a.b)((Iterator) (obj)).next();
            }

        }
    }

    static String b(j j1)
    {
        return j1.g;
    }

    static Map c(j j1)
    {
        return j1.e;
    }

    static Context d(j j1)
    {
        return j1.b;
    }

    public void a(String s)
    {
        if (!TextUtils.isEmpty(s) && d != null && d.contains(s))
        {
            d.remove(s);
        }
    }

    public void a(String s, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s1);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s3 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s3 = s1;
        }
        a(s1);
        if (f == null)
        {
            f = new HashMap();
        }
        s2 = new com.jiubang.commerce.database.a.b();
        s2.b(s1);
        s2.c(s3);
        s2.a(System.currentTimeMillis());
        f.put(s1, s2);
        h.a(com.jiubang.commerce.database.b.b.a(s, s1, s3, s2.d()));
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public String b(String s)
    {
        com.jiubang.commerce.database.a.b b1;
        if (f != null && !TextUtils.isEmpty(s))
        {
            b1 = (com.jiubang.commerce.database.a.b)f.get(s);
        } else
        {
            b1 = null;
        }
        if (b1 != null)
        {
            if ((TextUtils.isEmpty(b1.c()) || b1.c().startsWith(s)) && b1.d() <= System.currentTimeMillis() - 0x5265c00L)
            {
                return "";
            }
            if (b1.d() > System.currentTimeMillis() - 0xf731400L)
            {
                return b1.c();
            }
        }
        return "";
    }

    public boolean c(String s)
    {
        return !TextUtils.isEmpty(b(s));
    }

    public boolean d(String s)
    {
        return !TextUtils.isEmpty(s) && s.equals(g);
    }
}
