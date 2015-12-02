// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.employee;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import eam;

// Referenced classes of package com.ubercab.client.feature.employee:
//            SimulateViewsActivity

final class a
    implements android.widget.istener
{

    final SimulateViewsActivity a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        SimulateViewsActivity.a(a, SimulateViewsActivity.a()[i]);
        SimulateViewsActivity.a(a).addView(SimulateViewsActivity.b(a).a(a.getLayoutInflater(), SimulateViewsActivity.a(a)));
        SimulateViewsActivity.a(a).setVisibility(0);
        SimulateViewsActivity.c(a).setVisibility(8);
    }

    A(SimulateViewsActivity simulateviewsactivity)
    {
        a = simulateviewsactivity;
        super();
    }
}
