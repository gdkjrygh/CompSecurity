// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreensMonitor;
import com.google.android.apps.youtube.app.remote.bw;
import com.google.android.apps.youtube.common.a.a;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            ScreenManagementActivity, y, ab

final class z
    implements android.content.DialogInterface.OnClickListener
{

    final ScreenManagementActivity.RenameScreenDialogFragment a;
    private final EditText b;
    private final Bundle c;

    private z(ScreenManagementActivity.RenameScreenDialogFragment renamescreendialogfragment, EditText edittext, Bundle bundle)
    {
        a = renamescreendialogfragment;
        super();
        b = edittext;
        c = bundle;
    }

    z(ScreenManagementActivity.RenameScreenDialogFragment renamescreendialogfragment, EditText edittext, Bundle bundle, byte byte0)
    {
        this(renamescreendialogfragment, edittext, bundle);
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (YouTubeTvScreen)c.getParcelable("YouTubeScreen");
        String s = b.getText().toString();
        ((InputMethodManager)a.i().getSystemService("input_method")).hideSoftInputFromWindow(b.getWindowToken(), 0);
        YouTubeTvScreensMonitor youtubetvscreensmonitor = ((YouTubeApplication)a.i().getApplication()).l();
        bw bw1 = ((YouTubeApplication)a.i().getApplication()).m();
        if (dialoginterface.hasDevice())
        {
            if (com.google.android.apps.youtube.app.honeycomb.phone.ScreenManagementActivity.a(s, youtubetvscreensmonitor.a()))
            {
                com.google.android.apps.youtube.app.honeycomb.phone.ScreenManagementActivity.a(s, a.i());
                return;
            } else
            {
                youtubetvscreensmonitor.a(dialoginterface, s, com.google.android.apps.youtube.common.a.a.a(a.i(), new y(com.google.android.apps.youtube.app.honeycomb.phone.ScreenManagementActivity.RenameScreenDialogFragment.a(a), a.i())));
                return;
            }
        } else
        {
            bw1.b(com.google.android.apps.youtube.common.a.a.a(a.i(), new ab(s, dialoginterface, com.google.android.apps.youtube.app.honeycomb.phone.ScreenManagementActivity.RenameScreenDialogFragment.a(a), youtubetvscreensmonitor, a.i(), (byte)0)));
            return;
        }
    }
}
