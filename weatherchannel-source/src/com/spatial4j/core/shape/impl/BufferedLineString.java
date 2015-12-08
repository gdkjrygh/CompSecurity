// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape.impl;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.ShapeCollection;
import com.spatial4j.core.shape.SpatialRelation;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.spatial4j.core.shape.impl:
//            BufferedLine

public class BufferedLineString
    implements Shape
{

    private final ShapeCollection a;
    private final double b;

    public BufferedLineString(List list, double d, SpatialContext spatialcontext)
    {
        this(list, d, false, spatialcontext);
    }

    public BufferedLineString(List list, double d, boolean flag, SpatialContext spatialcontext)
    {
        b = d;
        if (list.isEmpty())
        {
            a = spatialcontext.makeCollection(Collections.emptyList());
            return;
        }
        ArrayList arraylist = new ArrayList(list.size() - 1);
        Object obj = null;
        Iterator iterator = list.iterator();
        list = obj;
        while (iterator.hasNext()) 
        {
            Point point = (Point)iterator.next();
            if (list == null)
            {
                continue;
            }
            double d1;
            if (flag)
            {
                d1 = BufferedLine.expandBufForLongitudeSkew(list, point, d);
            } else
            {
                d1 = d;
            }
            arraylist.add(new BufferedLine(list, point, d1, spatialcontext));
            list = point;
        }
        if (arraylist.isEmpty())
        {
            arraylist.add(new BufferedLine(list, list, d, spatialcontext));
        }
        a = spatialcontext.makeCollection(arraylist);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BufferedLineString)obj;
            if (Double.compare(((BufferedLineString) (obj)).b, b) != 0)
            {
                return false;
            }
            if (!a.equals(((BufferedLineString) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public double getArea(SpatialContext spatialcontext)
    {
        return a.getArea(spatialcontext);
    }

    public Rectangle getBoundingBox()
    {
        return a.getBoundingBox();
    }

    public double getBuf()
    {
        return b;
    }

    public Shape getBuffered(double d, SpatialContext spatialcontext)
    {
        return spatialcontext.makeBufferedLineString(getPoints(), b + d);
    }

    public Point getCenter()
    {
        return a.getCenter();
    }

    public List getPoints()
    {
        if (a.isEmpty())
        {
            return Collections.emptyList();
        } else
        {
            return new AbstractList(a.getShapes()) {

                private List a;

                public final Object get(int i)
                {
                    if (i == 0)
                    {
                        return ((BufferedLine)a.get(0)).getA();
                    } else
                    {
                        return ((BufferedLine)a.get(i - 1)).getB();
                    }
                }

                public final int size()
                {
                    return a.size() + 1;
                }

            
            {
                a = list;
                super();
            }
            };
        }
    }

    public ShapeCollection getSegments()
    {
        return a;
    }

    public boolean hasArea()
    {
        return a.hasArea();
    }

    public int hashCode()
    {
        int i = a.hashCode();
        long l;
        if (b != 0.0D)
        {
            l = Double.doubleToLongBits(b);
        } else
        {
            l = 0L;
        }
        return (int)(l ^ l >>> 32) + i * 31;
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public SpatialRelation relate(Shape shape)
    {
        return a.relate(shape);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append("BufferedLineString(buf=").append(b).append(" pts=");
        Iterator iterator = getPoints().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            Point point = (Point)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(point.getX()).append(' ').append(point.getY());
        }
        stringbuilder.append(')');
        return stringbuilder.toString();
    }
}
