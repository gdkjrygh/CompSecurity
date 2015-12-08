// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.api:
//            b, a

final class c
    implements b
{

    final com.google.android.apps.youtube.api.b a;

    c(com.google.android.apps.youtube.api.b b1)
    {
        a = b1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.api.a.a(a.b, null);
        com.google.android.apps.youtube.api.a.a(a.b, a.a, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (com.google.android.apps.youtube.datalib.legacy.model.b)obj1;
        com.google.android.apps.youtube.api.a.a(a.b, ((com.google.android.apps.youtube.datalib.legacy.model.b) (obj)));
        com.google.android.apps.youtube.datalib.legacy.model.b.a(com.google.android.apps.youtube.api.a.a(a.b), com.google.android.apps.youtube.api.a.b(a.b), com.google.android.apps.youtube.api.a.c(a.b));
        com.google.android.apps.youtube.api.a.a(a.b, a.a);
    }
}
