// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.cart;

import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import java.util.Collections;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.cart:
//            ItemCount, ListInfo, Location

public class CartService
{
    private static class GroupingOfferConfiguration
    {

        public List groupComponents;
        public String groupId;
        public final ListInfo listInfo;
        public int quantity;

        public GroupingOfferConfiguration(String s, List list, int i, ListInfo listinfo)
        {
            groupId = s;
            groupComponents = Collections.unmodifiableList(list);
            quantity = i;
            listInfo = listinfo;
        }
    }

    public static class OfferConfiguration
    {

        public final ListInfo listInfo;
        public final String offerId;
        public final int quantity;

        public OfferConfiguration(String s, int i)
        {
            this(s, i, null);
        }

        public OfferConfiguration(String s, int i, ListInfo listinfo)
        {
            offerId = s;
            quantity = i;
            listInfo = listinfo;
        }
    }

    private static class PutGroupingOfferConfiguration extends GroupingOfferConfiguration
    {

        public Location location;
        public int storeId[];

        public PutGroupingOfferConfiguration(String s, List list, int i, ListInfo listinfo, int j, Location location1)
        {
            super(s, list, i, listinfo);
            storeId = (new int[] {
                j
            });
            location = location1;
        }
    }

    private static class PutOfferConfiguration extends OfferConfiguration
    {

        public final Location location;
        public final int storeIds[];

        public PutOfferConfiguration(String s, int i, ListInfo listinfo, int j, Location location1)
        {
            super(s, i, listinfo);
            storeIds = (new int[] {
                j
            });
            location = location1;
        }
    }


    private static final String PATH_COUNT = "count";
    private static final String PATH_ITEMS = "items";
    private final Service mService;

    public CartService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).secure(true).host(s).path("cart").converter(new JacksonConverter(objectmapper)).okHttpClient(SharedHttpClient.get()).log(log).build();
    }

    private Request add(Object obj)
    {
        return mService.newRequest().appendPath("items").post(obj, com/walmart/android/service/cart/ItemCount);
    }

    public Request addGrouping(String s, List list, int i, ListInfo listinfo)
    {
        return add(new GroupingOfferConfiguration(s, list, i, listinfo));
    }

    public Request addGrouping(String s, List list, int i, ListInfo listinfo, int j, Location location)
    {
        return add(new PutGroupingOfferConfiguration(s, list, i, listinfo, j, location));
    }

    public Request addItem(String s, int i, ListInfo listinfo)
    {
        return add(new OfferConfiguration(s, i, listinfo));
    }

    public Request addItem(String s, int i, ListInfo listinfo, int j, Location location)
    {
        return add(new PutOfferConfiguration(s, i, listinfo, j, location));
    }

    public Request getCount()
    {
        return mService.newRequest().appendPath("items").appendPath("count").get(com/walmart/android/service/cart/ItemCount);
    }
}
