// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.offline.j;
import com.google.android.apps.youtube.app.ui.presenter.as;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cy, cr

final class cw
    implements j
{

    final cr a;

    cw(cr cr1)
    {
        a = cr1;
        super();
    }

    public final void a(com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface.OfflineAddResult offlineaddresult)
    {
        switch (cy.a[offlineaddresult.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            cr.h(a).d();
            ah.a(cr.c(a), p.l, 1);
            return;

        case 2: // '\002'
            ah.a(cr.c(a), p.dO, 1);
            return;

        case 3: // '\003'
            ah.a(cr.c(a), p.k, 1);
            break;
        }
    }
}
