// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.d;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.r;
import com.vividsolutions.jts.geom.s;
import com.vividsolutions.jts.geom.u;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public final class i
{

    private int a;
    private DecimalFormat b;
    private boolean c;
    private boolean d;
    private int e;
    private String f;

    public i()
    {
        a = 2;
        c = false;
        d = false;
        e = -1;
        f = "  ";
    }

    private static String a(char c1, int k)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (c1 = '\0'; c1 < k; c1++)
        {
            stringbuffer.append('#');
        }

        return stringbuffer.toString();
    }

    private String a(double d1)
    {
        return b.format(d1);
    }

    public static String a(Coordinate coordinate, Coordinate coordinate1)
    {
        return (new StringBuilder("LINESTRING ( ")).append(coordinate.x).append(" ").append(coordinate.y).append(", ").append(coordinate1.x).append(" ").append(coordinate1.y).append(" )").toString();
    }

    public static String a(d d1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("LINESTRING ");
        if (d1.b() == 0)
        {
            stringbuffer.append(" EMPTY");
        } else
        {
            stringbuffer.append("(");
            for (int k = 0; k < d1.b(); k++)
            {
                if (k > 0)
                {
                    stringbuffer.append(", ");
                }
                stringbuffer.append((new StringBuilder()).append(d1.c(k)).append(" ").append(d1.d(k)).toString());
            }

            stringbuffer.append(")");
        }
        return stringbuffer.toString();
    }

    private void a(int k, Writer writer)
        throws IOException
    {
        if (d && k > 0)
        {
            writer.write("\n");
            int l = 0;
            while (l < k) 
            {
                writer.write(f);
                l++;
            }
        }
    }

    private void a(Coordinate coordinate, Writer writer)
        throws IOException
    {
        writer.write((new StringBuilder()).append(a(coordinate.x)).append(" ").append(a(coordinate.y)).toString());
        if (a >= 3 && !Double.isNaN(coordinate.z))
        {
            writer.write(" ");
            writer.write(a(coordinate.z));
        }
    }

    private void a(Polygon polygon, int k, boolean flag, Writer writer)
        throws IOException
    {
        int l = 0;
        if (polygon.isEmpty())
        {
            writer.write("EMPTY");
            return;
        }
        if (flag)
        {
            a(k, writer);
        }
        writer.write("(");
        a(polygon.getExteriorRing(), k, false, writer);
        for (; l < polygon.getNumInteriorRing(); l++)
        {
            writer.write(", ");
            a(polygon.getInteriorRingN(l), k + 1, true, writer);
        }

        writer.write(")");
    }

    private void a(com.vividsolutions.jts.geom.i k, int l, Writer writer)
        throws IOException
    {
        boolean flag2 = false;
        int i1 = 0;
        boolean flag = false;
        a(l, writer);
        if (k instanceof Point)
        {
            k = (Point)k;
            Coordinate coordinate = k.getCoordinate();
            k.getPrecisionModel();
            writer.write("POINT ");
            if (coordinate == null)
            {
                writer.write("EMPTY");
                return;
            } else
            {
                writer.write("(");
                a(coordinate, writer);
                writer.write(")");
                return;
            }
        }
        if (k instanceof p)
        {
            k = (p)k;
            writer.write("LINEARRING ");
            a(((n) (k)), l, false, writer);
            return;
        }
        if (k instanceof n)
        {
            k = (n)k;
            writer.write("LINESTRING ");
            a(((n) (k)), l, false, writer);
            return;
        }
        if (k instanceof Polygon)
        {
            k = (Polygon)k;
            writer.write("POLYGON ");
            a(((Polygon) (k)), l, false, writer);
            return;
        }
        if (k instanceof r)
        {
            k = (r)k;
            writer.write("MULTIPOINT ");
            if (k.isEmpty())
            {
                writer.write("EMPTY");
                return;
            }
            writer.write("(");
            i1 = 0;
            while (i1 < k.getNumGeometries()) 
            {
                if (i1 > 0)
                {
                    writer.write(", ");
                    if (e > 0 && i1 % e == 0)
                    {
                        a(l + 1, writer);
                    }
                }
                writer.write("(");
                a(((Point)k.getGeometryN(i1)).getCoordinate(), writer);
                writer.write(")");
                i1++;
            }
            writer.write(")");
            return;
        }
        if (k instanceof q)
        {
            k = (q)k;
            writer.write("MULTILINESTRING ");
            if (k.isEmpty())
            {
                writer.write("EMPTY");
                return;
            }
            writer.write("(");
            int j1 = 0;
            i1 = l;
            for (; j1 < k.getNumGeometries(); j1++)
            {
                if (j1 > 0)
                {
                    writer.write(", ");
                    i1 = l + 1;
                    flag = true;
                }
                a((n)k.getGeometryN(j1), i1, flag, writer);
            }

            writer.write(")");
            return;
        }
        if (k instanceof s)
        {
            k = (s)k;
            writer.write("MULTIPOLYGON ");
            if (k.isEmpty())
            {
                writer.write("EMPTY");
                return;
            }
            writer.write("(");
            int k1 = 0;
            i1 = l;
            boolean flag1 = flag2;
            for (; k1 < k.getNumGeometries(); k1++)
            {
                if (k1 > 0)
                {
                    writer.write(", ");
                    i1 = l + 1;
                    flag1 = true;
                }
                a((Polygon)k.getGeometryN(k1), i1, flag1, writer);
            }

            writer.write(")");
            return;
        }
        if (k instanceof j)
        {
            k = (j)k;
            writer.write("GEOMETRYCOLLECTION ");
            if (k.isEmpty())
            {
                writer.write("EMPTY");
                return;
            }
            writer.write("(");
            int l1 = l;
            for (; i1 < k.getNumGeometries(); i1++)
            {
                if (i1 > 0)
                {
                    writer.write(", ");
                    l1 = l + 1;
                }
                a(k.getGeometryN(i1), l1, writer);
            }

            writer.write(")");
            return;
        } else
        {
            com.vividsolutions.jts.a.a.a((new StringBuilder("Unsupported Geometry implementation:")).append(k.getClass()).toString());
            return;
        }
    }

    private void a(n n1, int k, boolean flag, Writer writer)
        throws IOException
    {
        if (n1.isEmpty())
        {
            writer.write("EMPTY");
            return;
        }
        if (flag)
        {
            a(k, writer);
        }
        writer.write("(");
        for (int l = 0; l < n1.getNumPoints(); l++)
        {
            if (l > 0)
            {
                writer.write(", ");
                if (e > 0 && l % e == 0)
                {
                    a(k + 1, writer);
                }
            }
            a(n1.a(l), writer);
        }

        writer.write(")");
    }

    public final String a(com.vividsolutions.jts.geom.i k)
    {
        StringWriter stringwriter = new StringWriter();
        DecimalFormatSymbols decimalformatsymbols;
        StringBuilder stringbuilder;
        int l;
        d = false;
        l = k.getPrecisionModel().a();
        decimalformatsymbols = new DecimalFormatSymbols();
        decimalformatsymbols.setDecimalSeparator('.');
        stringbuilder = new StringBuilder("0");
        String s1;
        if (l > 0)
        {
            s1 = ".";
        } else
        {
            s1 = "";
        }
        try
        {
            b = new DecimalFormat(stringbuilder.append(s1).append(a('#', l)).toString(), decimalformatsymbols);
            a(k, 0, ((Writer) (stringwriter)));
        }
        // Misplaced declaration of an exception variable
        catch (com.vividsolutions.jts.geom.i k)
        {
            com.vividsolutions.jts.a.a.a(null);
        }
        return stringwriter.toString();
    }
}
