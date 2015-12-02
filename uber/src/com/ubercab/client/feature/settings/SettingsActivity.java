// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.RiderAccount;
import com.ubercab.client.core.model.Shape_RiderAccount;
import com.ubercab.client.core.model.TunesProvider;
import com.ubercab.client.feature.music.DisconnectMusicProviderActivity;
import com.ubercab.client.feature.music.MusicProviderAuthorizationActivity;
import com.ubercab.client.feature.search.LocationSearchFragment;
import cwm;
import czj;
import czq;
import dak;
import dal;
import dbf;
import dfe;
import dfp;
import djx;
import dkn;
import dlv;
import dpg;
import dtj;
import dtt;
import ejb;
import fga;
import fgd;
import fgh;
import fgi;
import fgq;
import fgr;
import fgy;
import fgz;
import fhh;
import gmg;
import hkp;
import hoi;
import hsq;
import ica;
import icl;
import ico;
import java.util.Collection;
import java.util.Collections;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.settings:
//            SettingsFragment, EditAccountFragment, VerifyPasswordDialogFragment

public class SettingsActivity extends RiderActivity
{

    public djx h;
    public chp i;
    public gmg j;
    public hsq k;
    public czq l;
    public dpg m;
    RelativeLayout mLoadingView;
    public dkn n;
    public dak o;
    public dal p;
    public hkp q;
    public SettingsFragment r;
    private RiderAccount s;
    private icl t;

    public SettingsActivity()
    {
    }

    static int a(gmg gmg1)
    {
        return !gmg1.a(dbf.aK) ? 0x7f070373 : 0x7f0703e4;
    }

    public static Intent a(Context context, RiderAccount rideraccount)
    {
        return (new Intent(context, com/ubercab/client/feature/settings/SettingsActivity)).putExtra("com.ubercab.client.RIDER_ACCOUNT", rideraccount);
    }

    private void a(fgz fgz1)
    {
        fgz1.a(this);
    }

