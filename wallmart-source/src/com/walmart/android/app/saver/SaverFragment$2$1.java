// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverFragment

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        SaverFragment.access$200(_fld0).requestLayout();
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/saver/SaverFragment$2

/* anonymous class */
    class SaverFragment._cls2
        implements android.view.View.OnLayoutChangeListener
    {

        final SaverFragment this$0;

        public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            boolean flag = SaverFragment.access$000(SaverFragment.this);
            if (l >= l1 || (double)l >= (double)ViewUtil.getScreenHeight(getActivity()) * 0.66000000000000003D) goto _L2; else goto _L1
_L1:
            SaverFragment.access$002(SaverFragment.this, true);
_L4:
            if (flag != SaverFragment.access$000(SaverFragment.this))
            {
                SaverFragment.access$100(SaverFragment.this);
                SaverFragment.access$300(SaverFragment.this).post(new SaverFragment._cls2._cls1());
            }
            return;
_L2:
            if (l != l1)
            {
                SaverFragment.access$002(SaverFragment.this, false);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            
            {
                this$0 = SaverFragment.this;
                super();
            }
    }

}
