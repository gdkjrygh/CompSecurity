// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;

// Referenced classes of package com.vividsolutions.jts.geom:
//            i, v, GeometryFactory, Coordinate, 
//            f, d, b, g, 
//            l, e, h, u

public class Point extends i
    implements v
{

    private static final long serialVersionUID = 0x44077bad161cbb2aL;
    private d a;

    public Point(Coordinate coordinate, u u, int j)
    {
        super(new GeometryFactory(u, j));
        f f1 = getFactory().getCoordinateSequenceFactory();
        if (coordinate != null)
        {
            u = new Coordinate[1];
            u[0] = coordinate;
            coordinate = u;
        } else
        {
            coordinate = new Coordinate[0];
        }
        a(f1.a(coordinate));
    }

    public Point(d d1, GeometryFactory geometryfactory)
    {
        super(geometryfactory);
        a(d1);
    }

    private void a(d d1)
    {
        boolean flag = true;
        d d2 = d1;
        if (d1 == null)
        {
            d2 = getFactory().getCoordinateSequenceFactory().a(new Coordinate[0]);
        }
        if (d2.b() > 1)
        {
            flag = false;
        }
        com.vividsolutions.jts.a.a.a(flag, null);
        a = d2;
    }

    public void apply(b b1)
    {
        if (isEmpty())
        {
            return;
        } else
        {
            b1.a(getCoordinate());
            return;
        }
    }

    public void apply(g g1)
    {
        if (!isEmpty())
        {
            g1.a(a, 0);
            if (g1.a())
            {
                geometryChanged();
                return;
            }
        }
    }

    public void apply(l l1)
    {
        l1.a(this);
    }

    public void apply$6f9a9d12(l l1)
    {
        l1.a(this);
    }

    public Object clone()
    {
        Point point = (Point)super.clone();
        point.a = (d)a.clone();
        return point;
    }

    protected int compareToSameClass(Object obj)
    {
        obj = (Point)obj;
        return getCoordinate().compareTo(((Point) (obj)).getCoordinate());
    }

    protected int compareToSameClass(Object obj, e e1)
    {
        obj = (Point)obj;
        return e1.compare(a, ((Point) (obj)).a);
    }

    protected h computeEnvelopeInternal()
    {
        if (isEmpty())
        {
            return new h();
        } else
        {
            h h1 = new h();
            h1.a(a.c(0), a.d(0));
            return h1;
        }
    }

    public boolean equalsExact(i j, double d1)
    {
        if (isEquivalentClass(j))
        {
            if (isEmpty() && j.isEmpty())
            {
                return true;
            }
            if (isEmpty() == j.isEmpty())
            {
                return equal(((Point)j).getCoordinate(), getCoordinate(), d1);
            }
        }
        return false;
    }

    public i getBoundary()
    {
        return getFactory().createGeometryCollection(null);
    }

    public int getBoundaryDimension()
    {
        return -1;
    }

    public Coordinate getCoordinate()
    {
        if (a.b() != 0)
        {
            return a.a(0);
        } else
        {
            return null;
        }
    }

    public d getCoordinateSequence()
    {
        return a;
    }

    public Coordinate[] getCoordinates()
    {
        if (isEmpty())
        {
            return new Coordinate[0];
        } else
        {
            return (new Coordinate[] {
                getCoordinate()
            });
        }
    }

    public int getDimension()
    {
        return 0;
    }

    public String getGeometryType()
    {
        return "Point";
    }

    public int getNumPoints()
    {
        return !isEmpty() ? 1 : 0;
    }

    public double getX()
    {
        if (getCoordinate() == null)
        {
            throw new IllegalStateException("getX called on empty Point");
        } else
        {
            return getCoordinate().x;
        }
    }

    public double getY()
    {
        if (getCoordinate() == null)
        {
            throw new IllegalStateException("getY called on empty Point");
        } else
        {
            return getCoordinate().y;
        }
    }

    public boolean isEmpty()
    {
        return getCoordinate() == null;
    }

    public boolean isSimple()
    {
        return true;
    }

    public void normalize()
    {
    }

    public i reverse()
    {
        return (i)clone();
    }
}
