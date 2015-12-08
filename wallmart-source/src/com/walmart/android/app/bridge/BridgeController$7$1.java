// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.bridge.client.ClientBridgeCallback;
import com.walmart.android.app.bridge.client.Customer;
import com.walmart.android.app.bridge.client.SignIn;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.main.ActivityResultRouter;
import com.walmart.android.app.order.OrderDetailsPresenter;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController, ResultCallback

class val.success
    implements com.walmart.android.app.main.ActivityResultCallback
{

    final lt this$1;
    final ResultCallback val$success;

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (j == 1)
        {
            WLog.d(BridgeController.access$100(), "AccountActivity returned RESULT_OK. Passing cookies.");
            BridgeController.access$2000(_fld0, false);
            SignIn signin = new SignIn();
            Authentication authentication = Services.get().getAuthentication();
            Customer customer = new Customer();
            customer.firstName = authentication.getFirstName();
            customer.lastName = authentication.getLastName();
            customer.customerId = authentication.getCid();
            boolean flag = intent.getBooleanExtra("email_signup", false);
            if (flag)
            {
                customer.emailSignup = Boolean.valueOf(flag);
            }
            signin.customer = customer;
            signin.accountCreated = intent.getBooleanExtra("account_created", false);
            val$success.onResult(signin);
            return;
        } else
        {
            WLog.d(BridgeController.access$100(), "AccountActivity was canceled.");
            BridgeController.access$1902(_fld0, false);
            val$success.onResult(null);
            return;
        }
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$success = ResultCallback.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/bridge/BridgeController$7

/* anonymous class */
    class BridgeController._cls7
        implements ClientBridgeCallback
    {

        final BridgeController this$0;

        public void openBrowser(String s)
        {
            try
            {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
                if (intent.resolveActivity(BridgeController.access$1800(BridgeController.this).getPackageManager()) != null)
                {
                    BridgeController.access$1800(BridgeController.this).startActivity(intent);
                }
                return;
            }
            catch (ActivityNotFoundException activitynotfoundexception)
            {
                WLog.w(BridgeController.access$100(), (new StringBuilder()).append("Could not launch activity for: ").append(s).toString());
            }
        }

        public void showHome()
        {
            MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.HOME, null, false));
        }

        public void showItemPage(String s)
        {
            s = new ItemDetailsPresenter(BridgeController.access$1800(BridgeController.this), s);
            s.preselectVariant();
            BridgeController.access$000(BridgeController.this).pushPresenter(s);
        }

        public void showOrderDetails(String s)
        {
            BridgeController.access$000(BridgeController.this).pushPresenter(new OrderDetailsPresenter(BridgeController.access$1800(BridgeController.this), s));
        }

        public void signin(String s, ResultCallback resultcallback)
        {
            Intent intent = new Intent(BridgeController.access$1800(BridgeController.this), com/walmart/android/app/account/AccountActivity);
            if (!TextUtils.isEmpty(s))
            {
                intent.putExtra("merge_type", s);
            }
            s = ActivityResultRouter.getInstance(BridgeController.access$1800(BridgeController.this));
            if (s != null)
            {
                BridgeController.access$1902(BridgeController.this, true);
                s.startActivityForResult(intent, 1, resultcallback. new BridgeController._cls7._cls1());
            }
        }

            
            {
                this$0 = BridgeController.this;
                super();
            }
    }

}
