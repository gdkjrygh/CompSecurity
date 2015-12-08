// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            CurveAnimView

public class r extends Animation
{

    final CurveAnimView a;

    public r(CurveAnimView curveanimview)
    {
        a = curveanimview;
        super();
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        CurveAnimView.a(a, f);
        CurveAnimView.b(a, CurveAnimView.a(a));
        a.invalidate();
    }
}
