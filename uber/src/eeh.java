// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public abstract class eeh extends RelativeLayout
{

    private eej a;
    private Point b;

    eeh(Context context)
    {
        this(context, null, 0);
    }

    eeh(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public eeh(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = new eei();
    }

    private MotionEvent a(MotionEvent motionevent)
    {
        float f1 = 0.0F;
        int j = 0;
        int k = motionevent.getPointerCount();
        float f2 = 0.0F;
        for (; j < k; j++)
        {
            f2 += motionevent.getX(j);
            f1 += motionevent.getY(j);
        }

        f2 /= k;
        f1 /= k;
        if (b != null)
        {
            motionevent.offsetLocation((float)b.x - f2, (float)b.y - f1);
        }
        return motionevent;
    }

    private static boolean a(eek eek1)
    {
        return eek1 == eek.c || eek1 == eek.j || eek1 == eek.h || eek1 == eek.d || eek1 == eek.g || eek1 == eek.f || eek1 == eek.k;
    }

    private boolean b(eek eek1)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[eek.values().length];
                try
                {
                    a[eek.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[eek.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[eek.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[eek.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[eek.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[eek.g.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[eek.h.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[eek.i.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[eek.j.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[eek.l.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[eek1.ordinal()])
        {
        case 2: // '\002'
        case 7: // '\007'
        default:
            return false;

        case 1: // '\001'
            return e();

        case 3: // '\003'
            return f();

        case 4: // '\004'
            return i();

        case 5: // '\005'
            return h();

        case 6: // '\006'
            return g();

        case 8: // '\b'
            return d();

        case 9: // '\t'
            return b();

        case 10: // '\n'
            return c();
        }
    }

    public void a(Point point)
    {
        b = point;
    }

    public void a(eej eej1)
    {
        a = eej1;
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(int j, Point point)
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag2 = a(motionevent.getActionMasked(), new Point((int)motionevent.getX(), (int)motionevent.getY()));
            boolean flag = flag2;
            MotionEvent motionevent1 = motionevent;
            if (a())
            {
                eek eek1 = a.a(motionevent);
                motionevent1 = motionevent;
                if (a(eek1))
                {
                    motionevent1 = a(motionevent);
                }
                if (b(eek1) || flag2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            if (!flag)
            {
                flag = flag1;
                if (!super.dispatchTouchEvent(motionevent1))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public boolean e()
    {
        return false;
    }

    public boolean f()
    {
        return false;
    }

    public boolean g()
    {
        return false;
    }

    public boolean h()
    {
        return false;
    }

    public boolean i()
    {
        return false;
    }
}
