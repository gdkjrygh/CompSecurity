// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.youtube.p;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            SubscribeHelper, q

final class gh
    implements b
{

    final SubscribeHelper a;

    private gh(SubscribeHelper subscribehelper)
    {
        a = subscribehelper;
        super();
    }

    gh(SubscribeHelper subscribehelper, byte byte0)
    {
        this(subscribehelper);
    }

    public final void a(Object obj, Exception exception)
    {
        if ((exception instanceof HttpResponseException) && ((HttpResponseException)exception).getStatusCode() == 404)
        {
            SubscribeHelper.c(a).a(p.x);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, null);
            com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a, SubscribeHelper.SubscriptionStatus.NOT_SUBSCRIBED);
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
        com.google.android.apps.youtube.app.ui.SubscribeHelper.a(a, null);
        SubscribeHelper.e(a).c(new q());
        com.google.android.apps.youtube.app.ui.SubscribeHelper.b(a, SubscribeHelper.SubscriptionStatus.NOT_SUBSCRIBED);
    }
}
