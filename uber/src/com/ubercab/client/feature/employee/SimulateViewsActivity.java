// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.employee;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import eal;
import eam;
import ean;

public class SimulateViewsActivity extends ListActivity
{

    private static final String a[] = {
        "Ride Hijack View", "Uber Toggle Button"
    };
    private static final eam b[] = {
        new eal(), new ean()
    };
    private ListView c;
    private LinearLayout d;
    private eam e;

    public SimulateViewsActivity()
    {
    }

    static LinearLayout a(SimulateViewsActivity simulateviewsactivity)
    {
        return simulateviewsactivity.d;
    }

    static eam a(SimulateViewsActivity simulateviewsactivity, eam eam1)
    {
        simulateviewsactivity.e = eam1;
        return eam1;
    }

    static eam[] a()
    {
        return b;
    }

    static eam b(SimulateViewsActivity simulateviewsactivity)
    {
        return simulateviewsactivity.e;
    }

    static ListView c(SimulateViewsActivity simulateviewsactivity)
    {
        return simulateviewsactivity.c;
    }

    public void onBackPressed()
    {
        if (d.getVisibility() == 0)
        {
            d.removeAllViews();
            d.setVisibility(8);
            c.setVisibility(0);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03005f);
        d = (LinearLayout)findViewById(0x7f0e010e);
        c = getListView();
        c.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final SimulateViewsActivity a;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                SimulateViewsActivity.a(a, SimulateViewsActivity.a()[i]);
                SimulateViewsActivity.a(a).addView(SimulateViewsActivity.b(a).a(a.getLayoutInflater(), SimulateViewsActivity.a(a)));
                SimulateViewsActivity.a(a).setVisibility(0);
                SimulateViewsActivity.c(a).setVisibility(8);
            }

            
            {
                a = SimulateViewsActivity.this;
                super();
            }
        });
        setListAdapter(new ArrayAdapter(this, 0x1090003, 0x1020014, a));
    }

}
