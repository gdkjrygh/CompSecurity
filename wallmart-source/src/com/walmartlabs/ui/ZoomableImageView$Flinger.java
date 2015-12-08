// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

// Referenced classes of package com.walmartlabs.ui:
//            ZoomableImageView

private class 
    implements Runnable
{

    private boolean mFlingX;
    private boolean mFlingY;
    private int mLastX;
    private int mLastY;
    private final Scroller mScroller;
    final ZoomableImageView this$0;

    private void endFling()
    {
        mScroller.forceFinished(true);
        ZoomableImageView.access$702(ZoomableImageView.this, false);
    }

    public void run()
    {
        Scroller scroller = mScroller;
        boolean flag = scroller.computeScrollOffset();
        float f = 0.0F;
        float f1 = 0.0F;
        if (mFlingX)
        {
            int i = scroller.getCurrX();
            f = i - mLastX;
            mLastX = i;
        }
        if (mFlingY)
        {
            int j = scroller.getCurrY();
            f1 = j - mLastY;
            mLastY = j;
        }
        ZoomableImageView.access$800(ZoomableImageView.this).postTranslate(f, f1);
        setImageMatrix(ZoomableImageView.access$800(ZoomableImageView.this));
        if (flag && ZoomableImageView.access$700(ZoomableImageView.this))
        {
            ViewCompat.postOnAnimation(ZoomableImageView.this, this);
            return;
        } else
        {
            endFling();
            return;
        }
    }

    public void startFling(int i, int j)
    {
        removeCallbacks(this);
        ZoomableImageView.access$702(ZoomableImageView.this, true);
        mFlingX = true;
        mFlingY = true;
        mLastX = (int)getValue(ZoomableImageView.access$800(ZoomableImageView.this), 2);
        mLastY = (int)getValue(ZoomableImageView.access$800(ZoomableImageView.this), 5);
        int k = (int)((float)getWidth() - ZoomableImageView.access$900(ZoomableImageView.this) * (float)ZoomableImageView.access$1000(ZoomableImageView.this).getIntrinsicWidth());
        int l = (int)((float)getHeight() - ZoomableImageView.access$900(ZoomableImageView.this) * (float)ZoomableImageView.access$1000(ZoomableImageView.this).getIntrinsicHeight());
        if (k > 0)
        {
            mFlingX = false;
            i = 0;
        }
        if (l > 0)
        {
            mFlingY = false;
            j = 0;
        }
        mScroller.fling(mLastX, mLastY, i, j, k, 0, l, 0);
        ViewCompat.postOnAnimation(ZoomableImageView.this, this);
    }

    public void stopFling()
    {
        removeCallbacks(this);
        endFling();
    }

    public (Context context)
    {
        this$0 = ZoomableImageView.this;
        super();
        mScroller = new Scroller(context, new DecelerateInterpolator());
    }
}
