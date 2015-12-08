// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.irs;

import com.walmart.android.data.ItemRecommendationResult;
import com.walmart.android.service.JacksonConverter;
import com.walmart.android.wmservice.Util;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.http.cookie.Cookie;
import org.codehaus.jackson.map.ObjectMapper;

public class ItemRecommendationService
{

    static final String PATH = "/irs-ws/irs/3.0";
    private final Service mService;
    private final WalmartNetService mWalmartNetService;

    public ItemRecommendationService(String s, WalmartNetService walmartnetservice, ObjectMapper objectmapper, Log log)
    {
        mWalmartNetService = walmartnetservice;
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("/irs-ws/irs/3.0").okHttpClient(SharedHttpClient.get()).converter(new JacksonConverter(objectmapper)).log(log).build();
    }

    private static String getVisitorId(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Cookie cookie = (Cookie)list.next();
            if ("com.wm.visitor".equals(cookie.getName()))
            {
                return cookie.getValue();
            }
        }

        return null;
    }

    public Request getRecommendations(String s)
    {
        List list = mWalmartNetService.getCookies();
        return mService.newRequest().query("modules_bit_field", "0").query("api_key", "01-m").query("config_id", "30").query("client_guid", UUID.randomUUID().toString()).query("parent_item_id", s).queryIfNotEmpty("visitor_id", getVisitorId(list)).queryIfNotEmpty("customer_id_enc", Util.getCustomerId(list)).get(com/walmart/android/data/ItemRecommendationResult);
    }
}
