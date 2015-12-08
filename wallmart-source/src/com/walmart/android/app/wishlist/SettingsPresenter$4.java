// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SettingsPresenter

class this._cls0 extends CallbackSameThread
{

    final SettingsPresenter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        char c = '\001';
        SettingsPresenter.access$500(SettingsPresenter.this, 0);
        SettingsPresenter.access$600(SettingsPresenter.this, true);
        if (result.successful() && result.hasData())
        {
            request = (WishList)result.getData();
            SettingsPresenter.access$700(SettingsPresenter.this).onListUpdated(request);
            SettingsPresenter.access$800(SettingsPresenter.this);
            result = new com.walmartlabs.anivia.ilder("listSave");
            if (request.isPublic())
            {
                request = "public";
            } else
            {
                request = "private";
            }
            request = result.putString("privacySetting", request);
            MessageBus.getBus().post(request);
            return;
        }
        if (!result.hasError() || !result.getError().ionError())
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
        DialogFactory.showDialog(c, SettingsPresenter.access$900(SettingsPresenter.this));
    }

    ListUpdatedCallback(Context context)
    {
        this$0 = SettingsPresenter.this;
        super(context);
    }
}
