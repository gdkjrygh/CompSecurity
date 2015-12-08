// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.datalib.innertube.model.ad;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, ec, RemoteControlContextualMenuController

final class ed
    implements ab
{

    final RemoteControl a;
    final ec b;

    ed(ec ec1, RemoteControl remotecontrol)
    {
        b = ec1;
        a = remotecontrol;
        super();
    }

    public final void a(Object obj)
    {
        obj = (ad)obj;
        RemoteControlContextualMenuController.a(a, ((ad) (obj)).f(), b.a);
    }
}
