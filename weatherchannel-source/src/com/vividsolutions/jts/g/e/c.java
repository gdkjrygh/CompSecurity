// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.g.e;

import com.vividsolutions.jts.b.e;
import com.vividsolutions.jts.b.f;
import java.util.Map;

// Referenced classes of package com.vividsolutions.jts.g.e:
//            b

public final class c extends f
{

    public c()
    {
    }

    public final void a(e e)
    {
        b b1 = (b)a.get(e);
        if (b1 == null)
        {
            a(e, new b(e, (byte)0));
            return;
        } else
        {
            b1.a(e);
            return;
        }
    }
}
