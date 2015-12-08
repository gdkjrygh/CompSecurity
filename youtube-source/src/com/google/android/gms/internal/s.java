// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, i, do, db, 
//            hh, dm, cz

final class s
    implements y
{

    s()
    {
    }

    public final void a(db db1, Map map)
    {
        String s1;
        s1 = (String)map.get("u");
        if (s1 == null)
        {
            com.google.android.gms.internal.do.d("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s1);
        Object obj = db1.f();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!((hh) (obj)).a(map))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((hh) (obj)).a(map, db1.getContext());
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new dm(db1.getContext(), db1.g().iM, map)).e();
        return;
        i j;
        j;
        com.google.android.gms.internal.do.d((new StringBuilder("Unable to append parameter to URL: ")).append(s1).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }
}
