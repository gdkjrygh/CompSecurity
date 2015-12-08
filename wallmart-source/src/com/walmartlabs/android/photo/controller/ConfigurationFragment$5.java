// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.walmartlabs.android.photo.util.RefreshTimer;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ConfigurationFragment

class this._cls0 extends RefreshTimer
{

    final ConfigurationFragment this$0;

    public void onRefresh()
    {
        if (isAdded())
        {
            ConfigurationFragment.access$000(ConfigurationFragment.this);
        }
    }

    (long l)
    {
        this$0 = ConfigurationFragment.this;
        super(l);
    }
}
