// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.q;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            App, k, CallsFragment, og

class yj
{

    private final ArrayList a;
    final CallsFragment b;

    public yj(CallsFragment callsfragment)
    {
        b = callsfragment;
        super();
        a = new ArrayList();
    }

    public yj(CallsFragment callsfragment, c4 c4_1)
    {
        b = callsfragment;
        super();
        a = new ArrayList();
        a.add(c4_1);
    }

    static ArrayList a(yj yj1)
    {
        return yj1.a;
    }

    int a()
    {
        return a.size();
    }

    public boolean a(c4 c4_1)
    {
        boolean flag = b(c4_1);
        if (flag)
        {
            a.add(c4_1);
        }
        return flag;
    }

    public boolean a(c4 c4_1, c4 c4_2)
    {
        if (c4_1.y.a.equals(c4_2.y.a) && q.b(c4_1.I, c4_2.I))
        {
            boolean flag;
            boolean flag1;
            if (!c4_1.y.b && c4_1.H == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!c4_2.y.b && c4_2.H == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            return flag == flag1;
        } else
        {
            return false;
        }
    }

    boolean b()
    {
        return a.isEmpty();
    }

    public boolean b(c4 c4_1)
    {
        return a.isEmpty() || a(c4_1, (c4)a.get(a.size() - 1));
    }

    long c()
    {
        if (b())
        {
            return 0L;
        } else
        {
            return com.whatsapp.App.q((c4)a.get(0));
        }
    }

    int d()
    {
        if (b())
        {
            return 0;
        }
        c4 c4_1 = (c4)a.get(0);
        if (c4_1.y.b)
        {
            return 0x7f02010e;
        }
        return c4_1.H <= 0 ? 0x7f02010d : 0x7f02010c;
    }

    og e()
    {
        if (b())
        {
            return null;
        } else
        {
            return App.az.e(((c4)a.get(0)).y.a);
        }
    }

    public String toString()
    {
        if (b())
        {
            return null;
        } else
        {
            return e().a(b.getActivity());
        }
    }
}
