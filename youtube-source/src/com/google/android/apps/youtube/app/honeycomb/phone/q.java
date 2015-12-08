// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            ScreenManagementActivity, ad, r

final class q
    implements android.widget.AdapterView.OnItemClickListener
{

    final ScreenManagementActivity a;

    q(ScreenManagementActivity screenmanagementactivity)
    {
        a = screenmanagementactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ad)ScreenManagementActivity.b(a).getItem(i);
        view = new ScreenManagementActivity.RenameScreenDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("YouTubeScreen", ((ad) (adapterview)).a);
        view.g(bundle);
        view.a(a.c(), "rename_tv");
        view.a(new r(this));
    }
}
