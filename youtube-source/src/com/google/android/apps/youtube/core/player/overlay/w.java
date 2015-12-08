// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.View;
import com.google.android.apps.youtube.core.Analytics;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            DefaultAdOverlay, b

final class w
    implements android.view.View.OnClickListener
{

    final Analytics a;
    final DefaultAdOverlay b;

    w(DefaultAdOverlay defaultadoverlay, Analytics analytics)
    {
        b = defaultadoverlay;
        a = analytics;
        super();
    }

    public final void onClick(View view)
    {
        a.a("AdChannelClick", "Overlay");
        DefaultAdOverlay.b(b).d();
    }
}
