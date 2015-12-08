// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import com.google.android.apps.youtube.core.player.overlay.MediaActionHelper;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            q, ApiTvControlsView

final class m
    implements q
{

    final MediaActionHelper a;
    final ApiTvControlsView b;

    m(ApiTvControlsView apitvcontrolsview, MediaActionHelper mediaactionhelper)
    {
        b = apitvcontrolsview;
        a = mediaactionhelper;
        super();
    }

    public final void a(int i)
    {
        a.a(i);
    }
}
