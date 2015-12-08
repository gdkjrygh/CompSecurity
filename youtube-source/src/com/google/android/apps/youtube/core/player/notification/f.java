// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            PlaybackControllerGroup

final class f
    implements b
{

    final String a;
    final PlaybackControllerGroup b;

    f(PlaybackControllerGroup playbackcontrollergroup, String s)
    {
        b = playbackcontrollergroup;
        a = s;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        L.b((new StringBuilder("Failed to get the video for use in playback controls: ")).append(a).toString());
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Video)obj1;
        if (obj != null && ((Video) (obj)).id.equals(a))
        {
            PlaybackControllerGroup.a(b, ((Video) (obj)));
        }
    }
}
