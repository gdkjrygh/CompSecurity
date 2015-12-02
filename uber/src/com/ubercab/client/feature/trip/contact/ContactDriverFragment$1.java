// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.contact;

import doc;
import fut;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.trip.contact:
//            ContactDriverFragment

final class a
    implements doc
{

    final ContactDriverFragment a;

    public final void a(Map map, boolean flag)
    {
        if (flag)
        {
            fut.a(a.getActivity(), ContactDriverFragment.a(a));
        } else
        {
            fut.b(a.getActivity(), ContactDriverFragment.a(a));
        }
        a.dismissAllowingStateLoss();
    }

    (ContactDriverFragment contactdriverfragment)
    {
        a = contactdriverfragment;
        super();
    }
}
