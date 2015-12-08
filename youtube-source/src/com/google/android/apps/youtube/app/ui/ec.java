// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.core.Analytics;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            eh, ed, ab

final class ec
    implements eh
{

    final Analytics a;

    ec(Analytics analytics)
    {
        a = analytics;
        super();
    }

    public final ab a(RemoteControl remotecontrol)
    {
        return new ed(this, remotecontrol);
    }
}
