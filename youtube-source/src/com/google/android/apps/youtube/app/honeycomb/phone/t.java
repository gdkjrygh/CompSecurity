// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.common.a.a;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            v

final class t
    implements android.content.DialogInterface.OnClickListener
{

    final ScreenManagementActivity.ConfirmRemoveDialogFragment a;

    t(ScreenManagementActivity.ConfirmRemoveDialogFragment confirmremovedialogfragment)
    {
        a = confirmremovedialogfragment;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (YouTubeTvScreen)a.h().getParcelable("YouTubeScreen");
        ((YouTubeApplication)a.i().getApplication()).l().a(dialoginterface, com.google.android.apps.youtube.common.a.a.a(a.i(), new v(a, (byte)0)));
    }
}
