// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.exception.InvalidShapeException;
import com.spatial4j.core.shape.Circle;
import com.spatial4j.core.shape.Point;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.StringTokenizer;

// Referenced classes of package com.spatial4j.core.io:
//            ParseUtils

public class LegacyShapeReadWriterFormat
{

    private LegacyShapeReadWriterFormat()
    {
    }

    private static Point a(String s, SpatialContext spatialcontext)
        throws InvalidShapeException
    {
        s = ParseUtils.parseLatitudeLongitude(s);
        return spatialcontext.makePoint(s[1], s[0]);
    }

    public static NumberFormat makeNumberFormat(int i)
    {
        NumberFormat numberformat = NumberFormat.getInstance(Locale.ROOT);
        numberformat.setGroupingUsed(false);
        numberformat.setMaximumFractionDigits(i);
        numberformat.setMinimumFractionDigits(i);
        return numberformat;
    }

    public static Shape readShapeOrNull(String s, SpatialContext spatialcontext)
        throws InvalidShapeException
    {
        Object obj;
        Object obj1;
        String s1;
        if (s == null || s.length() == 0)
        {
            throw new InvalidShapeException(s);
        }
        if (!Character.isLetter(s.charAt(0)))
        {
            break MISSING_BLOCK_LABEL_332;
        }
        if (!s.startsWith("Circle(") && !s.startsWith("CIRCLE("))
        {
            break MISSING_BLOCK_LABEL_330;
        }
        int i = s.lastIndexOf(')');
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        StringTokenizer stringtokenizer1 = new StringTokenizer(s.substring(7, i), " ");
        obj = stringtokenizer1.nextToken();
        if (((String) (obj)).indexOf(',') != -1)
        {
            obj = a(((String) (obj)), spatialcontext);
        } else
        {
            obj = spatialcontext.makePoint(Double.parseDouble(((String) (obj))), Double.parseDouble(stringtokenizer1.nextToken()));
        }
        obj1 = stringtokenizer1.nextToken();
        i = ((String) (obj1)).indexOf('=');
        if (i <= 0) goto _L2; else goto _L1
_L1:
        s1 = ((String) (obj1)).substring(0, i);
        if (!s1.equals("d") && !s1.equals("distance")) goto _L4; else goto _L3
_L3:
        obj1 = Double.valueOf(Double.parseDouble(((String) (obj1)).substring(i + 1)));
_L6:
        if (stringtokenizer1.hasMoreTokens())
        {
            throw new InvalidShapeException((new StringBuilder("Extra arguments: ")).append(stringtokenizer1.nextToken()).append(" :: ").append(s).toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        throw new InvalidShapeException((new StringBuilder("unknown arg: ")).append(s1).append(" :: ").append(s).toString());
_L2:
        obj1 = Double.valueOf(Double.parseDouble(((String) (obj1))));
        if (true) goto _L6; else goto _L5
_L5:
        if (obj1 == null)
        {
            throw new InvalidShapeException((new StringBuilder("Missing Distance: ")).append(s).toString());
        } else
        {
            return spatialcontext.makeCircle(((Point) (obj)), ((Double) (obj1)).doubleValue());
        }
        return null;
        if (s.indexOf(',') != -1)
        {
            return a(s, spatialcontext);
        }
        StringTokenizer stringtokenizer = new StringTokenizer(s, " ");
        double d = Double.parseDouble(stringtokenizer.nextToken());
        double d1 = Double.parseDouble(stringtokenizer.nextToken());
        if (stringtokenizer.hasMoreTokens())
        {
            double d2 = Double.parseDouble(stringtokenizer.nextToken());
            double d3 = Double.parseDouble(stringtokenizer.nextToken());
            if (stringtokenizer.hasMoreTokens())
            {
                throw new InvalidShapeException((new StringBuilder("Only 4 numbers supported (rect) but found more: ")).append(s).toString());
            } else
            {
                return spatialcontext.makeRectangle(d, d2, d1, d3);
            }
        } else
        {
            return spatialcontext.makePoint(d, d1);
        }
    }

    public static String writeShape(Shape shape)
    {
        return writeShape(shape, makeNumberFormat(6));
    }

    public static String writeShape(Shape shape, NumberFormat numberformat)
    {
        if (shape instanceof Point)
        {
            shape = (Point)shape;
            return (new StringBuilder()).append(numberformat.format(shape.getX())).append(" ").append(numberformat.format(shape.getY())).toString();
        }
        if (shape instanceof Rectangle)
        {
            shape = (Rectangle)shape;
            return (new StringBuilder()).append(numberformat.format(shape.getMinX())).append(" ").append(numberformat.format(shape.getMinY())).append(" ").append(numberformat.format(shape.getMaxX())).append(" ").append(numberformat.format(shape.getMaxY())).toString();
        }
        if (shape instanceof Circle)
        {
            shape = (Circle)shape;
            return (new StringBuilder("Circle(")).append(numberformat.format(shape.getCenter().getX())).append(" ").append(numberformat.format(shape.getCenter().getY())).append(" d=").append(numberformat.format(shape.getRadius())).append(")").toString();
        } else
        {
            return shape.toString();
        }
    }
}
