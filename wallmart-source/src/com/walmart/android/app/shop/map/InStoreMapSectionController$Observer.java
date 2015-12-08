// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.database.DataSetObserver;
import android.os.Handler;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapSectionController

private class <init> extends DataSetObserver
{

    final InStoreMapSectionController this$0;

    public void onChanged()
    {
        InStoreMapSectionController.access$300(InStoreMapSectionController.this).post(new Runnable() {

            final InStoreMapSectionController.Observer this$1;

            public void run()
            {
                zoomMap();
                InStoreMapSectionController.access$200(this$0);
            }

            
            {
                this$1 = InStoreMapSectionController.Observer.this;
                super();
            }
        });
    }

    public void onInvalidated()
    {
        hideStoreMap();
    }

    private _cls1.this._cls1()
    {
        this$0 = InStoreMapSectionController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
