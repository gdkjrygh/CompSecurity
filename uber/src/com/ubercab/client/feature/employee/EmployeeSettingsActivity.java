// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.employee;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.realtime.RiderParcelableUnpaidBill;
import com.ubercab.client.feature.launch.LauncherActivity;
import com.ubercab.client.feature.payment.PaymentFragment;
import com.ubercab.client.feature.receipt.EnhancedReceiptDialogFragment;
import com.ubercab.client.feature.receipt.MealReceiptActivity;
import com.ubercab.client.feature.receipt.ReceiptFragment;
import com.ubercab.client.feature.search.LocationSearchFragment;
import com.ubercab.client.feature.verification.MobileVerificationSmsFragment;
import com.ubercab.client.feature.verification.MobileVerificationTokenFragment;
import com.ubercab.rider.realtime.model.FeedbackTag;
import com.ubercab.rider.realtime.model.Item;
import com.ubercab.rider.realtime.model.TripPendingRating;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.request.param.Location;
import czj;
import daj;
import dak;
import dbf;
import dfe;
import dfp;
import dzm;
import dzn;
import dzo;
import dzs;
import dzx;
import dzy;
import dzz;
import eaa;
import eab;
import eac;
import ead;
import fgf;
import gmg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EmployeeSettingsActivity extends RiderActivity
{

    public gmg h;
    public daj i;
    public dak j;
    private boolean k;

    public EmployeeSettingsActivity()
    {
    }

    private void a(dzo dzo1)
    {
        dzo1.a(this);
    }

    private dzo b(dfp dfp)
    {
        return dzm.a().a(new dfe(this)).a(dfp).a();
    }

    private static List f()
    {
        return Arrays.asList(new Location[] {
            Location.create(32.850380000000001D, -96.772329999999997D), Location.create(32.850384833D, -96.772330663999995D), Location.create(32.850380000000001D, -96.772329999999997D), Location.create(32.850384833D, -96.772330663999995D), Location.create(32.850380000000001D, -96.772319999999993D), Location.create(32.850384120999998D, -96.772322869000007D), Location.create(32.850382150999998D, -96.772320187000005D), Location.create(32.850380000000001D, -96.772319999999993D), Location.create(32.850406458999998D, -96.772331250999997D), Location.create(32.850430000000003D, -96.772329999999997D), 
            Location.create(32.850436885000001D, -96.772330496999999D), Location.create(32.850430000000003D, -96.772350000000003D), Location.create(32.850441033999999D, -96.772445077D), Location.create(32.850439999999999D, -96.772469999999998D), Location.create(32.850439999999999D, -96.772580000000005D), Location.create(32.850442332999997D, -96.772630484999993D), Location.create(32.850459999999998D, -96.772670000000005D), Location.create(32.850566176000001D, -96.772668287000002D), Location.create(32.8506D, -96.772649999999999D), Location.create(32.850769999999997D, -96.772559999999999D), 
            Location.create(32.850803048000003D, -96.772540630999998D), Location.create(32.85087D, -96.772530000000003D), Location.create(32.850909121000001D, -96.772543061999997D), Location.create(32.850929999999998D, -96.772549999999995D), Location.create(32.850971692000002D, -96.772549264000006D), Location.create(32.851010000000002D, -96.772480000000002D), Location.create(32.851016115999997D, -96.772455722000004D), Location.create(32.851019999999998D, -96.772450000000006D), Location.create(32.851019217999998D, -96.772453710999997D), Location.create(32.851019999999998D, -96.772450000000006D), 
            Location.create(32.851019217999998D, -96.772453710999997D), Location.create(32.851019999999998D, -96.772450000000006D), Location.create(32.851030000000002D, -96.772300000000001D), Location.create(32.851028731D, -96.772241397000002D), Location.create(32.851030000000002D, -96.772059999999996D), Location.create(32.851000022999997D, -96.771933696999994D), Location.create(32.850830000000002D, -96.771900000000002D), Location.create(32.850479172D, -96.772045595999998D), Location.create(32.84995D, -96.77225D), Location.create(32.849721825000003D, -96.772344661999995D), 
            Location.create(32.84948D, -96.772440000000003D), Location.create(32.848980068000003D, -96.772642722000001D), Location.create(32.848849999999999D, -96.772670000000005D), Location.create(32.848191079999999D, -96.772893843999995D), Location.create(32.847569999999997D, -96.773070000000004D), Location.create(32.847322923999997D, -96.773134404999993D), Location.create(32.84713D, -96.773219999999995D), Location.create(32.846647509999997D, -96.773355268000003D), Location.create(32.846119999999999D, -96.773610000000005D), Location.create(32.845759999999999D, -96.773790000000005D), 
            Location.create(32.845685435D, -96.773844771D), Location.create(32.845640000000003D, -96.773939999999996D), Location.create(32.845610000000001D, -96.774420000000006D), Location.create(32.845613518999997D, -96.774777928000006D), Location.create(32.845610000000001D, -96.774900000000002D), Location.create(32.845619999999997D, -96.775509999999997D), Location.create(32.845627096999998D, -96.775627267000004D), Location.create(32.84563D, -96.776110000000003D), Location.create(32.845623283999998D, -96.776334363999993D), Location.create(32.84563D, -96.776600000000002D), 
            Location.create(32.845639753999997D, -96.776733090999997D), Location.create(32.845640000000003D, -96.777019999999993D), Location.create(32.845635270000002D, -96.777110024999999D), Location.create(32.84563D, -96.777500000000003D), Location.create(32.845626719999998D, -96.777828186999997D), Location.create(32.84563D, -96.778049999999993D), Location.create(32.845619679000002D, -96.778505527999997D), Location.create(32.845619999999997D, -96.77861D), Location.create(32.845599999999997D, -96.778899999999993D), Location.create(32.845600693999998D, -96.778927557000003D), 
            Location.create(32.845579999999998D, -96.77901D), Location.create(32.845398565000004D, -96.779036438000006D), Location.create(32.845149999999997D, -96.779039999999995D), Location.create(32.845120453D, -96.779046999000002D), Location.create(32.84507D, -96.779039999999995D)
        });
    }

    private void g()
    {
        if (getFragmentManager().findFragmentByTag("PREFERENCE_FRAGMENT_TAG") == null)
        {
            getFragmentManager().beginTransaction().replace(0x7f0e010d, dzs.b(), "PREFERENCE_FRAGMENT_TAG").commit();
        }
    }

    private void h()
    {
        if (a(com/ubercab/client/feature/search/LocationSearchFragment) == null)
        {
            a(0x7f0e010d, LocationSearchFragment.a("com.ubercab.ACTION_PICKUP_LOCATION", null, null, null, null, null, false));
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dzo)czj);
    }

    public final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03005e);
        g();
    }

    public void onBackPressed()
    {
        if (k)
        {
            i.a();
            j.d();
            Intent intent = new Intent(this, com/ubercab/client/feature/launch/LauncherActivity);
            intent.addFlags(0x10008000);
            startActivity(intent);
            finish();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public void onLocationSelectedEvent(fgf fgf1)
    {
        ((dzs)getFragmentManager().findFragmentByTag("PREFERENCE_FRAGMENT_TAG")).a(fgf1.a());
        getSupportFragmentManager().popBackStack();
    }

    public void onPreferenceChangedEvent(dzx dzx)
    {
        k = true;
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        k = bundle.getBoolean("preferences_changed");
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("preferences_changed", k);
    }

    public void onShowFakeArrearsEvent(dzy dzy)
    {
        if (a(com/ubercab/client/feature/payment/PaymentFragment) == null)
        {
            dzy = new ArrayList();
            dzy.add(RiderParcelableUnpaidBill.a("", "", "", ""));
            a(0x7f0e010d, PaymentFragment.a(dzy, null));
        }
    }

    public void onShowFakeLocationSearchEvent(dzz dzz)
    {
        h();
    }

    public void onShowFakeMealPendingRatingEvent(eaa eaa1)
    {
        eaa1 = eaa1.a();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        if (eaa1.getItems() != null)
        {
            for (Iterator iterator = eaa1.getItems().iterator(); iterator.hasNext(); arraylist.add(com.ubercab.client.core.model.Item.create((Item)iterator.next()))) { }
        }
        if (eaa1.getFeedbackTags() != null)
        {
            FeedbackTag feedbacktag;
            for (Iterator iterator1 = eaa1.getFeedbackTags().iterator(); iterator1.hasNext(); arraylist2.add(feedbacktag.getUuid()))
            {
                feedbacktag = (FeedbackTag)iterator1.next();
                arraylist1.add(feedbacktag.getDescription());
            }

        }
        Intent intent = new Intent(this, com/ubercab/client/feature/receipt/MealReceiptActivity);
        Bundle bundle = new Bundle();
        bundle.putString("fake_job_uuid", eaa1.getId());
        bundle.putString("fake_meal_receipt_total", eaa1.getFareString());
        bundle.putString("fake_meal_receipt_datetime", eaa1.getDropoffTimestamp());
        bundle.putParcelableArrayList("fake_trip_pending_rating_items", arraylist);
        bundle.putStringArrayList("fake_meal_receipt_tag_descriptions", arraylist1);
        bundle.putStringArrayList("fake_meal_receipt_tag_uuids", arraylist2);
        eaa1 = eaa1.getVehicleView();
        if (eaa1 != null)
        {
            bundle.putString("fake_vehicle_view_id", eaa1.getId());
        }
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void onShowFakeSmsVerificationEvent(eab eab)
    {
        if (a(com/ubercab/client/feature/verification/MobileVerificationSmsFragment) == null)
        {
            a(0x7f0e010d, MobileVerificationSmsFragment.a());
        }
    }

    public void onShowFakeTokenVerificationEvent(eac eac)
    {
        if (a(com/ubercab/client/feature/verification/MobileVerificationTokenFragment) == null)
        {
            a(0x7f0e010d, MobileVerificationTokenFragment.a());
        }
    }

    public void onShowFakeTripPendingRatingEvent(ead ead1)
    {
        if (h.a(dbf.E))
        {
            if (a(com/ubercab/client/feature/receipt/EnhancedReceiptDialogFragment) == null)
            {
                EnhancedReceiptDialogFragment.a(this, ead1.a(), f());
            }
        } else
        if (a(com/ubercab/client/feature/receipt/ReceiptFragment) == null)
        {
            a(0x7f0e010d, ReceiptFragment.a(ead1.a()), true);
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    protected final boolean t()
    {
        return true;
    }
}
