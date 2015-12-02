// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.launch;

import com.ubercab.android.location.UberLocation;
import com.ubercab.ui.TextView;
import dun;
import ide;

// Referenced classes of package com.ubercab.client.feature.launch:
//            LauncherActivity

final class a
    implements ide
{

    final LauncherActivity a;

    private void a(UberLocation uberlocation)
    {
        a.mTextViewSlogan.setText(dun.a(a, uberlocation));
    }

    public final void call(Object obj)
    {
        a((UberLocation)obj);
    }

    (LauncherActivity launcheractivity)
    {
        a = launcheractivity;
        super();
    }
}
