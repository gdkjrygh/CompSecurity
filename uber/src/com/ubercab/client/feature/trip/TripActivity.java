// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import bjw;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import chp;
import cic;
import ciz;
import com.google.android.gms.wallet.MaskedWallet;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.partner.funnel.signup.SignUpActivity;
import com.ubercab.android.partner.funnel.signup.model.PartnerFunnelClient;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderAccount;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.client.core.model.Shape_RiderAccount;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.client.feature.about.AboutActivity;
import com.ubercab.client.feature.emergency.EmergencyFragment;
import com.ubercab.client.feature.emergency.EmergencyHelpChooserFragment;
import com.ubercab.client.feature.eta.ShareEtaActivity;
import com.ubercab.client.feature.faresplit.master.FareSplitInviteActivity;
import com.ubercab.client.feature.faresplit.master.FareSplitSummaryFragment;
import com.ubercab.client.feature.faresplit.minion.FareSplitInvitationFragment;
import com.ubercab.client.feature.mobilemessage.MobileMessageNotificationsActivity;
import com.ubercab.client.feature.payment.AddPaymentActivity;
import com.ubercab.client.feature.payment.PaymentActivity;
import com.ubercab.client.feature.payment.expense.ExpenseInfoActivity;
import com.ubercab.client.feature.profiles.AccountImageView;
import com.ubercab.client.feature.profiles.ProfilesAdapter;
import com.ubercab.client.feature.profiles.onboarding.OnBoardingIntroActivity;
import com.ubercab.client.feature.promo.PromoActivity;
import com.ubercab.client.feature.safetynet.SafetyNetShareTripActivity;
import com.ubercab.client.feature.settings.SettingsActivity;
import com.ubercab.client.feature.share.ShareActivity;
import com.ubercab.client.feature.trip.ridepool.PoolCancelDialogFragment;
import com.ubercab.client.feature.verification.MobileVerificationActivity;
import com.ubercab.experiment.model.TreatmentGroup;
import com.ubercab.payment.model.PaymentError;
import com.ubercab.rds.feature.conversation.ConversationActivity;
import com.ubercab.rds.feature.help.HelpActivity;
import com.ubercab.rds.feature.support.SupportHomeActivity;
import com.ubercab.rds.feature.trip.TripHistoryActivity;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.rider.realtime.model.TripVehicle;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.CancellationInfo;
import com.ubercab.ui.CircleImageView;
import com.ubercab.ui.TextView;
import com.ubercab.ui.Toolbar;
import cwm;
import cyv;
import czj;
import czq;
import dal;
import dar;
import dav;
import daw;
import dbf;
import dbl;
import dfe;
import dfp;
import djx;
import dkn;
import dky;
import dlr;
import dlv;
import dmq;
import dpg;
import dre;
import dtj;
import dtp;
import dui;
import dul;
import dum;
import dva;
import dvc;
import dwq;
import dyv;
import dzi;
import dzk;
import dzl;
import ecq;
import erk;
import erp;
import eyv;
import eyy;
import ezc;
import ezd;
import ezg;
import ezj;
import ezm;
import fdf;
import fdo;
import fei;
import fgl;
import fpi;
import fpw;
import fpx;
import fqj;
import fqk;
import fql;
import fqm;
import fqo;
import fqp;
import fqq;
import fsx;
import fta;
import fte;
import fth;
import fxf;
import fxg;
import fxi;
import fyc;
import fyd;
import fye;
import fyf;
import fyg;
import fyh;
import fyn;
import fyo;
import fyr;
import fyt;
import fyu;
import fyv;
import fyw;
import fyx;
import fza;
import fzb;
import fzc;
import gmg;
import gqg;
import gqj;
import gsa;
import hcl;
import hko;
import hkr;
import hku;
import hoi;
import hsq;
import ica;
import icl;
import ico;
import idj;
import ijg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import l;
import n;
import retrofit.client.Response;
import w;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripFragment

