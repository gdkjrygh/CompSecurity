// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.FeedbackRating;
import com.ubercab.client.core.model.FeedbackReviewer;
import com.ubercab.client.core.model.FeedbackSubject;
import com.ubercab.client.core.model.MealReceiptRating;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.FeedbackTag;
import com.ubercab.rider.realtime.model.Item;
import com.ubercab.rider.realtime.model.TripPendingRating;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czj;
import dal;
import dar;
import dfe;
import dfp;
import dkq;
import dpg;
import dul;
import fcc;
import fcd;
import fct;
import fcu;
import fcv;
import fdn;
import hku;
import ica;
import icl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l;
import n;

public class MealReceiptActivity extends RiderActivity
{

    public static final SimpleDateFormat h = new SimpleDateFormat("MMMM dd', 'hh:mm aa", Locale.getDefault());
    ClickableSpan i;
    public String j;
    boolean k;
    fcv l;
    Map m;
    Button mSubmitButton;
    TextView mTextViewAdditionalFeedback;
    TextView mTextViewDateTime;
    TextView mTextViewPrice;
    ViewPager mViewPager;
    String n;
    public chp o;
    public cev p;
    public hku q;
    public dpg r;
    public dal s;
    public dkq t;
    private final FragmentManager u = getSupportFragmentManager();
    private List v;
    private Resources w;
    private icl x;

    public MealReceiptActivity()
    {
    }

    private static FeedbackRating a(FeedbackSubject feedbacksubject, String s1, Object obj)
    {
        return FeedbackRating.create(s1, UUID.randomUUID().toString(), obj, feedbacksubject);
    }

    private void a(Bundle bundle)
    {
        boolean flag1 = true;
        if (bundle.containsKey("fake_trip_pending_rating_items") && bundle.containsKey("fake_meal_receipt_tag_descriptions") && bundle.containsKey("fake_meal_receipt_tag_uuids"))
        {
            Object obj = bundle.getStringArrayList("fake_meal_receipt_tag_descriptions");
            ArrayList arraylist = bundle.getStringArrayList("fake_meal_receipt_tag_uuids");
            ArrayList arraylist1 = bundle.getParcelableArrayList("fake_trip_pending_rating_items");
            boolean flag;
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (arraylist == null)
            {
                flag1 = false;
            }
            if (flag1 & flag && arraylist1 != null)
            {
                a(((List) (arraylist1)), ((ArrayList) (obj)), arraylist);
            }
        }
        if (bundle.containsKey("fake_meal_receipt_datetime"))
        {
            obj = bundle.getString("fake_meal_receipt_datetime");
            mTextViewDateTime.setText(((CharSequence) (obj)));
        }
        if (bundle.containsKey("fake_meal_receipt_total"))
        {
            obj = bundle.getString("fake_meal_receipt_total");
            mTextViewPrice.setText(((CharSequence) (obj)));
        }
        if (bundle.containsKey("fake_job_uuid"))
        {
            j = bundle.getString("fake_job_uuid");
        }
        if (bundle.containsKey("fake_vehicle_view_id"))
        {
            n = bundle.getString("fake_vehicle_view_id");
        }
    }

    static void a(MealReceiptActivity mealreceiptactivity)
    {
        mealreceiptactivity.h();
    }

    public static void a(MealReceiptActivity mealreceiptactivity, TripPendingRating trippendingrating)
    {
        mealreceiptactivity.a(trippendingrating);
    }

