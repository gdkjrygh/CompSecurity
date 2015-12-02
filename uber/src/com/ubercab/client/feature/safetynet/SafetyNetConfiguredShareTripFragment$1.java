// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.view.View;
import cev;
import com.ubercab.client.core.model.SafetyNetContact;
import ffd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetConfiguredShareTripFragment, SafetyNetContactsAdapter

final class a
    implements android.view.uredShareTripFragment._cls1
{

    final SafetyNetConfiguredShareTripFragment a;

    public final void onClick(View view)
    {
        view = new ArrayList();
        for (Iterator iterator = SafetyNetConfiguredShareTripFragment.a(a).iterator(); iterator.hasNext(); view.add(((SafetyNetContact)iterator.next()).getPhone())) { }
        a.c.c(new ffd(5 - SafetyNetConfiguredShareTripFragment.b(a).c().size(), view));
    }

    Q(SafetyNetConfiguredShareTripFragment safetynetconfiguredsharetripfragment)
    {
        a = safetynetconfiguredsharetripfragment;
        super();
    }
}
