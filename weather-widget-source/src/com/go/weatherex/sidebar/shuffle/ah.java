// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            a, ShuffleLoadingActivity

class ah
    implements TypeEvaluator
{

    final a a;
    final ShuffleLoadingActivity b;

    ah(ShuffleLoadingActivity shuffleloadingactivity, a a1)
    {
        b = shuffleloadingactivity;
        a = a1;
        super();
    }

    public PointF a(float f, PointF pointf, PointF pointf1)
    {
        pointf = new PointF();
        f = 3F * f;
        pointf.x = a.a + a.c * f;
        float f1 = a.b;
        float f2 = a.d;
        pointf.y = f * (0.5F * a.e * f) + (f1 + f2 * f);
        return pointf;
    }

    public Object evaluate(float f, Object obj, Object obj1)
    {
        return a(f, (PointF)obj, (PointF)obj1);
    }
}
