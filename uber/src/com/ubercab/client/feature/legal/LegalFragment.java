// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.legal;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import com.ubercab.client.core.app.RiderActivity;
import czb;
import dsx;
import dsz;
import dve;
import dyf;
import dyh;
import java.util.List;
import l;

public abstract class LegalFragment extends czb
{

    public dsz g;
    public cev h;
    ListView mListView;

    public LegalFragment()
    {
    }

    public abstract List b();

    public void g()
    {
        h();
    }

    public final void h()
    {
        List list = b();
        if (!g.isEmpty() || list == null || list.isEmpty())
        {
            return;
        } else
        {
            g.a(list);
            g.notifyDataSetChanged();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030071, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        ButterKnife.reset(this);
    }

    void onItemClickLegal(int i)
    {
        String s4;
        switch (g.b(i).a())
        {
        default:
            return;

        case 0: // '\0'
            String s = getString(0x7f0700b2);
            String s5 = dve.a("https://www.uber.com/legal/%s/copyright?plain=true");
            h.c(new dyh(s, s5));
            return;

        case 1: // '\001'
            String s1 = getString(0x7f070490);
            String s6 = dve.a("https://www.uber.com/legal/%s/terms?plain=true");
            l l1 = l.ih;
            h.c(new dyh(s1, s6, l1));
            return;

        case 2: // '\002'
            String s2 = getString(0x7f070372);
            String s7 = dve.a("https://www.uber.com/legal/%s/privacy?plain=true");
            l l2 = l.fm;
            h.c(new dyh(s2, s7, l2));
            return;

        case 3: // '\003'
            String s3 = getString(0x7f07043b);
            h.c(new dyh(s3, "file:///android_asset/licenses/licenses.html"));
            return;

        case 4: // '\004'
            h.c(new dyf());
            return;

        case 5: // '\005'
            s4 = getString(0x7f07067f);
            break;
        }
        h.c(new dyh(s4, "https://www.uber.com/report-issue"));
    }

    public void onResume()
    {
        super.onResume();
        d().b().a(getString(0x7f070293));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        g = new dsz(getActivity());
        mListView.setAdapter(g);
        mListView.setDivider(null);
        mListView.setDividerHeight(0);
        g();
    }
}
