// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemConfirmationPresenter

class this._cls0
    implements android.view.ationPresenter._cls2
{

    final SaverRedeemConfirmationPresenter this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(SaverRedeemConfirmationPresenter.access$100(SaverRedeemConfirmationPresenter.this).getString(0x7f09048b)));
        if (view.resolveActivity(SaverRedeemConfirmationPresenter.access$100(SaverRedeemConfirmationPresenter.this).getPackageManager()) != null)
        {
            SaverRedeemConfirmationPresenter.access$100(SaverRedeemConfirmationPresenter.this).startActivity(view);
            MessageBus.getBus().post((new com.walmartlabs.anivia.nter("pageView")).("name", "Bluebird site").("section", "Saver").("subCategory", "Bluebird"));
        }
    }

    ()
    {
        this$0 = SaverRedeemConfirmationPresenter.this;
        super();
    }
}
