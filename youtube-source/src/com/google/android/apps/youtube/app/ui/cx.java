// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.offline.j;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.datalib.legacy.model.s;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cr

final class cx
    implements android.view.View.OnClickListener
{

    final j a;
    final cr b;

    cx(cr cr1, j j)
    {
        b = cr1;
        a = j;
        super();
    }

    public final void onClick(View view)
    {
        view = cr.i(b).b(com.google.android.apps.youtube.app.ui.cr.f(b));
        if (view == null)
        {
            com.google.android.apps.youtube.app.ui.cr.j(b).a(com.google.android.apps.youtube.app.ui.cr.f(b), a);
            return;
        }
        if (view.a(cr.d(b)))
        {
            com.google.android.apps.youtube.app.ui.cr.j(b).a(cr.d(b));
            return;
        } else
        {
            com.google.android.apps.youtube.app.ui.cr.j(b).a(com.google.android.apps.youtube.app.ui.cr.f(b));
            return;
        }
    }
}
