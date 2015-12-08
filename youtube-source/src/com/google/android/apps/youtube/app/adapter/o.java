// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.Page;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ChannelStoreItemRendererFactory

final class o
    implements b
{

    final ChannelStoreItemRendererFactory a;

    private o(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        a = channelstoreitemrendererfactory;
        super();
    }

    o(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, byte byte0)
    {
        this(channelstoreitemrendererfactory);
    }

    public final void a(Object obj, Exception exception)
    {
        ChannelStoreItemRendererFactory.q(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Page)obj1;
        ChannelStoreItemRendererFactory.p(a).clear();
        for (obj = ((Page) (obj)).entries.iterator(); ((Iterator) (obj)).hasNext(); ChannelStoreItemRendererFactory.p(a).put(ChannelStoreItemRendererFactory.a(a, ((Subscription) (obj1))), obj1))
        {
            obj1 = (Subscription)((Iterator) (obj)).next();
        }

        ChannelStoreItemRendererFactory.q(a);
    }
}
