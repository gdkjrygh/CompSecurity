// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.view.ScaleGestureDetector;

// Referenced classes of package com.walmartlabs.ui:
//            ZoomableImageView

private class <init>
    implements android.view.ener
{

    final ZoomableImageView this$0;

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        float f = scalegesturedetector.getScaleFactor() * ZoomableImageView.access$900(ZoomableImageView.this);
        if (Math.abs(f - ZoomableImageView.access$900(ZoomableImageView.this)) < 0.003F)
        {
            return false;
        } else
        {
            ZoomableImageView.access$500(ZoomableImageView.this, f, scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
            invalidate();
            return true;
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
    }

    private ()
    {
        this$0 = ZoomableImageView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
