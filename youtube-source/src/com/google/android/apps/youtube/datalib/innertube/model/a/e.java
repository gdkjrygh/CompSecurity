// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model.a;

import com.google.a.a.a.a.gm;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model.a:
//            b, c

public final class e
{

    public static List a(gm agm[])
    {
        c.a(agm);
        ArrayList arraylist = new ArrayList();
        int j = agm.length;
        int i = 0;
        while (i < j) 
        {
            gm gm1 = agm[i];
            if (gm1.d != null)
            {
                arraylist.add(new b(gm1.d));
            } else
            if (gm1.b != null)
            {
                arraylist.add(new com.google.android.apps.youtube.datalib.innertube.model.a.c(gm1.b));
            }
            i++;
        }
        return arraylist;
    }
}
