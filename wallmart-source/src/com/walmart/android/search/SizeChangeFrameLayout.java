// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.search;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SizeChangeFrameLayout extends FrameLayout
{
    public static interface OnHeightChangedListener
    {

        public abstract void onHeightDecreased();

        public abstract void onHeightIncreased();
    }


    private OnHeightChangedListener mOnHeightChangedListener;
    int previousHeight;

    public SizeChangeFrameLayout(Context context)
    {
        super(context);
    }

    public SizeChangeFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SizeChangeFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (previousHeight <= 0 || j <= previousHeight) goto _L2; else goto _L1
_L1:
        if (mOnHeightChangedListener != null)
        {
            mOnHeightChangedListener.onHeightIncreased();
        }
_L4:
        previousHeight = j;
        return;
_L2:
        if (j > 0 && j < previousHeight && mOnHeightChangedListener != null)
        {
            mOnHeightChangedListener.onHeightDecreased();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setOnHeightChangedListener(OnHeightChangedListener onheightchangedlistener)
    {
        mOnHeightChangedListener = onheightchangedlistener;
    }
}
