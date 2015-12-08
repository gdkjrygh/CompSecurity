// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, db, hh, dp, 
//            do

final class x
    implements y
{

    x()
    {
    }

    public final void a(db db1, Map map)
    {
        String s = (String)map.get("tx");
        String s1 = (String)map.get("ty");
        map = (String)map.get("td");
        int i;
        int j;
        int k;
        try
        {
            i = Integer.parseInt(s);
            j = Integer.parseInt(s1);
            k = Integer.parseInt(map);
            db1 = db1.f();
        }
        // Misplaced declaration of an exception variable
        catch (db db1)
        {
            com.google.android.gms.internal.do.d("Could not parse touch parameters from gmsg.");
            return;
        }
        if (db1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        db1.a().a(i, j, k);
    }
}
