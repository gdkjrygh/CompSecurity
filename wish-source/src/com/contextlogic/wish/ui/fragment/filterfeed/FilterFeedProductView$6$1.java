// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;


// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedProductView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        FilterFeedProductView.access$1400(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/contextlogic/wish/ui/fragment/filterfeed/FilterFeedProductView$6

/* anonymous class */
    class FilterFeedProductView._cls6
        implements com.contextlogic.wish.api.service.ApiService.FailureCallback
    {

        final FilterFeedProductView this$0;

        public void onServiceFailed()
        {
            FilterFeedProductView.access$1300(FilterFeedProductView.this, new FilterFeedProductView._cls6._cls1());
        }

            
            {
                this$0 = FilterFeedProductView.this;
                super();
            }
    }

}
