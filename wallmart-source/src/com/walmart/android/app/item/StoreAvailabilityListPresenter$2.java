// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Dialog;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.walmart.android.app.item:
//            StoreAvailabilityListPresenter, StoreAvailabilityListAdapter

class this._cls0
    implements eAvailabilityListener
{

    final StoreAvailabilityListPresenter this$0;

    public void onEmptyStoreAvailabilityResponse()
    {
        if (!isPopped())
        {
            StoreAvailabilityListPresenter.access$1300(StoreAvailabilityListPresenter.this, 2);
        }
    }

    public void onErrorLoadingStoreAvailability(int i)
    {
        while (isPopped() || StoreAvailabilityListPresenter.access$400(StoreAvailabilityListPresenter.this).getStoreCount() > 0) 
        {
            return;
        }
        if (i == 0x15f92)
        {
            StoreAvailabilityListPresenter.access$500(StoreAvailabilityListPresenter.this, 600);
            return;
        }
        if (i == 10000)
        {
            if (StoreAvailabilityListPresenter.access$600(StoreAvailabilityListPresenter.this) != null)
            {
                StoreAvailabilityListPresenter.access$700(StoreAvailabilityListPresenter.this, 1);
                return;
            } else
            {
                StoreAvailabilityListPresenter.access$800(StoreAvailabilityListPresenter.this, 2);
                return;
            }
        } else
        {
            StoreAvailabilityListPresenter.access$900(StoreAvailabilityListPresenter.this, 900);
            return;
        }
    }

    public void onErrorLoadingStores(int i)
    {
label0:
        {
            if (!isPopped())
            {
                if (i != 0x15f92)
                {
                    break label0;
                }
                StoreAvailabilityListPresenter.access$200(StoreAvailabilityListPresenter.this, 600);
            }
            return;
        }
        StoreAvailabilityListPresenter.access$300(StoreAvailabilityListPresenter.this, 900);
    }

    public void onErrorRequestingLocation(int i)
    {
        if (!isPopped())
        {
            if (i == 3 || i == 1)
            {
                StoreAvailabilityListPresenter.access$1100(StoreAvailabilityListPresenter.this, 102);
            } else
            if (i == 2)
            {
                StoreAvailabilityListPresenter.access$1202(StoreAvailabilityListPresenter.this, true);
                return;
            }
        }
    }

    public void onErrorRequestingLocation(ConnectionResult connectionresult)
    {
        if (isPopped())
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (!connectionresult.hasResolution())
        {
            break MISSING_BLOCK_LABEL_36;
        }
        connectionresult.startResolutionForResult(StoreAvailabilityListPresenter.access$1000(StoreAvailabilityListPresenter.this), 1);
_L1:
        return;
        connectionresult;
        connectionresult.printStackTrace();
        return;
        connectionresult = GooglePlayServicesUtil.getErrorDialog(connectionresult.getErrorCode(), StoreAvailabilityListPresenter.access$1000(StoreAvailabilityListPresenter.this), 1);
        if (connectionresult != null)
        {
            connectionresult.show();
            return;
        }
          goto _L1
    }

    public void onLoadCompleted(boolean flag)
    {
        if (flag)
        {
            StoreAvailabilityListPresenter.access$1400(StoreAvailabilityListPresenter.this).setVisibility(8);
        } else
        if (StoreAvailabilityListPresenter.access$1500(StoreAvailabilityListPresenter.this) && StoreAvailabilityListPresenter.access$000(StoreAvailabilityListPresenter.this) != null)
        {
            onPageView();
            return;
        }
    }

    eAvailabilityListener()
    {
        this$0 = StoreAvailabilityListPresenter.this;
        super();
    }
}
