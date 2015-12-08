// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ak, ShuffleLoadingActivity, g, f

class al
    implements android.view.animation.Animation.AnimationListener
{

    final ImageView a;
    final ak b;

    al(ak ak1, ImageView imageview)
    {
        b = ak1;
        a = imageview;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        ak.a(b, false);
        ShuffleLoadingActivity.b(b.a, false);
        ShuffleLoadingActivity.a(b.a, a);
        g.a(b.a.getApplicationContext()).a(ShuffleLoadingActivity.m(b.a));
        if (f.a())
        {
            g.a(b.a.getApplicationContext()).a(ShuffleLoadingActivity.n(b.a));
        } else
        {
            g.a(b.a.getApplicationContext()).a();
        }
        (new Thread(ShuffleLoadingActivity.o(b.a))).start();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        ak.a(b, true);
        animation = ShuffleLoadingActivity.l(b.a);
        if (animation != null)
        {
            ShuffleLoadingActivity.a(b.a, 1, animation);
        }
    }
}
