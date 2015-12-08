// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.os.Handler;
import android.view.View;
import com.walmart.android.data.StoreItem;
import com.walmart.android.service.AsyncCallbackOnThread;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.qr:
//            QRProductPagePresenter

class nit> extends AsyncCallbackOnThread
{

    final QRProductPagePresenter this$0;

    public void onFailureSameThread(Integer integer, StoreItem storeitem)
    {
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (StoreItem)obj1);
    }

    public void onSuccessSameThread(StoreItem storeitem)
    {
        ViewUtil.setText(0x7f100462, QRProductPagePresenter.access$1000(QRProductPagePresenter.this), storeitem.getName());
        QRProductPagePresenter.access$1000(QRProductPagePresenter.this).findViewById(0x7f100462);
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((StoreItem)obj);
    }

    _cls9(Handler handler)
    {
        this$0 = QRProductPagePresenter.this;
        super(handler);
    }
}
