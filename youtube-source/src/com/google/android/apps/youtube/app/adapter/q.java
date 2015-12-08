// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import com.google.android.apps.youtube.app.ui.gj;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.async.Optional;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import com.google.android.youtube.p;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ChannelStoreItemRendererFactory, s

public final class q
    implements b
{

    final ChannelStoreItemRendererFactory a;
    private final UserProfile b;
    private final UserProfile c;
    private final s d;

    public q(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, s s, UserProfile userprofile, UserProfile userprofile1)
    {
        a = channelstoreitemrendererfactory;
        super();
        d = s;
        b = userprofile1;
        c = userprofile;
    }

    public final void a(Object obj, Exception exception)
    {
        ChannelStoreItemRendererFactory.n(a).c(exception);
        com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.b(a, d, c);
        ChannelStoreItemRendererFactory.m(a).a(c.uri, ChannelStoreItemRendererFactory.State.UNSUBSCRIBED.toString());
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Subscription)((Optional)obj1).get();
        if (obj != null)
        {
            ChannelStoreItemRendererFactory.k(a).put(b.selfUri, ((Subscription) (obj)).editUri);
            a.a(d, c, b, ((Subscription) (obj)).editUri);
            return;
        } else
        {
            ah.a(ChannelStoreItemRendererFactory.d(a), p.x, 1);
            com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.b(a, d, c);
            ChannelStoreItemRendererFactory.l(a).c(new com.google.android.apps.youtube.app.ui.q());
            ChannelStoreItemRendererFactory.m(a).a(c.uri);
            return;
        }
    }
}
