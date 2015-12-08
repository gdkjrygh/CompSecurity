// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.weeklyad;

import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.kangaroo.service.Transformer;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.weeklyad:
//            WeeklyAdWireItem, WeeklyAdItem

public class WeeklyAdService
{

    private static final String ACCESS_TOKEN = "bec50cdf";
    private static final String PARAM_ACCESS_TOKEN = "access_token";
    private static final String PRODUCT_PATH = "product";
    private static final String PUBLICATIONS_PATH = "publications";
    private static final String PUBLICATION_PATH = "publication";
    private static final String WALMART_PATH = "walmartusa";
    private static final String WEEKLY_AD_API = "flyerkit";
    private final Service mService;

    public WeeklyAdService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("flyerkit").secure(true).okHttpClient(SharedHttpClient.get()).converter(new JacksonConverter(objectmapper)).log(log).build();
    }

    public Request getWeeklyAdItem(String s)
    {
        return mService.newRequest().appendPath("product").appendPath(s).query("access_token", "bec50cdf").get(com/walmart/android/service/weeklyad/WeeklyAdWireItem, new Transformer() {

            final WeeklyAdService this$0;

            public WeeklyAdItem transform(WeeklyAdWireItem weeklyadwireitem)
            {
                return WeeklyAdItem.from(weeklyadwireitem);
            }

            public volatile Object transform(Object obj)
            {
                return transform((WeeklyAdWireItem)obj);
            }

            
            {
                this$0 = WeeklyAdService.this;
                super();
            }
        });
    }
}
