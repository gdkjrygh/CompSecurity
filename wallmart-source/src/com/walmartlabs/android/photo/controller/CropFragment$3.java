// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.crop.CropView;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            CropFragment

class this._cls0
    implements com.walmartlabs.android.photo.util.task.BitmapLoadCallback
{

    final CropFragment this$0;

    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
    {
        if (photodrawable == null || photodrawable.getBitmap() == null)
        {
            if (getFragmentManager().findFragmentByTag("failed_to_load_dialog") == null)
            {
                photodrawable = DialogFactory.createAlertDialog(getString(com.walmartlabs.android.photo.crop_failed_to_load_title), getString(com.walmartlabs.android.photo.crop_failed_to_load_message), getActivity(), new android.content.DialogInterface.OnClickListener() {

                    final CropFragment._cls3 this$1;

                    public void onClick(DialogInterface dialoginterface, int k)
                    {
                        doExit();
                    }

            
            {
                this$1 = CropFragment._cls3.this;
                super();
            }
                });
                photodrawable.setCancelable(false);
                photodrawable.show();
            }
            return;
        }
        if (CropFragment.access$400(CropFragment.this) != null)
        {
            CropFragment.access$400(CropFragment.this).setIsDisplayed(false);
        }
        CropFragment.access$402(CropFragment.this, photodrawable);
        PhotoLogger.get().d(CropFragment.access$500(), (new StringBuilder()).append("Loaded bitmap for cropping: ").append(CropFragment.access$400(CropFragment.this).getBitmap().getWidth()).append(" x ").append(CropFragment.access$400(CropFragment.this).getBitmap().getHeight()).toString());
        photodrawable = CropFragment.access$200(CropFragment.this).getConfigurationForProduct(CropFragment.access$100(CropFragment.this));
        int i;
        int j;
        if (photodrawable != null)
        {
            photodrawable = photodrawable.getCrop();
        } else
        {
            photodrawable = null;
        }
        i = Math.max(CropFragment.access$100(CropFragment.this).getWidth(), CropFragment.access$100(CropFragment.this).getHeight());
        j = Math.min(CropFragment.access$100(CropFragment.this).getWidth(), CropFragment.access$100(CropFragment.this).getHeight());
        CropFragment.access$400(CropFragment.this).setIsDisplayed(true);
        CropFragment.access$000(CropFragment.this).setBitmapAndPrintSize(CropFragment.access$400(CropFragment.this).getBitmap(), i, j, CropFragment.access$100(CropFragment.this).getShortProductName(), photodrawable);
        if (CropFragment.access$600(CropFragment.this) == null) goto _L2; else goto _L1
_L1:
        photodrawable = CropFragment.access$600(CropFragment.this).findItem(com.walmartlabs.android.photo.n);
        if (CropFragment.access$000(CropFragment.this) == null || !CropFragment.access$000(CropFragment.this).isLandscape()) goto _L4; else goto _L3
_L3:
        photodrawable.setTitle(getString(com.walmartlabs.android.photo.portrait));
        photodrawable.setIcon(com.walmartlabs.android.photo.o_crop_portrait);
_L2:
        CropFragment.access$700(CropFragment.this).findViewById(com.walmartlabs.android.photo.out).setVisibility(0);
        CropFragment.access$000(CropFragment.this).setVisibility(0);
        CropFragment.access$700(CropFragment.this).findViewById(com.walmartlabs.android.photo.Fragment).setVisibility(8);
        return;
_L4:
        if (CropFragment.access$000(CropFragment.this) != null)
        {
            photodrawable.setTitle(getString(com.walmartlabs.android.photo.landscape));
            photodrawable.setIcon(com.walmartlabs.android.photo.o_crop_landscape);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void onTaskCancelled(Bitmap bitmap)
    {
    }

    _cls1.this._cls1()
    {
        this$0 = CropFragment.this;
        super();
    }
}
