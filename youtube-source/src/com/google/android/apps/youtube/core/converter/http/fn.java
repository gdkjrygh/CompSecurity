// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.f;
import com.google.android.apps.youtube.core.converter.g;
import com.google.android.apps.youtube.core.converter.n;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ap, fp

public final class fn extends ap
{

    private final e c;

    public fn(n n)
    {
        super(n);
        n = g.a("/feed");
        fp.a(n, "/feed");
        c = n.a();
    }

    protected final e a()
    {
        return c;
    }
}
