// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter;

import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.converter:
//            f, l, k, j, 
//            i, h, m

public final class g
{

    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "next", "previous"
    })));

    public static f a()
    {
        return a("/feed");
    }

    public static f a(String s)
    {
        c.a(s);
        f f1 = new f();
        f1.a(s, new l()).a((new StringBuilder()).append(s).append("/openSearch:totalResults").toString(), new k()).a((new StringBuilder()).append(s).append("/openSearch:startIndex").toString(), new j()).a((new StringBuilder()).append(s).append("/openSearch:itemsPerPage").toString(), new i()).a((new StringBuilder()).append(s).append("/link").toString(), new h());
        return f1;
    }

    public static f b(String s)
    {
        c.a(s);
        f f1 = new f();
        f1.a(s, new m());
        return f1;
    }

    static Set b()
    {
        return a;
    }

}
