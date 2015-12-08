// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;
import com.google.android.apps.youtube.datalib.d.a;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hh

final class hi
    implements android.content.DialogInterface.OnClickListener
{

    final hh a;

    hi(hh hh1)
    {
        a = hh1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        hh.b(a).a(com.google.android.apps.youtube.app.ui.hh.a(a));
    }
}
