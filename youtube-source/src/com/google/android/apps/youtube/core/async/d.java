// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.core.identity.b;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, e, f

public final class d
    implements af
{

    private final af a;
    private final b b;
    private final f c;

    private d(af af1, b b1, f f)
    {
        a = af1;
        b = b1;
        c = f;
    }

    public static d a(af af1, b b1, f f)
    {
        return new d(af1, b1, f);
    }

    static f a(d d1)
    {
        return d1.c;
    }

    static b b(d d1)
    {
        return d1.b;
    }

    static af c(d d1)
    {
        return d1.a;
    }

    public final void a(Object obj, com.google.android.apps.youtube.common.a.b b1)
    {
        a.a(obj, new e(this, b1, obj));
    }
}
