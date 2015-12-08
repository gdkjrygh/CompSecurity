// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.view.album.CheckablePhotoView;
import com.walmartlabs.android.photo.view.album.DevicePhotosAdapter;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            AlbumFragment

class this._cls0
    implements com.walmartlabs.ui.recycler.w.OnItemClickListener
{

    final AlbumFragment this$0;

    public void onItemClick(BasicViewHolder basicviewholder, int i)
    {
        basicviewholder = (com.walmartlabs.android.photo.view.album.ter.DevicePhotoViewHolder)basicviewholder;
        if (AlbumFragment.access$000(AlbumFragment.this).isValidItem(i))
        {
            AlbumFragment.access$000(AlbumFragment.this).toggleSelection(i);
            ((com.walmartlabs.android.photo.view.album.ter.DevicePhotoViewHolder) (basicviewholder)).photo.setChecked(AlbumFragment.access$000(AlbumFragment.this).isSelected(i));
            AlbumFragment.access$200(AlbumFragment.this);
            return;
        } else
        {
            ((com.walmartlabs.android.photo.view.album.ter.DevicePhotoViewHolder) (basicviewholder)).photo.setUnavailable(true);
            DialogFactory.createAlertDialog(getString(com.walmartlabs.android.photo.orrupt_title), getString(com.walmartlabs.android.photo.oes_not_exist), getActivity()).show();
            return;
        }
    }

    ew()
    {
        this$0 = AlbumFragment.this;
        super();
    }
}
