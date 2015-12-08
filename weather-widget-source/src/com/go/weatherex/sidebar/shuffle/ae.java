// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.graphics.drawable.ColorDrawable;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ad, ShuffleLoadingActivity

class ae extends TranslateAnimation
{

    final ColorDrawable a;
    final ad b;

    ae(ad ad1, int i, float f, int j, float f1, int k, float f2, 
            int l, float f3, ColorDrawable colordrawable)
    {
        b = ad1;
        a = colordrawable;
        super(i, f, j, f1, k, f2, l, f3);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        super.applyTransformation(f, transformation);
        if (ShuffleLoadingActivity.a(b.b) != null)
        {
            a.setAlpha((int)((1.0F - f) * 153F));
            ShuffleLoadingActivity.a(b.b).setBackgroundDrawable(a);
        }
    }
}
