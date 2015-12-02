// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.about;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.employee.EmployeeSettingsActivity;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dai;
import dak;
import dar;
import dfp;
import djb;
import dpg;
import drc;
import dsx;
import dsz;
import dxj;
import dxk;
import dxt;
import dxu;
import dye;
import gjy;
import gka;
import gkf;
import gki;
import hku;
import ica;
import icl;

public class AboutFragment extends czb
{

    public Application c;
    public dai d;
    public drc e;
    public cev f;
    public hku g;
    public dpg h;
    public dak i;
    private boolean j;
    private dsz k;
    private icl l;
    ListView mListViewAbout;
    TextView mTextViewVersionNumber;

    public AboutFragment()
    {
    }

    public static AboutFragment a()
    {
        return new AboutFragment();
    }

    static void a(AboutFragment aboutfragment)
    {
        aboutfragment.h();
    }

    private void a(dxj dxj1)
    {
        dxj1.a(this);
    }

    public static boolean a(AboutFragment aboutfragment, boolean flag)
    {
        aboutfragment.j = flag;
        return flag;
    }

    private dxj b(dfp dfp)
    {
        return dxt.a().a(new djb(this)).a(dfp).a();
    }

    private void b()
    {
        String s1 = String.format("%s (%s)", new Object[] {
            "3.76.4", "efa2485"
        });
        String s;
        if (j)
        {
            if (h.n())
            {
                s = "RT API";
            } else
            {
                s = "Ping";
            }
            s = String.format("%s Backend: %s", new Object[] {
                s1, s
            });
        } else
        {
            s = s1;
        }
        mTextViewVersionNumber.setText(s);
    }

    public static boolean b(AboutFragment aboutfragment)
    {
        return aboutfragment.l();
    }

    public static dsz c(AboutFragment aboutfragment)
    {
        return aboutfragment.k;
    }

    public static boolean d(AboutFragment aboutfragment)
    {
        return aboutfragment.j;
    }

    public static void e(AboutFragment aboutfragment)
    {
        aboutfragment.g();
    }

    public static void f(AboutFragment aboutfragment)
    {
        aboutfragment.b();
    }

    private void g()
    {
        gkf gkf1 = new gkf();
        gkf1.a(new dsx(0, getString(0x7f07038c)));
        gkf1.a(new dsx(1, getString(0x7f070294)));
        gkf1.a(new dsx(2, getString(0x7f070293)));
        if (j)
        {
            gkf1.a(new dsx(3, getString(0x7f070733)));
        }
        k.a(gkf1.a());
        k.notifyDataSetChanged();
    }

    private void h()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder("https://")).append(getString(0x7f0707a9)).toString())));
    }

    private void i()
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(0x7f070778))));
    }

    private void j()
    {
        Uri uri;
        try
        {
            getActivity().getPackageManager().getPackageInfo("com.facebook.katana", 0);
            uri = Uri.parse(getString(0x7f070774));
        }
        catch (Exception exception)
        {
            exception = Uri.parse(getString(0x7f070775));
        }
        startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    private void k()
    {
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/employee/EmployeeSettingsActivity));
    }

    private boolean l()
    {
        return gki.d(d.a(), new gka() {

            final AboutFragment a;

            private static boolean a(String s)
            {
                return s.endsWith("@uber.com");
            }

            public final boolean apply(Object obj)
            {
                return a((String)obj);
            }

            
            {
                a = AboutFragment.this;
                super();
            }
        }).b();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((dxj)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030027, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    public void onItemClickAbout(int i1)
    {
        switch (((dsx)mListViewAbout.getItemAtPosition(i1)).a())
        {
        default:
            return;

        case 0: // '\0'
            i();
            return;

        case 1: // '\001'
            j();
            return;

        case 2: // '\002'
            f.c(new dye());
            return;

        case 3: // '\003'
            k();
            break;
        }
    }

    public void onPause()
    {
        super.onPause();
        l.b();
    }

    public void onPingEvent(dar dar1)
    {
        if (!h.n())
        {
            boolean flag;
            if (dar1.a().getClient().getIsAdmin() && l())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (k.isEmpty() || j != flag)
            {
                j = flag;
                g();
                b();
                return;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070032));
        l = g.d().c(new dxk(this, (byte)0));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b();
        k = new dsz(getActivity());
        view = LayoutInflater.from(view.getContext()).inflate(0x7f03002a, mListViewAbout, false);
        view.setTag(new HeaderViewHolder(view));
        mListViewAbout.addHeaderView(view, null, false);
        mListViewAbout.setDivider(null);
        mListViewAbout.setDividerHeight(0);
        mListViewAbout.setAdapter(k);
    }

    private class HeaderViewHolder
    {

        final AboutFragment a;
        TextView mTextViewTitle;

        public void onClickUberUrl()
        {
            AboutFragment.a(a);
        }

        HeaderViewHolder(View view)
        {
            a = AboutFragment.this;
            super();
            ButterKnife.inject(this, view);
            if (i.c() != null)
            {
                view = i.c().getLocation();
            } else
            {
                view = null;
            }
            aboutfragment = dun.a(c, view);
            mTextViewTitle.setText(AboutFragment.this);
        }
    }

}
