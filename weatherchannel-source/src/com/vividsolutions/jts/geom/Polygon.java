// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;
import java.util.Arrays;

// Referenced classes of package com.vividsolutions.jts.geom:
//            i, t, GeometryFactory, p, 
//            Coordinate, a, g, l, 
//            n, d, h, u, 
//            b, e

public class Polygon extends i
    implements t
{

    private static final long serialVersionUID = 0xcf80010272368e4bL;
    protected p holes[];
    protected p shell;

    public Polygon(p p1, u u, int j)
    {
        u = new GeometryFactory(u, j);
        this(p1, new p[0], ((GeometryFactory) (u)));
    }

    public Polygon(p p1, p ap[], GeometryFactory geometryfactory)
    {
        super(geometryfactory);
        shell = null;
        geometryfactory = p1;
        if (p1 == null)
        {
            geometryfactory = getFactory().createLinearRing(null);
        }
        p1 = ap;
        if (ap == null)
        {
            p1 = new p[0];
        }
        if (hasNullElements(p1))
        {
            throw new IllegalArgumentException("holes must not contain null elements");
        }
        if (geometryfactory.isEmpty() && hasNonEmptyElements(p1))
        {
            throw new IllegalArgumentException("shell is empty but holes are not");
        } else
        {
            shell = geometryfactory;
            holes = p1;
            return;
        }
    }

    public Polygon(p p1, p ap[], u u, int j)
    {
        this(p1, ap, new GeometryFactory(u, j));
    }

    private static void a(p p1, boolean flag)
    {
        if (!p1.isEmpty())
        {
            Coordinate acoordinate[] = new Coordinate[p1.getCoordinates().length - 1];
            System.arraycopy(p1.getCoordinates(), 0, acoordinate, 0, acoordinate.length);
            com.vividsolutions.jts.geom.a.a(acoordinate, com.vividsolutions.jts.geom.a.d(p1.getCoordinates()));
            System.arraycopy(acoordinate, 0, p1.getCoordinates(), 0, acoordinate.length);
            p1.getCoordinates()[acoordinate.length] = acoordinate[0];
            if (com.vividsolutions.jts.a.a.a(p1.getCoordinates()) == flag)
            {
                com.vividsolutions.jts.geom.a.c(p1.getCoordinates());
                return;
            }
        }
    }

    public void apply(b b)
    {
        shell.apply(b);
        for (int j = 0; j < holes.length; j++)
        {
            holes[j].apply(b);
        }

    }

    public void apply(g g1)
    {
        shell.apply(g1);
        for (int j = 0; j < holes.length; j++)
        {
            holes[j].apply(g1);
        }

        if (g1.a())
        {
            geometryChanged();
        }
    }

    public void apply(l l1)
    {
        l1.a(this);
        shell.apply(l1);
        for (int j = 0; j < holes.length; j++)
        {
            holes[j].apply(l1);
        }

    }

    public void apply$6f9a9d12(l l1)
    {
        l1.a(this);
    }

    public Object clone()
    {
        Polygon polygon = (Polygon)super.clone();
        polygon.shell = (p)shell.clone();
        polygon.holes = new p[holes.length];
        for (int j = 0; j < holes.length; j++)
        {
            polygon.holes[j] = (p)holes[j].clone();
        }

        return polygon;
    }

    protected int compareToSameClass(Object obj)
    {
        return shell.compareToSameClass(((Polygon)obj).shell);
    }

    protected int compareToSameClass(Object obj, e e)
    {
        int j;
        obj = (Polygon)obj;
        j = shell.compareToSameClass(((Polygon) (obj)).shell, e);
        if (j == 0) goto _L2; else goto _L1
_L1:
        return j;
_L2:
        int k;
        int j1;
        int k1;
        j1 = getNumInteriorRing();
        k1 = ((Polygon) (obj)).getNumInteriorRing();
        k = 0;
label0:
        do
        {
label1:
            {
                if (k >= j1 || k >= k1)
                {
                    break label1;
                }
                int i1 = ((p)getInteriorRingN(k)).compareToSameClass((p)((Polygon) (obj)).getInteriorRingN(k), e);
                j = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                k++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        if (k < j1)
        {
            return 1;
        }
        return k >= k1 ? 0 : -1;
    }

    protected h computeEnvelopeInternal()
    {
        return shell.getEnvelopeInternal();
    }

    public i convexHull()
    {
        return getExteriorRing().convexHull();
    }

    public boolean equalsExact(i j, double d1)
    {
        if (isEquivalentClass(j)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (shell.equalsExact(((Polygon) (j = (Polygon)j)).shell, d1) && holes.length == ((Polygon) (j)).holes.length)
        {
            int k = 0;
label0:
            do
            {
label1:
                {
                    if (k >= holes.length)
                    {
                        break label1;
                    }
                    if (!holes[k].equalsExact(((Polygon) (j)).holes[k], d1))
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

    public double getArea()
    {
        double d1 = Math.abs(com.vividsolutions.jts.a.a.a(shell.a())) + 0.0D;
        for (int j = 0; j < holes.length; j++)
        {
            d1 -= Math.abs(com.vividsolutions.jts.a.a.a(holes[j].a()));
        }

        return d1;
    }

    public i getBoundary()
    {
        if (isEmpty())
        {
            return getFactory().createMultiLineString(null);
        }
        p ap[] = new p[holes.length + 1];
        ap[0] = shell;
        for (int j = 0; j < holes.length; j++)
        {
            ap[j + 1] = holes[j];
        }

        if (ap.length <= 1)
        {
            return getFactory().createLinearRing(ap[0].a());
        } else
        {
            return getFactory().createMultiLineString(ap);
        }
    }

    public int getBoundaryDimension()
    {
        return 1;
    }

    public Coordinate getCoordinate()
    {
        return shell.getCoordinate();
    }

    public Coordinate[] getCoordinates()
    {
        if (isEmpty())
        {
            return new Coordinate[0];
        }
        Coordinate acoordinate[] = new Coordinate[getNumPoints()];
        Coordinate acoordinate1[] = shell.getCoordinates();
        int j = -1;
        for (int i1 = 0; i1 < acoordinate1.length; i1++)
        {
            j++;
            acoordinate[j] = acoordinate1[i1];
        }

        boolean flag = false;
        int j1 = j;
        for (int k = ((flag) ? 1 : 0); k < holes.length; k++)
        {
            Coordinate acoordinate2[] = holes[k].getCoordinates();
            for (int k1 = 0; k1 < acoordinate2.length; k1++)
            {
                j1++;
                acoordinate[j1] = acoordinate2[k1];
            }

        }

        return acoordinate;
    }

    public int getDimension()
    {
        return 2;
    }

    public n getExteriorRing()
    {
        return shell;
    }

    public String getGeometryType()
    {
        return "Polygon";
    }

    public n getInteriorRingN(int j)
    {
        return holes[j];
    }

    public double getLength()
    {
        double d1 = shell.getLength() + 0.0D;
        for (int j = 0; j < holes.length; j++)
        {
            d1 += holes[j].getLength();
        }

        return d1;
    }

    public int getNumInteriorRing()
    {
        return holes.length;
    }

    public int getNumPoints()
    {
        int k = shell.getNumPoints();
        for (int j = 0; j < holes.length; j++)
        {
            k += holes[j].getNumPoints();
        }

        return k;
    }

    public boolean isEmpty()
    {
        return shell.isEmpty();
    }

    public boolean isRectangle()
    {
_L2:
        return false;
        if (getNumInteriorRing() != 0 || shell == null || shell.getNumPoints() != 5) goto _L2; else goto _L1
_L1:
        d d6 = shell.a();
        h h1 = getEnvelopeInternal();
        for (int j = 0; j < 5; j++)
        {
            double d1 = d6.c(j);
            if (d1 != h1.d() && d1 != h1.e())
            {
                continue; /* Loop/switch isn't completed */
            }
            d1 = d6.d(j);
            if (d1 != h1.f() && d1 != h1.g())
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        double d3 = d6.c(0);
        double d2 = d6.d(0);
        int k = 1;
        do
        {
label0:
            {
                if (k > 4)
                {
                    break label0;
                }
                double d4 = d6.c(k);
                double d5 = d6.d(k);
                boolean flag;
                boolean flag1;
                if (d4 != d3)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (d5 != d2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag == flag1)
                {
                    continue; /* Loop/switch isn't completed */
                }
                k++;
                d2 = d5;
                d3 = d4;
            }
        } while (true);
        if (true) goto _L2; else goto _L3
_L3:
        return true;
    }

    public void normalize()
    {
        a(shell, true);
        for (int j = 0; j < holes.length; j++)
        {
            a(holes[j], false);
        }

        Arrays.sort(holes);
    }

    public i reverse()
    {
        Polygon polygon = (Polygon)super.clone();
        polygon.shell = (p)((p)shell.clone()).reverse();
        polygon.holes = new p[holes.length];
        for (int j = 0; j < holes.length; j++)
        {
            polygon.holes[j] = (p)((p)holes[j].clone()).reverse();
        }

        return polygon;
    }
}