public class TripActivity extends RiderActivity
    implements dva, eyv, fxg
{

    public fxi A;
    public fta B;
    public fsx C;
    public hko D;
    public fdf E;
    public ezd F;
    public fte G;
    public dyv H;
    private final Queue I = new LinkedList();
    private final dvc J = new dvc(this);
    private CircleImageView K;
    private TextView L;
    private icl M;
    private w N;
    private String O;
    private Handler P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private MaskedWallet T;
    private String U;
    private icl V;
    private CharSequence W;
    private fqm X;
    private RiderAccount Y;
    private icl Z;
    private int aa;
    public djx h;
    public chp i;
    public cev j;
    public hkr k;
    public hku l;
    public dzi m;
    View mDrawerContainer;
    DrawerLayout mDrawerLayout;
    View mDrawerProfileFooter;
    ImageView mHeaderExpandIcon;
    ListView mListViewDrawer;
    ListView mListViewDrawerProfilesList;
    AccountImageView mProfileImageView;
    TextView mTextViewDrawerHeaderProfileName;
    Toolbar mToolbar;
    public gmg n;
    public bjw o;
    public hsq p;
    public List q;
    public czq r;
    public cgh s;
    public dpg t;
    public eyy u;
    public dkn v;
    public fei w;
    public dal x;
    public fpi y;
    public fxf z;

    public TripActivity()
    {
        R = false;
        S = false;
        U = null;
        W = null;
        Y = null;
        aa = 0x80000000;
    }

    private void C()
    {
        if (n.a(dbf.cf) || u.f())
        {
            findViewById(0x7f0e055a).setVisibility(8);
            findViewById(0x7f0e0554).setVisibility(0);
            K = mProfileImageView.b();
            L = (TextView)findViewById(0x7f0e0556);
            return;
        } else
        {
            findViewById(0x7f0e055a).setVisibility(0);
            findViewById(0x7f0e0554).setVisibility(8);
            K = (CircleImageView)findViewById(0x7f0e055b);
            L = (TextView)findViewById(0x7f0e055c);
            return;
        }
    }

    private void D()
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        Iterator iterator = q.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Class class1 = (Class)iterator.next();
            if (a(class1) == null)
            {
                fragmenttransaction.add(Fragment.instantiate(this, class1.getName()), class1.getName());
            }
        } while (true);
        fragmenttransaction.commit();
    }

    private void E()
    {
        if (a(com/ubercab/client/feature/trip/TripFragment) == null)
        {
            a(0x7f0e052e, TripFragment.g(), true);
        }
    }

    private void F()
    {
        if (O == null)
        {
            return;
        } else
        {
            ((TripFragment)a(com/ubercab/client/feature/trip/TripFragment)).a(O, true);
            O = null;
            return;
        }
    }

    private void G()
    {
        (new FareSplitSummaryFragment()).show(getSupportFragmentManager(), com/ubercab/client/feature/faresplit/master/FareSplitSummaryFragment.getName());
        i.a(n.ao);
    }

    private void H()
    {
        if (!isFinishing())
        {
            while (!I.isEmpty()) 
            {
                j.c(I.remove());
            }
        }
    }

    private void I()
    {
        ((TripFragment)a(com/ubercab/client/feature/trip/TripFragment)).M();
    }

    private void J()
    {
        mListViewDrawerProfilesList.setVisibility(8);
        mDrawerProfileFooter.setVisibility(8);
        mHeaderExpandIcon.clearAnimation();
    }

    private void K()
    {
        startActivityForResult(AddPaymentActivity.a(this, null), 3003);
    }

    private void L()
    {
        startActivity(PaymentActivity.a(this));
    }

    private void M()
    {
        startActivity(PaymentActivity.b(this));
    }

    private void N()
    {
        ProfilesAdapter profilesadapter = new ProfilesAdapter(this, this, ezg.a, u, n, s, k, i);
        mListViewDrawerProfilesList.setAdapter(profilesadapter);
    }

    private void O()
    {
        if (R || !u.f())
        {
            return;
        }
        i.a(n.iu);
        if (S)
        {
            c(false);
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(this, 0x7f040017);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final TripActivity a;

                public final void onAnimationEnd(Animation animation1)
                {
                    TripActivity.a(a, true);
                    TripActivity.b(a, false);
                    a.mDrawerProfileFooter.setVisibility(0);
                }

                public final void onAnimationRepeat(Animation animation1)
                {
                }

                public final void onAnimationStart(Animation animation1)
                {
                    TripActivity.b(a, true);
                    a.mDrawerProfileFooter.startAnimation(TripActivity.c(a, true));
                    a.mHeaderExpandIcon.startAnimation(TripActivity.d(a, true));
                }

            
            {
                a = TripActivity.this;
                super();
            }
            });
            mListViewDrawerProfilesList.setVisibility(0);
            mListViewDrawerProfilesList.startAnimation(animation);
            return;
        }
    }

    private void P()
    {
        boolean flag = u.f();
        if (n.a(dbf.cf))
        {
            View view = findViewById(0x7f0e0557);
            if (view != null)
            {
                int i1;
                if (flag)
                {
                    i1 = 0;
                } else
                {
                    i1 = 8;
                }
                view.setVisibility(i1);
            }
            if (flag)
            {
                view = findViewById(0x7f0e03e5);
                if (view != null)
                {
                    view.setVisibility(8);
                }
                if (mListViewDrawerProfilesList != null && mListViewDrawerProfilesList.getAdapter() == null)
                {
                    N();
                }
            }
        }
        if (flag)
        {
            n();
            ((ProfilesAdapter)mListViewDrawerProfilesList.getAdapter()).notifyDataSetChanged();
        }
    }

    private void Q()
    {
        u.j();
    }

    public static Intent a(Context context)
    {
        context = new Intent(context, com/ubercab/client/feature/trip/TripActivity);
        context.putExtra("com.ubercab.SHOW_CONFIRMATION", true);
        return context;
    }

    private AlphaAnimation a(boolean flag)
    {
        AlphaAnimation alphaanimation;
        if (flag)
        {
            alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        } else
        {
            alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        }
        alphaanimation.setDuration(getResources().getInteger(0x7f0b000c));
        alphaanimation.setInterpolator(new AccelerateInterpolator());
        return alphaanimation;
    }

    private void a(Intent intent)
    {
        if (intent != null)
        {
            TripFragment tripfragment = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
            if (intent.hasExtra("EXTRA_ACTIVITY_STARTED"))
            {
                tripfragment.b(true);
            }
            if (intent.hasExtra("com.ubercab.EXPENSE_INFO"))
            {
                intent = (TripExpenseInfo)intent.getParcelableExtra("com.ubercab.EXPENSE_INFO");
                C.a(intent);
            }
        }
    }

    static void a(TripActivity tripactivity)
    {
        tripactivity.h();
    }

    public static void a(TripActivity tripactivity, Intent intent)
    {
        tripactivity.d(intent);
    }

    public static void a(TripActivity tripactivity, CancellationInfo cancellationinfo)
    {
        tripactivity.a(cancellationinfo);
    }

    public static void a(TripActivity tripactivity, String s1, CharSequence charsequence)
    {
        tripactivity.a(s1, charsequence);
    }

    private void a(CancellationInfo cancellationinfo)
    {
        String s1;
        if (n.a(dbf.bx, PoolCancelDialogFragment.b))
        {
            s1 = PoolCancelDialogFragment.b.name();
        } else
        {
            s1 = PoolCancelDialogFragment.c.name();
        }
        PoolCancelDialogFragment.a(this, cancellationinfo, s1);
        cancellationinfo = AnalyticsEvent.create("impression").setName(l.ad).setValue(cancellationinfo.getAnalyticMetrics());
        i.a(cancellationinfo);
    }

    private void a(daw daw1, int i1)
    {
        dav dav1 = new dav(3, getString(0x7f0703fa), 0x7f0201c6);
        if (n.b(dbf.ah))
        {
            daw1.insert(dav1, i1);
        } else
        {
            if (n.a(dbf.ah, dbl.a))
            {
                daw1.insert(dav1, 0);
                return;
            }
            if (n.a(dbf.ah, dbl.b))
            {
                daw1.add(dav1);
                return;
            }
            if (n.a(dbf.ah, dbl.c))
            {
                if (n.a(dbf.aK))
                {
                    daw1.insert(dav1, 0);
                    return;
                } else
                {
                    daw1.insert(dav1, 1);
                    return;
                }
            }
        }
    }

    private void a(fqp fqp1)
    {
        fqp1.a(this);
    }

    private void a(String s1, CharSequence charsequence)
    {
        if (K != null && (U == null || !U.equals(s1)))
        {
            if (!TextUtils.isEmpty(s1))
            {
                android.graphics.drawable.GradientDrawable gradientdrawable = fgl.a(getResources());
                s.a(s1).a(gradientdrawable).b(0x7f02006f).a(K);
                U = s1;
            } else
            {
                K.setImageResource(0x7f02006f);
                U = "";
            }
        }
        if (!TextUtils.isEmpty(charsequence) || L.getVisibility() == 8) goto _L2; else goto _L1
_L1:
        L.setVisibility(8);
_L4:
        W = charsequence;
        return;
_L2:
        if (!TextUtils.isEmpty(charsequence) && !charsequence.equals(W))
        {
            L.setText(charsequence);
            if (L.getVisibility() != 0)
            {
                L.setVisibility(0);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(String s1, boolean flag)
    {
label0:
        {
            if (u.f())
            {
                Object obj = C.a();
                if (obj == null || ((PaymentProfile) (obj)).getUuid() == null || !((PaymentProfile) (obj)).getUuid().equals(s1))
                {
                    break label0;
                }
                obj = i;
                if (flag)
                {
                    s1 = n.jk;
                } else
                {
                    s1 = n.ig;
                }
                ((chp) (obj)).a(s1);
            }
            return;
        }
        chp chp1 = i;
        if (flag)
        {
            s1 = n.ji;
        } else
        {
            s1 = n.ie;
        }
        chp1.a(s1);
    }

    static boolean a(TripActivity tripactivity, boolean flag)
    {
        tripactivity.S = flag;
        return flag;
    }

    private boolean a(fzc fzc1)
    {
        return aa == 4 && fzc1.b() == 0;
    }

    private RotateAnimation b(boolean flag)
    {
        float f2 = 180F;
        float f1;
        RotateAnimation rotateanimation;
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = 180F;
        }
        if (!flag)
        {
            f2 = 0.0F;
        }
        rotateanimation = new RotateAnimation(f1, f2, 1, 0.5F, 1, 0.5F);
        rotateanimation.setDuration(getResources().getInteger(0x7f0b000c));
        rotateanimation.setFillAfter(true);
        return rotateanimation;
    }

    private fqp b(dfp dfp)
    {
        return fpw.a().a(new dfe(this)).a(new fqq()).a(dfp).a();
    }

    private void b(Intent intent)
    {
        intent = intent.getData();
        if (intent != null && "login.uber.com".equals(intent.getHost()))
        {
            RiderApplication.a(this).a(this);
            finish();
        }
    }

    static void b(TripActivity tripactivity)
    {
        tripactivity.l();
    }

    static boolean b(TripActivity tripactivity, boolean flag)
    {
        tripactivity.R = flag;
        return flag;
    }

    static AlphaAnimation c(TripActivity tripactivity, boolean flag)
    {
        return tripactivity.a(flag);
    }

    private void c(Intent intent)
    {
        if (intent != null && intent.getBooleanExtra("com.ubercab.SHOW_CONFIRMATION", false))
        {
            G.s();
        }
    }

    static void c(TripActivity tripactivity)
    {
        tripactivity.J();
    }

    private void c(boolean flag)
    {
        Animation animation = AnimationUtils.loadAnimation(this, 0x7f04001e);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener(flag) {

            final boolean a;
            final TripActivity b;

            public final void onAnimationEnd(Animation animation1)
            {
                TripActivity.a(b, false);
                TripActivity.b(b, false);
                b.mListViewDrawerProfilesList.setVisibility(8);
                b.mDrawerProfileFooter.setVisibility(8);
                if (a)
                {
                    b.mDrawerLayout.closeDrawers();
                }
            }

            public final void onAnimationRepeat(Animation animation1)
            {
            }

            public final void onAnimationStart(Animation animation1)
            {
                TripActivity.b(b, true);
                b.mDrawerProfileFooter.setVisibility(0);
                b.mDrawerProfileFooter.startAnimation(TripActivity.c(b, false));
                b.mHeaderExpandIcon.startAnimation(TripActivity.d(b, false));
            }

            
            {
                b = TripActivity.this;
                a = flag;
                super();
            }
        });
        mListViewDrawerProfilesList.startAnimation(animation);
    }

    static Handler d(TripActivity tripactivity)
    {
        return tripactivity.P;
    }

    static RotateAnimation d(TripActivity tripactivity, boolean flag)
    {
        return tripactivity.b(flag);
    }

    private void d(Intent intent)
    {
        if (intent.getAction() == null) goto _L2; else goto _L1
_L1:
        byte byte0;
        intent = intent.getAction();
        byte0 = -1;
        intent.hashCode();
        JVM INSTR lookupswitch 5: default 68
    //                   -2038445361: 135
    //                   -1869739587: 120
    //                   -1614102506: 150
    //                   -1224602576: 165
    //                   440339789: 105;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        byte0;
        JVM INSTR tableswitch 0 4: default 104
    //                   0 180
    //                   1 198
    //                   2 216
    //                   3 234
    //                   4 252;
           goto _L2 _L9 _L10 _L11 _L12 _L13
_L2:
        return;
_L8:
        if (intent.equals("com.ubercab.client.ACTION_TRIP_ADD_DESTINATION"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (intent.equals("com.ubercab.client.ACTION_TRIP_CANCEL"))
        {
            byte0 = 1;
        }
          goto _L3
_L4:
        if (intent.equals("com.ubercab.client.ACTION_TRIP_SHARE_ETA"))
        {
            byte0 = 2;
        }
          goto _L3
_L6:
        if (intent.equals("com.ubercab.client.ACTION_TRIP_SPLIT_FARE"))
        {
            byte0 = 3;
        }
          goto _L3
_L7:
        if (intent.equals("com.ubercab.client.ACTION_SAFETYNET_SHARE_TRIP"))
        {
            byte0 = 4;
        }
          goto _L3
_L9:
        I.add(new fyc());
        return;
_L10:
        I.add(new fyd());
        return;
_L11:
        I.add(new fyw());
        return;
_L12:
        I.add(new fza());
        return;
_L13:
        I.add(new fyx());
        return;
    }

    private void e(Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getData();
            if (intent != null && "support".equals(intent.getHost()))
            {
                intent = intent.getQueryParameter("contactId");
                if (!TextUtils.isEmpty(intent))
                {
                    startActivity(ConversationActivity.a(this, intent, null));
                }
            }
        }
    }

    public static void e(TripActivity tripactivity)
    {
        tripactivity.L();
    }

    public static void f(TripActivity tripactivity)
    {
        tripactivity.H();
    }

    public static boolean g(TripActivity tripactivity)
    {
        tripactivity.Q = false;
        return false;
    }

    public static RiderAccount h(TripActivity tripactivity)
    {
        return tripactivity.Y;
    }

    private void h()
    {
        TripExpenseInfo tripexpenseinfo = null;
        boolean flag = false;
        String s1;
        if (n.a(dbf.bZ) && x.k())
        {
            s1 = C.h();
            tripexpenseinfo = C.b();
            flag = true;
        } else
        {
            s1 = null;
        }
        if (fte.b(G.g()) && flag)
        {
            startActivityForResult(PaymentActivity.a(this, C.b(), j()), 2005);
            return;
        } else
        {
            startActivityForResult(PaymentActivity.a(this, dwq.a(T), s1, C.d(), tripexpenseinfo), 2001);
            return;
        }
    }

    public static void i(TripActivity tripactivity)
    {
        tripactivity.k();
    }

    private boolean i()
    {
        boolean flag1 = false;
        Object obj = k.f();
        City city = k.b();
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (city != null)
            {
                flag = flag1;
                if (((Trip) (obj)).getVehicle() != null)
                {
                    obj = city.findVehicleViewById(((Trip) (obj)).getVehicle().getVehicleViewId());
                    flag = flag1;
                    if (obj != null)
                    {
                        flag = flag1;
                        if (((VehicleView) (obj)).getAllowRidepool())
                        {
                            flag = flag1;
                            if (fte.c(G.g()))
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    private boolean j()
    {
        if (u.f())
        {
            if (k.f() != null)
            {
                return k.f().getUseCredits();
            } else
            {
                return C.d();
            }
        } else
        {
            return true;
        }
    }

    private void k()
    {
        dtj.a(this, 2009, null, getString(0x7f07007c), getString(0x7f070674), getString(0x7f0702cd));
        i.a(l.in);
    }

    private void l()
    {
        if (dzk.a(n) && 7 == G.g())
        {
            EmergencyHelpChooserFragment.a(this);
            return;
        }
        if (n.a(hcl.a))
        {
            startActivity(HelpActivity.a(this));
            return;
        } else
        {
            startActivity(SupportHomeActivity.a(this));
            return;
        }
    }

    private void m()
    {
        Object obj = k.d();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((ClientStatus) (obj)).getLastRequestMsg();
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            dtp.a(this, 0, ((String) (obj)));
        }
    }

    private void n()
    {
        Profile profile = u.b();
        if (profile != null)
        {
            mTextViewDrawerHeaderProfileName.setText(dum.a(profile, this));
            ezc.a(mProfileImageView.a(), profile, s);
            mProfileImageView.a(profile);
        }
    }

    private void o()
    {
        ViewGroup viewgroup = (ViewGroup)findViewById(0x7f0e052d);
        A.a(viewgroup);
        z.a(A);
        z.a(mToolbar);
        z.a();
    }

    private void p()
    {
        C();
        N = new w(this, mDrawerLayout);
        mDrawerLayout.setDrawerListener(new android.support.v4.widget.DrawerLayout.DrawerListener() {

            final TripActivity a;

            public final void onDrawerClosed(View view)
            {
                a.i.a(n.aT);
                if (a.u.f() && a.mListViewDrawerProfilesList.getVisibility() == 0)
                {
                    TripActivity.a(a, false);
                    TripActivity.b(a, false);
                    TripActivity.c(a);
                }
            }

            public final void onDrawerOpened(View view)
            {
                a.i.a(l.cK);
                a.i.a(n.aU);
                if (a.u.g())
                {
                    a.u.d();
                }
            }

            public final void onDrawerSlide(View view, float f1)
            {
            }

            public final void onDrawerStateChanged(int j1)
            {
            }

            
            {
                a = TripActivity.this;
                super();
            }
        });
        daw daw1 = new daw(this);
        if (!n.a(dbf.aK))
        {
            daw1.add(new dav(0, getString(0x7f070373), 0x7f0201bd));
        }
        daw1.add(new dav(1, getString(0x7f070328), 0x7f0201ba));
        daw1.add(new dav(6, getString(0x7f070269), 0x7f0201b6));
        int i1 = daw1.getCount();
        daw1.add(new dav(2, getString(0x7f07038a), 0x7f0201c0));
        if (n.a(dbf.B))
        {
            daw1.add(new dav(7, getString(0x7f0702f6), 0x7f0201b7));
        }
        daw1.add(new dav(5, getString(0x7f070267), 0x7f0201c9));
        if (n.a(dbf.ce))
        {
            daw1.add(new dav(8, getString(0x7f0701e7), 0x7f020182));
        }
        if (n.a(dbf.aK))
        {
            daw1.add(new dav(0, getString(0x7f0703e4), 0x7f0201c3));
            q();
        } else
        {
            daw1.add(new dav(4, getString(0x7f070032), 0x7f0201b3));
        }
        a(daw1, i1);
        mListViewDrawer.setCacheColorHint(0);
        if (!u.f()) goto _L2; else goto _L1
_L1:
        N();
_L4:
        mListViewDrawer.setAdapter(daw1);
        return;
_L2:
        if (u.g())
        {
            r();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void q()
    {
        View view = LayoutInflater.from(this).inflate(0x7f0300c3, null, false);
        mListViewDrawer.addFooterView(view, null, true);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final TripActivity a;

            public final void onClick(View view1)
            {
                a.onItemClick(4L);
            }

            
            {
                a = TripActivity.this;
                super();
            }
        });
    }

    private void r()
    {
        View view = LayoutInflater.from(this).inflate(0x7f030156, null, false);
        ((LinearLayout)findViewById(0x7f0e0531)).addView(view);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final TripActivity a;

            public final void onClick(View view1)
            {
                a.i.a(n.iE);
                TripActivity.d(a).postDelayed(new Runnable(this) {

                    final _cls5 a;

                    public final void run()
                    {
                        a.a.startActivity(new Intent(a.a, com/ubercab/client/feature/profiles/onboarding/OnBoardingIntroActivity));
                    }

            
            {
                a = _pcls5;
                super();
            }
                }, 250L);
                a.mDrawerLayout.closeDrawers();
            }

            
            {
                a = TripActivity.this;
                super();
            }
        });
    }

    public final View a()
    {
        return z.b();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        super.a(i1, j1, bundle);
        if (i1 != 2009) goto _L2; else goto _L1
_L1:
        if (j1 != -1) goto _L4; else goto _L3
_L3:
        ((TripFragment)a(com/ubercab/client/feature/trip/TripFragment)).H();
        i.a(n.hy);
        y.a(0);
_L6:
        return;
_L4:
        i.a(n.hx);
        return;
_L2:
        if (i1 == 2019)
        {
            if (j1 == -1)
            {
                ((TripFragment)a(com/ubercab/client/feature/trip/TripFragment)).H();
                i.a(n.w);
                y.a(7);
                return;
            } else
            {
                i.a(n.x);
                return;
            }
        }
        if (i1 == 2011 && j1 == -1)
        {
            bundle = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
            bundle.I();
            bundle.a(null, null);
            return;
        }
        if (i1 == 2012)
        {
            if (j1 != -1)
            {
                continue; /* Loop/switch isn't completed */
            }
            i.a(n.jL);
            bundle = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
            if (bundle != null)
            {
                bundle.J();
                return;
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_211;
        if (j1 != 0) goto _L6; else goto _L5
_L5:
        i.a(n.jM);
        return;
        if (i1 != 2013 || j1 != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
        if (bundle != null)
        {
            bundle.K();
            return;
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (i1 != 2014)
        {
            break; /* Loop/switch isn't completed */
        }
        bundle = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
        if (bundle != null)
        {
            bundle.L();
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
        if (i1 != 2015)
        {
            continue; /* Loop/switch isn't completed */
        }
        bundle = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
        if (bundle == null) goto _L6; else goto _L9
_L9:
        bundle.E();
        return;
        if (i1 != 11000 || j1 != -1) goto _L6; else goto _L10
_L10:
        bundle = new Intent(this, com/ubercab/client/feature/verification/MobileVerificationActivity);
        bundle.setAction("com.ubercab.ACTION_MOBILE_VERIFICATION_CHANGE");
        startActivity(bundle);
        return;
    }

    public final void a(Client client, ArrayList arraylist)
    {
        if (client == null || arraylist == null)
        {
            return;
        }
        Object obj;
        TripExpenseInfo tripexpenseinfo;
        if (client.getLastSelectedPaymentProfileIsGoogleWallet())
        {
            client = com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET;
        } else
        {
            client = client.getLastSelectedPaymentProfile();
        }
        tripexpenseinfo = C.b();
        obj = tripexpenseinfo;
        if (tripexpenseinfo == null)
        {
            obj = RiderTripExpenseInfo.create();
        }
        startActivity(PaymentActivity.a(this, ((TripExpenseInfo) (obj)), dwq.a(T), client, arraylist));
    }

    public final void a(Profile profile, boolean flag)
    {
        if (F.a(profile, true))
        {
            c(true);
            return;
        } else
        {
            mDrawerLayout.closeDrawers();
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((fqp)czj);
    }

    public final void a(gqg gqg, Ping ping, Response response)
    {
        if (G.o())
        {
            G.r();
        }
        while (dul.a(ping, 460) || dul.a(ping, 3013)) 
        {
            return;
        }
        super.a(gqg, ping, response);
    }

    public final volatile void a(gqg gqg, gqj gqj, Response response)
    {
        a(gqg, (Ping)gqj, response);
    }

    public final void a(String s1, String s2)
    {
        TripFragment tripfragment = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
        if (tripfragment != null)
        {
            tripfragment.a(s1, s2);
        }
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0301ba);
        ButterKnife.inject(this);
        Q();
        o();
        p();
        D();
        E();
        z.a(this);
        B.a(bundle);
        G.a(bundle);
        C.b(bundle);
        P = new Handler();
        H.a(this);
        if (bundle == null)
        {
            bundle = getIntent();
            b(((Intent) (bundle)));
            c(bundle);
            d(bundle);
            e(bundle);
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(r);
    }

    public final void f()
    {
        Object obj1 = null;
        Object obj;
        if (!t.u())
        {
            v.c();
        } else
        {
            obj = k.f();
            if (obj != null)
            {
                obj = ((Trip) (obj)).getUuid();
            } else
            {
                obj = null;
            }
            Z = D.d(((String) (obj))).a(ico.a()).a(new fqo(this, (byte)0));
        }
        obj = k.d();
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = ((ClientStatus) (obj)).getStatus();
        }
        obj = AnalyticsEvent.create("tap").setName(n.W).setValue(((String) (obj)));
        i.a(((AnalyticsEvent) (obj)));
        j.c(new fye());
    }

    public final void g()
    {
        EmergencyFragment.a(this);
    }

    public void onAcceptFareSplitResponse(dky dky1)
    {
        if (!dky1.a())
        {
            a(k.c(), dky1.c());
        }
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 != 2008 || j1 != 0) goto _L2; else goto _L1
_L1:
        onBackPressed();
_L4:
        return;
_L2:
        if (i1 == 1050 && j1 == 0)
        {
            finish();
            return;
        }
        if (i1 == 2001 && j1 == -1 && intent != null)
        {
            T = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
            P();
            if (intent.hasExtra("com.ubercab.PAYMENT_PROFILE_UUID"))
            {
                String s1 = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
                C.a(s1);
            }
            if (intent.hasExtra("com.ubercab.USE_CREDITS"))
            {
                boolean flag = intent.getBooleanExtra("com.ubercab.USE_CREDITS", true);
                C.b(flag);
            }
            a(intent);
            return;
        }
        if (i1 == 2021 && u.f() && F.a(j1, intent))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 2005 || i1 == 3003)
        {
            a(intent);
            if (j1 == -1)
            {
                T = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
                if (intent.hasExtra("com.ubercab.PAYMENT_PROFILE_UUID"))
                {
                    String s2 = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
                    if (i1 == 2005)
                    {
                        a(s2, false);
                    }
                    C.a(s2);
                }
                if (intent.hasExtra("com.ubercab.USE_CREDITS"))
                {
                    boolean flag1 = intent.getBooleanExtra("com.ubercab.USE_CREDITS", true);
                    C.b(flag1);
                }
                if (intent.hasExtra("com.ubercab.USE_POINTS"))
                {
                    boolean flag2 = intent.getBooleanExtra("com.ubercab.USE_POINTS", false);
                    C.c(flag2);
                }
                I();
                return;
            }
            if (j1 == 0 && u.f())
            {
                i.a(n._fldif);
                return;
            }
        }
        if (i1 == 2006)
        {
            a(intent);
            if (j1 == -1)
            {
                String s3 = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
                a(s3, true);
                if (!u.f() || !TextUtils.isEmpty(s3))
                {
                    C.a(s3);
                }
                if (u.f() && intent.hasExtra("com.ubercab.USE_CREDITS"))
                {
                    boolean flag3 = intent.getBooleanExtra("com.ubercab.USE_CREDITS", true);
                    C.b(flag3);
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j1 == 0 && u.f())
            {
                i.a(n.jj);
            }
        }
        if (i1 == 2007 && j1 == -1)
        {
            T = (MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
            O = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
            return;
        }
        if (i1 == 2011 && j1 == -1)
        {
            a(intent);
            ((TripFragment)a(com/ubercab/client/feature/trip/TripFragment)).a(intent.getStringExtra("EXTRA_PAYMENT_PROFILE_UUID"), false);
        }
        if (i1 == 2010 && j1 == -1)
        {
            G();
        }
        if (i1 == 2017 && j1 == -1)
        {
            a(intent);
        }
        if (i1 == 2018 && j1 == -1 && intent != null && intent.hasExtra("com.ubercab.EXPENSE_INFO"))
        {
            C.a((TripExpenseInfo)intent.getParcelableExtra("com.ubercab.EXPENSE_INFO"));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onAddExpenseInfoFromTripTrayEvent(ezj ezj1)
    {
        startActivityForResult(ExpenseInfoActivity.a(this, ezj1.a()), 2018);
    }

    public void onBackPressed()
    {
        if (mDrawerLayout != null && mDrawerLayout.isDrawerOpen(mDrawerContainer))
        {
            mDrawerLayout.closeDrawers();
        } else
        {
            TripFragment tripfragment = (TripFragment)a(com/ubercab/client/feature/trip/TripFragment);
            if (tripfragment == null || !tripfragment.G())
            {
                super.onBackPressed();
                return;
            }
        }
    }

    public void onCancelTripEvent(fyd fyd1)
    {
        if (!i() || n.b(dbf.bx))
        {
            k();
            return;
        } else
        {
            b(getString(0x7f07035f), null);
            V = D.a(k.f().getUuid()).a(ico.a()).a(new fqj(this, (byte)0));
            return;
        }
    }

    public void onCancelingTripEvent(fye fye1)
    {
        if (G.o())
        {
            G.r();
        }
        Q = true;
    }

    public void onChangeTripPaymentEvent(fyf fyf1)
    {
        startActivityForResult(PaymentActivity.a(this, fyf1.a(), j()), 2006);
    }

    public void onClearDestinationEvent(fyg fyg)
    {
        dtj.a(this, 2011, getString(0x7f07039a), getString(0x7f070399), getString(0x7f0702f8), getString(0x7f07007b));
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (N == null)
        {
            ijg.d(new NullPointerException((new StringBuilder("Drawer toggle is null onConfigurationChanged:\n")).append(configuration.toString()).toString()), "Config change in unknown state", new Object[0]);
            return;
        } else
        {
            N.b();
            return;
        }
    }

    public void onCreateGoogleWalletPaymentProfileEvent(fyh fyh)
    {
        fyh = new Intent(this, com/ubercab/client/core/vendor/google/GoogleWalletActivity);
        fyh.setAction("com.ubercab.ACTION_CREATE_PAYMENT_PROFILE");
        fyh.putExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", T);
        startActivityForResult(fyh, 2007);
    }

    public void onCurrentlySelectedProfileSetEvent(ezm ezm)
    {
        if (u.f())
        {
            n();
            ((BaseAdapter)mListViewDrawerProfilesList.getAdapter()).notifyDataSetChanged();
            ((TripFragment)a(com/ubercab/client/feature/trip/TripFragment)).F();
        }
    }

    protected void onDestroy()
    {
        z.b(this);
        super.onDestroy();
    }

    public void onEmergencyStateUpdated(dzl dzl)
    {
        z.a(dzl);
    }

    public void onFareSplitAcceptResponseEvent(dlr dlr1)
    {
        if (!dlr1.e() && dul.a((Ping)dlr1.g(), 430))
        {
            Ping ping = (Ping)dlr1.g();
            if (dul.a(ping))
            {
                dlr1 = ping.getClient();
            } else
            {
                dlr1 = null;
            }
            a(dlr1, fth.a(o, ping.getErrorObj()));
        }
    }

    public void onFareSplitInvitationEvent(ecq ecq)
    {
        if (a(com/ubercab/client/feature/faresplit/minion/FareSplitInvitationFragment) == null)
        {
            FareSplitInvitationFragment faresplitinvitationfragment = new FareSplitInvitationFragment();
            Client client = k.c();
            if (client == null)
            {
                ecq = null;
            } else
            {
                ecq = client.getLastSelectedPaymentProfileUUID();
            }
            if (ecq != null && client.getPaymentProfiles() != null)
            {
                faresplitinvitationfragment.a(client.findPaymentProfileByUuid(ecq));
            }
            faresplitinvitationfragment.show(getSupportFragmentManager(), com/ubercab/client/feature/faresplit/minion/FareSplitInvitationFragment.getName());
        }
    }

    public void onGetAccountResponseEvent(dlv dlv1)
    {
        if (dlv1.i())
        {
            dlv1 = (RiderAccount)dlv1.g();
            if (dlv1 != null)
            {
                Y = dlv1;
                ((hoi)p.a()).a("com.ubercab.client.RIDER_ACCOUNT", dlv1);
                a(dlv1.getPictureUrl(), dlv1.getFullName());
            }
        }
    }

    public void onGotUnpaidBillsEvent(erk erk)
    {
        E.a(erk);
    }

    public void onHelpEvent(fyn fyn)
    {
        l();
    }

    public void onItemClick(long l1)
    {
        P.postDelayed(new Runnable(l1) {

            final long a;
            final TripActivity b;

            public final void run()
            {
                Object obj;
                switch ((int)a)
                {
                default:
                    return;

                case 4: // '\004'
                    b.startActivity(new Intent(b, com/ubercab/client/feature/about/AboutActivity));
                    return;

                case 1: // '\001'
                    b.i.a(n.bY);
                    TripActivity.a(b);
                    return;

                case 0: // '\0'
                    b.startActivity(new Intent(b, com/ubercab/client/feature/settings/SettingsActivity));
                    return;

                case 2: // '\002'
                    b.startActivity(new Intent(b, com/ubercab/client/feature/promo/PromoActivity));
                    b.i.a(n.dN);
                    return;

                case 3: // '\003'
                    b.startActivity(new Intent(b, com/ubercab/client/feature/share/ShareActivity));
                    b.i.a(n.av);
                    return;

                case 5: // '\005'
                    TripActivity.b(b);
                    b.i.a(n.eo);
                    return;

                case 6: // '\006'
                    b.startActivity(TripHistoryActivity.a(b).setAction("com.ubercab.rds.ACTION_TRIP_RECEIPT").putExtra("com.ubercab.rds.RETURN_LOCATION", "com.ubercab.rds.RETURN_TRIP_HISTORY"));
                    b.i.a(n.az);
                    return;

                case 7: // '\007'
                    b.startActivity(new Intent(b, com/ubercab/client/feature/mobilemessage/MobileMessageNotificationsActivity));
                    b.i.a(n.bN);
                    return;

                case 8: // '\b'
                    obj = b.k.c();
                    break;
                }
                if (obj != null)
                {
                    obj = PartnerFunnelClient.create().setFirstName(((Client) (obj)).getFirstName()).setLastName(((Client) (obj)).getLastName()).setMobile(((Client) (obj)).getMobile()).setPictureUrl(((Client) (obj)).getPictureUrl()).setToken(b.x.x()).setUuid(b.x.z());
                    obj = SignUpActivity.a(b, ((PartnerFunnelClient) (obj)));
                    b.startActivity(((Intent) (obj)));
                    b.i.a(n.en);
                    return;
                } else
                {
                    cwm.a(b, 0x7f070631);
                    return;
                }
            }

            
            {
                b = TripActivity.this;
                a = l1;
                super();
            }
        }, 250L);
        mDrawerLayout.closeDrawers();
    }

    void onMenuDrawerProfileFooterClicked()
    {
        O();
    }

    void onMenuDrawerProfileHeaderClicked()
    {
        O();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        d(intent);
        e(intent);
    }

    public void onNoLocationEvent(ciz ciz)
    {
        w();
    }

    public void onOpenUriEvent(fyr fyr1)
    {
        J.a(fyr1.a());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        while (N.a(menuitem) || menuitem.getItemId() != 0x102002c && super.onOptionsItemSelected(menuitem)) 
        {
            return true;
        }
        return false;
    }

    public void onPause()
    {
        super.onPause();
        M.b();
        if (X != null)
        {
            unregisterReceiver(X);
            X = null;
        }
        m.b();
        G.e();
        B.f();
        F.b();
        y.b();
        if (Z != null)
        {
            Z.b();
        }
        if (V != null && !V.c())
        {
            V.b();
        }
    }

    public void onPaymentInvalidTokenEvent(fyt fyt)
    {
        dtj.a(this, 2013, getString(0x7f070391), getString(0x7f070390), getString(0x7f07038f), getString(0x7f07007b));
    }

    public void onPickupResponseEvent(dmq dmq1)
    {
        Object obj = null;
        if (dmq1.e()) goto _L2; else goto _L1
_L1:
        if (!n.a(dbf.ao) || dmq1.g() == null || ((Ping)dmq1.g()).getClient() == null || ((Ping)dmq1.g()).getClient().getLastSelectedPaymentProfile() == null || ((Ping)dmq1.g()).getErrorCode() == null) goto _L4; else goto _L3
_L3:
        PaymentProfile paymentprofile;
        gsa gsa1;
        PaymentError paymenterror;
        paymentprofile = ((Ping)dmq1.g()).getClient().getLastSelectedPaymentProfile();
        gsa1 = gsa.a(this, paymentprofile.getTokenType());
        paymenterror = PaymentError.create(((Ping)dmq1.g()).getErrorCode().intValue());
        if (gsa1 == null || !gsa1.a(paymenterror)) goto _L4; else goto _L5
_L5:
        startActivity(gsa1.a(dui.a(paymentprofile), paymenterror));
_L2:
        return;
_L4:
        if (dul.a((Ping)dmq1.g(), 430))
        {
            Ping ping = (Ping)dmq1.g();
            dmq1 = obj;
            if (dul.a(ping))
            {
                dmq1 = ping.getClient();
            }
            a(dmq1, fth.a(o, ping.getErrorObj()));
            return;
        }
        if (dul.a((Ping)dmq1.g(), 402))
        {
            i.a(l.jz);
            dtj.a(this, 2012, getString(0x7f070280), getString(0x7f07027f), getString(0x7f070048), getString(0x7f07007b));
            return;
        }
        if (dul.a((Ping)dmq1.g(), 460))
        {
            if (u.f())
            {
                ezd.a(j, this);
            } else
            {
                dmq1 = dmq1.f();
                dtj.a(this, 2014, getString(0x7f07049a), dmq1, getString(0x7f07008d), null);
            }
            i.a(l.e);
            return;
        }
        if (dul.a((Ping)dmq1.g(), 3013))
        {
            dtp.a(this, 2015, dmq1.f());
            return;
        }
        if (!n.b(dbf.i) && dul.a((Ping)dmq1.g(), 5006))
        {
            ijg.c("Fare has expired", new Object[0]);
            G.r();
            return;
        }
        if (n.a(dbf.al) && dmq1.a())
        {
            L();
            return;
        }
        if (n.a(dbf.R) && dmq1.b())
        {
            M();
            return;
        }
        ijg.c("Unexpected pickup request error. Http status [%s]: %s", new Object[] {
            Integer.valueOf(dmq1.j()), dmq1.f()
        });
        if (G.o())
        {
            G.r();
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public void onPingEvent(dar dar1)
    {
        if (!t.n() && !isFinishing())
        {
            Object obj = dar1.a();
            if (dul.a(((Ping) (obj))))
            {
                obj = ((Ping) (obj)).getClient();
                if (!"Dispatching".equals(((com.ubercab.client.core.model.Client) (obj)).getStatus()))
                {
                    Q = false;
                    if (Y == null)
                    {
                        a(((com.ubercab.client.core.model.Client) (obj)).getPictureUrl(), ((com.ubercab.client.core.model.Client) (obj)).getFormattedName());
                    }
                    z.a(dar1);
                    return;
                }
            }
        }
    }

    protected void onPostCreate(Bundle bundle)
    {
        super.onPostCreate(bundle);
        N.a();
    }

    public void onProductGroupSelected(fyu fyu)
    {
        z.a(fyu);
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        T = (MaskedWallet)bundle.getParcelable("com.google.android.gms.wallet.EXTRA_MASKED_WALLET");
        Q = bundle.getBoolean("com.ubercab.IS_CANCELING_DISPATCH");
    }

    public void onResume()
    {
        super.onResume();
        G.d();
        B.e();
        M = l.i().a(ica.a(l.b(), l.d(), l.f(), new fql((byte)0)), new idj() {

            final TripActivity a;

            private static fql a(fql fql1)
            {
                return fql1;
            }

            public final volatile Object a(Object obj, Object obj1)
            {
                return a((fql)obj1);
            }

            
            {
                a = TripActivity.this;
                super();
            }
        }).a(ico.a()).c(new fqk(this, (byte)0));
        F();
        if (X == null)
        {
            X = new fqm(this, (byte)0);
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("com.ubercab.client.ACTION_TRIP_ADD_DESTINATION");
            intentfilter.addAction("com.ubercab.client.ACTION_TRIP_CANCEL");
            intentfilter.addAction("com.ubercab.client.ACTION_TRIP_SHARE_ETA");
            intentfilter.addAction("com.ubercab.client.ACTION_TRIP_SPLIT_FARE");
            intentfilter.setPriority(0x186a0);
            registerReceiver(X, intentfilter, cyv.a(this), null);
        }
        if (mDrawerLayout.isDrawerOpen(mDrawerContainer))
        {
            i.a(l.cK);
        }
        P();
        m.a();
        F.a();
        RiderAccount rideraccount = (RiderAccount)((hoi)p.a()).a("com.ubercab.client.RIDER_ACCOUNT", com/ubercab/client/core/model/Shape_RiderAccount);
        if (rideraccount != null)
        {
            Y = rideraccount;
            a(rideraccount.getPictureUrl(), rideraccount.getFullName());
        }
        h.a(x.z());
        E.b();
        y.a();
    }

    public void onResumeFragments()
    {
        super.onResumeFragments();
        x();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.google.android.gms.wallet.EXTRA_MASKED_WALLET", T);
        bundle.putBoolean("com.ubercab.IS_CANCELING_DISPATCH", Q);
        B.b(bundle);
        G.b(bundle);
        C.a(bundle);
    }

    public void onSelectExpenseInfoEvent(erp erp1)
    {
        if (erp1.b() == null)
        {
            startActivityForResult(ExpenseInfoActivity.a(this, C.b(), erp1.a(), erp1.c()), 2017);
            return;
        } else
        {
            startActivityForResult(ExpenseInfoActivity.a(this, erp1.b(), erp1.a(), erp1.c()), 2011);
            return;
        }
    }

    public void onSelectPaymentEvent(fyv fyv1)
    {
        if (u.f())
        {
            i.a(n.id);
        }
        PaymentProfile paymentprofile = fyv1.a();
        if (paymentprofile == null && n.a(dbf.V))
        {
            K();
            return;
        } else
        {
            startActivityForResult(PaymentActivity.a(this, fyv1.b(), dwq.a(T), paymentprofile, fyv1.c(), fyv1.d(), G.a()), 2005);
            return;
        }
    }

    public void onShareEtaEvent(fyw fyw1)
    {
        startActivity(new Intent(this, com/ubercab/client/feature/eta/ShareEtaActivity));
        i.a(n.fh);
    }

    public void onShareTripEvent(fyx fyx1)
    {
        if (w.j())
        {
            startActivity(new Intent(this, com/ubercab/client/feature/safetynet/SafetyNetShareTripActivity));
            return;
        } else
        {
            startActivity(new Intent(this, com/ubercab/client/feature/eta/ShareEtaActivity));
            return;
        }
    }

    public void onShowReceiptEvent(fdo fdo)
    {
        E.a();
    }

    public void onSplitFareEvent(fza fza1)
    {
        fza1 = dre.a(k.d(), k.e(), k.f());
        if (fza1 == null || fza1.getClients().isEmpty())
        {
            startActivityForResult(new Intent(this, com/ubercab/client/feature/faresplit/master/FareSplitInviteActivity), 2010);
            return;
        } else
        {
            G();
            return;
        }
    }

    public void onStop()
    {
        super.onStop();
        J.a();
    }

    public void onToggleCancelTripTimerEvent(fyo fyo1)
    {
        if (fyo1.a())
        {
            z.c();
            return;
        } else
        {
            z.d();
            return;
        }
    }

    public void onTripFragmentReadyEvent(fzb fzb)
    {
        H();
    }

    public void onTripUiStateChangedEvent(fzc fzc1)
    {
        if (a(fzc1))
        {
            m();
        }
        while (b() == null || aa == fzc1.b()) 
        {
            return;
        }
        aa = fzc1.b();
        z.a(fzc1.b());
        switch (fzc1.b())
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            N.a(true);
            mDrawerLayout.setDrawerLockMode(0);
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            N.a(false);
            mDrawerLayout.setDrawerLockMode(1);
            return;

        case 7: // '\007'
            N.a(true);
            break;
        }
        mDrawerLayout.setDrawerLockMode(0);
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
