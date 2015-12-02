// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;

// Referenced classes of package com.whatsapp:
//            ade, App, iv, ow

public class PhotoViewPager extends ViewPager
{

    private int b;
    private iv c;
    private float d;
    private float e;
    private float f;

    public PhotoViewPager(Context context)
    {
        super(context);
        a();
    }

    public PhotoViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a();
    }

    private void a()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                setPageTransformer(true, new ade(this));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            setPageMargin((int)(12F * getContext().getResources().getDisplayMetrics().density));
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        int j;
        boolean flag1;
        int k;
        flag1 = true;
        k = App.am;
        ow ow1;
        int l;
        if (c != null)
        {
            ow1 = c.a(d, e);
        } else
        {
            ow1 = ow.NONE;
        }
        j = MotionEventCompat.getPointerCount(motionevent);
        if (ow1 == ow.BOTH || ow1 == ow.LEFT || j > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ow1 == ow.BOTH || ow1 == ow.RIGHT || j > 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        l = motionevent.getAction() & 0xff;
        if (l == 3 || l == 1)
        {
            b = -1;
        }
        l;
        JVM INSTR lookupswitch 3: default 148
    //                   0: 275
    //                   2: 173
    //                   6: 313;
           goto _L1 _L2 _L3 _L4
_L1:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        if (!flag && !j)
        {
            continue; /* Loop/switch isn't completed */
        }
        int i1 = b;
        if (i1 == -1 && k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        float f1 = MotionEventCompat.getX(motionevent, MotionEventCompat.findPointerIndex(motionevent, i1));
        if (flag && j)
        {
            f = f1;
            return false;
        }
        if (flag && f1 > f)
        {
            f = f1;
            return false;
        }
        if (j && f1 < f)
        {
            f = f1;
            return false;
        }
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        f = motionevent.getX();
        d = motionevent.getRawX();
        e = motionevent.getRawY();
        b = MotionEventCompat.getPointerId(motionevent, 0);
        if (k == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        int i = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i) == b)
        {
            if (i == 0)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            f = MotionEventCompat.getX(motionevent, i);
            b = MotionEventCompat.getPointerId(motionevent, i);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setOnInterceptTouchListener(iv iv1)
    {
        c = iv1;
    }
}
