// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.rider.realtime.model.Profile;
import czj;
import czq;
import dfe;
import dfp;
import dns;
import dtg;
import exh;
import exi;
import exz;
import eyy;
import ezl;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            EditBadgeFragment

public class EditBadgeActivity extends RiderActivity
{

    public czq h;
    public eyy i;
    private int j;
    private boolean k;
    private Profile l;
    private String m;
    private String n;
    private String o;
    private ProgressDialog p;

    public EditBadgeActivity()
    {
    }

    public static Intent a(Context context, Profile profile)
    {
        return (new Intent(context, com/ubercab/client/feature/profiles/EditBadgeActivity)).putExtra("EXTRA_TROY_PROFILE_UUID", profile.getUuid());
    }

    private void a(Profile profile)
    {
        if (a(com/ubercab/client/feature/profiles/EditBadgeFragment) == null)
        {
            a(0x7f0e00fc, ((android.support.v4.app.Fragment) (EditBadgeFragment.a(profile))), true);
        }
    }

    private void a(exz exz1)
    {
        exz1.a(this);
    }

    static boolean a(EditBadgeActivity editbadgeactivity)
    {
        editbadgeactivity.k = false;
        return false;
    }

    private exz b(dfp dfp)
    {
        return exh.a().a(new dfe(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((exz)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f030056);
        l = i.a(getIntent().getStringExtra("EXTRA_TROY_PROFILE_UUID"));
        a(l);
    }

    protected final Collection e()
    {
        return Collections.singleton(h);
    }

    public void finish()
    {
        if (k)
        {
            i.a(l, o, j, m, n);
            p = dtg.a(this, getString(0x7f07063b));
            p.show();
            return;
        } else
        {
            setResult(-1);
            super.finish();
            return;
        }
    }

    public void onBadgeUpdateEvent(ezl ezl1)
    {
        j = ezl1.a();
        n = ezl1.c();
        m = ezl1.b();
        o = ezl1.d();
        k = true;
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

    public void onUpdateProfileResponseEvent(dns dns1)
    {
        if (p == null)
        {
            return;
        } else
        {
            boolean flag = dns1.k();
            p.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(flag) {

                final boolean a;
                final EditBadgeActivity b;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    EditBadgeActivity.a(b);
                    if (a)
                    {
                        b.a_(b.getString(0x7f070639));
                        return;
                    } else
                    {
                        b.finish();
                        return;
                    }
                }

            
            {
                b = EditBadgeActivity.this;
                a = flag;
                super();
            }
            });
            p.dismiss();
            return;
        }
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
