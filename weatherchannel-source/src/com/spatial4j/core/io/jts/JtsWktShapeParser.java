// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;

import com.spatial4j.core.context.jts.JtsSpatialContext;
import com.spatial4j.core.context.jts.JtsSpatialContextFactory;
import com.spatial4j.core.io.WktShapeParser;
import com.spatial4j.core.shape.Rectangle;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.jts.JtsGeometry;
import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.h;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.p;
import com.vividsolutions.jts.geom.u;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JtsWktShapeParser extends WktShapeParser
{
    public static final class DatelineRule extends Enum
    {

        private static final DatelineRule a[];
        public static final DatelineRule ccwRect;
        public static final DatelineRule none;
        public static final DatelineRule width180;

        public static DatelineRule valueOf(String s)
        {
            return (DatelineRule)Enum.valueOf(com/spatial4j/core/io/jts/JtsWktShapeParser$DatelineRule, s);
        }

        public static DatelineRule[] values()
        {
            return (DatelineRule[])a.clone();
        }

        static 
        {
            none = new DatelineRule("none", 0);
            width180 = new DatelineRule("width180", 1);
            ccwRect = new DatelineRule("ccwRect", 2);
            a = (new DatelineRule[] {
                none, width180, ccwRect
            });
        }

        private DatelineRule(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class ValidationRule extends Enum
    {

        private static final ValidationRule a[];
        public static final ValidationRule error;
        public static final ValidationRule none;
        public static final ValidationRule repairBuffer0;
        public static final ValidationRule repairConvexHull;

        public static ValidationRule valueOf(String s)
        {
            return (ValidationRule)Enum.valueOf(com/spatial4j/core/io/jts/JtsWktShapeParser$ValidationRule, s);
        }

        public static ValidationRule[] values()
        {
            return (ValidationRule[])a.clone();
        }

        static 
        {
            none = new ValidationRule("none", 0);
            error = new ValidationRule("error", 1);
            repairConvexHull = new ValidationRule("repairConvexHull", 2);
            repairBuffer0 = new ValidationRule("repairBuffer0", 3);
            a = (new ValidationRule[] {
                none, error, repairConvexHull, repairBuffer0
            });
        }

        private ValidationRule(String s, int j)
        {
            super(s, j);
        }
    }


    private static boolean a;
    protected final boolean autoIndex;
    protected final JtsSpatialContext ctx;
    protected final DatelineRule datelineRule;
    protected final ValidationRule validationRule;

    public JtsWktShapeParser(JtsSpatialContext jtsspatialcontext, JtsSpatialContextFactory jtsspatialcontextfactory)
    {
        super(jtsspatialcontext, jtsspatialcontextfactory);
        ctx = jtsspatialcontext;
        datelineRule = jtsspatialcontextfactory.datelineRule;
        validationRule = jtsspatialcontextfactory.validationRule;
        autoIndex = jtsspatialcontextfactory.autoIndex;
    }

    protected Coordinate coordinate(com.spatial4j.core.io.WktShapeParser.State state)
        throws ParseException
    {
        double d = ctx.normX(state.nextDouble());
        ctx.verifyX(d);
        double d1 = ctx.normY(state.nextDouble());
        ctx.verifyY(d1);
        state.skipNextDoubles();
        return new Coordinate(d, d1);
    }

    protected Coordinate[] coordinateSequence(com.spatial4j.core.io.WktShapeParser.State state)
        throws ParseException
    {
        ArrayList arraylist = new ArrayList();
        state.nextExpect('(');
        do
        {
            arraylist.add(coordinate(state));
        } while (state.nextIf(','));
        state.nextExpect(')');
        return (Coordinate[])arraylist.toArray(new Coordinate[arraylist.size()]);
    }

    protected List coordinateSequenceList(com.spatial4j.core.io.WktShapeParser.State state)
        throws ParseException
    {
        ArrayList arraylist = new ArrayList();
        state.nextExpect('(');
        do
        {
            arraylist.add(coordinateSequence(state));
        } while (state.nextIf(','));
        state.nextExpect(')');
        return arraylist;
    }

    public DatelineRule getDatelineRule()
    {
        return datelineRule;
    }

    public ValidationRule getValidationRule()
    {
        return validationRule;
    }

    public boolean isAutoIndex()
    {
        return autoIndex;
    }

    public boolean isAutoValidate()
    {
        return validationRule != ValidationRule.none;
    }

    protected Rectangle makeRectFromPoly(i j)
    {
        h h1;
        boolean flag;
        flag = true;
        if (!a && !j.isRectangle())
        {
            throw new AssertionError();
        }
        h1 = j.getEnvelopeInternal();
        if (!ctx.isGeo() || getDatelineRule() == DatelineRule.none) goto _L2; else goto _L1
_L1:
        if (getDatelineRule() != DatelineRule.ccwRect) goto _L4; else goto _L3
_L3:
        if (com.vividsolutions.jts.a.a.a(j.getCoordinates()))
        {
            flag = false;
        }
_L6:
        if (flag)
        {
            return ctx.makeRectangle(h1.e(), h1.d(), h1.f(), h1.g());
        } else
        {
            return ctx.makeRectangle(h1.d(), h1.e(), h1.f(), h1.g());
        }
_L4:
        if (h1.b() <= 180D)
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected JtsGeometry makeShapeFromGeometry(i j)
    {
        JtsGeometry jtsgeometry;
        boolean flag;
        if (getDatelineRule() != DatelineRule.none)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jtsgeometry = ctx.makeShape(j, flag, ctx.isAllowMultiOverlap());
        if (isAutoValidate())
        {
            jtsgeometry.validate();
        }
        j = jtsgeometry;
_L2:
        if (isAutoIndex())
        {
            j.index();
        }
        return j;
        RuntimeException runtimeexception;
        runtimeexception;
        if (validationRule == ValidationRule.repairConvexHull)
        {
            j = ctx.makeShape(j.convexHull(), flag, ctx.isAllowMultiOverlap());
        } else
        if (validationRule == ValidationRule.repairBuffer0)
        {
            j = ctx.makeShape(j.buffer(0.0D), flag, ctx.isAllowMultiOverlap());
        } else
        {
            throw runtimeexception;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected double normDist(double d)
    {
        return ctx.getGeometryFactory().getPrecisionModel().a(d);
    }

    protected Shape parseLineStringShape(com.spatial4j.core.io.WktShapeParser.State state)
        throws ParseException
    {
        if (!ctx.useJtsLineString())
        {
            return super.parseLineStringShape(state);
        }
        if (state.nextIfEmptyAndSkipZM())
        {
            return ctx.makeLineString(Collections.emptyList());
        } else
        {
            return makeShapeFromGeometry(ctx.getGeometryFactory().createLineString(coordinateSequence(state)));
        }
    }

    protected Shape parseMulitPolygonShape(com.spatial4j.core.io.WktShapeParser.State state)
        throws ParseException
    {
        if (state.nextIfEmptyAndSkipZM())
        {
            return ctx.makeCollection(Collections.EMPTY_LIST);
        }
        ArrayList arraylist = new ArrayList();
        state.nextExpect('(');
        do
        {
            arraylist.add(parsePolygonShape(state));
        } while (state.nextIf(','));
        state.nextExpect(')');
        return ctx.makeCollection(arraylist);
    }

    protected Shape parsePolygonShape(com.spatial4j.core.io.WktShapeParser.State state)
        throws ParseException
    {
        if (state.nextIfEmptyAndSkipZM())
        {
            state = ctx.getGeometryFactory();
            state = state.createPolygon(state.createLinearRing(new Coordinate[0]), null);
        } else
        {
            Polygon polygon1 = polygon(state);
            state = polygon1;
            if (polygon1.isRectangle())
            {
                return makeRectFromPoly(polygon1);
            }
        }
        return makeShapeFromGeometry(state);
    }

    protected Shape parseShapeByType(com.spatial4j.core.io.WktShapeParser.State state, String s)
        throws ParseException
    {
        if (s.equalsIgnoreCase("POLYGON"))
        {
            return parsePolygonShape(state);
        }
        if (s.equalsIgnoreCase("MULTIPOLYGON"))
        {
            return parseMulitPolygonShape(state);
        } else
        {
            return super.parseShapeByType(state, s);
        }
    }

    protected Polygon polygon(com.spatial4j.core.io.WktShapeParser.State state)
        throws ParseException
    {
        int j = 1;
        GeometryFactory geometryfactory = ctx.getGeometryFactory();
        List list = coordinateSequenceList(state);
        p p1 = geometryfactory.createLinearRing((Coordinate[])list.get(0));
        state = null;
        if (list.size() > 1)
        {
            state = new p[list.size() - 1];
            for (; j < list.size(); j++)
            {
                state[j - 1] = geometryfactory.createLinearRing((Coordinate[])list.get(j));
            }

        }
        return geometryfactory.createPolygon(p1, state);
    }

    static 
    {
        boolean flag;
        if (!com/spatial4j/core/io/jts/JtsWktShapeParser.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
