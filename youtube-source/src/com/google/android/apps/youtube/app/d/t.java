// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            s, j

final class t
    implements android.content.DialogInterface.OnClickListener
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        switch (s.a(a).a(i).intValue())
        {
        default:
            return;

        case 1: // '\001'
            s.b(a);
            return;

        case 2: // '\002'
            s.c(a);
            return;

        case 3: // '\003'
            s.d(a);
            break;
        }
    }
}
