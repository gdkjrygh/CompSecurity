// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, db, do, bp

final class t
    implements y
{

    t()
    {
    }

    public final void a(db db1, Map map)
    {
        db1 = db1.c();
        if (db1 == null)
        {
            com.google.android.gms.internal.do.d("A GMSG tried to close something that wasn't an overlay.");
            return;
        } else
        {
            db1.a();
            return;
        }
    }
}
