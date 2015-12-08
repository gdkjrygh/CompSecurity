// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import com.squareup.otto.Bus;
import com.walmart.android.events.CartItemCountUpdatedEvent;
import com.walmart.android.events.StartupFinishedEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.cart.CartService;
import com.walmart.android.service.cart.ItemCount;
import com.walmart.android.service.cart.ListInfo;
import com.walmart.android.service.cart.Location;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.wmservice:
//            Services, Util

public class CartManager
{
    private class UpdateItemCountCallback extends CallbackSameThread
    {

        final CartManager this$0;

        public void onResultSameThread(Request request, Result result)
        {
            super.onResultSameThread(request, result);
            if (result.successful() && result.hasData())
            {
                setNewItemCount(((ItemCount)result.getData()).itemCount);
            }
            Util.clearWebCookie("PCID");
            Util.clearWebCookie("hasPCID");
        }

        public UpdateItemCountCallback()
        {
            this$0 = CartManager.this;
            super(mContext);
        }
    }


    private static final String TAG = com/walmart/android/wmservice/CartManager.getSimpleName();
    private int mCartItemCount;
    private final Context mContext;
    private boolean mIsRefreshing;
    private boolean mLoggedIn;
    private boolean mStartupFinished;

    CartManager(Context context)
    {
        mContext = context;
    }

    public void addGrouping(String s, List list, int i, ListInfo listinfo, int j, Location location, CallbackSameThread callbacksamethread)
    {
        Services.get().getCartService().addGrouping(s, list, i, listinfo, j, location).addCallback(callbacksamethread).addCallback(new UpdateItemCountCallback());
    }

    public void addGrouping(String s, List list, int i, ListInfo listinfo, CallbackSameThread callbacksamethread)
    {
        Services.get().getCartService().addGrouping(s, list, i, listinfo).addCallback(callbacksamethread).addCallback(new UpdateItemCountCallback());
    }

    public void addItem(String s, int i, ListInfo listinfo, int j, Location location, CallbackSameThread callbacksamethread)
    {
        Services.get().getCartService().addItem(s, i, listinfo, j, location).addCallback(callbacksamethread).addCallback(new UpdateItemCountCallback());
    }

    public void addItem(String s, int i, ListInfo listinfo, CallbackSameThread callbacksamethread)
    {
        Services.get().getCartService().addItem(s, i, listinfo).addCallback(callbacksamethread).addCallback(new UpdateItemCountCallback());
    }

    void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public int getItemCount()
    {
        return mCartItemCount;
    }

    void init()
    {
        MessageBus.getBus().register(this);
    }

    public boolean isRefreshing()
    {
        return mIsRefreshing;
    }

    public void onAuthenticationStatusEvent(AuthenticationStatusEvent authenticationstatusevent)
    {
        if (mLoggedIn != authenticationstatusevent.loggedIn)
        {
            mLoggedIn = authenticationstatusevent.loggedIn;
            if (mStartupFinished)
            {
                refreshCart();
            }
        }
    }

    public void onStartupFinished(StartupFinishedEvent startupfinishedevent)
    {
        mStartupFinished = true;
    }

    public void refreshCart()
    {
        if (!mIsRefreshing)
        {
            WLog.d(TAG, "Refreshing cart");
            mIsRefreshing = true;
            Services.get().getCartService().getCount().addCallback(new CallbackSameThread(mContext) {

                final CartManager this$0;

                public void onCancelled(Request request)
                {
                    mIsRefreshing = false;
                }

                public void onResultSameThread(Request request, Result result)
                {
                    if (result.successful() && result.hasData())
                    {
                        setNewItemCount(((ItemCount)result.getData()).itemCount);
                    }
                    mIsRefreshing = false;
                }

            
            {
                this$0 = CartManager.this;
                super(context);
            }
            });
        }
    }

    public void setNewItemCount(int i)
    {
        mCartItemCount = i;
        MessageBus.getBus().post(new CartItemCountUpdatedEvent(i));
    }



/*
    static boolean access$002(CartManager cartmanager, boolean flag)
    {
        cartmanager.mIsRefreshing = flag;
        return flag;
    }

*/

}
