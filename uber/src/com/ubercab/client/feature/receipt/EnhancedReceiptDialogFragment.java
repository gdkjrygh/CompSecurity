// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import chp;
import cia;
import cic;
import ciq;
import cjf;
import cjg;
import cjk;
import cjn;
import cjq;
import cjs;
import cjt;
import cjw;
import cjy;
import cjz;
import cka;
import ckc;
import ckd;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLatLngBounds;
import com.ubercab.android.map.MapView;
import com.ubercab.android.map.Marker;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rds.feature.trip.TripProblemActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.TripPendingRating;
import com.ubercab.rider.realtime.model.TripPendingRatingDriver;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.ui.Button;
import com.ubercab.ui.CircleImageView;
import com.ubercab.ui.EditText;
import com.ubercab.ui.TextView;
import cwz;
import cyz;
import czj;
import dak;
import dal;
import dar;
import dbf;
import dce;
import dfp;
import diw;
import dkn;
import dru;
import dtz;
import duh;
import dul;
import eel;
import fca;
import fcb;
import fck;
import fcl;
import fcm;
import fcn;
import fco;
import fcr;
import fcs;
import fdn;
import gjz;
import gmg;
import hko;
import hkr;
import hku;
import ica;
import icl;
import ico;
import ijg;
import ijj;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l;
import n;

