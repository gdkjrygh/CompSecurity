// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity, SaverReceiptActivity

class this._cls0
    implements android.content.istener
{

    final SaverScannerActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent(SaverScannerActivity.this, com/walmart/android/app/saver/SaverReceiptActivity);
        dialoginterface.addFlags(0x20000);
        startActivity(dialoginterface);
        setResult(-1);
        finish();
    }

    ()
    {
        this$0 = SaverScannerActivity.this;
        super();
    }
}
