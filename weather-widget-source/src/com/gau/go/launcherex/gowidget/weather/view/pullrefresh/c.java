// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.pullrefresh;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.pullrefresh:
//            LineRefreshView, b

class c extends Animation
{

    float a;
    final LineRefreshView b;

    private c(LineRefreshView linerefreshview)
    {
        b = linerefreshview;
        super();
    }

    c(LineRefreshView linerefreshview, b b1)
    {
        this(linerefreshview);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        LineRefreshView.a(b, a * (1.0F - f));
        b.invalidate();
    }
}
