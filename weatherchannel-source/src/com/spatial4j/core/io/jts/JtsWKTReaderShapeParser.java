// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;

import com.spatial4j.core.context.jts.JtsSpatialContext;
import com.spatial4j.core.context.jts.JtsSpatialContextFactory;
import com.spatial4j.core.distance.DistanceUtils;
import com.spatial4j.core.exception.InvalidShapeException;
import com.spatial4j.core.shape.Shape;
import com.spatial4j.core.shape.jts.JtsPoint;
import com.vividsolutions.jts.d.h;
import com.vividsolutions.jts.geom.Point;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.g;
import com.vividsolutions.jts.geom.i;
import java.text.ParseException;

// Referenced classes of package com.spatial4j.core.io.jts:
//            JtsWktShapeParser

public class JtsWKTReaderShapeParser extends JtsWktShapeParser
{

    public JtsWKTReaderShapeParser(JtsSpatialContext jtsspatialcontext, JtsSpatialContextFactory jtsspatialcontextfactory)
    {
        super(jtsspatialcontext, jtsspatialcontextfactory);
    }

    protected void checkCoordinates(i j)
    {
        j.apply(new g() {

            private boolean a;
            private JtsWKTReaderShapeParser b;

            public final void a(d d1, int k)
            {
                double d2 = d1.c(k);
                double d3 = d1.d(k);
                if (b.ctx.isGeo() && b.ctx.isNormWrapLongitude())
                {
                    double d4 = DistanceUtils.normLonDEG(d2);
                    if (Double.compare(d2, d4) != 0)
                    {
                        a = true;
                        d1.a(k, 0, d4);
                    }
                }
                b.ctx.verifyX(d2);
                b.ctx.verifyY(d3);
            }

            public final boolean a()
            {
                return a;
            }

            
            {
                b = JtsWKTReaderShapeParser.this;
                super();
                a = false;
            }
        });
    }

    public Shape parseIfSupported(String s)
        throws ParseException
    {
        return parseIfSupported(s, new h(ctx.getGeometryFactory()));
    }

    protected Shape parseIfSupported(String s, h h1)
        throws ParseException
    {
        try
        {
            s = h1.a(s);
            checkCoordinates(s);
            if (s instanceof Point)
            {
                s = (Point)s;
                if (ctx.useJtsPoint())
                {
                    return new JtsPoint(s, ctx);
                } else
                {
                    return ctx.makePoint(s.getX(), s.getY());
                }
            }
            if (s.isRectangle())
            {
                return super.makeRectFromPoly(s);
            }
            s = super.makeShapeFromGeometry(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new InvalidShapeException((new StringBuilder("error reading WKT: ")).append(s.toString()).toString(), s);
        }
        return s;
    }
}
