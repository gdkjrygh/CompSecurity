// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.d;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import com.vividsolutions.jts.geom.n;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.q;
import com.vividsolutions.jts.geom.s;
import com.vividsolutions.jts.geom.u;
import java.io.IOException;
import java.io.Reader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;

// Referenced classes of package com.vividsolutions.jts.d:
//            e

public final class h
{

    private GeometryFactory a;
    private u b;
    private StreamTokenizer c;

    public h()
    {
        this(new GeometryFactory());
    }

    public h(GeometryFactory geometryfactory)
    {
        a = geometryfactory;
        b = geometryfactory.getPrecisionModel();
    }

    private i a(Reader reader)
        throws e
    {
        c = new StreamTokenizer(reader);
        c.resetSyntax();
        c.wordChars(97, 122);
        c.wordChars(65, 90);
        c.wordChars(160, 255);
        c.wordChars(48, 57);
        c.wordChars(45, 45);
        c.wordChars(43, 43);
        c.wordChars(46, 46);
        c.whitespaceChars(0, 32);
        c.commentChar(35);
        try
        {
            reader = g();
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw new e(reader.toString());
        }
        return reader;
    }

    private Coordinate[] a()
        throws IOException, e
    {
        if (d().equals("EMPTY"))
        {
            return new Coordinate[0];
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(b());
        for (String s = e(); s.equals(","); s = e())
        {
            arraylist.add(b());
        }

        return (Coordinate[])arraylist.toArray(new Coordinate[arraylist.size()]);
    }

    private Point[] a(Coordinate acoordinate[])
    {
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < acoordinate.length; i1++)
        {
            arraylist.add(a.createPoint(acoordinate[i1]));
        }

        return (Point[])arraylist.toArray(new Point[0]);
    }

    private Coordinate b()
        throws IOException, e
    {
        Coordinate coordinate = new Coordinate();
        coordinate.x = c();
        coordinate.y = c();
        int i1 = c.nextToken();
        c.pushBack();
        boolean flag;
        if (i1 == -3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            coordinate.z = c();
        }
        b.a(coordinate);
        return coordinate;
    }

    private void b(String s)
        throws e
    {
        if (c.ttype == -2)
        {
            com.vividsolutions.jts.a.a.a("Unexpected NUMBER token");
        }
        if (c.ttype == 10)
        {
            com.vividsolutions.jts.a.a.a("Unexpected EOL token");
        }
        c.ttype;
        JVM INSTR lookupswitch 4: default 84
    //                   -3: 161
    //                   -2: 143
    //                   -1: 155
    //                   10: 149;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s1 = (new StringBuilder("'")).append((char)c.ttype).append("'").toString();
_L7:
        c((new StringBuilder("Expected ")).append(s).append(" but found ").append(s1).toString());
        return;
_L3:
        s1 = "<NUMBER>";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "End-of-Line";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "End-of-Stream";
        continue; /* Loop/switch isn't completed */
_L2:
        s1 = (new StringBuilder("'")).append(c.sval).append("'").toString();
        if (true) goto _L7; else goto _L6
_L6:
    }

