// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.e.p;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, ah, GDataRequest, aj

public final class ag
    implements af
{

    private final af a;

    private ag(af af1, int i)
    {
        c.a(af1);
        a = new ah(af1, 50);
    }

    static Uri a(Uri uri, int i, int j)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("start-index", String.valueOf(i));
        hashmap.put("max-results", String.valueOf(j));
        return p.a(uri, hashmap);
    }

    public static ag a(af af1)
    {
        return new ag(af1, 50);
    }

    public final void a(Object obj, b b)
    {
        obj = (GDataRequest)obj;
        a.a(obj, new aj(b));
    }
}
