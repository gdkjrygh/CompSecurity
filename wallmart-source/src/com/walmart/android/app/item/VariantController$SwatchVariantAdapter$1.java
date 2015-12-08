// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.walmart.android.wmui.CornerRadiusDrawable;
import com.walmart.android.wmui.DrawableTarget;

// Referenced classes of package com.walmart.android.app.item:
//            VariantController

class this._cls0 extends DrawableTarget
{

    final this._cls0 this$0;

    protected Drawable createDrawable(Bitmap bitmap)
    {
        return new CornerRadiusDrawable(bitmap, cess._mth200(this._cls0.this));
    }

    (ImageView imageview)
    {
        this$0 = this._cls0.this;
        super(imageview);
    }
}
