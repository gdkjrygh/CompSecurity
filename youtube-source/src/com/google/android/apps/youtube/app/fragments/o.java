// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Activity;
import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ui.f;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.datalib.legacy.model.Event;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ChannelFragment

final class o extends f
{

    final ChannelFragment a;

    o(ChannelFragment channelfragment, Activity activity, PagedView pagedview, a a1, bc bc, aw aw, boolean flag)
    {
        a = channelfragment;
        super(activity, pagedview, a1, bc, aw, true);
    }

    public final void a(Event event, int i)
    {
        if (event.targetIsVideo())
        {
            if (event.targetVideo != null)
            {
                com.google.android.apps.youtube.app.fragments.ChannelFragment.a(a).a(com.google.android.apps.youtube.core.Analytics.VideoCategory.ChannelActivity, i);
                WatchFeature watchfeature;
                if (event.action == com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_UPLOADED)
                {
                    watchfeature = WatchFeature.GUIDE_CHANNEL_ACTIVITY_UPLOAD;
                } else
                {
                    watchfeature = WatchFeature.GUIDE_CHANNEL_ACTIVITY;
                }
                ChannelFragment.b(a).a(event.target, false, watchfeature);
            }
            return;
        } else
        {
            ChannelFragment.b(a).a(event.target);
            return;
        }
    }
}
