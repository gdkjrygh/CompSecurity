// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.os.AsyncTask;
import com.walmartlabs.android.photo.model.DomainMapper;
import com.walmartlabs.android.photo.model.store.StoreStatus;
import com.walmartlabs.android.photo.model.wire.WireStoreStatus;
import com.walmartlabs.android.photo.net.PhotoClient;
import com.walmartlabs.android.photo.net.PhotoResponse;
import com.walmartlabs.android.photo.service.order.OrderService;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.android.photo.util.integration.AppIntegrationFactory;
import com.walmartlabs.android.photo.view.PhotoDialogFactory;
import java.io.IOException;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ContactAndStoreFragment

private class <init> extends AsyncTask
{

    private final String TAG;
    private boolean mAlreadyProcessingOrder;
    private boolean mAuthVerificationNeeded;
    private boolean mAuthenticated;
    private boolean mInternetAvailable;
    private Dialog mProgressDialog;
    private boolean mServersReachable;
    private boolean mServiceUnavailable;
    private boolean mStoreOnline;
    final ContactAndStoreFragment this$0;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient Void doInBackground(String as[])
    {
        Object obj;
        obj = PhotoClient.get(getActivity());
        mInternetAvailable = ((PhotoClient) (obj)).checkConnectivity();
        mServersReachable = ((PhotoClient) (obj)).checkBlixtConnectivity();
        mAlreadyProcessingOrder = OrderService.isProcessingOrder();
        PhotoResponse photoresponse = ((PhotoClient) (obj)).verifyAuthentication();
        boolean flag;
        if (photoresponse.getStatus() == 200)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mAuthenticated = flag;
        if (photoresponse.getStatus() == 503)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            mServiceUnavailable = flag;
        }
        catch (IOException ioexception)
        {
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("IOException: ").append(ioexception).toString());
            mInternetAvailable = false;
        }
        if (as == null || as.length != 1) goto _L2; else goto _L1
_L1:
        obj = ((PhotoClient) (obj)).getStoreAvailability(as[0]);
        if (((PhotoResponse) (obj)).getStatus() != 200 || ((PhotoResponse) (obj)).getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        as = DomainMapper.get(getActivity()).mapStoreStatusFromWireStoreStatus((WireStoreStatus)PhotoObjectMapper.get().readFromString(((PhotoResponse) (obj)).getEntity(), com/walmartlabs/android/photo/model/wire/WireStoreStatus));
        if (as == null) goto _L4; else goto _L3
_L3:
        if (!as.isOnline()) goto _L4; else goto _L5
_L5:
        flag = true;
_L6:
        try
        {
            mStoreOnline = flag;
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("IOException: ").append(as).toString());
            mInternetAvailable = false;
        }
_L2:
        return null;
_L4:
        flag = false;
          goto _L6
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Store seems to be offline: ").append(as[0]).toString());
          goto _L2
    }

    protected void onCancelled()
    {
        PhotoLogger.get().d(TAG, "Task cancelled, will not proceed with order");
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Void)obj);
    }

    protected void onPostExecute(Void void1)
    {
        long l = AppIntegrationFactory.create(getActivity()).getLastLoginTime();
        boolean flag;
        if (System.currentTimeMillis() - l > 0x1b7740L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mAuthVerificationNeeded = flag;
        if (!mInternetAvailable || !mServersReachable || mAlreadyProcessingOrder || !mAuthenticated || mServiceUnavailable || !mStoreOnline || mAuthVerificationNeeded) goto _L2; else goto _L1
_L1:
        ContactAndStoreFragment.access$600(ContactAndStoreFragment.this);
_L4:
        if (mProgressDialog != null && mProgressDialog.isShowing())
        {
            mProgressDialog.dismiss();
        }
        return;
_L2:
        if (!mInternetAvailable)
        {
            ContactAndStoreFragment.access$200(ContactAndStoreFragment.this, getString(com.walmartlabs.android.photo.erviceTask.this._fld0), getString(com.walmartlabs.android.photo.erviceTask.this._fld0));
        } else
        if (!mServersReachable)
        {
            ContactAndStoreFragment.access$200(ContactAndStoreFragment.this, getString(com.walmartlabs.android.photo.erviceTask.this._fld0), getString(com.walmartlabs.android.photo.erviceTask.this._fld0));
        } else
        if (mServiceUnavailable)
        {
            ContactAndStoreFragment.access$200(ContactAndStoreFragment.this, getString(com.walmartlabs.android.photo.erviceTask.this._fld0), getString(com.walmartlabs.android.photo.erviceTask.this._fld0));
        } else
        if (!mStoreOnline)
        {
            ContactAndStoreFragment.access$200(ContactAndStoreFragment.this, getString(com.walmartlabs.android.photo.erviceTask.this._fld0), getString(com.walmartlabs.android.photo.erviceTask.this._fld0));
        } else
        if (mAlreadyProcessingOrder)
        {
            ContactAndStoreFragment.access$200(ContactAndStoreFragment.this, getString(com.walmartlabs.android.photo.erviceTask.this._fld0), getString(com.walmartlabs.android.photo.erviceTask.this._fld0));
        } else
        if (!mAuthenticated)
        {
            ContactAndStoreFragment.access$400(ContactAndStoreFragment.this, 6002);
        } else
        if (mAuthVerificationNeeded)
        {
            ContactAndStoreFragment.access$400(ContactAndStoreFragment.this, 6002);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onPreExecute()
    {
        mProgressDialog = PhotoDialogFactory.createProgressOnlyDialog(getActivity());
        mProgressDialog.show();
    }

    private ()
    {
        this$0 = ContactAndStoreFragment.this;
        super();
        TAG = com/walmartlabs/android/photo/controller/ContactAndStoreFragment$VerifyConnectivityAndSendOrderToServiceTask.getSimpleName();
    }

    TAG(TAG tag)
    {
        this();
    }
}
