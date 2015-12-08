// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.content.Intent;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.view.album.DevicePhotosAdapter;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment, SinglePhotoActivity

class this._cls0
    implements com.walmartlabs.android.photo.view.album.ter.EnlargeListener
{

    final AlbumFragment this$0;

    public void onEnlarge(DevicePhoto devicephoto, int i)
    {
        Intent intent = new Intent(getActivity(), com/walmartlabs/android/photo/controller/SinglePhotoActivity);
        boolean flag = AlbumFragment.access$000(AlbumFragment.this).isSelected(i);
        intent.putExtra("photo", devicephoto);
        intent.putExtra("position", i);
        intent.putExtra("selected", flag);
        startActivityForResult(intent, 1776);
    }

    ter()
    {
        this$0 = AlbumFragment.this;
        super();
    }
}
