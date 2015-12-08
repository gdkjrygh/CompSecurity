// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.p;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubscribeHelper, p

final class gg
    implements b
{

    final SubscribeHelper a;

    private gg(SubscribeHelper subscribehelper)
    {
        a = subscribehelper;
        super();
    }

    gg(SubscribeHelper subscribehelper, byte byte0)
    {
        this(subscribehelper);
    }

    public final void a(Object obj, Exception exception)
    {
        if ((exception instanceof HttpResponseException) && ((HttpResponseException)exception).getStatusCode() == 400)
        {
            ah.a(SubscribeHelper.f(a), p.w, 1);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, null);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a, SubscribeHelper.SubscriptionStatus.SUBSCRIBED);
            return;
        } else
        {
            SubscribeHelper.c(a).c(exception);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a);
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Subscription)obj1;
        com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, ((Subscription) (obj)).editUri);
        com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, ((Subscription) (obj)));
        SubscribeHelper.e(a).c(new com.google.android.apps.youtube.app.ui.p());
        com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a, SubscribeHelper.SubscriptionStatus.SUBSCRIBED);
    }
}
