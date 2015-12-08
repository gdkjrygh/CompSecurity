// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.View;
import com.a.b.c;
import com.a.c.a.a;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.a.a:
//            an, t, ai, a

public final class s extends an
{

    private static final Map h;
    private Object i;
    private String j;
    private c k;

    public s()
    {
    }

    private s(Object obj, String s1)
    {
        i = obj;
        a(s1);
    }

    public static transient s a(Object obj, String s1, float af[])
    {
        obj = new s(obj, s1);
        ((s) (obj)).a(af);
        return ((s) (obj));
    }

    public static transient s a(Object obj, String s1, int ai1[])
    {
        obj = new s(obj, s1);
        ((s) (obj)).a(ai1);
        return ((s) (obj));
    }

    public com.a.a.a a(long l)
    {
        return b(l);
    }

    public void a()
    {
        super.a();
    }

    void a(float f)
    {
        super.a(f);
        int i1 = this.f.length;
        for (int l = 0; l < i1; l++)
        {
            this.f[l].b(i);
        }

    }

    public void a(c c1)
    {
        if (f != null)
        {
            ai ai1 = f[0];
            String s1 = ai1.c();
            ai1.a(c1);
            g.remove(s1);
            g.put(j, ai1);
        }
        if (k != null)
        {
            j = c1.a();
        }
        k = c1;
        e = false;
    }

    public void a(Object obj)
    {
label0:
        {
            if (i != obj)
            {
                Object obj1 = i;
                i = obj;
                if (obj1 == null || obj == null || obj1.getClass() != obj.getClass())
                {
                    break label0;
                }
            }
            return;
        }
        e = false;
    }

    public void a(String s1)
    {
        if (f != null)
        {
            ai ai1 = f[0];
            String s2 = ai1.c();
            ai1.a(s1);
            g.remove(s2);
            g.put(s1, ai1);
        }
        j = s1;
        e = false;
    }

    public transient void a(float af[])
    {
        if (f == null || f.length == 0)
        {
            if (k != null)
            {
                a(new ai[] {
                    com.a.a.ai.a(k, af)
                });
                return;
            } else
            {
                a(new ai[] {
                    com.a.a.ai.a(j, af)
                });
                return;
            }
        } else
        {
            super.a(af);
            return;
        }
    }

    public transient void a(int ai1[])
    {
        if (f == null || f.length == 0)
        {
            if (k != null)
            {
                a(new ai[] {
                    com.a.a.ai.a(k, ai1)
                });
                return;
            } else
            {
                a(new ai[] {
                    com.a.a.ai.a(j, ai1)
                });
                return;
            }
        } else
        {
            super.a(ai1);
            return;
        }
    }

    public s b(long l)
    {
        super.c(l);
        return this;
    }

    public an c(long l)
    {
        return b(l);
    }

    public Object clone()
    {
        return i();
    }

    public com.a.a.a g()
    {
        return i();
    }

    void h()
    {
        if (!e)
        {
            if (k == null && a.a && (i instanceof View) && h.containsKey(j))
            {
                a((c)h.get(j));
            }
            int i1 = f.length;
            for (int l = 0; l < i1; l++)
            {
                f[l].a(i);
            }

            super.h();
        }
    }

    public s i()
    {
        return (s)super.j();
    }

    public an j()
    {
        return i();
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("ObjectAnimator@").append(Integer.toHexString(hashCode())).append(", target ").append(i).toString();
        String s2 = s1;
        if (f != null)
        {
            int l = 0;
            do
            {
                s2 = s1;
                if (l >= f.length)
                {
                    break;
                }
                s1 = (new StringBuilder()).append(s1).append("\n    ").append(f[l].toString()).toString();
                l++;
            } while (true);
        }
        return s2;
    }

    static 
    {
        h = new HashMap();
        h.put("alpha", com.a.a.t.a);
        h.put("pivotX", t.b);
        h.put("pivotY", com.a.a.t.c);
        h.put("translationX", t.d);
        h.put("translationY", t.e);
        h.put("rotation", t.f);
        h.put("rotationX", t.g);
        h.put("rotationY", t.h);
        h.put("scaleX", t.i);
        h.put("scaleY", t.j);
        h.put("scrollX", t.k);
        h.put("scrollY", t.l);
        h.put("x", t.m);
        h.put("y", t.n);
    }
}
