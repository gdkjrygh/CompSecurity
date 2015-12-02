// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.whatsapp:
//            akv, ak8

class aum
    implements android.view.animation.Animation.AnimationListener
{

    final View a;
    final ak8 b;
    final View c;
    final View d;

    aum(ak8 ak8, View view, View view1, View view2)
    {
        b = ak8;
        c = view;
        d = view1;
        a = view2;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        c.setVisibility(8);
        animation = new AnimationSet(true);
        TranslateAnimation translateanimation = new TranslateAnimation(1, -0.3F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        translateanimation.setDuration(150L);
        RotateAnimation rotateanimation = new RotateAnimation(-60F, 0.0F, 1, 0.5F, 1, 0.5F);
        rotateanimation.setDuration(150L);
        rotateanimation.setFillAfter(true);
        animation.addAnimation(rotateanimation);
        animation.addAnimation(translateanimation);
        d.startAnimation(animation);
        a.postDelayed(new akv(this), 500L);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
