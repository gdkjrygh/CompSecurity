// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.shape;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.shape.impl.Range;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.spatial4j.core.shape:
//            Shape, SpatialRelation, Rectangle, Point

public class ShapeCollection extends AbstractList
    implements Shape
{

    protected final Rectangle bbox;
    protected final List shapes;

    public ShapeCollection(List list, SpatialContext spatialcontext)
    {
        if (!(list instanceof RandomAccess))
        {
            throw new IllegalArgumentException((new StringBuilder("Shapes arg must implement RandomAccess: ")).append(list.getClass()).toString());
        } else
        {
            shapes = list;
            bbox = computeBoundingBox(list, spatialcontext);
            return;
        }
    }

    protected static boolean computeMutualDisjoint(List list)
    {
        int i;
        boolean flag1;
        flag1 = true;
        i = 1;
_L8:
        boolean flag = flag1;
        if (i >= list.size()) goto _L2; else goto _L1
_L1:
        Shape shape;
        int j;
        shape = (Shape)list.get(i);
        j = 0;
_L6:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((Shape)list.get(j)).relate(shape).intersects()) goto _L4; else goto _L3
_L3:
        flag = false;
_L2:
        return flag;
_L4:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected Rectangle computeBoundingBox(Collection collection, SpatialContext spatialcontext)
    {
        if (collection.isEmpty())
        {
            return spatialcontext.makeRectangle((0.0D / 0.0D), (0.0D / 0.0D), (0.0D / 0.0D), (0.0D / 0.0D));
        }
        double d1 = (1.0D / 0.0D);
        double d = (-1.0D / 0.0D);
        Iterator iterator = collection.iterator();
        collection = null;
        while (iterator.hasNext()) 
        {
            Rectangle rectangle = ((Shape)iterator.next()).getBoundingBox();
            Range range = Range.xRange(rectangle, spatialcontext);
            if (collection == null)
            {
                collection = range;
            } else
            {
                collection = collection.expandTo(range);
            }
            d1 = Math.min(d1, rectangle.getMinY());
            d = Math.max(d, rectangle.getMaxY());
        }
        return spatialcontext.makeRectangle(collection.getMin(), collection.getMax(), d1, d);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ShapeCollection)obj;
            if (!shapes.equals(((ShapeCollection) (obj)).shapes))
            {
                return false;
            }
        }
        return true;
    }

    public Shape get(int i)
    {
        return (Shape)shapes.get(i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public double getArea(SpatialContext spatialcontext)
    {
        double d2 = bbox.getArea(spatialcontext);
        Iterator iterator = shapes.iterator();
        double d = 0.0D;
        double d1;
        do
        {
            d1 = d;
            if (!iterator.hasNext())
            {
                break;
            }
            d = ((Shape)iterator.next()).getArea(spatialcontext) + d;
            if (d < d2)
            {
                continue;
            }
            d1 = d2;
            break;
        } while (true);
        return d1;
    }

    public Rectangle getBoundingBox()
    {
        return bbox;
    }

    public volatile Shape getBuffered(double d, SpatialContext spatialcontext)
    {
        return getBuffered(d, spatialcontext);
    }

    public ShapeCollection getBuffered(double d, SpatialContext spatialcontext)
    {
        ArrayList arraylist = new ArrayList(size());
        for (Iterator iterator = shapes.iterator(); iterator.hasNext(); arraylist.add(((Shape)iterator.next()).getBuffered(d, spatialcontext))) { }
        return spatialcontext.makeCollection(arraylist);
    }

    public Point getCenter()
    {
        return bbox.getCenter();
    }

    public List getShapes()
    {
        return shapes;
    }

    public boolean hasArea()
    {
        for (Iterator iterator = shapes.iterator(); iterator.hasNext();)
        {
            if (((Shape)iterator.next()).hasArea())
            {
                return true;
            }
        }

        return false;
    }

    public int hashCode()
    {
        return shapes.hashCode();
    }

    public SpatialRelation relate(Shape shape)
    {
        SpatialRelation spatialrelation;
        SpatialRelation spatialrelation1;
        spatialrelation = bbox.relate(shape);
        spatialrelation1 = spatialrelation;
        if (spatialrelation == SpatialRelation.DISJOINT) goto _L2; else goto _L1
_L1:
        if (spatialrelation != SpatialRelation.WITHIN) goto _L4; else goto _L3
_L3:
        spatialrelation1 = spatialrelation;
_L2:
        return spatialrelation1;
_L4:
        boolean flag;
        Iterator iterator;
        if ((shape instanceof Point) || relateContainsShortCircuits())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterator = shapes.iterator();
        spatialrelation = null;
        spatialrelation1 = spatialrelation;
        if (iterator.hasNext())
        {
            SpatialRelation spatialrelation2 = ((Shape)iterator.next()).relate(shape);
            if (spatialrelation == null)
            {
                spatialrelation = spatialrelation2;
            } else
            {
                spatialrelation = spatialrelation.combine(spatialrelation2);
            }
            if (spatialrelation == SpatialRelation.INTERSECTS)
            {
                return SpatialRelation.INTERSECTS;
            }
            if (spatialrelation == SpatialRelation.CONTAINS && flag)
            {
                return SpatialRelation.CONTAINS;
            }
            break MISSING_BLOCK_LABEL_61;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected boolean relateContainsShortCircuits()
    {
        return true;
    }

    public int size()
    {
        return shapes.size();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        stringbuilder.append("ShapeCollection(");
        Iterator iterator = shapes.iterator();
        int i = 0;
        do
        {
label0:
            {
                if (iterator.hasNext())
                {
                    Shape shape = (Shape)iterator.next();
                    if (i > 0)
                    {
                        stringbuilder.append(", ");
                    }
                    stringbuilder.append(shape);
                    if (stringbuilder.length() <= 150)
                    {
                        break label0;
                    }
                    stringbuilder.append(" ...").append(shapes.size());
                }
                stringbuilder.append(")");
                return stringbuilder.toString();
            }
            i++;
        } while (true);
    }
}
