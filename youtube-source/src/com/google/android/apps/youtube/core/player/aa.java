// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.core.player:
//            ab

final class aa
    implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener
{

    private final ab a;

    public aa(ab ab1)
    {
        a = ab1;
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.b();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            a.a();
            return;

        case -2: 
            a.b();
            return;
        }
    }
}
