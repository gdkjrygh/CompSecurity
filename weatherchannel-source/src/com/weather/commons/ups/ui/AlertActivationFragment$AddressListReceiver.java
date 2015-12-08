// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.weather.dal2.google.AddressList;
import com.weather.dal2.net.Receiver;

// Referenced classes of package com.weather.commons.ups.ui:
//            AlertActivationFragment

private class <init>
    implements Receiver
{

    final AlertActivationFragment this$0;

    private void setAddressToSearchView(AddressList addresslist)
    {
        final Activity activity = getActivity();
        if (activity == null)
        {
            return;
        } else
        {
            activity.runOnUiThread(new Runnable() {

                final AlertActivationFragment.AddressListReceiver this$1;
                final Activity val$activity;
                final InputMethodManager val$inputMethodManager;
                final AddressList val$result;

                public void run()
                {
                    if (activity.getCurrentFocus() != null)
                    {
                        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                    }
                    AlertActivationFragment.access$1400(this$0, result.getFormattedAddress(0));
                }

            
            {
                this$1 = AlertActivationFragment.AddressListReceiver.this;
                activity = activity1;
                inputMethodManager = inputmethodmanager;
                result = addresslist;
                super();
            }
            });
            return;
        }
    }

    public void onCompletion(AddressList addresslist, Void void1)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < addresslist.getCount())
                {
                    if (!addresslist.isAcceptableAddress(i))
                    {
                        break label0;
                    }
                    setAddressToSearchView(addresslist);
                }
                return;
            }
            i++;
        } while (true);
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((AddressList)obj, (Void)obj1);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (Void)obj);
    }

    public void onError(Throwable throwable, Void void1)
    {
    }

    private _cls1.val.result()
    {
        this$0 = AlertActivationFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
