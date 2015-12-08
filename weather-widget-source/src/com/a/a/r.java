// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.a.a:
//            o, p, l, q, 
//            n, am

class r
{

    int a;
    o b;
    o c;
    Interpolator d;
    ArrayList e;
    am f;

    public transient r(o ao[])
    {
        a = ao.length;
        e = new ArrayList();
        e.addAll(Arrays.asList(ao));
        b = (o)e.get(0);
        c = (o)e.get(a - 1);
        d = c.d();
    }

    public static transient r a(float af[])
    {
        int i = 1;
        int j = af.length;
        p ap[] = new p[Math.max(j, 2)];
        if (j == 1)
        {
            ap[0] = (p)o.b(0.0F);
            ap[1] = (p)o.a(1.0F, af[0]);
        } else
        {
            ap[0] = (p)o.a(0.0F, af[0]);
            while (i < j) 
            {
                ap[i] = (p)o.a((float)i / (float)(j - 1), af[i]);
                i++;
            }
        }
        return new l(ap);
    }

    public static transient r a(int ai[])
    {
        int i = 1;
        int j = ai.length;
        q aq[] = new q[Math.max(j, 2)];
        if (j == 1)
        {
            aq[0] = (q)o.a(0.0F);
            aq[1] = (q)o.a(1.0F, ai[0]);
        } else
        {
            aq[0] = (q)o.a(0.0F, ai[0]);
            while (i < j) 
            {
                aq[i] = (q)o.a((float)i / (float)(j - 1), ai[i]);
                i++;
            }
        }
        return new n(aq);
    }

    public Object a(float f1)
    {
        if (a == 2)
        {
            float f2 = f1;
            if (d != null)
            {
                f2 = d.getInterpolation(f1);
            }
            return f.a(f2, b.b(), c.b());
        }
        if (f1 <= 0.0F)
        {
            o o1 = (o)e.get(1);
            Interpolator interpolator = o1.d();
            float f3 = f1;
            if (interpolator != null)
            {
                f3 = interpolator.getInterpolation(f1);
            }
            f1 = b.c();
            f1 = (f3 - f1) / (o1.c() - f1);
            return f.a(f1, b.b(), o1.b());
        }
        if (f1 >= 1.0F)
        {
            o o2 = (o)e.get(a - 2);
            Interpolator interpolator1 = c.d();
            float f4 = f1;
            if (interpolator1 != null)
            {
                f4 = interpolator1.getInterpolation(f1);
            }
            f1 = o2.c();
            f1 = (f4 - f1) / (c.c() - f1);
            return f.a(f1, o2.b(), c.b());
        }
        o o3 = b;
        for (int i = 1; i < a;)
        {
            o o4 = (o)e.get(i);
            if (f1 < o4.c())
            {
                Interpolator interpolator2 = o4.d();
                float f5 = f1;
                if (interpolator2 != null)
                {
                    f5 = interpolator2.getInterpolation(f1);
                }
                f1 = o3.c();
                f1 = (f5 - f1) / (o4.c() - f1);
                return f.a(f1, o3.b(), o4.b());
            }
            i++;
            o3 = o4;
        }

        return c.b();
    }

    public void a(am am1)
    {
        f = am1;
    }

    public r b()
    {
        ArrayList arraylist = e;
        int j = e.size();
        o ao[] = new o[j];
        for (int i = 0; i < j; i++)
        {
            ao[i] = ((o)arraylist.get(i)).e();
        }

        return new r(ao);
    }

    public Object clone()
    {
        return b();
    }

    public String toString()
    {
        String s = " ";
        for (int i = 0; i < a; i++)
        {
            s = (new StringBuilder()).append(s).append(((o)e.get(i)).b()).append("  ").toString();
        }

        return s;
    }
}
