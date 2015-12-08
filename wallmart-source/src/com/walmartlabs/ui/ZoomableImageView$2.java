// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.os.Handler;

// Referenced classes of package com.walmartlabs.ui:
//            ZoomableImageView

class val.cy
    implements Runnable
{

    final ZoomableImageView this$0;
    final float val$cx;
    final float val$cy;
    final float val$delta;
    final float val$duration;
    final long val$start;
    final float val$startScale;

    public void run()
    {
        long l = System.currentTimeMillis();
        float f = Math.min(val$duration, l - val$start);
        float f1 = val$startScale;
        float f2 = val$delta;
        ZoomableImageView.access$500(ZoomableImageView.this, f1 + f2 * f, val$cx, val$cy);
        if (f < val$duration)
        {
            ZoomableImageView.access$600(ZoomableImageView.this).post(this);
        }
    }

    ()
    {
        this$0 = final_zoomableimageview;
        val$duration = f;
        val$start = l;
        val$startScale = f1;
        val$delta = f2;
        val$cx = f3;
        val$cy = F.this;
        super();
    }
}
