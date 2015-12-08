// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.url;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.jiubang.commerce.ad.b.a.l;
import com.jiubang.commerce.ad.f;
import com.jiubang.commerce.utils.k;

// Referenced classes of package com.jiubang.commerce.ad.url:
//            b, c, n, d

public class a extends AsyncTask
{

    private Context a;
    private l b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private long i;
    private boolean j;
    private boolean k;
    private String l;
    private c m;
    private Handler n;
    private Runnable o;

    public a(Context context, l l1, String s, String s1, String s2, String s3, String s4, 
            String s5, long l2, boolean flag, boolean flag1, String s6, c c1)
    {
        o = new b(this);
        a = context;
        b = l1;
        c = s;
        d = s1;
        e = s2;
        f = s3;
        g = s4;
        h = s5;
        i = System.currentTimeMillis();
        j = flag;
        k = flag1;
        l = s6;
        m = c1;
        if (l2 > 0L)
        {
            n = new Handler();
            n.postDelayed(o, l2);
        }
    }

    static c a(a a1)
    {
        return a1.m;
    }

    private void a()
    {
        if (m != null)
        {
            m = null;
        }
        if (n != null)
        {
            n = null;
        }
    }

    public static boolean a(Context context, l l1, String s, String s1, String s2, String s3, String s4, String s5, 
            long l2, boolean flag, boolean flag1, String s6, c c1)
    {
        if (com.jiubang.commerce.utils.k.a(context))
        {
            (new a(context, l1, s, s1, s2, s3, s4, s5, l2, flag, flag1, s6, c1)).execute(new Integer[] {
                Integer.valueOf(0)
            });
            return true;
        }
        if (c1 != null)
        {
            c1.a(context, 18, s, "", s4, s5, System.currentTimeMillis(), flag);
        }
        (new n(1, 2, s4, "network is not ok", 0L)).a(context, s1, s2, s3);
        return false;
    }

    public static boolean a(String s, int i1)
    {
        return !TextUtils.isEmpty(s) && i1 == 1;
    }

    static Context b(a a1)
    {
        return a1.a;
    }

    static String c(a a1)
    {
        return a1.h;
    }

    static String d(a a1)
    {
        return a1.g;
    }

    static boolean e(a a1)
    {
        return a1.j;
    }

    static void f(a a1)
    {
        a1.a();
    }

    protected transient String a(Integer ainteger[])
    {
        return com.jiubang.commerce.ad.url.d.a(a, b, d, e, f, g);
    }

    protected void a(String s)
    {
        super.onPostExecute(s);
        if (n != null)
        {
            n.removeCallbacks(o);
        }
        if (m == null) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(s)) goto _L4; else goto _L3
_L3:
        m.a(a, 17, c, s, g, h, i, j);
_L2:
        a();
        return;
_L4:
        try
        {
            m.a(a, 16, c, s, g, h, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((String)obj);
    }

    protected void onPreExecute()
    {
label0:
        {
            super.onPreExecute();
            if (k)
            {
                if (TextUtils.isEmpty(l))
                {
                    break label0;
                }
                Toast.makeText(a, l, 1).show();
            }
            return;
        }
        Toast.makeText(a, com.jiubang.commerce.ad.f.a(a).e("recommended_click_tip"), 1).show();
    }
}
