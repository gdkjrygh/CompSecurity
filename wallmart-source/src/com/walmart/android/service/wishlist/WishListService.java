// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import com.walmart.android.service.JacksonConverter;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.service.wishlist.models.ReceiptModel;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.kangaroo.service.Transformer;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.wishlist:
//            ListItem, ReceiptResponse, WishList, ListDeleteResponse, 
//            WishListResults, TransferList, ChangeQuantityRequest, AddBundle, 
//            AddItemBase, CreateWishList, PurchasedItem, UpdateWishList

public class WishListService
{
    public static interface FilterMode
        extends Annotation
    {
    }

    public static interface OrderMode
        extends Annotation
    {
    }

    public static interface SortMode
        extends Annotation
    {
    }


    public static final int ANDROID_STORE_ID = 7;
    private static final String CID_PARAM = "cid";
    public static final String FILTER_ALL = "all";
    public static final String FILTER_PURCHASED = "purchased";
    public static final String FILTER_UNPURCHASED = "unpurchased";
    private static final String LIST_TYPE_PARAM = "listType";
    private static final String LIST_TYPE_WISH_LIST = "WL";
    public static final String ORDER_ASC = "asc";
    public static final String ORDER_DESC = "desc";
    private static final String PATH_ITEMS = "items";
    public static final String SORT_CATEGORY = "category";
    public static final String SORT_PRICE = "price";
    public static final String SORT_QUANTITY = "quantity";
    public static final String SORT_TIME = "time";
    private final Service mService;

    public WishListService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("api/lists").secure(true).okHttpClient(SharedHttpClient.get()).converter(new JacksonConverter(objectmapper)).log(log).build();
    }

    private Request addItemToList(String s, String s1, String s2, Object obj)
    {
        return mService.newRequest().appendPath(s1).appendPath(s2).query("cid", s).query("listType", "WL").post(obj, com/walmart/android/service/wishlist/ListItem, new Transformer() {

            final WishListService this$0;

            public ListItemModel transform(ListItem listitem)
            {
                return new ListItemModel(listitem);
            }

            public volatile Object transform(Object obj1)
            {
                return transform((ListItem)obj1);
            }

            
            {
                this$0 = WishListService.this;
                super();
            }
        });
    }

    private Request createMatchReceiptItemsRequest(String s, String s1, String s2, String s3)
    {
        return mService.newRequest().appendPath(s).appendPath("receiptItems").query("listType", "WL").queryIfNotEmpty("date", s1).query(s2, s3).get(com/walmart/android/service/wishlist/ReceiptResponse, new Transformer() {

            final WishListService this$0;

            public ReceiptModel transform(ReceiptResponse receiptresponse)
            {
                return ReceiptModel.from(receiptresponse);
            }

            public volatile Object transform(Object obj)
            {
                return transform((ReceiptResponse)obj);
            }

            
            {
                this$0 = WishListService.this;
                super();
            }
        });
    }

    Request addBundle(String s, String s1, AddBundle addbundle)
    {
        return addItemToList(s, s1, "bundles", addbundle);
    }

    public Request addItem(String s, String s1, AddItemBase additembase)
    {
        return addItemToList(s, s1, "items", additembase);
    }

    Request createList(String s, CreateWishList createwishlist)
    {
        return mService.newRequest().query("cid", s).query("listType", "WL").post(createwishlist, com/walmart/android/service/wishlist/WishList);
    }

    Request deleteItem(String s, String s1, String s2)
    {
        return mService.newRequest().appendPath(s).appendPath("items").appendPath(s1).query("cid", s2).query("listType", "WL").delete(com/walmart/android/service/wishlist/ListDeleteResponse);
    }

    Request deleteList(String s, String s1)
    {
        return mService.newRequest().appendPath(s).query("cid", s1).query("listType", "WL").delete(java/lang/Void);
    }

    Request findLists(String s, String s1, String s2, String s3, int i, int j)
    {
        return mService.newRequest().appendPath("find").query("listType", "WL").queryIfNotEmpty("firstName", s).queryIfNotEmpty("lastName", s1).queryIfNotEmpty("listName", s2).queryIfNotEmpty("state", s3).query("show", "[\"ACTIVE\"]").query("page", String.valueOf(i)).query("pageSize", String.valueOf(j)).get(com/walmart/android/service/wishlist/WishListResults);
    }

    Request getItems(String s, String s1, String s2, String s3, String s4)
    {
        return mService.newRequest().appendPath(s).appendPath("items").query("listType", "WL").queryIfNotEmpty("cid", s1).queryIfNotEmpty("filter", s2).queryIfNotEmpty("sort", s3).queryIfNotEmpty("order", s4).get([Lcom/walmart/android/service/wishlist/ListItem;, new Transformer() {

            final WishListService this$0;

            public volatile Object transform(Object obj)
            {
                return transform((ListItem[])obj);
            }

            public List transform(ListItem alistitem[])
            {
                ArrayList arraylist = new ArrayList(alistitem.length);
                int j = alistitem.length;
                for (int i = 0; i < j; i++)
                {
                    arraylist.add(new ListItemModel(alistitem[i]));
                }

                return arraylist;
            }

            
            {
                this$0 = WishListService.this;
                super();
            }
        });
    }

    Request getWishList(String s, String s1)
    {
        return mService.newRequest().appendPath(s).queryIfNotEmpty("cid", s1).query("listType", "WL").get(com/walmart/android/service/wishlist/WishList);
    }

    Request getWishLists(String s)
    {
        return mService.newRequest().query("cid", s).query("listType", "WL").get(com/walmart/android/service/wishlist/WishListResults);
    }

    Request markPurchasedItems(String s, PurchasedItem apurchaseditem[])
    {
        return mService.newRequest().appendPath(s).appendPath("items").query("storeId", String.valueOf(7)).put(apurchaseditem, java/lang/Void);
    }

    Request matchReceiptItemsByReceiptId(String s, String s1)
    {
        return createMatchReceiptItemsRequest(s, null, "rid", s1);
    }

    Request matchReceiptItemsByTcNumber(String s, String s1, String s2)
    {
        return createMatchReceiptItemsRequest(s, s1, "tc", s2);
    }

    Request transferLists(String s, String s1)
    {
        TransferList transferlist = new TransferList();
        transferlist.from = s;
        transferlist.to = s1;
        return mService.newRequest().appendPath("chown").post(transferlist, [Lcom/walmart/android/service/wishlist/WishList;);
    }

    Request updateItemQuantities(String s, String s1, String s2, int i, int j)
    {
        return mService.newRequest().appendPath(s).appendPath("items").appendPath(s1).query("cid", s2).query("listType", "WL").put(new ChangeQuantityRequest(i, j), com/walmart/android/service/wishlist/ListItem, new Transformer() {

            final WishListService this$0;

            public ListItemModel transform(ListItem listitem)
            {
                return new ListItemModel(listitem);
            }

            public volatile Object transform(Object obj)
            {
                return transform((ListItem)obj);
            }

            
            {
                this$0 = WishListService.this;
                super();
            }
        });
    }

    Request updateList(String s, String s1, UpdateWishList updatewishlist)
    {
        return mService.newRequest().appendPath(s).query("cid", s1).query("listType", "WL").put(updatewishlist, com/walmart/android/service/wishlist/WishList);
    }
}
