// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public final class eei
    implements eej
{

    private float a;
    private float b;
    private Long c;
    private final SparseArray d = new SparseArray();

    public eei()
    {
    }

    private void a()
    {
        c = (Long)d.get(1);
        d.clear();
        a = 0.0F;
        b = 0.0F;
    }

    public final eek a(MotionEvent motionevent)
    {
        eek eek1;
        int j;
        long l;
        long l1;
        int i = motionevent.getActionMasked();
        j = motionevent.getPointerCount();
        d.put(i, Long.valueOf(motionevent.getEventTime()));
        if (c != null)
        {
            l = c.longValue();
        } else
        {
            l = 0L;
        }
        l1 = ViewConfiguration.getDoubleTapTimeout();
        eek1 = eek.b;
        i;
        JVM INSTR tableswitch 1 6: default 92
    //                   1 170
    //                   2 131
    //                   3 264
    //                   4 92
    //                   5 100
    //                   6 141;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6
_L1:
        return eek1;
_L5:
        a = dud.a(motionevent.getX(0), motionevent.getY(0), motionevent.getX(1), motionevent.getY(1));
        return eek.j;
_L3:
        if (j > 1)
        {
            return eek.h;
        }
          goto _L1
_L6:
        b = dud.a(motionevent.getX(0), motionevent.getY(0), motionevent.getX(1), motionevent.getY(1));
        return eek1;
_L2:
        motionevent = (Long)d.get(0);
        if (d.get(5) != null && d.get(6) != null)
        {
            if (Math.abs(b - a) < 10F)
            {
                motionevent = eek.l;
            } else
            {
                motionevent = eek.i;
            }
        } else
        if (motionevent != null && motionevent.longValue() - l <= l1)
        {
            motionevent = eek.c;
        } else
        {
            motionevent = eek1;
        }
        a();
        return motionevent;
_L4:
        a();
        return eek1;
    }
}
