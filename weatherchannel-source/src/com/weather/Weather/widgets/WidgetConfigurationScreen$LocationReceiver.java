// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.widgets;

import android.view.inputmethod.InputMethodManager;
import android.widget.SearchView;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;

// Referenced classes of package com.weather.Weather.widgets:
//            WidgetConfigurationScreen

private class searchView
    implements Receiver
{

    InputMethodManager inputMethodManager;
    SearchView searchView;
    final WidgetConfigurationScreen this$0;

    public void onCompletion(SavedLocation savedlocation, String s)
    {
    /* block-local class not found */
    class _cls1 {}

        runOnUiThread(new _cls1(savedlocation));
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
        ExceptionUtil.logExceptionError("WidgetConfigScreen", (new StringBuilder()).append("LocationReceiver.onError for location:").append(s).toString(), throwable);
    }

    _cls1(SearchView searchview)
    {
        this$0 = WidgetConfigurationScreen.this;
        super();
        inputMethodManager = (InputMethodManager)getSystemService("input_method");
        searchView = searchview;
    }
}
