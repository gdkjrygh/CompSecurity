// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape;


// Referenced classes of package com.spatial4j.core.shape:
//            Shape

public interface Point
    extends Shape
{

    public abstract double getX();

    public abstract double getY();

    public abstract void reset(double d, double d1);
}
