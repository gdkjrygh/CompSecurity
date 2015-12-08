// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;

import com.spatial4j.core.context.jts.JtsSpatialContext;
import com.spatial4j.core.distance.DistanceUtils;
import com.vividsolutions.jts.geom.d;
import com.vividsolutions.jts.geom.g;

// Referenced classes of package com.spatial4j.core.io.jts:
//            JtsWKTReaderShapeParser

final class a
    implements g
{

    private boolean a;
    private JtsWKTReaderShapeParser b;

    public final void a(d d1, int i)
    {
        double d2 = d1.c(i);
        double d3 = d1.d(i);
        if (b.ctx.isGeo() && b.ctx.isNormWrapLongitude())
        {
            double d4 = DistanceUtils.normLonDEG(d2);
            if (Double.compare(d2, d4) != 0)
            {
                a = true;
                d1.a(i, 0, d4);
            }
        }
        b.ctx.verifyX(d2);
        b.ctx.verifyY(d3);
    }

    public final boolean a()
    {
        return a;
    }

    _cls9(JtsWKTReaderShapeParser jtswktreadershapeparser)
    {
        b = jtswktreadershapeparser;
        super();
        a = false;
    }
}
