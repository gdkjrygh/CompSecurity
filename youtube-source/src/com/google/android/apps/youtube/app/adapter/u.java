// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.youtube.datalib.legacy.model.Subscription;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            af, ChannelStoreItemRendererFactory, ai

public final class u extends af
{

    private final ChannelStoreItemRendererFactory a;

    public u(Context context, int i, ai ai, ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        super(context, i, ai);
        a = channelstoreitemrendererfactory;
    }

    public final void a(Uri uri)
    {
        a.a(uri);
    }

    public final void a(Uri uri, String s)
    {
        a.a(uri, s);
    }

    public final void a(Subscription subscription)
    {
        a.a(subscription);
    }

    public final void b(Uri uri)
    {
        a.b(uri);
    }

    public final void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
        a.a();
    }
}
