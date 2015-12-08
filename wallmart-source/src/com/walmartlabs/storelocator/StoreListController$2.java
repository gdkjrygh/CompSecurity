// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreListController, StoreListAdapter, StorePickerListener

class this._cls0
    implements android.widget.kListener
{

    final StoreListController this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = StoreListController.access$000(StoreListController.this).getStoreAt(i);
        if (adapterview != null)
        {
            if (StoreListController.access$100(StoreListController.this) != null)
            {
                StoreListController.access$100(StoreListController.this).onStoreClicked(adapterview);
            }
            return;
        } else
        {
            Log.e(StoreListController.TAG, (new StringBuilder()).append("Error could not retrieve stor information at position: ").append(i).toString());
            return;
        }
    }

    ()
    {
        this$0 = StoreListController.this;
        super();
    }
}
