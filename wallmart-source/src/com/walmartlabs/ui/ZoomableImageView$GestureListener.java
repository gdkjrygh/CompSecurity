// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

// Referenced classes of package com.walmartlabs.ui:
//            ZoomableImageView

private class <init> extends android.view.tener
{

    final ZoomableImageView this$0;

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        if (ZoomableImageView.access$700(ZoomableImageView.this))
        {
            return true;
        }
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        if (ZoomableImageView.access$900(ZoomableImageView.this) < 0.75F * ZoomableImageView.access$1100(ZoomableImageView.this))
        {
            ZoomableImageView.access$1200(ZoomableImageView.this, ZoomableImageView.access$1100(ZoomableImageView.this), f, f1, 250F);
            return true;
        }
        if (ZoomableImageView.access$900(ZoomableImageView.this) < ZoomableImageView.access$1300(ZoomableImageView.this) - 0.01F)
        {
            ZoomableImageView.access$1200(ZoomableImageView.this, ZoomableImageView.access$1300(ZoomableImageView.this), f, f1, 250F);
            return true;
        } else
        {
            ZoomableImageView.access$1200(ZoomableImageView.this, ZoomableImageView.access$1400(ZoomableImageView.this), f, f1, 250F);
            return true;
        }
    }

    public boolean onDown(MotionEvent motionevent)
    {
        if (ZoomableImageView.access$700(ZoomableImageView.this))
        {
            ZoomableImageView.access$1700(ZoomableImageView.this).g();
        }
        return false;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (!ZoomableImageView.access$700(ZoomableImageView.this))
        {
            if (ZoomableImageView.access$1500(ZoomableImageView.this).isInProgress())
            {
                return false;
            }
            if (Math.abs(f) > 200F || Math.abs(f1) > 200F)
            {
                f = Math.max(-4000F, Math.min(0.5F * f, 4000F));
                f1 = Math.max(-4000F, Math.min(0.5F * f1, 4000F));
                ZoomableImageView.access$1700(ZoomableImageView.this).ng((int)f, (int)f1);
                return true;
            }
        }
        return true;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (ZoomableImageView.access$700(ZoomableImageView.this))
        {
            return true;
        }
        if (ZoomableImageView.access$1500(ZoomableImageView.this).isInProgress())
        {
            return false;
        }
        float f4 = 0.0F;
        float f3 = 0.0F;
        float f6 = getValue(ZoomableImageView.access$800(ZoomableImageView.this), 2);
        float f5 = getValue(ZoomableImageView.access$800(ZoomableImageView.this), 5);
        float f2 = f4;
        if (f6 - f <= 0.0F)
        {
            f2 = f4;
            if ((f6 + ZoomableImageView.access$900(ZoomableImageView.this) * (float)ZoomableImageView.access$1000(ZoomableImageView.this).getIntrinsicWidth()) - f > (float)getWidth())
            {
                f2 = -f;
            }
        }
        f = f3;
        if (f5 - f1 <= 0.0F)
        {
            f = f3;
            if ((f5 + ZoomableImageView.access$900(ZoomableImageView.this) * (float)ZoomableImageView.access$1000(ZoomableImageView.this).getIntrinsicHeight()) - f1 > (float)getHeight())
            {
                f = -f1;
            }
        }
        ZoomableImageView.access$800(ZoomableImageView.this).postTranslate(f2, f);
        setImageMatrix(ZoomableImageView.access$800(ZoomableImageView.this));
        invalidate();
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (!ZoomableImageView.access$700(ZoomableImageView.this))
        {
            if (ZoomableImageView.access$1500(ZoomableImageView.this).isInProgress())
            {
                return false;
            }
            if (ZoomableImageView.access$1600(ZoomableImageView.this) != null)
            {
                float f = motionevent.getX();
                float f1 = motionevent.getY();
                motionevent = new float[2];
                motionevent[0] = f;
                motionevent[1] = f1;
                Matrix matrix = new Matrix();
                ZoomableImageView.access$800(ZoomableImageView.this).invert(matrix);
                matrix.mapPoints(motionevent);
                ZoomableImageView.access$1600(ZoomableImageView.this).Tap(motionevent[0], motionevent[1]);
                return true;
            }
        }
        return true;
    }

    private ()
    {
        this$0 = ZoomableImageView.this;
        super();
    }

    <init>(<init> <init>1)
    {
        this();
    }
}
