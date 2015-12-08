// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.ui.PresenterStack;
import com.walmartlabs.android.pharmacy.data.CoolDownData;
import com.walmartlabs.android.pharmacy.data.ValidateAccountData;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.utils.WLog;
import java.util.Locale;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyManager, PharmacyResponse, PharmacySession

class val.presenterStack
    implements com.walmartlabs.android.pharmacy.ui.dob.lder.OnDateSetListener
{

    final PharmacyManager this$0;
    final FlowCompleted val$listener;
    final PresenterStack val$presenterStack;
    final Activity val$startActivity;

    public void onCancel()
    {
    }

    public void onDateSet(int i, int j, int k)
    {
        Object obj = DialogFactory.onCreateDialog(0x10004, val$startActivity);
        Dialog dialog = DialogFactory.onCreateDialog(0x10002, val$startActivity);
        String s = String.format(Locale.US, "%02d%02d%04d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i)
        });
        ValidateAccountData validateaccountdata = new ValidateAccountData(s);
        obj = new AsyncCallbackOnThread(((Dialog) (obj))) {

            final PharmacyManager._cls6 this$1;
            final String val$dob;
            final Dialog val$errorDialog;
            final Dialog val$validateProgress;

            private void handleServerResponse(PharmacyResponse pharmacyresponse)
            {
                validateProgress.dismiss();
                if (pharmacyresponse != null)
                {
                    switch (pharmacyresponse.status)
                    {
                    default:
                        errorDialog.show();
                        return;

                    case 1: // '\001'
                        PharmacyManager.access$200(this$0).startCustomerSession(dob);
                        listener.onFlowCompleted();
                        return;

                    case 50: // '2'
                        errorDialog.show();
                        return;

                    case 1001: 
                        DialogFactory.showInvalidDobDialog(startActivity, new android.content.DialogInterface.OnClickListener() {

                            final _cls1 this$2;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                PharmacyManager.access$300(this$0, startActivity, presenterStack, listener);
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        }, new android.content.DialogInterface.OnCancelListener() {

                            final _cls1 this$2;

                            public void onCancel(DialogInterface dialoginterface)
                            {
                                presenterStack.popToRoot();
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                        return;

                    case 1002: 
                        DialogFactory.showCoolDownDialog(startActivity, ((CoolDownData)pharmacyresponse.data).dobVerificationAttempted, ((CoolDownData)pharmacyresponse.data).coolDownTimeInSeconds, new android.content.DialogInterface.OnClickListener() {

                            final _cls1 this$2;

                            public void onClick(DialogInterface dialoginterface, int i)
                            {
                                presenterStack.popToRoot();
                            }

            
            {
                this$2 = _cls1.this;
                super();
            }
                        });
                        return;

                    case 1003: 
                        errorDialog.show();
                        return;

                    case 1000: 
                    case 1007: 
                        WLog.w(PharmacyManager.access$000(), (new StringBuilder()).append("Unexpected State: ").append(pharmacyresponse.status).toString());
                        errorDialog.show();
                        return;
                    }
                } else
                {
                    errorDialog.show();
                    return;
                }
            }

            public void onCancelledSameThread()
            {
                handleServerResponse(null);
            }

            public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onFailureSameThread(Object obj1, Object obj2)
            {
                onFailureSameThread((Integer)obj1, (PharmacyResponse)obj2);
            }

            public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
            {
                handleServerResponse(pharmacyresponse);
            }

            public volatile void onSuccessSameThread(Object obj1)
            {
                onSuccessSameThread((PharmacyResponse)obj1);
            }

            
            {
                this$1 = PharmacyManager._cls6.this;
                validateProgress = dialog;
                dob = s;
                errorDialog = dialog1;
                super(final_handler);
            }
        };
        validateAccount(validateaccountdata, ((AsyncCallbackOnThread) (obj)));
        dialog.show();
    }

    FlowCompleted()
    {
        this$0 = final_pharmacymanager;
        val$startActivity = activity;
        val$listener = flowcompleted;
        val$presenterStack = PresenterStack.this;
        super();
    }
}
