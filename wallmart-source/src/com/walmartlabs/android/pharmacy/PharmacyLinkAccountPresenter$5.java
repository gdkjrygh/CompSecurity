// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.content.DialogInterface;
import android.os.Handler;
import android.widget.EditText;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmartlabs.android.pharmacy.data.CoolDownData;
import com.walmartlabs.android.pharmacy.ui.DialogFactory;
import com.walmartlabs.android.pharmacy.ui.dob.DateEditText;
import com.walmartlabs.ui.FloatLabel;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PharmacyLinkAccountPresenter, PharmacyResponse, PharmacyUtils

class this._cls0 extends AsyncCallbackOnThread
{

    final PharmacyLinkAccountPresenter this$0;

    private void handleServerResponse(PharmacyResponse pharmacyresponse)
    {
        PharmacyLinkAccountPresenter.access$500(PharmacyLinkAccountPresenter.this, 2);
        if (pharmacyresponse != null)
        {
            switch (pharmacyresponse.status)
            {
            default:
                PharmacyLinkAccountPresenter.access$1600(PharmacyLinkAccountPresenter.this, 0x10004);
                onFailure();
                return;

            case 1: // '\001'
                onSuccess();
                return;

            case 1008: 
                PharmacyLinkAccountPresenter.access$600(PharmacyLinkAccountPresenter.this);
                return;

            case 1001: 
                PharmacyLinkAccountPresenter.access$800(PharmacyLinkAccountPresenter.this).setBackgroundResource(PharmacyLinkAccountPresenter.access$700(PharmacyLinkAccountPresenter.this));
                PharmacyUtils.restoreLeftPaddingDropDown(PharmacyLinkAccountPresenter.access$800(PharmacyLinkAccountPresenter.this), PharmacyLinkAccountPresenter.access$900(PharmacyLinkAccountPresenter.this));
                PharmacyLinkAccountPresenter.access$1000(PharmacyLinkAccountPresenter.this).setError(dob_doesnt_match_records);
                PharmacyLinkAccountPresenter.access$1100(PharmacyLinkAccountPresenter.this, PharmacyLinkAccountPresenter.access$800(PharmacyLinkAccountPresenter.this));
                return;

            case 1002: 
                DialogFactory.showCoolDownDialog(mActivity, ((CoolDownData)pharmacyresponse.data).dobVerificationAttempted, ((CoolDownData)pharmacyresponse.data).coolDownTimeInSeconds, new android.content.DialogInterface.OnClickListener() {

                    final PharmacyLinkAccountPresenter._cls5 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        PharmacyLinkAccountPresenter.access$1200(this$0);
                    }

            
            {
                this$1 = PharmacyLinkAccountPresenter._cls5.this;
                super();
            }
                });
                return;

            case 1022: 
                PharmacyLinkAccountPresenter.access$1400(PharmacyLinkAccountPresenter.this).setBackgroundResource(PharmacyLinkAccountPresenter.access$1300(PharmacyLinkAccountPresenter.this));
                break;
            }
            PharmacyLinkAccountPresenter.access$1500(PharmacyLinkAccountPresenter.this).setError(last_name_doesnt_match_records);
            PharmacyLinkAccountPresenter.access$1100(PharmacyLinkAccountPresenter.this, PharmacyLinkAccountPresenter.access$1400(PharmacyLinkAccountPresenter.this));
            return;
        } else
        {
            PharmacyLinkAccountPresenter.access$1700(PharmacyLinkAccountPresenter.this, 0x10004);
            onFailure();
            return;
        }
    }

    public void onFailureSameThread(Integer integer, PharmacyResponse pharmacyresponse)
    {
        handleServerResponse(pharmacyresponse);
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (PharmacyResponse)obj1);
    }

    public void onSuccessSameThread(PharmacyResponse pharmacyresponse)
    {
        handleServerResponse(pharmacyresponse);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((PharmacyResponse)obj);
    }

    _cls1.this._cls1(Handler handler)
    {
        this$0 = PharmacyLinkAccountPresenter.this;
        super(handler);
    }
}
