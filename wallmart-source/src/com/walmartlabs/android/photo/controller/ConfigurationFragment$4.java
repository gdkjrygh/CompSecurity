// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.view.PhotoBaseView;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationProductsView;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationView;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ConfigurationFragment

class this._cls0
    implements com.walmartlabs.android.photo.net.sUpdateCallback
{

    final ConfigurationFragment this$0;

    public void onUpdated(List list)
    {
        if (isAdded())
        {
            ConfigurationFragment.access$100(ConfigurationFragment.this).getProductsView().setModel(list, false);
            ConfigurationFragment.access$000(ConfigurationFragment.this);
            if (list != null && list.size() > 0)
            {
                ConfigurationFragment.access$200(ConfigurationFragment.this).setPrimaryButtonEnabled(true);
            }
            return;
        } else
        {
            PhotoLogger.get().d(ConfigurationFragment.access$300(), "Ignoring products callback since fragment is not added to the activity");
            return;
        }
    }

    onProductsView()
    {
        this$0 = ConfigurationFragment.this;
        super();
    }
}
