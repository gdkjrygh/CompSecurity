// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.content.DialogInterface;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter, FilterManager

class this._cls0
    implements android.content.elListener
{

    final StoreViewPresenter this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        StoreViewPresenter.access$400(StoreViewPresenter.this).cancelEditing();
    }

    ()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
