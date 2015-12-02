// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.confirm;

import android.widget.TabHost;
import fun;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.trip.confirm:
//            ConfirmationView

final class a
    implements android.widget.Listener
{

    final ConfirmationView a;

    public final void onTabChanged(String s)
    {
        a.mTabHost.getCurrentTab();
        JVM INSTR tableswitch 0 1: default 32
    //                   0 33
    //                   1 72;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        s = ConfirmationView.a(a).iterator();
        while (s.hasNext()) 
        {
            ((fun)s.next()).b();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        s = ConfirmationView.a(a).iterator();
        while (s.hasNext()) 
        {
            ((fun)s.next()).h();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    (ConfirmationView confirmationview)
    {
        a = confirmationview;
        super();
    }
}
