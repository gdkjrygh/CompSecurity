// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.walmart.android.fragments:
//            WebFragment

public class PharmacyHybridFragment extends WebFragment
{

    public PharmacyHybridFragment()
    {
    }

    protected WebFragment.ActionBarState getInitialActionBarState()
    {
        return new WebFragment.ActionBarState(this, "Hybrid Pharmacy", false, false);
    }

    protected String getUrl()
    {
        FragmentActivity fragmentactivity = getActivity();
        return PreferenceManager.getDefaultSharedPreferences(fragmentactivity).getString(fragmentactivity.getString(0x7f09035e), "http://candid82.com:8000");
    }
}
