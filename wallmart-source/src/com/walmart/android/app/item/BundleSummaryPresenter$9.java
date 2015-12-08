// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.item:
//            BundleSummaryPresenter

class on
    implements android.content.stener
{

    final BundleSummaryPresenter this$0;
    final eGroupConfiguration val$bundleGroupConfiguration;
    final com.walmart.android.service.item.upConfiguration val$option;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            BundleSummaryPresenter.access$1400(BundleSummaryPresenter.this, val$bundleGroupConfiguration, val$option);
        } else
        if (i == 1)
        {
            val$bundleGroupConfiguration.deselect(val$option);
            BundleSummaryPresenter.access$1700(BundleSummaryPresenter.this);
            BundleSummaryPresenter.access$1800(BundleSummaryPresenter.this);
            return;
        }
    }

    on()
    {
        this$0 = final_bundlesummarypresenter;
        val$bundleGroupConfiguration = egroupconfiguration;
        val$option = com.walmart.android.service.item.option.this;
        super();
    }
}
