// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ortiz.touch;

import android.graphics.Matrix;

// Referenced classes of package com.ortiz.touch:
//            TouchImageView

private class currY
    implements Runnable
{

    int currX;
    int currY;
    Scroller scroller;
    final TouchImageView this$0;

    public void cancelFling()
    {
        if (scroller != null)
        {
            TouchImageView.access$1200(TouchImageView.this, NONE);
            scroller.forceFinished(true);
        }
    }

    public void run()
    {
        if (TouchImageView.access$2100(TouchImageView.this) != null)
        {
            TouchImageView.access$2100(TouchImageView.this).onMove();
        }
        if (scroller.isFinished())
        {
            scroller = null;
        } else
        if (scroller.computeScrollOffset())
        {
            int i = scroller.getCurrX();
            int j = scroller.getCurrY();
            int k = currX;
            int l = currY;
            currX = i;
            currY = j;
            TouchImageView.access$1800(TouchImageView.this).postTranslate(i - k, j - l);
            TouchImageView.access$1900(TouchImageView.this);
            setImageMatrix(TouchImageView.access$1800(TouchImageView.this));
            TouchImageView.access$500(TouchImageView.this, this);
            return;
        }
    }

    Scroller(int i, int j)
    {
        this$0 = TouchImageView.this;
        super();
        TouchImageView.access$1200(TouchImageView.this, FLING);
        scroller = new Scroller(TouchImageView.this, TouchImageView.access$2600(TouchImageView.this));
        TouchImageView.access$1800(TouchImageView.this).getValues(TouchImageView.access$2700(TouchImageView.this));
        int k = (int)TouchImageView.access$2700(TouchImageView.this)[2];
        int l = (int)TouchImageView.access$2700(TouchImageView.this)[5];
        int i1;
        int j1;
        int k1;
        int l1;
        if (TouchImageView.access$1400(TouchImageView.this) > (float)TouchImageView.access$1300(TouchImageView.this))
        {
            i1 = TouchImageView.access$1300(TouchImageView.this) - (int)TouchImageView.access$1400(TouchImageView.this);
            j1 = 0;
        } else
        {
            j1 = k;
            i1 = k;
        }
        if (TouchImageView.access$1700(TouchImageView.this) > (float)TouchImageView.access$1600(TouchImageView.this))
        {
            k1 = TouchImageView.access$1600(TouchImageView.this) - (int)TouchImageView.access$1700(TouchImageView.this);
            l1 = 0;
        } else
        {
            l1 = l;
            k1 = l;
        }
        scroller.fling(k, l, i, j, i1, j1, k1, l1);
        currX = k;
        currY = l;
    }
}
