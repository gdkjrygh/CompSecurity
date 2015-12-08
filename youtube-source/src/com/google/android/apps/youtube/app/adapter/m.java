// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.view.View;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ChannelStoreItemRendererFactory

final class m
    implements android.view.View.OnClickListener
{

    final ChannelStoreItemRendererFactory a;

    private m(ChannelStoreItemRendererFactory channelstoreitemrendererfactory)
    {
        a = channelstoreitemrendererfactory;
        super();
    }

    m(ChannelStoreItemRendererFactory channelstoreitemrendererfactory, byte byte0)
    {
        this(channelstoreitemrendererfactory);
    }

    public final void onClick(View view)
    {
        view = (UserProfile)view.getTag();
        ChannelStoreItemRendererFactory.o(a).a(((UserProfile) (view)).uri);
    }
}
