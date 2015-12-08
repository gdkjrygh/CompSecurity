// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.storesearch;

import com.walmart.android.data.InStoreSearchResult;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.ereceipt.service.StoreItemService;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Header;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.kangaroo.service.Transformer;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.storesearch:
//            AisleLocations, StoreMapMapping

public class InStoreSearchService
    implements StoreItemService
{

    private static final int LOOKUP_LIMIT = 500;
    public static final String PATH_AISLE_LOCATIONS = "aisle-location";
    private static final String PATH_ITEMS = "items";
    private static final String PATH_SEARCH = "search";
    private static final String QUERY_SEARCH_MODE = "mode";
    private static final String QUERY_SEARCH_OFFSET = "offset";
    private static final String QUERY_SEARCH_QUERY = "query";
    private static final String QUERY_SEARCH_SEARCH_TYPE = "searchType";
    private static final String QUERY_SEARCH_SIZE = "size";
    private static final String QUERY_SEARCH_STORE = "store";
    private final Service mService;

    public InStoreSearchService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).converter(new JacksonConverter(objectmapper)).okHttpClient(SharedHttpClient.get()).log(log).build();
    }

    private com.walmartlabs.ereceipt.service.StoreItemService.StoreItem[] translate(com.walmart.android.data.InStoreSearchResult.Result aresult[])
    {
        ArrayList arraylist = new ArrayList();
        if (aresult != null && aresult.length > 0)
        {
            arraylist.ensureCapacity(aresult.length);
            int j = aresult.length;
            for (int i = 0; i < j; i++)
            {
                com.walmart.android.data.InStoreSearchResult.Result result = aresult[i];
                if (result != null)
                {
                    arraylist.add(new com.walmartlabs.ereceipt.service.StoreItemService.StoreItem(result.getUpc(), result.getWWWItemId(), result.name, result.getThumbNailUrl()));
                }
            }

        }
        return (com.walmartlabs.ereceipt.service.StoreItemService.StoreItem[])arraylist.toArray(new com.walmartlabs.ereceipt.service.StoreItemService.StoreItem[arraylist.size()]);
    }

    public int getLookupLimit()
    {
        return 500;
    }

    public Request lookupAisleLocations(String s)
    {
        return mService.newRequest().appendPath("aisle-location").appendPath(s).get(com/walmart/android/service/storesearch/AisleLocations);
    }

    public void lookupItems(String as[], AsyncCallback asynccallback)
    {
        mService.newRequest().path("items").query("clientId", "5FT26Po8rE").post(as, [Lcom/walmart/android/data/InStoreSearchResult$Result;, new Transformer() {

            final InStoreSearchService this$0;

            public volatile Object transform(Object obj)
            {
                return transform((com.walmart.android.data.InStoreSearchResult.Result[])obj);
            }

            public com.walmartlabs.ereceipt.service.StoreItemService.StoreItem[] transform(com.walmart.android.data.InStoreSearchResult.Result aresult[])
            {
                return translate(aresult);
            }

            
            {
                this$0 = InStoreSearchService.this;
                super();
            }
        }).addCallback(new AsyncCallbackWrapper(asynccallback));
    }

    public Request lookupStoreMapMappings(String s)
    {
        return mService.newRequest().uri(s).get(com/walmart/android/service/storesearch/StoreMapMapping);
    }

    public void searchInStore(String s, String s1, String s2, String s3, int i, int j, AsyncCallback asynccallback)
    {
        mService.newRequest().path("search").query("query", s).query("store", s1).query("size", String.valueOf(j)).query("mode", s2).query("offset", String.valueOf(i)).query("searchType", s3).header(new Header("Accept", "application/vnd.walmart.store.search.v1+json")).get(com/walmart/android/data/InStoreSearchResult).addCallback(new AsyncCallbackWrapper(asynccallback));
    }

}
