// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.g.a;

// Referenced classes of package com.vividsolutions.jts.geom:
//            i, o, GeometryFactory, Coordinate, 
//            f, d, b, g, 
//            l, e, h, a, 
//            Point

public class n extends i
    implements o
{

    private static final long serialVersionUID = 0x2b2b51ba435c8e38L;
    protected d a;

    public n(d d1, GeometryFactory geometryfactory)
    {
        super(geometryfactory);
        geometryfactory = d1;
        if (d1 == null)
        {
            geometryfactory = getFactory().getCoordinateSequenceFactory().a(new Coordinate[0]);
        }
        if (geometryfactory.b() == 1)
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid number of points in LineString (found ")).append(geometryfactory.b()).append(" - must be 0 or >= 2)").toString());
        } else
        {
            a = geometryfactory;
            return;
        }
    }

    private Point b(int j)
    {
        return getFactory().createPoint(a.a(j));
    }

    public final Coordinate a(int j)
    {
        return a.a(j);
    }

    public final d a()
    {
        return a;
    }

    public void apply(b b1)
    {
        for (int j = 0; j < a.b(); j++)
        {
            b1.a(a.a(j));
        }

    }

    public void apply(g g1)
    {
        if (a.b() != 0)
        {
            for (int j = 0; j < a.b(); j++)
            {
                g1.a(a, j);
            }

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

    public final Point b()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return b(0);
        }
    }

    public final Point c()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return b(getNumPoints() - 1);
        }
    }

    public Object clone()
    {
        n n1 = (n)super.clone();
        n1.a = (d)a.clone();
        return n1;
    }

    protected int compareToSameClass(Object obj)
    {
        int j;
        int k;
        boolean flag;
        flag = false;
        obj = (n)obj;
        j = 0;
        k = 0;
_L8:
        if (k >= a.b() || j >= ((n) (obj)).a.b()) goto _L2; else goto _L1
_L1:
        int i1 = a.a(k).compareTo(((n) (obj)).a.a(j));
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        k = i1;
_L6:
        return k;
_L4:
        k++;
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (k < a.b())
        {
            return 1;
        }
        k = ((flag) ? 1 : 0);
        if (j >= ((n) (obj)).a.b()) goto _L6; else goto _L5
_L5:
        return -1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected int compareToSameClass(Object obj, e e1)
    {
        obj = (n)obj;
        return e1.compare(a, ((n) (obj)).a);
    }

    protected h computeEnvelopeInternal()
    {
        if (isEmpty())
        {
            return new h();
        } else
        {
            return a.a(new h());
        }
    }

    public boolean d()
    {
        if (isEmpty())
        {
            return false;
        } else
        {
            return a(0).equals2D(a(getNumPoints() - 1));
        }
    }

    public boolean equalsExact(i j, double d1)
    {
        if (isEquivalentClass(j)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a.b() == ((n) (j = (n)j)).a.b())
        {
            int k = 0;
label0:
            do
            {
label1:
                {
                    if (k >= a.b())
                    {
                        break label1;
                    }
                    if (!equal(a.a(k), ((n) (j)).a.a(k), d1))
                    {
                        break label0;
                    }
                    k++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public i getBoundary()
    {
        return (new a(this)).a();
    }

    public int getBoundaryDimension()
    {
        return !d() ? 0 : -1;
    }

    public Coordinate getCoordinate()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return a.a(0);
        }
    }

    public Coordinate[] getCoordinates()
    {
        return a.c();
    }

    public int getDimension()
    {
        return 1;
    }

    public String getGeometryType()
    {
        return "LineString";
    }

    public double getLength()
    {
        double d1;
        d d6;
        int j;
        int k;
        j = 1;
        d1 = 0.0D;
        d6 = a;
        k = d6.b();
        if (k > 1) goto _L2; else goto _L1
_L1:
        double d4 = d1;
_L4:
        return d4;
_L2:
        Coordinate coordinate = new Coordinate();
        d6.a(0, coordinate);
        double d3 = coordinate.x;
        double d2 = coordinate.y;
        do
        {
            d4 = d1;
            if (j >= k)
            {
                continue;
            }
            d6.a(j, coordinate);
            double d5 = coordinate.x;
            d4 = coordinate.y;
            d3 = d5 - d3;
            d2 = d4 - d2;
            d2 = Math.sqrt(d2 * d2 + d3 * d3);
            j++;
            d3 = d5;
            d1 = d2 + d1;
            d2 = d4;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getNumPoints()
    {
        return a.b();
    }

    public boolean isEmpty()
    {
        return a.b() == 0;
    }

    protected boolean isEquivalentClass(i j)
    {
        return j instanceof n;
    }

    public void normalize()
    {
        int j = 0;
        do
        {
label0:
            {
                if (j < a.b() / 2)
                {
                    int k = a.b() - 1 - j;
                    if (a.a(j).equals(a.a(k)))
                    {
                        break label0;
                    }
                    if (a.a(j).compareTo(a.a(k)) > 0)
                    {
                        com.vividsolutions.jts.geom.a.c(getCoordinates());
                    }
                }
                return;
            }
            j++;
        } while (true);
    }

    public i reverse()
    {
        d d1 = (d)a.clone();
        com.vividsolutions.jts.a.a.b(d1);
        return getFactory().createLineString(d1);
    }
}
