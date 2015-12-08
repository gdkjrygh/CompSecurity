// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.walmartlabs.android.photo.util.RefreshTimer;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            CropFragment

class this._cls0 extends RefreshTimer
{

    final CropFragment this$0;

    public void onRefresh()
    {
        if (isAdded())
        {
            CropFragment.access$300(CropFragment.this);
        }
    }

    (long l)
    {
        this$0 = CropFragment.this;
        super(l);
    }
}
