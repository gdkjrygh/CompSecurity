// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverRewardPresenter

class this._cls0
    implements android.view.ewardPresenter._cls2
{

    final SaverRewardPresenter this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(SaverRewardPresenter.access$100(SaverRewardPresenter.this).getString(0x7f09048b)));
        if (view.resolveActivity(SaverRewardPresenter.access$100(SaverRewardPresenter.this).getPackageManager()) != null)
        {
            SaverRewardPresenter.access$100(SaverRewardPresenter.this).startActivity(view);
        }
    }

    ()
    {
        this$0 = SaverRewardPresenter.this;
        super();
    }
}
