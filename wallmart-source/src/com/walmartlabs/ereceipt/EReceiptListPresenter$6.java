// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmartlabs.ereceipt:
//            EReceiptListPresenter

class this._cls0 extends PagerAdapter
{

    final EReceiptListPresenter this$0;

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return 6;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        boolean flag = false;
        i;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 104
    //                   1 83
    //                   2 90
    //                   3 97
    //                   4 104
    //                   5 83;
           goto _L1 _L2 _L3 _L4 _L5 _L2 _L3
_L1:
        i = ((flag) ? 1 : 0);
_L7:
        View view = ViewUtil.inflate(EReceiptListPresenter.access$700(EReceiptListPresenter.this), com.walmartlabs.android.ereceipt., viewgroup);
        ((ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.ereceipt.)).setImageResource(i);
        viewgroup.addView(view);
        return view;
_L3:
        i = com.walmartlabs.android.ereceipt._one;
        continue; /* Loop/switch isn't completed */
_L4:
        i = com.walmartlabs.android.ereceipt._two;
        continue; /* Loop/switch isn't completed */
_L5:
        i = com.walmartlabs.android.ereceipt._three;
        continue; /* Loop/switch isn't completed */
_L2:
        i = com.walmartlabs.android.ereceipt._four;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    ()
    {
        this$0 = EReceiptListPresenter.this;
        super();
    }
}
