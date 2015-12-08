// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import com.walmart.android.ui.Presenter;

public interface PharmacyAuthenticator
{

    public abstract Presenter createAppAccount(Activity activity, String s, String s1, String s2, PharmacyManager.OnFlowCompleted onflowcompleted);

    public abstract Presenter linkAccount(Activity activity, int i, int j, PharmacyManager.OnFlowCompleted onflowcompleted);

    public abstract Presenter signIn(Activity activity, PharmacyManager.OnFlowCompleted onflowcompleted);

    public abstract void verifySession(PharmacyManager.VerifySessionCallback verifysessioncallback);
}
