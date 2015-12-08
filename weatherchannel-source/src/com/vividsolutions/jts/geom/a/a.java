// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.a;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.h;
import java.io.Serializable;

public final class a
    implements d, Serializable
{

    private static final long serialVersionUID = 0xf34bb588724e71f6L;
    private int a;
    private Coordinate b[];

    public a(int i, int j)
    {
        a = 3;
        b = new Coordinate[i];
        a = j;
        for (j = 0; j < i; j++)
        {
            b[j] = new Coordinate();
        }

    }

    public a(d d1)
    {
        int i = 0;
        super();
        a = 3;
        if (d1 != null)
        {
            a = d1.a();
            b = new Coordinate[d1.b()];
        } else
        {
            b = new Coordinate[0];
        }
        for (; i < b.length; i++)
        {
            b[i] = d1.b(i);
        }

    }

    public a(Coordinate acoordinate[])
    {
        this(acoordinate, 3);
    }

    private a(Coordinate acoordinate[], int i)
    {
        a = 3;
        b = acoordinate;
        a = 3;
        if (acoordinate == null)
        {
            b = new Coordinate[0];
        }
    }

    public final double a(int i, int j)
    {
        switch (j)
        {
        default:
            return (0.0D / 0.0D);

        case 0: // '\0'
            return b[i].x;

        case 1: // '\001'
            return b[i].y;

        case 2: // '\002'
            return b[i].z;
        }
    }

    public final int a()
    {
        return a;
    }

    public final Coordinate a(int i)
    {
        return b[i];
    }

    public final h a(h h1)
    {
        for (int i = 0; i < b.length; i++)
        {
            h1.a(b[i]);
        }

        return h1;
    }

    public final void a(int i, int j, double d1)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException("invalid ordinateIndex");

        case 0: // '\0'
            b[i].x = d1;
            return;

        case 1: // '\001'
            b[i].y = d1;
            return;

        case 2: // '\002'
            b[i].z = d1;
            break;
        }
    }

    public final void a(int i, Coordinate coordinate)
    {
        coordinate.x = b[i].x;
        coordinate.y = b[i].y;
        coordinate.z = b[i].z;
    }

    public final int b()
    {
        return b.length;
    }

    public final Coordinate b(int i)
    {
        return new Coordinate(b[i]);
    }

    public final double c(int i)
    {
        return b[i].x;
    }

    public final Coordinate[] c()
    {
        return b;
    }

    public final Object clone()
    {
        Coordinate acoordinate[] = new Coordinate[b.length];
        for (int i = 0; i < b.length; i++)
        {
            acoordinate[i] = (Coordinate)b[i].clone();
        }

        return new a(acoordinate);
    }

    public final double d(int i)
    {
        return b[i].y;
    }

    public final String toString()
    {
        if (b.length > 0)
        {
            StringBuffer stringbuffer = new StringBuffer(b.length * 17);
            stringbuffer.append('(');
            stringbuffer.append(b[0]);
            for (int i = 1; i < b.length; i++)
            {
                stringbuffer.append(", ");
                stringbuffer.append(b[i]);
            }

            stringbuffer.append(')');
            return stringbuffer.toString();
        } else
        {
            return "()";
        }
    }
}
