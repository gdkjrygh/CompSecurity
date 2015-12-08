// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ui;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.walmart.android.app.ui:
//            ImagePagerController, ImagePagerAdapter

class this._cls0
    implements android.view.rController._cls2
{

    final ImagePagerController this$0;

    public void onClick(View view)
    {
        if (ImagePagerController.access$100(ImagePagerController.this) != null)
        {
            view = ImagePagerController.access$300(ImagePagerController.this).getItemId(ImagePagerController.access$200(ImagePagerController.this).getCurrentItem());
            ImagePagerController.access$100(ImagePagerController.this).OnImageClickListener(view);
        }
    }

    ImageClickedListener()
    {
        this$0 = ImagePagerController.this;
        super();
    }
}
