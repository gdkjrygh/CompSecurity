// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.view.View;
import gan;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            PinView

final class a
    implements android.view.ckListener
{

    final PinView a;

    public final void onClick(View view)
    {
        for (view = PinView.a(a).iterator(); view.hasNext(); ((gan)view.next()).g()) { }
    }

    (PinView pinview)
    {
        a = pinview;
        super();
    }
}
