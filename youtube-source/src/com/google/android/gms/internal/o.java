// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, do, p, db

public final class o
    implements y
{

    private final p a;

    public o(p p)
    {
        a = p;
    }

    public final void a(db db, Map map)
    {
        if ((String)map.get("name") == null)
        {
            com.google.android.gms.internal.do.d("App event with no name parameter.");
            return;
        } else
        {
            db = a;
            map.get("info");
            return;
        }
    }
}
