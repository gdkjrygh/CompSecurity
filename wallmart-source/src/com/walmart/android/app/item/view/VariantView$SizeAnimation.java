// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.walmart.android.app.item.view:
//            VariantView

private static class setDuration extends Animation
{

    private static final long DEFAULT_DURATION = 100L;
    private final int mStartHeight;
    private final int mStartWidth;
    private final int mTargetHeight;
    private final int mTargetWidth;
    private final View mView;

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i = mTargetHeight;
        int j = mTargetWidth;
        if (f < 1.0F)
        {
            i = mStartHeight + (int)((float)(mTargetHeight - mStartHeight) * f);
            j = mStartWidth + (int)((float)(mTargetWidth - mStartWidth) * f);
        }
        mView.getLayoutParams().th = j;
        mView.getLayoutParams().ght = i;
        mView.requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    public A(View view, int i)
    {
        mView = view;
        mTargetHeight = i;
        mStartHeight = view.getHeight();
        mStartWidth = view.getWidth();
        mTargetWidth = mStartWidth + (i - mStartHeight);
        setDuration(100L);
    }
}
