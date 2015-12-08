// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            r, q, o, am

class n extends r
{

    private int g;
    private int h;
    private int i;
    private boolean j;

    public transient n(q aq[])
    {
        super(aq);
        j = true;
    }

    public n a()
    {
        ArrayList arraylist = e;
        int l = e.size();
        q aq[] = new q[l];
        for (int k = 0; k < l; k++)
        {
            aq[k] = (q)((o)arraylist.get(k)).e();
        }

        return new n(aq);
    }

    public Object a(float f)
    {
        return Integer.valueOf(b(f));
    }

    public int b(float f)
    {
        int k = 1;
        if (a == 2)
        {
            if (j)
            {
                j = false;
                g = ((q)e.get(0)).f();
                h = ((q)e.get(1)).f();
                i = h - g;
            }
            float f1 = f;
            if (d != null)
            {
                f1 = d.getInterpolation(f);
            }
            if (this.f == null)
            {
                return g + (int)((float)i * f1);
            } else
            {
                return ((Number)this.f.a(f1, Integer.valueOf(g), Integer.valueOf(h))).intValue();
            }
        }
        if (f <= 0.0F)
        {
            Object obj = (q)e.get(0);
            q q2 = (q)e.get(1);
            k = ((q) (obj)).f();
            int l = q2.f();
            float f5 = ((q) (obj)).c();
            float f7 = q2.c();
            obj = q2.d();
            float f2 = f;
            if (obj != null)
            {
                f2 = ((Interpolator) (obj)).getInterpolation(f);
            }
            f = (f2 - f5) / (f7 - f5);
            if (this.f == null)
            {
                return (int)(f * (float)(l - k)) + k;
            } else
            {
                return ((Number)this.f.a(f, Integer.valueOf(k), Integer.valueOf(l))).intValue();
            }
        }
        if (f >= 1.0F)
        {
            Object obj1 = (q)e.get(a - 2);
            q q3 = (q)e.get(a - 1);
            k = ((q) (obj1)).f();
            int i1 = q3.f();
            float f6 = ((q) (obj1)).c();
            float f8 = q3.c();
            obj1 = q3.d();
            float f3 = f;
            if (obj1 != null)
            {
                f3 = ((Interpolator) (obj1)).getInterpolation(f);
            }
            f = (f3 - f6) / (f8 - f6);
            if (this.f == null)
            {
                return (int)(f * (float)(i1 - k)) + k;
            } else
            {
                return ((Number)this.f.a(f, Integer.valueOf(k), Integer.valueOf(i1))).intValue();
            }
        }
        q q4;
        for (q q1 = (q)e.get(0); k < a; q1 = q4)
        {
            q4 = (q)e.get(k);
            if (f < q4.c())
            {
                Interpolator interpolator = q4.d();
                float f4 = f;
                if (interpolator != null)
                {
                    f4 = interpolator.getInterpolation(f);
                }
                f = (f4 - q1.c()) / (q4.c() - q1.c());
                k = q1.f();
                int j1 = q4.f();
                if (this.f == null)
                {
                    return (int)((float)(j1 - k) * f) + k;
                } else
                {
                    return ((Number)this.f.a(f, Integer.valueOf(k), Integer.valueOf(j1))).intValue();
                }
            }
            k++;
        }

        return ((Number)((o)e.get(a - 1)).b()).intValue();
    }

    public r b()
    {
        return a();
    }

    public Object clone()
    {
        return a();
    }
}
