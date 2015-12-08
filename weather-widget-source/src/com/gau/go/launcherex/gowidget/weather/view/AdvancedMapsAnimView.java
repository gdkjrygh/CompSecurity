// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.gau.go.launcherex.gowidget.weather.util.s;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            AdvancedAnimationView, Radar

public class AdvancedMapsAnimView extends AdvancedAnimationView
    implements android.view.animation.Animation.AnimationListener
{

    private Radar b;
    private View c;
    private Animation d;
    private Animation e;

    public AdvancedMapsAnimView(Context context)
    {
        super(context);
    }

    public AdvancedMapsAnimView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a()
    {
        a = false;
        a(((View) (b)), d);
    }

    public void b()
    {
        a = true;
        b.clearAnimation();
        b.setVisibility(4);
        c.clearAnimation();
        c.setVisibility(4);
    }

    public long c()
    {
        return 3500L;
    }

    public void onAnimationEnd(Animation animation)
    {
        if (!a)
        {
            if (animation.equals(d))
            {
                b.setVisibility(0);
                a(c, e);
            } else
            if (animation.equals(e))
            {
                c.setVisibility(0);
                return;
            }
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (Radar)findViewById(0x7f0900bb);
        d = new TranslateAnimation(1, -1F, 1, 0.0F, 1, -1F, 1, 0.0F);
        d.setDuration(1000L);
        d.setAnimationListener(this);
        e = s.b(800L);
        e.setAnimationListener(this);
        c = findViewById(0x7f0900bd);
    }
}
