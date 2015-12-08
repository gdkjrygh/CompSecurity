// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.Optional;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubscribeHelper

final class ge
    implements b
{

    final SubscribeHelper a;

    private ge(SubscribeHelper subscribehelper)
    {
        a = subscribehelper;
        super();
    }

    ge(SubscribeHelper subscribehelper, byte byte0)
    {
        this(subscribehelper);
    }

    public final void a(Object obj, Exception exception)
    {
        SubscribeHelper.a(a, SubscribeHelper.SubscriptionStatus.ERROR);
        SubscribeHelper.d(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Subscription)((Optional)obj1).get();
        if (obj == null)
        {
            SubscribeHelper.a(a, SubscribeHelper.SubscriptionStatus.NOT_SUBSCRIBED);
        } else
        {
            SubscribeHelper.a(a, ((Subscription) (obj)).editUri);
            SubscribeHelper.a(a, ((Subscription) (obj)));
            SubscribeHelper.a(a, SubscribeHelper.SubscriptionStatus.SUBSCRIBED);
        }
        SubscribeHelper.d(a);
    }
}
