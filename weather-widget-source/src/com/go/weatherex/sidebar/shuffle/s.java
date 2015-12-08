// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.animation.TypeEvaluator;
import android.graphics.PointF;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity

class s
    implements TypeEvaluator
{

    final int a;
    final int b;
    final int c;
    final int d;
    final ShuffleLoadingActivity e;

    s(ShuffleLoadingActivity shuffleloadingactivity, int i, int j, int k, int l)
    {
        e = shuffleloadingactivity;
        a = i;
        b = j;
        c = k;
        d = l;
        super();
    }

    public PointF a(float f, PointF pointf, PointF pointf1)
    {
        pointf = new PointF();
        f = (f * 1000F) / 1000F;
        pointf.x = (float)a + (float)b * f;
        float f1 = c;
        pointf.y = f * (0.5F * (float)d * f) + (f1 + 0.0F * f);
        return pointf;
    }

    public Object evaluate(float f, Object obj, Object obj1)
    {
        return a(f, (PointF)obj, (PointF)obj1);
    }
}
