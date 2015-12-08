// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.Wearable;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, WearableDataRequest

public final class DataListenerHandheld
{

    public DataListenerHandheld()
    {
    }

    private static void handleRequest(DataMap datamap, GoogleApiClient googleapiclient, Context context)
    {
        if (googleapiclient == null || context == null || datamap == null)
        {
            StaticMethods.logDebugFormat("Wearable - GoogleApiClient or Context or DataMap is null", new Object[0]);
            return;
        }
        WearableDataRequest wearabledatarequest = WearableDataRequest.createRequestFromDataMap(datamap);
        if (wearabledatarequest == null)
        {
            StaticMethods.logDebugFormat("Wearable - Invalid data request (%s)", new Object[] {
                datamap.toString()
            });
            return;
        }
        if (!googleapiclient.blockingConnect(15000L, TimeUnit.SECONDS).isSuccess())
        {
            StaticMethods.logDebugFormat("Wearable - Failed to setup connection", new Object[0]);
            return;
        } else
        {
            datamap = wearabledatarequest.handle(context);
            context = PutDataMapRequest.create("/abdmobile/data/response");
            context.getDataMap().putAll(datamap);
            Wearable.DataApi.putDataItem(googleapiclient, context.asPutDataRequest());
            return;
        }
    }

    public static void onDataChanged(DataEventBuffer dataeventbuffer, GoogleApiClient googleapiclient, Context context)
    {
        if (dataeventbuffer != null)
        {
            dataeventbuffer = dataeventbuffer.iterator();
            while (dataeventbuffer.hasNext()) 
            {
                Object obj = (DataEvent)dataeventbuffer.next();
                if (((DataEvent) (obj)).getType() == 1)
                {
                    obj = ((DataEvent) (obj)).getDataItem();
                    if (obj != null)
                    {
                        Uri uri = ((DataItem) (obj)).getUri();
                        if (uri != null && uri.getPath() != null && uri.getPath().startsWith("/abdmobile/data/request"))
                        {
                            handleRequest(DataMapItem.fromDataItem(((DataItem) (obj))).getDataMap(), googleapiclient, context);
                        }
                    }
                }
            }
        }
    }
}
