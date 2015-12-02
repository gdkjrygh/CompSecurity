// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverCapabilities;
import com.ubercab.ui.Button;
import czb;
import czj;
import dfp;
import djb;
import dkn;
import dkv;
import dnm;
import dno;
import dnp;
import dpg;
import dqt;
import dtp;
import egn;
import ego;
import ehy;
import ehz;
import hkp;
import hkr;
import ica;
import icl;
import ico;
import java.util.Map;
import n;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderAuthorizationActivity, MusicProviderOfferActivity

public class LinkMusicProviderFragment extends czb
    implements android.content.DialogInterface.OnDismissListener
{

    public chp c;
    public dqt d;
    public hkr e;
    public dpg f;
    public dkn g;
    public dkv h;
    public hkp i;
    private icl j;
    private TunesProvider k;
    Button mButtonLinkProvider;
    ImageView mImageViewFeatureFocus;

    public LinkMusicProviderFragment()
    {
    }

    static LinkMusicProviderFragment a(TunesProvider tunesprovider)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.MUSIC_PROVIDER", tunesprovider);
        tunesprovider = new LinkMusicProviderFragment();
        tunesprovider.setArguments(bundle);
        return tunesprovider;
    }

    private void a()
    {
        e();
        String s = getString(0x7f0704a2);
        String s1 = getString(0x7f0700a3);
        String s2 = getString(0x7f0702f8);
        dtp.a(d(), 0, s, s1, s2);
    }

    public static void a(LinkMusicProviderFragment linkmusicproviderfragment)
    {
        linkmusicproviderfragment.b();
    }

    public static void a(LinkMusicProviderFragment linkmusicproviderfragment, Client client)
    {
        linkmusicproviderfragment.a(client);
    }

    private void a(Client client)
    {
        boolean flag2 = false;
        Object obj = e.f();
        City city = e.b();
        if (obj != null)
        {
            obj = ((Trip) (obj)).getDriver();
        } else
        {
            obj = null;
        }
        if (obj != null && city != null && client != null)
        {
            obj = ((TripDriver) (obj)).getCapabilities();
            boolean flag;
            boolean flag1;
            if (obj != null && ((TripDriverCapabilities) (obj)).getMusic())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = k.getId();
            client = client.getThirdPartyIdentities();
            flag1 = flag2;
            if (client != null)
            {
                flag1 = flag2;
                if (client.containsKey(obj))
                {
                    flag1 = true;
                }
            }
            if (flag && flag1 && obj != null)
            {
                h.a(((String) (obj)), Boolean.valueOf(true), city.getCityName(), city.getCountryIso2());
            }
        }
    }

    private void a(ehz ehz1)
    {
        ehz1.a(this);
    }

    private ehz b(dfp dfp)
    {
        return egn.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ehz)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        if (i1 != -1 || l != 1) goto _L2; else goto _L1
_L1:
        intent = intent.getStringExtra("com.ubercab.AUTHORIZATION_CODE");
        if (f.f()) goto _L4; else goto _L3
_L3:
        g.h(k.getId(), intent);
_L6:
        a(getString(0x7f0700a8), this);
_L2:
        return;
_L4:
        if (k.getId() != null)
        {
            j = i.c(k.getId(), intent).a(ico.a()).a(new ehy(this, (byte)0));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    void onClickLinkProvider()
    {
        c.a(n.gP);
        startActivityForResult(MusicProviderAuthorizationActivity.a(getActivity(), k), 1);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = (TunesProvider)getArguments().getParcelable("com.ubercab.MUSIC_PROVIDER");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300b4, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
    }

    public void onPause()
    {
        super.onPause();
        if (j != null)
        {
            j.b();
        }
    }

    public void onThirdPartyAuthResponseEvent(dnm dnm1)
    {
        if (!dnm1.e())
        {
            b();
            return;
        } else
        {
            a(((Ping)dnm1.g()).getClient());
            return;
        }
    }

    public void onTunesHandshakeResponseEvent(dno dno)
    {
        dno = d();
        if (dno == null)
        {
            return;
        } else
        {
            dno.finish();
            return;
        }
    }

    public void onTunesProviderResponseEvent(dnp dnp1)
    {
        com.ubercab.client.core.app.RiderActivity rideractivity = d();
        if (rideractivity == null)
        {
            return;
        }
        if (!dnp1.i() && dnp1.n() == 403)
        {
            startActivity(new Intent(rideractivity, com/ubercab/client/feature/music/MusicProviderOfferActivity));
            rideractivity.finish();
            return;
        }
        if (dnp1.i())
        {
            Object obj = (TunesProvider)dnp1.g();
            String s = ((TunesProvider) (obj)).getEligibleTrial();
            if (!TextUtils.isEmpty(s))
            {
                dnp1 = e.b();
                if (dnp1 != null)
                {
                    dnp1 = dnp1.getCityName();
                } else
                {
                    dnp1 = null;
                }
                obj = ((TunesProvider) (obj)).getId();
                startActivity(MusicProviderOfferActivity.a(rideractivity.getApplication(), ((String) (obj)), s, dnp1));
            }
            rideractivity.finish();
            return;
        } else
        {
            rideractivity.finish();
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        mButtonLinkProvider.setText(getString(0x7f0700a4, new Object[] {
            k.getName()
        }));
    }
}
