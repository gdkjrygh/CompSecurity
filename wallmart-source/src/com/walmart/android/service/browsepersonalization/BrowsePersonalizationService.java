// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.browsepersonalization;

import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import org.codehaus.jackson.map.ObjectMapper;

public class BrowsePersonalizationService
{

    public static final String ITEM_SORT_BY_ALPHA_AZ = "ALPHA_AZ";
    public static final String ITEM_SORT_BY_ALPHA_ZA = "ALPHA_ZA";
    public static final String ITEM_SORT_BY_BESTSELLERS = "BESTSELLERS";
    public static final String ITEM_SORT_BY_NEW = "NEW";
    public static final String ITEM_SORT_BY_PRICE_HILO = "HILO";
    public static final String ITEM_SORT_BY_PRICE_LOHI = "LOHI";
    public static final String ITEM_SORT_BY_RELEVANCE = "RELEVANCE";
    public static final String ITEM_SORT_BY_TOPRATED = "TOPRATED";
    public static final String ITEM_SOURCE_ALL = "All";
    public static final String ITEM_SOURCE_ONLINE = "Online";
    public static final String ITEM_SOURCE_STORE = "Store";
    private Service mService;

    public BrowsePersonalizationService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("m/j").query("e", "1").query("service", "BrowsePersonalization").okHttpClient(SharedHttpClient.get()).log(log).converter(new JacksonConverter(objectmapper)).build();
    }

    public void getLeafItems(String s, String s1, String s2, int i, int j, AsyncCallback asynccallback)
    {
        mService.newRequest().query("method", "getLeafItems").query("version", "2").query("p1", s).query("p2", s1).query("p3", s2).query("p4", String.valueOf(i)).query("p5", String.valueOf(j)).query("p6", "null").query("p7", "false").query("p8", "false").get([Lcom/walmart/android/service/browsepersonalization/LeafItems;).addCallback(new AsyncCallbackWrapper(asynccallback));
    }
}
