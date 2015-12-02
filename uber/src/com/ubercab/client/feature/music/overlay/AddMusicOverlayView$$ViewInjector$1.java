// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music.overlay;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.music.overlay:
//            AddMusicOverlayView

final class a extends DebouncingOnClickListener
{

    final AddMusicOverlayView a;
    final lay b;

    public final void doClick(View view)
    {
        a.onClickMusicOverlay();
    }

    ( , AddMusicOverlayView addmusicoverlayview)
    {
        b = ;
        a = addmusicoverlayview;
        super();
    }
}
