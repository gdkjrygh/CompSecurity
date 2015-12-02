// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.confirm;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TabHost;
import android.widget.TabWidget;
import butterknife.ButterKnife;
import chp;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Note;
import com.ubercab.client.core.ui.PaymentTextView;
import com.ubercab.client.feature.shoppingcart.model.Store;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import dbf;
import dbr;
import dfp;
import dtb;
import dui;
import eqv;
import esg;
import esj;
import fim;
import fun;
import gmg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import n;

// Referenced classes of package com.ubercab.client.feature.trip.confirm:
//            ConfirmationRequestButton

public class ConfirmationView extends LinearLayout
{

    public chp a;
    public gmg b;
    public fim c;
    private final List d;
    private dtb e;
    Button mButtonAddPayment;
    ConfirmationRequestButton mButtonRequest;
    ImageButton mImageButtonDiscardPickupNote;
    LinearLayout mPickupNoteContainer;
    ProgressBar mProgressBarBalance;
    TabHost mTabHost;
    TextView mTextEta;
    TextView mTextViewBalance;
    TextView mTextViewNoPayment;
    PaymentTextView mTextViewPayment;
    TextView mTextViewPaymentCredits;
    TextView mTextViewPickupNote;
    TextView mTextViewPointBalance;
    ViewGroup mViewGroupBalance;
    ViewGroup mViewGroupButtons;
    ViewGroup mViewGroupConfirmationContainer;
    ViewGroup mViewGroupPayment;
    ViewGroup mViewGroupPaymentDisclosure;
    ViewGroup mViewGroupPointBalance;
    ViewGroup mViewGroupProfileContainer;
    ViewGroup mViewGroupTripSummaryContainer;

    public ConfirmationView(Context context)
    {
        this(context, null);
    }

