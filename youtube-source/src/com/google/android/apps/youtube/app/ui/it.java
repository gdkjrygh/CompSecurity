// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.animation.Animation;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            WatchMinimizedTutorialView

final class it
    implements android.view.animation.Animation.AnimationListener
{

    final int a;
    final WatchMinimizedTutorialView b;

    it(WatchMinimizedTutorialView watchminimizedtutorialview, int i)
    {
        b = watchminimizedtutorialview;
        a = i;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        WatchMinimizedTutorialView.a(b, a);
        b.setAnimation(null);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
