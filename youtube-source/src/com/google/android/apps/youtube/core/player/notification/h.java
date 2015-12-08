// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            PlaybackControllerGroup

final class h
    implements b
{

    final PlaybackControllerGroup a;

    h(PlaybackControllerGroup playbackcontrollergroup)
    {
        a = playbackcontrollergroup;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (Uri)obj;
        L.b((new StringBuilder("Failed to get bitmap for playback controllers with URI: ")).append(obj).toString());
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        com.google.android.apps.youtube.core.player.notification.PlaybackControllerGroup.b(a, PlaybackControllerGroup.a(a, ((Bitmap) (obj))));
    }
}
