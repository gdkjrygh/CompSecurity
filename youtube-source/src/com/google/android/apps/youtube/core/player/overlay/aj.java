// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            DefaultSurveyOverlay

final class aj
    implements android.view.View.OnClickListener
{

    final DefaultSurveyOverlay a;
    private final int b;

    public aj(DefaultSurveyOverlay defaultsurveyoverlay, int i)
    {
        a = defaultsurveyoverlay;
        super();
        b = i;
    }

    public final void onClick(View view)
    {
        DefaultSurveyOverlay.a(a, b, view);
    }
}
