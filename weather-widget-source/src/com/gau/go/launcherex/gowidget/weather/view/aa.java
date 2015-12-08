// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            LineAnimView

public class aa extends Animation
{

    final LineAnimView a;

    public aa(LineAnimView lineanimview)
    {
        a = lineanimview;
        super();
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        LineAnimView.a(a, f);
        a.invalidate();
    }
}
