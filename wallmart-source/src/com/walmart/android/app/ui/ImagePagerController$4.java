// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ui;

import android.support.v4.view.ViewPager;
import com.walmart.android.ui.PagerDotView;

// Referenced classes of package com.walmart.android.app.ui:
//            ImagePagerController, ImagePagerAdapter

class this._cls0
    implements msChangedListener
{

    final ImagePagerController this$0;

    public void onItemsChanged()
    {
        ImagePagerController.access$000(ImagePagerController.this).setNbrOfPages(ImagePagerController.access$300(ImagePagerController.this).getCount());
        if (ImagePagerController.access$300(ImagePagerController.this).getCount() > 1)
        {
            ImagePagerController.access$000(ImagePagerController.this).setVisibility(0);
            ImagePagerController.access$000(ImagePagerController.this).setPosition(ImagePagerController.access$200(ImagePagerController.this).getCurrentItem());
            return;
        } else
        {
            ImagePagerController.access$000(ImagePagerController.this).setVisibility(8);
            return;
        }
    }

    msChangedListener()
    {
        this$0 = ImagePagerController.this;
        super();
    }
}
