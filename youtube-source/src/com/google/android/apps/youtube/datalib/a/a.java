// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.a:
//            e

public final class a
    implements e
{

    private final String a;
    private final String b;

    public a(String s, String s1)
    {
        a = c.a(s);
        b = c.a(s1);
    }

    public final void a(Map map)
    {
        map.put(a, b);
    }
}
