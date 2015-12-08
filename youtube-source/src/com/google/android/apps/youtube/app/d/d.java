// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.view.animation.Animation;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            c

final class d
    implements android.view.animation.Animation.AnimationListener
{

    final c a;

    private d(c c1)
    {
        a = c1;
        super();
    }

    d(c c1, byte byte0)
    {
        this(c1);
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.a();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
