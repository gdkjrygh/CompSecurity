// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebBackForwardList;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;
import io.theholygrail.dingo.AnimationController;
import io.theholygrail.dingo.JsonHandler;
import io.theholygrail.dingo.navigation.ExternalUrlOptions;
import io.theholygrail.dingo.navigation.NavigationBridgeCallback;
import io.theholygrail.dingo.navigation.NavigationOptions;
import io.theholygrail.jsbridge.JSValue;
import io.theholygrail.jsbridge.JSWebView;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController, Page, NavigationStack, DrawerUpdateEvent

class val.onAppearCallback
    implements io.theholygrail.dingo.view.AppearListener
{

    final is._cls0 this$1;
    final JSValue val$onAppearCallback;

    public void onAppear()
    {
        val$onAppearCallback.callFunction(BridgeController.access$700(_fld0), null, null);
    }

    l.handler()
    {
        this$1 = final_handler;
        val$onAppearCallback = JSValue.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/bridge/BridgeController$4

/* anonymous class */
    class BridgeController._cls4
        implements NavigationBridgeCallback
    {

        final BridgeController this$0;
        final JsonHandler val$handler;

        public void animateBackwards()
        {
            goBack(true);
        }

        public void animateForward(String s)
        {
            onDisappear();
            BridgeController.access$900(BridgeController.this).animateForward();
            Page page = new Page();
            if (s != null)
            {
                s = (NavigationOptions)handler.fromJson(s, io/theholygrail/dingo/navigation/NavigationOptions);
                if (s != null && !TextUtils.isEmpty(((NavigationOptions) (s)).title))
                {
                    page.setTitle(((NavigationOptions) (s)).title);
                }
            }
            page.setHistoryIndex(BridgeController.access$700(BridgeController.this).copyBackForwardList().getCurrentIndex());
            BridgeController.access$400(BridgeController.this).push(page);
            BridgeController.access$000(BridgeController.this).updateHeader(page, false);
            MessageBus.getBus().post(new DrawerUpdateEvent(false, true));
        }

        public void dismissModal()
        {
            WLog.d(BridgeController.access$100(), "dismissModal()");
            if (BridgeController.access$400(BridgeController.this).getCurrentPage().hasModals())
            {
                goBack(true);
                return;
            } else
            {
                WLog.e(BridgeController.access$100(), "dismissModal() called on non modal.");
                return;
            }
        }

        public void popToRoot()
        {
            BridgeController.access$400(BridgeController.this).popToRoot();
        }

        public void presentExternalUrl(ExternalUrlOptions externalurloptions)
        {
            if (externalurloptions != null && externalurloptions.url != null)
            {
                final String url = externalurloptions.url;
                Page page = new Page();
                page.setIsExternalModal(true);
                if (!TextUtils.isEmpty(externalurloptions.title))
                {
                    page.setTitle(externalurloptions.title);
                }
                if (!TextUtils.isEmpty(externalurloptions.returnURL))
                {
                    page.setInterceptUrl(externalurloptions.returnURL);
                }
                BridgeController.access$1200(BridgeController.this, externalurloptions.returnURL);
                ((ViewGroup)ViewUtil.findViewById(BridgeController.access$1300(BridgeController.this), 0x7f100082)).addView(BridgeController.access$1400(BridgeController.this));
                BridgeController.access$700(BridgeController.this).onPause();
                BridgeController.access$1100(BridgeController.this, page, new BridgeController._cls4._cls4());
            }
        }

        public void presentModal(NavigationOptions navigationoptions)
        {
            Page page = new Page();
            if (navigationoptions != null)
            {
                if (!TextUtils.isEmpty(navigationoptions.title))
                {
                    page.setTitle(navigationoptions.title);
                }
                if (navigationoptions.onNavigationBarButtonTap != null)
                {
                    final JSValue buttonsCallback = new JSValue(navigationoptions.onNavigationBarButtonTap);
                    page.setButtons(navigationoptions.navigationBarButtons, new BridgeController._cls4._cls1());
                }
                if (navigationoptions.onAppear != null)
                {
                    page.setOnAppearListener((new JSValue(navigationoptions.onAppear)). new BridgeController._cls4._cls2());
                }
            }
            BridgeController.access$1100(BridgeController.this, page, new BridgeController._cls4._cls3());
        }

        public void setOnBackListener(io.theholygrail.dingo.navigation.NavigationBridgeCallback.OnBackListener onbacklistener)
        {
            WLog.d(BridgeController.access$100(), "setOnBackListener()");
            BridgeController.access$400(BridgeController.this).getCurrentPageOrModal().setOnBackListener(onbacklistener);
        }

            
            {
                this$0 = final_bridgecontroller;
                handler = JsonHandler.this;
                super();
            }

        // Unreferenced inner class com/walmart/android/app/bridge/BridgeController$4$1

/* anonymous class */
        class BridgeController._cls4._cls1
            implements io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback.OnClickListener
        {

            final BridgeController._cls4 this$1;
            final JSValue val$buttonsCallback;

            public void onClick(String s)
            {
                s = new JSValue(s);
                buttonsCallback.callFunction(BridgeController.access$700(this$0), new Object[] {
                    s
                }, null);
            }

                    
                    {
                        this$1 = BridgeController._cls4.this;
                        buttonsCallback = jsvalue;
                        super();
                    }
        }


        // Unreferenced inner class com/walmart/android/app/bridge/BridgeController$4$3

/* anonymous class */
        class BridgeController._cls4._cls3
            implements io.theholygrail.dingo.AnimationController.AnimationListener
        {

            final BridgeController._cls4 this$1;

            public void onAnimationEnd()
            {
                BridgeController.access$1000(this$0);
            }

                    
                    {
                        this$1 = BridgeController._cls4.this;
                        super();
                    }
        }


        // Unreferenced inner class com/walmart/android/app/bridge/BridgeController$4$4

/* anonymous class */
        class BridgeController._cls4._cls4
            implements io.theholygrail.dingo.AnimationController.AnimationListener
        {

            final BridgeController._cls4 this$1;
            final String val$url;

            public void onAnimationEnd()
            {
                BridgeController.access$1500(this$0, BridgeController.access$1400(this$0), url);
            }

                    
                    {
                        this$1 = BridgeController._cls4.this;
                        url = s;
                        super();
                    }
        }

    }

}
