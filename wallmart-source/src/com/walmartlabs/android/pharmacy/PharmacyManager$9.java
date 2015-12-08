// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager

class val.errorDialog
    implements sRxEnabledAccountCallback
{

    final PharmacyManager this$0;
    final Dialog val$checkProgress;
    final Dialog val$errorDialog;
    final FlowCompleted val$listener;
    final PresenterStack val$presenterStack;
    final Activity val$startActivity;

    public void onResult(sRxEnabledAccountResult srxenabledaccountresult)
    {
        val$checkProgress.dismiss();
        ..SwitchMap.com.walmartlabs.android.pharmacy.PharmacyManager.HasRxEnabledAccountResult[srxenabledaccountresult.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 44
    //                   2 64;
           goto _L1 _L2 _L3
_L1:
        val$errorDialog.show();
_L5:
        return;
_L2:
        PharmacyManager.access$300(PharmacyManager.this, val$startActivity, val$presenterStack, val$listener);
        return;
_L3:
        srxenabledaccountresult = linkAccount(val$startActivity, val$listener);
        if (srxenabledaccountresult != null)
        {
            val$presenterStack.popToRoot();
            val$presenterStack.pushPresenter(srxenabledaccountresult, true);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    FlowCompleted()
    {
        this$0 = final_pharmacymanager;
        val$checkProgress = dialog;
        val$startActivity = activity;
        val$presenterStack = presenterstack;
        val$listener = flowcompleted;
        val$errorDialog = Dialog.this;
        super();
    }
}
