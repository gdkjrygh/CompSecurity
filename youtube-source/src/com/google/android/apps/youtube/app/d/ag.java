// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.view.View;
import com.google.android.apps.youtube.core.identity.aa;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            ae, ah

final class ag
    implements android.view.View.OnClickListener
{

    final ae a;

    ag(ae ae1)
    {
        a = ae1;
        super();
    }

    public final void onClick(View view)
    {
        ae.d(a).a(ae.b(a), new ah(this));
    }
}
