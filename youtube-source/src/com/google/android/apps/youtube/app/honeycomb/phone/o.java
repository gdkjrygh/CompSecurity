// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.remote.YouTubeTvScreen;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            p, ScreenManagementActivity

final class o
    implements android.view.View.OnClickListener
{

    final ScreenManagementActivity a;

    o(ScreenManagementActivity screenmanagementactivity)
    {
        a = screenmanagementactivity;
        super();
    }

    public final void onClick(View view)
    {
        view = (YouTubeTvScreen)view.getTag();
        ScreenManagementActivity.ConfirmRemoveDialogFragment confirmremovedialogfragment = new ScreenManagementActivity.ConfirmRemoveDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("YouTubeScreen", view);
        confirmremovedialogfragment.g(bundle);
        confirmremovedialogfragment.a(new p(this));
        confirmremovedialogfragment.a(a.c(), "confirm_remove_tv");
    }
}
