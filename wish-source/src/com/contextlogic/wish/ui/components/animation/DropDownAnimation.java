// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.animation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class DropDownAnimation extends Animation
{

    boolean down;
    int targetHeight;
    View view;

    public DropDownAnimation(View view1, int i, boolean flag)
    {
        view = view1;
        targetHeight = i;
        down = flag;
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i;
        if (down)
        {
            i = (int)((float)targetHeight * f);
        } else
        {
            i = (int)((float)targetHeight * (1.0F - f));
        }
        view.getLayoutParams().height = i;
        view.requestLayout();
    }

    public void initialize(int i, int j, int k, int l)
    {
        super.initialize(i, j, k, l);
    }

    public boolean willChangeBounds()
    {
        return true;
    }
}
