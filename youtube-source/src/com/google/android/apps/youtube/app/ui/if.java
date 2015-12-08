// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ig

final class if
    implements ig
{

    private final am a;
    private final boolean b;
    private final WatchFeature c;
    private final Analytics d;
    private final com.google.android.apps.youtube.core.Analytics.VideoCategory e;

    public if(am am1, boolean flag, WatchFeature watchfeature, Analytics analytics, com.google.android.apps.youtube.core.Analytics.VideoCategory videocategory)
    {
        a = am1;
        b = flag;
        c = watchfeature;
        d = analytics;
        e = videocategory;
    }

    public final void a(Video video, int i)
    {
        d.a(e, i);
        a.a(video.id, b, c);
    }
}
