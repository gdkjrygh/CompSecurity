// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.geom.i;
import com.vividsolutions.jts.geom.o;
import com.vividsolutions.jts.geom.t;
import com.vividsolutions.jts.geom.v;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            h, e, g, b, 
//            c

public final class d
{

    public d()
    {
    }

    public static c a(i i)
    {
        if (i instanceof t)
        {
            return new h((t)i);
        }
        if (i instanceof o)
        {
            return new e((o)i);
        }
        if (i instanceof v)
        {
            return new g((v)i);
        } else
        {
            return new b(i);
        }
    }
}
