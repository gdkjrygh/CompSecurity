// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.orderhistory;

import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.orderhistory:
//            OrderDetailsResult, OrderHistoryResult

public class OrderHistoryService
{

    private final Service mService;

    public OrderHistoryService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("m/j").query("e", "1").query("service", "OrderHistory").secure(true).okHttpClient(SharedHttpClient.get()).converter(new JacksonConverter(objectmapper)).log(log).build();
    }

    public Request getOrderDetails(String s)
    {
        s = (new com.walmartlabs.kangaroo.Form.Builder()).add("p1", s).build();
        return mService.newRequest().query("method", "getOrder").post(s, com/walmart/android/service/orderhistory/OrderDetailsResult);
    }

    public Request getOrderHistory(int i, int j)
    {
        com.walmartlabs.kangaroo.Form form = (new com.walmartlabs.kangaroo.Form.Builder()).add("p1", String.valueOf(i)).add("p2", String.valueOf(j)).build();
        return mService.newRequest().query("method", "getOrders").post(form, com/walmart/android/service/orderhistory/OrderHistoryResult);
    }
}
