// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            s

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
        if (i == -1)
        {
            s.a(a, false);
        }
    }
}
