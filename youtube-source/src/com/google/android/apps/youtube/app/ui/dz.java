// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, dy, RemoteControlContextualMenuController

final class dz
    implements ab
{

    final RemoteControl a;
    final dy b;

    dz(dy dy1, RemoteControl remotecontrol)
    {
        b = dy1;
        a = remotecontrol;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (Video)obj;
        RemoteControlContextualMenuController.a(a, ((Video) (obj)), b.a, b.b, b.c);
    }
}
