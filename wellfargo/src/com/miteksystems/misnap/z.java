// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            t, MiSnap, MiSnapAPI, r

final class z
    implements android.view.animation.Animation.AnimationListener
{

    final t a;

    z(t t1)
    {
        a = t1;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        if (t.K(a))
        {
            a.b.setVisible(true, true);
        }
        t.x(a).setVisibility(4);
        t.m(a).postDelayed(a.r, t.n(a).a.J());
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        t.x(a).setVisibility(0);
        animation = t.J(a);
        if (a.k != null)
        {
            a.k.a(animation);
        }
    }
}
