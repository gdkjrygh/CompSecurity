// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import com.ubercab.client.feature.shoppingcart.ShoppingMenuRecyclerView;

public final class fiu extends hm
{

    boolean a;
    boolean b;
    boolean c;
    boolean d;
    boolean e;
    int f;
    private final int g;
    private final int h;
    private final ShoppingMenuRecyclerView i;
    private int j;

    public fiu(ShoppingMenuRecyclerView shoppingmenurecyclerview, int k)
    {
        h = k;
        g = k / 20;
        i = shoppingmenurecyclerview;
    }

    private boolean b()
    {
        return (double)f <= (double)h * 1.05D && j == 2 && a && !d;
    }

    private boolean c()
    {
        return f < h;
    }

    public final void a(int k)
    {
        j = k;
        k;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 33
    //                   1 160
    //                   2 118;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if (a && c && f < g)
        {
            a = false;
            i.q();
            return;
        }
        if (a && c)
        {
            if (d)
            {
                a = false;
                i.n();
                return;
            } else
            {
                a = false;
                i.q();
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (a && c)
        {
            a = false;
            if (d)
            {
                i.n();
                return;
            } else
            {
                i.q();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        a = true;
        return;
    }

    public final void a(RecyclerView recyclerview, int k)
    {
        f = f + k;
        recyclerview = recyclerview.getChildAt(0);
        boolean flag;
        if (k > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (recyclerview != null)
        {
            c = c();
            b = a();
            if (!c && e)
            {
                i.r();
            }
            if (c && b)
            {
                i.s();
            }
            if (b())
            {
                a = false;
                i.n();
            }
            e = c;
            return;
        } else
        {
            c = true;
            e = true;
            b = false;
            return;
        }
    }

    public final boolean a()
    {
        return f == 0;
    }

    public final void b(int k)
    {
        f = f - k;
    }

    public final void c(int k)
    {
        i.a(0, k - f);
    }
}
