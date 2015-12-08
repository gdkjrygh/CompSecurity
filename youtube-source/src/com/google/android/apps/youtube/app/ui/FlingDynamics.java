// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bl

public class FlingDynamics
{

    protected final int a;
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected int f;
    private final int g;
    private final int h;
    private VelocityTracker i;

    public FlingDynamics(Context context)
    {
        this(context, 200);
    }

    public FlingDynamics(Context context, int j)
    {
        f = -1;
        boolean flag;
        if (j >= 200)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "snapVelocity cannot be less than 200");
        context = ViewConfiguration.get(context);
        a = context.getScaledPagingTouchSlop();
        g = context.getScaledMaximumFlingVelocity();
        h = j;
    }

    public final Fling a(MotionEvent motionevent, Orientation orientation, boolean flag)
    {
        int j;
        j = motionevent.findPointerIndex(f);
        i.computeCurrentVelocity(1000, g);
        bl.a[orientation.ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 66
    //                   2 139;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException("Cannot assess fling for ANY orientation");
_L2:
        int k;
        k = (int)(c - motionevent.getY(j));
        j = (int)i.getYVelocity(f);
_L5:
        if (i != null)
        {
            i.recycle();
            i = null;
        }
        if (Math.abs(k) <= 20 || Math.abs(j) <= h)
        {
            return Fling.NONE;
        }
        break; /* Loop/switch isn't completed */
_L3:
        k = (int)(b - motionevent.getX(j));
        j = (int)i.getXVelocity(f);
        if (true) goto _L5; else goto _L4
_L4:
        if (j > 0)
        {
            return Fling.BACK;
        } else
        {
            return Fling.FORWARD;
        }
    }

    public final void a()
    {
        f = -1;
    }

    public final void a(MotionEvent motionevent)
    {
        if (i == null)
        {
            i = VelocityTracker.obtain();
        }
        i.addMovement(motionevent);
    }

    public final boolean a(MotionEvent motionevent, Orientation orientation)
    {
        boolean flag;
        boolean flag1;
        int j;
        if (orientation == Orientation.VERTICAL || orientation == Orientation.ANY)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (orientation == Orientation.HORIZONTAL || orientation == Orientation.ANY)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = motionevent.findPointerIndex(f);
        if (j >= 0 && motionevent.getPointerCount() > j)
        {
            float f1 = motionevent.getX(j);
            float f2 = motionevent.getY(j);
            if (flag)
            {
                if ((int)Math.abs(f2 - e) > a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag |= false;
            } else
            {
                flag = false;
            }
            if (flag1)
            {
                if ((int)Math.abs(f1 - d) > a)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag = flag1 | flag;
            }
            if (flag)
            {
                d = f1;
                e = f2;
                return true;
            }
        } else
        {
            f = -1;
        }
        return false;
    }

    public final void b(MotionEvent motionevent)
    {
        d = motionevent.getX();
        e = motionevent.getY();
        b = d;
        c = e;
        f = motionevent.getPointerId(0);
    }

    public final int c(MotionEvent motionevent)
    {
        int j = motionevent.findPointerIndex(f);
        if (j < 0)
        {
            return 0;
        } else
        {
            float f1 = motionevent.getX(j);
            j = (int)(d - f1);
            d = f1;
            return j;
        }
    }

    public final int d(MotionEvent motionevent)
    {
        int j = motionevent.findPointerIndex(f);
        if (j < 0)
        {
            return 0;
        } else
        {
            float f1 = motionevent.getY(j);
            j = (int)(e - f1);
            e = f1;
            return j;
        }
    }

    public final void e(MotionEvent motionevent)
    {
        int j = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(j) == f)
        {
            if (j == 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            d = motionevent.getX(j);
            e = motionevent.getY(j);
            b = d;
            c = e;
            f = motionevent.getPointerId(j);
            if (i != null)
            {
                i.clear();
            }
        }
    }

    private class Orientation extends Enum
    {

        private static final Orientation $VALUES[];
        public static final Orientation ANY;
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;

        public static Orientation valueOf(String s)
        {
            return (Orientation)Enum.valueOf(com/google/android/apps/youtube/app/ui/FlingDynamics$Orientation, s);
        }

        public static Orientation[] values()
        {
            return (Orientation[])$VALUES.clone();
        }

        static 
        {
            HORIZONTAL = new Orientation("HORIZONTAL", 0);
            VERTICAL = new Orientation("VERTICAL", 1);
            ANY = new Orientation("ANY", 2);
            $VALUES = (new Orientation[] {
                HORIZONTAL, VERTICAL, ANY
            });
        }

        private Orientation(String s, int j)
        {
            super(s, j);
        }
    }


    private class Fling extends Enum
    {

        private static final Fling $VALUES[];
        public static final Fling BACK;
        public static final Fling FORWARD;
        public static final Fling NONE;

        public static Fling valueOf(String s)
        {
            return (Fling)Enum.valueOf(com/google/android/apps/youtube/app/ui/FlingDynamics$Fling, s);
        }

        public static Fling[] values()
        {
            return (Fling[])$VALUES.clone();
        }

        static 
        {
            BACK = new Fling("BACK", 0);
            FORWARD = new Fling("FORWARD", 1);
            NONE = new Fling("NONE", 2);
            $VALUES = (new Fling[] {
                BACK, FORWARD, NONE
            });
        }

        private Fling(String s, int j)
        {
            super(s, j);
        }
    }

}
