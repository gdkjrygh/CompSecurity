// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.ytremote.backend.model:
//            e

public final class Params
    implements Iterable
{

    public static final Params a;
    private static final Map c;
    private final Map b;

    public Params()
    {
        this(((Map) (new HashMap())));
    }

    private Params(Map map)
    {
        b = map;
    }

    static Map a(Params params)
    {
        return params.b;
    }

    public final Params a(String s, String s1)
    {
        b.put(s, s1);
        return this;
    }

    public final Iterator iterator()
    {
        return new e(this);
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s;
        for (Iterator iterator1 = b.keySet().iterator(); iterator1.hasNext(); stringbuffer.append((new StringBuilder()).append(s).append(":").append((String)b.get(s)).append(" ").toString()))
        {
            s = (String)iterator1.next();
        }

        return stringbuffer.toString();
    }

    static 
    {
        c = Collections.emptyMap();
        a = new Params(c);
    }
}
