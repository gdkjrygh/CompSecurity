// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.googleplay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.gau.go.launcherex.gowidget.googleplay:
//            Purchase, IabException, IabResult, Security, 
//            Inventory, SkuDetails

public class IabHelper
{

    public static final int BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE = 3;
    public static final int BILLING_RESPONSE_RESULT_DEVELOPER_ERROR = 5;
    public static final int BILLING_RESPONSE_RESULT_ERROR = 6;
    public static final int BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED = 7;
    public static final int BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED = 8;
    public static final int BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE = 4;
    public static final int BILLING_RESPONSE_RESULT_OK = 0;
    public static final int BILLING_RESPONSE_RESULT_USER_CANCELED = 1;
    public static final String GET_SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    public static final String GET_SKU_DETAILS_ITEM_TYPE_LIST = "ITEM_TYPE_LIST";
    public static final int IABHELPER_BAD_RESPONSE = -1002;
    public static final int IABHELPER_ERROR_BASE = -1000;
    public static final int IABHELPER_INVALID_CONSUMPTION = -1010;
    public static final int IABHELPER_MISSING_TOKEN = -1007;
    public static final int IABHELPER_REMOTE_EXCEPTION = -1001;
    public static final int IABHELPER_SEND_INTENT_FAILED = -1004;
    public static final int IABHELPER_SUBSCRIPTIONS_NOT_AVAILABLE = -1009;
    public static final int IABHELPER_UNKNOWN_ERROR = -1008;
    public static final int IABHELPER_UNKNOWN_PURCHASE_RESPONSE = -1006;
    public static final int IABHELPER_USER_CANCELLED = -1005;
    public static final int IABHELPER_VERIFICATION_FAILED = -1003;
    public static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static final String ITEM_TYPE_INAPP = "inapp";
    public static final String ITEM_TYPE_SUBS = "subs";
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_GET_SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String RESPONSE_INAPP_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
    public static final String RESPONSE_INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    public static final String RESPONSE_INAPP_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_INAPP_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    volatile boolean mAsyncInProgress;
    String mAsyncOperation;
    final Context mContext;
    boolean mDebugLog;
    String mDebugTag;
    volatile boolean mDisposed;
    OnIabPurchaseFinishedListener mPurchaseListener;
    String mPurchasingItemType;
    int mRequestCode;
    volatile IInAppBillingService mService;
    volatile ServiceConnection mServiceConn;
    volatile boolean mSetupDone;
    String mSignatureBase64;
    boolean mSubscriptionsSupported;

    public IabHelper(Context context, String s)
    {
        mDebugLog = false;
        mDebugTag = "IabHelper";
        mSetupDone = false;
        mDisposed = false;
        mSubscriptionsSupported = false;
        mAsyncInProgress = false;
        mAsyncOperation = "";
        mSignatureBase64 = null;
        mContext = context.getApplicationContext();
        mSignatureBase64 = s;
        logDebug("IAB helper created.");
    }

    private void checkNotDisposed()
    {
        if (mDisposed)
        {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        } else
        {
            return;
        }
    }

