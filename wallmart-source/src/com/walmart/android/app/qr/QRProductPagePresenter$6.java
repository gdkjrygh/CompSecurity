// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.walmart.android.analytics.GoogleAnalytics;

// Referenced classes of package com.walmart.android.app.qr:
//            QRProductPagePresenter

class this._cls0
    implements android.content.stener
{

    final QRProductPagePresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", Uri.parse(QRProductPagePresenter.access$000(QRProductPagePresenter.this)));
        if (dialoginterface.resolveActivity(QRProductPagePresenter.access$100(QRProductPagePresenter.this).getPackageManager()) != null)
        {
            QRProductPagePresenter.access$100(QRProductPagePresenter.this).startActivity(dialoginterface);
            GoogleAnalytics.trackEvent("Scan", "QR scan browser open", QRProductPagePresenter.access$000(QRProductPagePresenter.this));
        }
    }

    _cls9()
    {
        this$0 = QRProductPagePresenter.this;
        super();
    }
}
