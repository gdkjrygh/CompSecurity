// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.content.Context;
import com.walmart.android.service.pharmacylegacy.HtmlContent;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.List;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            RxPrivacyNoticePresenter

class this._cls0 extends CallbackSameThread
{

    final RxPrivacyNoticePresenter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        RxPrivacyNoticePresenter.access$000(RxPrivacyNoticePresenter.this).remove(request);
        RxPrivacyNoticePresenter.access$100(RxPrivacyNoticePresenter.this);
        if (result.successful() && result.hasData())
        {
            RxPrivacyNoticePresenter.access$200(RxPrivacyNoticePresenter.this, (HtmlContent)result.getData());
            return;
        }
        char c;
        if (result.hasError() && result.getError().r())
        {
            c = '\001';
        } else
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
        DialogFactory.showDialog(c, RxPrivacyNoticePresenter.access$300(RxPrivacyNoticePresenter.this));
    }

    A(Context context)
    {
        this$0 = RxPrivacyNoticePresenter.this;
        super(context);
    }
}
