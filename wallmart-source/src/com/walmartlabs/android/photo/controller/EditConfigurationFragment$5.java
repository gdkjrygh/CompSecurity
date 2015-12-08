// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationProductsView;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            EditConfigurationFragment

class this._cls0
    implements com.walmartlabs.android.photo.net.ateCallback
{

    final EditConfigurationFragment this$0;

    public void onUpdated(List list)
    {
        if (isAdded())
        {
            EditConfigurationFragment.access$300(EditConfigurationFragment.this).setModel(list, true);
            EditConfigurationFragment.access$000(EditConfigurationFragment.this);
            return;
        } else
        {
            PhotoLogger.get().d(EditConfigurationFragment.access$400(), "Ignoring products callback since fragment is not in resumed state");
            return;
        }
    }

    oductsView()
    {
        this$0 = EditConfigurationFragment.this;
        super();
    }
}
