// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.content.DialogInterface;
import com.google.android.apps.youtube.datalib.distiller.a;
import com.google.android.apps.youtube.datalib.distiller.e;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            s, f, aa

final class z
    implements android.content.DialogInterface.OnClickListener
{

    final s a;

    z(s s1)
    {
        a = s1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        f.i(a.a);
        e e1 = com.google.android.apps.youtube.datalib.distiller.a.d();
        e1.a(com.google.android.apps.youtube.app.d.s.e(a));
        f.i(a.a).a(e1, new aa(this));
        dialoginterface.dismiss();
    }
}
