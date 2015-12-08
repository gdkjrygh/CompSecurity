// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import com.walmart.android.util.ScannerUtil;
import com.walmartlabs.ereceipt.EReceiptScanner;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFragment

protected static class mFragment
    implements EReceiptScanner
{

    private final Activity mActivity;
    private final SaverFragment mFragment;

    public String getUuidFromScan(int i, int j, Intent intent)
    {
        return null;
    }

    public void onScan()
    {
        mFragment.launchScanner();
    }

    public boolean scannerAvailable()
    {
        return ScannerUtil.scannerAvailable(mActivity);
    }

    public (Activity activity, SaverFragment saverfragment)
    {
        mActivity = activity;
        mFragment = saverfragment;
    }
}
