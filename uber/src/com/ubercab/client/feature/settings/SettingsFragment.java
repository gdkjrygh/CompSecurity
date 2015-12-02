// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cgh;
import cgt;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.RiderAccount;
import com.ubercab.client.core.model.TaggedLocationsResponse;
import com.ubercab.client.feature.music.MusicProviderAdapter;
import com.ubercab.client.feature.profiles.ProfileSettingsActivity;
import com.ubercab.client.feature.profiles.ProfilesAdapter;
import com.ubercab.client.feature.profiles.onboarding.OnBoardingIntroActivity;
import com.ubercab.client.feature.safetynet.SafetyNetActivity;
import com.ubercab.client.feature.safetynet.SafetyNetProfileSectionAdapter;
import com.ubercab.client.feature.search.LocationSearchAdapter;
import com.ubercab.locale.name.NameInput;
import com.ubercab.locale.phone.PhoneNumberView;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.ui.CircleImageView;
import com.ubercab.ui.FloatingLabelEditText;
import czb;
import czj;
import dar;
import dbf;
import dce;
import dfp;
import djb;
import dkd;
import dnl;
import dnm;
import dnn;
import dpg;
import dqt;
import drc;
import dsl;
import duj;
import dul;
import duo;
import eyv;
import eyy;
import ezg;
import fei;
import fff;
import ffy;
import fgl;
import fgs;
import fgt;
import fhb;
import fhc;
import fhd;
import gmg;
import gow;
import gpp;
import hkm;
import hkr;
import hku;
import ica;
import icl;
import ico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.settings:
//            SettingsActivity

