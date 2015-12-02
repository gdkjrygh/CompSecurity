// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.PaymentProfile;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.client.feature.payment.AddPaymentActivity;
import com.ubercab.client.feature.payment.PaymentFragment;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.request.param.CreateProfile;
import cwz;
import czj;
import dfe;
import dfp;
import dns;
import dpg;
import dtg;
import dum;
import duo;
import erm;
import erq;
import exp;
import exq;
import eyj;
import eyy;
import eza;
import ezn;
import ezo;
import ezp;
import ezr;
import hkm;
import hkr;
import ica;
import java.util.Iterator;
import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            OnBoardingFinishedFragment, EditEmailFragment, ReportIntervalFragment

public class OnBoardingActivity extends RiderActivity
{

    public chp h;
    public hkr i;
    public dpg j;
    public eyy k;
    public hkm l;
    private Profile m;
    private int n;
    private String o;
    private com.ubercab.rider.realtime.model.PaymentProfile p;
    private ProgressDialog q;
    private Profile r;
    private List s;

    public OnBoardingActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/ubercab/client/feature/profiles/OnBoardingActivity);
    }

    private void a(int i1)
    {
        Object obj;
        n = i1;
        invalidateOptionsMenu();
        obj = null;
        n;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 57
    //                   1 64
    //                   2 71
    //                   3 78;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (obj != null)
        {
            h.a(((cic) (obj)));
        }
        return;
_L2:
        obj = l.iR;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = l.iS;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = l.iT;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = l.iU;
        if (true) goto _L1; else goto _L6
_L6:
    }

    private static void a(PaymentFragment paymentfragment, String s1)
    {
        if (s1 != null)
        {
            paymentfragment.d(s1);
        }
    }

    static void a(OnBoardingActivity onboardingactivity, Profile profile)
    {
        onboardingactivity.b(profile);
    }

    private void a(Profile profile, Profile profile1)
    {
        a(0x7f0e009a, ((android.support.v4.app.Fragment) (OnBoardingFinishedFragment.a(profile, profile1))));
    }

    private void a(eyj eyj1)
    {
        eyj1.a(this);
    }

    private static boolean a(Profile profile)
    {
        return profile != null && dum.f(profile);
    }

    private eyj b(dfp dfp)
    {
        return exp.a().a(new dfe(this)).a(dfp).a();
    }

    private void b(Profile profile)
    {
        k.d(profile);
        setResult(-1);
        finish();
    }

    private void f()
    {
        Object obj = null;
        n;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 45
    //                   1 52
    //                   2 64;
           goto _L1 _L2 _L3 _L4
_L1:
        if (obj != null)
        {
            h.a(((cif) (obj)));
        }
        return;
_L2:
        obj = n.iF;
        continue; /* Loop/switch isn't completed */
_L3:
        obj = n.iH;
        n = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = n.iJ;
        n = 1;
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void g()
    {
        a(0x7f0e009a, EditEmailFragment.a(true), false);
    }

    private void h()
    {
        a(0x7f0e009a, PaymentFragment.a(r));
    }

    private void i()
    {
        a(0x7f0e009a, ReportIntervalFragment.a());
    }

    private void j()
    {
        o = null;
        p = null;
        n = 0;
        String s1;
        if (r != null)
        {
            s1 = r.getEmail();
        } else
        {
            s1 = "";
        }
        a(0x7f0e009a, EditEmailFragment.a(s1));
    }

    private boolean k()
    {
        List list = k.c();
        Profile profile = null;
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Profile profile1 = (Profile)iterator.next();
            if (dum.g(profile1))
            {
                m = profile1;
            } else
            if (dum.f(profile1))
            {
                profile = profile1;
            }
        } while (true);
        if (m != null && profile != null && a(com/ubercab/client/feature/profiles/OnBoardingFinishedFragment) == null)
        {
            a(3);
            a(m, profile);
            return true;
        } else
        {
            return false;
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eyj)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030030);
        b().a(0x7f070378);
        if (a(com/ubercab/client/feature/profiles/EditEmailFragment) == null)
        {
            a(0);
            g();
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1)
        {
            if (i1 == 1001)
            {
                PaymentFragment paymentfragment = (PaymentFragment)a(com/ubercab/client/feature/payment/PaymentFragment);
                if (paymentfragment != null)
                {
                    String s1;
                    if (intent == null)
                    {
                        s1 = null;
                    } else
                    {
                        s1 = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
                    }
                    a(paymentfragment, s1);
                    setResult(j1, intent);
                }
                if (j.n())
                {
                    l.a().b(duo.a());
                }
            } else
            if (i1 == 1002 && intent != null)
            {
                intent = (PaymentFragment)a(com/ubercab/client/feature/payment/PaymentFragment);
                if (intent != null)
                {
                    a(intent, PaymentProfile.GOOGLE_WALLET.getUuid());
                    return;
                }
            }
        }
    }

    public void onBackPressed()
    {
        f();
        invalidateOptionsMenu();
        if (n == 3 && m != null)
        {
            b(m);
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(0x7f100006, menu);
        return true;
    }

    public void onEditEmailCompleteEvent(ezn ezn1)
    {
        h.a(n.iG);
        cwz.a(this);
        o = ezn1.a();
        a(1);
        h();
    }

    public void onGetTroyProfilesUpdatedEvent(ezo ezo1)
    {
        if (q != null)
        {
            q.dismiss();
        }
        if (ezo1.a() || !k())
        {
            a_(getString(0x7f070379));
        }
    }

    public void onOnBoardingProfileSelectedEvent(ezp ezp1)
    {
        r = ezp1.a();
        if (ezp1.b())
        {
            j();
            return;
        } else
        {
            b(ezp1.a());
            return;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            return true;

        case 2131625650: 
            startActivityForResult(new Intent(this, com/ubercab/client/feature/payment/AddPaymentActivity), 1001);
            break;
        }
        return true;
    }

    public void onPaymentProfileSelectedEvent(erm erm1)
    {
        h.a(n.iI);
        p = erm1.a();
        if (a(r))
        {
            if (p != null && !TextUtils.isEmpty(p.getUuid()) && !TextUtils.isEmpty(o))
            {
                q = dtg.a(this, getString(0x7f07063b));
                q.show();
                k.a(r).a(p.getUuid()).b(o).a();
                return;
            } else
            {
                a_(getString(0x7f070379));
                return;
            }
        } else
        {
            a(2);
            i();
            return;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        boolean flag = true;
        MenuItem menuitem = menu.findItem(0x7f0e06b2);
        if (n != 1)
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onReportIntervalCompleteEvent(ezr ezr1)
    {
        h.a(n.iL);
        s = ezr1.a();
        if (!TextUtils.isEmpty(o) && p != null && s != null)
        {
            q = dtg.a(this, getString(0x7f0701b8));
            q.show();
            ezr1 = CreateProfile.create("Business");
            ezr1.setEmail(o);
            ezr1.setDefaultPaymentProfileUuid(p.getUuid());
            ezr1.setSelectedSummaryPeriods(s);
            CreateProfile createprofile = CreateProfile.create("Personal");
            if (i.c() != null)
            {
                createprofile.setEmail(i.c().getEmail());
            }
            k.a(ezr1, createprofile);
            return;
        } else
        {
            a_(getString(0x7f070379));
            return;
        }
    }

    public void onSelectGoogleWalletEvent(erq erq)
    {
        erq = new Intent(this, com/ubercab/client/core/vendor/google/GoogleWalletActivity);
        erq.setAction("com.ubercab.ACTION_CHANGE_MASKED_WALLET");
        startActivityForResult(erq, 1002);
    }

    public void onUpdateProfileResponseEvent(dns dns1)
    {
        if (q != null)
        {
            Profile profile = dns1.a();
            if (!dns1.k() && profile != null)
            {
                q.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(profile) {

                    final Profile a;
                    final OnBoardingActivity b;

                    public final void onDismiss(DialogInterface dialoginterface)
                    {
                        OnBoardingActivity.a(b, a);
                    }

            
            {
                b = OnBoardingActivity.this;
                a = profile;
                super();
            }
                });
            } else
            {
                a_(getString(0x7f070379));
            }
            q.dismiss();
            return;
        } else
        {
            a_(getString(0x7f070379));
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
