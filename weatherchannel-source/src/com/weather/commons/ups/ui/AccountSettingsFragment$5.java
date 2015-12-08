// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.content.res.Resources;
import android.widget.ImageView;
import com.weather.commons.ups.backend.GooglePlusConnectionManager;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

class val.avatarView
    implements Runnable
{

    final AccountSettingsFragment this$0;
    final ImageView val$avatarView;

    public void run()
    {
        int i = getResources().getDimensionPixelSize(com.weather.commons.vatar_size);
        String s = GooglePlusConnectionManager.getInstance().getCurrentImagePath(i);
        if (s != null)
        {
            AccountSettingsFragment.access$700(AccountSettingsFragment.this, val$avatarView, s);
        }
    }

    anager()
    {
        this$0 = final_accountsettingsfragment;
        val$avatarView = ImageView.this;
        super();
    }
}
