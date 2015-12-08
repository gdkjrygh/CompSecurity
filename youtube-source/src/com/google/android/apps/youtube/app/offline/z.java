// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            y, r

final class z
    implements android.content.DialogInterface.OnClickListener
{

    final y a;

    z(y y1)
    {
        a = y1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        r.a(a.a, y.a(a), y.b(a), y.c(a));
    }
}
