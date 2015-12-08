// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class val.scrollView
    implements Runnable
{

    final val.scrollView this$1;
    final ScrollView val$scrollView;

    public void run()
    {
        int i = ViewUtil.findViewById(SaverDashboardPresenter.access$700(_fld0), 0x7f100494).getHeight();
        val$scrollView.smoothScrollTo(0, i);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$scrollView = ScrollView.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/saver/SaverDashboardPresenter$8

/* anonymous class */
    class SaverDashboardPresenter._cls8 extends OnSingleClickListener
    {

        final SaverDashboardPresenter this$0;

        private void scrollToContent()
        {
            ScrollView scrollview = (ScrollView)SaverDashboardPresenter.access$700(SaverDashboardPresenter.this);
            scrollview.post(scrollview. new SaverDashboardPresenter._cls8._cls2());
        }

        public void onSingleClick(View view)
        {
            if (!SaverDashboardPresenter.access$500(SaverDashboardPresenter.this))
            {
                SaverDashboardPresenter.access$600(SaverDashboardPresenter.this);
                SaverDashboardPresenter.access$700(SaverDashboardPresenter.this).post(new SaverDashboardPresenter._cls8._cls1());
                return;
            } else
            {
                scrollToContent();
                return;
            }
        }


            
            {
                this$0 = SaverDashboardPresenter.this;
                super(presenter);
            }

        // Unreferenced inner class com/walmart/android/app/saver/SaverDashboardPresenter$8$1

/* anonymous class */
        class SaverDashboardPresenter._cls8._cls1
            implements Runnable
        {

            final SaverDashboardPresenter._cls8 this$1;

            public void run()
            {
                ViewUtil.findViewById(SaverDashboardPresenter.access$700(this$0), 0x7f100498).setVisibility(0);
                scrollToContent();
                SaverDashboardPresenter.access$502(this$0, true);
            }

                    
                    {
                        this$1 = SaverDashboardPresenter._cls8.this;
                        super();
                    }
        }

    }

}
