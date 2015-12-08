// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            t, MiSnap

final class ab
    implements android.view.animation.Animation.AnimationListener
{

    final t a;

    ab(t t1)
    {
        a = t1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        t.c(a, false);
        t.L(a);
        t.p(a).setVisibility(4);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        t.c(a, true);
        t.n(a).a(R.string.uxp_ghost_image_ends);
    }
}
