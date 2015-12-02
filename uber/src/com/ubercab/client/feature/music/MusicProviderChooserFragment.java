// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import cic;
import czb;
import czj;
import dfp;
import djb;
import ehb;
import ehc;
import eit;
import gjz;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.music:
//            MusicProviderChooserAdapter

public class MusicProviderChooserFragment extends czb
{

    public cev c;
    private final List d = new ArrayList();
    ListView mListView;

    public MusicProviderChooserFragment()
    {
    }

    static MusicProviderChooserFragment a(List list)
    {
        gjz.a(list);
        MusicProviderChooserFragment musicproviderchooserfragment;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gjz.a(flag);
        musicproviderchooserfragment = new MusicProviderChooserFragment();
        musicproviderchooserfragment.d.addAll(list);
        return musicproviderchooserfragment;
    }

    private void a(eit eit1)
    {
        eit1.a(this);
    }

    private eit b(dfp dfp)
    {
        return ehb.a().a(new djb(this)).a(dfp).a();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final volatile void a(czj czj)
    {
        a((eit)czj);
    }

    public final cic f()
    {
        return czb.a;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300ba, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        mListView.setAdapter(new MusicProviderChooserAdapter(d, d(), c));
        return layoutinflater;
    }
}
