// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.ytremote.model.PairingCode;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ev

final class fd
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final ev b;

    fd(ev ev1, String s)
    {
        b = ev1;
        a = s;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        ev.g(b).a("".toString(), new PairingCode(a.replaceAll("\\D", "")), ev.f(b));
    }
}
