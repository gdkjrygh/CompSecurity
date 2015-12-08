// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ui;

import android.view.animation.AlphaAnimation;

public class NamedAlphaAnimation extends AlphaAnimation
{

    private final float fromAlpha;
    private final String name;
    private final float toAlpha;

    public NamedAlphaAnimation(String s, float f, float f1)
    {
        super(f, f1);
        name = s;
        fromAlpha = f;
        toAlpha = f1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("NamedAlphaAnimation{name='").append(name).append('\'').append(", fromAlpha=").append(fromAlpha).append(", toAlpha=").append(toAlpha).append('}').toString();
    }
}
