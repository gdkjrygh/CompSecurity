// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.PaymentCheckBalanceResponse;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderBalance;
import com.ubercab.client.core.model.RiderTripExpenseInfo;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.core.ui.LoadingWithTextView;
import com.ubercab.client.feature.payment.amex.AmexRewardInfoActivity;
import com.ubercab.client.feature.payment.paytm.PaytmAddFundsActivity;
import com.ubercab.client.feature.payment.promo.TripBalancesActivity;
import com.ubercab.client.feature.share.ShareActivity;
import com.ubercab.payment.PaymentIntent;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripBalance;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dal;
import dar;
import dbf;
import dfp;
import djb;
import djw;
import dki;
import dkn;
import dlw;
import dml;
import dng;
import dpg;
import dsl;
import dtt;
import dui;
import dum;
import eob;
import eow;
import eox;
import epo;
import epy;
import eqa;
import eqb;
import eqc;
import eqd;
import eqe;
import erg;
import erj;
import erm;
import ero;
import erp;
import erq;
import ers;
import eru;
import erv;
import eve;
import evf;
import eyy;
import gmg;
import gsa;
import hkm;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.payment:
//            ExpenseAdapter, PaymentProfileAdapter, CreditsAdapter, ArrearsView, 
//            PaymentFooterView, AuthorizeView

