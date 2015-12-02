// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.ubercab.client.feature.trip.tray.TrayDriverLayout;

public final class geq extends AccelerateDecelerateInterpolator
    implements TimeInterpolator, android.animation.ValueAnimator.AnimatorUpdateListener
{

    final TrayDriverLayout a;

    private geq(TrayDriverLayout traydriverlayout)
    {
        a = traydriverlayout;
        super();
    }

    geq(TrayDriverLayout traydriverlayout, byte byte0)
    {
        this(traydriverlayout);
    }

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f1 = ((Float)valueanimator.getAnimatedValue()).floatValue();
        float f;
        Object obj;
        int i;
        boolean flag;
        if (f1 < 1.0F)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        f = f1;
        if (i == 0)
        {
            f = 2.0F - f1;
        }
        f1 = getInterpolation(f);
        flag = ges.c(TrayDriverLayout.g(a));
        obj = TrayDriverLayout.p(a);
        if (i != 0)
        {
            valueanimator = obj[1];
        } else
        {
            valueanimator = obj[0];
        }
        if (i != 0)
        {
            obj = obj[0];
        } else
        {
            obj = obj[1];
        }
        TrayDriverLayout.a(valueanimator[1]);
        f1 = 1.0F - f1;
        f = 1.0F + f / 16F;
        for (i = 0; i < valueanimator.length; i++)
        {
            if (i != 0 || !flag)
            {
                View view = valueanimator[i];
                view.setAlpha(1.0F);
                view.setScaleX(f1);
                view.setScaleY(f);
                view = obj[i];
                view.setAlpha(0.0F);
                view.setScaleX(f1);
                view.setScaleY(f);
            }
        }

    }
}
