// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            DefaultAdOverlay

final class u
    implements android.view.View.OnClickListener
{

    final DefaultAdOverlay a;

    u(DefaultAdOverlay defaultadoverlay)
    {
        a = defaultadoverlay;
        super();
    }

    public final void onClick(View view)
    {
        DefaultAdOverlay.a(a);
    }
}
