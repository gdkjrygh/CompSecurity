// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class av
{

    private static Random b;
    private final List a;

    private av(List list)
    {
        a = Collections.unmodifiableList(list);
    }

    public static av a(int i, List list)
    {
        ArrayList arraylist;
        c.a(list);
        arraylist = new ArrayList();
        for (int j = 0; j < list.size(); j++)
        {
            arraylist.add(Integer.valueOf(j));
        }

        if (i != 1) goto _L2; else goto _L1
_L1:
        Collections.reverse(arraylist);
_L4:
        return new av(arraylist);
_L2:
        if (i == 0)
        {
            if (b != null)
            {
                Collections.shuffle(arraylist, b);
            } else
            {
                Collections.shuffle(arraylist);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final List a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj == null || !getClass().equals(obj.getClass()))
        {
            return false;
        } else
        {
            obj = (av)obj;
            return com.google.android.apps.youtube.common.fromguava.b.a(a, ((av) (obj)).a);
        }
    }
}