    public ConfirmationView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = new CopyOnWriteArrayList();
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
    }

    private View a(int i, String s)
    {
        View view = LayoutInflater.from(getContext()).inflate(i, null);
        ((TextView)view.findViewById(0x7f0e0518)).setText(s);
        return view;
    }

    private android.widget.TabHost.TabSpec a(String s, int i, String s1)
    {
        return mTabHost.newTabSpec(s).setIndicator(a(i, s1)).setContent(0x1020011);
    }

    private static String a(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s.replace("{string}", s1);
        }
    }

    static List a(ConfirmationView confirmationview)
    {
        return confirmationview.d;
    }

    private void d()
    {
        LinearLayout linearlayout = mPickupNoteContainer;
        int i;
        if (b.a(dbf.cb, dbr.a))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        linearlayout.setVisibility(i);
    }

    private void e()
    {
        if (RiderApplication.a(getContext()).i())
        {
            return;
        } else
        {
            mTabHost.setup();
            mTabHost.getTabWidget().setDividerDrawable(null);
            mTabHost.addTab(a("earn_2x_points", 0x7f0301af, getContext().getString(0x7f0701ed)));
            mTabHost.addTab(a("use_points", 0x7f0301b0, getContext().getString(0x7f070640)));
            mTabHost.setOnTabChangedListener(new android.widget.TabHost.OnTabChangeListener() {

                final ConfirmationView a;

                public final void onTabChanged(String s)
                {
                    a.mTabHost.getCurrentTab();
                    JVM INSTR tableswitch 0 1: default 32
                //                               0 33
                //                               1 72;
                       goto _L1 _L2 _L3
_L1:
                    return;
_L2:
                    s = ConfirmationView.a(a).iterator();
                    while (s.hasNext()) 
                    {
                        ((fun)s.next()).b();
                    }
                    continue; /* Loop/switch isn't completed */
_L3:
                    s = ConfirmationView.a(a).iterator();
                    while (s.hasNext()) 
                    {
                        ((fun)s.next()).h();
                    }
                    if (true) goto _L1; else goto _L4
_L4:
                }

            
            {
                a = ConfirmationView.this;
                super();
            }
            });
            return;
        }
    }

    public final void a()
    {
        if (e == null)
        {
            e = new dtb(mTextViewNoPayment);
        }
        e.start();
    }

    public final void a(Note note)
    {
        TextView textview = mTextViewPickupNote;
        Object obj;
        int i;
        if (note != null)
        {
            obj = note.getText();
        } else
        {
            obj = null;
        }
        textview.setText(((CharSequence) (obj)));
        obj = mImageButtonDiscardPickupNote;
        if (note != null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageButton) (obj)).setVisibility(i);
    }

    public final void a(PaymentProfile paymentprofile, List list)
    {
        if (paymentprofile == null)
        {
            mTextViewPayment.setVisibility(8);
            mTextViewNoPayment.setVisibility(0);
            return;
        } else
        {
            mTextViewPayment.setVisibility(0);
            mTextViewNoPayment.setVisibility(8);
            android.graphics.drawable.Drawable drawable = esj.a(getContext(), paymentprofile.getCardType());
            mTextViewPayment.a(drawable);
            mTextViewPayment.setText(dui.a(getContext(), paymentprofile, list, true));
            return;
        }
    }

    public final void a(VehicleView vehicleview, boolean flag)
    {
        mButtonRequest.a(vehicleview, flag);
    }

    public final void a(fun fun1)
    {
        d.add(fun1);
    }

    public final void a(Map map, VehicleView vehicleview)
    {
        map = (NearbyVehicle)map.get(vehicleview.getId());
        if (map == null)
        {
            return;
        }
        map = map.getEtaString();
        if (!TextUtils.isEmpty(map))
        {
            mTextEta.setText(a(vehicleview.getPickupEtaString(), ((String) (map))));
            mTextEta.setVisibility(0);
            return;
        } else
        {
            mTextEta.setText(0x7f07077e);
            mTextEta.setVisibility(8);
            return;
        }
    }

    public final void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = mViewGroupConfirmationContainer;
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((ViewGroup) (obj)).setVisibility(i);
        obj = mButtonRequest;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((ConfirmationRequestButton) (obj)).setVisibility(i);
        obj = mButtonAddPayment;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((Button) (obj)).setVisibility(i);
    }

    public final void a(boolean flag, PaymentProfile paymentprofile)
    {
        TabHost tabhost = mTabHost;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        tabhost.setCurrentTab(i);
        if (flag)
        {
            paymentprofile = paymentprofile.getRewardInfo();
            if (paymentprofile != null && paymentprofile.isEnrolled() && !paymentprofile.isEarnOnly())
            {
                if (paymentprofile.hasBalance())
                {
                    paymentprofile = paymentprofile.getBalance();
                    eqv eqv1 = new eqv(getContext());
                    mTextViewPointBalance.setText(eqv1.a(paymentprofile));
                } else
                {
                    mTextViewPointBalance.setText(getContext().getString(0x7f070072));
                }
                mTextViewPayment.setVisibility(8);
                mViewGroupPointBalance.setVisibility(0);
                return;
            } else
            {
                mTextViewPayment.setVisibility(0);
                mViewGroupPointBalance.setVisibility(8);
                return;
            }
        } else
        {
            mTextViewPayment.setVisibility(0);
            mViewGroupPointBalance.setVisibility(8);
            return;
        }
    }

    public final void a(boolean flag, esg esg1)
    {
        boolean flag1;
        if (esg1 != null && flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            mTextViewPayment.a(esg1.b());
            return;
        } else
        {
            mTextViewPayment.a(0);
            return;
        }
    }

    public final void a(boolean flag, String s)
    {
        if (flag)
        {
            mViewGroupBalance.setVisibility(0);
            if (s == null)
            {
                mProgressBarBalance.setVisibility(0);
                mTextViewBalance.setVisibility(4);
                return;
            } else
            {
                mProgressBarBalance.setVisibility(8);
                mTextViewBalance.setVisibility(0);
                mTextViewBalance.setText(s);
                return;
            }
        } else
        {
            mViewGroupBalance.setVisibility(8);
            return;
        }
    }

    public final void a(boolean flag, boolean flag1)
    {
        TextView textview;
        int i;
        if (flag)
        {
            mTextViewPaymentCredits.setBackgroundResource(0x7f020119);
        } else
        {
            mTextViewPaymentCredits.setBackgroundResource(0x7f020118);
        }
        textview = mTextViewPaymentCredits;
        if (flag1)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    public final void a(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, VehicleView vehicleview)
    {
        int i;
        int j;
        if (flag3)
        {
            i = mViewGroupPayment.getPaddingLeft();
            j = mViewGroupPayment.getPaddingRight();
            int k = mViewGroupPayment.getPaddingTop();
            int l = mViewGroupPayment.getPaddingBottom();
            if (flag1 && !flag2)
            {
                if (flag)
                {
                    mViewGroupPayment.setBackgroundResource(0x7f0200fb);
                } else
                {
                    mViewGroupPayment.setBackgroundResource(0x7f0200e9);
                }
            } else
            if (flag)
            {
                mViewGroupPayment.setBackgroundResource(0x7f02010d);
            } else
            {
                mViewGroupPayment.setBackgroundResource(0x7f0200e8);
            }
            mViewGroupPayment.setPadding(i, k, j, l);
            mViewGroupPayment.setVisibility(0);
        } else
        {
            mViewGroupPayment.setVisibility(8);
        }
        if (vehicleview != null && vehicleview.getIsCashOnly())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            mTextViewPayment.setVisibility(0);
            mViewGroupPointBalance.setVisibility(8);
        }
        if (vehicleview != null && c.c(vehicleview.getUuid()) != null && !c.c(vehicleview.getUuid()).hasItems())
        {
            mButtonRequest.setEnabled(false);
        } else
        {
            mButtonRequest.setEnabled(true);
        }
        vehicleview = mViewGroupPaymentDisclosure;
        if (flag1 && flag3 && i != 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        vehicleview.setVisibility(j);
        vehicleview = mTabHost;
        if (!flag2 && flag1 && flag3 && i == 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        vehicleview.setVisibility(i);
        vehicleview = mViewGroupButtons;
        if (flag && flag3)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        vehicleview.setVisibility(i);
        if (flag4 && flag2 && flag3)
        {
            mViewGroupPayment.setVisibility(8);
            mViewGroupProfileContainer.setVisibility(0);
            mViewGroupTripSummaryContainer.setVisibility(0);
            return;
        }
        if (flag4 && flag3)
        {
            mViewGroupPayment.setVisibility(8);
            mViewGroupProfileContainer.setVisibility(8);
            mViewGroupTripSummaryContainer.setVisibility(0);
            return;
        }
        if (flag2 && flag3)
        {
            mViewGroupPayment.setVisibility(8);
            mViewGroupProfileContainer.setVisibility(0);
            mViewGroupTripSummaryContainer.setVisibility(8);
            return;
        } else
        {
            mViewGroupProfileContainer.setVisibility(8);
            mViewGroupTripSummaryContainer.setVisibility(8);
            return;
        }
    }

    public final int b()
    {
        int ai[] = new int[2];
        mViewGroupPayment.getLocationInWindow(ai);
        return ai[1];
    }

    public final void b(fun fun1)
    {
        d.remove(fun1);
    }

    public final Rect c()
    {
        int i = mPickupNoteContainer.getWidth();
        int j = mPickupNoteContainer.getHeight();
        if (i == 0 || j == 0 || mPickupNoteContainer.getVisibility() == 8)
        {
            return null;
        } else
        {
            int ai[] = new int[2];
            mPickupNoteContainer.getLocationOnScreen(ai);
            return new Rect(ai[0], ai[1], i + ai[0], j + ai[1]);
        }
    }

    void onClickAddPayment()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fun)iterator.next()).g()) { }
    }

    void onClickButtonFareQuote()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fun)iterator.next()).c()) { }
        a.a(n.eK);
    }

    void onClickDiscardPickupNoteButton()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fun)iterator.next()).a()) { }
        a.a(n.cZ);
    }

    void onClickPaymentButton()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fun)iterator.next()).g()) { }
        a.a(n.bX);
    }

    void onClickPickupNoteTextView()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fun)iterator.next()).d()) { }
        a.a(n.cU);
    }

    void onClickPromoButton()
    {
        a.a(n.dM);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fun)iterator.next()).e()) { }
    }

    void onClickRequestButton()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((fun)iterator.next()).f()) { }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            e();
            d();
            return;
        }
    }
}
