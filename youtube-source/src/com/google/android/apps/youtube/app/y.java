// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import com.google.android.apps.youtube.core.client.p;

// Referenced classes of package com.google.android.apps.youtube.app:
//            DebugOnlineAdActivity

final class y
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final DebugOnlineAdActivity a;

    y(DebugOnlineAdActivity debugonlineadactivity)
    {
        a = debugonlineadactivity;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (DebugOnlineAdActivity.e(a).isChecked())
        {
            DebugOnlineAdActivity.b(a).a((com.google.android.apps.youtube.core.client.DebugOnlyVmapAdRequester.ForceAdType)DebugOnlineAdActivity.g(a).getItem(i));
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }
}
