// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;

// Referenced classes of package com.walmart.android.app.item:
//            BundleSummaryPresenter

class on
    implements android.view.maryPresenter._cls7
{

    final BundleSummaryPresenter this$0;
    final eGroupConfiguration val$bundleGroupConfiguration;
    final com.walmart.android.service.item.upConfiguration val$option;

    public boolean onLongClick(View view)
    {
        BundleSummaryPresenter.access$1500(BundleSummaryPresenter.this, val$bundleGroupConfiguration, val$option);
        return true;
    }

    on()
    {
        this$0 = final_bundlesummarypresenter;
        val$bundleGroupConfiguration = egroupconfiguration;
        val$option = com.walmart.android.service.item.option.this;
        super();
    }
}
