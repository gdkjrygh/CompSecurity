// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ui;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.walmart.android.ui.PagerDotView;

// Referenced classes of package com.walmart.android.app.ui:
//            ImagePagerController, ImagePagerAdapter

class this._cls0
    implements stItemDisplayedListener
{

    final ImagePagerController this$0;

    public void onFirstItemDisplayed()
    {
        ImagePagerController.access$400(ImagePagerController.this).setVisibility(8);
        int i = ImagePagerController.access$300(ImagePagerController.this).getCount();
        ImagePagerController.access$000(ImagePagerController.this).setNbrOfPages(i);
        if (i > 1)
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

    stItemDisplayedListener()
    {
        this$0 = ImagePagerController.this;
        super();
    }
}
