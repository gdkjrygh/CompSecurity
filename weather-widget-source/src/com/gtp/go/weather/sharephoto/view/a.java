// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            AnimDeleteButton

public class a extends Animation
{

    final AnimDeleteButton a;

    public a(AnimDeleteButton animdeletebutton)
    {
        a = animdeletebutton;
        super();
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        a.a(f);
    }
}
