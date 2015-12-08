// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.a.d;
import com.vividsolutions.jts.a.f;
import com.vividsolutions.jts.a.g;
import com.vividsolutions.jts.a.h;
import com.vividsolutions.jts.a.j;
import com.vividsolutions.jts.g.a.c;
import com.vividsolutions.jts.g.b.b;
import com.vividsolutions.jts.g.c.e;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.vividsolutions.jts.geom:
//            GeometryFactory, Point, r, n, 
//            p, q, Polygon, s, 
//            j, u, h, IntersectionMatrix, 
//            Coordinate, l, b, g, 
//            e

public abstract class i
    implements Serializable, Cloneable, Comparable
{

    private static Class a[];
    private static final l b = new l() {

        public final void a(i k)
        {
            k.geometryChangedAction();
        }

    };
    private static final long serialVersionUID = 0x799ea46522854a3eL;
    protected int SRID;
    private Object c;
    protected com.vividsolutions.jts.geom.h envelope;
    protected final GeometryFactory factory;

    public i(GeometryFactory geometryfactory)
    {
        c = null;
        factory = geometryfactory;
        SRID = geometryfactory.getSRID();
    }

    private int a()
    {
        boolean flag = false;
        int k = ((flag) ? 1 : 0);
        if (a == null)
        {
            a = (new Class[] {
                com/vividsolutions/jts/geom/Point, com/vividsolutions/jts/geom/r, com/vividsolutions/jts/geom/n, com/vividsolutions/jts/geom/p, com/vividsolutions/jts/geom/q, com/vividsolutions/jts/geom/Polygon, com/vividsolutions/jts/geom/s, com/vividsolutions/jts/geom/j
            });
            k = ((flag) ? 1 : 0);
        }
        for (; k < a.length; k++)
        {
            if (a[k].isInstance(this))
            {
                return k;
            }
        }

        com.vividsolutions.jts.a.a.a((new StringBuilder("Class not supported: ")).append(getClass()).toString());
        return -1;
    }

    private static Point a(Coordinate coordinate, i k)
    {
        k.getPrecisionModel().a(coordinate);
        return k.getFactory().createPoint(coordinate);
    }

    protected static boolean hasNonEmptyElements(i ai[])
    {
        boolean flag1 = false;
        int k = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (k < ai.length)
                {
                    if (ai[k].isEmpty())
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            k++;
        } while (true);
    }

    protected static boolean hasNullElements(Object aobj[])
    {
        boolean flag1 = false;
        int k = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (k < aobj.length)
                {
                    if (aobj[k] != null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            k++;
        } while (true);
    }

    public abstract void apply(com.vividsolutions.jts.geom.b b1);

    public abstract void apply(com.vividsolutions.jts.geom.g g1);

    public abstract void apply(l l);

    public abstract void apply$6f9a9d12(l l);

    public i buffer(double d1)
    {
        return com.vividsolutions.jts.g.a.c.a(this, d1);
    }

    public i buffer(double d1, int k)
    {
        return com.vividsolutions.jts.g.a.c.a(this, d1, k);
    }

    public i buffer(double d1, int k, int l)
    {
        return com.vividsolutions.jts.g.a.c.a(this, d1, k, l);
    }

    protected void checkNotGeometryCollection(i k)
    {
        if (k.getClass().getName().equals("com.vividsolutions.jts.geom.GeometryCollection"))
        {
            throw new IllegalArgumentException("This method does not support GeometryCollection arguments");
        } else
        {
            return;
        }
    }

    public Object clone()
    {
        i k;
        try
        {
            k = (i)super.clone();
            if (k.envelope != null)
            {
                k.envelope = new com.vividsolutions.jts.geom.h(k.envelope);
            }
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            com.vividsolutions.jts.a.a.a(null);
            return null;
        }
        return k;
    }

    protected int compare(Collection collection, Collection collection1)
    {
        collection = collection.iterator();
        for (collection1 = collection1.iterator(); collection.hasNext() && collection1.hasNext();)
        {
            int k = ((Comparable)collection.next()).compareTo((Comparable)collection1.next());
            if (k != 0)
            {
                return k;
            }
        }

        if (collection.hasNext())
        {
            return 1;
        }
        return !collection1.hasNext() ? 0 : -1;
    }

    public int compareTo(Object obj)
    {
        i k = (i)obj;
        if (a() != k.a())
        {
            return a() - k.a();
        }
        if (isEmpty() && k.isEmpty())
        {
            return 0;
        }
        if (isEmpty())
        {
            return -1;
        }
        if (k.isEmpty())
        {
            return 1;
        } else
        {
            return compareToSameClass(obj);
        }
    }

    public int compareTo(Object obj, com.vividsolutions.jts.geom.e e1)
    {
        i k = (i)obj;
        if (a() != k.a())
        {
            return a() - k.a();
        }
        if (isEmpty() && k.isEmpty())
        {
            return 0;
        }
        if (isEmpty())
        {
            return -1;
        }
        if (k.isEmpty())
        {
            return 1;
        } else
        {
            return compareToSameClass(obj, e1);
        }
    }

    protected abstract int compareToSameClass(Object obj);

    protected abstract int compareToSameClass(Object obj, com.vividsolutions.jts.geom.e e1);

    protected abstract com.vividsolutions.jts.geom.h computeEnvelopeInternal();

    public boolean contains(i k)
    {
        if (!getEnvelopeInternal().d(k.getEnvelopeInternal()))
        {
            return false;
        }
        if (isRectangle())
        {
            return (new com.vividsolutions.jts.g.d.c((Polygon)this)).a(k);
        } else
        {
            return relate(k).isContains();
        }
    }

    public i convexHull()
    {
        return (new g(this)).a();
    }

    public boolean coveredBy(i k)
    {
        return k.covers(this);
    }

    public boolean covers(i k)
    {
        if (!getEnvelopeInternal().e(k.getEnvelopeInternal()))
        {
            return false;
        }
        if (isRectangle())
        {
            return true;
        } else
        {
            return relate(k).isCovers();
        }
    }

    public boolean crosses(i k)
    {
        if (!getEnvelopeInternal().c(k.getEnvelopeInternal()))
        {
            return false;
        } else
        {
            return relate(k).isCrosses(getDimension(), k.getDimension());
        }
    }

    public i difference(i k)
    {
        if (isEmpty())
        {
            return e.a(3, this, k, factory);
        }
        if (k.isEmpty())
        {
            return (i)clone();
        } else
        {
            checkNotGeometryCollection(this);
            checkNotGeometryCollection(k);
            return com.vividsolutions.jts.g.c.a.c.a(this, k, 3);
        }
    }

    public boolean disjoint(i k)
    {
        return !intersects(k);
    }

    public double distance(i k)
    {
        return (new b(this, k)).a();
    }

    protected boolean equal(Coordinate coordinate, Coordinate coordinate1, double d1)
    {
        if (d1 == 0.0D)
        {
            return coordinate.equals(coordinate1);
        }
        return coordinate.distance(coordinate1) <= d1;
    }

    public boolean equals(i k)
    {
        return equalsTopo(k);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof i))
        {
            return false;
        } else
        {
            return equalsExact((i)obj);
        }
    }

    public boolean equalsExact(i k)
    {
        return equalsExact(k, 0.0D);
    }

    public abstract boolean equalsExact(i k, double d1);

    public boolean equalsNorm(i k)
    {
        if (k == null)
        {
            return false;
        } else
        {
            return norm().equalsExact(k.norm());
        }
    }

    public boolean equalsTopo(i k)
    {
        if (!getEnvelopeInternal().equals(k.getEnvelopeInternal()))
        {
            return false;
        } else
        {
            return relate(k).isEquals(getDimension(), k.getDimension());
        }
    }

    public void geometryChanged()
    {
        apply(b);
    }

    protected void geometryChangedAction()
    {
        envelope = null;
    }

    public double getArea()
    {
        return 0.0D;
    }

    public abstract i getBoundary();

    public abstract int getBoundaryDimension();

    public Point getCentroid()
    {
        if (isEmpty())
        {
            return factory.createPoint(null);
        }
        int k = getDimension();
        Object obj;
        if (k == 0)
        {
            obj = new f();
            ((f) (obj)).a(this);
            obj = ((f) (obj)).a();
        } else
        if (k == 1)
        {
            obj = new com.vividsolutions.jts.a.e();
            ((com.vividsolutions.jts.a.e) (obj)).a(this);
            obj = ((com.vividsolutions.jts.a.e) (obj)).a();
        } else
        {
            obj = new d();
            ((d) (obj)).a(this);
            obj = ((d) (obj)).a();
        }
        return a(((Coordinate) (obj)), this);
    }

    public abstract Coordinate getCoordinate();

    public abstract Coordinate[] getCoordinates();

    public abstract int getDimension();

    public i getEnvelope()
    {
        return getFactory().toGeometry(getEnvelopeInternal());
    }

    public com.vividsolutions.jts.geom.h getEnvelopeInternal()
    {
        if (envelope == null)
        {
            envelope = computeEnvelopeInternal();
        }
        return new com.vividsolutions.jts.geom.h(envelope);
    }

    public GeometryFactory getFactory()
    {
        return factory;
    }

    public i getGeometryN(int k)
    {
        return this;
    }

    public abstract String getGeometryType();

    public Point getInteriorPoint()
    {
        if (isEmpty())
        {
            return factory.createPoint(null);
        }
        int k = getDimension();
        Coordinate coordinate;
        if (k == 0)
        {
            coordinate = (new j(this)).a();
        } else
        if (k == 1)
        {
            coordinate = (new com.vividsolutions.jts.a.i(this)).a();
        } else
        {
            coordinate = (new h(this)).a();
        }
        return a(coordinate, this);
    }

    public double getLength()
    {
        return 0.0D;
    }

    public int getNumGeometries()
    {
        return 1;
    }

    public abstract int getNumPoints();

    public u getPrecisionModel()
    {
        return factory.getPrecisionModel();
    }

    public int getSRID()
    {
        return SRID;
    }

    public Object getUserData()
    {
        return c;
    }

    public int hashCode()
    {
        return getEnvelopeInternal().hashCode();
    }

    public i intersection(i k)
    {
        if (isEmpty() || k.isEmpty())
        {
            return e.a(1, this, k, factory);
        }
        if (isGeometryCollection())
        {
            com.vividsolutions.jts.geom.j j1 = (com.vividsolutions.jts.geom.j)this;
            return (new com.vividsolutions.jts.geom.c.b(new com.vividsolutions.jts.geom.c.f(k) {

                private i a;

                public final i a(i l)
                {
                    return l.intersection(a);
                }

            
            {
                a = l;
                super();
            }
            })).a(j1);
        } else
        {
            checkNotGeometryCollection(this);
            checkNotGeometryCollection(k);
            return com.vividsolutions.jts.g.c.a.c.a(this, k, 1);
        }
    }

    public boolean intersects(i k)
    {
        if (!getEnvelopeInternal().c(k.getEnvelopeInternal()))
        {
            return false;
        }
        if (isRectangle())
        {
            return com.vividsolutions.jts.g.d.d.a((Polygon)this, k);
        }
        if (k.isRectangle())
        {
            return com.vividsolutions.jts.g.d.d.a((Polygon)k, this);
        } else
        {
            return relate(k).isIntersects();
        }
    }

    public abstract boolean isEmpty();

    protected boolean isEquivalentClass(i k)
    {
        return getClass().getName().equals(k.getClass().getName());
    }

    protected boolean isGeometryCollection()
    {
        return getClass().equals(com/vividsolutions/jts/geom/j);
    }

    public boolean isRectangle()
    {
        return false;
    }

    public boolean isSimple()
    {
        return (new com.vividsolutions.jts.g.d(this)).a();
    }

    public boolean isValid()
    {
        return (new com.vividsolutions.jts.g.g.d(this)).a();
    }

    public boolean isWithinDistance(i k, double d1)
    {
        while (getEnvelopeInternal().f(k.getEnvelopeInternal()) > d1 || (new b(this, k, d1)).a() > d1) 
        {
            return false;
        }
        return true;
    }

    public i norm()
    {
        i k = (i)clone();
        k.normalize();
        return k;
    }

    public abstract void normalize();

    public boolean overlaps(i k)
    {
        if (!getEnvelopeInternal().c(k.getEnvelopeInternal()))
        {
            return false;
        } else
        {
            return relate(k).isOverlaps(getDimension(), k.getDimension());
        }
    }

    public IntersectionMatrix relate(i k)
    {
        checkNotGeometryCollection(this);
        checkNotGeometryCollection(k);
        return (new com.vividsolutions.jts.g.e.h(this, k)).a();
    }

    public boolean relate(i k, String s1)
    {
        return relate(k).matches(s1);
    }

    public abstract i reverse();

    public void setSRID(int k)
    {
        SRID = k;
    }

    public void setUserData(Object obj)
    {
        c = obj;
    }

    public i symDifference(i k)
    {
        if (isEmpty() || k.isEmpty())
        {
            if (isEmpty() && k.isEmpty())
            {
                return e.a(4, this, k, factory);
            }
            if (isEmpty())
            {
                return (i)k.clone();
            }
            if (k.isEmpty())
            {
                return (i)clone();
            }
        }
        checkNotGeometryCollection(this);
        checkNotGeometryCollection(k);
        return com.vividsolutions.jts.g.c.a.c.a(this, k, 4);
    }

    public String toString()
    {
        return toText();
    }

    public String toText()
    {
        return (new com.vividsolutions.jts.d.i()).a(this);
    }

    public boolean touches(i k)
    {
        if (!getEnvelopeInternal().c(k.getEnvelopeInternal()))
        {
            return false;
        } else
        {
            return relate(k).isTouches(getDimension(), k.getDimension());
        }
    }

    public i union()
    {
        return (new com.vividsolutions.jts.g.f.c(this)).a();
    }

    public i union(i k)
    {
        if (isEmpty() || k.isEmpty())
        {
            if (isEmpty() && k.isEmpty())
            {
                return e.a(2, this, k, factory);
            }
            if (isEmpty())
            {
                return (i)k.clone();
            }
            if (k.isEmpty())
            {
                return (i)clone();
            }
        }
        checkNotGeometryCollection(this);
        checkNotGeometryCollection(k);
        return com.vividsolutions.jts.g.c.a.c.a(this, k, 2);
    }

    public boolean within(i k)
    {
        return k.contains(this);
    }

}
