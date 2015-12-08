// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.os.Handler;
import android.view.animation.Animation;

// Referenced classes of package com.facebook.ads.a:
//            i

class 
    implements android.view.animation.ation.AnimationListener
{

    final int a;
    final int b;
    final i c;

    public void onAnimationEnd(Animation animation)
    {
        class _cls1
            implements Runnable
        {

            final i._cls5 a;

            public void run()
            {
                if (!i.a(a.c))
                {
                    return;
                } else
                {
                    i.a(a.c, false);
                    class _cls1 extends Animation
                    {

                        final _cls1 a;

                        protected void applyTransformation(float f, Transformation transformation)
                        {
                            int j = (int)((float)a.a.a + (float)(a.a.b - a.a.a) * f);
                            i.f(a.a.c).getLayoutParams().width = j;
                            i.f(a.a.c).requestLayout();
                            i.g(a.a.c).getLayoutParams().width = j - a.a.b;
                            i.g(a.a.c).requestLayout();
                        }

                        public boolean willChangeBounds()
                        {
                            return true;
                        }

                        _cls1()
                        {
                            a = _cls1.this;
                            super();
                        }
                    }

                    _cls1 _lcls1 = new _cls1();
                    _lcls1.setDuration(300L);
                    _lcls1.setFillAfter(true);
                    i.f(a.c).startAnimation(_lcls1);
                    return;
                }
            }

            _cls1()
            {
                a = i._cls5.this;
                super();
            }
        }

        (new Handler()).postDelayed(new _cls1(), 3000L);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    Animation(i i, int j, int k)
    {
        c = i;
        a = j;
        b = k;
        super();
    }
}
