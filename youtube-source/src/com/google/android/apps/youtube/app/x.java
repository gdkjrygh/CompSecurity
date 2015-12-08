// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import com.google.android.apps.youtube.core.client.p;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOnlineAdActivity

final class x
    implements android.view.View.OnClickListener
{

    final DebugOnlineAdActivity a;

    x(DebugOnlineAdActivity debugonlineadactivity)
    {
        a = debugonlineadactivity;
        super();
    }

    public final void onClick(View view)
    {
        p p1 = DebugOnlineAdActivity.b(a);
        if (DebugOnlineAdActivity.e(a).isChecked())
        {
            view = (com.google.android.apps.youtube.core.client.DebugOnlyVmapAdRequester.ForceAdType)DebugOnlineAdActivity.g(a).getItem(DebugOnlineAdActivity.f(a).getSelectedItemPosition());
        } else
        {
            view = null;
        }
        p1.a(view);
        DebugOnlineAdActivity.c(a);
    }
}