    public static String getResponseDesc(int i)
    {
        String as[] = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String as1[] = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i <= -1000)
        {
            int j = -1000 - i;
            if (j >= 0 && j < as1.length)
            {
                return as1[j];
            } else
            {
                return (new StringBuilder()).append(String.valueOf(i)).append(":Unknown IAB Helper Error").toString();
            }
        }
        if (i < 0 || i >= as.length)
        {
            return (new StringBuilder()).append(String.valueOf(i)).append(":Unknown").toString();
        } else
        {
            return as[i];
        }
    }

    void checkSetupDone(String s)
    {
        if (!mSetupDone)
        {
            logError((new StringBuilder()).append("Illegal state for operation (").append(s).append("): IAB helper is not set up.").toString());
            throw new IllegalStateException((new StringBuilder()).append("IAB helper is not set up. Can't perform operation: ").append(s).toString());
        } else
        {
            return;
        }
    }

    void consume(Purchase purchase)
    {
        Object obj;
        String s;
        checkNotDisposed();
        checkSetupDone("consume");
        if (!purchase.mItemType.equals("inapp"))
        {
            throw new IabException(-1010, (new StringBuilder()).append("Items of type '").append(purchase.mItemType).append("' can't be consumed.").toString());
        }
        try
        {
            obj = purchase.getToken();
            s = purchase.getSku();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IabException(-1001, (new StringBuilder()).append("Remote exception while consuming. PurchaseInfo: ").append(purchase).toString(), ((Exception) (obj)));
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (!((String) (obj)).equals(""))
        {
            break MISSING_BLOCK_LABEL_182;
        }
        logError((new StringBuilder()).append("Can't consume ").append(s).append(". No token.").toString());
        throw new IabException(-1007, (new StringBuilder()).append("PurchaseInfo is missing token for sku: ").append(s).append(" ").append(purchase).toString());
        int i;
        logDebug((new StringBuilder()).append("Consuming sku: ").append(s).append(", token: ").append(((String) (obj))).toString());
        i = mService.consumePurchase(3, mContext.getPackageName(), ((String) (obj)));
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_263;
        }
        logDebug((new StringBuilder()).append("Successfully consumed sku: ").append(s).toString());
        return;
        logDebug((new StringBuilder()).append("Error consuming consuming sku ").append(s).append(". ").append(getResponseDesc(i)).toString());
        throw new IabException(i, (new StringBuilder()).append("Error consuming sku ").append(s).toString());
    }

    public void consumeAsync(Purchase purchase, OnConsumeFinishedListener onconsumefinishedlistener)
    {
        checkNotDisposed();
        checkSetupDone("consume");
        ArrayList arraylist = new ArrayList();
        arraylist.add(purchase);
        consumeAsyncInternal(arraylist, onconsumefinishedlistener, null);
    }

    public void consumeAsync(List list, OnConsumeMultiFinishedListener onconsumemultifinishedlistener)
    {
        checkNotDisposed();
        checkSetupDone("consume");
        consumeAsyncInternal(list, null, onconsumemultifinishedlistener);
    }

    void consumeAsyncInternal(final List purchases, final OnConsumeFinishedListener singleListener, final OnConsumeMultiFinishedListener multiListener)
    {
        final Handler handler = new Handler();
        flagStartAsync("consume");
        (new Thread(new _cls3())).start();
    }

    public void dispose()
    {
        logDebug("Disposing.");
        mSetupDone = false;
        if (mServiceConn != null)
        {
            logDebug("Unbinding from service.");
            try
            {
                if (mContext != null)
                {
                    mContext.unbindService(mServiceConn);
                }
            }
            catch (Exception exception1) { }
            finally
            {
                throw exception;
            }
        }
        mDisposed = true;
        mServiceConn = null;
        mService = null;
        mPurchaseListener = null;
    }

    public void enableDebugLogging(boolean flag)
    {
        checkNotDisposed();
        mDebugLog = flag;
    }

    public void enableDebugLogging(boolean flag, String s)
    {
        checkNotDisposed();
        mDebugLog = flag;
        mDebugTag = s;
    }

    void flagEndAsync()
    {
        logDebug((new StringBuilder()).append("Ending async operation: ").append(mAsyncOperation).toString());
        mAsyncOperation = "";
        mAsyncInProgress = false;
    }

    void flagStartAsync(String s)
    {
        if (mAsyncInProgress)
        {
            throw new IllegalStateException((new StringBuilder()).append("Can't start async operation (").append(s).append(") because another async operation(").append(mAsyncOperation).append(") is in progress.").toString());
        } else
        {
            mAsyncOperation = s;
            mAsyncInProgress = true;
            logDebug((new StringBuilder()).append("Starting async operation: ").append(s).toString());
            return;
        }
    }

    int getResponseCodeFromBundle(Bundle bundle)
    {
        bundle = ((Bundle) (bundle.get("RESPONSE_CODE")));
        if (bundle == null)
        {
            logDebug("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (bundle instanceof Integer)
        {
            return ((Integer)bundle).intValue();
        }
        if (bundle instanceof Long)
        {
            return (int)((Long)bundle).longValue();
        } else
        {
            logError("Unexpected type for bundle response code.");
            logError(bundle.getClass().getName());
            throw new RuntimeException((new StringBuilder()).append("Unexpected type for bundle response code: ").append(bundle.getClass().getName()).toString());
        }
    }

    int getResponseCodeFromIntent(Intent intent)
    {
        intent = ((Intent) (intent.getExtras().get("RESPONSE_CODE")));
        if (intent == null)
        {
            logError("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (intent instanceof Integer)
        {
            return ((Integer)intent).intValue();
        }
        if (intent instanceof Long)
        {
            return (int)((Long)intent).longValue();
        } else
        {
            logError("Unexpected type for intent response code.");
            logError(intent.getClass().getName());
            throw new RuntimeException((new StringBuilder()).append("Unexpected type for intent response code: ").append(intent.getClass().getName()).toString());
        }
    }

    public boolean handleActivityResult(int i, int j, Intent intent)
    {
        String s;
        String s1;
        if (i != mRequestCode)
        {
            return false;
        }
        checkNotDisposed();
        checkSetupDone("handleActivityResult");
        flagEndAsync();
        if (intent == null)
        {
            logError("Null data in IAB activity result.");
            intent = new IabResult(-1002, "Null data in IAB result");
            if (mPurchaseListener != null)
            {
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            }
            return true;
        }
        i = getResponseCodeFromIntent(intent);
        s = intent.getStringExtra("INAPP_PURCHASE_DATA");
        s1 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (j != -1 || i != 0) goto _L2; else goto _L1
_L1:
        logDebug("Successful resultcode from purchase activity.");
        logDebug((new StringBuilder()).append("Purchase data: ").append(s).toString());
        logDebug((new StringBuilder()).append("Data signature: ").append(s1).toString());
        logDebug((new StringBuilder()).append("Extras: ").append(intent.getExtras()).toString());
        logDebug((new StringBuilder()).append("Expected item type: ").append(mPurchasingItemType).toString());
        if (s == null || s1 == null)
        {
            logError("BUG: either purchaseData or dataSignature is null.");
            logDebug((new StringBuilder()).append("Extras: ").append(intent.getExtras().toString()).toString());
            intent = new IabResult(-1008, "IAB returned null purchaseData or dataSignature");
            if (mPurchaseListener != null)
            {
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            }
            return true;
        }
        String s2;
        intent = new Purchase(mPurchasingItemType, s, s1);
        s2 = intent.getSku();
        if (Security.verifyPurchase(mSignatureBase64, s, s1)) goto _L4; else goto _L3
_L3:
        logError((new StringBuilder()).append("Purchase signature verification FAILED for sku ").append(s2).toString());
        IabResult iabresult = new IabResult(-1003, (new StringBuilder()).append("Signature verification failed for sku ").append(s2).toString());
        if (mPurchaseListener != null)
        {
            mPurchaseListener.onIabPurchaseFinished(iabresult, intent);
        }
          goto _L5
_L4:
        try
        {
            logDebug("Purchase signature successfully verified.");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            logError("Failed to parse purchase data.");
            intent.printStackTrace();
            intent = new IabResult(-1002, "Failed to parse purchase data.");
            if (mPurchaseListener != null)
            {
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            }
            return true;
        }
        if (mPurchaseListener != null)
        {
            mPurchaseListener.onIabPurchaseFinished(new IabResult(0, "Success"), intent);
        }
_L6:
        return true;
_L2:
        if (j == -1)
        {
            logDebug((new StringBuilder()).append("Result code was OK but in-app billing response was not OK: ").append(getResponseDesc(i)).toString());
            if (mPurchaseListener != null)
            {
                intent = new IabResult(i, "Problem purchashing item.");
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            }
        } else
        if (j == 0)
        {
            logDebug((new StringBuilder()).append("Purchase canceled - Response: ").append(getResponseDesc(i)).toString());
            intent = new IabResult(-1005, "User canceled.");
            if (mPurchaseListener != null)
            {
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            }
        } else
        {
            logError((new StringBuilder()).append("Purchase failed. Result code: ").append(Integer.toString(j)).append(". Response: ").append(getResponseDesc(i)).toString());
            intent = new IabResult(-1006, "Unknown purchase response.");
            if (mPurchaseListener != null)
            {
                mPurchaseListener.onIabPurchaseFinished(intent, null);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        return true;
    }

    public boolean isDisposed()
    {
        return mDisposed;
    }

    public void launchPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener)
    {
        launchPurchaseFlow(activity, s, i, oniabpurchasefinishedlistener, "");
    }

    public void launchPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener, String s1)
    {
        launchPurchaseFlow(activity, s, "inapp", i, oniabpurchasefinishedlistener, s1);
    }

    public void launchPurchaseFlow(Activity activity, String s, String s1, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener, String s2)
    {
        checkNotDisposed();
        checkSetupDone("launchPurchaseFlow");
        flagStartAsync("launchPurchaseFlow");
        if (!s1.equals("subs") || mSubscriptionsSupported) goto _L2; else goto _L1
_L1:
        activity = new IabResult(-1009, "Subscriptions are not available.");
        flagEndAsync();
        if (oniabpurchasefinishedlistener != null)
        {
            oniabpurchasefinishedlistener.onIabPurchaseFinished(activity, null);
        }
_L4:
        return;
_L2:
        int j;
        logDebug((new StringBuilder()).append("Constructing buy intent for ").append(s).append(", item type: ").append(s1).toString());
        s2 = mService.getBuyIntent(3, mContext.getPackageName(), s, s1, s2);
        j = getResponseCodeFromBundle(s2);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        logError((new StringBuilder()).append("Unable to buy item, Error response: ").append(getResponseDesc(j)).toString());
        flagEndAsync();
        activity = new IabResult(j, "Unable to buy item");
        if (oniabpurchasefinishedlistener != null)
        {
            try
            {
                oniabpurchasefinishedlistener.onIabPurchaseFinished(activity, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                logError((new StringBuilder()).append("SendIntentException while launching purchase flow for sku ").append(s).toString());
                activity.printStackTrace();
                flagEndAsync();
                activity = new IabResult(-1004, "Failed to send intent.");
                if (oniabpurchasefinishedlistener != null)
                {
                    oniabpurchasefinishedlistener.onIabPurchaseFinished(activity, null);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                logError((new StringBuilder()).append("RemoteException while launching purchase flow for sku ").append(s).toString());
                activity.printStackTrace();
                flagEndAsync();
                activity = new IabResult(-1001, "Remote exception while starting purchase flow");
                if (oniabpurchasefinishedlistener != null)
                {
                    oniabpurchasefinishedlistener.onIabPurchaseFinished(activity, null);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Activity activity)
            {
                logError((new StringBuilder()).append("Exception while launching purchase flow for sku ").append(s).toString());
                activity.printStackTrace();
                flagEndAsync();
                activity = new IabResult(-1001, "exception while starting purchase flow");
                if (oniabpurchasefinishedlistener != null)
                {
                    oniabpurchasefinishedlistener.onIabPurchaseFinished(activity, null);
                    return;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        s2 = (PendingIntent)s2.getParcelable("BUY_INTENT");
        logDebug((new StringBuilder()).append("Launching buy intent for ").append(s).append(". Request code: ").append(i).toString());
        mRequestCode = i;
        mPurchaseListener = oniabpurchasefinishedlistener;
        mPurchasingItemType = s1;
        activity.startIntentSenderForResult(s2.getIntentSender(), i, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void launchSubscriptionPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener)
    {
        launchSubscriptionPurchaseFlow(activity, s, i, oniabpurchasefinishedlistener, "");
    }

    public void launchSubscriptionPurchaseFlow(Activity activity, String s, int i, OnIabPurchaseFinishedListener oniabpurchasefinishedlistener, String s1)
    {
        launchPurchaseFlow(activity, s, "subs", i, oniabpurchasefinishedlistener, s1);
    }

    public void logDebug(String s)
    {
        if (mDebugLog)
        {
            Log.d(mDebugTag, s);
        }
    }

    public void logError(String s)
    {
        Log.e(mDebugTag, (new StringBuilder()).append("In-app billing error: ").append(s).toString());
    }

    public void logWarn(String s)
    {
        Log.w(mDebugTag, (new StringBuilder()).append("In-app billing warning: ").append(s).toString());
    }

    public Inventory queryInventory(boolean flag, List list)
    {
        return queryInventory(flag, list, null);
    }

    public Inventory queryInventory(boolean flag, List list, List list1)
    {
        checkNotDisposed();
        checkSetupDone("queryInventory");
        int i;
        try
        {
            list1 = new Inventory();
            i = queryPurchases(list1, "inapp");
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IabException(-1001, "Remote exception while refreshing inventory.", list);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new IabException(-1002, "Error parsing JSON response while refreshing inventory.", list);
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        throw new IabException(i, "Error refreshing inventory (querying owned items).");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        i = querySkuDetails("inapp", list1, list);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        throw new IabException(i, "Error refreshing inventory (querying prices of items).");
        int j;
        if (!mSubscriptionsSupported)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        j = queryPurchases(list1, "subs");
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        throw new IabException(j, "Error refreshing inventory (querying owned subscriptions).");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        j = querySkuDetails("subs", list1, list);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        throw new IabException(j, "Error refreshing inventory (querying prices of subscriptions).");
        return list1;
    }

    public void queryInventoryAsync(QueryInventoryFinishedListener queryinventoryfinishedlistener)
    {
        queryInventoryAsync(true, null, queryinventoryfinishedlistener);
    }

    public void queryInventoryAsync(boolean flag, QueryInventoryFinishedListener queryinventoryfinishedlistener)
    {
        queryInventoryAsync(flag, null, queryinventoryfinishedlistener);
    }

    public void queryInventoryAsync(final boolean querySkuDetails, final List moreSkus, final QueryInventoryFinishedListener listener)
    {
        final Handler handler = new Handler();
        checkNotDisposed();
        checkSetupDone("queryInventory");
        flagStartAsync("refresh inventory");
        (new Thread(new _cls2())).start();
    }

    int queryPurchases(Inventory inventory, String s)
    {
        if (mContext != null)
        {
            logDebug((new StringBuilder()).append("Querying owned items, item type: ").append(s).toString());
            logDebug((new StringBuilder()).append("Package name: ").append(mContext.getPackageName()).toString());
        }
        boolean flag = false;
        Object obj = null;
        do
        {
            logDebug((new StringBuilder()).append("Calling getPurchases with continuation token: ").append(((String) (obj))).toString());
            if (mService == null)
            {
                return -1003;
            }
            obj = mService.getPurchases(3, mContext.getPackageName(), s, ((String) (obj)));
            if (obj == null)
            {
                return -1002;
            }
            int i = getResponseCodeFromBundle(((Bundle) (obj)));
            logDebug((new StringBuilder()).append("Owned items response: ").append(String.valueOf(i)).toString());
            if (i != 0)
            {
                logDebug((new StringBuilder()).append("getPurchases() failed: ").append(getResponseDesc(i)).toString());
                return i;
            }
            if (!((Bundle) (obj)).containsKey("INAPP_PURCHASE_ITEM_LIST") || !((Bundle) (obj)).containsKey("INAPP_PURCHASE_DATA_LIST") || !((Bundle) (obj)).containsKey("INAPP_DATA_SIGNATURE_LIST"))
            {
                logError("Bundle returned from getPurchases() doesn't contain required fields.");
                return -1002;
            }
            ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList arraylist2 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            i = 0;
            while (i < arraylist1.size()) 
            {
                String s1 = (String)arraylist1.get(i);
                Object obj1 = (String)arraylist2.get(i);
                String s2 = (String)arraylist.get(i);
                if (Security.verifyPurchase(mSignatureBase64, s1, ((String) (obj1))))
                {
                    logDebug((new StringBuilder()).append("Sku is owned: ").append(s2).toString());
                    obj1 = new Purchase(s, s1, ((String) (obj1)));
                    if (TextUtils.isEmpty(((Purchase) (obj1)).getToken()))
                    {
                        logWarn("BUG: empty/null token!");
                        logDebug((new StringBuilder()).append("Purchase data: ").append(s1).toString());
                    }
                    inventory.addPurchase(((Purchase) (obj1)));
                } else
                {
                    logWarn("Purchase signature verification **FAILED**. Not adding item.");
                    logDebug((new StringBuilder()).append("   Purchase data: ").append(s1).toString());
                    logDebug((new StringBuilder()).append("   Signature: ").append(((String) (obj1))).toString());
                    flag = true;
                }
                i++;
            }
            obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
            logDebug((new StringBuilder()).append("Continuation token: ").append(((String) (obj))).toString());
        } while (!TextUtils.isEmpty(((CharSequence) (obj))));
        return !flag ? 0 : -1003;
    }

    int querySkuDetails(String s, Inventory inventory, List list)
    {
        logDebug("Querying SKU details.");
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(inventory.getAllOwnedSkus(s));
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                String s1 = (String)list.next();
                if (!arraylist.contains(s1))
                {
                    arraylist.add(s1);
                }
            } while (true);
        }
        if (arraylist.size() == 0)
        {
            logDebug("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        list = new Bundle();
        list.putStringArrayList("ITEM_ID_LIST", arraylist);
        if (mService == null)
        {
            return -1002;
        }
        list = mService.getSkuDetails(3, mContext.getPackageName(), s, list);
        if (list != null)
        {
            if (!list.containsKey("DETAILS_LIST"))
            {
                int i = getResponseCodeFromBundle(list);
                if (i != 0)
                {
                    logDebug((new StringBuilder()).append("getSkuDetails() failed: ").append(getResponseDesc(i)).toString());
                    return i;
                } else
                {
                    logError("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return -1002;
                }
            }
            list = list.getStringArrayList("DETAILS_LIST");
            if (list != null)
            {
                SkuDetails skudetails;
                for (list = list.iterator(); list.hasNext(); inventory.addSkuDetails(skudetails))
                {
                    skudetails = new SkuDetails(s, (String)list.next());
                    logDebug((new StringBuilder()).append("Got sku details: ").append(skudetails).toString());
                }

            } else
            {
                return -1002;
            }
        } else
        {
            return -1002;
        }
        return 0;
    }

    public void startSetup(final OnIabSetupFinishedListener listener)
    {
        checkNotDisposed();
        if (mSetupDone)
        {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        logDebug("Starting in-app billing setup.");
        mServiceConn = new _cls1();
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        if (!mContext.getPackageManager().queryIntentServices(intent, 0).isEmpty())
        {
            mContext.bindService(intent, mServiceConn, 1);
        } else
        if (listener != null)
        {
            listener.onIabSetupFinished(new IabResult(3, "Billing service unavailable on device."));
            return;
        }
    }

    public boolean subscriptionsSupported()
    {
        checkNotDisposed();
        return mSubscriptionsSupported;
    }

    private class _cls3
        implements Runnable
    {

        final IabHelper this$0;
        final Handler val$handler;
        final OnConsumeMultiFinishedListener val$multiListener;
        final List val$purchases;
        final OnConsumeFinishedListener val$singleListener;

        public void run()
        {
            final ArrayList results = new ArrayList();
            for (Iterator iterator = purchases.iterator(); iterator.hasNext();)
            {
                Purchase purchase = (Purchase)iterator.next();
                try
                {
                    consume(purchase);
                    results.add(new IabResult(0, (new StringBuilder()).append("Successful consume of sku ").append(purchase.getSku()).toString()));
                }
                catch (IabException iabexception)
                {
                    results.add(iabexception.getResult());
                }
            }

            flagEndAsync();
            class _cls1
                implements Runnable
            {

                final _cls3 this$1;
                final List val$results;

                public void run()
                {
                    singleListener.onConsumeFinished((Purchase)purchases.get(0), (IabResult)results.get(0));
                }

                _cls1()
                {
                    this$1 = _cls3.this;
                    results = list;
                    super();
                }

                private class OnConsumeFinishedListener
                {

                    public abstract void onConsumeFinished(Purchase purchase, IabResult iabresult);
                }

            }

            if (!mDisposed && singleListener != null)
            {
                handler.post(new _cls1());
            }
            class _cls2
                implements Runnable
            {

                final _cls3 this$1;
                final List val$results;

                public void run()
                {
                    multiListener.onConsumeMultiFinished(purchases, results);
                }

                _cls2()
                {
                    this$1 = _cls3.this;
                    results = list;
                    super();
                }

                private class OnConsumeMultiFinishedListener
                {

                    public abstract void onConsumeMultiFinished(List list, List list1);
                }

            }

            if (!mDisposed && multiListener != null)
            {
                handler.post(new _cls2());
            }
        }

        _cls3()
        {
            this$0 = IabHelper.this;
            purchases = list;
            singleListener = onconsumefinishedlistener;
            handler = handler1;
            multiListener = onconsumemultifinishedlistener;
            super();
        }
    }


    private class OnIabPurchaseFinishedListener
    {

        public abstract void onIabPurchaseFinished(IabResult iabresult, Purchase purchase);
    }


    private class _cls2
        implements Runnable
    {

        final IabHelper this$0;
        final Handler val$handler;
        final QueryInventoryFinishedListener val$listener;
        final List val$moreSkus;
        final boolean val$querySkuDetails;

        public void run()
        {
            final Inventory inv_f;
            final IabResult result_f;
            result_f = new IabResult(0, "Inventory refresh successful.");
            inv_f = null;
            Inventory inventory = queryInventory(querySkuDetails, moreSkus);
            inv_f = inventory;
_L2:
            flagEndAsync();
            class _cls1
                implements Runnable
            {

                final _cls2 this$1;
                final Inventory val$inv_f;
                final IabResult val$result_f;

                public void run()
                {
                    listener.onQueryInventoryFinished(result_f, inv_f);
                }

                _cls1()
                {
                    this$1 = _cls2.this;
                    result_f = iabresult;
                    inv_f = inventory;
                    super();
                }

                private class QueryInventoryFinishedListener
                {

                    public abstract void onQueryInventoryFinished(IabResult iabresult, Inventory inventory);
                }

            }

            if (!mDisposed && listener != null)
            {
                handler.post(new _cls1());
            }
            return;
            IabException iabexception;
            iabexception;
            iabexception = iabexception.getResult();
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls2()
        {
            this$0 = IabHelper.this;
            querySkuDetails = flag;
            moreSkus = list;
            listener = queryinventoryfinishedlistener;
            handler = handler1;
            super();
        }
    }


    private class _cls1
        implements ServiceConnection
    {

        final IabHelper this$0;
        final OnIabSetupFinishedListener val$listener;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            if (!mDisposed) goto _L2; else goto _L1
_L1:
            return;
_L2:
            logDebug("Billing service connected.");
            mService = com.android.vending.billing.IInAppBillingService.Stub.asInterface(ibinder);
            componentname = mContext.getPackageName();
            int i;
            logDebug("Checking for in-app billing 3 support.");
            i = mService.isBillingSupported(3, componentname, "inapp");
            if (i != 0)
            {
                try
                {
                    if (listener != null)
                    {
                        listener.onIabSetupFinished(new IabResult(i, "Error checking for billing v3 support."));
                    }
                    mSubscriptionsSupported = false;
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ComponentName componentname) { }
                if (listener != null)
                {
                    listener.onIabSetupFinished(new IabResult(-1001, "RemoteException while setting up in-app billing."));
                }
                componentname.printStackTrace();
                return;
            }
            logDebug((new StringBuilder()).append("In-app billing version 3 supported for ").append(componentname).toString());
            i = mService.isBillingSupported(3, componentname, "subs");
            if (i != 0)
            {
                break MISSING_BLOCK_LABEL_240;
            }
            logDebug("Subscriptions AVAILABLE.");
            mSubscriptionsSupported = true;
_L4:
            mSetupDone = true;
            if (listener == null) goto _L1; else goto _L3
_L3:
            listener.onIabSetupFinished(new IabResult(0, "Setup successful."));
            return;
            logDebug((new StringBuilder()).append("Subscriptions NOT AVAILABLE. Response: ").append(i).toString());
              goto _L4
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            logDebug("Billing service disconnected.");
            mService = null;
        }

        _cls1()
        {
            this$0 = IabHelper.this;
            listener = oniabsetupfinishedlistener;
            super();
        }
    }


    private class OnIabSetupFinishedListener
    {

        public abstract void onIabSetupFinished(IabResult iabresult);
    }

}
