// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

// Referenced classes of package android.support.v7.widget:
//            ah, ai, ab, af

public abstract class ag
    implements android.view.View.OnTouchListener
{

    private final float a;
    private final int b = ViewConfiguration.getTapTimeout();
    private final int c;
    private final View d;
    private Runnable e;
    private Runnable f;
    private boolean g;
    private boolean h;
    private int i;
    private final int j[] = new int[2];

    public ag(View view)
    {
        d = view;
        a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        c = (b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    static View a(ag ag1)
    {
        return ag1.d;
    }

    private boolean a(MotionEvent motionevent)
    {
        View view = d;
        if (view.isEnabled()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (MotionEventCompat.getActionMasked(motionevent))
        {
        default:
            return false;

        case 0: // '\0'
            i = motionevent.getPointerId(0);
            h = false;
            if (e == null)
            {
                e = new ah(this, null);
            }
            view.postDelayed(e, b);
            if (f == null)
            {
                f = new ai(this, null);
            }
            view.postDelayed(f, c);
            return false;

        case 2: // '\002'
            int k = motionevent.findPointerIndex(i);
            if (k >= 0 && !a(view, motionevent.getX(k), motionevent.getY(k), a))
            {
                d();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            d();
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static boolean a(View view, float f1, float f2, float f3)
    {
        return f1 >= -f3 && f2 >= -f3 && f1 < (float)(view.getRight() - view.getLeft()) + f3 && f2 < (float)(view.getBottom() - view.getTop()) + f3;
    }

    private boolean a(View view, MotionEvent motionevent)
    {
        int ai1[] = j;
        view.getLocationOnScreen(ai1);
        motionevent.offsetLocation(-ai1[0], -ai1[1]);
        return true;
    }

    static void b(ag ag1)
    {
        ag1.e();
    }

    private boolean b(MotionEvent motionevent)
    {
        boolean flag = true;
        View view = d;
        Object obj = a();
        if (obj != null && ((ab) (obj)).b())
        {
            if ((obj = ab.a(((ab) (obj)))) != null && ((af) (obj)).isShown())
            {
                MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
                b(view, motionevent1);
                a(((View) (obj)), motionevent1);
                boolean flag1 = ((af) (obj)).a(motionevent1, i);
                motionevent1.recycle();
                int k = MotionEventCompat.getActionMasked(motionevent);
                if (k != 1 && k != 3)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (!flag1 || !k)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    private boolean b(View view, MotionEvent motionevent)
    {
        int ai1[] = j;
        view.getLocationOnScreen(ai1);
        motionevent.offsetLocation(ai1[0], ai1[1]);
        return true;
    }

    private void d()
    {
        if (f != null)
        {
            d.removeCallbacks(f);
        }
        if (e != null)
        {
            d.removeCallbacks(e);
        }
    }

    private void e()
    {
        d();
        View view;
        for (view = d; !view.isEnabled() || view.isLongClickable() || !b();)
        {
            return;
        }

        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        view.onTouchEvent(motionevent);
        motionevent.recycle();
        g = true;
        h = true;
    }

    public abstract ab a();

    protected boolean b()
    {
        ab ab1 = a();
        if (ab1 != null && !ab1.b())
        {
            ab1.c();
        }
        return true;
    }

    protected boolean c()
    {
        ab ab1 = a();
        if (ab1 != null && ab1.b())
        {
            ab1.a();
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = g;
        if (!flag2) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (h)
        {
            flag = b(motionevent);
        } else
        if (b(motionevent) || !c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
label0:
        {
            g = flag;
            if (!flag)
            {
                flag = flag1;
                if (!flag2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
_L2:
        if (a(motionevent) && b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            long l = SystemClock.uptimeMillis();
            view = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            d.onTouchEvent(view);
            view.recycle();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
