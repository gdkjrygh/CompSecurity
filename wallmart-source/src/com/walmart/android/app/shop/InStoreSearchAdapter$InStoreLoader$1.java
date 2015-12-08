// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.os.Handler;
import com.walmart.android.data.InStoreSearchResult;
import com.walmart.android.service.AsyncCallbackOnThread;
import java.util.Arrays;

// Referenced classes of package com.walmart.android.app.shop:
//            InStoreSearchAdapter

class this._cls1 extends AsyncCallbackOnThread
{

    final onSuccessSameThread this$1;

    public void onFailureSameThread(Integer integer, InStoreSearchResult instoresearchresult)
    {
        cess._mth000(this._cls1.this, (new StringBuilder()).append("Error: ").append(integer).toString(), true);
        if (InStoreSearchAdapter.access$100(_fld0) != null)
        {
            InStoreSearchAdapter.access$100(_fld0).nLoadingFailed(integer);
        }
    }

    public volatile void onFailureSameThread(Object obj, Object obj1)
    {
        onFailureSameThread((Integer)obj, (InStoreSearchResult)obj1);
    }

    public void onSuccessSameThread(InStoreSearchResult instoresearchresult)
    {
        boolean flag1 = true;
        if (instoresearchresult.results == null)
        {
            onFailureSameThread(Integer.valueOf(0x15f91), instoresearchresult);
        } else
        {
            onFailureSameThread onfailuresamethread;
            java.util.List list;
            boolean flag;
            if (instoresearchresult.results.length != 20)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            cess._mth202(this._cls1.this, cess._mth200(this._cls1.this) + 20);
            onfailuresamethread = this._cls1.this;
            list = Arrays.asList(instoresearchresult.results);
            if (instoresearchresult.results.length == 0 || flag)
            {
                flag1 = false;
            }
            cess._mth300(onfailuresamethread, list, flag1);
            if (InStoreSearchAdapter.access$100(_fld0) != null)
            {
                InStoreSearchAdapter.access$100(_fld0).nFirstBatchLoaded();
                return;
            }
        }
    }

    public volatile void onSuccessSameThread(Object obj)
    {
        onSuccessSameThread((InStoreSearchResult)obj);
    }

    (Handler handler)
    {
        this$1 = this._cls1.this;
        super(handler);
    }
}
