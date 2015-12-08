// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.view.PhotoDrawable;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            EditConfigurationFragment

class this._cls0
    implements com.walmartlabs.android.photo.util.task.lback
{

    final EditConfigurationFragment this$0;

    public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
    {
        if (photodrawable != null && isAdded() && EditConfigurationFragment.access$200(EditConfigurationFragment.this) != null)
        {
            ((ImageView)EditConfigurationFragment.access$500(EditConfigurationFragment.this).findViewById(com.walmartlabs.android.photo.Fragment)).setImageDrawable(photodrawable);
            ((TextView)EditConfigurationFragment.access$500(EditConfigurationFragment.this).findViewById(com.walmartlabs.android.photo.Fragment)).setText(String.valueOf(EditConfigurationFragment.access$200(EditConfigurationFragment.this).getTotalQuantity()));
            EditConfigurationFragment.access$500(EditConfigurationFragment.this).findViewById(com.walmartlabs.android.photo.Fragment).setVisibility(0);
        }
    }

    public void onTaskCancelled(Bitmap bitmap)
    {
    }

    back()
    {
        this$0 = EditConfigurationFragment.this;
        super();
    }
}
