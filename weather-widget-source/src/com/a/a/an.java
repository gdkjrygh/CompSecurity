// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.a.a:
//            a, ao, ap, aq, 
//            ar, as, m, k, 
//            b, at, ai, au, 
//            am

public class an extends a
{

    private static ThreadLocal h = new ThreadLocal();
    private static final ThreadLocal i = new ao();
    private static final ThreadLocal j = new ap();
    private static final ThreadLocal k = new aq();
    private static final ThreadLocal l = new ar();
    private static final ThreadLocal m = new as();
    private static final Interpolator n = new AccelerateDecelerateInterpolator();
    private static final am o = new m();
    private static final am p = new k();
    private static long z = 10L;
    private int A;
    private int B;
    private Interpolator C;
    private ArrayList D;
    long b;
    long c;
    int d;
    boolean e;
    ai f[];
    HashMap g;
    private boolean q;
    private int r;
    private float s;
    private boolean t;
    private long u;
    private boolean v;
    private boolean w;
    private long x;
    private long y;

    public an()
    {
        c = -1L;
        q = false;
        r = 0;
        s = 0.0F;
        t = false;
        d = 0;
        v = false;
        w = false;
        e = false;
        x = 300L;
        y = 0L;
        A = 0;
        B = 1;
        C = n;
        D = null;
    }

    static long a(an an1)
    {
        return an1.y;
    }

    private void a(boolean flag)
    {
        if (Looper.myLooper() == null)
        {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        q = flag;
        r = 0;
        d = 0;
        w = true;
        t = false;
        ((ArrayList)j.get()).add(this);
        if (y == 0L)
        {
            d(k());
            d = 0;
            v = true;
            if (a != null)
            {
                ArrayList arraylist = (ArrayList)a.clone();
                int j1 = arraylist.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    ((b)arraylist.get(i1)).a(this);
                }

            }
        }
        at at2 = (at)h.get();
        at at1 = at2;
        if (at2 == null)
        {
            at1 = new at(null);
            h.set(at1);
        }
        at1.sendEmptyMessage(0);
    }

    static boolean a(an an1, long l1)
    {
        return an1.b(l1);
    }

    static boolean a(an an1, boolean flag)
    {
        an1.v = flag;
        return flag;
    }

    public static transient an b(float af[])
    {
        an an1 = new an();
        an1.a(af);
        return an1;
    }

    public static transient an b(int ai1[])
    {
        an an1 = new an();
        an1.a(ai1);
        return an1;
    }

    static void b(an an1)
    {
        an1.t();
    }

    private boolean b(long l1)
    {
        if (!t)
        {
            t = true;
            u = l1;
        } else
        {
            long l2 = l1 - u;
            if (l2 > y)
            {
                b = l1 - (l2 - y);
                d = 1;
                return true;
            }
        }
        return false;
    }

    static void c(an an1)
    {
        an1.i();
    }

