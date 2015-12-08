// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.view.View;

public class ah
{

    private int a;
    private int b;
    private int c;
    private final a d;
    private final a e;
    private boolean f;

    public ah(View view, View view1)
    {
        a = 200;
        b = 500;
        c = 4000;
        d = new a(view);
        e = (new a(view1)).a(true);
        f = "4.1.2".equals(android.os.Build.VERSION.RELEASE);
    }

    static int a(ah ah1)
    {
        return ah1.a;
    }

    static int b(ah ah1)
    {
        return ah1.b;
    }

    static int c(ah ah1)
    {
        return ah1.c;
    }

    static boolean d(ah ah1)
    {
        return ah1.f;
    }

    public ah a()
    {
        d.a();
        e.a();
        return this;
    }

    public ah a(int i)
    {
        a = i * 2;
        return this;
    }

    private class a
        implements android.view.animation.Animation.AnimationListener
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

        static void a(a a1, Animation animation)
        {
            a1.a(animation);
        }

        public a a(boolean flag)
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
                final a b;

                public void run()
                {
                    a.a(b, a);
                }

                _cls1(Animation animation)
                {
                    b = a.this;
                    a = animation;
                    super();
                }
            }

            if (ah.d(a))
            {
                (new Handler()).postDelayed(new _cls1(animation), ah.c(a));
            }
        }

        public a(View view)
        {
            a = ah.this;
            super();
            c = false;
            b = view;
        }
    }

}
