// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;

public final class dsw
    implements Interpolator
{

    private final float a = 5F;

    public dsw()
    {
    }

    public final float getInterpolation(float f)
    {
        return (float)(Math.sin((double)(2.0F * a) * 3.1415926535897931D * (double)f) * Math.pow(1.0F - f, 2D));
    }
}
