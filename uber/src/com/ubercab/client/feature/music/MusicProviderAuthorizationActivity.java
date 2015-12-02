// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.TunesProvider;
import czj;
import dfe;
import dfp;
import egf;
import egg;
import egv;
import egw;
import eim;
import ejs;
import k;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderAuthorizationFragment

public class MusicProviderAuthorizationActivity extends RiderActivity
{

    public chp h;

    public MusicProviderAuthorizationActivity()
    {
    }

    public static Intent a(Context context, TunesProvider tunesprovider)
    {
        return (new Intent(context, com/ubercab/client/feature/music/MusicProviderAuthorizationActivity)).putExtra("com.ubercab.MUSIC_PROVIDER", tunesprovider);
    }

    private void a(eim eim1)
    {
        eim1.a(this);
    }

    private eim b(dfp dfp)
    {
        return egv.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/music/MusicProviderAuthorizationFragment) == null)
        {
            a(0x7f0e01cb, MusicProviderAuthorizationFragment.a((TunesProvider)getIntent().getParcelableExtra("com.ubercab.MUSIC_PROVIDER")), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eim)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f0300ab);
        f();
    }

    public void onAuthorizationErrorEvent(egf egf)
    {
        setResult(0, null);
        h.a(k.i);
        finish();
    }

    public void onAuthorizationResponseEvent(egg egg1)
    {
        Intent intent = new Intent();
        intent.putExtra("com.ubercab.AUTHORIZATION_CODE", egg1.a());
        setResult(-1, intent);
        h.a(k.j);
        finish();
    }

    public void onCancelAuthorizationEvent(ejs ejs)
    {
        setResult(0, null);
        finish();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
