// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.app.ui.q;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.utils.ah;
import org.apache.http.client.HttpResponseException;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ChannelStoreItemRendererFactory, s

public final class p
    implements b
{

    final ChannelStoreItemRendererFactory a;
    private final s b;
    private final UserProfile c;
    private final UserProfile d;

    public p(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, s s, UserProfile userprofile, UserProfile userprofile1)
    {
        a = channelstoreitemrendererfactory;
        super();
        c = userprofile;
        d = userprofile1;
        b = s;
    }

    public final void a(Object obj, Exception exception)
    {
        if ((exception instanceof HttpResponseException) && ((HttpResponseException)exception).getStatusCode() == 404)
        {
            ah.a(ChannelStoreItemRendererFactory.d(a), com.google.android.youtube.p.x, 1);
            com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.b(a, b, c);
            ChannelStoreItemRendererFactory.m(a).a(c.uri, ChannelStoreItemRendererFactory.State.UNSUBSCRIBED.toString());
            return;
        } else
        {
            ChannelStoreItemRendererFactory.n(a).c(exception);
            com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.a(a, b, c, null);
            ChannelStoreItemRendererFactory.m(a).a(c.uri, ChannelStoreItemRendererFactory.State.SUBSCRIBED.toString());
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.b(a, b, c);
        ChannelStoreItemRendererFactory.l(a).c(new q());
        ChannelStoreItemRendererFactory.m(a).a(d.uri);
    }
}
