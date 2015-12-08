// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.walmart.android.app.main.HomeActivity;

// Referenced classes of package com.walmart.android.fragments:
//            OnboardingFragment

private class <init>
    implements android.view.ingClickListener
{

    final OnboardingFragment this$0;

    public void onClick(View view)
    {
        view = new Intent(getActivity(), com/walmart/android/app/main/HomeActivity);
        startActivity(view);
        getActivity().finish();
        getActivity().overridePendingTransition(0x7f05000e, 0x7f050010);
    }

    private ()
    {
        this$0 = OnboardingFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
