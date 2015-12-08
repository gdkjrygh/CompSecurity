// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.ah;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            f, i

final class h
    implements ah
{

    final Runnable a;
    final f b;

    h(f f1, Runnable runnable)
    {
        b = f1;
        a = runnable;
        super();
    }

    public final void a()
    {
        f.e(b).a(com.google.android.apps.youtube.common.a.a.a(f.c(b), new i(this)));
    }

    public final void a(Exception exception)
    {
        f.d(b).c(exception);
    }

    public final void b()
    {
    }
}
