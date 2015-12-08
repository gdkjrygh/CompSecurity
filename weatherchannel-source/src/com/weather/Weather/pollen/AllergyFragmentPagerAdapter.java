// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.pollen;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import dagger.ObjectGraph;

// Referenced classes of package com.weather.Weather.pollen:
//            AllergyDetailsFragment

public class AllergyFragmentPagerAdapter extends FragmentPagerAdapter
{

    private static final int TAB_COUNT = 3;
    private final ObjectGraph objectGraph;
    private final String pageTitle[] = {
        "POLLEN", "BREATHING", "MOLD"
    };

    public AllergyFragmentPagerAdapter(FragmentManager fragmentmanager, ObjectGraph objectgraph)
    {
        super(fragmentmanager);
        objectGraph = objectgraph;
    }

    public int getCount()
    {
        return 3;
    }

    public volatile Fragment getItem(int i)
    {
        return getItem(i);
    }

    public AllergyDetailsFragment getItem(int i)
    {
        AllergyDetailsFragment allergydetailsfragment = new AllergyDetailsFragment();
        String s;
        Bundle bundle;
        if (i < pageTitle.length)
        {
            s = pageTitle[i];
        } else
        {
            s = null;
        }
        bundle = new Bundle();
        bundle.putString("allergy_type_key", s);
        allergydetailsfragment.setArguments(bundle);
        objectGraph.inject(allergydetailsfragment);
        return allergydetailsfragment;
    }

    public CharSequence getPageTitle(int i)
    {
        return pageTitle[i];
    }
}
