// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v13.app.FragmentStatePagerAdapter;
import com.google.common.collect.ImmutableList;
import dagger.ObjectGraph;
import java.util.List;

// Referenced classes of package com.weather.Weather.hurricane:
//            HurricaneCentralFragment

public class HurricanePagerAdapter extends FragmentStatePagerAdapter
{

    private final ObjectGraph objectGraph;
    private final List stormIds;

    public HurricanePagerAdapter(FragmentManager fragmentmanager, List list, ObjectGraph objectgraph)
    {
        super(fragmentmanager);
        stormIds = ImmutableList.copyOf(list);
        objectGraph = objectgraph;
    }

    public int getCount()
    {
        return Math.max(stormIds.size(), 1);
    }

    public volatile Fragment getItem(int i)
    {
        return getItem(i);
    }

    public HurricaneCentralFragment getItem(int i)
    {
        HurricaneCentralFragment hurricanecentralfragment = new HurricaneCentralFragment();
        String s;
        Bundle bundle;
        if (i < stormIds.size())
        {
            s = (String)stormIds.get(i);
        } else
        {
            s = null;
        }
        bundle = new Bundle();
        bundle.putString("com.weather.Weather.hurricane.STORM_ID_ARG_KEY", s);
        hurricanecentralfragment.setArguments(bundle);
        objectGraph.inject(hurricanecentralfragment);
        return hurricanecentralfragment;
    }

    List getStormIds()
    {
        return ImmutableList.copyOf(stormIds);
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }
}
