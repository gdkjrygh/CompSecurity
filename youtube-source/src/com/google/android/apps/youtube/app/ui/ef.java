// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.datalib.legacy.model.Event;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, ee, RemoteControlContextualMenuController

final class ef
    implements ab
{

    final RemoteControl a;
    final ee b;

    ef(ee ee1, RemoteControl remotecontrol)
    {
        b = ee1;
        a = remotecontrol;
        super();
    }

    public final volatile void a(Object obj)
    {
        Event event = (Event)obj;
        if (event.action == com.google.android.apps.youtube.datalib.legacy.model.Event.Action.VIDEO_UPLOADED)
        {
            obj = WatchFeature.GUIDE_CHANNEL_ACTIVITY_UPLOAD;
        } else
        {
            obj = WatchFeature.GUIDE_CHANNEL_ACTIVITY;
        }
        if (event.targetVideo != null)
        {
            RemoteControlContextualMenuController.a(a, event.targetVideo, ((WatchFeature) (obj)), b.a, b.b);
        }
    }
}
