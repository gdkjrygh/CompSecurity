// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.ProgressDialog;
import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.qr:
//            QRMediaPlayer

class this._cls0
    implements android.content.OnCancelListener
{

    final QRMediaPlayer this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        QRMediaPlayer.access$000(QRMediaPlayer.this).dismiss();
    }

    tener()
    {
        this$0 = QRMediaPlayer.this;
        super();
    }
}
