// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            DefaultSurveyOverlay, bn

final class ag
    implements android.view.View.OnClickListener
{

    final DefaultSurveyOverlay a;

    private ag(DefaultSurveyOverlay defaultsurveyoverlay)
    {
        a = defaultsurveyoverlay;
        super();
    }

    ag(DefaultSurveyOverlay defaultsurveyoverlay, byte byte0)
    {
        this(defaultsurveyoverlay);
    }

    public final void onClick(View view)
    {
        if (DefaultSurveyOverlay.b(a) != null)
        {
            DefaultSurveyOverlay.b(a).a(DefaultSurveyOverlay.c(a), DefaultSurveyOverlay.d(a));
        }
    }
}
