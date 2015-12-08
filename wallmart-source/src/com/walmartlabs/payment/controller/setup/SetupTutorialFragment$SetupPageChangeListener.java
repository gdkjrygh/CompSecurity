// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.setup;

import com.walmartlabs.payment.view.PageIndicatorView;

// Referenced classes of package com.walmartlabs.payment.controller.setup:
//            SetupTutorialFragment

private class <init>
    implements android.support.v4.view.geChangeListener
{

    final SetupTutorialFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        SetupTutorialFragment.access$300(SetupTutorialFragment.this).setActivePage(i);
    }

    private ()
    {
        this$0 = SetupTutorialFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
