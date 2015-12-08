// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.core.Analytics;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            AutomaticPairingActivity

final class b
    implements com.google.android.apps.youtube.common.a.b
{

    final AutomaticPairingActivity a;

    b(AutomaticPairingActivity automaticpairingactivity)
    {
        a = automaticpairingactivity;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        AutomaticPairingActivity.b(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (YouTubeTvScreen)obj1;
        AutomaticPairingActivity.a(a).b("MDXPushNotificationPairingSuccessful");
        AutomaticPairingActivity.a(a, ((YouTubeTvScreen) (obj)));
    }
}
