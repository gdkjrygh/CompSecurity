// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, do, db

final class w
    implements y
{

    w()
    {
    }

    public final void a(db db, Map map)
    {
        com.google.android.gms.internal.do.b((new StringBuilder("Received log message: ")).append((String)map.get("string")).toString());
    }
}
