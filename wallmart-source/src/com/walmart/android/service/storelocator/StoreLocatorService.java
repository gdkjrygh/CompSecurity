// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.storelocator;

import android.content.Context;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.JacksonConverter;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.storelocator.StoreService;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

public class StoreLocatorService extends StoreService
{
    private static class StoreLocatorCallback extends CallbackSameThread
    {

        private final com.walmartlabs.storelocator.StoreService.GetStoresCallback mCallback;

        public void onResultSameThread(Request request, Result result)
        {
            if (result.successful() && result.hasData())
            {
                mCallback.onStoresReceived((com.walmartlabs.storelocator.StoreData[])result.getData());
                return;
            } else
            {
                mCallback.onFailure(AsyncCallbackWrapper.translateError(result).intValue());
                return;
            }
        }

        StoreLocatorCallback(Context context, com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback)
        {
            super(context);
            mCallback = getstorescallback;
        }
    }

    private static class WalmartStoreProcessor
        implements Transformer
    {

        private void preProcess(WalmartStore awalmartstore[])
        {
            int j = awalmartstore.length;
            for (int i = 0; i < j; i++)
            {
                WalmartStore walmartstore = awalmartstore[i];
                String s = walmartstore.getDescription();
                if (s == null || s.trim().equals(""))
                {
                    walmartstore.setDescription("Walmart");
                }
            }

        }

        public volatile Object transform(Object obj)
        {
            return transform((WalmartStore[])obj);
        }

        public WalmartStore[] transform(WalmartStore awalmartstore[])
        {
            preProcess(awalmartstore);
            return awalmartstore;
        }

        private WalmartStoreProcessor()
        {
        }

    }


    private final Context mContext;
    private final ObjectMapper mObjectMapper;
    private final Service mService;
    private final WalmartStoreProcessor mWalmartStoreProcessor = new WalmartStoreProcessor();

    public StoreLocatorService(Context context, String s, ObjectMapper objectmapper, Log log)
    {
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).host(s).path("m/j").query("e", "1").query("service", "StoreLocator").okHttpClient(SharedHttpClient.get()).log(log).converter(new JacksonConverter(objectmapper)).build();
        mObjectMapper = objectmapper;
        mContext = context;
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

    public void getStore(int i, com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback)
    {
        mService.newRequest().query("method", "locate").query("version", "2").query("p1", Integer.toString(i)).get([Lcom/walmart/android/data/WalmartStore;, mWalmartStoreProcessor).addCallback(new StoreLocatorCallback(mContext, getstorescallback));
    }

    public void getStores(double d, double d1, int i, int j, int k, 
            com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback)
    {
        mService.newRequest().query("method", "locate").query("version", "2").query("p1", Double.toString(d1)).query("p2", Double.toString(d)).query("p3", Integer.toString(i)).query("p4", Integer.toString(j)).query("p5", Integer.toString(k)).secure().get([Lcom/walmart/android/data/WalmartStore;, mWalmartStoreProcessor).addCallback(new StoreLocatorCallback(mContext, getstorescallback));
    }

    public void getStoresForItems(double d, double d1, String as[], int i, int j, 
            com.walmartlabs.storelocator.StoreService.GetStoresCallback getstorescallback)
    {
        mService.newRequest().query("method", "locateShippableByLatLong").query("p1", Double.toString(d1)).query("p2", Double.toString(d)).query("p3", buildJsonFromObject(as)).query("p4", Integer.toString(i)).query("p5", Integer.toString(j)).secure().get([Lcom/walmart/android/data/WalmartStore;, mWalmartStoreProcessor).addCallback(new StoreLocatorCallback(mContext, getstorescallback));
    }
}
