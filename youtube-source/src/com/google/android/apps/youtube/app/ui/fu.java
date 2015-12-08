// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.view.MotionEvent;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            FlingDynamics, SliderLayout

final class fu extends FlingDynamics
{

    final SliderLayout g;
    private final FlingDynamics.Orientation h;

    public fu(SliderLayout sliderlayout, Context context)
    {
        g = sliderlayout;
        super(context);
        if (SliderLayout.a(sliderlayout))
        {
            sliderlayout = FlingDynamics.Orientation.VERTICAL;
        } else
        {
            sliderlayout = FlingDynamics.Orientation.HORIZONTAL;
        }
        h = sliderlayout;
    }

    public final boolean f(MotionEvent motionevent)
    {
        return a(motionevent, h);
    }

    public final FlingDynamics.Fling g(MotionEvent motionevent)
    {
        return a(motionevent, h, true);
    }
}
