// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRedeemBluebirdPresenter

class this._cls0
    implements android.view.ebirdPresenter._cls3
{

    final SaverRedeemBluebirdPresenter this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(SaverRedeemBluebirdPresenter.access$200(SaverRedeemBluebirdPresenter.this).getString(0x7f09048b)));
        if (view.resolveActivity(SaverRedeemBluebirdPresenter.access$200(SaverRedeemBluebirdPresenter.this).getPackageManager()) != null)
        {
            SaverRedeemBluebirdPresenter.access$200(SaverRedeemBluebirdPresenter.this).startActivity(view);
            SaverRedeemBluebirdPresenter.access$300(SaverRedeemBluebirdPresenter.this);
        }
    }

    ()
    {
        this$0 = SaverRedeemBluebirdPresenter.this;
        super();
    }
}
