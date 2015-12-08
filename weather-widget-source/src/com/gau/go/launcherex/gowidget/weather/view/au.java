// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            Water

public class au extends Animation
{

    final Water a;

    public au(Water water)
    {
        a = water;
        super();
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        Water.a(a, f);
        if (!Water.a(a))
        {
            Water.a(a, true);
        }
        if (Water.b(a) != null)
        {
            Water.b(a).setText((new StringBuilder()).append(String.valueOf((int)(70F * Water.c(a)) + 12)).append("%").toString());
        }
        a.invalidate();
    }
}
