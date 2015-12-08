// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity, SaverSubmitReceiptActivity

class this._cls0
    implements android.view.cannerActivity._cls2
{

    final SaverScannerActivity this$0;

    public void onClick(View view)
    {
        view = new Intent(SaverScannerActivity.this, com/walmart/android/app/saver/SaverSubmitReceiptActivity);
        view.putExtra("EXTRA_SCAN_START", SaverScannerActivity.access$200(SaverScannerActivity.this));
        view.putExtra("EXTRA_ACTIVITY_RESULT_MODE", SaverScannerActivity.access$300(SaverScannerActivity.this));
        view.putExtra("origin", SaverScannerActivity.access$400(SaverScannerActivity.this));
        startActivityForResult(view, 1);
    }

    ity()
    {
        this$0 = SaverScannerActivity.this;
        super();
    }
}
