// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.content.Context;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettings;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettingsUtils;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            EndpointsProvider

public class V1EndpointsProvider
    implements EndpointsProvider
{

    private static final String PRODUCTION_SERVER = "https://photos.mobile.walmart.com";
    private static final String STAGING_SERVER = "https://photos-s1.mobile.walmart.com";
    private static final String STAGING_SERVER_2 = "https://photos-s2.mobile.walmart.com";
    private static final String TAG = com/walmartlabs/android/photo/net/V1EndpointsProvider.getSimpleName();
    private Context mContext;

    public V1EndpointsProvider(Context context)
    {
        mContext = context;
    }

    private String getSelectedDebugServer()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (PhotoDebugSettings.get(mContext).getDebugServerType() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (PhotoDebugSettings.get(mContext).getDebugServerType() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (PhotoDebugSettings.get(mContext).getDebugServerType() == 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag)
        {
            return "https://photos-s1.mobile.walmart.com";
        }
        if (flag1)
        {
            return "https://photos-s2.mobile.walmart.com";
        }
        if (flag2)
        {
            return null;
        } else
        {
            return "https://photos.mobile.walmart.com";
        }
    }

    public String authenticationEndpoint()
    {
        return (new StringBuilder()).append(getBlixtServerBase()).append("/v1/authentication").toString();
    }

    public String getBlixtServerBase()
    {
        if (PhotoDebugSettingsUtils.isDebugMode(mContext))
        {
            String s = getSelectedDebugServer();
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("DEBUG MODE - Using server: ").append(s).toString());
            return s;
        } else
        {
            return "https://photos.mobile.walmart.com";
        }
    }

    public String ordersEndpoint()
    {
        return (new StringBuilder()).append(getBlixtServerBase()).append("/v1/orders").toString();
    }

    public String photoEndpoint(String s)
    {
        return (new StringBuilder()).append(getBlixtServerBase()).append("/v1/photos/").append(s).toString();
    }

    public String photosEndpoint()
    {
        return (new StringBuilder()).append(getBlixtServerBase()).append("/v1/photos").toString();
    }

    public String productsEndpoint()
    {
        return (new StringBuilder()).append(getBlixtServerBase()).append("/v1/products").toString();
    }

    public String storeAvailabilityEndpoint(String s)
    {
        return (new StringBuilder()).append(getBlixtServerBase()).append("/v1/store-times?store-number=").append(s).toString();
    }

}
