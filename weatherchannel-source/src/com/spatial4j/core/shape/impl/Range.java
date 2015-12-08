// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Rectangle;

public class Range
{
    public static class LongitudeRange extends Range
    {

        public static final LongitudeRange WORLD_180E180W = new LongitudeRange(-180D, 180D);

        public double compareTo(LongitudeRange longituderange)
        {
            double d = getCenter() - longituderange.getCenter();
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
                return contains(d);
            }
            return d >= min || d <= max;
        }

        public boolean crossesDateline()
        {
            return min > max;
        }

        public LongitudeRange expandTo(LongitudeRange longituderange)
        {
            LongitudeRange longituderange1;
            LongitudeRange longituderange2;
            LongitudeRange longituderange3;
            if (compareTo(longituderange) <= 0.0D)
            {
                longituderange1 = longituderange;
                longituderange = this;
            } else
            {
                longituderange1 = this;
            }
            if (longituderange1.contains(longituderange.min))
            {
                longituderange2 = longituderange1;
            } else
            {
                longituderange2 = longituderange;
            }
            if (longituderange.contains(longituderange1.max))
            {
                longituderange3 = longituderange;
            } else
            {
                longituderange3 = longituderange1;
            }
            if (longituderange2 == longituderange3)
            {
                return longituderange2;
            }
            if (longituderange2 == longituderange1 && longituderange3 == longituderange)
            {
                return WORLD_180E180W;
            } else
            {
                return new LongitudeRange(longituderange2.min, longituderange3.max);
            }
        }

        public Range expandTo(Range range)
        {
            return expandTo((LongitudeRange)range);
        }

        public double getCenter()
        {
            double d1 = getCenter();
            double d = d1;
            if (d1 > 180D)
            {
                d = d1 - 360D;
            }
            return d;
        }

        public double getWidth()
        {
            double d1 = getWidth();
            double d = d1;
            if (d1 < 0.0D)
            {
                d = d1 + 360D;
            }
            return d;
        }


        public LongitudeRange(double d, double d1)
        {
            super(d, d1);
        }

        public LongitudeRange(Rectangle rectangle)
        {
            super(rectangle.getMinX(), rectangle.getMaxX());
        }
    }


    private static boolean a;
    protected final double max;
    protected final double min;

    public Range(double d, double d1)
    {
        min = d;
        max = d1;
    }

    public static Range xRange(Rectangle rectangle, SpatialContext spatialcontext)
    {
        if (spatialcontext.isGeo())
        {
            return new LongitudeRange(rectangle.getMinX(), rectangle.getMaxX());
        } else
        {
            return new Range(rectangle.getMinX(), rectangle.getMaxX());
        }
    }

    public static Range yRange(Rectangle rectangle, SpatialContext spatialcontext)
    {
        return new Range(rectangle.getMinY(), rectangle.getMaxY());
    }

    public boolean contains(double d)
    {
        return d >= min && d <= max;
    }

    public double deltaLen(Range range)
    {
        double d = Math.max(min, range.min);
        return Math.min(max, range.max) - d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Range)obj;
            if (Double.compare(((Range) (obj)).max, max) != 0)
            {
                return false;
            }
            if (Double.compare(((Range) (obj)).min, min) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public Range expandTo(Range range)
    {
        if (!a && getClass() != range.getClass())
        {
            throw new AssertionError();
        } else
        {
            return new Range(Math.min(min, range.min), Math.max(max, range.max));
        }
    }

    public double getCenter()
    {
        return min + getWidth() / 2D;
    }

    public double getMax()
    {
        return max;
    }

    public double getMin()
    {
        return min;
    }

    public double getWidth()
    {
        return max - min;
    }

    public int hashCode()
    {
        long l1 = 0L;
        int i;
        long l;
        if (min != 0.0D)
        {
            l = Double.doubleToLongBits(min);
        } else
        {
            l = 0L;
        }
        i = (int)(l ^ l >>> 32);
        l = l1;
        if (max != 0.0D)
        {
            l = Double.doubleToLongBits(max);
        }
        return i * 31 + (int)(l ^ l >>> 32);
    }

    public String toString()
    {
        return (new StringBuilder("Range{")).append(min).append(" TO ").append(max).append('}').toString();
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/shape/impl/Range.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
