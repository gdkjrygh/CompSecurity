// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings;

import com.contextlogic.wish.googleplus.GooglePlusManager;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings:
//            SettingsFragment

class this._cls0
    implements ResultCallback
{

    final SettingsFragment this$0;

    public volatile void onResult(Result result)
    {
        onResult((Status)result);
    }

    public void onResult(Status status)
    {
        GooglePlusManager.getInstance().resetPlusClient();
        SettingsFragment.access$700(SettingsFragment.this);
    }

    ()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
