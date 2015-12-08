// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.datalib.legacy.model.LiveEvent;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            LiveFragment

final class ad
    implements d
{

    final LiveFragment a;

    ad(LiveFragment livefragment)
    {
        a = livefragment;
        super();
    }

    public final volatile boolean a(Object obj)
    {
        obj = (LiveEvent)obj;
        return ((LiveEvent) (obj)).status == com.google.android.apps.youtube.datalib.legacy.model.LiveEvent.Status.COMPLETED && ((LiveEvent) (obj)).video.duration != 0;
    }
}
