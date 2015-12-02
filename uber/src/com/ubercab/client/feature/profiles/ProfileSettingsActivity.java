// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.Profile;
import czj;
import czq;
import dfe;
import dfp;
import dum;
import ext;
import exu;
import eyq;
import eys;
import eyy;
import java.util.Collection;
import java.util.Collections;

public class ProfileSettingsActivity extends RiderActivity
{

    public czq h;
    public eyy i;

    public ProfileSettingsActivity()
    {
    }

    public static Intent a(Context context, Profile profile)
    {
        return (new Intent(context, com/ubercab/client/feature/profiles/ProfileSettingsActivity)).putExtra("EXTRA_TROY_PROFILE_UUID", profile.getUuid());
    }

    private void a(Profile profile)
    {
        if (a(eys) == null)
        {
            a(0x7f0e03df, ((android.support.v4.app.Fragment) (eys.a(profile))), true);
        }
    }

    private void a(eyq eyq1)
    {
        eyq1.a(this);
    }

    private eyq b(dfp dfp)
    {
        return ext.a().a(new dfe(this)).a(dfp).a();
    }

    private void b(String s1)
    {
        b().a(s1);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eyq)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030152);
        bundle = i.a(getIntent().getStringExtra("EXTRA_TROY_PROFILE_UUID"));
        if (dum.l(bundle))
        {
            b(getString(0x7f070352));
        } else
        if (dum.i(bundle))
        {
            b(getString(0x7f070076));
        } else
        {
            b(dum.a(bundle, this));
        }
        a(bundle);
    }

    protected final Collection e()
    {
        return Collections.singleton(h);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
