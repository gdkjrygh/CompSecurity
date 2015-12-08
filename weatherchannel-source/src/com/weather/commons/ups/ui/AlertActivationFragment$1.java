// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import com.weather.util.lbs.LbsUtil;

// Referenced classes of package com.weather.commons.ups.ui:
//            AlertActivationFragment

class this._cls0
    implements android.widget.angeListener
{

    final AlertActivationFragment this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (AlertActivationFragment.access$000(AlertActivationFragment.this).isChecked() && !LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            AlertActivationFragment.access$000(AlertActivationFragment.this).setChecked(false);
            Toast.makeText(getActivity(), getActivity().getString(com.weather.commons.ment.getActivity), 1).show();
        }
    }

    ()
    {
        this$0 = AlertActivationFragment.this;
        super();
    }
}