public class SettingsFragment extends czb
    implements eyv
{

    public chp c;
    public dqt d;
    public drc e;
    public cev f;
    public hkr g;
    public hku h;
    public gmg i;
    public dkd j;
    public cgh k;
    public dpg l;
    public dce m;
    FloatingLabelEditText mEditTextEmail;
    CircleImageView mImageViewPicture;
    NameInput mNameInput;
    PhoneNumberView mPhoneNumberView;
    public eyy n;
    public hkm o;
    public fei p;
    ProfilesAdapter q;
    private icl r;
    private icl s;
    private LocationSearchAdapter t;
    private MusicProviderAdapter u;
    private ListAdapter v;
    private RiderAccount w;

    public SettingsFragment()
    {
    }

    public static RiderAccount a(SettingsFragment settingsfragment)
    {
        return settingsfragment.w;
    }

    static SettingsFragment a(RiderAccount rideraccount)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("rider_account", rideraccount);
        rideraccount = new SettingsFragment();
        rideraccount.setArguments(bundle);
        return rideraccount;
    }

    private static List a(Map map)
    {
        ArrayList arraylist = new ArrayList();
        String as[] = LocationSearchResult.HOME_WORK_TAGS;
        int j1 = as.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            String s1 = as[i1];
            LocationSearchResult locationsearchresult = (LocationSearchResult)map.get(s1);
            if (locationsearchresult != null)
            {
                arraylist.add(new ffy(locationsearchresult));
            } else
            {
                arraylist.add(new ffy(s1));
            }
            i1++;
        }
        return arraylist;
    }

    private void a(Context context, ListView listview)
    {
        listview.addHeaderView(LayoutInflater.from(context).inflate(0x7f03002d, listview, false));
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        a(((List) (arraylist1)), ((List) (arraylist)));
        a(context, ((List) (arraylist)), ((List) (arraylist1)));
        b(context, arraylist1, arraylist);
        c(context, arraylist1, arraylist);
        context = new dsl(context, arraylist1, arraylist);
        if ((n.f() || n.h()) && v != null)
        {
            context.a(v);
        }
        context.c((int)getResources().getDimension(0x7f0802db));
        listview.setAdapter(context);
    }

    private void a(Context context, List list, List list1)
    {
        boolean flag = n.h();
        boolean flag1 = n.f();
        if (flag1 || flag)
        {
            list.add(getString(0x7f07037a));
            q = new ProfilesAdapter(context, this, ezg.b, n, i, k, g, c);
            list1.add(q);
            context = getActivity();
            int i1;
            if (flag1)
            {
                i1 = 0x7f0703e6;
            } else
            {
                i1 = 0x7f0703e5;
            }
            v = new ArrayAdapter(context, new String[] {
                getString(i1)
            }) {

                final SettingsFragment a;

                public final boolean isEnabled(int j1)
                {
                    return false;
                }

            
            {
                a = SettingsFragment.this;
                super(context, 0x7f030155, 0x7f0e03e4, as);
            }
            };
            list1.add(v);
            list.add("");
        }
    }

    public static void a(SettingsFragment settingsfragment, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        settingsfragment.a(s1, s2, s3, s4, s5, s6);
    }

    private void a(fhd fhd1)
    {
        fhd1.a(this);
    }

    private void a(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        mNameInput.a(s1);
        mNameInput.b(s2);
        s2 = mEditTextEmail;
        s1 = s3;
        if (RiderAccount.isFakedEmail(s3))
        {
            s1 = "";
        }
        s2.d(s1);
        s1 = duj.d(s5, s4);
        mPhoneNumberView.a(s1, s4);
        if (!TextUtils.isEmpty(s6))
        {
            s1 = fgl.a(getResources());
            k.a(s6).a(s1).b(0x7f02006f).a(mImageViewPicture);
            return;
        } else
        {
            mImageViewPicture.setImageResource(0x7f02006f);
            return;
        }
    }

    private void a(List list, List list1)
    {
        list1.add(getString(0x7f0700a7));
        list.add(u);
        c.a(l.hM);
    }

    public static MusicProviderAdapter b(SettingsFragment settingsfragment)
    {
        return settingsfragment.u;
    }

    private fhd b(dfp dfp)
    {
        return fgs.a().a(new djb(this)).a(dfp).a();
    }

    private void b(Context context, List list, List list1)
    {
        if (!e.g())
        {
            return;
        } else
        {
            list1.add(getString(0x7f0700b0));
            list.add(new SafetyNetProfileSectionAdapter(context, f, getString(0x7f0703be)));
            return;
        }
    }

    private void c(Context context, List list, List list1)
    {
        t = new LocationSearchAdapter(context, f, false, false);
        list.add(t);
        list1.add(getString(0x7f07035d));
        j.b();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(Client client)
    {
        if (client != null)
        {
            u.a(client.getThirdPartyIdentities());
        }
    }

    public final void a(Profile profile, boolean flag)
    {
        if (!flag)
        {
            startActivity(ProfileSettingsActivity.a(getActivity(), profile));
            return;
        } else
        {
            c.a(n.iQ);
            startActivityForResult(OnBoardingIntroActivity.a(getActivity()), 2001);
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((fhd)czj);
    }

    public final void b(RiderAccount rideraccount)
    {
        w = rideraccount;
        a(rideraccount.getFirstName(), rideraccount.getLastName(), rideraccount.getEmail(), rideraccount.getMobileCountryIso2(), rideraccount.getCurrentMobile(), rideraccount.getPictureUrl());
    }

    public final cic f()
    {
        return l.fs;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (w != null)
        {
            b(w);
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1 && i.a(dbf.cg) && i1 == 2001)
        {
            getActivity().finish();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (getArguments() != null)
        {
            w = (RiderAccount)getArguments().getParcelable("rider_account");
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030172, viewgroup, false);
        u = new MusicProviderAdapter(layoutinflater.getContext(), f, i);
        a(layoutinflater.getContext(), (ListView)layoutinflater.findViewById(0x7f0e045c));
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
        r.b();
        if (s != null)
        {
            s.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!l.n())
        {
            if (dul.a(dar1 = dar1.a()))
            {
                if (w == null)
                {
                    com.ubercab.client.core.model.Client client = dar1.getClient();
                    a(client.getFirstName(), client.getLastName(), client.getEmail(), client.getMobileCountryIso2(), client.getCurrentMobile(), client.getPictureUrl());
                }
                if (dul.a(dar1) && dul.b(dar1))
                {
                    u.a(dar1.getAppConfig().getSpotifyLinkAndUnlinkDisabled());
                    u.a(dar1.getClient().getThirdPartyIdentities());
                    return;
                }
            }
        }
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu = menu.findItem(0x7f0e06c1);
        if (menu != null)
        {
            if (i.a(dbf.aK))
            {
                menu.setTitle(0x7f0701f5);
            }
            boolean flag;
            if (w != null && w.isClient())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            menu.setVisible(flag);
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(SettingsActivity.a(i)));
        r = ica.a(h.d(), h.a(), new fhc((byte)0)).a(ico.a()).c(new fhb(this, (byte)0));
        if (n.f() && q != null)
        {
            q.notifyDataSetChanged();
        }
    }

    public void onSafetyNetClickedEvent(fff fff)
    {
        fff = new Intent(getActivity(), com/ubercab/client/feature/safetynet/SafetyNetActivity);
        if (!p.k())
        {
            fff.putExtra("start_fragment", 1);
        }
        getActivity().startActivity(fff);
        c.a(n.eC);
    }

    public void onTaggedLocationsResponseEvent(dnl dnl1)
    {
        if (dnl1.i())
        {
            Object obj = ((TaggedLocationsResponse)dnl1.g()).getResults();
            if (obj != null)
            {
                dnl1 = new HashMap();
                LocationSearchResult locationsearchresult;
                for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); dnl1.put(locationsearchresult.getTag(), locationsearchresult))
                {
                    locationsearchresult = (LocationSearchResult)((Iterator) (obj)).next();
                }

                obj = a(dnl1);
                t.a(((List) (obj)), null);
                int i1 = 0;
                while (i1 < ((List) (obj)).size()) 
                {
                    ffy ffy1 = (ffy)((List) (obj)).get(i1);
                    if (ffy1.c() == null)
                    {
                        dnl1 = l.bC;
                    } else
                    {
                        dnl1 = l.bD;
                    }
                    c.a(AnalyticsEvent.create("impression").setName(dnl1).setValue(ffy1.b()).setValuePosition(Long.valueOf(i1)));
                    i1++;
                }
            }
        }
    }

    public void onThirdPartyAuthResponseEvent(dnm dnm1)
    {
        if (dnm1.e())
        {
            a(((Ping)dnm1.g()).getClient());
        }
    }

    public void onThirdPartyDeleteResponseEvent(dnn dnn1)
    {
        if (dnn1.e() && l.n())
        {
            s = o.a().b(duo.a());
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = mNameInput;
        int i1;
        if ("CHINA".equals(m.a()) && gpp.a(Locale.getDefault()))
        {
            i1 = gow.b;
        } else
        {
            i1 = gow.a;
        }
        view.a(i1);
        mNameInput.setEnabled(false);
        mEditTextEmail.setEnabled(false);
        mPhoneNumberView.setEnabled(false);
    }
}
