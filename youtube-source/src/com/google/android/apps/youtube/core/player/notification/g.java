// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            PlaybackControllerGroup

final class g
    implements b
{

    final PlaybackControllerGroup a;

    g(PlaybackControllerGroup playbackcontrollergroup)
    {
        a = playbackcontrollergroup;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        PlaybackControllerGroup.a(a, PlaybackControllerGroup.a(a));
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (Video)obj1;
        PlaybackControllerGroup.a(a, ((Video) (obj)));
    }
}
