// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home;

import android.view.animation.Animation;

// Referenced classes of package com.go.weatherex.home:
//            SidebarIcon

class aa
    implements android.view.animation.Animation.AnimationListener
{

    final SidebarIcon a;

    aa(SidebarIcon sidebaricon)
    {
        a = sidebaricon;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.a();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
