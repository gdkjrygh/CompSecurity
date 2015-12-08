// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.shape.Rectangle;

// Referenced classes of package com.spatial4j.core.shape.impl:
//            Range

public static class  extends Range
{

    public static final expandTo WORLD_180E180W = new <init>(-180D, 180D);

    public double compareTo( )
    {
        double d = getCenter() - .getCenter();
        if (d <= 180D)
        {
            if (d >= -180D)
            {
                return d;
            } else
            {
                return d + 360D;
            }
        } else
        {
            return d - 360D;
        }
    }

    public boolean contains(double d)
    {
        if (!crossesDateline())
        {
            return super.contains(d);
        }
        return d >= min || d <= max;
    }

    public boolean crossesDateline()
    {
        return min > max;
    }

    public max expandTo(max max)
    {
        max max1;
        max max2;
        max max3;
        if (compareTo(max) <= 0.0D)
        {
            max1 = max;
            max = this;
        } else
        {
            max1 = this;
        }
        if (max1.contains(max.min))
        {
            max2 = max1;
        } else
        {
            max2 = max;
        }
        if (max.contains(max1.max))
        {
            max3 = max;
        } else
        {
            max3 = max1;
        }
        if (max2 == max3)
        {
            return max2;
        }
        if (max2 == max1 && max3 == max)
        {
            return WORLD_180E180W;
        } else
        {
            return new <init>(max2.min, max3.max);
        }
    }

    public Range expandTo(Range range)
    {
        return expandTo((expandTo)range);
    }

    public double getCenter()
    {
        double d1 = super.getCenter();
        double d = d1;
        if (d1 > 180D)
        {
            d = d1 - 360D;
        }
        return d;
    }

    public double getWidth()
    {
        double d1 = super.getWidth();
        double d = d1;
        if (d1 < 0.0D)
        {
            d = d1 + 360D;
        }
        return d;
    }


    public (double d, double d1)
    {
        super(d, d1);
    }

    public (Rectangle rectangle)
    {
        super(rectangle.getMinX(), rectangle.getMaxX());
    }
}
