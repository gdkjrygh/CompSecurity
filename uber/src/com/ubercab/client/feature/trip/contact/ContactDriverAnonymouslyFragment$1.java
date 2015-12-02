// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.contact;

import doc;
import java.util.Map;

// Referenced classes of package com.ubercab.client.feature.trip.contact:
//            ContactDriverAnonymouslyFragment

final class a
    implements doc
{

    final ContactDriverAnonymouslyFragment a;

    public final void a(Map map, boolean flag)
    {
        map = a;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        ContactDriverAnonymouslyFragment.a(map, i);
    }

    (ContactDriverAnonymouslyFragment contactdriveranonymouslyfragment)
    {
        a = contactdriveranonymouslyfragment;
        super();
    }
}
