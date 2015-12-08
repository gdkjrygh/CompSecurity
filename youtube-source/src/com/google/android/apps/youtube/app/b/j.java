// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.b;

import android.util.Pair;
import com.google.android.apps.youtube.core.client.a.d;
import com.google.android.apps.youtube.core.player.event.n;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.b:
//            e

final class j
    implements d
{

    final e a;

    j(e e)
    {
        a = e;
        super();
    }

    public final List a(Object obj)
    {
        n n1 = (n)obj;
        LinkedList linkedlist = new LinkedList();
        if (n1.b)
        {
            obj = "exo";
        } else
        {
            obj = "fw";
        }
        linkedlist.add(new Pair("yt_pt", obj));
        if (n1.c)
        {
            linkedlist.add(new Pair("mod_adap", "1"));
        }
        return linkedlist;
    }
}