public class EnhancedReceiptDialogFragment extends cyz
    implements android.widget.RatingBar.OnRatingBarChangeListener, fcs
{

    private static final SimpleDateFormat s = new SimpleDateFormat("MMMM dd', 'hh:mm aa", Locale.getDefault());
    private fcr A;
    private RadioButton B;
    private int C;
    private UberLatLngBounds D;
    private TripPendingRating E;
    public chp a;
    public cev b;
    public hkr c;
    public hku d;
    public gmg g;
    public dak h;
    public cgh i;
    public dce j;
    public RiderApplication k;
    public dkn l;
    public dak m;
    Button mButtonHelp;
    EditText mEditTextComment;
    GridView mGridView;
    CircleImageView mImageViewDriverAvatar;
    CircleImageView mImageViewDriverPhoto;
    MapView mMapView;
    RatingBar mRatingBar;
    TextView mTextViewComment;
    TextView mTextViewDone;
    TextView mTextViewDriverName;
    TextView mTextViewDriverVehicle;
    TextView mTextViewFare;
    TextView mTextViewFareDetails;
    TextView mTextViewSubTitle;
    TextView mTextViewTitle;
    LinearLayout mViewBottomDrawer;
    FrameLayout mViewDriverFare;
    LinearLayout mViewDropoff;
    LinearLayout mViewFeedback;
    LinearLayout mViewGroupSubmit;
    LinearLayout mViewMapLayout;
    LinearLayout mViewReceipt;
    FrameLayout mViewReceiptLayout;
    LinearLayout mViewTitleLayout;
    public dal n;
    public hko o;
    final cjs p = new cjs() {

        final EnhancedReceiptDialogFragment a;

        public final void a(UberLatLng uberlatlng)
        {
            EnhancedReceiptDialogFragment.a(a);
        }

            
            {
                a = EnhancedReceiptDialogFragment.this;
                super();
            }
    };
    final cjq q = new cjq() {

        final EnhancedReceiptDialogFragment a;

        public final void a(cjg cjg)
        {
            if (a.mMapView.getVisibility() == 4)
            {
                a.mMapView.setVisibility(0);
            }
        }

            
            {
                a = EnhancedReceiptDialogFragment.this;
                super();
            }
    };
    cjn r;
    private icl t;
    private icl u;
    private icl v;
    private List w;
    private cjy x;
    private cjk y;
    private Bundle z;

    public EnhancedReceiptDialogFragment()
    {
    }

    private static UberLatLngBounds a(UberLatLng uberlatlng, UberLatLng uberlatlng1, List list)
    {
        uberlatlng = (new ciq()).a(uberlatlng);
        uberlatlng.a(uberlatlng1);
        for (uberlatlng1 = list.iterator(); uberlatlng1.hasNext(); uberlatlng.a(new UberLatLng(list.getLatitude(), list.getLongitude())))
        {
            list = (Location)uberlatlng1.next();
        }

        return uberlatlng.a();
    }

    public static EnhancedReceiptDialogFragment a(RiderActivity rideractivity)
    {
        EnhancedReceiptDialogFragment enhancedreceiptdialogfragment = new EnhancedReceiptDialogFragment();
        enhancedreceiptdialogfragment.show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/receipt/EnhancedReceiptDialogFragment.getName());
        enhancedreceiptdialogfragment.setCancelable(false);
        return enhancedreceiptdialogfragment;
    }

    public static EnhancedReceiptDialogFragment a(RiderActivity rideractivity, TripPendingRating trippendingrating, List list)
    {
        gjz.a(rideractivity);
        gjz.a(trippendingrating);
        gjz.a(list);
        EnhancedReceiptDialogFragment enhancedreceiptdialogfragment = new EnhancedReceiptDialogFragment();
        enhancedreceiptdialogfragment.E = trippendingrating;
        enhancedreceiptdialogfragment.show(rideractivity.getSupportFragmentManager(), com/ubercab/client/feature/receipt/EnhancedReceiptDialogFragment.getName());
        enhancedreceiptdialogfragment.setCancelable(false);
        enhancedreceiptdialogfragment.w = list;
        return enhancedreceiptdialogfragment;
    }

    private dru a(boolean flag)
    {
        return new dru(flag) {

            final boolean a;
            final EnhancedReceiptDialogFragment b;

            public final void onAnimationEnd(Animation animation)
            {
                byte byte0 = 8;
                boolean flag1 = false;
                if (b.isAdded())
                {
                    animation = b.mViewBottomDrawer;
                    int i1;
                    if (a)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                    animation.setVisibility(i1);
                    animation = b.mTextViewDone;
                    if (a)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 0;
                    }
                    animation.setVisibility(i1);
                    animation = b.mButtonHelp;
                    if (a)
                    {
                        i1 = ((flag1) ? 1 : 0);
                    } else
                    {
                        i1 = 4;
                    }
                    animation.setVisibility(i1);
                }
            }

            public final void onAnimationStart(Animation animation)
            {
                if (EnhancedReceiptDialogFragment.g(b) && a)
                {
                    EnhancedReceiptDialogFragment.a(b, 4);
                    EnhancedReceiptDialogFragment.a(b, false);
                } else
                {
                    animation = b;
                    int i1;
                    if (a)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 2;
                    }
                    EnhancedReceiptDialogFragment.a(animation, i1);
                    EnhancedReceiptDialogFragment.a(b, a);
                }
                b.mTextViewDone.setVisibility(4);
                b.mButtonHelp.setVisibility(4);
            }

            
            {
                b = EnhancedReceiptDialogFragment.this;
                a = flag;
                super();
            }
        };
    }

    static icl a(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, icl icl1)
    {
        enhancedreceiptdialogfragment.u = icl1;
        return icl1;
    }

    private void a(int i1)
    {
        String s1 = mTextViewTitle.getText().toString();
        i1;
        JVM INSTR tableswitch 1 4: default 44
    //                   1 61
    //                   2 72
    //                   3 83
    //                   4 94;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_94;
_L1:
        Object obj = getString(0x7f07067b);
_L6:
        if (s1.equals(obj))
        {
            return;
        } else
        {
            mTextViewTitle.setText(((CharSequence) (obj)));
            obj = AnimationUtils.loadAnimation(getContext(), 0x7f04000c);
            mTextViewTitle.startAnimation(((Animation) (obj)));
            return;
        }
_L2:
        obj = getString(0x7f07067b);
          goto _L6
_L3:
        obj = getString(0x7f07049b);
          goto _L6
_L4:
        obj = getString(0x7f070292);
          goto _L6
        obj = getString(0x7f070393);
          goto _L6
    }

    private void a(AnalyticsEvent analyticsevent, cia cia, String s1, String s2)
    {
        gjz.a(analyticsevent);
        gjz.a(cia);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = c.d();
        if (s1 != null)
        {
            s1 = s1.getTripPendingRating();
        } else
        {
            s1 = null;
        }
        if (s1 != null && !TextUtils.isEmpty(s1.getId())) goto _L4; else goto _L3
_L3:
        return;
_L4:
        s1 = s1.getId();
_L2:
        if (s1 != null)
        {
            String s3;
label0:
            {
                if (!cia.equals(n.ee) && !cia.equals(n.eh))
                {
                    s3 = s1;
                    if (!cia.equals(n.ec))
                    {
                        break label0;
                    }
                }
                s3 = (new StringBuilder()).append(s1).append(":").append(s2).toString();
            }
            a.a(analyticsevent.setName(cia).setValue(s3));
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static void a(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        enhancedreceiptdialogfragment.n();
    }

    static void a(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, int i1)
    {
        enhancedreceiptdialogfragment.a(i1);
    }

    public static void a(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, Client client, TripPendingRating trippendingrating)
    {
        enhancedreceiptdialogfragment.a(client, trippendingrating);
    }

    static void a(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, List list)
    {
        enhancedreceiptdialogfragment.a(list);
    }

    static void a(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, boolean flag)
    {
        enhancedreceiptdialogfragment.d(flag);
    }

    private void a(Client client, TripPendingRating trippendingrating)
    {
        long l1 = trippendingrating.getDropoffEpoch();
        if (l1 > 0L)
        {
            mTextViewSubTitle.setText(s.format(Long.valueOf(l1)));
        }
        Object obj = trippendingrating.getDriver();
        if (obj != null)
        {
            mTextViewDriverName.setText(((TripPendingRatingDriver) (obj)).getName());
            obj = ((TripPendingRatingDriver) (obj)).getPictureUrl();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                String s1 = (String)mImageViewDriverPhoto.getTag();
                if (s1 == null || !((String) (obj)).equals(s1))
                {
                    i.a(((String) (obj))).a(mImageViewDriverPhoto);
                    mImageViewDriverPhoto.setTag(obj);
                    i.a(((String) (obj))).a(mImageViewDriverAvatar);
                }
            }
        } else
        {
            mTextViewDriverName.setText(null);
            mImageViewDriverPhoto.setImageDrawable(null);
        }
        obj = trippendingrating.getVehicleView();
        if (obj != null)
        {
            mTextViewDriverVehicle.setText(((VehicleView) (obj)).getDescription());
        }
        mTextViewFare.setText(trippendingrating.getFareBilledToCardString());
        if (a(client))
        {
            mTextViewFareDetails.setText(0x7f07030a);
            mTextViewFareDetails.setVisibility(0);
        } else
        {
            mTextViewFareDetails.setVisibility(8);
        }
        if (mViewBottomDrawer.getVisibility() == 0)
        {
            mButtonHelp.setVisibility(0);
        }
        client = trippendingrating.getFeedbackTypes();
        if (client.size() > 0 && A == null)
        {
            A = new fcr(client, this);
            mGridView.setAdapter(A);
        }
    }

    private void a(fcm fcm1)
    {
        fcm1.a(this);
    }

    private void a(List list)
    {
        if (r != null)
        {
            Object obj = new ArrayList();
            Location location;
            for (Iterator iterator = list.iterator(); iterator.hasNext(); ((List) (obj)).add(new UberLatLng(location.getLatitude(), location.getLongitude())))
            {
                location = (Location)iterator.next();
            }

            Object obj1 = (Location)list.get(0);
            Object obj2 = (Location)list.get(list.size() - 1);
            obj1 = new UberLatLng(((Location) (obj1)).getLatitude(), ((Location) (obj1)).getLongitude());
            obj2 = new UberLatLng(((Location) (obj2)).getLatitude(), ((Location) (obj2)).getLongitude());
            D = a(((UberLatLng) (obj1)), ((UberLatLng) (obj2)), list);
            b(false);
            list = eel.a(b());
            list = (new ckc()).a(((Iterable) (obj))).a(list.c()).a(list.a());
            r.a(list);
            new cjf();
            list = cjf.a(0x7f0202c6);
            new cjf();
            obj = cjf.a(0x7f0202c2);
            r.a((new cjz()).a(((UberLatLng) (obj1))).a(list));
            r.a((new cjz()).a(((UberLatLng) (obj2))).a(((cje) (obj))));
            r.a(new cjt() {

                final EnhancedReceiptDialogFragment a;

                public final boolean b(Marker marker)
                {
                    EnhancedReceiptDialogFragment.a(a);
                    return true;
                }

            
            {
                a = EnhancedReceiptDialogFragment.this;
                super();
            }
            });
        }
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

    private fcm b(dfp dfp)
    {
        return fca.a().a(new diw(this)).a(dfp).a();
    }

    public static List b(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment, List list)
    {
        enhancedreceiptdialogfragment.w = list;
        return list;
    }

    static void b(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        enhancedreceiptdialogfragment.k();
    }

    private void b(boolean flag)
    {
        if (D == null || !d())
        {
            return;
        }
        int i1 = getResources().getDimensionPixelSize(0x7f0801e5);
        cji cji = cjk.a(D, i1);
        if (flag)
        {
            r.a(cji, 300, null);
            return;
        } else
        {
            r.b(cji);
            return;
        }
    }

    static void c(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        enhancedreceiptdialogfragment.i();
    }

    private void c(boolean flag)
    {
        if (!d())
        {
            return;
        }
        Object obj = (Location)w.get(w.size() - 1);
        int i1 = mViewMapLayout.getHeight();
        int j1 = mViewBottomDrawer.getHeight();
        Object obj1 = new UberLatLng(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude());
        obj = r.b();
        obj1 = ((ckd) (obj)).a(((UberLatLng) (obj1)));
        int k1 = ((Point) (obj1)).x;
        int l1 = ((Point) (obj1)).y;
        obj = cjk.a(((ckd) (obj)).a(new Point(k1, (i1 - j1) / 2 + l1)));
        if (flag)
        {
            r.a(((cji) (obj)), 300, null);
        } else
        {
            r.b(((cji) (obj)));
        }
        r.a(q);
    }

    static String d(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        return enhancedreceiptdialogfragment.e();
    }

    private void d(boolean flag)
    {
        TextView textview = mTextViewSubTitle;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        textview.setVisibility(i1);
    }

    private String e()
    {
        Object obj = null;
        Object obj1 = c.d();
        String s1 = obj;
        if (obj1 != null)
        {
            obj1 = ((ClientStatus) (obj1)).getTripPendingRating();
            s1 = obj;
            if (obj1 != null)
            {
                s1 = ((TripPendingRating) (obj1)).getId();
            }
        }
        return s1;
    }

    public static List e(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        return enhancedreceiptdialogfragment.w;
    }

    private void e(boolean flag)
    {
        if (flag)
        {
            if (mViewFeedback.getVisibility() != 0)
            {
                mViewFeedback.setAlpha(0.0F);
                mViewFeedback.animate().alpha(1.0F).setDuration(300L);
                mViewFeedback.setVisibility(0);
            }
        } else
        if (mViewFeedback.getVisibility() == 0)
        {
            mViewFeedback.setVisibility(4);
            return;
        }
    }

    private void f()
    {
        int i1 = mViewReceiptLayout.getPaddingLeft();
        mViewReceiptLayout.setPadding(i1, i1, i1, 0);
        mViewReceipt.setVisibility(0);
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        translateanimation.setDuration(300L);
        translateanimation.setZAdjustment(1);
        translateanimation.setFillAfter(true);
        translateanimation.setFillEnabled(true);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener(i1) {

            final int a;
            final EnhancedReceiptDialogFragment b;

            public final void onAnimationEnd(Animation animation)
            {
                if (b.isAdded())
                {
                    b.mViewReceiptLayout.setPadding(a, a, a, a);
                    animation = EnhancedReceiptDialogFragment.d(b);
                    if (!TextUtils.isEmpty(animation))
                    {
                        EnhancedReceiptDialogFragment.a(b, b.o.c(animation).a(ico.a()).a(new fcn(b, (byte)0)));
                    }
                }
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                b = EnhancedReceiptDialogFragment.this;
                a = i1;
                super();
            }
        });
        mViewReceipt.startAnimation(translateanimation);
    }

    static void f(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        enhancedreceiptdialogfragment.c(false);
    }

    private void g()
    {
        mMapView.setVisibility(4);
        int i1 = mViewReceiptLayout.getPaddingLeft();
        mViewReceiptLayout.setPadding(i1, 0, i1, i1);
        mViewReceipt.setVisibility(0);
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, -1F);
        translateanimation.setDuration(300L);
        translateanimation.setZAdjustment(1);
        translateanimation.setFillAfter(true);
        translateanimation.setFillEnabled(true);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final EnhancedReceiptDialogFragment a;

            public final void onAnimationEnd(Animation animation)
            {
                if (a.isAdded())
                {
                    a.dismiss();
                }
            }

            public final void onAnimationRepeat(Animation animation)
            {
            }

            public final void onAnimationStart(Animation animation)
            {
            }

            
            {
                a = EnhancedReceiptDialogFragment.this;
                super();
            }
        });
        mViewReceipt.startAnimation(translateanimation);
    }

    static boolean g(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        return enhancedreceiptdialogfragment.l();
    }

    private void h()
    {
        try
        {
            mMapView.a(z, x);
            mMapView.e();
            mMapView.a(new cka() {

                final EnhancedReceiptDialogFragment a;

                public final void a(cjn cjn1)
                {
                    a.r = cjn1;
                    a.r.a(a.p);
                    cjn1.e();
                    cjn1.c().c();
                    if (a.d())
                    {
                        EnhancedReceiptDialogFragment.a(a, EnhancedReceiptDialogFragment.e(a));
                        EnhancedReceiptDialogFragment.f(a);
                    }
                }

            
            {
                a = EnhancedReceiptDialogFragment.this;
                super();
            }
            });
            return;
        }
        catch (ClassCastException classcastexception)
        {
            ijg.a(dbf.F.name()).b(classcastexception, "MapView Create Failed", new Object[0]);
        }
        r = null;
    }

    public static void h(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        enhancedreceiptdialogfragment.h();
    }

    public static TripPendingRating i(EnhancedReceiptDialogFragment enhancedreceiptdialogfragment)
    {
        return enhancedreceiptdialogfragment.E;
    }

    private void i()
    {
        String s1 = mEditTextComment.getText().toString();
        if (!TextUtils.isEmpty(s1))
        {
            mTextViewComment.setText(s1);
            mTextViewComment.setTextColor(getResources().getColor(0x7f0d006f));
        } else
        {
            mTextViewComment.setText(null);
            mTextViewComment.setHint(getString(0x7f070292));
            mTextViewComment.setTextColor(getResources().getColor(0x7f0d0084));
        }
        mEditTextComment.setVisibility(4);
        mTextViewDone.setVisibility(8);
        mViewMapLayout.setVisibility(0);
        mViewBottomDrawer.setVisibility(0);
        mButtonHelp.setVisibility(0);
        if (l())
        {
            a(4);
            d(false);
            mViewFeedback.setVisibility(0);
        } else
        {
            a(1);
            d(true);
        }
        cwz.b(b(), mEditTextComment);
    }

    private void j()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f04001b);
        animation.setAnimationListener(a(false));
        animation.setInterpolator(new AccelerateInterpolator());
        mViewBottomDrawer.startAnimation(animation);
    }

    private void k()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f040018);
        animation.setAnimationListener(a(true));
        animation.setInterpolator(new DecelerateInterpolator());
        mViewBottomDrawer.startAnimation(animation);
    }

    private boolean l()
    {
        float f1 = mRatingBar.getRating();
        return f1 > 0.0F && f1 < 4F;
    }

    private void m()
    {
        if (B != null)
        {
            B.setChecked(false);
        }
    }

    private void n()
    {
        boolean flag = true;
        if (mViewBottomDrawer.getVisibility() == 0)
        {
            j();
            b(true);
        } else
        {
            k();
            c(true);
            flag = false;
        }
        a(AnalyticsEvent.create("tap"), n.ee, null, String.valueOf(flag));
    }

    public final cic a()
    {
        return l.d;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(RadioButton radiobutton, int i1)
    {
        if (B != radiobutton)
        {
            m();
        }
        B = radiobutton;
        C = i1;
        a(AnalyticsEvent.create("tap"), ((cia) (n.ec)), null, String.valueOf(i1));
    }

    public final volatile void a(czj czj)
    {
        a((fcm)czj);
    }

    final boolean d()
    {
        return w != null && w.size() > 0 && r != null;
    }

    public boolean onBottomDrawerTouch()
    {
        return true;
    }

    public void onClickComment()
    {
        mTextViewDone.setVisibility(0);
        d(false);
        mViewMapLayout.setVisibility(4);
        mViewBottomDrawer.setVisibility(4);
        mEditTextComment.setVisibility(0);
        mButtonHelp.setVisibility(4);
        a(3);
        if (l())
        {
            mViewFeedback.setVisibility(4);
        }
        mEditTextComment.requestFocus();
        cwz.a(getContext());
        a(AnalyticsEvent.create("tap"), n.ea, null, null);
    }

    public void onClickSubmit()
    {
        if (E != null)
        {
            g();
        } else
        {
            Object obj = c.d();
            if (obj != null)
            {
                obj = ((ClientStatus) (obj)).getTripPendingRating();
            } else
            {
                obj = null;
            }
            if (obj != null && !TextUtils.isEmpty(((TripPendingRating) (obj)).getId()))
            {
                String s1 = ((TripPendingRating) (obj)).getId();
                int j1 = mRatingBar.getProgress();
                String s2 = mTextViewComment.getText().toString();
                int i1;
                if (j1 < 4)
                {
                    i1 = C;
                } else
                {
                    i1 = 0;
                }
                if (!g.a(dbf.cs))
                {
                    l.a(s1, j1, i1, s2);
                } else
                {
                    Object obj1 = m.b();
                    if (obj1 != null && ((RiderLocation) (obj1)).getUberLatLng() != null)
                    {
                        obj1 = ((RiderLocation) (obj1)).getUberLatLng();
                        obj1 = Location.create(((UberLatLng) (obj1)).a(), ((UberLatLng) (obj1)).b());
                    } else
                    {
                        obj1 = null;
                    }
                    t = o.a(s1, j1, Integer.valueOf(i1), s2, ((Location) (obj1))).a(ico.a()).a(new fco(this, (byte)0));
                }
                n.h(s1);
                b.c(new fdn(s1));
                a(AnalyticsEvent.create("tap"), n.ei, s1, null);
                g();
                return;
            }
        }
    }

    public void onClickSupport()
    {
        Object obj;
        if (E != null)
        {
            obj = E.getId();
        } else
        {
            obj = c.d();
            if (obj != null)
            {
                obj = ((ClientStatus) (obj)).getTripPendingRating();
            } else
            {
                obj = null;
            }
            if (obj == null || TextUtils.isEmpty(((TripPendingRating) (obj)).getId()))
            {
                mButtonHelp.setVisibility(8);
                return;
            }
            obj = ((TripPendingRating) (obj)).getId();
        }
        startActivity(TripProblemActivity.a(b(), ((String) (obj))).putExtra("com.ubercab.rds.RETURN_LOCATION", "com.ubercab.rds.RETURN_TRIP_PROBLEM"));
        a(AnalyticsEvent.create("tap"), n.ed, ((String) (obj)), null);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(0, 0x7f09017c);
        x = dtz.a(k, j.a());
        y = new cjk();
        z = bundle;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        return new Dialog(getActivity(), getTheme()) {

            final EnhancedReceiptDialogFragment a;

            public final void onBackPressed()
            {
                if (a.mViewBottomDrawer.getVisibility() != 8) goto _L2; else goto _L1
_L1:
                EnhancedReceiptDialogFragment.b(a);
_L4:
                super.onBackPressed();
                return;
_L2:
                if (a.mEditTextComment.getVisibility() == 0)
                {
                    EnhancedReceiptDialogFragment.c(a);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = EnhancedReceiptDialogFragment.this;
                super(context, i1);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030161, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        mRatingBar.setOnRatingBarChangeListener(null);
        if (d())
        {
            mMapView.b();
        }
        r = null;
        ButterKnife.reset(this);
        if (u != null)
        {
            u.b();
        }
        w = null;
    }

    public boolean onFeedbackTouch()
    {
        return mViewFeedback.getVisibility() == 0;
    }

    public void onPause()
    {
        super.onPause();
        v.b();
        if (t != null)
        {
            t.b();
            t = null;
        }
        if (d())
        {
            mMapView.d();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (g.a(dbf.cr))
        {
            return;
        }
        dar1 = dar1.a();
        if (E != null)
        {
            a(dar1.getClient(), E);
            return;
        }
        if (!dul.j(dar1))
        {
            dismiss();
            return;
        } else
        {
            dar1 = dar1.getClient();
            a(dar1, dar1.getTripPendingRating());
            return;
        }
    }

    public void onRatingChanged(RatingBar ratingbar, float f1, boolean flag)
    {
        if (f1 <= 0.0F)
        {
            mRatingBar.setRating(1.0F);
            return;
        }
        mViewGroupSubmit.setVisibility(0);
        a(AnalyticsEvent.create("tap"), n.eh, null, String.valueOf(f1));
        if (l())
        {
            m();
            a(4);
            d(false);
            e(true);
            mViewDriverFare.setVisibility(8);
            return;
        } else
        {
            a(1);
            d(true);
            e(false);
            mViewDriverFare.setVisibility(0);
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        v = ica.a(d.d(), d.f(), new fcl((byte)0)).a(ico.a()).c(new fck(this, (byte)0));
        if (d())
        {
            mMapView.e();
        }
    }

    public void onStart()
    {
        super.onStart();
        if (E != null && r == null)
        {
            h();
        }
    }

    public boolean onTouchDone()
    {
        if (mViewMapLayout.getVisibility() == 0)
        {
            k();
            c(true);
            a(AnalyticsEvent.create("tap"), n.ef, null, null);
            return true;
        } else
        {
            i();
            a(AnalyticsEvent.create("tap"), n.eb, null, null);
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mRatingBar.setOnRatingBarChangeListener(this);
        if (E != null)
        {
            view = E.getId();
        } else
        {
            view = e();
        }
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(getContext().getResources().getColor(0x7f0d004c)));
        a(AnalyticsEvent.create("impression"), l.fR, view, null);
        view = c.c();
        if (view != null && a(view))
        {
            a.a(l.fS);
        }
        f();
    }

}
