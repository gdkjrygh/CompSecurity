// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.p;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ChannelStoreItemRendererFactory, s

public final class n
    implements b
{

    final ChannelStoreItemRendererFactory a;
    private final s b;
    private final UserProfile c;

    public n(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, s s, UserProfile userprofile)
    {
        a = channelstoreitemrendererfactory;
        super();
        c = userprofile;
        b = s;
    }

    public final void a(Object obj, Exception exception)
    {
        if ((exception instanceof HttpResponseException) && ((HttpResponseException)exception).getStatusCode() == 400)
        {
            ah.a(ChannelStoreItemRendererFactory.d(a), p.w, 1);
            com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.a(a, b, c, null);
            ChannelStoreItemRendererFactory.m(a).a(c.uri, ChannelStoreItemRendererFactory.State.SUBSCRIBED.toString());
            return;
        } else
        {
            ChannelStoreItemRendererFactory.n(a).c(exception);
            com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.b(a, b, c);
            ChannelStoreItemRendererFactory.m(a).a(c.uri, ChannelStoreItemRendererFactory.State.UNSUBSCRIBED.toString());
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Subscription)obj1;
        com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.a(a, b, c, ((Subscription) (obj)).editUri);
        ChannelStoreItemRendererFactory.l(a).c(new com.google.android.apps.youtube.app.ui.p());
        ChannelStoreItemRendererFactory.m(a).a(((Subscription) (obj)));
    }
}
