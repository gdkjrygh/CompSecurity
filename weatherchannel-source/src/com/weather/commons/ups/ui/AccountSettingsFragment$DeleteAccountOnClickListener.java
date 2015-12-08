// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.weather.beacons.analytics.Analytics;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

private final class <init>
    implements android.view.ClickListener
{

    private static final int TEXT_SIZE = 18;
    final AccountSettingsFragment this$0;

    public void onClick(View view)
    {
        view = new TextView(AccountSettingsFragment.access$600(AccountSettingsFragment.this));
        android.widget.ickListener icklistener = new android.widget.ickListener.this._cls0(-2, -2, 17);
        view.setText(getString(com.weather.commons.stener.this._fld0));
        view.setLayoutParams(icklistener);
        view.setGravity(1);
        int i = getResources().getDimensionPixelSize(com.weather.commons.stener.this._fld0);
        view.setPadding(i, i, i, i);
        view.setTextSize(18F);
        (new android.app.(AccountSettingsFragment.access$600(AccountSettingsFragment.this)))._mth0(com.weather.commons.stener.this._fld0, new android.content.DialogInterface.OnClickListener() {

            final AccountSettingsFragment.DeleteAccountOnClickListener this$1;

            public void onClick(DialogInterface dialoginterface, int j)
            {
                Analytics.trackAction(getResources().getString(com.weather.commons.R.string.beacon_ups_account_delete), null);
                AccountSettingsFragment.access$302(this$0, false);
                dialoginterface = new ProgressDialog(AccountSettingsFragment.access$600(this$0));
                dialoginterface.setMessage(getString(com.weather.commons.R.string.deleting_account_msg));
                dialoginterface.setCancelable(false);
                dialoginterface.show();
                (new com.weather.commons.ups.backend.UpsCommonUtil.DeleteAccountTask(AccountSettingsFragment.access$600(this$0), false, dialoginterface)).execute(new Void[0]);
            }

            
            {
                this$1 = AccountSettingsFragment.DeleteAccountOnClickListener.this;
                super();
            }
        }).nClickListener(com.weather.commons.stener, new android.content.DialogInterface.OnClickListener() {

            final AccountSettingsFragment.DeleteAccountOnClickListener this$1;

            public void onClick(DialogInterface dialoginterface, int j)
            {
            }

            
            {
                this$1 = AccountSettingsFragment.DeleteAccountOnClickListener.this;
                super();
            }
        }).nClickListener(view).nClickListener();
    }

    private _cls2.this._cls1()
    {
        this$0 = AccountSettingsFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
