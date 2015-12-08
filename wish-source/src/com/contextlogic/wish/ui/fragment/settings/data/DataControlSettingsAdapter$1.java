// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings.data;

import android.widget.CompoundButton;
import com.facebook.AppEventsLogger;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings.data:
//            DataControlSettingsAdapter

class this._cls0
    implements android.widget.eListener
{

    final DataControlSettingsAdapter this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = getContext();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        AppEventsLogger.setLimitEventUsage(compoundbutton, flag);
    }

    ()
    {
        this$0 = DataControlSettingsAdapter.this;
        super();
    }
}
