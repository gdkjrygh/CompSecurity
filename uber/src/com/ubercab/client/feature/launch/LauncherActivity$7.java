// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import com.adjust.sdk.Adjust;
import com.adjust.sdk.OnFinishedListener;
import com.adjust.sdk.ResponseData;
import czf;

// Referenced classes of package com.ubercab.client.feature.launch:
//            LauncherActivity

final class a
    implements OnFinishedListener
{

    final LauncherActivity a;

    public final void onFinishedTracking(ResponseData responsedata)
    {
        if (responsedata.wasSuccess())
        {
            Adjust.setEnabled(Boolean.valueOf(false));
            a.s.r();
        }
        Adjust.setOnFinishedListener(null);
    }

    (LauncherActivity launcheractivity)
    {
        a = launcheractivity;
        super();
    }
}
