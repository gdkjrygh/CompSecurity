// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.text.TextUtils;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.utils.WLog;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.service.wishlist:
//            WishListService, ListTransferCompleteEvent, AddBundle, AddItemBase, 
//            CreateWishList, PurchasedItem, UpdateWishList

public class WishListManager
{
    private class CustomCustomerIdCallback
        implements CustomerIdCallback
    {

        private final String mCustomerId;
        final WishListManager this$0;

        public String getCustomerId()
        {
            return mCustomerId;
        }

        public CustomCustomerIdCallback(String s)
        {
            this$0 = WishListManager.this;
            super();
            mCustomerId = s;
        }
    }

    private static interface CustomerIdCallback
    {

        public abstract String getCustomerId();
    }

    private abstract class RequestCallback
        implements com.walmart.android.wmservice.Authentication.AuthCallback
    {

        private final Result mAuthFailedResult;
        private final CallbackSameThread mCallbackSameThread;
        private CustomerIdCallback mCustomerIdCallback;
        final WishListManager this$0;

        protected abstract Request createRequest(String s);

        public void doRequest(String s)
        {
            createRequest(s).addCallback(mCallbackSameThread);
        }

        public void onFailure(int i)
        {
            mCallbackSameThread.onResultSameThread(null, mAuthFailedResult);
        }

        public void onSuccess()
        {
            String s = mCustomerIdCallback.getCustomerId();
            if (!TextUtils.isEmpty(s))
            {
                WLog.v(WishListManager.TAG, (new StringBuilder()).append("Doing request with customer id: ").append(s).toString());
                doRequest(s);
                return;
            } else
            {
                mCallbackSameThread.onResultSameThread(null, mAuthFailedResult);
                return;
            }
        }

        public void setCustomerIdCallback(CustomerIdCallback customeridcallback)
        {
            mCustomerIdCallback = customeridcallback;
        }

        public RequestCallback(CallbackSameThread callbacksamethread)
        {
            this$0 = WishListManager.this;
            super();
            mAuthFailedResult = (new com.walmartlabs.kangaroo.Result.Builder()).code(401).error(com.walmartlabs.kangaroo.Result.Error.ERROR_UNKNOWN, new Throwable()).build();
            mCustomerIdCallback = mNullCustomerIdCallback;
            mCallbackSameThread = callbacksamethread;
        }
    }


    private static final String TAG = com/walmart/android/service/wishlist/WishListManager.getSimpleName();
    private static WishListManager sInstance;
    private final CustomerIdCallback mAnonymousCustomerIdCallback = new CustomerIdCallback() {

        final WishListManager this$0;

        public String getCustomerId()
        {
            return getAnonymousCustomerId();
        }

            
            {
                this$0 = WishListManager.this;
                super();
            }
    };
    private final CustomerIdCallback mLoggedInCustomerIdCallback = new CustomerIdCallback() {

        final WishListManager this$0;

        public String getCustomerId()
        {
            return getLoggedInCustomerId();
        }

            
            {
                this$0 = WishListManager.this;
                super();
            }
    };
    private final CustomerIdCallback mNullCustomerIdCallback = new CustomerIdCallback() {

        final WishListManager this$0;

        public String getCustomerId()
        {
            return null;
        }

            
            {
                this$0 = WishListManager.this;
                super();
            }
    };
    private final WishListService mService;

    private WishListManager(WishListService wishlistservice)
    {
        mService = wishlistservice;
    }

    public static WishListManager create(WishListService wishlistservice)
    {
        if (sInstance == null)
        {
            sInstance = new WishListManager(wishlistservice);
            sInstance.init();
        }
        return sInstance;
    }

    private void doAnonAuthRequest(RequestCallback requestcallback)
    {
        Authentication authentication = Services.get().getAuthentication();
        if (authentication.hasCredentials())
        {
            WLog.d(TAG, "doAnonAuthRequest: has credentials, renewing the session");
            requestcallback.setCustomerIdCallback(mLoggedInCustomerIdCallback);
            authentication.renewSession(requestcallback);
            return;
        }
        WLog.d(TAG, "doAnonAuthRequest: anon request");
        String s = getAnonymousCustomerId();
        if (TextUtils.isEmpty(s))
        {
            WLog.d(TAG, "doAnonAuthRequest: anon request, request ACID first");
            requestcallback.setCustomerIdCallback(mAnonymousCustomerIdCallback);
            authentication.verify(requestcallback);
            return;
        } else
        {
            WLog.d(TAG, "doAnonAuthRequest: anon request, performing the request");
            requestcallback.doRequest(s);
            return;
        }
    }

    public static WishListManager get()
    {
        return sInstance;
    }

    private String getAnonymousCustomerId()
    {
        return getCookieValue("ACID");
    }

    private String getCookieValue(String s)
    {
        for (Iterator iterator = ((CookieManager)SharedHttpClient.get().getCookieHandler()).getCookieStore().getCookies().iterator(); iterator.hasNext();)
        {
            HttpCookie httpcookie = (HttpCookie)iterator.next();
            if (httpcookie.getName().equals(s))
            {
                return httpcookie.getValue();
            }
        }

        return null;
    }

    private String getLoggedInCustomerId()
    {
        return getCookieValue("CID");
    }

    private void init()
    {
        MessageBus.getBus().register(this);
    }

