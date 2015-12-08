// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.walmart.android.fragments.OnboardingFragment;

public class OnboardingActivity extends Activity
{

    private FrameLayout mFrameLayout;

    public OnboardingActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0400d4);
        mFrameLayout = (FrameLayout)findViewById(0x7f1002d5);
        bundle = new OnboardingFragment();
        getFragmentManager().beginTransaction().add(mFrameLayout.getId(), bundle, com/walmart/android/fragments/OnboardingFragment.getName()).commit();
    }
}
