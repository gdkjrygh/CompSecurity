// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

class val.uri
    implements android.view.diseController._cls3
{

    final SaverMerchandiseController this$0;
    final String val$uri;

    public void onClick(View view)
    {
        SaverMerchandiseController.access$1100(SaverMerchandiseController.this).onShowMerchandise(val$uri);
        view = (new com.walmartlabs.anivia.it>("savingsCatcherBanner")).String("banner", val$uri).String("bannerLocation", SaverMerchandiseController.access$1200(SaverMerchandiseController.this));
        MessageBus.getBus().post(view);
    }

    rchandiseSelectedListener()
    {
        this$0 = final_savermerchandisecontroller;
        val$uri = String.this;
        super();
    }
}
