// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.widget.ImageView;
import com.squareup.picasso.Callback;
import com.walmart.android.data.AppConfig;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

class val.config
    implements Callback
{

    final SaverMerchandiseController this$0;
    final ImageView val$bannerView;
    final AppConfig val$config;

    public void onError()
    {
        SaverMerchandiseController.access$1000(SaverMerchandiseController.this, val$bannerView, "walmart://rollbacks");
    }

    public void onSuccess()
    {
        SaverMerchandiseController.access$1000(SaverMerchandiseController.this, val$bannerView, val$config.scBanner.config);
    }

    ()
    {
        this$0 = final_savermerchandisecontroller;
        val$bannerView = imageview;
        val$config = AppConfig.this;
        super();
    }
}
