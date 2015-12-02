// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.MenuItem;
import cev;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Group;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.rider.realtime.model.ThirdPartyIdentity;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripDriverCapabilities;
import com.ubercab.ui.deprecated.view.SlidingTabLayout;
import cwm;
import cwz;
import czj;
import dar;
import dbf;
import dfe;
import dfp;
import dkn;
import dkv;
import dms;
import dnm;
import dpg;
import dul;
import dvc;
import egp;
import egq;
import eib;
import eic;
import eid;
import eju;
import ekc;
import eke;
import ekf;
import ekg;
import eki;
import ekj;
import fte;
import fzc;
import gkl;
import gmg;
import hkr;
import hku;
import ica;
import icl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l;

// Referenced classes of package com.ubercab.client.feature.music:
//            PlaylistFragment, MusicControlChannelService, MusicControlFragment

public class MusicActivity extends RiderActivity
    implements android.content.DialogInterface.OnDismissListener
{

    private static final Set q = new HashSet(Arrays.asList(new String[] {
        "categories", "curated_playlists", "featured", "keep_listening", "trending"
    }));
    public chp h;
    public cev i;
    public hku j;
    public hkr k;
    public gmg l;
    public dpg m;
    public dkn n;
    public fte o;
    public dkv p;
    private final Map r = gkl.a(TunesProvider.getKnownProviderCount());
    private final dvc s = new dvc(this);
    private String t;
    private String u;
    private List v;
    private icl w;
    private android.support.v4.view.ViewPager.OnPageChangeListener x;
    private SlidingTabLayout y;
    private TunesProvider z;

    public MusicActivity()
    {
    }

    public static Intent a(Context context, String s1, String s2, TunesProvider tunesprovider)
    {
        return (new Intent(context, com/ubercab/client/feature/music/MusicActivity)).putExtra("city_name", s1).putExtra("country_iso_2", s2).putExtra("tunes_provider", tunesprovider);
    }

    static List a(MusicActivity musicactivity)
    {
        return musicactivity.v;
    }

    private void a(eib eib1)
    {
        eib1.a(this);
    }

    public static boolean a(Trip trip)
    {
        return b(trip);
    }

    private eib b(dfp dfp)
    {
        return egp.a().a(new dfe(this)).a(dfp).a();
    }

    private static boolean b(Trip trip)
    {
        if (trip != null && trip.getDriver() != null)
        {
            if ((trip = trip.getDriver().getCapabilities()) != null && trip.getMusic())
            {
                return true;
            }
        }
        return false;
    }

    public static Set f()
    {
        return q;
    }

    private void g()
    {
        Object obj = (new StringBuilder(getString(0x7f0702be))).append(" ");
        String s1 = z.getName();
        if (TextUtils.isEmpty(s1))
        {
            obj = getString(0x7f0702bd);
        } else
        {
            obj = ((StringBuilder) (obj)).append(s1).toString();
        }
        b().a(((String) (obj)).toUpperCase(Locale.getDefault()));
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eib)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300aa);
        b().b(true);
        bundle = getIntent();
        t = bundle.getStringExtra("city_name");
        u = bundle.getStringExtra("country_iso_2");
        z = (TunesProvider)bundle.getParcelableExtra("tunes_provider");
        x = new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final MusicActivity a;

            public final void onPageScrollStateChanged(int i1)
            {
            }

            public final void onPageScrolled(int i1, float f1, int j1)
            {
            }

            public final void onPageSelected(int i1)
            {
                if (i1 != MusicActivity.a(a).size()) goto _L2; else goto _L1
_L1:
                Object obj;
                obj = l.dk;
                a.i.c(new eke());
_L9:
                a.h.a(((cic) (obj)));
                return;
_L2:
                cwz.a(a);
                obj = ((Group)MusicActivity.a(a).get(i1)).getType();
                i1 = -1;
                ((String) (obj)).hashCode();
                JVM INSTR lookupswitch 3: default 116
            //                           220603521: 179
            //                           1394955557: 165
            //                           1609543476: 151;
                   goto _L3 _L4 _L5 _L6
_L3:
                break; /* Loop/switch isn't completed */
_L4:
                break MISSING_BLOCK_LABEL_179;
_L7:
                switch (i1)
                {
                default:
                    obj = l.di;
                    break;

                case 0: // '\0'
                    obj = l.dg;
                    break;

                case 1: // '\001'
                    obj = l.dm;
                    break;

                case 2: // '\002'
                    obj = l.dh;
                    break;
                }
                continue; /* Loop/switch isn't completed */
_L6:
                if (((String) (obj)).equals("curated_playlists"))
                {
                    i1 = 0;
                }
                  goto _L7
_L5:
                if (((String) (obj)).equals("trending"))
                {
                    i1 = 1;
                }
                  goto _L7
                if (((String) (obj)).equals("keep_listening"))
                {
                    i1 = 2;
                }
                  goto _L7
                if (true) goto _L9; else goto _L8
_L8:
            }

            
            {
                a = MusicActivity.this;
                super();
            }
        };
        g();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 == -1 && i1 == 127)
        {
            intent = intent.getStringExtra("com.ubercab.AUTHORIZATION_CODE");
            n.h("rdio", intent);
        }
    }

    public void onBackPressed()
    {
        if (a(com/ubercab/client/feature/music/PlaylistFragment) != null)
        {
            y.setVisibility(0);
            g();
        }
        super.onBackPressed();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
    }

    public void onDownloadMusicAppEvent(eju eju1)
    {
        s.a(eju1.a());
    }

    public void onOpenMusicAppEvent(ekc ekc1)
    {
        cwm.c(this, ekc1.a());
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    public void onPause()
    {
        super.onPause();
        if (w != null)
        {
            w.b();
        }
        o.e();
    }

    public void onPingEvent(dar dar1)
    {
        if (!m.n() && !b(dar1.a().getTrip()))
        {
            finish();
        }
    }

    public void onPlaylistClickedEvent(ekf ekf1)
    {
        y.setVisibility(8);
        String s1 = ekf1.b();
        ActionBar actionbar = b();
        if (!TextUtils.isEmpty(s1))
        {
            s1 = s1.toUpperCase();
        } else
        {
            s1 = null;
        }
        actionbar.a(s1);
        a(0x7f0e01c8, PlaylistFragment.a(ekf1.c()));
        a(getString(0x7f070296), this);
        p.a(z.getId(), ekf1.a(), t, u);
    }

    public void onPlaylistResponseEvent(dms dms)
    {
        u();
    }

    public void onPlaylistsEvent(ekg ekg1)
    {
        boolean flag2 = false;
        ekg1 = ekg1.a().iterator();
        boolean flag;
        boolean flag1;
        for (flag = false; ekg1.hasNext(); flag = flag1)
        {
            TunesProvider tunesprovider = (TunesProvider)ekg1.next();
            flag1 = flag;
            if (z.getId() != null)
            {
                flag1 = flag;
                if (z.getId().equals(tunesprovider.getId()))
                {
                    flag1 = true;
                }
            }
            r.put(tunesprovider.getId(), tunesprovider);
        }

        h.a(l.dg);
        if (flag)
        {
            v = ((TunesProvider)r.get(z.getId())).getGroups();
            ekg1 = (ViewPager)findViewById(0x7f0e01c9);
            FragmentManager fragmentmanager = getSupportFragmentManager();
            boolean flag3;
            if ("rdio".equals(z.getId()) && l.a(dbf.l))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            ekg1.setAdapter(new eic(this, fragmentmanager, flag3, v, z));
            y = (SlidingTabLayout)findViewById(0x7f0e01c7);
            y.a(ekg1);
            y.a(x);
            if (l.a(dbf.bo))
            {
                SlidingTabLayout slidingtablayout = y;
                int i1;
                if (ekg1.getAdapter().getCount() > 1)
                {
                    i1 = ((flag2) ? 1 : 0);
                } else
                {
                    i1 = 8;
                }
                slidingtablayout.setVisibility(i1);
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        w = j.h().c(new eid(this, (byte)0));
        o.d();
    }

    public void onStationClickedEvent(eki eki)
    {
        finish();
    }

    public void onThirdPartyAuthResponseEvent(dnm dnm1)
    {
        if (dnm1.e())
        {
            dnm1 = (Ping)dnm1.g();
            if (dul.a(dnm1) && dnm1.getClient().getThirdPartyIdentities() != null && k.f() != null)
            {
                dnm1 = (ThirdPartyIdentity)dnm1.getClient().getThirdPartyIdentities().get(z.getId());
                z.setLinked(Boolean.valueOf(true));
                startService(MusicControlChannelService.a(getApplication(), dnm1.getToken(), k.f().getUuid(), z.getId()));
            }
        }
    }

    public void onTrackClickedEvent(ekj ekj)
    {
        finish();
    }

    public void onTripUiStateChangedEvent(fzc fzc1)
    {
        int i1 = fzc1.b();
        if (i1 == 0)
        {
            finish();
            return;
        } else
        {
            ((MusicControlFragment)getSupportFragmentManager().findFragmentById(0x7f0e01ca)).a(i1);
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

}