    private void a(String s1, LocationSearchResult locationsearchresult)
    {
        if (a(com/ubercab/client/feature/search/LocationSearchFragment) == null)
        {
            String s2;
            String s3;
            boolean flag;
            if (locationsearchresult == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s2 = b(s1);
            if (!TextUtils.isEmpty(s2))
            {
                if (flag)
                {
                    s2 = getString(0x7f070040, new Object[] {
                        s2
                    });
                } else
                {
                    s2 = getString(0x7f0701f9, new Object[] {
                        s2
                    });
                }
            } else
            {
                s2 = null;
            }
            if (flag)
            {
                s3 = "com.ubercab.ACTION_ADD_TAGGED_LOCATION";
                locationsearchresult = null;
            } else
            {
                locationsearchresult = RiderLocation.create(locationsearchresult);
                s3 = "com.ubercab.ACTION_EDIT_TAGGED_LOCATION";
            }
            a(0x7f0e045a, ((android.support.v4.app.Fragment) (LocationSearchFragment.a(s3, s1, o.b(), locationsearchresult, s2))));
        }
    }

    private fgz b(dfp dfp)
    {
        return fgq.a().a(new dfe(this)).a(dfp).a();
    }

    private String b(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if (LocationSearchResult.isTagHome(s1))
            {
                return dtt.a(getString(0x7f07026c));
            }
            if (LocationSearchResult.isTagWork(s1))
            {
                return dtt.a(getString(0x7f070672));
            }
        }
        return null;
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/settings/SettingsFragment) == null)
        {
            r = SettingsFragment.a(s);
            a(0x7f0e045a, r, true);
        }
    }

    private void g()
    {
        b().a(getString(a(j)));
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1, int j1, Bundle bundle)
    {
        super.a(i1, j1, bundle);
        if (i1 == 1001 && j1 == -1)
        {
            i.a(n.fP);
            RiderApplication.a(this).a(this);
        }
    }

    public final volatile void a(czj czj)
    {
        a((fgz)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        g();
        setContentView(0x7f030171);
        ButterKnife.inject(this);
        if (getIntent().hasExtra("com.ubercab.client.RIDER_ACCOUNT"))
        {
            s = (RiderAccount)getIntent().getParcelableExtra("com.ubercab.client.RIDER_ACCOUNT");
        } else
        if (bundle != null)
        {
            s = (RiderAccount)bundle.getParcelable("com.ubercab.client.RIDER_ACCOUNT");
            return;
        }
    }

    protected final Collection e()
    {
        return Collections.singleton(l);
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        if (j1 != -1 || j.a(dbf.cg) && intent == null)
        {
            return;
        }
        intent = intent.getStringExtra("com.ubercab.AUTHORIZATION_CODE");
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            if (m.f())
            {
                t = q.c("spotify", intent).a(ico.a()).a(new fgy(this, (byte)0));
                return;
            } else
            {
                n.h("spotify", intent);
                return;
            }

        case 2: // '\002'
            break;
        }
        if (m.f())
        {
            t = q.c("rdio", intent).a(ico.a()).a(new fgy(this, (byte)0));
            return;
        } else
        {
            n.h("rdio", intent);
            return;
        }
    }

    public void onAddTaggedLocationEvent(fga fga1)
    {
        i.a(AnalyticsEvent.create("tap").setName(n.eS).setValue(fga1.a()));
        a(fga1.a(), ((LocationSearchResult) (null)));
    }

    public void onBackPressed()
    {
        if (a(com/ubercab/client/feature/settings/SettingsFragment) != null)
        {
            g();
        }
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f100013, menu);
        return true;
    }

    public void onEditAccountEvent(fhh fhh)
    {
        if (a(com/ubercab/client/feature/settings/EditAccountFragment) == null)
        {
            fhh = b();
            int i1;
            if (j.a(dbf.aK))
            {
                i1 = 0x7f0701f5;
            } else
            {
                i1 = 0x7f0701fa;
            }
            fhh.a(getString(i1));
            cwm.a(this, getString(0x7f07030e));
            a(0x7f0e045a, EditAccountFragment.a(s));
        }
    }

    public void onGetAccountResponseEvent(dlv dlv1)
    {
        mLoadingView.setVisibility(8);
        if (dlv1.i())
        {
            s = (RiderAccount)dlv1.g();
            ((hoi)k.a()).a("com.ubercab.client.RIDER_ACCOUNT", s);
            dlv1 = (SettingsFragment)a(com/ubercab/client/feature/settings/SettingsFragment);
            if (dlv1 != null && dlv1.getView() != null && s != null)
            {
                dlv1.b(s);
                return;
            }
        }
        f();
    }

    public void onLocationClickEvent(fgd fgd1)
    {
        i.a(AnalyticsEvent.create("tap").setName(n.eT).setValue(fgd1.b()));
        a(fgd1.b(), fgd1.a());
    }

    public void onMusicProviderSelectedEvent(ejb ejb1)
    {
        ejb1 = ejb1.a();
        if (ejb1.getLinked().booleanValue())
        {
            i.a(n.gS);
            startActivity(DisconnectMusicProviderActivity.a(this, ejb1));
            return;
        }
        i.a(n.gQ);
        Intent intent = MusicProviderAuthorizationActivity.a(this, ejb1);
        int i1;
        if ("spotify".equals(ejb1.getId()))
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        startActivityForResult(intent, i1);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        if (menuitem.getItemId() == 0x102002c)
        {
            if (fragmentmanager.getBackStackEntryCount() > 0)
            {
                fragmentmanager.popBackStack();
                g();
                return true;
            }
        } else
        {
            if (menuitem.getItemId() == 0x7f0e06c1)
            {
                VerifyPasswordDialogFragment.a(this, s.getProfileType());
                return true;
            }
            if (menuitem.getItemId() == 0x7f0e06c2)
            {
                dtj.a(this, 1001, null, getString(0x7f0702a2), getString(0x7f0702a1), getString(0x7f07007b));
                i.a(l.fv);
                return true;
            }
        }
        return super.onOptionsItemSelected(menuitem);
    }

    public void onPause()
    {
        super.onPause();
        if (t != null)
        {
            t.b();
        }
    }

    public void onRemoveTaggedLocationEvent(fgh fgh)
    {
        A();
    }

    public void onResume()
    {
        super.onResume();
        if (s == null)
        {
            RiderAccount rideraccount = (RiderAccount)((hoi)k.a()).a("com.ubercab.client.RIDER_ACCOUNT", com/ubercab/client/core/model/Shape_RiderAccount);
            if (rideraccount != null)
            {
                s = rideraccount;
                f();
            } else
            {
                mLoadingView.setVisibility(0);
            }
            h.a(p.z());
            return;
        } else
        {
            f();
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.ubercab.client.RIDER_ACCOUNT", s);
    }

    public void onSelectTaggedLocationEvent(fgi fgi)
    {
        A();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }
}
