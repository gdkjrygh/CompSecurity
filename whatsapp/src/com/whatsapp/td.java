// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ListView;
import com.whatsapp.protocol.cr;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            ao9, vo, n, ad9, 
//            r0, ac, App, ya, 
//            a1e, _i, aoz, ht, 
//            qx, auh, adk, wd

public abstract class td
{

    private static final String z;
    private long a;
    private auh b;
    private String c;
    private Runnable d;
    protected ArrayList e;
    private Activity f;
    private View g;
    private ListView h;
    private final adk i = new ad9(this);
    private ya j;
    private Handler k;
    private int l;
    private final wd m = new r0(this);
    private ao9 n;
    protected ArrayList o;

    public td()
    {
        n = new ao9();
        o = new ArrayList();
        k = new Handler();
        a = 30000L;
        b = new vo(this);
        d = new n(this);
    }

    static long a(td td1, long l1)
    {
        td1.a = l1;
        return l1;
    }

    static Activity a(td td1)
    {
        return td1.f;
    }

    static Handler b(td td1)
    {
        return td1.k;
    }

    static void c(td td1)
    {
        td1.d();
    }

    static Runnable d(td td1)
    {
        return td1.d;
    }

    private void d()
    {
        f.runOnUiThread(new ac(this));
    }

    static ya e(td td1)
    {
        return td1.j;
    }

    private boolean f()
    {
        boolean flag;
label0:
        {
label1:
            {
                flag = false;
                float f1 = f.getResources().getDimension(0x7f0a003c);
                float f2 = f.getResources().getDisplayMetrics().density;
                float f3 = f.getResources().getDimension(0x7f0a0045);
                int i1 = (int)Math.min((f1 + f2) * (float)e.size(), f3);
                if (i1 == l)
                {
                    break label0;
                }
                l = i1;
                if (i1 == 0)
                {
                    g.setVisibility(8);
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                g.setVisibility(0);
                g.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i1));
            }
            flag = true;
        }
        return flag;
    }

    static boolean f(td td1)
    {
        return td1.f();
    }

    static String g(td td1)
    {
        return td1.c;
    }

    static ao9 h(td td1)
    {
        return td1.n;
    }

    static long i(td td1)
    {
        return td1.a;
    }

    public void a()
    {
        o.clear();
        j.notifyDataSetChanged();
    }

    public void a(Activity activity)
    {
        f = activity;
        c = activity.getIntent().getStringExtra(z);
        e = a1e.g.a(c);
        h = (ListView)activity.findViewById(0x102000a);
        h.setOnItemClickListener(new _i(this));
        g = activity.findViewById(0x7f0b0206);
        g.setVisibility(8);
        j = new ya(this, activity, e);
        h.setAdapter(j);
        f();
        a1e.g.a(b);
        App.ah.a(i);
        App.b(m);
    }

    public abstract void a(cr cr, boolean flag);

    public void a(ArrayList arraylist)
    {
label0:
        {
            o = arraylist;
            j.notifyDataSetChanged();
            int i1 = e.indexOf(o.get(0));
            if (android.os.Build.VERSION.SDK_INT >= 8)
            {
                h.smoothScrollToPosition(i1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            h.setSelection(i1);
        }
    }

    public void b()
    {
        ht ht1 = new ht(this, c, true);
        k.removeCallbacks(d);
        k.postDelayed(d, a);
        App.a(ht1);
        d();
    }

    public abstract Location c();

    public abstract void e();

    public void g()
    {
        k.removeCallbacks(d);
        App.a(new qx(c));
    }

    public void h()
    {
        n.a();
        a1e.g.b(b);
        App.ah.b(i);
        App.a(m);
    }

    static 
    {
        char ac1[];
        int i1;
        int j1;
        ac1 = "W2\024".toCharArray();
        j1 = ac1.length;
        i1 = 0;
_L7:
        char c1;
        if (j1 <= i1)
        {
            z = (new String(ac1)).intern();
            return;
        }
        c1 = ac1[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 19;
_L8:
        ac1[i1] = (char)(byte0 ^ c1);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 61;
          goto _L8
_L3:
        byte0 = 91;
          goto _L8
_L4:
        byte0 = 112;
          goto _L8
        byte0 = 123;
          goto _L8
    }
}
