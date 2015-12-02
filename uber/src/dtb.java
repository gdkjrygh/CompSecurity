// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public final class dtb extends Animation
{

    private static final int a = Color.parseColor("#F32F00");
    private static final int b = cwu.a(8);
    private TextView c;
    private ValueAnimator d;
    private Animation e;

    public dtb(TextView textview)
    {
        if (textview == null)
        {
            return;
        }
        c = textview;
        e = new TranslateAnimation(0.0F, b, 0.0F, 0.0F);
        e.setDuration(600L);
        e.setInterpolator(new dsw());
        boolean flag = TextUtils.isEmpty(textview.getText());
        int i;
        if (flag)
        {
            i = textview.getCurrentHintTextColor();
        } else
        {
            i = textview.getCurrentTextColor();
        }
        d = ValueAnimator.ofInt(new int[] {
            a, i
        });
        d.setDuration(400L);
        d.setEvaluator(new ArgbEvaluator());
        d.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(flag, textview) {

            final boolean a;
            final TextView b;
            final dtb c;

            public final void onAnimationUpdate(ValueAnimator valueanimator)
            {
                if (a)
                {
                    b.setHintTextColor(((Integer)valueanimator.getAnimatedValue()).intValue());
                    return;
                } else
                {
                    b.setTextColor(((Integer)valueanimator.getAnimatedValue()).intValue());
                    return;
                }
            }

            
            {
                c = dtb.this;
                a = flag;
                b = textview;
                super();
            }
        });
        e.setAnimationListener(new dru(flag, textview) {

            final boolean a;
            final TextView b;
            final dtb c;

            public final void onAnimationEnd(Animation animation)
            {
                dtb.a(c).start();
            }

            public final void onAnimationStart(Animation animation)
            {
                if (a)
                {
                    b.setHintTextColor(dtb.a());
                    return;
                } else
                {
                    b.setTextColor(dtb.a());
                    return;
                }
            }

            
            {
                c = dtb.this;
                a = flag;
                b = textview;
                super();
            }
        });
    }

    static int a()
    {
        return a;
    }

    static ValueAnimator a(dtb dtb1)
    {
        return dtb1.d;
    }

    public final void cancel()
    {
        e.cancel();
        d.cancel();
    }

    public final void start()
    {
        cancel();
        c.startAnimation(e);
    }

}
