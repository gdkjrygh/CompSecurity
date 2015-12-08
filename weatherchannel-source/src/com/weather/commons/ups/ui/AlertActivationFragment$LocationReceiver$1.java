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

// Referenced classes of package com.weather.commons.ups.ui:
//            AlertActivationFragment

class val.result
    implements Runnable
{

    final is._cls0 this$1;
    final SavedLocation val$result;
    final String val$userData;

    public void run()
    {
        if (tivity != null && tivity.getCurrentFocus() != null)
        {
            putMethodManager = (InputMethodManager)tivity.getSystemService("input_method");
            putMethodManager.hideSoftInputFromWindow(tivity.getCurrentFocus().getWindowToken(), 0);
        }
        AlertActivationFragment.access$700(_fld0).setQuery(val$userData, false);
        if (val$userData != null)
        {
            cess._mth1200(this._cls1.this, val$result, val$userData);
        }
        AlertActivationFragment.access$1300(_fld0).moveCursorToStart();
        AlertActivationFragment.access$700(_fld0).clearFocus();
    }

    ()
    {
        this$1 = final_;
        val$userData = s;
        val$result = SavedLocation.this;
        super();
    }
}
