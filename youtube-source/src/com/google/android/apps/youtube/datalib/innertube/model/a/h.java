// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.a;

import com.google.a.a.a.a.gi;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.a:
//            i, f, g

public final class h
{

    public static List a(gi agi[])
    {
        c.a(agi);
        ArrayList arraylist = new ArrayList();
        int k = agi.length;
        int j = 0;
        while (j < k) 
        {
            gi gi1 = agi[j];
            if (gi1.c != null)
            {
                arraylist.add(new i(gi1.c));
            } else
            if (gi1.d != null)
            {
                arraylist.add(new f(gi1.d));
            } else
            if (gi1.b != null)
            {
                arraylist.add(new g(gi1.b));
            } else
            {
                L.e((new StringBuilder("Unsupported Guide renderer found: ")).append(gi1).toString());
            }
            j++;
        }
        return arraylist;
    }
}
