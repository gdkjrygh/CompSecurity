// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;


// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            TypeEvaluator

public class IntEvaluator
    implements TypeEvaluator
{

    public IntEvaluator()
    {
    }

    public Integer evaluate(float f, Integer integer, Integer integer1)
    {
        int i = integer.intValue();
        float f1 = i;
        return Integer.valueOf((int)((float)(integer1.intValue() - i) * f + f1));
    }

    public Object evaluate(float f, Object obj, Object obj1)
    {
        return evaluate(f, (Integer)obj, (Integer)obj1);
    }
}
