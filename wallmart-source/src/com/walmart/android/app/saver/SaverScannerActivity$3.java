// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;


// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity

class val.ruid
    implements com.walmart.android.wmservice.back
{

    final SaverScannerActivity this$0;
    final String val$ruid;

    public void onFailure(int i)
    {
        if (!isFinishing())
        {
            dismissDialog(1001);
            SaverScannerActivity.access$700(SaverScannerActivity.this);
        }
    }

    public void onSuccess()
    {
        SaverScannerActivity.access$500(SaverScannerActivity.this, val$ruid);
        SaverScannerActivity.access$600(SaverScannerActivity.this, "qrscan");
    }

    back()
    {
        this$0 = final_saverscanneractivity;
        val$ruid = String.this;
        super();
    }
}
