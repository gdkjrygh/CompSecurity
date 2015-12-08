// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.kangaroo.service.Transformer;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse, ReturnPolicyResponse, ItemDataConverter, ItemModel, 
//            BuyingOptionModel

public class ItemService
{
    private static class BuyingOptionsResponse
    {

        public ItemResponse.BuyingOption buyingOptions;

        private BuyingOptionsResponse()
        {
        }
    }


    private final Service mService;

    public ItemService(String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("product/mobile").converter(new JacksonConverter(objectmapper)).okHttpClient(SharedHttpClient.get()).log(log).build();
    }

    public transient Request getBuyingOption(String s, String as[])
    {
        return mService.newRequest().appendPath("buyingOptions").appendPath(s).queryIfNotEmpty("storeIds", StringUtils.join(as, ",")).get(com/walmart/android/service/item/ItemService$BuyingOptionsResponse, new Transformer() {

            final ItemService this$0;

            public BuyingOptionModel transform(BuyingOptionsResponse buyingoptionsresponse)
            {
                if (buyingoptionsresponse.buyingOptions != null)
                {
                    return ItemDataConverter.buyingOptionModelFromBuyingOption(buyingoptionsresponse.buyingOptions);
                } else
                {
                    return null;
                }
            }

            public volatile Object transform(Object obj)
            {
                return transform((BuyingOptionsResponse)obj);
            }

            
            {
                this$0 = ItemService.this;
                super();
            }
        });
    }

    public transient Request getBuyingOptionByUpc(String s, String as[])
    {
        return mService.newRequest().appendPath("buyingOptions").appendPath(s).queryIfNotEmpty("storeIds", StringUtils.join(as, ",")).get(com/walmart/android/service/item/ItemService$BuyingOptionsResponse, new Transformer() {

            final ItemService this$0;

            public BuyingOptionModel transform(BuyingOptionsResponse buyingoptionsresponse)
            {
                if (buyingoptionsresponse.buyingOptions != null)
                {
                    return ItemDataConverter.buyingOptionModelFromBuyingOption(buyingoptionsresponse.buyingOptions);
                } else
                {
                    return null;
                }
            }

            public volatile Object transform(Object obj)
            {
                return transform((BuyingOptionsResponse)obj);
            }

            
            {
                this$0 = ItemService.this;
                super();
            }
        });
    }

    public transient Request getItem(String s, String as[])
    {
        return mService.newRequest().appendPath("api").appendPath(s).queryIfNotEmpty("storeIds", StringUtils.join(as, ",")).get(com/walmart/android/service/item/ItemResponse, new Transformer() {

            final ItemService this$0;

            public ItemModel transform(ItemResponse itemresponse)
            {
                return ItemDataConverter.itemModelFromItemResponse(itemresponse);
            }

            public volatile Object transform(Object obj)
            {
                return transform((ItemResponse)obj);
            }

            
            {
                this$0 = ItemService.this;
                super();
            }
        });
    }

    public transient Request getItemByUpc(String s, String as[])
    {
        return mService.newRequest().appendPath("api").appendPath("upc").appendPath(s).queryIfNotEmpty("storeIds", StringUtils.join(as, ",")).get(com/walmart/android/service/item/ItemResponse, new Transformer() {

            final ItemService this$0;

            public ItemModel transform(ItemResponse itemresponse)
            {
                return ItemDataConverter.itemModelFromItemResponse(itemresponse);
            }

            public volatile Object transform(Object obj)
            {
                return transform((ItemResponse)obj);
            }

            
            {
                this$0 = ItemService.this;
                super();
            }
        });
    }

    public Request getReturnPolicy(String s)
    {
        return mService.newRequest().path("product").appendPath("api").appendPath("seller").appendPath("return-policy").appendPath(s).get(com/walmart/android/service/item/ReturnPolicyResponse, new Transformer() {

            final ItemService this$0;

            public volatile Object transform(Object obj)
            {
                return transform((ReturnPolicyResponse)obj);
            }

            public String transform(ReturnPolicyResponse returnpolicyresponse)
            {
                return returnpolicyresponse.htmlString;
            }

            
            {
                this$0 = ItemService.this;
                super();
            }
        });
    }
}
