// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.taxonomy;

import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.walmart.android.service.taxonomy:
//            TaxonomyService

class this._cls0 extends CallbackSameThread
{

    final TaxonomyService this$0;

    private void evictTaxonomyRootFromCache()
    {
        try
        {
            String s = (new android.net.()).("http").ity(TaxonomyService.access$000(TaxonomyService.this)).Path("taxonomy").Path("departments").ng();
            Iterator iterator = SharedHttpClient.get().getCache().urls();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!((String)iterator.next()).equals(s))
                {
                    continue;
                }
                iterator.remove();
                break;
            } while (true);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    public void onResultSameThread(Request request, Result result)
    {
        if (result.getStatusCode() == 404)
        {
            evictTaxonomyRootFromCache();
        }
    }

    ()
    {
        this$0 = TaxonomyService.this;
        super();
    }
}
