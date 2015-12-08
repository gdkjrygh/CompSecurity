// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.animation.Animation;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            TutorialView

final class gy
    implements android.view.animation.Animation.AnimationListener
{

    final int a;
    final TutorialView b;

    gy(TutorialView tutorialview, int i)
    {
        b = tutorialview;
        a = i;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        TutorialView.a(b, a);
        b.setAnimation(null);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
