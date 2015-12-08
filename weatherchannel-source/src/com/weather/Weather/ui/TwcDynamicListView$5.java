// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.ui;

import android.graphics.Rect;
import com.nineoldandroids.animation.TypeEvaluator;

// Referenced classes of package com.weather.Weather.ui:
//            TwcDynamicListView

static final class 
    implements TypeEvaluator
{

    public Rect evaluate(float f, Rect rect, Rect rect1)
    {
        return new Rect(interpolate(rect.left, rect1.left, f), interpolate(rect.top, rect1.top, f), interpolate(rect.right, rect1.right, f), interpolate(rect.bottom, rect1.bottom, f));
    }

    public volatile Object evaluate(float f, Object obj, Object obj1)
    {
        return evaluate(f, (Rect)obj, (Rect)obj1);
    }

    public int interpolate(int i, int j, float f)
    {
        return (int)((float)i + (float)(j - i) * f);
    }

    ()
    {
    }
}
