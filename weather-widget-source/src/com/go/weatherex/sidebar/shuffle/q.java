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

class q extends TranslateAnimation
{

    final int a;
    final ColorDrawable b;
    final ShuffleLoadingActivity c;

    q(ShuffleLoadingActivity shuffleloadingactivity, int i, float f, int j, float f1, int k, float f2, 
            int l, float f3, int i1, ColorDrawable colordrawable)
    {
        c = shuffleloadingactivity;
        a = i1;
        b = colordrawable;
        super(i, f, j, f1, k, f2, l, f3);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        if (ShuffleLoadingActivity.a(c) != null)
        {
            int i = (int)(f * 153F);
            if (a == 1 || a == 2)
            {
                i = (int)((1.0F - f) * 153F);
            }
            b.setAlpha(i);
            ShuffleLoadingActivity.a(c).setBackgroundDrawable(b);
        }
    }
}
