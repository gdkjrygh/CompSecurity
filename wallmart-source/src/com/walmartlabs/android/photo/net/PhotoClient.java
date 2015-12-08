// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.walmartlabs.android.photo.model.DomainMapper;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.net.exception.OrderSerializationException;
import com.walmartlabs.android.photo.net.mocked.MockedAuthenticationResponse;
import com.walmartlabs.android.photo.net.mocked.MockedOrderResponse;
import com.walmartlabs.android.photo.net.mocked.MockedProductsResponse;
import com.walmartlabs.android.photo.net.mocked.MockedStoreStatusResponse;
import com.walmartlabs.android.photo.util.PhotoLogger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            EndpointsFactory, EndpointsProvider, PhotoEntityUpload, PhotoNetworkServices, 
//            PhotoUpload, PhotoResponse

public class PhotoClient
{

    private static final String TAG = com/walmartlabs/android/photo/net/PhotoClient.getSimpleName();
    private static PhotoClient sInstance;
    private Context mContext;
    private EndpointsProvider mEndpoints;

    private PhotoClient(Context context)
    {
        mContext = context;
        mEndpoints = EndpointsFactory.getDefaultEndpoints(mContext);
    }

    public static PhotoClient get(Context context)
    {
        com/walmartlabs/android/photo/net/PhotoClient;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new PhotoClient(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/net/PhotoClient;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public boolean checkBlixtConnectivity()
    {
        if (isMocked())
        {
            return true;
        }
        InetAddress.getByName((new URL(mEndpoints.getBlixtServerBase())).getHost());
        return true;
        Object obj;
        obj;
        ((UnknownHostException) (obj)).printStackTrace();
_L2:
        return false;
        obj;
        ((MalformedURLException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean checkConnectivity()
    {
        if (!isMocked())
        {
            Object obj = (ConnectivityManager)mContext.getSystemService("connectivity");
            NetworkInfo networkinfo = ((ConnectivityManager) (obj)).getNetworkInfo(1);
            obj = ((ConnectivityManager) (obj)).getNetworkInfo(0);
            if ((networkinfo == null || !networkinfo.isConnected()) && (obj == null || !((NetworkInfo) (obj)).isConnected()))
            {
                return false;
            }
        }
        return true;
    }

    public PhotoUpload createPhotoUpload(DevicePhoto devicephoto, Contact contact, PhotoUpload.PhotoUploadListener photouploadlistener)
    {
        return new PhotoEntityUpload(PhotoNetworkServices.get(mContext), devicephoto, contact, mEndpoints, mContext, photouploadlistener);
    }

    public PhotoResponse getProducts()
        throws IOException
    {
        if (isMocked())
        {
            return MockedProductsResponse.createWithDelay(mContext, 500L);
        } else
        {
            return PhotoNetworkServices.get(mContext).get(mEndpoints.productsEndpoint());
        }
    }

    public PhotoResponse getStoreAvailability(String s)
        throws IOException
    {
        if (isMocked())
        {
            return MockedStoreStatusResponse.createWithDelay(500L, s);
        } else
        {
            return PhotoNetworkServices.get(mContext).get(mEndpoints.storeAvailabilityEndpoint(s));
        }
    }

    public boolean isMocked()
    {
        boolean flag;
        if (mEndpoints.getBlixtServerBase() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            PhotoLogger.get().d(TAG, "--> Network is mocked <--");
        }
        return flag;
    }

    public PhotoResponse placeOrder(PendingOrder pendingorder)
        throws IOException, OrderSerializationException, com.walmartlabs.android.photo.util.PhotoDigest.DigestException
    {
        pendingorder = DomainMapper.get(mContext).mapWirePendingOrderFromPendingOrder(pendingorder);
        if (pendingorder != null)
        {
            if (isMocked())
            {
                return MockedOrderResponse.createWithDelay(10000L);
            } else
            {
                return PhotoNetworkServices.get(mContext).postJSON(mEndpoints.ordersEndpoint(), pendingorder);
            }
        } else
        {
            throw new OrderSerializationException("Failed to map domain to wire");
        }
    }

    public PhotoResponse verifyAuthentication()
        throws IOException
    {
        if (isMocked())
        {
            return MockedAuthenticationResponse.createWithDelay(1000L);
        } else
        {
            return PhotoNetworkServices.get(mContext).get(mEndpoints.authenticationEndpoint());
        }
    }

}
