// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            s

final class u
    implements android.content.DialogInterface.OnClickListener
{

    final s a;

    u(s s)
    {
        a = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }
}