public class PaymentFragment extends czb
    implements eob, epo, epy
{

    public djw c;
    public chp d;
    public Application e;
    public cev f;
    public hkr g;
    public hku h;
    public gmg i;
    public dki j;
    public dpg k;
    public dkn l;
    public eyy m;
    ListView mListView;
    LoadingWithTextView mLoadingWithTextView;
    TextView mTextViewFooter;
    public hkm n;
    public dal o;
    public CreditsAdapter p;
    private int q;
    private ArrearsView r;
    private ExpenseAdapter s;
    private PaymentProfileAdapter t;
    private PaymentProfile u;
    private icl v;
    private icl w;
    private icl x;
    private evf y;
    private final Handler z = new Handler();

    public PaymentFragment()
    {
    }

    private static int a(Bundle bundle)
    {
        return bundle.getInt("com.ubercab.MODE", 0);
    }

    private ExpenseAdapter a(Context context, int i1)
    {
        Object obj;
label0:
        {
            Object obj1 = null;
            if (i1 != 1)
            {
                obj = obj1;
                if (i1 != 2)
                {
                    break label0;
                }
            }
            obj = obj1;
            if (!m.f())
            {
                obj = RiderTripExpenseInfo.create();
                if (getArguments() != null)
                {
                    RiderTripExpenseInfo ridertripexpenseinfo = (RiderTripExpenseInfo)getArguments().getParcelable("com.ubercab.EXPENSE_INFO");
                    if (ridertripexpenseinfo != null)
                    {
                        obj = ridertripexpenseinfo;
                    }
                }
                obj = new ExpenseAdapter(context, q, ((RiderTripExpenseInfo) (obj)));
                ((ExpenseAdapter) (obj)).a(this);
            }
        }
        return ((ExpenseAdapter) (obj));
    }

    public static PaymentFragment a(Profile profile)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 7);
        if (profile != null)
        {
            profile = profile.getUuid();
        } else
        {
            profile = null;
        }
        bundle.putString("com.ubercab.ARG_PROFILE_UUID", profile);
        profile = new PaymentFragment();
        profile.setArguments(bundle);
        return profile;
    }

    public static PaymentFragment a(TripExpenseInfo tripexpenseinfo)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 2);
        bundle.putParcelable("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(tripexpenseinfo));
        tripexpenseinfo = new PaymentFragment();
        tripexpenseinfo.setArguments(bundle);
        return tripexpenseinfo;
    }

    public static PaymentFragment a(String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 4);
        bundle.putString("com.ubercab.PAYMENT_PROFILE_UUID", s1);
        s1 = new PaymentFragment();
        s1.setArguments(bundle);
        return s1;
    }

    public static PaymentFragment a(String s1, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 0);
        bundle.putString("com.ubercab.PAYMENT_PROFILE_UUID", s1);
        bundle.putBoolean("com.ubercab.IS_USING_CREDITS", flag);
        s1 = new PaymentFragment();
        s1.setArguments(bundle);
        return s1;
    }

    public static PaymentFragment a(String s1, boolean flag, boolean flag1, TripExpenseInfo tripexpenseinfo, boolean flag2)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 1);
        bundle.putString("com.ubercab.PAYMENT_PROFILE_UUID", s1);
        bundle.putParcelable("com.ubercab.EXPENSE_INFO", RiderTripExpenseInfo.create(tripexpenseinfo));
        bundle.putBoolean("com.ubercab.IS_USING_CREDITS", flag);
        bundle.putBoolean("com.ubercab.IS_USING_POINTS", flag1);
        bundle.putBoolean("com.ubercab.SHOW_PROMO", flag2);
        s1 = new PaymentFragment();
        s1.setArguments(bundle);
        return s1;
    }

    public static PaymentFragment a(ArrayList arraylist, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 3);
        bundle.putParcelableArrayList("com.ubercab.UNPAID_BILLS_JSON", arraylist);
        bundle.putString("com.ubercab.PAYMENT_PROFILE_UUID", s1);
        arraylist = new PaymentFragment();
        arraylist.setArguments(bundle);
        return arraylist;
    }

    public static PaymentProfileAdapter a(PaymentFragment paymentfragment)
    {
        return paymentfragment.t;
    }

    private String a(int i1)
    {
        switch (i1)
        {
        default:
            return "";

        case 5: // '\005'
            return getString(0x7f07006e);

        case 0: // '\0'
            return getString(0x7f070328);

        case 1: // '\001'
            return getString(0x7f0703d7);

        case 2: // '\002'
            return getString(0x7f07008d);

        case 4: // '\004'
            return getString(0x7f0701c9);

        case 3: // '\003'
            return getString(0x7f07006a);

        case 6: // '\006'
            return getString(0x7f0703cd);
        }
    }

    private void a(LayoutInflater layoutinflater, ListView listview, Profile profile)
    {
        View view = layoutinflater.inflate(0x7f03014b, listview, false);
        listview.addHeaderView(view, null, false);
        if (profile != null && dum.l(profile))
        {
            ((TextView)view.findViewById(0x7f0e03d4)).setText(0x7f0701cb);
        }
        listview.addFooterView(layoutinflater.inflate(0x7f03014a, listview, false));
        ((Button)listview.findViewById(0x7f0e03d2)).setOnClickListener(new android.view.View.OnClickListener() {

            final PaymentFragment a;

            public final void onClick(View view1)
            {
                view1 = PaymentFragment.a(a).a();
                if (view1 != null)
                {
                    a.f.c(new erm(view1));
                }
            }

            
            {
                a = PaymentFragment.this;
                super();
            }
        });
        a(((View) (listview)));
    }

    private void a(View view)
    {
        boolean flag;
        if (t != null && t.a() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Button)view.findViewById(0x7f0e03d2)).setEnabled(flag);
    }

    private void a(Client client)
    {
        client = client.getPaymentProfiles();
        if (client != null && !client.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        PaymentProfile paymentprofile;
        client = client.iterator();
        do
        {
            if (!client.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            paymentprofile = (PaymentProfile)client.next();
        } while (!dui.b(paymentprofile));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        j.a(paymentprofile.getUuid());
        return;
    }

    public static void a(PaymentFragment paymentfragment, com.ubercab.rider.realtime.model.Client client)
    {
        paymentfragment.a(client);
    }

    static void a(PaymentFragment paymentfragment, PaymentProfile paymentprofile)
    {
        paymentfragment.b(paymentprofile);
    }

    private void a(com.ubercab.rider.realtime.model.Client client)
    {
        client = client.getPaymentProfiles();
        if (client != null && !client.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        PaymentProfile paymentprofile;
        client = client.iterator();
        do
        {
            if (!client.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            paymentprofile = (PaymentProfile)client.next();
        } while (!dui.b(paymentprofile));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        j.a(paymentprofile.getUuid());
        return;
    }

    private void a(PaymentProfile paymentprofile)
    {
        gsa gsa1 = gsa.a(getActivity(), paymentprofile.getTokenType());
        com.ubercab.payment.model.PaymentProfile paymentprofile1 = dui.a(paymentprofile);
        if (i.a(dbf.n) && gsa1 != null && gsa1.q())
        {
            startActivityForResult(gsa1.a(paymentprofile1), 501);
            return;
        } else
        {
            b(paymentprofile);
            return;
        }
    }

    private void a(eqd eqd1)
    {
        eqd1.a(this);
    }

    private void a(List list)
    {
        boolean flag = true;
        l();
        com.ubercab.rider.realtime.model.City city = g.b();
        Object obj = g.c();
        ClientStatus clientstatus = g.d();
        Trip trip = g.f();
        if (city != null && clientstatus != null)
        {
            boolean flag1;
            if (obj != null && !"Looking".equals(clientstatus.getStatus()))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj = getArguments();
            if (obj == null || !((Bundle) (obj)).getBoolean("com.ubercab.IS_USING_CREDITS", true))
            {
                flag = false;
            }
            obj = p;
            if (trip != null)
            {
                flag = trip.getUseCredits();
            }
            ((CreditsAdapter) (obj)).a(city, flag1, flag, list);
        }
    }

    public static int b(PaymentFragment paymentfragment)
    {
        return paymentfragment.q;
    }

    private static int b(List list)
    {
        if (list == null)
        {
            return 0;
        }
        list = list.iterator();
        int i1;
        for (i1 = 0; list.hasNext(); i1 = ((TripBalance)list.next()).getCount() + i1) { }
        return i1;
    }

    public static PaymentFragment b()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 5);
        PaymentFragment paymentfragment = new PaymentFragment();
        paymentfragment.setArguments(bundle);
        return paymentfragment;
    }

    private eqd b(dfp dfp)
    {
        return eow.a().a(new djb(this)).a(dfp).a();
    }

    private void b(PaymentProfile paymentprofile)
    {
        if (dui.d(paymentprofile))
        {
            f.c(new erp(paymentprofile, true));
            return;
        } else
        {
            t.a(paymentprofile);
            f.c(new erm(paymentprofile));
            return;
        }
    }

    public static ArrearsView c(PaymentFragment paymentfragment)
    {
        return paymentfragment.r;
    }

    private void c(PaymentProfile paymentprofile)
    {
        if (dui.b(paymentprofile))
        {
            d.a(n.v);
        }
    }

    private void c(List list)
    {
        if (list != null && !list.isEmpty())
        {
            int i1 = b(list);
            if (i1 == 1)
            {
                list = getString(0x7f070339);
            } else
            {
                list = getString(0x7f07033a, new Object[] {
                    Integer.valueOf(i1)
                });
            }
            y = new evf(getActivity(), new eve(list, i1));
        }
    }

    private void c(boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = getString(0x7f0704a5);
        } else
        {
            s1 = getString(0x7f0704a4);
        }
        b(s1);
        if (!k.r())
        {
            l.b(flag);
            return;
        } else
        {
            w = n.a(flag).a(ico.a()).a(new eqe(this, (byte)0));
            return;
        }
    }

    public static boolean d(PaymentFragment paymentfragment)
    {
        return paymentfragment.p();
    }

    public static ExpenseAdapter e(PaymentFragment paymentfragment)
    {
        return paymentfragment.s;
    }

    public static PaymentFragment g()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("com.ubercab.MODE", 6);
        PaymentFragment paymentfragment = new PaymentFragment();
        paymentfragment.setArguments(bundle);
        return paymentfragment;
    }

    private void i()
    {
        ArrayList arraylist;
        ArrayList arraylist1;
        arraylist = new ArrayList();
        arraylist1 = new ArrayList();
        q;
        JVM INSTR tableswitch 1 3: default 48
    //                   1 362
    //                   2 362
    //                   3 362;
           goto _L1 _L2 _L2 _L2
_L1:
        Object obj;
        Object obj1;
        obj1 = getString(0x7f070679);
        obj = getString(0x7f0701b9);
_L4:
label0:
        {
            if (t != null)
            {
                arraylist.add(t);
                arraylist1.add(obj1);
            }
            Object obj2 = null;
            obj1 = obj2;
            if (!m.f())
            {
                break label0;
            }
            if (q != 1)
            {
                obj1 = obj2;
                if (q != 2)
                {
                    break label0;
                }
            }
            obj1 = new ArrayAdapter(getActivity(), 0x7f03014d, 0x7f0e03d6, new String[] {
                getString(0x7f0701cd, new Object[] {
                    dum.a(m.b(), getActivity())
                })
            });
            arraylist.add(obj1);
            arraylist1.add("");
        }
        if (p != null)
        {
            arraylist.add(p);
            arraylist1.add(obj);
        }
        if (y != null)
        {
            arraylist.add(y);
            arraylist1.add(getString(0x7f07033c));
        }
        if (s != null)
        {
            arraylist.add(s);
            arraylist1.add(getString(0x7f07022b));
        }
        obj = new dsl(getActivity(), arraylist, arraylist1);
        if (m.f() && (q == 1 || q == 2))
        {
            ((dsl) (obj)).a(((android.widget.ListAdapter) (obj1)));
        }
        ((dsl) (obj)).c(getResources().getDimensionPixelSize(0x7f0800cd));
        mListView.setAdapter(((android.widget.ListAdapter) (obj)));
        return;
_L2:
        obj1 = getString(0x7f0703d7);
        obj = getString(0x7f070063);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void j()
    {
        Object obj = null;
        boolean flag1 = false;
        Bundle bundle = getArguments();
        com.ubercab.rider.realtime.model.Client client = g.c();
        String s1;
        PaymentProfile paymentprofile;
        boolean flag;
        if (bundle != null)
        {
            s1 = bundle.getString("com.ubercab.PAYMENT_PROFILE_UUID");
        } else
        {
            s1 = null;
        }
        paymentprofile = obj;
        flag = flag1;
        if (s1 != null)
        {
            paymentprofile = obj;
            flag = flag1;
            if (client != null)
            {
                paymentprofile = client.findPaymentProfileByUuid(s1);
                flag = bundle.getBoolean("com.ubercab.IS_USING_POINTS", false);
            }
        }
        t = new PaymentProfileAdapter(f, getActivity(), q, paymentprofile, flag, m);
    }

    private void k()
    {
        s = a(getActivity(), q);
    }

    private void l()
    {
label0:
        {
            boolean flag2 = false;
            Bundle bundle = getArguments();
            boolean flag;
            boolean flag1;
            if (bundle != null && bundle.getBoolean("com.ubercab.IS_USING_CREDITS", true))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (q != 1 && q != 2)
            {
                flag1 = flag2;
                if (!i.a(dbf.bZ))
                {
                    break label0;
                }
                flag1 = flag2;
                if (!o.k())
                {
                    break label0;
                }
                flag1 = flag2;
                if (q != 0)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        p = new CreditsAdapter(getActivity(), flag1, flag);
        p.a(this);
    }

    private void m()
    {
        com.ubercab.rider.realtime.model.Client client = g.c();
        boolean flag;
        if (client != null && client.getTripBalances() != null && !client.getTripBalances().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            c(client.getTripBalances());
        }
    }

    private void n()
    {
        Object obj = g.c();
        if (obj != null && ((com.ubercab.rider.realtime.model.Client) (obj)).getReferralCode() != null)
        {
            mTextViewFooter.setVisibility(0);
            obj = new SpannableString(((com.ubercab.rider.realtime.model.Client) (obj)).getReferralCode());
            ((Spannable) (obj)).setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0d00bc)), 0, ((Spannable) (obj)).length(), 33);
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
            spannablestringbuilder.append(getString(0x7f070332));
            spannablestringbuilder.append(((CharSequence) (obj)));
            mTextViewFooter.setText(dtt.a(spannablestringbuilder));
            return;
        } else
        {
            mTextViewFooter.setVisibility(8);
            return;
        }
    }

    private void o()
    {
        mTextViewFooter.setVisibility(0);
        mTextViewFooter.setText(0x7f0703cf);
    }

    private boolean p()
    {
        return i.a(dbf.aE);
    }

    private void q()
    {
        mLoadingWithTextView.setVisibility(0);
    }

    private void r()
    {
        mLoadingWithTextView.setVisibility(8);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        f.c(new erp(t.a(), false));
    }

    public final volatile void a(czj czj)
    {
        a((eqd)czj);
    }

    public final void a(boolean flag)
    {
        String s1;
        if (q == 2)
        {
            c(flag);
        } else
        if (q == 1 || q == 0)
        {
            f.c(new erv(flag));
        }
        if (flag)
        {
            s1 = "on";
        } else
        {
            s1 = "off";
        }
        d.a(AnalyticsEvent.create("tap").setName(n.bW).setValue(s1));
    }

    public final void b(boolean flag)
    {
        f.c(new ers(flag));
    }

    public final void d(String s1)
    {
        Bundle bundle = getArguments();
        com.ubercab.rider.realtime.model.Client client = g.c();
        if (client != null && bundle != null)
        {
            getArguments().putString("com.ubercab.PAYMENT_PROFILE_UUID", s1);
            t.a(client.findPaymentProfileByUuid(s1));
            if ((m.g() || m.h()) && q == 7)
            {
                a(mListView);
            }
        }
    }

    public final cic f()
    {
        cic cic = czb.a;
        switch (q)
        {
        default:
            return cic;

        case 3: // '\003'
            return l.dQ;

        case 2: // '\002'
            return l.dS;

        case 0: // '\0'
            return l.dT;

        case 1: // '\001'
            return l.dU;
        }
    }

    final void h()
    {
        PaymentProfile paymentprofile;
        for (paymentprofile = t.a(); paymentprofile == null || !PaytmAddFundsActivity.a(paymentprofile);)
        {
            return;
        }

        l l1 = l.U;
        d.a(l1);
        startActivity(PaytmAddFundsActivity.a(e, i, paymentprofile.getUuid()));
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 501 && j1 == -1)
        {
            intent = PaymentIntent.a(intent).a();
            com.ubercab.rider.realtime.model.Client client = g.c();
            if (intent != null && client != null)
            {
                z.post(new Runnable(client, intent) {

                    final com.ubercab.rider.realtime.model.Client a;
                    final String b;
                    final PaymentFragment c;

                    public final void run()
                    {
                        PaymentFragment.a(c, a.findPaymentProfileByUuid(b));
                    }

            
            {
                c = PaymentFragment.this;
                a = client;
                b = s1;
                super();
            }
                });
            }
        }
    }

    void onClickFooter()
    {
        if (q != 6)
        {
            startActivity(new Intent(getActivity(), com/ubercab/client/feature/share/ShareActivity));
        }
    }

    public void onClientEvent(ClientEvent clientevent)
    {
        if (k.n())
        {
            return;
        } else
        {
            a(clientevent.getClient());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            q = a(bundle1);
        }
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        boolean flag;
        viewgroup = layoutinflater.inflate(0x7f03010d, viewgroup, false);
        ButterKnife.inject(this, viewgroup);
        if (q == 0 && i.a(dbf.bZ) && o.k())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (q != 3) goto _L2; else goto _L1
_L1:
        r = (ArrearsView)layoutinflater.inflate(0x7f030121, mListView, false);
        mListView.addHeaderView(r, null, false);
_L4:
        return viewgroup;
_L2:
        if (q != 1 && q != 2 && !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        layoutinflater = (PaymentFooterView)layoutinflater.inflate(0x7f03010c, mListView, false);
        layoutinflater.a(this);
        if (!getArguments().getBoolean("com.ubercab.SHOW_PROMO", false))
        {
            layoutinflater.a();
        }
        mListView.addFooterView(layoutinflater, null, false);
        if (flag)
        {
            n();
            return viewgroup;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (q == 0)
        {
            n();
            return viewgroup;
        }
        if (q == 5)
        {
            layoutinflater = (AuthorizeView)layoutinflater.inflate(0x7f030122, mListView, false);
            layoutinflater.a(getString(0x7f07006f));
            mListView.addHeaderView(layoutinflater);
            return viewgroup;
        }
        if (q == 6)
        {
            layoutinflater = (AuthorizeView)layoutinflater.inflate(0x7f030122, mListView, false);
            layoutinflater.a(getString(0x7f0703ce));
            mListView.addHeaderView(layoutinflater);
            o();
            return viewgroup;
        }
        if (q == 7 && getArguments() != null)
        {
            bundle = m.a(getArguments().getString("com.ubercab.ARG_PROFILE_UUID"));
            a(layoutinflater, mListView, bundle);
            return viewgroup;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onGetCreditBalanceResponseEvent(dlw dlw1)
    {
        r();
        if (!dlw1.i())
        {
            d().a_(getString(0x7f0703a9));
        } else
        {
            dlw1 = (RiderBalance)dlw1.g();
            if (dlw1 != null)
            {
                c(dlw1.getTripCreditBalanceStrings());
                a(dlw1.getCreditBalanceStrings());
                i();
                return;
            }
        }
    }

    public void onItemClick(int i1)
    {
        Object obj = mListView.getItemAtPosition(i1);
        if (!(obj instanceof PaymentProfile)) goto _L2; else goto _L1
_L1:
        PaymentProfile paymentprofile;
        paymentprofile = (PaymentProfile)obj;
        obj = null;
        q;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 137
    //                   1 123
    //                   2 130
    //                   3 116;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if (obj != null)
        {
            d.a(AnalyticsEvent.create("tap").setName(((cia) (obj))).setValue(paymentprofile.getCardType()).setValuePosition(Long.valueOf(i1)));
        }
        if (paymentprofile != com.ubercab.client.core.model.PaymentProfile.GOOGLE_WALLET) goto _L9; else goto _L8
_L8:
        f.c(new erq());
_L11:
        return;
_L7:
        obj = n.cd;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = n.cg;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = n.ce;
        continue; /* Loop/switch isn't completed */
_L4:
        obj = n.cf;
        continue; /* Loop/switch isn't completed */
_L9:
        switch (q)
        {
        default:
            return;

        case 0: // '\0'
        case 5: // '\005'
            f.c(new erj(paymentprofile));
            return;

        case 3: // '\003'
            c(paymentprofile);
            a(paymentprofile);
            return;

        case 1: // '\001'
            a(paymentprofile);
            return;

        case 2: // '\002'
            if (dui.d(paymentprofile))
            {
                f.c(new erp(paymentprofile, true));
                return;
            } else
            {
                f.c(new erg(paymentprofile));
                return;
            }

        case 4: // '\004'
            f.c(new erm(paymentprofile));
            return;

        case 7: // '\007'
            u = paymentprofile;
            t.a(u);
            a(mListView);
            return;

        case 6: // '\006'
            f.c(new ero());
            return;
        }
_L2:
        if (!(obj instanceof eve)) goto _L11; else goto _L10
_L10:
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/payment/promo/TripBalancesActivity));
        return;
        if (true) goto _L3; else goto _L12
_L12:
    }

    public void onPause()
    {
        super.onPause();
        v.b();
        x.b();
        if (w != null && !w.c())
        {
            w.b();
        }
    }

    public void onPaymentCheckBalanceResponseEvent(dml dml1)
    {
        if (dml1.i())
        {
            dml1 = (PaymentCheckBalanceResponse)dml1.g();
            t.a(dml1.getDisplayAmount());
            t.notifyDataSetChanged();
        }
    }

    public void onPingEvent(dar dar1)
    {
        Trip trip = null;
        if (!k.n())
        {
            Ping ping = dar1.a();
            if (ping != null)
            {
                dar1 = ping.getClient();
            } else
            {
                dar1 = null;
            }
            if (ping != null)
            {
                trip = ping.getTrip();
            }
            t.a(dar1, trip);
            if (q == 3)
            {
                r.a(dar1);
            } else
            if (q != 4 && q != 7 && !p())
            {
                p.a(ping);
            }
            if (s != null && getActivity() != null)
            {
                s.a(getActivity(), dar1);
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        String s1 = a(q);
        if (!TextUtils.isEmpty(s1))
        {
            d().b().a(s1);
        }
        v = ica.a(h.b(), h.d(), h.f(), h.h(), new eqc((byte)0)).a(ico.a()).c(new eqb(this, (byte)0));
        x = h.d().c(new eqa(this, (byte)0));
    }

    public void onSetUseCreditsResponseEvent(dng dng1)
    {
        e();
        if (m.f())
        {
            dng1 = (Ping)dng1.g();
            if (dng1 == null)
            {
                dng1 = null;
            } else
            {
                dng1 = dng1.getTrip();
            }
            if (dng1 != null)
            {
                f.c(new erv(dng1.getUseCredits()));
            }
        }
    }

    public void onShowRewardInfoEvent(eru eru1)
    {
        startActivity(AmexRewardInfoActivity.a(e, eru1.a(), eru1.b(), eru1.c()));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (q == 3)
        {
            view = getArguments().getParcelableArrayList("com.ubercab.UNPAID_BILLS_JSON");
            if (view != null)
            {
                view = new ArrayList(view);
            } else
            {
                view = null;
            }
            r.a(view);
        }
        j();
        if (q != 3 && q != 4 && q != 7)
        {
            if (p())
            {
                k();
                i();
                q();
                c.b(o.z());
            } else
            {
                m();
                l();
                k();
                i();
            }
        } else
        {
            i();
        }
        if (q == 7 && u != null)
        {
            t.a(u);
        }
    }
}
