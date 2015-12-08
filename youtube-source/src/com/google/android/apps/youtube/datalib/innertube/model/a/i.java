// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.a;

import com.google.a.a.a.a.go;
import com.google.a.a.a.a.gp;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.a:
//            g, c

public class i extends g
{

    private int c;

    public i(go go1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(go1);
        a = go1.d;
        c = go1.b;
        go1 = go1.c;
        com.google.android.apps.youtube.common.fromguava.c.a(go1);
        ArrayList arraylist = new ArrayList();
        int k = go1.length;
        for (int j = 0; j < k; j++)
        {
            Object obj = go1[j];
            if (((gp) (obj)).b != null)
            {
                arraylist.add(new com.google.android.apps.youtube.datalib.innertube.model.a.c(((gp) (obj)).b));
            }
        }

        b = arraylist;
    }
}
