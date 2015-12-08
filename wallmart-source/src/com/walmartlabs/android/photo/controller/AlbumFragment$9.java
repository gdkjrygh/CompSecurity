// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import com.walmartlabs.android.photo.model.device.DevicePhotosModel;
import com.walmartlabs.android.photo.util.RefreshTimer;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment

class this._cls0 extends RefreshTimer
{

    final AlbumFragment this$0;

    public void onRefresh()
    {
        if (isAdded())
        {
            AlbumFragment.access$700(AlbumFragment.this).refresh();
        }
    }

    del(long l)
    {
        this$0 = AlbumFragment.this;
        super(l);
    }
}
