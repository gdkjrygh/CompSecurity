// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.walmart.android.app.main:
//            RedLaserActivity

class this._cls0
    implements android.view.r
{

    final RedLaserActivity this$0;

    public void onClick(View view)
    {
        view = new Intent();
        view.putExtra("enter_manually", true);
        setResult(-1, view);
        finish();
        postRxScanAnalyticsEvent("manual");
    }

    ()
    {
        this$0 = RedLaserActivity.this;
        super();
    }
}
