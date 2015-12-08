// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.app.ui.bt;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            VideoInfoFragment, WatchInfoPanelFragment

final class bw
    implements bt
{

    final VideoInfoFragment a;

    private bw(VideoInfoFragment videoinfofragment)
    {
        a = videoinfofragment;
        super();
    }

    bw(VideoInfoFragment videoinfofragment, byte byte0)
    {
        this(videoinfofragment);
    }

    public final void a(com.google.android.apps.youtube.app.ui.LoadingFrameLayout.State state)
    {
        if (state == com.google.android.apps.youtube.app.ui.LoadingFrameLayout.State.NEW)
        {
            if (VideoInfoFragment.e(a) != null)
            {
                VideoInfoFragment.e(a).b();
            }
        } else
        if (state == com.google.android.apps.youtube.app.ui.LoadingFrameLayout.State.CONTENT && VideoInfoFragment.e(a) != null)
        {
            VideoInfoFragment.e(a).a();
            return;
        }
    }
}
