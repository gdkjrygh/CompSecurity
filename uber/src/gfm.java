// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public class gfm
    implements gfi
{

    protected final View c;
    public gfj d;
    public gfk e;
    protected gfi f;
    protected gfi g;
    protected gfp h;
    protected boolean i;

    public gfm(View view)
    {
        i = true;
        c = view;
    }

    protected static android.view.ViewGroup.MarginLayoutParams a(View view)
    {
        return (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
    }

    private static boolean a(gfi gfi1)
    {
        return gfi1.a() > 0;
    }

    private void c()
    {
        if (!i)
        {
            b(false);
        } else
        {
            float f1 = e.c();
            int j1 = e.d();
            boolean flag = j();
            boolean flag1 = g();
            int i1;
            if (flag1 || !flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            c.setVisibility(0);
            if (i1 != 0)
            {
                c.offsetTopAndBottom(-j1);
            }
            if (flag)
            {
                a(f1);
            } else
            {
                a(1.0F);
            }
            if (flag1)
            {
                i1 = (int)((float)(-l()) * (1.0F - f1));
                h().topMargin = i1;
                return;
            }
        }
    }

    private int l()
    {
        gfi gfi1 = g;
        int i1 = 0;
        do
        {
            if (gfi1 == null || a(gfi1))
            {
                return i1;
            }
            int j1 = gfi1.b();
            gfi1 = gfi1.d();
            i1 = j1 + i1;
        } while (true);
    }

    public int a()
    {
        return 0;
    }

    protected void a(float f1)
    {
    }

    public final void a(gfi gfi1, gfi gfi2)
    {
        g = gfi1;
        f = gfi2;
    }

    public void a(gfj gfj1)
    {
        boolean flag;
        if (d == null || gfj1 == null || d.g() != gfj1.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = gfj1;
        if (flag)
        {
            a(e);
        }
    }

    public void a(gfk gfk1)
    {
        if (gfk1 == null)
        {
            return;
        }
        e = gfk1;
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[gdq.values().length];
                try
                {
                    a[gdq.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[gdq.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[gdq.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[gfk1.b().ordinal()])
        {
        default:
            throw new IllegalStateException((new StringBuilder("Unconfigured state: ")).append(gfk1.b()).toString());

        case 1: // '\001'
            b(true);
            return;

        case 2: // '\002'
            b(g());
            return;

        case 3: // '\003'
            c();
            break;
        }
    }

    public final void a(gfp gfp1)
    {
        h = gfp1;
    }

    public final void a(boolean flag)
    {
        if (i != flag)
        {
            i = flag;
            a(e);
            if (h != null)
            {
                h.a(false);
                return;
            }
        }
    }

    public int b()
    {
        int i1;
        if (!i)
        {
            i1 = 0;
        } else
        {
            int j1 = c.getLayoutParams().height;
            i1 = j1;
            if (j1 <= 0)
            {
                throw new IllegalStateException("Must set exact height or override this method");
            }
        }
        return i1;
    }

    protected final void b(boolean flag)
    {
        View view = c;
        float f1;
        int i1;
        if (i && flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        h().topMargin = 0;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        a(f1);
        c.offsetTopAndBottom(0);
    }

    public final gfi d()
    {
        return g;
    }

    public final gfi e()
    {
        return f;
    }

    public final boolean f()
    {
        return i;
    }

    protected final boolean g()
    {
        return a(this);
    }

    protected final android.view.ViewGroup.MarginLayoutParams h()
    {
        return a(c);
    }

    public final void i()
    {
        a(e);
    }

    protected final boolean j()
    {
        if (!g())
        {
            gfi gfi1 = f;
            while (gfi1 != null) 
            {
                if (a(gfi1))
                {
                    return true;
                }
                gfi1 = gfi1.e();
            }
        }
        return false;
    }

    public final gfp k()
    {
        return h;
    }
}
