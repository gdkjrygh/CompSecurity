// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.TextView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            Clock

public class q extends Animation
{

    final Clock a;
    private int b;
    private int c;
    private StringBuffer d;

    public q(Clock clock, int i)
    {
        a = clock;
        super();
        b = i;
        c = (i % 12) * 30;
        d = new StringBuffer();
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        d.setLength(0);
        Clock.a(a, (int)((float)c + 30F * f));
        Clock.b(a, (int)(360F * f));
        if (Clock.a(a) != null)
        {
            int i = b;
            int i1 = Clock.b(a) / 360 + i;
            int j1 = (int)(60F * f) % 60;
            if (j1 == 0)
            {
                transformation = d;
                int j;
                if (i1 == 12)
                {
                    j = 12;
                } else
                {
                    j = i1 % 12;
                }
                transformation.append(String.valueOf(j)).append(":00");
            } else
            if (j1 < 10)
            {
                transformation = d;
                int k;
                if (i1 == 12)
                {
                    k = 12;
                } else
                {
                    k = i1 % 12;
                }
                transformation.append(String.valueOf(k)).append(":0").append(String.valueOf(j1));
            } else
            {
                transformation = d;
                int l;
                if (i1 == 12)
                {
                    l = 12;
                } else
                {
                    l = i1 % 12;
                }
                transformation.append(String.valueOf(l)).append(":").append(String.valueOf(j1));
            }
            if (i1 >= 12)
            {
                d.append(" PM");
            } else
            {
                d.append(" AM");
            }
            Clock.a(a).setText(d.toString());
        }
        a.invalidate();
    }
}
