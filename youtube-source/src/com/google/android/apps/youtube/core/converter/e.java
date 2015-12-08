// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            r

public final class e
{

    final Map a;

    private e(Map map)
    {
        a = Collections.unmodifiableMap(map);
    }

    e(Map map, byte byte0)
    {
        this(map);
    }

    public final r a(String s)
    {
        return (r)a.get(s);
    }
}
