// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.Optional;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubscribeHelper, gh

final class gi
    implements b
{

    final SubscribeHelper a;

    private gi(SubscribeHelper subscribehelper)
    {
        a = subscribehelper;
        super();
    }

    gi(SubscribeHelper subscribehelper, byte byte0)
    {
        this(subscribehelper);
    }

    public final void a(Object obj, Exception exception)
    {
        SubscribeHelper.c(a).c(exception);
        com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Subscription)((Optional)obj1).get();
        if (obj == null)
        {
            SubscribeHelper.c(a).a(p.x);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, null);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a, SubscribeHelper.SubscriptionStatus.NOT_SUBSCRIBED);
            return;
        } else
        {
            com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, ((Subscription) (obj)).editUri);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, ((Subscription) (obj)));
            SubscribeHelper.h(a).e(SubscribeHelper.g(a), com.google.android.apps.youtube.common.a.a.a(SubscribeHelper.f(a), new gh(a, (byte)0)));
            return;
        }
    }
}
