// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.facebook.ads.a:
//            i

class ation extends Animation
{

    final uestLayout a;

    protected void applyTransformation(float f, Transformation transformation)
    {
        int j = (int)((float)a.a.a + (float)(a.a.a - a.a.a) * f);
        i.f(a.a.a).getLayoutParams().width = j;
        i.f(a.a.a).requestLayout();
        i.g(a.a.a).getLayoutParams().width = j - a.a.a;
        i.g(a.a.a).requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }

    sformation(sformation sformation)
    {
        a = sformation;
        super();
    }
}
