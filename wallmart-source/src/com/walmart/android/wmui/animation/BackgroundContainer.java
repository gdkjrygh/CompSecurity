// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class BackgroundContainer extends FrameLayout
{

    private int mOpenAreaHeight;
    private int mOpenAreaTop;
    private Drawable mShadowedBackground;
    private boolean mShowing;
    boolean mUpdateBounds;

    public BackgroundContainer(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mShowing = false;
        mUpdateBounds = false;
        init(context, attributeset);
    }

    public BackgroundContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mShowing = false;
        mUpdateBounds = false;
        init(context, attributeset);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.walmart.android.R.styleable.BackgroundContainer, 0, 0);
        mShadowedBackground = context.getDrawable(0);
        context.recycle();
    }

    public void hideBackground()
    {
        setWillNotDraw(true);
        mShowing = false;
    }

    protected void onDraw(Canvas canvas)
    {
        if (mShowing)
        {
            if (mUpdateBounds)
            {
                mShadowedBackground.setBounds(0, 0, getWidth(), mOpenAreaHeight);
            }
            canvas.save();
            canvas.translate(0.0F, mOpenAreaTop);
            mShadowedBackground.draw(canvas);
            canvas.restore();
        }
    }

    public void showBackground(int i, int j)
    {
        setWillNotDraw(false);
        mOpenAreaTop = i;
        mOpenAreaHeight = j;
        mShowing = true;
        mUpdateBounds = true;
    }
}
