// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.ah;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubscribeHelper

final class gb
    implements ah
{

    final SubscribeHelper a;

    gb(SubscribeHelper subscribehelper)
    {
        a = subscribehelper;
        super();
    }

    public final void a()
    {
        SubscribeHelper.a(a);
    }

    public final void a(Exception exception)
    {
        SubscribeHelper.c(a).c(exception);
        SubscribeHelper.b(a);
    }

    public final void b()
    {
        SubscribeHelper.b(a);
    }
}
