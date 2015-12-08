// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.weather.beacons.analytics.Analytics;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

class this._cls1
    implements android.content.Listener._cls2
{

    final is._cls0 this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Analytics.trackAction(getResources().getString(com.weather.commons.ener._fld2), null);
        AccountSettingsFragment.access$302(_fld0, false);
        dialoginterface = new ProgressDialog(AccountSettingsFragment.access$600(_fld0));
        dialoginterface.setMessage(getString(com.weather.commons.ener.this._fld0));
        dialoginterface.setCancelable(false);
        dialoginterface.show();
        (new com.weather.commons.ups.backend._cls1(AccountSettingsFragment.access$600(_fld0), false, dialoginterface))._mth1(new Void[0]);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
