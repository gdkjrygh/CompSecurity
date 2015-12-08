// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.UserProfile;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ChannelStoreItemRendererFactory, n, q, s

final class r
    implements b
{

    final ChannelStoreItemRendererFactory a;
    private final UserProfile b;
    private final s c;
    private final boolean d;

    public r(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, UserProfile userprofile, s s, boolean flag)
    {
        a = channelstoreitemrendererfactory;
        super();
        c = s;
        d = flag;
        b = userprofile;
    }

    public final void a(Object obj, Exception exception)
    {
        L.c((new StringBuilder("Ignoring click due to an error within processing the user profile request: ")).append(exception.getMessage()).toString());
        if (d)
        {
            com.google.android.apps.youtube.app.adapter.ChannelStoreItemRendererFactory.b(a, c, b);
            return;
        } else
        {
            ChannelStoreItemRendererFactory.a(a, c, b, null);
            return;
        }
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        if (d)
        {
            ChannelStoreItemRendererFactory.g(a).m(((UserProfile) (obj)).username, e.a(ChannelStoreItemRendererFactory.j(a), new n(a, c, b)));
            return;
        }
        obj1 = (Uri)ChannelStoreItemRendererFactory.k(a).get(b.selfUri);
        if (obj1 != null)
        {
            a.a(c, b, ((UserProfile) (obj)), ((Uri) (obj1)));
            return;
        } else
        {
            ChannelStoreItemRendererFactory.g(a).g(((UserProfile) (obj)).username, e.a(ChannelStoreItemRendererFactory.j(a), new q(a, c, b, ((UserProfile) (obj)))));
            return;
        }
    }
}
