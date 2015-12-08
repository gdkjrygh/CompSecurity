// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.view.View;
import android.widget.AdapterView;
import com.walmartlabs.android.photo.model.device.DeviceAlbum;
import com.walmartlabs.android.photo.view.album.AlbumsAdapter;
import com.walmartlabs.android.photo.view.album.DevicePhotosAdapter;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment

class this._cls0
    implements android.widget.emSelectedListener
{

    final AlbumFragment this$0;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (AlbumFragment.access$500(AlbumFragment.this))
        {
            adapterview = (DeviceAlbum)AlbumFragment.access$600(AlbumFragment.this).getItem(i);
            AlbumFragment.access$000(AlbumFragment.this).displayAlbum(adapterview.getName());
            AlbumFragment.access$200(AlbumFragment.this);
            return;
        } else
        {
            AlbumFragment.access$502(AlbumFragment.this, true);
            return;
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ter()
    {
        this$0 = AlbumFragment.this;
        super();
    }
}
