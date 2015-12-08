// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            MediaActionHelper

final class ap
    implements android.view.animation.Animation.AnimationListener
{

    final MediaActionHelper a;

    ap(MediaActionHelper mediaactionhelper)
    {
        a = mediaactionhelper;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        MediaActionHelper.c(a).setVisibility(4);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
