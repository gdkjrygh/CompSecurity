// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.squareup.otto.Bus;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.qr:
//            QRProductPagePresenter, QRDataHandler

class this._cls0
    implements this._cls0
{

    final QRProductPagePresenter this$0;

    public void onInitDone(int i, String s)
    {
        if (s != null)
        {
            QRProductPagePresenter.access$002(QRProductPagePresenter.this, s);
        }
        i;
        JVM INSTR tableswitch 0 6: default 56
    //                   0 138
    //                   1 130
    //                   2 147
    //                   3 57
    //                   4 165
    //                   5 240
    //                   6 299;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L5:
        if ((s = new Intent("android.intent.action.VIEW", Uri.parse(QRProductPagePresenter.access$000(QRProductPagePresenter.this)))).resolveActivity(QRProductPagePresenter.access$100(QRProductPagePresenter.this).getPackageManager()) != null)
        {
            QRProductPagePresenter.access$100(QRProductPagePresenter.this).startActivity(s);
            QRProductPagePresenter.access$100(QRProductPagePresenter.this).finish();
            GoogleAnalytics.trackEvent("Scan", "QR scan browser open", QRProductPagePresenter.access$000(QRProductPagePresenter.this));
            return;
        }
          goto _L1
_L3:
        QRProductPagePresenter.access$200(QRProductPagePresenter.this);
        return;
_L2:
        QRProductPagePresenter.access$300(QRProductPagePresenter.this, 1);
        return;
_L4:
        QRProductPagePresenter.access$400(QRProductPagePresenter.this);
        QRProductPagePresenter.access$100(QRProductPagePresenter.this).finish();
        return;
_L6:
        s = new Bundle();
        s.putString("search_query", QRProductPagePresenter.access$500(QRProductPagePresenter.this).getKeyword());
        s.putString("search_department", QRProductPagePresenter.access$500(QRProductPagePresenter.this).getDepartment());
        s.putBoolean("from_qr_scan", true);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.me.SHOP, s));
        QRProductPagePresenter.access$100(QRProductPagePresenter.this).finish();
        return;
_L7:
        s = new Bundle();
        s.putString("browse_token", QRProductPagePresenter.access$500(QRProductPagePresenter.this).getKeyword());
        s.putBoolean("from_qr_scan", true);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.me.SHOP, s));
        QRProductPagePresenter.access$100(QRProductPagePresenter.this).finish();
        return;
_L8:
        s = new ItemDetailsPresenter(QRProductPagePresenter.access$100(QRProductPagePresenter.this), QRProductPagePresenter.access$500(QRProductPagePresenter.this).getItemID());
        QRProductPagePresenter.access$600(QRProductPagePresenter.this, s, false);
        return;
    }

    me()
    {
        this$0 = QRProductPagePresenter.this;
        super();
    }
}
