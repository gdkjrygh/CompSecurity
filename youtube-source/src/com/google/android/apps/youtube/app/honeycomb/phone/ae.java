// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import com.google.android.apps.youtube.app.am;
import com.google.android.apps.youtube.app.ui.fg;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            ScreenPairingActivity

final class ae
    implements fg
{

    final ScreenPairingActivity a;

    ae(ScreenPairingActivity screenpairingactivity)
    {
        a = screenpairingactivity;
        super();
    }

    public final void a()
    {
        ScreenPairingActivity.a(a, true);
        am am1 = a.N();
        am1.a();
        am1.g();
    }
}
