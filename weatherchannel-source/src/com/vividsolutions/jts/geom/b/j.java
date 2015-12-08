// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom.b;

import com.vividsolutions.jts.a.a;
import com.vividsolutions.jts.f.c;
import com.vividsolutions.jts.geom.i;
import java.util.List;

// Referenced classes of package com.vividsolutions.jts.geom.b:
//            k, h

final class j extends k
{

    public j(h h1)
    {
        super(h1);
    }

    public final boolean a(i l)
    {
        List list;
        if (!e(l))
        {
            if (((list = com.vividsolutions.jts.a.a.a(l)).size() <= 0 || !b.c().a(list)) && (l.getDimension() != 2 || !a(l, b.b())))
            {
                return false;
            }
        }
        return true;
    }
}
