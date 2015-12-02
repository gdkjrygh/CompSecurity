// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public class ETACircleView extends ImageView
{

    private final Animation a;
    private final Animation b;
    private boolean c;
    private long d;
    private long e;

    public ETACircleView(Context context)
    {
        this(context, null);
    }

    public ETACircleView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = false;
        e = -1L;
        a = a(context, 10000L);
        b = a(context, 2000L);
        setImageResource(0x7f0200be);
        c(c);
    }

    private static float a(long l, long l1, long l2)
    {
        if (l == -1L)
        {
            return 0.0F;
        } else
        {
            return ((float)((l2 - l) % l1) / (float)l1) * 360F;
        }
    }

    private static Animation a(Context context, long l)
    {
        context = AnimationUtils.loadAnimation(context, 0x7f04000f);
        context.setInterpolator(new LinearInterpolator());
        context.setDuration(l);
        return context;
    }

    private void a(Animation animation, long l)
    {
        animation.setStartTime(l);
        setAnimation(animation);
        animation = getParent();
        if (animation != null && (animation instanceof View))
        {
            ((View)animation).invalidate();
        }
        invalidate();
    }

    private void c(boolean flag)
    {
        long l = AnimationUtils.currentAnimationTimeMillis();
        float f = getRotation();
        float f1 = a(e, d, l);
        e = l;
        Animation animation;
        if (flag)
        {
            l = 2000L;
        } else
        {
            l = 10000L;
        }
        d = l;
        setRotation((f + f1) % 360F);
        if (flag)
        {
            animation = b;
        } else
        {
            animation = a;
        }
        a(animation, e);
    }

    public final void a(boolean flag)
    {
        if (!flag && getAnimation() != null)
        {
            clearAnimation();
        } else
        if (flag && getAnimation() == null)
        {
            c(c);
            return;
        }
    }

    public final void b(boolean flag)
    {
        if (c == flag)
        {
            return;
        }
        int i;
        if (flag)
        {
            i = 0x7f0200e3;
        } else
        {
            i = 0x7f0200be;
        }
        setImageResource(i);
        c(flag);
        c = flag;
    }
}
