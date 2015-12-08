// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            g, ai, ak, ae

public final class aj extends g
{

    private final Context a;
    private final ai b;

    public aj(Context context, ai ai1)
    {
        a = (Context)c.a(context);
        b = (ai)c.a(ai1);
    }

    static ai a(aj aj1)
    {
        return aj1.b;
    }

    static Context b(aj aj1)
    {
        return aj1.a;
    }

    public final ae a(View view, ViewGroup viewgroup)
    {
        return new ak(this, view, viewgroup, (byte)0);
    }

    public final void a(Iterable iterable)
    {
        LinkedList linkedlist = new LinkedList();
        for (iterable = iterable.iterator(); iterable.hasNext(); linkedlist.add(((LiveEvent)iterable.next()).video)) { }
        b.a(linkedlist);
    }
}
