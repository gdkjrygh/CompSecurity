// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.TunesProvider;
import czj;
import dfe;
import dfp;
import dkn;
import dpg;
import dtj;
import duo;
import egh;
import egi;
import ehr;
import eht;
import ejw;
import ejx;
import hkp;
import ica;
import ico;

// Referenced classes of package com.ubercab.client.feature.music:
//            DisconnectMusicProviderFragment, MusicControlChannelService

public class DisconnectMusicProviderActivity extends RiderActivity
{

    public cev h;
    public dpg i;
    public dkn j;
    public hkp k;
    private String l;
    private String m;

    public DisconnectMusicProviderActivity()
    {
    }

    public static Intent a(Context context, TunesProvider tunesprovider)
    {
        return (new Intent(context, com/ubercab/client/feature/music/DisconnectMusicProviderActivity)).putExtra("com.ubercab.MUSIC_PROVIDER", tunesprovider);
    }

    private void a(TunesProvider tunesprovider)
    {
        if (a(com/ubercab/client/feature/music/DisconnectMusicProviderFragment) == null)
        {
            a(0x7f0e01da, ((android.support.v4.app.Fragment) (DisconnectMusicProviderFragment.a(tunesprovider))), true);
        }
    }

    private void a(ehr ehr1)
    {
        ehr1.a(this);
    }

    private ehr b(dfp dfp)
    {
        return egh.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        if (i1 == 1 && j1 == -1)
        {
            if (!i.i())
            {
                j.c(l);
            } else
            {
                k.a(l).a(ico.a()).b(duo.a());
            }
            h.c(new ejw(ejx.b));
            stopService(MusicControlChannelService.a(getApplication()));
            finish();
        }
    }

    public final volatile void a(czj czj)
    {
        a((ehr)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300af);
        bundle = (TunesProvider)getIntent().getParcelableExtra("com.ubercab.MUSIC_PROVIDER");
        if (bundle != null)
        {
            m = bundle.getName();
            l = bundle.getId();
            b().a(m.toUpperCase());
            a(bundle);
        }
    }

    public void onDisconnectMusicProviderEvent(eht eht)
    {
        dtj.a(this, 1, getString(0x7f0701e2), getString(0x7f0701e1, new Object[] {
            m
        }), getString(0x7f0701e0), getString(0x7f07007b));
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
