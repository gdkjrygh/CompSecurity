// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.content.Context;
import com.walmartlabs.android.photo.view.album.DevicePhotosAdapter;
import com.walmartlabs.android.photo.view.album.ScrollSpeedMonitor;
import com.walmartlabs.ui.recycler.GridRecyclerView;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment

class or extends ScrollSpeedMonitor
{

    final AlbumFragment this$0;

    public void onSettled()
    {
        int i = AlbumFragment.access$100(AlbumFragment.this).getFirstVisiblePosition();
        for (int j = AlbumFragment.access$100(AlbumFragment.this).getLastVisiblePosition(); i <= j; i++)
        {
            android.support.v7.widget.wHolder wholder = AlbumFragment.access$100(AlbumFragment.this).findViewHolderForAdapterPosition(i);
            if (wholder instanceof com.walmartlabs.android.photo.view.album.ter.DevicePhotoViewHolder)
            {
                AlbumFragment.access$000(AlbumFragment.this).ensureBitmapLoaded((com.walmartlabs.android.photo.view.album.ter.DevicePhotoViewHolder)wholder, i - AlbumFragment.access$100(AlbumFragment.this).getHeaderCount());
            }
        }

    }

    public void onSpeedStatusChange(boolean flag)
    {
        AlbumFragment.access$000(AlbumFragment.this).setTooFastToLoad(flag);
    }

    ter(Context context)
    {
        this$0 = AlbumFragment.this;
        super(context);
    }
}
