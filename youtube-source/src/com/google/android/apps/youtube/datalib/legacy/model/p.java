// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r

public final class p
    implements r
{

    private final List a = new ArrayList();

    public p()
    {
    }

    public final p a(Object obj)
    {
        a.add(obj);
        return this;
    }

    public final Object build()
    {
        return new ArrayList(a);
    }
}
