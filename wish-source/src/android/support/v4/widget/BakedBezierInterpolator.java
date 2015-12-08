// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.animation.Interpolator;

final class BakedBezierInterpolator
    implements Interpolator
{

    private static final BakedBezierInterpolator INSTANCE = new BakedBezierInterpolator();
    private static final float STEP_SIZE = 1.0F / (float)(VALUES.length - 1);
    private static final float VALUES[] = {
        0.0F, 0.0002F, 0.0009F, 0.0019F, 0.0036F, 0.0059F, 0.0086F, 0.0119F, 0.0157F, 0.0209F, 
        0.0257F, 0.0321F, 0.0392F, 0.0469F, 0.0566F, 0.0656F, 0.0768F, 0.0887F, 0.1033F, 0.1186F, 
        0.1349F, 0.1519F, 0.1696F, 0.1928F, 0.2121F, 0.237F, 0.2627F, 0.2892F, 0.3109F, 0.3386F, 
        0.3667F, 0.3952F, 0.4241F, 0.4474F, 0.4766F, 0.5F, 0.5234F, 0.5468F, 0.5701F, 0.5933F, 
        0.6134F, 0.6333F, 0.6531F, 0.6698F, 0.6891F, 0.7054F, 0.7214F, 0.7346F, 0.7502F, 0.763F, 
        0.7756F, 0.7879F, 0.8F, 0.8107F, 0.8212F, 0.8326F, 0.8415F, 0.8503F, 0.8588F, 0.8672F, 
        0.8754F, 0.8833F, 0.8911F, 0.8977F, 0.9041F, 0.9113F, 0.9165F, 0.9232F, 0.9281F, 0.9328F, 
        0.9382F, 0.9434F, 0.9476F, 0.9518F, 0.9557F, 0.9596F, 0.9632F, 0.9662F, 0.9695F, 0.9722F, 
        0.9753F, 0.9777F, 0.9805F, 0.9826F, 0.9847F, 0.9866F, 0.9884F, 0.9901F, 0.9917F, 0.9931F, 
        0.9944F, 0.9955F, 0.9964F, 0.9973F, 0.9981F, 0.9986F, 0.9992F, 0.9995F, 0.9998F, 1.0F, 
        1.0F
    };

    private BakedBezierInterpolator()
    {
    }

    public static final BakedBezierInterpolator getInstance()
    {
        return INSTANCE;
    }

    public float getInterpolation(float f)
    {
        if (f >= 1.0F)
        {
            return 1.0F;
        }
        if (f <= 0.0F)
        {
            return 0.0F;
        } else
        {
            int i = Math.min((int)((float)(VALUES.length - 1) * f), VALUES.length - 2);
            f = (f - (float)i * STEP_SIZE) / STEP_SIZE;
            return VALUES[i] + (VALUES[i + 1] - VALUES[i]) * f;
        }
    }

}
