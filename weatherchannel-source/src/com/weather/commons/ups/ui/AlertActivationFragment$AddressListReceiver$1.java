// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.weather.dal2.google.AddressList;

// Referenced classes of package com.weather.commons.ups.ui:
//            AlertActivationFragment

class val.result
    implements Runnable
{

    final val.result this$1;
    final Activity val$activity;
    final InputMethodManager val$inputMethodManager;
    final AddressList val$result;

    public void run()
    {
        if (val$activity.getCurrentFocus() != null)
        {
            val$inputMethodManager.hideSoftInputFromWindow(val$activity.getCurrentFocus().getWindowToken(), 0);
        }
        AlertActivationFragment.access$1400(_fld0, val$result.getFormattedAddress(0));
    }

    ()
    {
        this$1 = final_;
        val$activity = activity1;
        val$inputMethodManager = inputmethodmanager;
        val$result = AddressList.this;
        super();
    }
}
