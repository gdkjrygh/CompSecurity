// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.SearchView;
import com.weather.commons.locations.SearchUtil;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;

// Referenced classes of package com.weather.commons.ups.ui:
//            AlertActivationFragment

private class <init>
    implements Receiver
{

    final Activity activity;
    InputMethodManager inputMethodManager;
    final AlertActivationFragment this$0;

    private void saveLocation(SavedLocation savedlocation, String s)
    {
        AlertActivationFragment.access$802(AlertActivationFragment.this, savedlocation);
        AlertActivationFragment.access$902(AlertActivationFragment.this, s);
    }

    public void onCompletion(final SavedLocation result, final String userData)
    {
        activity.runOnUiThread(new Runnable() {

            final AlertActivationFragment.LocationReceiver this$1;
            final SavedLocation val$result;
            final String val$userData;

            public void run()
            {
                if (activity != null && activity.getCurrentFocus() != null)
                {
                    inputMethodManager = (InputMethodManager)activity.getSystemService("input_method");
                    inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
                }
                AlertActivationFragment.access$700(this$0).setQuery(userData, false);
                if (userData != null)
                {
                    saveLocation(result, userData);
                }
                AlertActivationFragment.access$1300(this$0).moveCursorToStart();
                AlertActivationFragment.access$700(this$0).clearFocus();
            }

            
            {
                this$1 = AlertActivationFragment.LocationReceiver.this;
                userData = s;
                result = savedlocation;
                super();
            }
        });
    }

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((SavedLocation)obj, (String)obj1);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (String)obj);
    }

    public void onError(Throwable throwable, String s)
    {
        ExceptionUtil.logExceptionError("AlertActivationFragment", (new StringBuilder()).append("LocationReceiver.onError for location:").append(s).toString(), throwable);
    }


    private _cls1.val.result()
    {
        this$0 = AlertActivationFragment.this;
        super();
        activity = getActivity();
    }

    activity(activity activity1)
    {
        this();
    }
}
