// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

class this._cls0
    implements android.widget.Listener
{

    final AccountSettingsFragment this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (TextView)adapterview.getChildAt(0);
        if (adapterview != null)
        {
            view = adapterview.getText().toString();
            if (AccountSettingsFragment.access$400(AccountSettingsFragment.this, view))
            {
                adapterview.setTextColor(getResources().getColor(com.weather.commons.olor));
            }
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$0 = AccountSettingsFragment.this;
        super();
    }
}
