// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PharmacyAuthenticator

class FlowCompleted
    implements rifySessionCallback
{

    final PharmacyManager this$0;
    final Dialog val$checkProgress;
    final FlowCompleted val$listener;
    final PresenterStack val$presenterStack;
    final Activity val$startActivity;

    public void onSessionAvailable()
    {
        val$checkProgress.dismiss();
        verifyLinkedAccount(val$startActivity, val$presenterStack, val$listener);
    }

    public void onSessionUnavailable()
    {
        val$checkProgress.dismiss();
        com.walmart.android.ui.Presenter presenter = PharmacyManager.access$400(PharmacyManager.this).signIn(val$startActivity, val$listener);
        val$presenterStack.pushPresenter(presenter, true);
    }

    FlowCompleted()
    {
        this$0 = final_pharmacymanager;
        val$checkProgress = dialog;
        val$startActivity = activity;
        val$presenterStack = presenterstack;
        val$listener = FlowCompleted.this;
        super();
    }
}
