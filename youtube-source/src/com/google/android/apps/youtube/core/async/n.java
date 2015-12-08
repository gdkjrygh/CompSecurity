// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.fromguava.d;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            m, o, GDataRequest, af

public final class n extends m
{

    public n(a a1, af af)
    {
        super(a1, af);
    }

    protected final d a(Object obj, Object obj1)
    {
        return new o(this, (GDataRequest)obj);
    }
}
