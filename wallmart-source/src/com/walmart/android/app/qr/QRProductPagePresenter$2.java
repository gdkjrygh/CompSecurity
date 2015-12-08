// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.squareup.otto.Bus;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.qr:
//            QRProductPagePresenter, QRDataHandler

class this._cls0
    implements android.widget.stener
{

    final QRProductPagePresenter this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        QRProductPagePresenter.access$800(QRProductPagePresenter.this, new ItemDetailsPresenter(QRProductPagePresenter.access$100(QRProductPagePresenter.this), QRProductPagePresenter.access$700(QRProductPagePresenter.this)));
_L4:
        return;
_L2:
        if (i != 2)
        {
            continue; /* Loop/switch isn't completed */
        }
        adapterview = QRProductPagePresenter.access$500(QRProductPagePresenter.this).getKeyword();
        if (adapterview == null) goto _L4; else goto _L3
_L3:
        view = new Bundle();
        view.putString("search_query", adapterview);
        view.putString("search_department", QRProductPagePresenter.access$500(QRProductPagePresenter.this).getDepartment());
        view.putBoolean("from_qr_scan", true);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.me.SHOP, view));
        return;
        if (i != 3) goto _L4; else goto _L5
_L5:
        QRProductPagePresenter.access$900(QRProductPagePresenter.this);
        return;
    }

    me()
    {
        this$0 = QRProductPagePresenter.this;
        super();
    }
}
