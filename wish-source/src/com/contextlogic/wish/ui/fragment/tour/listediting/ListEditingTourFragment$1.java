// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.tour.listediting;


// Referenced classes of package com.contextlogic.wish.ui.fragment.tour.listediting:
//            ListEditingTourFragment

class this._cls0
    implements android.support.v4.view.ener
{

    final ListEditingTourFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        if (i >= 4)
        {
            dismissModal();
            return;
        } else
        {
            ListEditingTourFragment.access$000(ListEditingTourFragment.this);
            return;
        }
    }

    ()
    {
        this$0 = ListEditingTourFragment.this;
        super();
    }
}
