// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.walmartlabs.storelocator.StoreData;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            PrescriptionPresenter, PharmacyManager

class this._cls0
    implements com.walmartlabs.storelocator.llback
{

    final PrescriptionPresenter this$0;

    public void onFailure(int i)
    {
        PrescriptionPresenter.access$2600(PrescriptionPresenter.this, 2);
        PrescriptionPresenter.access$2700(PrescriptionPresenter.this, 5);
    }

    public void onStoresReceived(StoreData astoredata[])
    {
        PrescriptionPresenter.access$2800(PrescriptionPresenter.this, 2);
        if (astoredata.length > 0)
        {
            astoredata = PharmacyManager.get().getPharmacyPhoneNumber(astoredata[0]);
            if (!TextUtils.isEmpty(astoredata))
            {
                astoredata = new Intent("android.intent.action.DIAL", Uri.parse((new StringBuilder()).append("tel:").append(astoredata).toString()));
                PrescriptionPresenter.access$400(PrescriptionPresenter.this).startActivity(astoredata);
                return;
            } else
            {
                PrescriptionPresenter.access$2900(PrescriptionPresenter.this, 4);
                return;
            }
        } else
        {
            PrescriptionPresenter.access$3000(PrescriptionPresenter.this, 5);
            return;
        }
    }

    ck()
    {
        this$0 = PrescriptionPresenter.this;
        super();
    }
}
