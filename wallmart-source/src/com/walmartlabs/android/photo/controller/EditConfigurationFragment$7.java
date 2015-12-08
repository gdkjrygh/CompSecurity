// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.walmartlabs.android.photo.util.RefreshTimer;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            EditConfigurationFragment

class this._cls0 extends RefreshTimer
{

    final EditConfigurationFragment this$0;

    public void onRefresh()
    {
        if (isAdded())
        {
            EditConfigurationFragment.access$000(EditConfigurationFragment.this);
        }
    }

    (long l)
    {
        this$0 = EditConfigurationFragment.this;
        super(l);
    }
}
