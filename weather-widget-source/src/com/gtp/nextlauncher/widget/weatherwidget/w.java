// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.view.animation.Interpolator;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            HourlyTypeView

class w
    implements Interpolator
{

    final HourlyTypeView a;

    w(HourlyTypeView hourlytypeview)
    {
        a = hourlytypeview;
        super();
    }

    public float getInterpolation(float f)
    {
        if (f <= 0.4F)
        {
            return (float)Math.pow(f / 0.4F, 2D);
        } else
        {
            f = (f - 0.4F) / 0.6F;
            return (float)((double)(float)Math.sin((double)(2.0F * f) * 6.2831853071795862D) * (1.0D - Math.pow(f, 2D)) * 0.40000000596046448D + 1.0D);
        }
    }
}