    private void i()
    {
        ((ArrayList)i.get()).remove(this);
        ((ArrayList)j.get()).remove(this);
        ((ArrayList)k.get()).remove(this);
        d = 0;
        if (v && a != null)
        {
            ArrayList arraylist = (ArrayList)a.clone();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((b)arraylist.get(i1)).c(this);
            }

        }
        v = false;
        w = false;
    }

    static ThreadLocal n()
    {
        return i;
    }

    static ThreadLocal o()
    {
        return k;
    }

    static ThreadLocal p()
    {
        return j;
    }

    static ThreadLocal q()
    {
        return m;
    }

    static ThreadLocal r()
    {
        return l;
    }

    static long s()
    {
        return z;
    }

    private void t()
    {
        h();
        ((ArrayList)i.get()).add(this);
        if (y > 0L && a != null)
        {
            ArrayList arraylist = (ArrayList)a.clone();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((b)arraylist.get(i1)).a(this);
            }

        }
    }

    public a a(long l1)
    {
        return c(l1);
    }

    public void a()
    {
        a(false);
    }

    void a(float f1)
    {
        f1 = C.getInterpolation(f1);
        s = f1;
        int k1 = f.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            f[i1].a(f1);
        }

        if (D != null)
        {
            int l1 = D.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                ((au)D.get(j1)).a(this);
            }

        }
    }

    public void a(int i1)
    {
        A = i1;
    }

    public void a(Interpolator interpolator)
    {
        if (interpolator != null)
        {
            C = interpolator;
            return;
        } else
        {
            C = new LinearInterpolator();
            return;
        }
    }

    public void a(au au1)
    {
        if (D == null)
        {
            D = new ArrayList();
        }
        D.add(au1);
    }

    public transient void a(float af[])
    {
        if (af == null || af.length == 0)
        {
            return;
        }
        if (f == null || f.length == 0)
        {
            a(new ai[] {
                ai.a("", af)
            });
        } else
        {
            f[0].a(af);
        }
        e = false;
    }

    public transient void a(int ai1[])
    {
        if (ai1 == null || ai1.length == 0)
        {
            return;
        }
        if (f == null || f.length == 0)
        {
            a(new ai[] {
                ai.a("", ai1)
            });
        } else
        {
            f[0].a(ai1);
        }
        e = false;
    }

    public transient void a(ai aai[])
    {
        int j1 = aai.length;
        f = aai;
        g = new HashMap(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            ai ai1 = aai[i1];
            g.put(ai1.c(), ai1);
        }

        e = false;
    }

    public void b()
    {
        if (d != 0 || ((ArrayList)j.get()).contains(this) || ((ArrayList)k.get()).contains(this))
        {
            if (v && a != null)
            {
                for (Iterator iterator = ((ArrayList)a.clone()).iterator(); iterator.hasNext(); ((b)iterator.next()).d(this)) { }
            }
            i();
        }
    }

    public void b(int i1)
    {
        B = i1;
    }

    public an c(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Animators cannot have negative duration: ").append(l1).toString());
        } else
        {
            x = l1;
            return this;
        }
    }

    public void c()
    {
        if (!((ArrayList)i.get()).contains(this) && !((ArrayList)j.get()).contains(this))
        {
            t = false;
            t();
        } else
        if (!e)
        {
            h();
        }
        if (A > 0 && (A & 1) == 1)
        {
            a(0.0F);
        } else
        {
            a(1.0F);
        }
        i();
    }

    public Object clone()
    {
        return j();
    }

    public void d(long l1)
    {
        h();
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        if (d != 1)
        {
            c = l1;
            d = 2;
        }
        b = l2 - l1;
        f(l2);
    }

    public boolean d()
    {
        return d == 1 || v;
    }

    public void e(long l1)
    {
        y = l1;
    }

    public boolean e()
    {
        return w;
    }

    boolean f(long l1)
    {
        boolean flag1 = false;
        if (d == 0)
        {
            d = 1;
            if (c < 0L)
            {
                b = l1;
            } else
            {
                b = l1 - c;
                c = -1L;
            }
        }
        switch (d)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        float f1;
        if (x > 0L)
        {
            f1 = (float)(l1 - b) / (float)x;
        } else
        {
            f1 = 1.0F;
        }
        boolean flag;
        if (f1 >= 1.0F)
        {
            if (r < A || A == -1)
            {
                if (a != null)
                {
                    int j1 = a.size();
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        ((b)a.get(i1)).b(this);
                    }

                }
                if (B == 2)
                {
                    float f2;
                    if (q)
                    {
                        flag = false;
                    } else
                    {
                        flag = true;
                    }
                    q = flag;
                }
                r = r + (int)f1;
                f1 %= 1.0F;
                b = b + x;
                flag = flag1;
            } else
            {
                f1 = Math.min(f1, 1.0F);
                flag = true;
            }
        } else
        {
            flag = flag1;
        }
        f2 = f1;
        if (q)
        {
            f2 = 1.0F - f1;
        }
        a(f2);
        return flag;
    }

    public a g()
    {
        return j();
    }

    void h()
    {
        if (!e)
        {
            int j1 = f.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                f[i1].b();
            }

            e = true;
        }
    }

    public an j()
    {
        boolean flag = false;
        an an1 = (an)super.g();
        if (D != null)
        {
            ArrayList arraylist = D;
            an1.D = new ArrayList();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                an1.D.add(arraylist.get(i1));
            }

        }
        an1.c = -1L;
        an1.q = false;
        an1.r = 0;
        an1.e = false;
        an1.d = 0;
        an1.t = false;
        ai aai[] = f;
        if (aai != null)
        {
            int l1 = aai.length;
            an1.f = new ai[l1];
            an1.g = new HashMap(l1);
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                ai ai1 = aai[j1].a();
                an1.f[j1] = ai1;
                an1.g.put(ai1.c(), ai1);
            }

        }
        return an1;
    }

    public long k()
    {
        if (!e || d == 0)
        {
            return 0L;
        } else
        {
            return AnimationUtils.currentAnimationTimeMillis() - b;
        }
    }

    public Object l()
    {
        if (f != null && f.length > 0)
        {
            return f[0].d();
        } else
        {
            return null;
        }
    }

    public float m()
    {
        return s;
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("ValueAnimator@").append(Integer.toHexString(hashCode())).toString();
        String s2 = s1;
        if (f != null)
        {
            int i1 = 0;
            do
            {
                s2 = s1;
                if (i1 >= f.length)
                {
                    break;
                }
                s1 = (new StringBuilder()).append(s1).append("\n    ").append(f[i1].toString()).toString();
                i1++;
            } while (true);
        }
        return s2;
    }

}
