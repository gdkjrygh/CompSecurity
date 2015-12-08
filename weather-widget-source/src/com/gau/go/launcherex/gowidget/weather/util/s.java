// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.util;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public class s
{

    public static Animation a(long l)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -1F, 1, 0.0F);
        translateanimation.setDuration(l);
        return translateanimation;
    }

    public static Animation a(long l, float f1)
    {
        AnimationSet animationset = new AnimationSet(true);
        Object obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, f1, 1, 0.0F);
        ((TranslateAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(0.0F, 1.0F);
        ((AlphaAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    public static Animation a(boolean flag, long l)
    {
        TranslateAnimation translateanimation;
        if (flag)
        {
            translateanimation = new TranslateAnimation(1, -1F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        } else
        {
            translateanimation = new TranslateAnimation(1, 1.0F, 1, 0.0F, 1, 0.0F, 1, 0.0F);
        }
        translateanimation.setDuration(l);
        return translateanimation;
    }

    public static Animation b(long l)
    {
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 2, -1F, 1, 0.0F);
        translateanimation.setDuration(l);
        return translateanimation;
    }

    public static Animation b(boolean flag, long l)
    {
        TranslateAnimation translateanimation;
        if (flag)
        {
            translateanimation = new TranslateAnimation(1, 0.0F, 1, -1F, 1, 0.0F, 1, 0.0F);
        } else
        {
            translateanimation = new TranslateAnimation(1, 0.0F, 1, 1.0F, 1, 0.0F, 1, 0.0F);
        }
        translateanimation.setDuration(l);
        return translateanimation;
    }

    public static Animation c(long l)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(l);
        return alphaanimation;
    }

    public static Animation d(long l)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(l);
        return alphaanimation;
    }

    public static Animation e(long l)
    {
        AnimationSet animationset = new AnimationSet(true);
        Object obj = new ScaleAnimation(1.0F, 0.9F, 1.0F, 0.9F, 1, 0.5F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(1.0F, 0.5F);
        ((AlphaAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -0.35F);
        ((TranslateAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    public static Animation f(long l)
    {
        ScaleAnimation scaleanimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.5F);
        scaleanimation.setDuration(l);
        return scaleanimation;
    }

    public static Animation g(long l)
    {
        AnimationSet animationset = new AnimationSet(true);
        Object obj = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 1.0F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(0.0F, 1.0F);
        ((AlphaAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }

    public static Animation h(long l)
    {
        ScaleAnimation scaleanimation = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.0F, 1, 0.5F);
        scaleanimation.setDuration(l);
        return scaleanimation;
    }

    public static Animation i(long l)
    {
        AnimationSet animationset = new AnimationSet(true);
        Object obj = new ScaleAnimation(1.0F, 0.0F, 1.0F, 0.0F, 1, 0.0F, 1, 0.5F);
        ((ScaleAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        obj = new AlphaAnimation(1.0F, 0.0F);
        ((AlphaAnimation) (obj)).setDuration(l);
        animationset.addAnimation(((Animation) (obj)));
        return animationset;
    }
}
