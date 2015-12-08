// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.DialogInterface;
import com.google.android.apps.youtube.app.am;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            AutomaticPairingActivity

final class d
    implements android.content.DialogInterface.OnCancelListener
{

    final AutomaticPairingActivity.ConnectionErrorDialogFragment a;

    d(AutomaticPairingActivity.ConnectionErrorDialogFragment connectionerrordialogfragment)
    {
        a = connectionerrordialogfragment;
        super();
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        a.Y.n.c();
    }
}
