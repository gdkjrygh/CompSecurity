// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            t

final class ac
    implements android.view.animation.Animation.AnimationListener
{

    final t a;

    ac(t t1)
    {
        a = t1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        t.i(a).setVisibility(4);
        t.d(a, false);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        t.d(a, true);
    }
}
