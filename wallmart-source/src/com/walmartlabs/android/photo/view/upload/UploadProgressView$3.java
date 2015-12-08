// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.upload;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.view.PhotoDrawable;

// Referenced classes of package com.walmartlabs.android.photo.view.upload:
//            UploadProgressView

class val.count
    implements com.walmartlabs.android.photo.util.task.LoadCallback
{

    final UploadProgressView this$0;
    final int val$count;

    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
    {
        if (UploadProgressView.access$400(UploadProgressView.this) || photodrawable == null || photodrawable.getBitmap() == null) goto _L2; else goto _L1
_L1:
        float f;
        int i;
        f = 0.0F;
        i = UploadProgressView.access$500(UploadProgressView.this).getChildCount();
        val$count % 3;
        JVM INSTR tableswitch 0 2: default 68
    //                   0 224
    //                   1 230
    //                   2 237;
           goto _L3 _L4 _L5 _L6
_L3:
        obj = (ImageView)LayoutInflater.from(getContext()).inflate(com.walmartlabs.android.photo.item, UploadProgressView.access$500(UploadProgressView.this), false);
        UploadProgressView.access$500(UploadProgressView.this).addView(((android.view.View) (obj)), UploadProgressView.access$500(UploadProgressView.this).getChildCount() - 1);
        if (PhotoUtils.canAnimate())
        {
            ((ImageView) (obj)).setAlpha(0.0F);
        }
        ((ImageView) (obj)).setImageBitmap(photodrawable.getBitmap());
        if (PhotoUtils.canAnimate())
        {
            ((ImageView) (obj)).animate().rotationBy(f).alpha(1.0F).setDuration(500L);
        }
        if (i - 1 > 5 && (UploadProgressView.access$500(UploadProgressView.this).getChildAt(0) instanceof ImageView))
        {
            photodrawable = (ImageView)UploadProgressView.access$500(UploadProgressView.this).getChildAt(0);
            UploadProgressView.access$600(UploadProgressView.this, photodrawable);
            UploadProgressView.access$500(UploadProgressView.this).removeView(photodrawable);
        }
_L2:
        return;
_L4:
        f = 0.0F;
        continue; /* Loop/switch isn't completed */
_L5:
        f = -15F;
        continue; /* Loop/switch isn't completed */
_L6:
        f = 15F;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public void onTaskCancelled(Bitmap bitmap)
    {
    }

    adCallback()
    {
        this$0 = final_uploadprogressview;
        val$count = I.this;
        super();
    }
}
