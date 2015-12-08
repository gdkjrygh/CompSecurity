// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.aw;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            eh, ef, ab

final class ee
    implements eh
{

    final aw a;
    final Analytics b;

    ee(aw aw, Analytics analytics)
    {
        a = aw;
        b = analytics;
        super();
    }

    public final ab a(RemoteControl remotecontrol)
    {
        return new ef(this, remotecontrol);
    }
}
