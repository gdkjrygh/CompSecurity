// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.android.pharmacy:
//            RefillsListAdapter

class ewHolder
    implements android.view.efillsListAdapter._cls2
{

    final RefillsListAdapter this$0;
    final ewHolder val$viewHolder;

    public void onClick(View view)
    {
        if (RefillsListAdapter.access$300(RefillsListAdapter.this) != null)
        {
            if (val$viewHolder.lastRefilledByHomeDelivery)
            {
                RefillsListAdapter.access$300(RefillsListAdapter.this).callHomeDelivery();
            } else
            {
                RefillsListAdapter.access$300(RefillsListAdapter.this).callStore(val$viewHolder.storeNumber);
            }
        }
        MessageBus.getBus().post(new com.walmartlabs.anivia.lder("callToRefillButton"));
    }

    ewHolder()
    {
        this$0 = final_refillslistadapter;
        val$viewHolder = ewHolder.this;
        super();
    }
}
