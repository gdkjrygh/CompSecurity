// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview.a;

import android.content.Context;
import android.util.FloatMath;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

// Referenced classes of package uk.co.senab.photoview.a:
//            e, f

public class a
    implements e
{

    protected f a;
    float b;
    float c;
    final float d;
    final float e;
    private VelocityTracker f;
    private boolean g;

    public a(Context context)
    {
        context = ViewConfiguration.get(context);
        e = context.getScaledMinimumFlingVelocity();
        d = context.getScaledTouchSlop();
    }

    float a(MotionEvent motionevent)
    {
        return motionevent.getX();
    }

    public void a(f f1)
    {
        a = f1;
    }

    public boolean a()
    {
        return false;
    }

    float b(MotionEvent motionevent)
    {
        return motionevent.getY();
    }

    public boolean c(MotionEvent motionevent)
    {
        boolean flag = false;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 230
    //                   2 96
    //                   3 209;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L2:
        f = VelocityTracker.obtain();
        if (f != null)
        {
            f.addMovement(motionevent);
        } else
        {
            Log.i("CupcakeGestureDetector", "Velocity tracker is null");
        }
        b = a(motionevent);
        c = b(motionevent);
        g = false;
        return true;
_L4:
        float f1 = a(motionevent);
        float f3 = b(motionevent);
        float f5 = f1 - b;
        float f6 = f3 - c;
        if (!g)
        {
            if (FloatMath.sqrt(f5 * f5 + f6 * f6) >= d)
            {
                flag = true;
            }
            g = flag;
        }
        if (g)
        {
            a.a(f5, f6);
            b = f1;
            c = f3;
            if (f != null)
            {
                f.addMovement(motionevent);
                return true;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (f != null)
        {
            f.recycle();
            f = null;
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (g && f != null)
        {
            b = a(motionevent);
            c = b(motionevent);
            f.addMovement(motionevent);
            f.computeCurrentVelocity(1000);
            float f2 = f.getXVelocity();
            float f4 = f.getYVelocity();
            if (Math.max(Math.abs(f2), Math.abs(f4)) >= e)
            {
                a.a(b, c, -f2, -f4);
            }
        }
        if (f != null)
        {
            f.recycle();
            f = null;
            return true;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }
}
