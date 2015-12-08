// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.animation.Animation;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            MediaActionHelper

final class ao
    implements android.view.animation.Animation.AnimationListener
{

    final boolean a;
    final MediaActionHelper.Action b;
    final MediaActionHelper c;

    ao(MediaActionHelper mediaactionhelper, boolean flag, MediaActionHelper.Action action)
    {
        c = mediaactionhelper;
        a = flag;
        b = action;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (a)
        {
            MediaActionHelper.a(c, b);
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
