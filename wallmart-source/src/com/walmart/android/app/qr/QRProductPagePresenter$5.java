// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.qr:
//            QRProductPagePresenter

class this._cls0
    implements android.content.Listener
{

    final QRProductPagePresenter this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        QRProductPagePresenter.access$100(QRProductPagePresenter.this).finish();
    }

    _cls9()
    {
        this$0 = QRProductPagePresenter.this;
        super();
    }
}
