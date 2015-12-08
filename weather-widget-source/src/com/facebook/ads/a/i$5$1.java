// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.a;

import android.view.animation.Animation;
import android.widget.RelativeLayout;

// Referenced classes of package com.facebook.ads.a:
//            i

class a
    implements Runnable
{

    final imation a;

    public void run()
    {
        if (!i.a(a.a))
        {
            return;
        } else
        {
            i.a(a.a, false);
            class _cls1 extends Animation
            {

                final i._cls5._cls1 a;

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
                a = i._cls5._cls1.this;
                super();
            }
            }

            _cls1 _lcls1 = new _cls1();
            _lcls1.setDuration(300L);
            _lcls1.setFillAfter(true);
            i.f(a.a).startAnimation(_lcls1);
            return;
        }
    }

    yout(yout yout)
    {
        a = yout;
        super();
    }
}
