// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.maps.model.LatLng;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController

private class mLoadUrl extends AsyncTask
{

    private Context mContext;
    private boolean mLoadUrl;
    final BridgeController this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient String doInBackground(Void avoid[])
    {
        String s;
        s = "empty";
        avoid = SharedPreferencesUtil.getSavedLocalAdJsonStore(mContext);
        if (avoid == null || avoid.getAddress() == null || avoid.getAddress().mContext() == null) goto _L2; else goto _L1
_L1:
        avoid = avoid.getAddress().mContext();
_L4:
        return avoid;
_L2:
        Object obj;
        obj = StoreLocationManager.getInstance(mContext).getCurrentLocation();
        avoid = s;
        if (obj == null) goto _L4; else goto _L3
_L3:
        avoid = s;
        if (((LatLng) (obj)).latitude == 0.0D) goto _L4; else goto _L5
_L5:
        avoid = s;
        if (((LatLng) (obj)).longitude == 0.0D) goto _L4; else goto _L6
_L6:
        avoid = new Geocoder(mContext, Locale.US);
        String s1;
        try
        {
            obj = avoid.getFromLocation(((LatLng) (obj)).latitude, ((LatLng) (obj)).longitude, 1);
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            WLog.i(BridgeController.access$100(), "Could not get address from location");
            return "empty";
        }
        avoid = s;
        if (((List) (obj)).isEmpty()) goto _L4; else goto _L7
_L7:
        obj = (Address)((List) (obj)).get(0);
        s1 = ((Address) (obj)).getCountryCode();
        if ("US".equals(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        avoid = s;
        if (!"PR".equals(s1)) goto _L4; else goto _L8
_L8:
        avoid = s;
        if (((Address) (obj)).getPostalCode() == null) goto _L4; else goto _L9
_L9:
        avoid = ((Address) (obj)).getPostalCode();
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((String)obj);
    }

    protected void onPostExecute(String s)
    {
        if (!"empty".equals(s))
        {
            s = (new StringBuilder()).append("DL=").append(s).append("%2C").append("empty").append("%2C").append("empty").append("%2C").append("geo").toString();
            CookieManager.getInstance().setCookie(".walmart.com", s);
            BridgeController.access$2202(BridgeController.this, true);
        }
        if (mLoadUrl && !TextUtils.isEmpty(BridgeController.access$2300(BridgeController.this)))
        {
            BridgeController.access$1500(BridgeController.this, BridgeController.access$700(BridgeController.this), BridgeController.access$2300(BridgeController.this));
        }
    }

    public (boolean flag)
    {
        this$0 = BridgeController.this;
        super();
        mContext = BridgeController.access$1800(BridgeController.this).getApplicationContext();
        mLoadUrl = flag;
    }
}
