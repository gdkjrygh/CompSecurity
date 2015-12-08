// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, do, dm, db, 
//            cz

final class v
    implements y
{

    v()
    {
    }

    public final void a(db db1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            com.google.android.gms.internal.do.d("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new dm(db1.getContext(), db1.g().iM, map)).e();
            return;
        }
    }
}
