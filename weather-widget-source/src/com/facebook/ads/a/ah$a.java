// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.facebook.ads.a:
//            ah

class b
    implements android.view.animation.tion.AnimationListener
{

    final ah a;
    private final View b;
    private boolean c;
    private Animation d;
    private Animation e;

    private void a(Animation animation)
    {
        if (animation == d)
        {
            b.startAnimation(e);
        } else
        if (animation == e)
        {
            b.startAnimation(d);
            return;
        }
    }

    static void a(nimation nimation, Animation animation)
    {
        nimation.a(animation);
    }

    public nimation a(boolean flag)
    {
        c = flag;
        return this;
    }

    public void a()
    {
        d = new TranslateAnimation(0, 0.0F, 0, 0.0F, 0, 0.0F, 0, 0 - ah.a(a));
        d.setDuration(ah.b(a));
        d.setStartOffset(ah.c(a));
        d.setFillAfter(true);
        d.setAnimationListener(this);
        e = new TranslateAnimation(0, 0.0F, 0, 0.0F, 0, ah.a(a), 0, 0.0F);
        e.setDuration(ah.b(a));
        e.setStartOffset(ah.c(a));
        e.setFillAfter(true);
        e.setAnimationListener(this);
        View view = b;
        Animation animation;
        if (c)
        {
            animation = e;
        } else
        {
            animation = d;
        }
        view.startAnimation(animation);
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!ah.d(a))
        {
            a(animation);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        class _cls1
            implements Runnable
        {

            final Animation a;
            final ah.a b;

            public void run()
            {
                ah.a.a(b, a);
            }

            _cls1(Animation animation)
            {
                b = ah.a.this;
                a = animation;
                super();
            }
        }

        if (ah.d(a))
        {
            (new Handler()).postDelayed(new _cls1(animation), ah.c(a));
        }
    }

    public nimation(ah ah1, View view)
    {
        a = ah1;
        super();
        c = false;
        b = view;
    }
}
