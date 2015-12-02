// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import czj;
import dfe;
import dfp;
import dno;
import ehd;
import ehe;
import eiw;
import ejy;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderOfferFragment, MusicProviderOfferIneligibleFragment

public class MusicProviderOfferActivity extends RiderActivity
    implements android.content.DialogInterface.OnDismissListener
{

    public MusicProviderOfferActivity()
    {
    }

    public static Intent a(Application application, String s1, String s2, String s3)
    {
        return (new Intent(application, com/ubercab/client/feature/music/MusicProviderOfferActivity)).putExtra("provider_id", s1).putExtra("eligible_trial", s2).putExtra("city_name", s3);
    }

    private void a(eiw eiw1)
    {
        eiw1.a(this);
    }

    private void a(String s1, String s2, String s3, String s4)
    {
        if (a(com/ubercab/client/feature/music/MusicProviderOfferFragment) == null)
        {
            a(0x7f0e01fa, ((android.support.v4.app.Fragment) (MusicProviderOfferFragment.a(s1, s2, s3, s4))), true);
        }
    }

    private eiw b(dfp dfp)
    {
        return ehd.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/music/MusicProviderOfferIneligibleFragment) == null)
        {
            a(0x7f0e01fa, MusicProviderOfferIneligibleFragment.a(), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eiw)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300bc);
        bundle = getIntent();
        if (bundle.hasExtra("eligible_trial"))
        {
            a(bundle.getStringExtra("provider_id"), bundle.getStringExtra("access_token"), bundle.getStringExtra("eligible_trial"), bundle.getStringExtra("city_name"));
            return;
        } else
        {
            b().a(0x7f070499);
            f();
            return;
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
    }

    public void onMusicProviderOfferCompleteEvent(ejy ejy)
    {
        finish();
    }

    public void onTunesHandshakeResponseEvent(dno dno)
    {
        finish();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
