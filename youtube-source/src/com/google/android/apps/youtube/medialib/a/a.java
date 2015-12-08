// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.a;

import com.google.android.exoplayer.upstream.e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.apps.youtube.medialib.a:
//            b

public final class a
    implements e
{

    private final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public a()
    {
    }

    public final void a(int i, long l, long l1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((b)iterator.next()).a(i, l)) { }
    }

    public final void a(b b1)
    {
        a.add(b1);
    }

    public final void b(b b1)
    {
        a.remove(b1);
    }
}
