// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.ubercab.client.core.config.AppConfigKey;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.client.feature.music.LinkMusicProviderActivity;
import com.ubercab.client.feature.music.MusicActivity;
import com.ubercab.client.feature.music.MusicControlChannelService;
import com.ubercab.client.feature.music.MusicProviderChooserActivity;
import com.ubercab.client.feature.music.MusicProviderOfferActivity;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ThirdPartyIdentity;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverCapabilities;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ghc extends ghw
{

    chp c;
    dqt d;
    cev e;
    hkr f;
    hku g;
    gmg h;
    dpg i;
    dkv j;
    private final Map k = gkl.a(TunesProvider.getKnownProviderCount());
    private String l;
    private String m;
    private String n;
    private icl o;

    public ghc()
    {
    }

    static String a(ghc ghc1, String s)
    {
        ghc1.m = s;
        return s;
    }

    private void a()
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            m = null;
            l = null;
            getActivity().stopService(MusicControlChannelService.a(getActivity().getApplication()));
            return;
        }
    }

    private void a(TunesProvider tunesprovider)
    {
        if (h.a(dbf.bo)) goto _L2; else goto _L1
_L1:
        City city;
        return;
_L2:
        Object obj;
        String s;
        if ((city = f.b()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = tunesprovider.getId();
        s = j.a();
        if (!tunesprovider.getLinked().booleanValue())
        {
            break; /* Loop/switch isn't completed */
        }
        if (k.containsKey(obj))
        {
            l = (String)k.get(obj);
            m = ((String) (obj));
            obj = MusicControlChannelService.a(getActivity().getApplication(), l, n, m);
            getActivity().startService(((Intent) (obj)));
            startActivity(MusicActivity.a(getContext(), city.getCityName(), city.getCountryIso2(), tunesprovider));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if ("spotify".equals(obj) && !TextUtils.isEmpty(s))
        {
            startActivity(MusicProviderOfferActivity.a(getActivity().getApplication(), ((String) (obj)), j.a(), city.getCityName()));
            return;
        }
        if ("spotify".equals(obj))
        {
            startActivity(LinkMusicProviderActivity.a(getContext(), tunesprovider));
            return;
        }
        if ("rdio".equals(obj))
        {
            m = ((String) (obj));
            obj = MusicControlChannelService.a(getActivity().getApplication(), null, n, m);
            getActivity().startService(((Intent) (obj)));
            startActivity(MusicActivity.a(getContext(), city.getCityName(), city.getCountryIso2(), tunesprovider));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(ghc ghc1)
    {
        ghc1.a();
    }

    private void a(ghf ghf1)
    {
        ghf1.a(this);
    }

    private boolean a(Ping ping)
    {
        Client client = ping.getClient();
        boolean flag = h.a(dbf.bo);
        return dul.g(ping) && dul.d(ping) && ping.getTrip().getDriver().getCapabilities().getMusic() && client.getThirdPartyIdentities() != null && (flag || client.getThirdPartyIdentities().containsKey("spotify")) && !ping.getTrip().getUuid().equals(n);
    }

    private static boolean a(com.ubercab.rider.realtime.model.Client client)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (client != null)
        {
            flag = flag1;
            if (!TextUtils.isEmpty(client.getUuid()))
            {
                client = client.getThirdPartyIdentities();
                flag = flag1;
                if (client != null)
                {
                    flag = flag1;
                    if (client.containsKey("spotify"))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private boolean a(Trip trip)
    {
        boolean flag1 = false;
        boolean flag;
        if (trip != null)
        {
            trip = trip.getDriver();
        } else
        {
            trip = null;
        }
        flag = flag1;
        if (trip != null)
        {
            flag = flag1;
            if (trip.getCapabilities() != null)
            {
                flag = flag1;
                if (trip.getCapabilities().getMusic())
                {
                    flag = flag1;
                    if (d.a(AppConfigKey.g, false))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    private ghf b(dfp dfp)
    {
        return ggr.a().a(new djb(this)).a(dfp).a();
    }

    static String b(ghc ghc1)
    {
        ghc1.n = null;
        return null;
    }

    static String c(ghc ghc1)
    {
        return ghc1.n;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ghf)czj);
    }

    final void a(Map map)
    {
        if (map != null && h.a(dbf.bo))
        {
            String as[] = TunesProvider.PROVIDER_IDS;
            int j1 = as.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                String s = as[i1];
                if (map.containsKey(s))
                {
                    String s1 = ((ThirdPartyIdentity)map.get(s)).getToken();
                    if (!TextUtils.isEmpty(s1))
                    {
                        String s2 = (String)k.get(s);
                        City city = f.b();
                        if (!s1.equals(s2) && city != null)
                        {
                            j.a(s, Boolean.valueOf("spotify".equals(s)), city.getCityName(), city.getCountryIso2());
                        }
                        k.put(s, s1);
                    }
                }
                i1++;
            }
        }
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (i1 == 2032 && intent != null)
        {
            if (j1 == -1)
            {
                android.os.Parcelable parcelable = intent.getParcelableExtra("com.ubercab.TUNES_PROVIDER_SELECTED");
                if (!(parcelable instanceof TunesProvider))
                {
                    ijg.d(String.format(Locale.ENGLISH, "Error: data in result was not a TunesProvider: %s", new Object[] {
                        intent.toString()
                    }), new Object[0]);
                    return;
                } else
                {
                    a((TunesProvider)parcelable);
                    return;
                }
            }
            if (j1 == 0 && intent.getBooleanExtra("com.ubercab.NO_TUNES_PROVIDERS", false))
            {
                a();
                ijg.d("Error: User opened music provider chooser screen, but no providers were enabled.", new Object[0]);
                return;
            }
        }
    }

    public void onConnectMusicProviderEvent(ejt ejt1)
    {
        startActivity(LinkMusicProviderActivity.a(getActivity(), ejt1.a()));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            n = bundle.getString("com.ubercab.HANDSHAKE_TRIP_ID");
        }
    }

    public void onDownloadMusicAppEvent(eju eju1)
    {
        c.a(n.gU);
        e.c(new fyr(eju1.a()));
    }

    public void onEligibleForMusicTrialOffer(ejv ejv1)
    {
        Object obj = f.b();
        if (obj != null)
        {
            obj = ((City) (obj)).getCityName();
        } else
        {
            obj = null;
        }
        startActivity(MusicProviderOfferActivity.a(getActivity().getApplication(), ejv1.b(), ejv1.a(), ((String) (obj))));
    }

    public void onMusicProviderChoiceRequestedEvent(eiq eiq1)
    {
        startActivityForResult(MusicProviderChooserActivity.a(getContext(), eiq1.a()), 2032);
    }

    public void onMusicStateUpdateEvent(eka eka1)
    {
        if (TextUtils.isEmpty(eka1.a()))
        {
            return;
        } else
        {
            m = eka1.a();
            return;
        }
    }

    public void onMusicTrayViewInteractionEvent(eje eje1)
    {
        List list;
        Iterator iterator;
        list = eje1.a();
        if (TextUtils.isEmpty(m))
        {
            e.c(new eiq(list));
            return;
        }
        iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        eje1 = (TunesProvider)iterator.next();
        if (!m.equals(eje1.getId())) goto _L4; else goto _L3
_L3:
        if (eje1 == null)
        {
            e.c(new eiq(list));
            return;
        } else
        {
            c.a(n.bj);
            e.c(new ekd(eje1));
            return;
        }
_L2:
        eje1 = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void onOpenMusicAppEvent(ekc ekc1)
    {
        c.a(n.gW);
        cwm.c(getActivity(), ekc1.a());
    }

    public void onOpenPlaylistsEvent(ekd ekd1)
    {
        String s1 = null;
        c.a(n.gW);
        City city = f.b();
        String s;
        if (city != null)
        {
            s = city.getCityName();
        } else
        {
            s = null;
        }
        if (city != null)
        {
            s1 = city.getCountryIso2();
        }
        startActivity(MusicActivity.a(getActivity(), s, s1, ekd1.a()));
    }

    public void onPause()
    {
        super.onPause();
        if (o != null)
        {
            o.b();
        }
    }

    public void onPingEvent(dar dar1)
    {
        if (!i.n())
        {
            dar1 = dar1.a();
            if (!dul.a(dar1))
            {
                e.c(new ekb());
                return;
            }
            Client client = dar1.getClient();
            if ("Looking".equals(client.getStatus()))
            {
                a();
                n = null;
            }
            a(client.getThirdPartyIdentities());
            if (a(dar1))
            {
                String s = dar1.getCity().getCityName();
                dar1 = dar1.getCity().getCountryIso2();
                if (h.a(dbf.bq))
                {
                    j.a("spotify", Boolean.valueOf(true), s, dar1);
                }
                if (h.a(dbf.bp))
                {
                    j.a("rdio", Boolean.valueOf(false), s, dar1);
                    return;
                }
            } else
            {
                e.c(new ekb());
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        o = ica.a(g.b(), g.d(), g.e(), g.h(), new ghe((byte)0)).a(ico.a()).c(new ghd(this, (byte)0));
        if (!a(f.f()))
        {
            return;
        }
        if (!a(f.c()))
        {
            c.a(l.cY);
            return;
        } else
        {
            c.a(l.cZ);
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("com.ubercab.HANDSHAKE_TRIP_ID", n);
    }

    public void onStart()
    {
        super.onStart();
        if (h.a(dbf.bo) && f.f() != null)
        {
            Intent intent = MusicControlChannelService.a(getActivity().getApplication(), f.f().getUuid());
            getActivity().startService(intent);
        }
    }

    public void onTripUiStateChangedEvent(fzc fzc1)
    {
        if (!a(f.f()))
        {
            return;
        }
        switch (fzc1.b())
        {
        case 6: // '\006'
        default:
            return;

        case 5: // '\005'
            c.a(l.dd);
            return;

        case 7: // '\007'
            c.a(l.dc);
            break;
        }
    }

    public void onTunesHandshakeResponseEvent(dno dno1)
    {
        while (!dno1.i() || h.a(dbf.bo)) 
        {
            return;
        }
        dno1 = MusicControlChannelService.a(getActivity().getApplication(), l, n, m);
        getActivity().startService(dno1);
    }

    public void onTunesProviderResponseEvent(dnp dnp1)
    {
        Object obj;
label0:
        {
            if (dnp1.i())
            {
                Trip trip = f.f();
                if (trip != null)
                {
                    obj = trip.getDriver();
                } else
                {
                    obj = null;
                }
                if (obj != null && ((TripDriver) (obj)).getCapabilities() != null && ((TripDriver) (obj)).getCapabilities().getMusic())
                {
                    dnp1 = (TunesProvider)dnp1.g();
                    n = trip.getUuid();
                    obj = dnp1.getAccessToken();
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        break label0;
                    }
                }
            }
            return;
        }
        k.put(dnp1.getId(), dnp1.getAccessToken());
        if ("spotify".equalsIgnoreCase(dnp1.getId()) && !h.a(dbf.bo))
        {
            l = ((String) (obj));
            m = dnp1.getId();
        }
        j.a(n, dnp1.getId(), ((String) (obj)));
    }
}
