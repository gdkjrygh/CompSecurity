// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.analytics;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.model.user.Store;
import com.walmartlabs.android.photo.util.OrderUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AnalyticsHelper
{
    private static class ProductData
    {

        private int count;
        private double itemPrice;
        private String sku;

        public void addQuantity(int i)
        {
            count = count + i;
        }

        public int getCount()
        {
            return count;
        }

        public double getItemPrice()
        {
            return itemPrice;
        }

        public String getSku()
        {
            return sku;
        }

        public ProductData(String s, double d)
        {
            sku = s;
            itemPrice = d;
        }
    }


    private static final String TAG = com/walmartlabs/android/photo/util/analytics/AnalyticsHelper.getSimpleName();

    public AnalyticsHelper()
    {
    }

    private static Map getProductData(PendingOrder pendingorder)
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = pendingorder.getProductSelection().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((PhotoSpecification)iterator.next()).getProductConfigurations().iterator();
            while (iterator1.hasNext()) 
            {
                ProductConfiguration productconfiguration = (ProductConfiguration)iterator1.next();
                PhotoProduct photoproduct = productconfiguration.getProduct();
                String s = photoproduct.getProductIdentifier();
                ProductData productdata = (ProductData)hashmap.get(s);
                pendingorder = productdata;
                if (productdata == null)
                {
                    pendingorder = new ProductData(s, photoproduct.getPrice());
                    hashmap.put(s, pendingorder);
                }
                pendingorder.addQuantity(productconfiguration.getQuantity());
            }
        }

        return hashmap;
    }

    public static void post(Object obj)
    {
        MessageBus.getBus().post(obj);
    }

    public static void postOnHandler(Object obj, Handler handler)
    {
        handler.post(new Runnable(obj) {

            final Object val$object;

            public void run()
            {
                AnalyticsHelper.post(object);
            }

            
            {
                object = obj;
                super();
            }
        });
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareCancelledLeftCountEvent(int i)
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoUploadCancelFail")).putInt("imageCount", i);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareCancelledUploadedCountEvent(int i)
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoUploadCancelSuccess")).putInt("imageCount", i);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareLoginFailureEvent()
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoLogin")).putInt("status", 1);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareLoginFailureReasonEvent(String s)
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("error")).putString("error", s).putString("name", "Photo");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareLoginSuccessEvent()
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoLogin")).putInt("status", 0);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareOrderCompleteEvent(PendingOrder pendingorder, String s, long l, long l1)
    {
        String s1 = pendingorder.getStore().getId();
        double d = OrderUtils.totalDue(pendingorder);
        int i = OrderUtils.printsCount(pendingorder);
        int j = OrderUtils.uploadsCount(pendingorder);
        Object obj = getProductData(pendingorder);
        pendingorder = new StringBuilder();
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        ProductData productdata;
        for (obj = ((Map) (obj)).values().iterator(); ((Iterator) (obj)).hasNext(); stringbuilder1.append(productdata.getCount()))
        {
            productdata = (ProductData)((Iterator) (obj)).next();
            if (pendingorder.length() > 0)
            {
                pendingorder.append(",");
            }
            pendingorder.append(productdata.getSku());
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(productdata.getItemPrice());
            if (stringbuilder1.length() > 0)
            {
                stringbuilder1.append(",");
            }
        }

        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoOrderConfirmation")).putString("itemId", pendingorder.toString()).putString("itemPrice", stringbuilder.toString()).putString("unitCount", stringbuilder1.toString()).putInt("totalUploadCount", j).putLong("totalUploadSize", l).putLong("totalUploadTime", l1).putString("orderTotal", String.valueOf(d)).putString("storeId", s1).putString("orderId", s).putInt("totalUnits", i);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareOrderFailedEvent(String s)
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoOrderConfirmationFail")).putString("reason", s);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder preparePlacedOrderEvent()
    {
        return new com.walmartlabs.anivia.AniviaEventAsJson.Builder("tapPhotoCheckout");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareStartedPhotoEvent()
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("section", "Photo").putString("name", "Select Photo");
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareUploadSizeEvent(long l, boolean flag)
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoUploadSize")).putLong("bytes", l);
        String s;
        if (flag)
        {
            s = "success";
        } else
        {
            s = "fail";
        }
        return builder.putString("status", s);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareUploadTimeEvent(long l)
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("photoUploadTime")).putLong("time", l);
    }

    public static com.walmartlabs.anivia.AniviaEventAsJson.Builder prepareUploadsCompleteEvent(int i)
    {
        return (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("successPhotoUploadCount")).putInt("count", i);
    }

}
