// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;
import java.io.Serializable;

public class Coordinate
    implements Serializable, Cloneable, Comparable
{

    public static final double NULL_ORDINATE = (0.0D / 0.0D);
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    private static final long serialVersionUID = 0x5cbf2c235c7e583eL;
    public double x;
    public double y;
    public double z;

    public Coordinate()
    {
        this(0.0D, 0.0D);
    }

    public Coordinate(double d, double d1)
    {
        this(d, d1, (0.0D / 0.0D));
    }

    public Coordinate(double d, double d1, double d2)
    {
        x = d;
        y = d1;
        z = d2;
    }

    public Coordinate(Coordinate coordinate)
    {
        this(coordinate.x, coordinate.y, coordinate.z);
    }

    public static int hashCode(double d)
    {
        long l = Double.doubleToLongBits(d);
        return (int)(l ^ l >>> 32);
    }

    public Object clone()
    {
        Coordinate coordinate;
        try
        {
            coordinate = (Coordinate)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            a.a("this shouldn't happen because this class is Cloneable");
            return null;
        }
        return coordinate;
    }

    public int compareTo(Object obj)
    {
        obj = (Coordinate)obj;
        if (x >= ((Coordinate) (obj)).x)
        {
            if (x > ((Coordinate) (obj)).x)
            {
                return 1;
            }
            if (y >= ((Coordinate) (obj)).y)
            {
                return y <= ((Coordinate) (obj)).y ? 0 : 1;
            }
        }
        return -1;
    }

    public double distance(Coordinate coordinate)
    {
        double d = x - coordinate.x;
        double d1 = y - coordinate.y;
        return Math.sqrt(d * d + d1 * d1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Coordinate))
        {
            return false;
        } else
        {
            return equals2D((Coordinate)obj);
        }
    }

    public boolean equals2D(Coordinate coordinate)
    {
        while (x != coordinate.x || y != coordinate.y) 
        {
            return false;
        }
        return true;
    }

    public boolean equals3D(Coordinate coordinate)
    {
        return x == coordinate.x && y == coordinate.y && (z == coordinate.z || Double.isNaN(z) && Double.isNaN(coordinate.z));
    }

    public double getOrdinate(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid ordinate index: ")).append(i).toString());

        case 0: // '\0'
            return x;

        case 1: // '\001'
            return y;

        case 2: // '\002'
            return z;
        }
    }

    public int hashCode()
    {
        return (hashCode(x) + 629) * 37 + hashCode(y);
    }

    public void setCoordinate(Coordinate coordinate)
    {
        x = coordinate.x;
        y = coordinate.y;
        z = coordinate.z;
    }

    public void setOrdinate(int i, double d)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid ordinate index: ")).append(i).toString());

        case 0: // '\0'
            x = d;
            return;

        case 1: // '\001'
            y = d;
            return;

        case 2: // '\002'
            z = d;
            break;
        }
    }

    public String toString()
    {
        return (new StringBuilder("(")).append(x).append(", ").append(y).append(", ").append(z).append(")").toString();
    }
}