    public void addItem(final String listId, AddBundle addbundle, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(addbundle) {

            final WishListManager this$0;
            final AddBundle val$bundle;
            final String val$listId;

            protected Request createRequest(String s)
            {
                return mService.addBundle(s, listId, bundle);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                bundle = addbundle;
                super(final_callbacksamethread);
            }
        });
    }

    public void addItem(final String listId, AddItemBase additembase, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(additembase) {

            final WishListManager this$0;
            final AddItemBase val$item;
            final String val$listId;

            protected Request createRequest(String s)
            {
                return mService.addItem(s, listId, item);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                item = additembase;
                super(final_callbacksamethread);
            }
        });
    }

    public void createList(CreateWishList createwishlist, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(createwishlist) {

            final WishListManager this$0;
            final CreateWishList val$data;

            protected Request createRequest(String s)
            {
                return mService.createList(s, data);
            }

            
            {
                this$0 = WishListManager.this;
                data = createwishlist;
                super(final_callbacksamethread);
            }
        });
    }

    public void deleteItem(final String listId, String s, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(s) {

            final WishListManager this$0;
            final String val$itemId;
            final String val$listId;

            protected Request createRequest(String s1)
            {
                return mService.deleteItem(listId, itemId, s1);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                itemId = s1;
                super(final_callbacksamethread);
            }
        });
    }

    public void deleteList(String s, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(s) {

            final WishListManager this$0;
            final String val$listId;

            protected Request createRequest(String s1)
            {
                return mService.deleteList(listId, s1);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                super(final_callbacksamethread);
            }
        });
    }

    public Request findLists(String s, String s1, String s2, String s3, int i, int j)
    {
        return mService.findLists(s, s1, s2, s3, i, j);
    }

    public Request getItems(String s, String s1, String s2, String s3)
    {
        return mService.getItems(s, null, s1, s2, s3);
    }

    public void getItems(final String listId, final String filter, final String sort, String s, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(s) {

            final WishListManager this$0;
            final String val$filter;
            final String val$listId;
            final String val$order;
            final String val$sort;

            protected Request createRequest(String s1)
            {
                return mService.getItems(listId, s1, filter, sort, order);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                filter = s1;
                sort = s2;
                order = s3;
                super(final_callbacksamethread);
            }
        });
    }

    public void getListsForCurrentUser(CallbackSameThread callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(callbacksamethread) {

            final WishListManager this$0;

            protected Request createRequest(String s)
            {
                return mService.getWishLists(s);
            }

            
            {
                this$0 = WishListManager.this;
                super(callbacksamethread);
            }
        });
    }

    public Request getWishList(String s)
    {
        return mService.getWishList(s, null);
    }

    public void getWishList(String s, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(s) {

            final WishListManager this$0;
            final String val$listId;

            protected Request createRequest(String s1)
            {
                return mService.getWishList(listId, s1);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                super(final_callbacksamethread);
            }
        });
    }

    public Request markPurchasedItems(String s, PurchasedItem apurchaseditem[])
    {
        return mService.markPurchasedItems(s, apurchaseditem);
    }

    public Request matchReceiptItemsByReceiptId(String s, String s1)
    {
        return mService.matchReceiptItemsByReceiptId(s, s1);
    }

    public Request matchReceiptItemsByTcNumber(String s, String s1, String s2)
    {
        s1 = s1.replaceAll("-", "");
        return mService.matchReceiptItemsByTcNumber(s, s1, s2);
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        final ListTransferCompleteEvent transferCompleteEvent;
label0:
        {
            boolean flag;
            if (authenticationstatusevent.loggedIn && authenticationstatusevent.hasCredentials)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                WLog.d(TAG, "Attempting to transfer lists");
                authenticationstatusevent = getLoggedInCustomerId();
                String s = getAnonymousCustomerId();
                transferCompleteEvent = new ListTransferCompleteEvent();
                if (TextUtils.isEmpty(authenticationstatusevent) || TextUtils.isEmpty(s))
                {
                    break label0;
                }
                mService.transferLists(s, authenticationstatusevent).addCallback(new CallbackSameThread() {

                    final WishListManager this$0;
                    final ListTransferCompleteEvent val$transferCompleteEvent;

                    public void onResultSameThread(Request request, Result result)
                    {
                        if (result.successful() && result.hasData())
                        {
                            WLog.d(WishListManager.TAG, (new StringBuilder()).append("Successfully transferred ").append(((WishList[])result.getData()).length).append(" list(s)").toString());
                        } else
                        {
                            WLog.d(WishListManager.TAG, "Failed to transfer lists");
                        }
                        MessageBus.getBus().post(transferCompleteEvent);
                    }

            
            {
                this$0 = WishListManager.this;
                transferCompleteEvent = listtransfercompleteevent;
                super();
            }
                });
            }
            return;
        }
        WLog.d(TAG, "Missing CID or ACID, no need to transfer lists");
        MessageBus.getBus().post(transferCompleteEvent);
    }

    public void updateItemQuantities(final String listId, final String itemId, final int wantsQuantity, int i, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(i) {

            final WishListManager this$0;
            final int val$hasQuantity;
            final String val$itemId;
            final String val$listId;
            final int val$wantsQuantity;

            protected Request createRequest(String s)
            {
                return mService.updateItemQuantities(listId, itemId, s, wantsQuantity, hasQuantity);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                itemId = s1;
                wantsQuantity = i;
                hasQuantity = j;
                super(final_callbacksamethread);
            }
        });
    }

    public void updateList(final String listId, UpdateWishList updatewishlist, final CallbackSameThread final_callbacksamethread)
    {
        doAnonAuthRequest(new RequestCallback(updatewishlist) {

            final WishListManager this$0;
            final String val$listId;
            final UpdateWishList val$updateData;

            protected Request createRequest(String s)
            {
                return mService.updateList(listId, s, updateData);
            }

            
            {
                this$0 = WishListManager.this;
                listId = s;
                updateData = updatewishlist;
                super(final_callbacksamethread);
            }
        });
    }






}
