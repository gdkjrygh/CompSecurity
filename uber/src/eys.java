// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.payment.AddPaymentActivity;
import com.ubercab.client.feature.payment.PaymentActivity;
import com.ubercab.client.feature.profiles.BadgeView;
import com.ubercab.client.feature.profiles.EditBadgeActivity;
import com.ubercab.client.feature.profiles.EditProfileFieldActivity;
import com.ubercab.client.feature.profiles.TroyProfilePreferencesAdapter;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.ui.TextView;
import java.util.ArrayList;
import java.util.List;

public class eys extends czb
{

    chp c;
    cev d;
    hkr e;
    cgh f;
    eyy g;
    private PaymentProfile h;
    private TroyProfilePreferencesAdapter i;
    private View j;
    private ProgressDialog k;
    private Profile l;
    private ProgressDialog m;

    public eys()
    {
    }

    static ProgressDialog a(eys eys1, ProgressDialog progressdialog)
    {
        eys1.k = progressdialog;
        return progressdialog;
    }

    private static View a(ListView listview, LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(0x7f030097, listview, false);
    }

    static Profile a(eys eys1)
    {
        return eys1.l;
    }

    public static eys a(Profile profile)
    {
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_TROY_PROFILE_UUID", profile.getUuid());
        profile = new eys();
        profile.setArguments(bundle);
        return profile;
    }

    private static String a(Resources resources, List list)
    {
        if (list == null)
        {
            return resources.getString(0x7f0702d6);
        }
        if (list.contains("Monthly") && list.contains("Weekly"))
        {
            return resources.getString(0x7f07066f);
        }
        if (list.contains("Monthly"))
        {
            return resources.getString(0x7f0702bb);
        }
        if (list.contains("Weekly"))
        {
            return resources.getString(0x7f07066e);
        } else
        {
            return resources.getString(0x7f0702d6);
        }
    }

    private List a()
    {
        ArrayList arraylist = new ArrayList();
        ezh ezh1 = (new ezh(ezi.c, getString(0x7f070207))).a(l.getEmail());
        ezh ezh2 = (new ezh(ezi.b, getString(0x7f0701c9))).a(b());
        if (dum.d(l))
        {
            arraylist.add(ezh1.g());
        } else
        {
            arraylist.add(ezh1);
        }
        if (dum.c(l))
        {
            arraylist.add((new ezh(ezi.e, getString(0x7f070496))).g().a(a(getResources(), l.getSelectedSummaryPeriods())));
        }
        if (dum.e(l))
        {
            arraylist.add(ezh2.a(getString(0x7f0702af)));
        } else
        {
            arraylist.add(ezh2.g());
        }
        if (dum.a(l) && dui.a(esf.a.a(), e.c()))
        {
            arraylist.add((new ezh(ezi.a, getString(0x7f0703db))).h().a(l.getIsExpensingEnabled()));
        }
        return arraylist;
    }

    private void a(Context context, ListView listview)
    {
        context = LayoutInflater.from(context);
        j = context.inflate(0x7f030151, listview, false);
        if (dum.p(l))
        {
            j.setOnClickListener(new android.view.View.OnClickListener() {

                final eys a;

                public final void onClick(View view)
                {
                    a.c.a(n.iR);
                    if (a.g.b(eys.a(a)) == null)
                    {
                        eys.a(a, dtg.a(a.getActivity(), a.getString(0x7f070296)));
                        eys.b(a).show();
                        a.g.i();
                        return;
                    } else
                    {
                        eys.c(a);
                        return;
                    }
                }

            
            {
                a = eys.this;
                super();
            }
            });
        }
        listview.addHeaderView(j, null, dum.p(l));
        listview.addHeaderView(a(listview, ((LayoutInflater) (context))), null, false);
        listview.addFooterView(a(listview, ((LayoutInflater) (context))), null, false);
        context = context.inflate(0x7f030150, listview, false);
        listview.addFooterView(context, null, false);
        a(j, ((View) (context)));
    }

    private void a(View view)
    {
        ((TextView)view.findViewById(0x7f0e03dc)).setText(dum.a(l, getActivity()));
        ezc.a((BadgeView)view.findViewById(0x7f0e03db), l, f);
    }

    private void a(View view, View view1)
    {
        a(view);
        if (!dum.p(l))
        {
            ((TextView)view1.findViewById(0x7f0e03d9)).setText(0x7f070376);
            ((TextView)view.findViewById(0x7f0e03dd)).setText(0x7f0702ae);
            view.findViewById(0x7f0e03de).setVisibility(8);
        }
    }

    private void a(eyt eyt1)
    {
        eyt1.a(this);
    }

    private void a(boolean flag)
    {
        g.a(l, flag);
    }

    private boolean a(Intent intent)
    {
        if (intent != null && intent.hasExtra("com.ubercab.PAYMENT_PROFILE_UUID"))
        {
            intent = intent.getStringExtra("com.ubercab.PAYMENT_PROFILE_UUID");
            g.a(l, intent);
            return true;
        } else
        {
            return false;
        }
    }

    static ProgressDialog b(eys eys1)
    {
        return eys1.k;
    }

