// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.FrameLayout;

public class UndoView extends FrameLayout
{

    public UndoView(Context context)
    {
        super(context);
    }

    public UndoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public UndoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onDetachedFromWindow()
    {
        Animation animation = getAnimation();
        if (animation != null)
        {
            animation.cancel();
        }
        super.onDetachedFromWindow();
    }
}
