// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.geom;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.vividsolutions.jts.geom:
//            u

public static final class a
    implements Serializable
{

    private static Map a = new HashMap();
    private static final long serialVersionUID = 0xb3467532bf594d42L;
    private String b;

    private Object readResolve()
    {
        return a.get(b);
    }

    public final String toString()
    {
        return b;
    }


    public (String s)
    {
        b = s;
        a.put(s, this);
    }
}
