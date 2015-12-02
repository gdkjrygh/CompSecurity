// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.TunesProvider;
import czj;
import dfe;
import dfp;
import egl;
import egm;
import ehx;

// Referenced classes of package com.ubercab.client.feature.music:
//            LinkMusicProviderFragment

public class LinkMusicProviderActivity extends RiderActivity
{

    public LinkMusicProviderActivity()
    {
    }

    public static Intent a(Context context, TunesProvider tunesprovider)
    {
        return (new Intent(context, com/ubercab/client/feature/music/LinkMusicProviderActivity)).putExtra("com.ubercab.MUSIC_PROVIDER", tunesprovider);
    }

    private void a(ehx ehx1)
    {
        ehx1.a(this);
    }

    private ehx b(dfp dfp)
    {
        return egl.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/music/LinkMusicProviderFragment) == null)
        {
            a(0x7f0e01e7, LinkMusicProviderFragment.a((TunesProvider)getIntent().getParcelableExtra("com.ubercab.MUSIC_PROVIDER")), true);
        }
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((ehx)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        b().a(getString(0x7f070049).toUpperCase());
        setContentView(0x7f0300b3);
        f();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
