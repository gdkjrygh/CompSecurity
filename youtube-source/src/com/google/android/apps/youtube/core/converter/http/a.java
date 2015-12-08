// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.core.converter.c;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            HttpMethod

public final class a
    implements c
{

    private com.google.android.apps.youtube.core.utils.a a;

    public a(com.google.android.apps.youtube.core.utils.a a1)
    {
        a = a1;
    }

    public final Object a(Object obj)
    {
        obj = (Uri)obj;
        com.google.android.apps.youtube.common.fromguava.c.a(obj);
        obj = a.a(((Uri) (obj)));
        return HttpMethod.GET.createHttpRequest(((Uri) (obj)));
    }
}
