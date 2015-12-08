// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.graphics.drawable.ColorDrawable;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity

class ac extends TranslateAnimation
{

    final ColorDrawable a;
    final ShuffleLoadingActivity b;

    ac(ShuffleLoadingActivity shuffleloadingactivity, int i, float f, int j, float f1, int k, float f2, 
            int l, float f3, ColorDrawable colordrawable)
    {
        b = shuffleloadingactivity;
        a = colordrawable;
        super(i, f, j, f1, k, f2, l, f3);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        if (ShuffleLoadingActivity.a(b) != null)
        {
            a.setAlpha((int)(153F * f));
            ShuffleLoadingActivity.a(b).setBackgroundDrawable(a);
        }
    }
}
