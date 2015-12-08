// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, cv, do, db

final class cw
    implements y
{

    final cv a;

    cw(cv cv1)
    {
        a = cv1;
        super();
    }

    public final void a(db db, Map map)
    {
        synchronized (cv.a(a))
        {
            String s = (String)map.get("type");
            map = (String)map.get("errors");
            com.google.android.gms.internal.do.d((new StringBuilder("Invalid ")).append(s).append(" request error: ").append(map).toString());
            cv.a(a, 1);
            cv.a(a).notify();
        }
    }
}
