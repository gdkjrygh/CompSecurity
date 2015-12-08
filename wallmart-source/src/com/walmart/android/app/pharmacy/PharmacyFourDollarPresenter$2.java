// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.content.Context;
import com.walmart.android.service.pharmacylegacy.FourDollarPrescriptions;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            PharmacyFourDollarPresenter

class this._cls0 extends CallbackSameThread
{

    final PharmacyFourDollarPresenter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        char c = '\001';
        PharmacyFourDollarPresenter.access$400(PharmacyFourDollarPresenter.this).remove(request);
        if (result.successful() && result.hasData())
        {
            PharmacyFourDollarPresenter.access$002(PharmacyFourDollarPresenter.this, (FourDollarPrescriptions)result.getData());
            PharmacyFourDollarPresenter.access$500(PharmacyFourDollarPresenter.this);
            PharmacyFourDollarPresenter.access$600(PharmacyFourDollarPresenter.this, true);
            return;
        }
        if (!result.hasError() || !result.getError().enter())
        {
            c = '\0';
        }
        if (c != 0)
        {
            c = '\u0258';
        } else
        {
            c = '\u0384';
        }
        DialogFactory.showDialog(c, PharmacyFourDollarPresenter.access$100(PharmacyFourDollarPresenter.this));
    }

    ons(Context context)
    {
        this$0 = PharmacyFourDollarPresenter.this;
        super(context);
    }
}
