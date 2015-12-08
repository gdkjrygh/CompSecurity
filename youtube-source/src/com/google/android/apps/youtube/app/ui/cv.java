// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cr, cl

final class cv
    implements android.view.View.OnClickListener
{

    final cr a;

    cv(cr cr1)
    {
        a = cr1;
        super();
    }

    public final void onClick(View view)
    {
        cr.g(a).a(cr.f(a), cr.b(a).title);
    }
}
