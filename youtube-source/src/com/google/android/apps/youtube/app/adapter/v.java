// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ai, w, ae

public final class v
    implements ai
{

    private final List a = new LinkedList();

    public v()
    {
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        LinkedList linkedlist = new LinkedList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); linkedlist.add(((ai)iterator.next()).a(view, viewgroup))) { }
        return new w(view, linkedlist);
    }

    public final v a(ai ai1)
    {
        c.a(ai1);
        a.add(ai1);
        return this;
    }

    public final void a(Iterable iterable)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((ai)iterator.next()).a(iterable)) { }
    }
}
