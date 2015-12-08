// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.c;

import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.j;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.geom.c:
//            f

public final class b
{

    private f a;

    public b(f f1)
    {
        a = null;
        a = f1;
    }

    public final j a(j j1)
    {
        ArrayList arraylist = new ArrayList();
        for (int l = 0; l < j1.getNumGeometries(); l++)
        {
            i k = a.a(j1.getGeometryN(l));
            if (!k.isEmpty())
            {
                arraylist.add(k);
            }
        }

        return j1.getFactory().createGeometryCollection(GeometryFactory.toGeometryArray(arraylist));
    }
}
