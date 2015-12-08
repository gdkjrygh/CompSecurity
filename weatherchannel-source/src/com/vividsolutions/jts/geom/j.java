// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;
import java.util.Arrays;
import java.util.TreeSet;

// Referenced classes of package com.vividsolutions.jts.geom:
//            i, g, l, h, 
//            Coordinate, GeometryFactory, b, e

public class j extends i
{

    private static final long serialVersionUID = 0xb0f8434e07a82765L;
    protected i a[];

    public j(i ai[], GeometryFactory geometryfactory)
    {
        super(geometryfactory);
        geometryfactory = ai;
        if (ai == null)
        {
            geometryfactory = new i[0];
        }
        if (hasNullElements(geometryfactory))
        {
            throw new IllegalArgumentException("geometries must not contain null elements");
        } else
        {
            a = geometryfactory;
            return;
        }
    }

    public void apply(b b)
    {
        for (int k = 0; k < a.length; k++)
        {
            a[k].apply(b);
        }

    }

    public void apply(g g1)
    {
        if (a.length != 0)
        {
            for (int k = 0; k < a.length; k++)
            {
                a[k].apply(g1);
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
        for (int k = 0; k < a.length; k++)
        {
            a[k].apply(l1);
        }

    }

    public void apply$6f9a9d12(l l1)
    {
        l1.a(this);
        for (int k = 0; k < a.length; k++)
        {
            a[k].apply$6f9a9d12(l1);
        }

    }

    public Object clone()
    {
        j j1 = (j)super.clone();
        j1.a = new i[a.length];
        for (int k = 0; k < a.length; k++)
        {
            j1.a[k] = (i)a[k].clone();
        }

        return j1;
    }

    protected int compareToSameClass(Object obj)
    {
        return compare(new TreeSet(Arrays.asList(a)), new TreeSet(Arrays.asList(((j)obj).a)));
    }

    protected int compareToSameClass(Object obj, e e)
    {
        obj = (j)obj;
        int i1 = getNumGeometries();
        int j1 = ((j) (obj)).getNumGeometries();
        int k;
        for (k = 0; k < i1 && k < j1; k++)
        {
            int k1 = getGeometryN(k).compareToSameClass(((j) (obj)).getGeometryN(k), e);
            if (k1 != 0)
            {
                return k1;
            }
        }

        if (k < i1)
        {
            return 1;
        }
        return k >= j1 ? 0 : -1;
    }

    protected h computeEnvelopeInternal()
    {
        h h1 = new h();
        for (int k = 0; k < a.length; k++)
        {
            h1.a(a[k].getEnvelopeInternal());
        }

        return h1;
    }

    public boolean equalsExact(i k, double d)
    {
        if (isEquivalentClass(k)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (a.length == ((j) (k = (j)k)).a.length)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    if (i1 >= a.length)
                    {
                        break label1;
                    }
                    if (!a[i1].equalsExact(((j) (k)).a[i1], d))
                    {
                        break label0;
                    }
                    i1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public double getArea()
    {
        double d = 0.0D;
        for (int k = 0; k < a.length; k++)
        {
            d += a[k].getArea();
        }

        return d;
    }

    public i getBoundary()
    {
        checkNotGeometryCollection(this);
        com.vividsolutions.jts.a.a.a(null);
        return null;
    }

    public int getBoundaryDimension()
    {
        int i1 = -1;
        for (int k = 0; k < a.length; k++)
        {
            i1 = Math.max(i1, a[k].getBoundaryDimension());
        }

        return i1;
    }

    public Coordinate getCoordinate()
    {
        if (isEmpty())
        {
            return null;
        } else
        {
            return a[0].getCoordinate();
        }
    }

    public Coordinate[] getCoordinates()
    {
        Coordinate acoordinate[] = new Coordinate[getNumPoints()];
        int i1 = -1;
        for (int k = 0; k < a.length; k++)
        {
            Coordinate acoordinate1[] = a[k].getCoordinates();
            for (int j1 = 0; j1 < acoordinate1.length; j1++)
            {
                i1++;
                acoordinate[i1] = acoordinate1[j1];
            }

        }

        return acoordinate;
    }

    public int getDimension()
    {
        int i1 = -1;
        for (int k = 0; k < a.length; k++)
        {
            i1 = Math.max(i1, a[k].getDimension());
        }

        return i1;
    }

    public i getGeometryN(int k)
    {
        return a[k];
    }

    public String getGeometryType()
    {
        return "GeometryCollection";
    }

    public double getLength()
    {
        double d = 0.0D;
        for (int k = 0; k < a.length; k++)
        {
            d += a[k].getLength();
        }

        return d;
    }

    public int getNumGeometries()
    {
        return a.length;
    }

    public int getNumPoints()
    {
        int k = 0;
        int i1 = 0;
        for (; k < a.length; k++)
        {
            i1 += a[k].getNumPoints();
        }

        return i1;
    }

    public boolean isEmpty()
    {
        for (int k = 0; k < a.length; k++)
        {
            if (!a[k].isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    public void normalize()
    {
        for (int k = 0; k < a.length; k++)
        {
            a[k].normalize();
        }

        Arrays.sort(a);
    }

    public i reverse()
    {
        i ai[] = new i[a.length];
        for (int k = 0; k < a.length; k++)
        {
            ai[k] = a[k].reverse();
        }

        return getFactory().createGeometryCollection(ai);
    }
}
