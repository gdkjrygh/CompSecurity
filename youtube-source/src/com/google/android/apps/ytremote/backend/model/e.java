// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.model;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.ytremote.backend.model:
//            Params, f

final class e
    implements Iterator
{

    final Iterator a;
    final Params b;

    e(Params params)
    {
        b = params;
        super();
        a = Params.a(b).entrySet().iterator();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        return new f((String)entry.getKey(), (String)entry.getValue());
    }

    public final void remove()
    {
        a.remove();
    }
}
