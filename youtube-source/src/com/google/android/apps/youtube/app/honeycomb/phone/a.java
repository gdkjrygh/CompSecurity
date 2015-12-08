// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            AutomaticPairingActivity

final class a
    implements b
{

    final AutomaticPairingActivity a;

    a(AutomaticPairingActivity automaticpairingactivity)
    {
        a = automaticpairingactivity;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        L.d("Error selecting MDX route", exception);
    }

    public final volatile void a(Object obj, Object obj1)
    {
    }
}
