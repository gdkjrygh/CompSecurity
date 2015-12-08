// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            r, p, o, am

class l extends r
{

    private float g;
    private float h;
    private float i;
    private boolean j;

    public transient l(p ap[])
    {
        super(ap);
        j = true;
    }

    public l a()
    {
        ArrayList arraylist = e;
        int i1 = e.size();
        p ap[] = new p[i1];
        for (int k = 0; k < i1; k++)
        {
            ap[k] = (p)((o)arraylist.get(k)).e();
        }

        return new l(ap);
    }

    public Object a(float f)
    {
        return Float.valueOf(b(f));
    }

    public float b(float f)
    {
        int k = 1;
        if (a == 2)
        {
            if (j)
            {
                j = false;
                g = ((p)e.get(0)).f();
                h = ((p)e.get(1)).f();
                i = h - g;
            }
            float f1 = f;
            if (d != null)
            {
                f1 = d.getInterpolation(f);
            }
            if (this.f == null)
            {
                return g + i * f1;
            } else
            {
                return ((Number)this.f.a(f1, Float.valueOf(g), Float.valueOf(h))).floatValue();
            }
        }
        if (f <= 0.0F)
        {
            Object obj = (p)e.get(0);
            p p2 = (p)e.get(1);
            float f5 = ((p) (obj)).f();
            float f8 = p2.f();
            float f10 = ((p) (obj)).c();
            float f12 = p2.c();
            obj = p2.d();
            float f2 = f;
            if (obj != null)
            {
                f2 = ((Interpolator) (obj)).getInterpolation(f);
            }
            f = (f2 - f10) / (f12 - f10);
            if (this.f == null)
            {
                return f * (f8 - f5) + f5;
            } else
            {
                return ((Number)this.f.a(f, Float.valueOf(f5), Float.valueOf(f8))).floatValue();
            }
        }
        if (f >= 1.0F)
        {
            Object obj1 = (p)e.get(a - 2);
            p p3 = (p)e.get(a - 1);
            float f6 = ((p) (obj1)).f();
            float f9 = p3.f();
            float f11 = ((p) (obj1)).c();
            float f13 = p3.c();
            obj1 = p3.d();
            float f3 = f;
            if (obj1 != null)
            {
                f3 = ((Interpolator) (obj1)).getInterpolation(f);
            }
            f = (f3 - f11) / (f13 - f11);
            if (this.f == null)
            {
                return f * (f9 - f6) + f6;
            } else
            {
                return ((Number)this.f.a(f, Float.valueOf(f6), Float.valueOf(f9))).floatValue();
            }
        }
        p p4;
        for (p p1 = (p)e.get(0); k < a; p1 = p4)
        {
            p4 = (p)e.get(k);
            if (f < p4.c())
            {
                Interpolator interpolator = p4.d();
                float f4 = f;
                if (interpolator != null)
                {
                    f4 = interpolator.getInterpolation(f);
                }
                f = (f4 - p1.c()) / (p4.c() - p1.c());
                f4 = p1.f();
                float f7 = p4.f();
                if (this.f == null)
                {
                    return (f7 - f4) * f + f4;
                } else
                {
                    return ((Number)this.f.a(f, Float.valueOf(f4), Float.valueOf(f7))).floatValue();
                }
            }
            k++;
        }

        return ((Number)((o)e.get(a - 1)).b()).floatValue();
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
