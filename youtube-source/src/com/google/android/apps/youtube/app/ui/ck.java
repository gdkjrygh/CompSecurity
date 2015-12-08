// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

public final class ck
    implements d
{

    public ck()
    {
    }

    public static boolean a(Video video)
    {
        return video != null && (video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE || video.state == com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING && video.isLive());
    }

    public final volatile boolean a(Object obj)
    {
        return a((Video)obj);
    }
}
