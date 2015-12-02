// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueSelection;
import dtb;
import exe;
import exf;
import gke;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class VenueSelectionFooterView extends LinearLayout
{

    private exe a;
    private exe b;
    private List c;
    private android.widget.AdapterView.OnItemSelectedListener d;
    private android.widget.AdapterView.OnItemSelectedListener e;
    TextView mSelectorSubtitle;
    TextView mSelectorTitle;
    Spinner mSpinnerPoint;
    Spinner mSpinnerZone;

    public VenueSelectionFooterView(Context context)
    {
        super(context);
        c = new CopyOnWriteArrayList();
    }

    public VenueSelectionFooterView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new CopyOnWriteArrayList();
    }

    public VenueSelectionFooterView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new CopyOnWriteArrayList();
    }

    static android.widget.AdapterView.OnItemSelectedListener a(VenueSelectionFooterView venueselectionfooterview)
    {
        return venueselectionfooterview.d;
    }

    private void a(GuidedPickupVenueSelection guidedpickupvenueselection)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((exf)iterator.next()).a(guidedpickupvenueselection)) { }
    }

    static void a(VenueSelectionFooterView venueselectionfooterview, GuidedPickupVenueSelection guidedpickupvenueselection)
    {
        venueselectionfooterview.a(guidedpickupvenueselection);
    }

    static exe b(VenueSelectionFooterView venueselectionfooterview)
    {
        return venueselectionfooterview.a;
    }

    private void b()
    {
        a = new exe(getContext(), 0x7f070641);
        mSpinnerPoint.setAdapter(a);
        d = new android.widget.AdapterView.OnItemSelectedListener() {

            final VenueSelectionFooterView a;

            public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.PickupFeature)VenueSelectionFooterView.b(a).a(i);
                VenueSelectionFooterView.a(a, GuidedPickupVenueSelection.create(VenueSelectionFooterView.c(a), adapterview));
                VenueSelectionFooterView.b(a).a(false);
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
                VenueSelectionFooterView.a(a, null);
                VenueSelectionFooterView.b(a).a(true);
            }

            
            {
                a = VenueSelectionFooterView.this;
                super();
            }
        };
        b = new exe(getContext(), 0);
        mSpinnerZone.setAdapter(b);
        e = new android.widget.AdapterView.OnItemSelectedListener() {

            final VenueSelectionFooterView a;

            public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature zonefeature = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature)VenueSelectionFooterView.d(a).a(i);
                boolean flag;
                if (zonefeature == null)
                {
                    adapterview = null;
                } else
                {
                    adapterview = zonefeature.getPickups();
                }
                if (adapterview != null && adapterview.size() == 1)
                {
                    view = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.PickupFeature)adapterview.get(0);
                } else
                {
                    view = null;
                }
                if (view == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a.mSpinnerPoint.setOnItemSelectedListener(null);
                VenueSelectionFooterView.b(a).a(adapterview, flag);
                a.mSpinnerPoint.post(new Runnable(this) {

                    final _cls3 a;

                    public final void run()
                    {
                        a.a.mSpinnerPoint.setSelection(0, false);
                        a.a.mSpinnerPoint.setOnItemSelectedListener(VenueSelectionFooterView.a(a.a));
                    }

            
            {
                a = _pcls3;
                super();
            }
                });
                VenueSelectionFooterView.a(a, GuidedPickupVenueSelection.create(zonefeature, view));
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
                VenueSelectionFooterView.a(a, null);
                VenueSelectionFooterView.b(a).a(null, true);
            }

            
            {
                a = VenueSelectionFooterView.this;
                super();
            }
        };
        if (isInEditMode())
        {
            b.a(gke.a(com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature.create(com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneProperties.create(null, "Terminal 1", null, null), null)), false);
            a.a(null, true);
        }
    }

    private com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature c()
    {
        return (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature)b.a(mSpinnerZone.getSelectedItemPosition());
    }

    static com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature c(VenueSelectionFooterView venueselectionfooterview)
    {
        return venueselectionfooterview.c();
    }

    static exe d(VenueSelectionFooterView venueselectionfooterview)
    {
        return venueselectionfooterview.b;
    }

    public final void a()
    {
        (new dtb((TextView)mSpinnerPoint.getChildAt(0).findViewById(0x1020014))).start();
    }

    public final void a(com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueFeature venuefeature, GuidedPickupVenueSelection guidedpickupvenueselection)
    {
        int i = 0;
        Object obj = null;
        mSpinnerPoint.setOnItemSelectedListener(null);
        mSpinnerZone.setOnItemSelectedListener(null);
        exe exe1;
        int j;
        boolean flag;
        if (venuefeature == null)
        {
            venuefeature = null;
        } else
        {
            venuefeature = venuefeature.getZones();
        }
        b.a(venuefeature, false);
        if (guidedpickupvenueselection == null)
        {
            venuefeature = null;
        } else
        {
            venuefeature = guidedpickupvenueselection.getSelectedZone();
        }
        if (guidedpickupvenueselection == null)
        {
            guidedpickupvenueselection = null;
        } else
        {
            guidedpickupvenueselection = guidedpickupvenueselection.getSelectedPickup();
        }
        j = b.a(venuefeature);
        mSpinnerZone.setSelection(j, false);
        mSpinnerZone.setOnItemSelectedListener(e);
        if (guidedpickupvenueselection == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        exe1 = a;
        if (venuefeature == null)
        {
            venuefeature = obj;
        } else
        {
            venuefeature = venuefeature.getPickups();
        }
        exe1.a(venuefeature, flag);
        if (!flag)
        {
            i = a.a(guidedpickupvenueselection);
        }
        mSpinnerPoint.post(new Runnable(i) {

            final int a;
            final VenueSelectionFooterView b;

            public final void run()
            {
                b.mSpinnerPoint.setSelection(a, false);
                b.mSpinnerPoint.setOnItemSelectedListener(VenueSelectionFooterView.a(b));
            }

            
            {
                b = VenueSelectionFooterView.this;
                a = i;
                super();
            }
        });
    }

    public final void a(exf exf1)
    {
        c.add(exf1);
    }

    public final void a(String s, String s1)
    {
        mSelectorTitle.setText(s);
        mSelectorSubtitle.setText(s1);
    }

    public final void b(exf exf1)
    {
        c.remove(exf1);
    }

    void onClickConfirmPickupLocation()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((exf)iterator.next()).b()) { }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
        b();
    }
}
