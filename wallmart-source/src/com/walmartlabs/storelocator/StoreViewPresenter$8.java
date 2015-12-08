// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import android.app.Dialog;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.model.LatLng;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreViewPresenter, StoreListController, StorePickerListener, StoreSearchManager, 
//            LayoutConfig

class this._cls0
    implements LocationCallback
{

    final StoreViewPresenter this$0;

    public void onError(int i)
    {
        switch (i)
        {
        default:
            StoreViewPresenter.access$1800(StoreViewPresenter.this).hideLoadingIndicator();
            if (StoreViewPresenter.access$1900(StoreViewPresenter.this) != null)
            {
                StoreViewPresenter.access$1900(StoreViewPresenter.this).onCancelled();
            }
            return;

        case 3: // '\003'
            StoreViewPresenter.access$1400(StoreViewPresenter.this);
            showDialog(102);
            return;

        case 2: // '\002'
            StoreViewPresenter.access$1702(StoreViewPresenter.this, true);
            return;
        }
    }

    public void onError(ConnectionResult connectionresult)
    {
        if (StoreViewPresenter.access$1100(StoreViewPresenter.this))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        StoreViewPresenter.access$1400(StoreViewPresenter.this);
        if (!connectionresult.hasResolution())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        connectionresult.startResolutionForResult(StoreViewPresenter.access$1500(StoreViewPresenter.this), 1);
_L1:
        return;
        connectionresult;
        connectionresult.printStackTrace();
        return;
        if (!isPopped() && isTop())
        {
            connectionresult = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), StoreViewPresenter.access$1500(StoreViewPresenter.this), 1);
            if (connectionresult != null)
            {
                connectionresult.show();
            }
            StoreViewPresenter.access$1600(StoreViewPresenter.this);
            return;
        }
          goto _L1
    }

    public void onFoundLocation(LatLng latlng, Location location)
    {
        if (!StoreViewPresenter.access$1100(StoreViewPresenter.this))
        {
            StoreViewPresenter.access$1200(StoreViewPresenter.this, latlng);
            if (StoreViewPresenter.access$1300(StoreViewPresenter.this) != null)
            {
                StoreViewPresenter.access$1300(StoreViewPresenter.this).setLocation(latlng);
            }
        }
    }

    public void onStarted()
    {
        if (!TextUtils.isEmpty(StoreViewPresenter.access$800(StoreViewPresenter.this)))
        {
            ViewUtil.findViewById(StoreViewPresenter.access$900(StoreViewPresenter.this), StoreViewPresenter.access$1000(StoreViewPresenter.this).getIdForViewEnum(.EMPTY_LIST_VIEW)).setVisibility(8);
        }
        showDialog(2);
    }

    ()
    {
        this$0 = StoreViewPresenter.this;
        super();
    }
}
