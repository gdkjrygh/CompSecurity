// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.taxonomy;

import android.text.TextUtils;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.io.IOException;
import java.util.Iterator;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.taxonomy:
//            TaxonomyItem

public class TaxonomyService
{

    private static final String PATH_DEPARTMENTS = "departments";
    private static final String PATH_ROLLBACKS = "rollbacks";
    private static final String PATH_SAVINGS_SHOWCASE = "showcase";
    private static final String PATH_TAXONOMY = "taxonomy";
    private String mHost;
    private Service mService;

    public TaxonomyService(String s, ObjectMapper objectmapper, Log log)
    {
        mHost = s;
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("taxonomy").converter(new JacksonConverter(objectmapper)).log(log).okHttpClient(SharedHttpClient.get()).build();
    }

    public Request getDepartment(String s)
    {
        RequestBuilder requestbuilder = mService.newRequest();
        requestbuilder.appendPath("departments");
        if (!TextUtils.isEmpty(s))
        {
            requestbuilder.appendPath(s);
        }
        return requestbuilder.get(com/walmart/android/service/taxonomy/TaxonomyItem).addCallback(new CallbackSameThread() {

            final TaxonomyService this$0;

            private void evictTaxonomyRootFromCache()
            {
                try
                {
                    String s1 = (new android.net.Uri.Builder()).scheme("http").authority(mHost).appendPath("taxonomy").appendPath("departments").toString();
                    Iterator iterator = SharedHttpClient.get().getCache().urls();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        if (!((String)iterator.next()).equals(s1))
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

            
            {
                this$0 = TaxonomyService.this;
                super();
            }
        });
    }

    public Request getDepartments()
    {
        return getDepartment(null);
    }

    public Request getRollbacks()
    {
        return mService.newRequest().appendPath("rollbacks").get(com/walmart/android/service/taxonomy/TaxonomyItem);
    }

    public Request getSavingsShowcase()
    {
        return mService.newRequest().appendPath("showcase").get(com/walmart/android/service/taxonomy/TaxonomyItem);
    }

}
