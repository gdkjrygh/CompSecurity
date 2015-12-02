// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.safetynet;

import android.view.View;
import cev;
import com.ubercab.client.core.model.SafetyNetContact;
import fei;
import ffd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.safetynet:
//            SafetyNetFragment

final class a
    implements android.view.
{

    final SafetyNetFragment a;

    public final void onClick(View view)
    {
        view = new ArrayList();
        for (Iterator iterator = a.d.f().iterator(); iterator.hasNext(); view.add(((SafetyNetContact)iterator.next()).getPhone())) { }
        a.c.c(new ffd(a.d.d(), view));
    }

    (SafetyNetFragment safetynetfragment)
    {
        a = safetynetfragment;
        super();
    }
}
