// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui.pager;

import android.view.animation.AnimationUtils;

// Referenced classes of package com.walmartlabs.ui.pager:
//            PageFlipper

private class <init>
    implements Runnable
{

    float degreesToMove;
    private int direction;
    private long duration;
    float endDegrees;
    private boolean isMoving;
    float startDegrees;
    private long startTime;
    final PageFlipper this$0;

    private void start(int i, long l)
    {
        direction = i;
        startDegrees = PageFlipper.access$300(PageFlipper.this);
        if (i != -1) goto _L2; else goto _L1
_L1:
        endDegrees = -180F;
_L4:
        degreesToMove = endDegrees - startDegrees;
        duration = l;
        startTime = AnimationUtils.currentAnimationTimeMillis();
        post(this);
        isMoving = true;
        return;
_L2:
        if (i == 1)
        {
            endDegrees = 0.0F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void run()
    {
        long l = AnimationUtils.currentAnimationTimeMillis() - startTime;
        if (l > duration)
        {
            if (direction == -1)
            {
                changeAngle(-180F, false, true);
            } else
            {
                changeAngle(180F, false, true);
            }
            isMoving = false;
        } else
        {
            float f = (float)l / (float)duration;
            float f1 = startDegrees;
            float f2 = degreesToMove;
            float f3 = PageFlipper.access$300(PageFlipper.this);
            changeAngle((f1 + f2 * f) - f3, false, false);
            post(this);
        }
        invalidate();
    }

    public void stop()
    {
        if (isMoving)
        {
            isMoving = false;
            removeCallbacks(this);
        }
    }



    private ()
    {
        this$0 = PageFlipper.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
