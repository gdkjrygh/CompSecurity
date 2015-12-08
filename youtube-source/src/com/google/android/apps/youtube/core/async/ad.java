// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, ae

public final class ad
    implements af
{

    private final af a;

    public ad(af af1)
    {
        a = (af)c.a(af1);
    }

    static void a(ad ad1, List list, List list1, b b1, b b2)
    {
        ad1.a(list, list1, b1, b2);
    }

    private void a(List list, List list1, b b1, b b2)
    {
        int i = list1.size();
        int j = Math.min(i + 50, list.size());
        if (i < j)
        {
            list = new ArrayList(list.subList(i, j));
            a.a(list, b1);
            return;
        } else
        {
            b2.a(list, list1);
            return;
        }
    }

    public final void a(Object obj, b b1)
    {
        obj = (List)obj;
        ArrayList arraylist = new ArrayList();
        a(((List) (obj)), ((List) (arraylist)), ((b) (new ae(this, ((List) (obj)), arraylist, b1))), b1);
    }
}
