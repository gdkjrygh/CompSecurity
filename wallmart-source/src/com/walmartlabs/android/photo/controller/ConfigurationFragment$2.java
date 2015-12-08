// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ConfigurationFragment, ReviewFragment

class this._cls0
    implements com.walmartlabs.android.photo.view.ener
{

    final ConfigurationFragment this$0;

    public void onPrimaryClicked()
    {
        ReviewFragment reviewfragment = ReviewFragment.newInstance(getOrder());
        getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.ght, com.walmartlabs.android.photo.eft, com.walmartlabs.android.photo.ft, com.walmartlabs.android.photo.ight).replace(com.walmartlabs.android.photo.ight, reviewfragment, com/walmartlabs/android/photo/controller/ReviewFragment.getName()).addToBackStack("review").commit();
    }

    ()
    {
        this$0 = ConfigurationFragment.this;
        super();
    }
}