    private double c()
        throws IOException, e
    {
        c.nextToken();
        JVM INSTR tableswitch -3 -3: default 24
    //                   -3 32;
           goto _L1 _L2
_L1:
        b("number");
        return 0.0D;
_L2:
        if (c.sval.equalsIgnoreCase("NaN"))
        {
            return (0.0D / 0.0D);
        }
        double d1 = Double.parseDouble(c.sval);
        return d1;
        NumberFormatException numberformatexception;
        numberformatexception;
        c((new StringBuilder("Invalid number: ")).append(c.sval).toString());
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void c(String s)
        throws e
    {
        throw new e((new StringBuilder()).append(s).append(" (line ").append(c.lineno()).append(")").toString());
    }

    private String d()
        throws IOException, e
    {
        String s = f();
        if (s.equals("EMPTY") || s.equals("("))
        {
            return s;
        } else
        {
            b("EMPTY or (");
            return null;
        }
    }

    private String e()
        throws IOException, e
    {
        String s = f();
        if (s.equals(",") || s.equals(")"))
        {
            return s;
        } else
        {
            b(", or )");
            return null;
        }
    }

    private String f()
        throws IOException, e
    {
        c.nextToken();
        JVM INSTR lookupswitch 4: default 48
    //                   -3: 58
    //                   40: 80
    //                   41: 83
    //                   44: 86;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        String s;
        b("word");
        s = null;
_L7:
        return s;
_L2:
        String s1;
        s1 = c.sval;
        s = s1;
        if (!s1.equalsIgnoreCase("EMPTY")) goto _L7; else goto _L6
_L6:
        return "EMPTY";
_L3:
        return "(";
_L4:
        return ")";
_L5:
        return ",";
    }

    private i g()
        throws IOException, e
    {
        Object obj;
        try
        {
            obj = f();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        catch (e e1)
        {
            return null;
        }
        if (((String) (obj)).equalsIgnoreCase("POINT"))
        {
            return h();
        }
        if (((String) (obj)).equalsIgnoreCase("LINESTRING"))
        {
            return i();
        }
        if (((String) (obj)).equalsIgnoreCase("LINEARRING"))
        {
            return j();
        }
        if (((String) (obj)).equalsIgnoreCase("POLYGON"))
        {
            return k();
        }
        if (((String) (obj)).equalsIgnoreCase("MULTIPOINT"))
        {
            if (d().equals("EMPTY"))
            {
                return a.createMultiPoint(new Point[0]);
            }
            obj = f();
            c.pushBack();
            if (obj != "(")
            {
                GeometryFactory geometryfactory = a;
                ArrayList arraylist1 = new ArrayList();
                arraylist1.add(b());
                for (obj = e(); ((String) (obj)).equals(","); obj = e())
                {
                    arraylist1.add(b());
                }

                return geometryfactory.createMultiPoint(a((Coordinate[])arraylist1.toArray(new Coordinate[arraylist1.size()])));
            }
            ArrayList arraylist = new ArrayList();
            arraylist.add(h());
            for (obj = e(); ((String) (obj)).equals(","); obj = e())
            {
                arraylist.add(h());
            }

            obj = new Point[arraylist.size()];
            return a.createMultiPoint((Point[])arraylist.toArray(((Object []) (obj))));
        }
        if (((String) (obj)).equalsIgnoreCase("MULTILINESTRING"))
        {
            return l();
        }
        if (((String) (obj)).equalsIgnoreCase("MULTIPOLYGON"))
        {
            return m();
        }
        if (((String) (obj)).equalsIgnoreCase("GEOMETRYCOLLECTION"))
        {
            return n();
        } else
        {
            c((new StringBuilder("Unknown geometry type: ")).append(((String) (obj))).toString());
            return null;
        }
    }

    private Point h()
        throws IOException, e
    {
        Point point;
        if (d().equals("EMPTY"))
        {
            point = a.createPoint(null);
        } else
        {
            Point point1 = a.createPoint(b());
            point = point1;
            if (!f().equals(")"))
            {
                b(")");
                return point1;
            }
        }
        return point;
    }

    private n i()
        throws IOException, e
    {
        return a.createLineString(a());
    }

    private p j()
        throws IOException, e
    {
        return a.createLinearRing(a());
    }

    private Polygon k()
        throws IOException, e
    {
        if (d().equals("EMPTY"))
        {
            return a.createPolygon(a.createLinearRing(new Coordinate[0]), new p[0]);
        }
        ArrayList arraylist = new ArrayList();
        p p1 = j();
        for (String s = e(); s.equals(","); s = e())
        {
            arraylist.add(j());
        }

        p ap[] = new p[arraylist.size()];
        return a.createPolygon(p1, (p[])arraylist.toArray(ap));
    }

    private q l()
        throws IOException, e
    {
        if (d().equals("EMPTY"))
        {
            return a.createMultiLineString(new n[0]);
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(i());
        for (String s = e(); s.equals(","); s = e())
        {
            arraylist.add(i());
        }

        n an[] = new n[arraylist.size()];
        return a.createMultiLineString((n[])arraylist.toArray(an));
    }

    private s m()
        throws IOException, e
    {
        if (d().equals("EMPTY"))
        {
            return a.createMultiPolygon(new Polygon[0]);
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(k());
        for (String s = e(); s.equals(","); s = e())
        {
            arraylist.add(k());
        }

        Polygon apolygon[] = new Polygon[arraylist.size()];
        return a.createMultiPolygon((Polygon[])arraylist.toArray(apolygon));
    }

    private j n()
        throws IOException, e
    {
        if (d().equals("EMPTY"))
        {
            return a.createGeometryCollection(new i[0]);
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(g());
        for (String s = e(); s.equals(","); s = e())
        {
            arraylist.add(g());
        }

        i ai[] = new i[arraylist.size()];
        return a.createGeometryCollection((i[])arraylist.toArray(ai));
    }

    public final i a(String s)
        throws e
    {
        s = new StringReader(s);
        i i1 = a(((Reader) (s)));
        s.close();
        return i1;
        Exception exception;
        exception;
        s.close();
        throw exception;
    }
}
