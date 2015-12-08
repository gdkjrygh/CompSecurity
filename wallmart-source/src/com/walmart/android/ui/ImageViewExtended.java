// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

public class ImageViewExtended extends ImageView
{

    private Bitmap bitmap;
    private Animation mAnimation;
    private boolean mBlockLayout;
    private boolean mIsFixedSize;
    private Transformation mTransformation;

    public ImageViewExtended(Context context)
    {
        super(context);
        init();
    }

    public ImageViewExtended(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public ImageViewExtended(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        mTransformation = new Transformation();
    }

    protected void onDraw(Canvas canvas)
    {
        if (mAnimation != null)
        {
            mAnimation.getTransformation(System.currentTimeMillis(), mTransformation);
            float f = mTransformation.getAlpha() * 255F;
            int i = (int)f;
            if (f > 254F)
            {
                i = 255;
            }
            setAlpha(i);
            if (!mAnimation.hasEnded())
            {
                invalidate();
            }
        }
        if (bitmap == null || !bitmap.isRecycled())
        {
            super.onDraw(canvas);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(i);
        int l = android.view.View.MeasureSpec.getMode(j);
        boolean flag;
        if (k == 0x40000000 && l == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsFixedSize = flag;
        super.onMeasure(i, j);
    }

    public void requestLayout()
    {
        if (!mBlockLayout || !mIsFixedSize)
        {
            super.requestLayout();
        }
    }

    public void setAnimation(Animation animation)
    {
        mAnimation = animation;
    }

    public void setImageBitmap(Bitmap bitmap1)
    {
        bitmap = bitmap1;
        mBlockLayout = true;
        super.setImageBitmap(bitmap1);
        mBlockLayout = false;
    }

    public void setImageDrawable(Drawable drawable)
    {
        mBlockLayout = true;
        super.setImageDrawable(drawable);
        mBlockLayout = false;
    }
}
