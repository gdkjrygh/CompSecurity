// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.auth.AuthenticationStatusEvent;

// Referenced classes of package com.walmart.android.fragments:
//            PharmacyFragment

private class <init>
{

    final PharmacyFragment this$0;

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        if (!authenticationstatusevent.loggedIn)
        {
            PharmacyFragment.access$100(PharmacyFragment.this).popToRoot();
        }
    }

    private Q()
    {
        this$0 = PharmacyFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