    private eyt b(dfp dfp)
    {
        return exv.a().a(new djb(this)).a(dfp).a();
    }

    private String b()
    {
        Object obj = e.c();
        if (obj != null)
        {
            obj = ((Client) (obj)).getPaymentProfiles();
        } else
        {
            obj = null;
        }
        if (obj == null || h == null)
        {
            return getString(0x7f07009d);
        }
        FragmentActivity fragmentactivity = getActivity();
        PaymentProfile paymentprofile = h;
        boolean flag;
        if (!g.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return dui.a(fragmentactivity, paymentprofile, ((List) (obj)), flag);
    }

    private void b(Context context, ListView listview)
    {
        i = new TroyProfilePreferencesAdapter(context, a(), d);
        a(context, listview);
        listview.setAdapter(i);
    }

    static void c(eys eys1)
    {
        eys1.h();
    }

    private void g()
    {
        Client client = e.c();
        if (client != null)
        {
            h = client.findPaymentProfileByUuid(l.getDefaultPaymentProfileUuid());
        }
    }

    private void h()
    {
        startActivityForResult(EditBadgeActivity.a(getActivity(), l), 2007);
    }

    private void i()
    {
        m = dtg.a(getActivity(), getString(0x7f07063b));
        m.show();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eyt)czj);
    }

    public final cic f()
    {
        return RiderActivity.a;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -99)
        {
            ((RiderActivity)getActivity()).a_(getString(0x7f070631));
            return;
        }
        if (l != null)
        {
            l = g.a(l.getUuid());
        }
        i1;
        JVM INSTR lookupswitch 5: default 108
    //                   2004: 157
    //                   2005: 116
    //                   2006: 131
    //                   2007: 190
    //                   3003: 116;
           goto _L1 _L2 _L3 _L4 _L5 _L3
_L1:
        i.notifyDataSetChanged();
        return;
_L3:
        if (a(intent))
        {
            i();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i.a(ezi.c).a(l.getEmail());
        continue; /* Loop/switch isn't completed */
_L2:
        i.a(ezi.e).a(a(getResources(), l.getSelectedSummaryPeriods()));
        continue; /* Loop/switch isn't completed */
_L5:
        a(j);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        l = g.a(getArguments().getString("EXTRA_TROY_PROFILE_UUID"));
        g();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030153, viewgroup, false);
        b(layoutinflater.getContext(), (ListView)layoutinflater.findViewById(0x7f0e03e1));
        return layoutinflater;
    }

    public void onProfilePreferencesItemSelectEvent(ezq ezq1)
    {
        final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[ezi.values().length];
                try
                {
                    a[ezi.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[ezi.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[ezi.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ezi.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[ezq1.a().ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 62
    //                   2 135
    //                   3 160
    //                   4 188;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        ezq1 = null;
_L7:
        if (c != null && ezq1 != null)
        {
            c.a(ezq1);
        }
        return;
_L2:
        if (!dum.e(l) && !dui.a(e.c()))
        {
            ezq1 = n.iY;
            startActivityForResult(AddPaymentActivity.a(getActivity(), null), 3003);
        } else
        {
            ezq1 = n.iX;
            startActivityForResult(PaymentActivity.a(getActivity(), h, null), 2005);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ezq1 = n.jc;
        startActivityForResult(EditProfileFieldActivity.a(getActivity(), l), 2004);
        continue; /* Loop/switch isn't completed */
_L4:
        ezq1 = n.iU;
        startActivityForResult(EditProfileFieldActivity.a(getActivity(), l, eyh.a), 2006);
        continue; /* Loop/switch isn't completed */
_L5:
        n n1 = n.iT;
        i();
        a(ezq1.b());
        ezq1 = n1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onTroyProfileThemeOptionsUpdateEvent(ezt ezt)
    {
        if (k != null)
        {
            k.dismiss();
        }
        if (g.b(l) == null)
        {
            ijg.d("Unable to get Theme Options for Profile Uuid = %s", new Object[] {
                l.getUuid()
            });
            ezt = dtf.a(getActivity());
            ezt.setMessage(getString(0x7f070631));
            ezt.setButton(-1, getActivity().getString(0x7f0702f8), new android.content.DialogInterface.OnClickListener() {

                final eys a;

                public final void onClick(DialogInterface dialoginterface, int i1)
                {
                    dialoginterface.dismiss();
                }

            
            {
                a = eys.this;
                super();
            }
            });
            ezt.show();
            return;
        } else
        {
            h();
            return;
        }
    }

    public void onUpdateProfileResponseEvent(dns dns1)
    {
        if (m != null)
        {
            m.dismiss();
        }
        if (dns1.k() || dns1.a() == null)
        {
            ((RiderActivity)getActivity()).a_(getString(0x7f070639));
            return;
        }
        l = g.a(dns1.a().getUuid());
        g();
        i.a(ezi.b).a(b());
        if (dum.a(l) && i.a(ezi.a) != null)
        {
            i.a(ezi.a).a(dns1.a().getIsExpensingEnabled());
        }
        i.notifyDataSetChanged();
    }
}
