// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.PutDataMapRequest;
import com.google.android.gms.wearable.Wearable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods, WearableDataResponse, WearableDataRequest

final class WearableDataConnection
    implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.wearable.DataApi.DataListener
{

    protected DataMap mDataMap;
    private final GoogleApiClient mGoogleApiClient;
    private CountDownLatch mInTimeCountDownLatch;
    protected String requestID;

    protected WearableDataConnection(Context context)
    {
        mGoogleApiClient = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).addOnConnectionFailedListener(this).addApi(Wearable.API).build();
    }

    private boolean connect(int i)
    {
        mGoogleApiClient.connect();
        if (!waitForConnect(i))
        {
            StaticMethods.logWarningFormat("Wearable - Timeout setup connection", new Object[0]);
            return false;
        }
        if (!hasNodes())
        {
            StaticMethods.logWarningFormat("Wearable - No connected Node found", new Object[0]);
            return false;
        } else
        {
            return true;
        }
    }

    private boolean hasNodes()
    {
        com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult getconnectednodesresult = (com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult)Wearable.NodeApi.getConnectedNodes(mGoogleApiClient).await();
        return getconnectednodesresult != null && getconnectednodesresult.getNodes() != null && getconnectednodesresult.getNodes().size() > 0;
    }

    private boolean waitForConnect(int i)
    {
        if (mGoogleApiClient.isConnected())
        {
            return true;
        } else
        {
            return mGoogleApiClient.blockingConnect(i, TimeUnit.MILLISECONDS).isSuccess();
        }
    }

    protected WearableDataResponse getResponse()
    {
        if (mDataMap == null)
        {
            return null;
        } else
        {
            return WearableDataResponse.createResponseFromDataMap(mDataMap, mGoogleApiClient);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
        dataeventbuffer = dataeventbuffer.iterator();
        do
        {
            Object obj;
label0:
            {
                if (dataeventbuffer.hasNext())
                {
                    obj = (DataEvent)dataeventbuffer.next();
                    if (((DataEvent) (obj)).getType() == 1)
                    {
                        break label0;
                    }
                }
                return;
            }
            Object obj1 = ((DataEvent) (obj)).getDataItem();
            if (obj1 != null)
            {
                obj1 = ((DataItem) (obj1)).getUri();
                if (obj1 != null && ((Uri) (obj1)).getPath() != null && ((Uri) (obj1)).getPath().compareTo("/abdmobile/data/response") == 0)
                {
                    obj = DataMapItem.fromDataItem(((DataEvent) (obj)).getDataItem()).getDataMap();
                    if (obj != null && ((DataMap) (obj)).containsKey("ID") && ((DataMap) (obj)).getString("ID").equals(requestID))
                    {
                        mDataMap = ((DataMap) (obj));
                        mInTimeCountDownLatch.countDown();
                        return;
                    }
                }
            }
        } while (true);
    }

    protected WearableDataResponse send(WearableDataRequest wearabledatarequest)
    {
        if (!connect(wearabledatarequest.getTimeOut()))
        {
            return null;
        }
        Wearable.DataApi.addListener(mGoogleApiClient, this);
        requestID = wearabledatarequest.getUUID();
        Object obj = PutDataMapRequest.create("/abdmobile/data/request");
        ((PutDataMapRequest) (obj)).getDataMap().putAll(wearabledatarequest.getDataMap());
        obj = ((PutDataMapRequest) (obj)).asPutDataRequest();
        mInTimeCountDownLatch = new CountDownLatch(1);
        Wearable.DataApi.putDataItem(mGoogleApiClient, ((com.google.android.gms.wearable.PutDataRequest) (obj)));
        if (mInTimeCountDownLatch.await(wearabledatarequest.getTimeOut(), TimeUnit.MILLISECONDS))
        {
            break MISSING_BLOCK_LABEL_136;
        }
        StaticMethods.logWarningFormat("Wearable - Failed to get data from handheld app", new Object[0]);
        Wearable.DataApi.removeListener(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
        return null;
        wearabledatarequest = getResponse();
        Wearable.DataApi.removeListener(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
        return wearabledatarequest;
        wearabledatarequest;
        StaticMethods.logWarningFormat("Wearable - Failed to get data from handheld app", new Object[0]);
        Wearable.DataApi.removeListener(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
        return null;
        wearabledatarequest;
        Wearable.DataApi.removeListener(mGoogleApiClient, this);
        mGoogleApiClient.disconnect();
        throw wearabledatarequest;
    }
}
