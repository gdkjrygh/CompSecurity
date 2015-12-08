// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, GDataRequest, ag, ai

final class ah
    implements af
{

    private final af a;
    private final int b;

    public ah(af af1, int i)
    {
        a = (af)c.a(af1);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "pageSize must be greater than zero");
        b = i;
    }

    static af a(ah ah1)
    {
        return ah1.a;
    }

    public final void a(Object obj, b b1)
    {
        obj = (GDataRequest)obj;
        android.net.Uri uri = ag.a(((GDataRequest) (obj)).a, 1, b);
        a.a(((GDataRequest) (obj)).b(uri), new ai(this, ((GDataRequest) (obj)), b1));
    }
}
