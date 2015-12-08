// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.app.Activity;
import android.os.Handler;
import android.view.Window;
import com.walmartlabs.ui.SearchBarLayout;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreSearchManager

class this._cls0
    implements com.walmart.android.search.hFieldFocusedListener
{

    final StoreSearchManager this$0;

    public void onFocused(boolean flag)
    {
        if (StoreSearchManager.access$200(StoreSearchManager.this))
        {
            Handler handler = new Handler();
            Runnable runnable = new Runnable() {

                final StoreSearchManager._cls3 this$1;

                public void run()
                {
                    StoreSearchManager.access$300(this$0).toggle();
                }

            
            {
                this$1 = StoreSearchManager._cls3.this;
                super();
            }
            };
            long l;
            if (flag)
            {
                l = 50L;
            } else
            {
                l = 0L;
            }
            handler.postDelayed(runnable, l);
        }
        if (!flag)
        {
            StoreSearchManager.access$400(StoreSearchManager.this);
            StoreSearchManager.access$100(StoreSearchManager.this).getWindow().setSoftInputMode(0);
            return;
        } else
        {
            StoreSearchManager.access$100(StoreSearchManager.this).getWindow().setSoftInputMode(32);
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = StoreSearchManager.this;
        super();
    }
}
