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

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        StoreSearchManager.access$300(_fld0).toggle();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/storelocator/StoreSearchManager$3

/* anonymous class */
    class StoreSearchManager._cls3
        implements com.walmart.android.search.SearchManager.OnSearchFieldFocusedListener
    {

        final StoreSearchManager this$0;

        public void onFocused(boolean flag)
        {
            if (StoreSearchManager.access$200(StoreSearchManager.this))
            {
                Handler handler = new Handler();
                StoreSearchManager._cls3._cls1 _lcls1 = new StoreSearchManager._cls3._cls1();
                long l;
                if (flag)
                {
                    l = 50L;
                } else
                {
                    l = 0L;
                }
                handler.postDelayed(_lcls1, l);
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

            
            {
                this$0 = StoreSearchManager.this;
                super();
            }
    }

}
