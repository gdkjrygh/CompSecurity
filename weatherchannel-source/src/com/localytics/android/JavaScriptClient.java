// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;

// Referenced classes of package com.localytics.android:
//            MarketingCallable, Localytics

final class JavaScriptClient
{

    private final SparseArray mCallbacks;

    JavaScriptClient(SparseArray sparsearray)
    {
        mCallbacks = sparsearray;
    }

    private Object invoke(int i, Object aobj[])
    {
        Object obj1 = null;
        Object obj = obj1;
        if (mCallbacks != null)
        {
            MarketingCallable marketingcallable = (MarketingCallable)mCallbacks.get(i);
            obj = obj1;
            if (marketingcallable != null)
            {
                obj = marketingcallable.call(aobj);
            }
        }
        return obj;
    }

    String getAttributes()
    {
        return (String)invoke(7, null);
    }

    SparseArray getCallbacks()
    {
        return mCallbacks;
    }

    String getCustomDimensions()
    {
        return (String)invoke(6, null);
    }

    String getIdentifiers()
    {
        return (String)invoke(5, null);
    }

    String getJsGlueCode()
    {
        return String.format("javascript:(function() {  var localyticsScript = document.createElement('script');  localyticsScript.type = 'text/javascript';  localyticsScript.text = '  localytics.identifers = %s;  localytics.customDimensions = %s;  localytics.attributes = %s;  localytics.libraryVersion = \"%s\";  localytics.tagEvent = function(event, attributes, customerValueIncrease) {     localytics.nativeTagEvent(event, JSON.stringify(attributes), JSON.stringify(customerValueIncrease));  };  localytics.setCustomDimension = function(number, value) {     if (number != null && value != null)        localytics.nativeSetCustomDimension(number, value);  };  window.open = function(url) {     if (url != null)        localytics.navigate(url);  };  localytics.close = function() {     localytics.nativeClose();  };';  document.getElementsByTagName('body')[0].appendChild(localyticsScript);})()", new Object[] {
            getIdentifiers(), getCustomDimensions(), getAttributes(), Localytics.getLibraryVersion()
        });
    }

    public void nativeClose()
    {
        Localytics.Log.w("[JavaScriptClient]: nativeClose is being called");
        (new Handler(Looper.getMainLooper())).post(new _cls1());
    }

    public void nativeSetCustomDimension(long l, String s)
    {
        Localytics.Log.w("[JavaScriptClient]: nativeSetCustomDimension is being called");
        invoke(8, new Object[] {
            Integer.valueOf((int)l), s
        });
    }

    public void nativeTagEvent(String s, String s1, String s2)
    {
        Localytics.Log.w("[JavaScriptClient]: nativeTagEvent is being called");
        invoke(3, new Object[] {
            s, s1, s2
        });
    }

    public void navigate(String s)
    {
        invoke(15, new String[] {
            s
        });
    }


    /* member class not found */
    class _cls1 {}

}
