// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.view.View;
import gam;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            PinEtaView

final class a
    implements android.view.istener
{

    final PinEtaView a;

    public final void onClick(View view)
    {
        for (view = PinEtaView.a(a).iterator(); view.hasNext(); ((gam)view.next()).a()) { }
    }

    (PinEtaView pinetaview)
    {
        a = pinetaview;
        super();
    }
}
