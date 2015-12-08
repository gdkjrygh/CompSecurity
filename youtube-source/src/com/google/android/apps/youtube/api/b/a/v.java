// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.os.ConditionVariable;
import com.google.android.apps.youtube.api.ApiPlayer;
import com.google.android.apps.youtube.core.player.PlaybackServiceState;

// Referenced classes of package com.google.android.apps.youtube.api.b.a:
//            d

final class v
    implements Runnable
{

    final PlaybackServiceState a;
    final ConditionVariable b;
    final d c;

    v(d d1, PlaybackServiceState playbackservicestate, ConditionVariable conditionvariable)
    {
        c = d1;
        a = playbackservicestate;
        b = conditionvariable;
        super();
    }

    public final void run()
    {
        d.a(c).a(a);
        b.open();
    }
}
