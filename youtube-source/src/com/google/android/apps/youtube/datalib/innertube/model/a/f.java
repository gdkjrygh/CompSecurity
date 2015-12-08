// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.a;

import android.text.Spanned;
import com.google.a.a.a.a.ge;
import com.google.a.a.a.a.gf;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.a:
//            g, c

public class f extends g
{

    private Spanned c;

    public f(ge ge1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(ge1);
        a = ge1.d;
        c = b.a(ge1.b);
        ge1 = ge1.c;
        com.google.android.apps.youtube.common.fromguava.c.a(ge1);
        ArrayList arraylist = new ArrayList();
        int j = ge1.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = ge1[i];
            if (((gf) (obj)).b != null)
            {
                arraylist.add(new com.google.android.apps.youtube.datalib.innertube.model.a.c(((gf) (obj)).b));
            }
        }

        b = arraylist;
    }
}
