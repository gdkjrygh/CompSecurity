// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import com.walmart.android.ui.Presenter;

public class AccountDelegate
{
    public static interface DelegateCallback
    {

        public abstract void onComplete();
    }


    public AccountDelegate()
    {
    }

    public com.walmartlabs.anivia.AniviaEventAsJson.Builder getCreateAccountAniviaPageView()
    {
        return null;
    }

    public com.walmartlabs.anivia.AniviaEventAsJson.Builder getLoginAniviaPageView()
    {
        return null;
    }

    public void onCreateAccountComplete(Activity activity, Presenter presenter, DelegateCallback delegatecallback)
    {
        if (delegatecallback != null)
        {
            delegatecallback.onComplete();
        }
    }

    public void onLoginComplete(Activity activity, Presenter presenter, DelegateCallback delegatecallback)
    {
        if (delegatecallback != null)
        {
            delegatecallback.onComplete();
        }
    }

    public boolean optOut()
    {
        return false;
    }
}
