// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.ui.DividerWithText;
import com.ubercab.rds.feature.trip.TripProblemActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.FeedbackType;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.rider.realtime.model.TripExtraPaymentData;
import com.ubercab.rider.realtime.model.TripPendingRating;
import com.ubercab.rider.realtime.model.TripPendingRatingDriver;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.ui.Button;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dak;
import dal;
import dar;
import dfp;
import djb;
import dkn;
import dmu;
import dpg;
import drf;
import duh;
import dul;
import fci;
import fcj;
import fcq;
import fdg;
import fdh;
import fdi;
import fdj;
import fdn;
import gmg;
import hko;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.text.SimpleDateFormat;
import java.util.Locale;
import l;
import n;

public class ReceiptFragment extends czb
    implements android.widget.RatingBar.OnRatingBarChangeListener
{

    private static final SimpleDateFormat n = new SimpleDateFormat("MMMM dd', 'hh:mm aa", Locale.getDefault());
    public chp c;
    public cev d;
    public hkr e;
    public hku f;
    public gmg g;
    public cgh h;
    public dpg i;
    public dkn j;
    public dak k;
    public dal l;
    public hko m;
    Button mButtonSubmit;
    DividerWithText mDividerText;
    EditText mEditTextComment;
    ImageView mImageViewDriverPhoto;
    ImageView mImageViewVehicle;
    RatingBar mRatingBar;
    Spinner mSpinnerFeedback;
    TextView mTextViewDriverName;
    TextView mTextViewFare;
    TextView mTextViewFareDetails;
    TextView mTextViewRewardsDetails;
    TextView mTextViewRewardsHeading;
    ViewGroup mViewGroupRewards;
    private TripPendingRating o;
    private icl p;
    private icl q;

    public ReceiptFragment()
    {
    }

    public static ReceiptFragment a()
    {
        return new ReceiptFragment();
    }

    public static ReceiptFragment a(TripPendingRating trippendingrating)
    {
        ReceiptFragment receiptfragment = new ReceiptFragment();
        receiptfragment.o = trippendingrating;
        return receiptfragment;
    }

    public static TripPendingRating a(ReceiptFragment receiptfragment)
    {
        return receiptfragment.o;
    }

    public static void a(ReceiptFragment receiptfragment, Client client, TripPendingRating trippendingrating)
    {
        receiptfragment.a(client, trippendingrating);
    }

    public static void a(ReceiptFragment receiptfragment, TripPendingRating trippendingrating)
    {
        receiptfragment.b(trippendingrating);
    }

    private void a(Client client, TripPendingRating trippendingrating)
    {
        b(trippendingrating);
        boolean flag1 = client.getLastSelectedPaymentProfileIsGoogleWallet();
        Object obj = client.getLastSelectedPaymentProfile();
        if (!flag1 && obj != null)
        {
            obj = ((PaymentProfile) (obj)).getRewardInfo();
            if (obj != null && ((RewardInfo) (obj)).isEligible() && ((RewardInfo) (obj)).isEnrolled())
            {
                trippendingrating = trippendingrating.getExtraPaymentData();
                boolean flag;
                if (trippendingrating == null || !trippendingrating.getUseAmexReward())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (((RewardInfo) (obj)).isEarnOnly() || flag)
                {
                    mTextViewRewardsHeading.setText(getString(0x7f0701ef).toUpperCase());
                } else
                {
                    mTextViewRewardsHeading.setText(getString(0x7f070360).toUpperCase());
                    mTextViewRewardsDetails.setText(getString(0x7f070394));
                    mTextViewRewardsDetails.setVisibility(0);
                }
                mViewGroupRewards.setVisibility(0);
            }
        }
        if (a(client))
        {
            mTextViewFareDetails.setText(0x7f07030a);
            mTextViewFareDetails.setVisibility(0);
            return;
        } else
        {
            mTextViewFareDetails.setVisibility(8);
            return;
        }
    }

    private void a(fdj fdj1)
    {
        fdj1.a(this);
    }

    private boolean a(Client client)
    {
        if (duh.c(g, null))
        {
            if ((client = client.findPaymentProfileByUuid(client.getLastSelectedPaymentProfileUUID())) != null && TextUtils.equals(client.getTokenType(), "cash"))
            {
                return true;
            }
        }
        return false;
    }

    private fdj b(dfp dfp)
    {
        return fci.a().a(new djb(this)).a(dfp).a();
    }

    private void b(TripPendingRating trippendingrating)
    {
        long l1 = trippendingrating.getDropoffEpoch();
        if (l1 > 0L)
        {
            d().b().b(n.format(Long.valueOf(l1)));
        }
        TripPendingRatingDriver trippendingratingdriver = trippendingrating.getDriver();
        VehicleView vehicleview;
        int i1;
        if (trippendingratingdriver != null)
        {
            mTextViewDriverName.setText(trippendingratingdriver.getName());
            h.a(trippendingratingdriver.getPictureUrl()).a(mImageViewDriverPhoto);
        } else
        {
            mTextViewDriverName.setText(null);
            mImageViewDriverPhoto.setImageDrawable(null);
        }
        vehicleview = trippendingrating.getVehicleView();
        if (vehicleview != null)
        {
            android.net.Uri uri1 = drf.a(getActivity(), vehicleview);
            android.net.Uri uri = uri1;
            if (uri1 == null)
            {
                uri = drf.a(vehicleview);
            }
            h.a(uri).a(mImageViewVehicle);
            mImageViewVehicle.setContentDescription(vehicleview.getDescription());
            if ("2518".equals(vehicleview.getId()))
            {
                mDividerText.a(getString(0x7f07038d));
            }
        } else
        {
            mImageViewVehicle.setImageDrawable(null);
            mImageViewVehicle.setContentDescription(null);
        }
        mTextViewFare.setText(trippendingrating.getFareBilledToCardString());
        i1 = mSpinnerFeedback.getSelectedItemPosition();
        trippendingrating = new fcq(getActivity(), trippendingrating.getFeedbackTypes());
        mSpinnerFeedback.setAdapter(trippendingrating);
        mSpinnerFeedback.setSelection(i1);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((fdj)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClickSubmit()
    {
        Object obj2 = null;
        Object obj = e.d();
        if (obj != null)
        {
            obj = ((ClientStatus) (obj)).getTripPendingRating();
        } else
        {
            obj = null;
        }
        if (obj == null || TextUtils.isEmpty(((TripPendingRating) (obj)).getId()))
        {
            return;
        }
        String s = ((TripPendingRating) (obj)).getId();
        b(getString(0x7f07044c));
        int j1 = mRatingBar.getProgress();
        String s1 = mEditTextComment.getText().toString();
        int i1;
        if (j1 < 4)
        {
            i1 = ((FeedbackType)mSpinnerFeedback.getSelectedItem()).getId().intValue();
        } else
        {
            i1 = 0;
        }
        if (!i.m())
        {
            j.a(s, j1, i1, s1);
        } else
        {
            Object obj1 = obj2;
            if (k.b() != null)
            {
                obj1 = obj2;
                if (k.b().getUberLatLng() != null)
                {
                    obj1 = k.b().getUberLatLng();
                    obj1 = Location.create(((UberLatLng) (obj1)).a(), ((UberLatLng) (obj1)).b());
                }
            }
            q = m.a(s, j1, Integer.valueOf(i1), s1, ((Location) (obj1))).a(ico.a()).a(new fdi(this, (byte)0));
        }
        l.h(s);
        l.a("receipt_submission_status_identifier", true);
        d.c(new fdn(s));
        c.a(AnalyticsEvent.create("tap").setName(n.dY).setValue(s));
    }

    public void onClickSupport()
    {
        Object obj = e.d();
        if (obj != null)
        {
            obj = ((ClientStatus) (obj)).getTripPendingRating();
        } else
        {
            obj = null;
        }
        if (obj == null || TextUtils.isEmpty(((TripPendingRating) (obj)).getId()))
        {
            return;
        } else
        {
            obj = ((TripPendingRating) (obj)).getId();
            startActivity(TripProblemActivity.a(d(), ((String) (obj))).putExtra("com.ubercab.rds.RETURN_LOCATION", "com.ubercab.rds.RETURN_TRIP_PROBLEM"));
            c.a(n.ep);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030160, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onPause()
    {
        super.onPause();
        p.b();
        if (q != null)
        {
            q.b();
            q = null;
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!i.n())
        {
            dar1 = dar1.a();
            if (o != null)
            {
                b(o);
                return;
            }
            if (dul.j(dar1))
            {
                dar1 = dar1.getClient();
                a(dar1, dar1.getTripPendingRating());
                return;
            }
        }
    }

    public void onRatingChanged(RatingBar ratingbar, float f1, boolean flag)
    {
        ratingbar = mButtonSubmit;
        if (f1 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ratingbar.setEnabled(flag);
        if (f1 > 0.0F && f1 < 4F)
        {
            mSpinnerFeedback.setVisibility(0);
            mEditTextComment.setHint(getString(0x7f070306));
            mEditTextComment.requestFocus();
        } else
        {
            mSpinnerFeedback.setVisibility(8);
            mEditTextComment.setHint(getString(0x7f070291));
        }
        ratingbar = e.d();
        if (ratingbar != null)
        {
            ratingbar = ratingbar.getTripPendingRating();
        } else
        {
            ratingbar = null;
        }
        if (ratingbar != null && !TextUtils.isEmpty(ratingbar.getId()))
        {
            c.a(AnalyticsEvent.create("tap").setName(n.dX).setValue((new StringBuilder()).append(ratingbar.getId()).append(":").append(String.valueOf(f1)).toString()));
        }
    }

    public void onRatingDriverResponseEvent(dmu dmu)
    {
        e();
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f07067c));
        p = ica.a(f.d(), f.e(), new fdh((byte)0)).a(ico.a()).c(new fdg(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mRatingBar.setOnRatingBarChangeListener(this);
        mButtonSubmit.setText(getString(0x7f07044b));
        mEditTextComment.setHint(getString(0x7f070291));
        view = e.d();
        if (view != null)
        {
            view = view.getTripPendingRating();
        } else
        {
            view = null;
        }
        if (view != null && !TextUtils.isEmpty(view.getId()))
        {
            c.a(AnalyticsEvent.create("impression").setName(l.fR).setValue(view.getId()));
        }
        view = e.c();
        if (view != null && a(view))
        {
            c.a(l.fS);
        }
    }

}
