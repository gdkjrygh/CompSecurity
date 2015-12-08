// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.context.jts;

import com.spatial4j.core.context.SpatialContext;
import com.spatial4j.core.context.SpatialContextFactory;
import com.spatial4j.core.io.jts.JtsBinaryCodec;
import com.spatial4j.core.io.jts.JtsWktShapeParser;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.a.b;
import com.vividsolutions.jts.geom.f;
import com.vividsolutions.jts.geom.u;
import java.util.Map;

// Referenced classes of package com.spatial4j.core.context.jts:
//            JtsSpatialContext

public class JtsSpatialContextFactory extends SpatialContextFactory
{

    protected static final u defaultPrecisionModel = new u();
    public boolean allowMultiOverlap;
    public boolean autoIndex;
    public f coordinateSequenceFactory;
    public com.spatial4j.core.io.jts.JtsWktShapeParser.DatelineRule datelineRule;
    public u precisionModel;
    public int srid;
    public boolean useJtsLineString;
    public boolean useJtsPoint;
    public com.spatial4j.core.io.jts.JtsWktShapeParser.ValidationRule validationRule;

    public JtsSpatialContextFactory()
    {
        precisionModel = defaultPrecisionModel;
        srid = 0;
        coordinateSequenceFactory = b.a();
        datelineRule = com.spatial4j.core.io.jts.JtsWktShapeParser.DatelineRule.width180;
        validationRule = com.spatial4j.core.io.jts.JtsWktShapeParser.ValidationRule.error;
        autoIndex = false;
        allowMultiOverlap = false;
        useJtsPoint = true;
        useJtsLineString = true;
        super.wktShapeParserClass = com/spatial4j/core/io/jts/JtsWktShapeParser;
        super.binaryCodecClass = com/spatial4j/core/io/jts/JtsBinaryCodec;
    }

    public GeometryFactory getGeometryFactory()
    {
        if (precisionModel == null || coordinateSequenceFactory == null)
        {
            throw new IllegalStateException("precision model or coord seq factory can't be null");
        } else
        {
            return new GeometryFactory(precisionModel, srid, coordinateSequenceFactory);
        }
    }

    protected void init(Map map, ClassLoader classloader)
    {
        super.init(map, classloader);
        initField("datelineRule");
        initField("validationRule");
        initField("autoIndex");
        initField("allowMultiOverlap");
        initField("useJtsPoint");
        initField("useJtsLineString");
        classloader = (String)map.get("precisionScale");
        map = (String)map.get("precisionModel");
        if (classloader != null)
        {
            if (map != null && !map.equals("fixed"))
            {
                throw new RuntimeException((new StringBuilder("Since precisionScale was specified; precisionModel must be 'fixed' but got: ")).append(map).toString());
            }
            precisionModel = new u(Double.parseDouble(classloader));
        } else
        if (map != null)
        {
            if (map.equals("floating"))
            {
                precisionModel = new u(u.b);
                return;
            }
            if (map.equals("floating_single"))
            {
                precisionModel = new u(u.c);
                return;
            }
            if (map.equals("fixed"))
            {
                throw new RuntimeException("For fixed model, must specifiy 'precisionScale'");
            } else
            {
                throw new RuntimeException((new StringBuilder("Unknown precisionModel: ")).append(map).toString());
            }
        }
    }

    public volatile SpatialContext newSpatialContext()
    {
        return newSpatialContext();
    }

    public JtsSpatialContext newSpatialContext()
    {
        return new JtsSpatialContext(this);
    }

}
