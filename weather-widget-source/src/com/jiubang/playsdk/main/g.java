// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.main;

import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.jiubang.playsdk.e;

// Referenced classes of package com.jiubang.playsdk.main:
//            h, i, j, k, 
//            m, l

public class g
{

    private final View a;
    private View b;
    private final int c;
    private final Handler d;
    private final int e;
    private int f;
    private volatile boolean g;
    private m h;
    private l i;
    private final android.view.View.OnClickListener j;
    private final android.view.View.OnClickListener k;
    private final android.view.View.OnClickListener l;

    private g(View view, View view1, int i1, int j1, m m, l l1)
    {
        d = new Handler();
        g = false;
        j = new h(this);
        k = new i(this);
        l = new j(this);
        a = view;
        b = view1;
        c = i1;
        e = j1;
        h = m;
        i = l1;
        c();
    }

    public g(View view, View view1, m m, l l1)
    {
        this(view, view1, e.n, e.p, m, l1);
    }

    static m a(g g1)
    {
        return g1.h;
    }

    private void a(int i1, String s)
    {
        g = false;
        if (i1 == f)
        {
            return;
        }
        f;
        JVM INSTR tableswitch 0 3: default 48
    //                   0 80
    //                   1 148
    //                   2 157
    //                   3 85;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new IllegalStateException((new StringBuilder()).append("Invalid mode ").append(i1).append("should be LOADING_MODE, ERROR_MODE, DATA_MODE, or BLANK_MODE").toString());
_L2:
        b(false);
_L5:
        i1;
        JVM INSTR tableswitch 0 3: default 116
    //                   0 165
    //                   1 176
    //                   2 185
    //                   3 170;
           goto _L6 _L7 _L8 _L9 _L10
_L6:
        throw new IllegalStateException((new StringBuilder()).append("Invalid mode ").append(i1).append("should be LOADING_MODE, ERROR_MODE, DATA_MODE, or BLANK_MODE").toString());
_L3:
        a(false, ((String) (null)));
          goto _L5
_L4:
        a(false);
          goto _L5
_L7:
        b(true);
_L10:
        f = i1;
        return;
_L8:
        a(true, s);
        continue; /* Loop/switch isn't completed */
_L9:
        a(true);
        if (true) goto _L10; else goto _L11
_L11:
    }

    private void a(boolean flag)
    {
        if (b == null)
        {
            return;
        }
        if (flag)
        {
            b.setVisibility(0);
            return;
        } else
        {
            b.setVisibility(8);
            return;
        }
    }

    private void a(boolean flag, String s)
    {
        if (c <= 0)
        {
            return;
        } else
        {
            a(flag, true);
            return;
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        View view = a.findViewById(c);
        Button button = (Button)view.findViewById(e.o);
        Object obj = (TextView)view.findViewById(e.l);
        obj = (Button)view.findViewById(e.i);
        Button button1 = (Button)view.findViewById(e.k);
        if (!flag)
        {
            view.setVisibility(8);
            button.setOnClickListener(null);
            ((Button) (obj)).setOnClickListener(null);
            button1.setOnClickListener(null);
            return;
        } else
        {
            view.setVisibility(0);
            button.setVisibility(0);
            button.setOnClickListener(j);
            button1.setOnClickListener(l);
            return;
        }
    }

    static l b(g g1)
    {
        return g1.i;
    }

    private void b(boolean flag)
    {
        View view;
        if (e > 0)
        {
            if ((view = a.findViewById(e)) != null)
            {
                if (flag)
                {
                    view.setVisibility(0);
                    return;
                } else
                {
                    view.setVisibility(8);
                    return;
                }
            }
        }
    }

    private void c()
    {
        f = 3;
        b(false);
        a(false, ((String) (null)));
        a(false);
    }

    static boolean c(g g1)
    {
        return g1.g;
    }

    public void a()
    {
        a(2, ((String) (null)));
    }

    public void a(int i1)
    {
        g = true;
        d.postDelayed(new k(this), i1);
    }

    public void a(String s)
    {
        a(1, s);
    }

    public void b()
    {
        a(0, ((String) (null)));
    }
}
