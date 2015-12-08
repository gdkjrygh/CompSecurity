// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptListPresenter

class this._cls0 extends OnSingleClickListener
{

    final SaverReceiptListPresenter this$0;

    public void onSingleClick(View view)
    {
        SaverReceiptListPresenter.access$400(SaverReceiptListPresenter.this).launchSignIn();
    }

    tionCallbacks(Presenter presenter)
    {
        this$0 = SaverReceiptListPresenter.this;
        super(presenter);
    }
}
