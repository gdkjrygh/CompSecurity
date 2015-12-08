// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.content.Intent;
import android.os.Bundle;
import com.walmart.android.app.main.AppState;
import com.walmart.android.app.main.FullScreenActivity;
import com.walmart.android.ui.PresenterStack;

// Referenced classes of package com.walmart.android.app.qr:
//            QRProductPagePresenter

public class QRProductPageActivity extends FullScreenActivity
{

    public static final String EXTRA_URL = "extra_url";
    public static final String TAG = com/walmart/android/app/qr/QRProductPageActivity.getSimpleName();

    public QRProductPageActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        }
        setHeaderText("QR Scanning");
        Intent intent = getIntent();
        bundle = null;
        if (intent != null)
        {
            bundle = intent.getStringExtra("extra_url");
        }
        if (bundle != null)
        {
            bundle = new QRProductPagePresenter(this, bundle);
            getPresenterStack().pushPresenter(bundle, false);
            return;
        } else
        {
            bundle = new QRProductPagePresenter(this, "http://goo.gl/2LMTP");
            getPresenterStack().pushPresenter(bundle, false);
            return;
        }
    }

    public void onRestart()
    {
        super.onRestart();
    }

}
