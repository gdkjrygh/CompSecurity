// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.verification;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.signup.PhoneNumber;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dar;
import dbf;
import dfp;
import djb;
import dpg;
import dri;
import duj;
import dul;
import gip;
import giq;
import giz;
import gjd;
import gji;
import gjj;
import gjk;
import gjn;
import gjo;
import gjr;
import gjs;
import gmg;
import hku;
import ica;
import icl;
import java.util.concurrent.TimeUnit;
import l;

// Referenced classes of package com.ubercab.client.feature.verification:
//            PhoneWavesProgressView, MobileVerificationActivity, MobileVerificationDialogFragment

public class MobileVerificationWaitFragment extends czb
{

    public chp c;
    public cev d;
    public hku e;
    public gmg f;
    public giz g;
    public dpg h;
    public dri i;
    private Handler j;
    private Runnable k;
    private icl l;
    private boolean m;
    public Button mButtonDialog;
    PhoneWavesProgressView mPhoneWavesProgressView;
    TextView mSubtitleTextView;
    public ProgressBar mTimerProgressBar;
    TextView mTitleTextView;
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private long t;

    public MobileVerificationWaitFragment()
    {
        j = new Handler();
        k = new gjk(this);
        n = 60;
    }

    public static MobileVerificationWaitFragment a()
    {
        return new MobileVerificationWaitFragment();
    }

    public static void a(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        mobileverificationwaitfragment.h();
    }

    private void a(gji gji1)
    {
        gji1.a(this);
    }

    public static long b(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.t;
    }

    public static MobileVerificationWaitFragment b()
    {
        MobileVerificationWaitFragment mobileverificationwaitfragment = new MobileVerificationWaitFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("MODE_CALL", true);
        mobileverificationwaitfragment.setArguments(bundle);
        return mobileverificationwaitfragment;
    }

    private gji b(dfp dfp)
    {
        return gip.a().a(new djb(this)).a(dfp).a();
    }

    public static boolean c(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.m;
    }

    public static int d(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.p;
    }

    public static boolean e(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.s;
    }

    public static boolean f(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.r;
    }

    public static boolean g(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        mobileverificationwaitfragment.s = true;
        return true;
    }

    public static int h(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.q;
    }

    private void h()
    {
        c.a(l.jh);
        r = true;
        mPhoneWavesProgressView.a(true);
        mTitleTextView.setText(0x7f07064f);
        mSubtitleTextView.setText(0x7f070650);
        mButtonDialog.setVisibility(8);
        j.post(k);
    }

    public static Runnable i(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.k;
    }

    public static Handler j(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.j;
    }

    public static int k(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        return mobileverificationwaitfragment.o;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((gji)czj);
    }

    public final cic f()
    {
        return l.jl;
    }

    public final void g()
    {
        c.a(l.jj);
        if (f.b(dbf.ab))
        {
            Intent intent;
            if (f.b(dbf.ag))
            {
                intent = new Intent("com.ubercab.ACTION_MOBILE_VERIFICATION_TOKEN");
            } else
            {
                intent = new Intent(getContext(), com/ubercab/client/feature/verification/MobileVerificationActivity);
                intent.setAction("com.ubercab.ACTION_MOBILE_VERIFICATION_TOKEN");
            }
            startActivity(intent);
            getActivity().finish();
            return;
        }
        if (m)
        {
            mPhoneWavesProgressView.a(false);
            mTimerProgressBar.setProgress(0);
            mTitleTextView.setText(0x7f07065a);
            mSubtitleTextView.setText(0x7f070659);
            return;
        } else
        {
            d.c(new gjs());
            return;
        }
    }

    public void onClick()
    {
        String s1 = "";
        PhoneNumber phonenumber = g.g();
        if (phonenumber != null)
        {
            s1 = duj.b(phonenumber.a(), phonenumber.b());
        }
        MobileVerificationDialogFragment.a(d(), s1);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i.a("com.uber.SMS_RECEIVER", gjd.a);
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            m = bundle1.getBoolean("MODE_CALL", false);
        }
        if (bundle == null)
        {
            t = SystemClock.elapsedRealtime();
        } else
        {
            t = bundle.getLong("com.ubercab.sms_start_time");
            r = bundle.getBoolean("com.ubercab.pending");
            s = bundle.getBoolean("com.ubercab.success");
        }
        if (!m)
        {
            n = (int)f.a(dbf.S, "timeout_s", 60L);
        }
        o = (int)TimeUnit.SECONDS.toMillis(n);
        p = (int)((float)o * 0.5F);
        q = (int)((float)o * 1.2F);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030211, viewgroup, false);
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
        l.b();
        j.removeCallbacks(k);
        mPhoneWavesProgressView.a(false);
    }

    public void onPingEvent(dar dar1)
    {
        if (!h.n())
        {
            if (dul.a(dar1 = dar1.a()) && dar1.getClient().getHasConfirmedMobile())
            {
                h();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f07064b));
        l = e.d().c(new gjj(this, (byte)0));
        j.post(k);
        mPhoneWavesProgressView.a();
        d.c(new gjo());
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putLong("com.ubercab.sms_start_time", t);
        bundle.putBoolean("com.ubercab.pending", r);
        bundle.putBoolean("com.ubercab.success", s);
    }

    public void onSmsReceived(gjr gjr)
    {
        c.a(l.jk);
        mSubtitleTextView.setText(0x7f07064e);
    }

    public void onStop()
    {
        super.onStop();
        d.c(new gjn());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mTimerProgressBar.setMax(q);
        if (m)
        {
            mSubtitleTextView.setText(0x7f070652);
        }
    }

    public gjo produceForegroundEvent()
    {
        return new gjo();
    }
}
