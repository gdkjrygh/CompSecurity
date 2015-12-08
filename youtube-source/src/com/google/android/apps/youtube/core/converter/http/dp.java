// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.core.converter.c;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            HttpMethod

public final class dp
    implements c
{

    public static final dp a;
    private final HttpMethod b;

    public dp(HttpMethod httpmethod)
    {
        b = (HttpMethod)com.google.android.apps.youtube.common.fromguava.c.a(httpmethod);
    }

    public final Object a(Object obj)
    {
        obj = (Uri)obj;
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        return b.createHttpRequest(((Uri) (obj)));
    }

    static 
    {
        a = new dp(HttpMethod.GET);
    }
}
