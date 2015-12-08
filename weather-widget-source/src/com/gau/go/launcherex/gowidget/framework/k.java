// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity

class k
    implements android.view.animation.Animation.AnimationListener
{

    final ImageView a;
    final GoWidgetActivity b;

    k(GoWidgetActivity gowidgetactivity, ImageView imageview)
    {
        b = gowidgetactivity;
        a = imageview;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.setVisibility(0);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
