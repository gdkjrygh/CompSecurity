// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.content.DialogInterface;
import com.google.android.apps.youtube.datalib.distiller.a;
import com.google.android.apps.youtube.datalib.distiller.f;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            s, f, w

final class v
    implements android.content.DialogInterface.OnClickListener
{

    final s a;

    v(s s1)
    {
        a = s1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        f.i(a.a);
        f f1 = com.google.android.apps.youtube.datalib.distiller.a.c();
        f1.a(s.e(a));
        f.i(a.a).a(f1, new w(this));
        dialoginterface.dismiss();
    }
}
