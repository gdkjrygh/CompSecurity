// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.a;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.gau.go.launcherex.goweather.a:
//            b

class c
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final int b;
    final b c;

    c(b b1, View view, int i)
    {
        c = b1;
        a = view;
        b = i;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        a.setVisibility(b);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        a.setVisibility(0);
    }
}