    private void a(TripPendingRating trippendingrating)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = trippendingrating.getFeedbackTags();
        Object obj1 = trippendingrating.getItems();
        if (obj1 != null)
        {
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); arraylist.add(com.ubercab.client.core.model.Item.getInternalItem((Item)((Iterator) (obj1)).next()))) { }
        }
        obj1 = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        if (obj != null)
        {
            FeedbackTag feedbacktag;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist1.add(feedbacktag.getUuid()))
            {
                feedbacktag = (FeedbackTag)((Iterator) (obj)).next();
                ((ArrayList) (obj1)).add(feedbacktag.getDescription());
            }

        }
        a(((List) (arraylist)), ((ArrayList) (obj1)), arraylist1);
        long l1 = trippendingrating.getDropoffEpoch();
        if (l1 > 0L)
        {
            mTextViewDateTime.setText(h.format(Long.valueOf(l1)));
        }
        mTextViewPrice.setText(trippendingrating.getFareBilledToCardString());
        o.a(AnalyticsEvent.create("impression").setName(l.iB).setValue(j));
    }

    private void a(fcu fcu1)
    {
        fcu1.a(this);
    }

    private void a(List list, ArrayList arraylist, ArrayList arraylist1)
    {
        if (!list.isEmpty() && !arraylist.isEmpty() && !arraylist1.isEmpty())
        {
            v = list;
            mViewPager.setOffscreenPageLimit(list.size());
            l = new fcv(o, u, list, arraylist, arraylist1, mSubmitButton, mViewPager);
            mViewPager.setAdapter(l);
            m = fcv.a(l);
        }
    }

    private static FeedbackSubject b(String s1)
    {
        return FeedbackSubject.create("eats", s1);
    }

    private fcu b(dfp dfp)
    {
        return fcc.a().a(new dfe(this)).a(dfp).a();
    }

    public static boolean b(MealReceiptActivity mealreceiptactivity)
    {
        return mealreceiptactivity.g();
    }

    private String f()
    {
        if (v == null)
        {
            return "";
        }
        ArrayList arraylist = new ArrayList();
        Item item;
        for (Iterator iterator = v.iterator(); iterator.hasNext(); arraylist.add((new StringBuilder("- ")).append(item.getName()).append(": ").append(item.getUuid()).toString()))
        {
            item = (Item)iterator.next();
        }

        return arraylist.toString().replace("[", "").replace("]", "").replace(",", "\n");
    }

    private boolean g()
    {
        return mViewPager.getAdapter() != null;
    }

    private void h()
    {
        String s3 = f();
        Object obj = w.getString(0x7f070425);
        String s4 = w.getString(0x7f070423);
        String s1 = w.getString(0x7f070428);
        String s2 = w.getString(0x7f070429);
        String s5 = w.getString(0x7f070426);
        String s6 = w.getString(0x7f070424);
        String s7 = w.getString(0x7f070427);
        String s8 = w.getString(0x7f07042a);
        s3 = String.format("\n\n------ %s ------ \n\n %s %s \n\n %s %s \n\n %s %s \n\n %s %s \n\n %s \n %s", new Object[] {
            s4, s6, j, s8, n, obj, mTextViewDateTime.getText(), s7, mTextViewPrice.getText(), s5, 
            s3
        });
        obj = new Intent("android.intent.action.SEND");
        ((Intent) (obj)).putExtra("android.intent.extra.EMAIL", new String[] {
            s1
        });
        ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", s2);
        ((Intent) (obj)).putExtra("android.intent.extra.TEXT", s3);
        ((Intent) (obj)).setType("message/rfc822");
        startActivity(((Intent) (obj)));
    }

    private void i()
    {
        SpannableString spannablestring = new SpannableString(w.getString(0x7f070422));
        i = new ClickableSpan() {

            final MealReceiptActivity a;

            public final void onClick(View view)
            {
                MealReceiptActivity.a(a);
            }

            
            {
                a = MealReceiptActivity.this;
                super();
            }
        };
        String s1 = w.getString(0x7f070428);
        int i1 = spannablestring.length();
        spannablestring.setSpan(i, i1 - s1.length(), i1, 33);
        mTextViewAdditionalFeedback.setText(spannablestring);
        mTextViewAdditionalFeedback.setMovementMethod(LinkMovementMethod.getInstance());
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fcu)czj);
    }

    public final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300a2);
        ButterKnife.inject(this);
        bundle = getIntent();
        if (bundle != null)
        {
            bundle = bundle.getExtras();
            if (bundle != null && !bundle.isEmpty())
            {
                k = true;
                a(bundle);
            }
        }
        w = getResources();
        i();
    }

    public void onClickSubmit()
    {
        if (m == null || m.isEmpty())
        {
            return;
        }
        b(getString(0x7f07044c), null);
        ArrayList arraylist = new ArrayList();
        FeedbackReviewer feedbackreviewer = FeedbackReviewer.create("rider");
        Iterator iterator = m.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)iterator.next();
            Object obj = (MealReceiptRating)((java.util.Map.Entry) (obj1)).getValue();
            obj1 = b((String)((java.util.Map.Entry) (obj1)).getKey());
            int i1;
            if (((MealReceiptRating) (obj)).getIsPositiveRating())
            {
                i1 = MealReceiptRating.POSITIVE_VALUE;
            } else
            {
                i1 = MealReceiptRating.NEGATIVE_VALUE;
            }
            arraylist.add(a(((FeedbackSubject) (obj1)), "5-stars", Integer.valueOf(i1)));
            obj = ((MealReceiptRating) (obj)).getNegativeTagUuids();
            if (obj != null && !((List) (obj)).isEmpty())
            {
                arraylist.add(a(((FeedbackSubject) (obj1)), "tags", obj));
            }
        } while (true);
        t.a(j, feedbackreviewer, arraylist);
        s.h(j);
        p.c(new fdn(j));
        o.a(n.hP);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        x.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (!r.n() && !k)
        {
            dar1 = dar1.a();
            if (!dul.j(dar1))
            {
                setResult(-1);
                finish();
                return;
            }
            if (!g())
            {
                dar1 = dar1.getClient().getTripPendingRating();
                VehicleView vehicleview = dar1.getVehicleView();
                if (vehicleview != null && !TextUtils.isEmpty(vehicleview.getId()))
                {
                    n = vehicleview.getId();
                }
                if (!TextUtils.isEmpty(dar1.getId()) && j == null)
                {
                    j = dar1.getId();
                }
                a(dar1);
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        x = q.f().c(new fct(this, (byte)0));
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

}
