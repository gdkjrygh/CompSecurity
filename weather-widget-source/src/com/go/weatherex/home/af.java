// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.go.weatherex.home:
//            SidebarIcon, ae, aa

class af extends Animation
{

    final SidebarIcon a;

    private af(SidebarIcon sidebaricon)
    {
        a = sidebaricon;
        super();
    }

    af(SidebarIcon sidebaricon, aa aa)
    {
        this(sidebaricon);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        if (SidebarIcon.b(a))
        {
            return;
        }
        if (f < 1.0F)
        {
            if (!SidebarIcon.a(a))
            {
                SidebarIcon.c(a).a(f * 225F);
                SidebarIcon.c(a).b(f * 180F);
                SidebarIcon.c(a).c(f * 135F);
                SidebarIcon.c(a).d(f);
            } else
            {
                SidebarIcon.c(a).a(135F * f + 225F);
                SidebarIcon.c(a).b(180F * f + 180F);
                SidebarIcon.c(a).c(225F * f + 135F);
                SidebarIcon.c(a).d(1.0F - f);
            }
            a.invalidate();
            return;
        }
        if (!SidebarIcon.b(a))
        {
            SidebarIcon.a(a, true);
            boolean flag;
            if (!SidebarIcon.a(a))
            {
                SidebarIcon.c(a).a(225F);
                SidebarIcon.c(a).b(180F);
                SidebarIcon.c(a).c(135F);
                SidebarIcon.c(a).d(1.0F);
            } else
            {
                SidebarIcon.c(a).a(360F);
                SidebarIcon.c(a).b(360F);
                SidebarIcon.c(a).c(360F);
                SidebarIcon.c(a).d(0.0F);
            }
            transformation = a;
            if (!SidebarIcon.a(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            SidebarIcon.b(transformation, flag);
        }
        a.invalidate();
    }
}
