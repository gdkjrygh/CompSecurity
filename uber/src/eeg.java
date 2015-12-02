// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.PointF;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public final class eeg
    implements eej
{

    static final int a = ViewConfiguration.getDoubleTapTimeout();
    private double b;
    private float c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private float j;
    private float k;
    private Float l;
    private eek m;
    private Long n;
    private VelocityTracker o;
    private final SparseArray p = new SparseArray();

    public eeg(Context context)
    {
        context = ViewConfiguration.get(context);
        d = 10000;
        c = 100F;
        b = Math.pow(context.getScaledTouchSlop(), 2D);
        e = context.getScaledMinimumFlingVelocity();
        f = context.getScaledMaximumFlingVelocity();
    }

    private VelocityTracker a()
    {
        if (o == null)
        {
            o = VelocityTracker.obtain();
        }
        return o;
    }

    private boolean a(MotionEvent motionevent, MotionEvent motionevent1, MotionEvent motionevent2)
    {
        if (motionevent != null && motionevent1 != null && motionevent2 != null && g && motionevent2.getEventTime() - motionevent1.getEventTime() <= (long)a)
        {
            int i1 = (int)motionevent.getX() - (int)motionevent2.getX();
            int j1 = (int)motionevent.getY() - (int)motionevent2.getY();
            if (i1 * i1 + j1 * j1 < d)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(eek eek1)
    {
        return eek1 == eek.d || eek1 == eek.g || eek1 == eek.f;
    }

    private static PointF b(MotionEvent motionevent)
    {
        float f2 = 0.0F;
        float f1;
        int i1;
        int j1;
        int k1;
        int l1;
        if ((motionevent.getAction() & 0xff) == 6)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            i1 = motionevent.getActionIndex();
        } else
        {
            i1 = -1;
        }
        l1 = motionevent.getPointerCount();
        if (j1 != 0)
        {
            j1 = l1 - 1;
        } else
        {
            j1 = l1;
        }
        k1 = 0;
        f1 = 0.0F;
        while (k1 < l1) 
        {
            float f4 = f1;
            float f3 = f2;
            if (i1 != k1)
            {
                f3 = f2 + motionevent.getX(k1);
                f4 = f1 + motionevent.getY(k1);
            }
            k1++;
            f1 = f4;
            f2 = f3;
        }
        return new PointF(f2 / (float)j1, f1 / (float)j1);
    }

    private boolean b()
    {
        return n != null;
    }

    private void c()
    {
        i = false;
        n = null;
    }

    private void d()
    {
        j = 0.0F;
        k = 0.0F;
        i = false;
        if (o != null)
        {
            o.recycle();
            o = null;
        }
    }

    public final eek a(MotionEvent motionevent)
    {
        Object obj;
        eek eek1;
        MotionEvent motionevent1;
        int i1;
        motionevent1 = MotionEvent.obtain(motionevent);
        o = a();
        o.addMovement(motionevent);
        eek1 = eek.b;
        i1 = motionevent.getActionMasked();
        obj = eek1;
        i1;
        JVM INSTR tableswitch 0 6: default 80
    //                   0 125
    //                   1 492
    //                   2 266
    //                   3 769
    //                   4 84
    //                   5 193
    //                   6 232;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        obj = eek1;
_L13:
        motionevent = (MotionEvent)p.get(i1);
        if (motionevent != null)
        {
            motionevent.recycle();
        }
        p.put(i1, motionevent1);
        m = ((eek) (obj));
        return ((eek) (obj));
_L2:
        boolean flag = a((MotionEvent)p.get(0), (MotionEvent)p.get(1), motionevent);
        if (b() && flag)
        {
            i = true;
            n = null;
        }
        h = true;
        g = true;
        obj = eek1;
        continue; /* Loop/switch isn't completed */
_L7:
        j = dud.a(motionevent.getX(0), motionevent.getY(0), motionevent.getX(1), motionevent.getY(1));
        obj = eek.j;
        c();
        continue; /* Loop/switch isn't completed */
_L8:
        k = dud.a(motionevent.getX(0), motionevent.getY(0), motionevent.getX(1), motionevent.getY(1));
        obj = eek1;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = b((MotionEvent)p.get(0));
        PointF pointf = b(motionevent);
        int j1 = (int)(pointf.x - ((PointF) (obj)).x);
        int l1 = (int)(pointf.y - ((PointF) (obj)).y);
        j1 = l1 * l1 + j1 * j1;
        if (!i && h)
        {
            if ((double)j1 > b)
            {
                h = false;
                n = null;
            }
            if (j1 > d)
            {
                g = false;
            }
        }
        if (motionevent.getPointerCount() > 1)
        {
            obj = eek.h;
        } else
        {
            obj = eek1;
            if (i)
            {
                obj = eek1;
                if ((float)j1 > c)
                {
                    float f1 = motionevent.getY();
                    float f2;
                    MotionEvent motionevent2;
                    MotionEvent motionevent3;
                    int k1;
                    if (l != null)
                    {
                        if (f1 > l.floatValue() + 1.0F)
                        {
                            motionevent = eek.g;
                        } else
                        if (f1 < l.floatValue() - 1.0F)
                        {
                            motionevent = eek.d;
                        } else
                        {
                            motionevent = eek.f;
                        }
                    } else
                    {
                        motionevent = eek1;
                    }
                    l = Float.valueOf(f1);
                    obj = motionevent;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj = (MotionEvent)p.get(5);
        motionevent3 = (MotionEvent)p.get(6);
        motionevent2 = (MotionEvent)p.get(0);
        if (obj == null || motionevent3 == null) goto _L10; else goto _L9
_L9:
        if (Math.abs(k - j) < 10F)
        {
            motionevent = eek.l;
        } else
        {
            motionevent = eek.i;
        }
        p.clear();
        obj = motionevent;
_L11:
        d();
        continue; /* Loop/switch isn't completed */
_L10:
        if (i)
        {
            if (a(m))
            {
                motionevent = eek.e;
            } else
            {
                motionevent = eek.c;
            }
            c();
            p.clear();
            obj = motionevent;
        } else
        {
            obj = eek1;
            if (motionevent2 != null)
            {
                obj = eek1;
                if (motionevent.getEventTime() - motionevent2.getEventTime() <= 200L)
                {
                    obj = eek1;
                    if (h)
                    {
                        obj = o;
                        k1 = motionevent.getPointerId(0);
                        ((VelocityTracker) (obj)).computeCurrentVelocity(1000, f);
                        f1 = ((VelocityTracker) (obj)).getYVelocity(k1);
                        f2 = ((VelocityTracker) (obj)).getXVelocity(k1);
                        obj = eek1;
                        if (Math.abs(f1) <= (float)e)
                        {
                            obj = eek1;
                            if (Math.abs(f2) <= (float)e)
                            {
                                obj = eek.k;
                                n = Long.valueOf(motionevent.getEventTime());
                            }
                        }
                    }
                }
            }
        }
        if (true) goto _L11; else goto _L5
_L5:
        p.clear();
        d();
        obj = eek1;
        if (true) goto _L13; else goto _L12
_L12:
    }

}
