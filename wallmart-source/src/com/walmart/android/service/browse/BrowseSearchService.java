// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.browse;

import com.walmart.android.data.StoreQueryResult;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.Iso88591Transformer;
import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.io.IOException;
import java.util.Locale;
import org.codehaus.jackson.map.ObjectMapper;

public class BrowseSearchService
{

    private static final String BROWSE_BY_TOKEN_FILTERED = "browseByTokenFiltered";
    public static final String ITEM_SOURCE_ALL = "All";
    public static final String ITEM_SOURCE_STORE = "Store";
    private static final String SEARCH_BY_DEPARTMENT_FILTERED = "searchByDepartmentFiltered";
    private static final String TAG = com/walmart/android/service/browse/BrowseSearchService.getSimpleName();
    private final ObjectMapper mObjectMapper;
    private final Iso88591Transformer mResultTransformer;
    private final Service mService;

    public BrowseSearchService(String s, ObjectMapper objectmapper, Log log)
    {
        mObjectMapper = objectmapper;
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("m/j").query("e", "1").query("service", "Browse").query("version", "2").okHttpClient(SharedHttpClient.get()).log(log).converter(new JacksonConverter(objectmapper)).build();
        mResultTransformer = new Iso88591Transformer(com/walmart/android/data/StoreQueryResult, mObjectMapper);
    }

    private String buildJsonFromObject(Object obj)
    {
        try
        {
            obj = mObjectMapper.writeValueAsString(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return "[]";
        }
        return ((String) (obj));
    }

    private String validateDepartment(String s)
    {
        if (s != null && !"".equals(s.trim()))
        {
            return s.toUpperCase(Locale.US);
        } else
        {
            return "ENTIRESITE";
        }
    }

    public void browseItems(String s, String s1, String s2, int i, int j, String as[], AsyncCallback asynccallback)
    {
        mService.newRequest().query("method", "browseByTokenFiltered").query("p1", s).query("p2", s1).query("p3", s2).query("p4", String.valueOf(i)).query("p5", String.valueOf(j)).query("p6", buildJsonFromObject(as)).get([B, mResultTransformer).addCallback(new AsyncCallbackWrapper(asynccallback));
    }

    public void browseItemsWithStore(String s, String s1, String s2, int i, int j, String s3, String as[], 
            AsyncCallback asynccallback)
    {
        mService.newRequest().query("method", "browseByTokenFiltered").query("p1", s).query("p2", s1).query("p3", s2).query("p4", String.valueOf(i)).query("p5", String.valueOf(j)).query("p6", s3).query("p7", buildJsonFromObject(as)).get([B, mResultTransformer).addCallback(new AsyncCallbackWrapper(asynccallback));
    }

    public void searchItems(String s, String s1, String s2, String s3, int i, int j, String as[], 
            AsyncCallback asynccallback)
    {
        mService.newRequest().query("method", "searchByDepartmentFiltered").query("p1", s).query("p2", validateDepartment(s1)).query("p3", s2).query("p4", s3).query("p5", String.valueOf(i)).query("p6", String.valueOf(j)).query("p7", buildJsonFromObject(as)).get([B, mResultTransformer).addCallback(new AsyncCallbackWrapper(asynccallback));
    }

    public void searchItemsWithStore(String s, String s1, String s2, String s3, int i, int j, String s4, 
            String as[], AsyncCallback asynccallback)
    {
        mService.newRequest().query("method", "searchByDepartmentFiltered").query("p1", s).query("p2", validateDepartment(s1)).query("p3", s2).query("p4", s3).query("p5", String.valueOf(i)).query("p6", String.valueOf(j)).query("p7", s4).query("p8", buildJsonFromObject(as)).get([B, mResultTransformer).addCallback(new AsyncCallbackWrapper(asynccallback));
    }

}
