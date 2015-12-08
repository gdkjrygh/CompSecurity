// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.ui;

import com.walmart.android.ui.PagerDotView;

// Referenced classes of package com.walmart.android.app.ui:
//            ImagePagerController

class this._cls0
    implements android.support.v4.view.istener
{

    final ImagePagerController this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        ImagePagerController.access$000(ImagePagerController.this).setPosition(i);
    }

    ener()
    {
        this$0 = ImagePagerController.this;
        super();
    }
}
