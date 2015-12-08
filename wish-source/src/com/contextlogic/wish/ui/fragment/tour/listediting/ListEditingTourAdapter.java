// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.tour.listediting;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.contextlogic.wish.util.BitmapUtil;

// Referenced classes of package com.contextlogic.wish.ui.fragment.tour.listediting:
//            ListEditingTourFragment

public class ListEditingTourAdapter extends PagerAdapter
{

    private Context context;
    private ListEditingTourFragment fragment;

    public ListEditingTourAdapter(Context context1, ListEditingTourFragment listeditingtourfragment)
    {
        context = context1;
        fragment = listeditingtourfragment;
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public int getCount()
    {
        return 5;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        Object obj = (LayoutInflater)context.getSystemService("layout_inflater");
        i;
        JVM INSTR tableswitch 0 3: default 44
    //                   0 63
    //                   1 106
    //                   2 149
    //                   3 192;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        obj = new RelativeLayout(context);
_L7:
        viewgroup.addView(((View) (obj)));
        return obj;
_L2:
        obj = ((LayoutInflater) (obj)).inflate(0x7f030069, null);
        ((View) (obj)).findViewById(0x7f0d0224).setOnClickListener(new android.view.View.OnClickListener() {

            final ListEditingTourAdapter this$0;

            public void onClick(View view)
            {
                fragment.onLearnMoreClicked();
            }

            
            {
                this$0 = ListEditingTourAdapter.this;
                super();
            }
        });
        BitmapUtil.safeSetImageResource((ImageView)((View) (obj)).findViewById(0x7f0d0223), 0x7f020141);
        continue; /* Loop/switch isn't completed */
_L3:
        obj = ((LayoutInflater) (obj)).inflate(0x7f03006b, null);
        BitmapUtil.safeSetImageResource((ImageView)((View) (obj)).findViewById(0x7f0d0227), 0x7f020143);
        ((View) (obj)).findViewById(0x7f0d0228).setOnClickListener(new android.view.View.OnClickListener() {

            final ListEditingTourAdapter this$0;

            public void onClick(View view)
            {
                fragment.handleNext();
            }

            
            {
                this$0 = ListEditingTourAdapter.this;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L4:
        obj = ((LayoutInflater) (obj)).inflate(0x7f03006a, null);
        BitmapUtil.safeSetImageResource((ImageView)((View) (obj)).findViewById(0x7f0d0225), 0x7f020142);
        ((View) (obj)).findViewById(0x7f0d0226).setOnClickListener(new android.view.View.OnClickListener() {

            final ListEditingTourAdapter this$0;

            public void onClick(View view)
            {
                fragment.handleNext();
            }

            
            {
                this$0 = ListEditingTourAdapter.this;
                super();
            }
        });
        continue; /* Loop/switch isn't completed */
_L5:
        obj = ((LayoutInflater) (obj)).inflate(0x7f030068, null);
        BitmapUtil.safeSetImageResource((ImageView)((View) (obj)).findViewById(0x7f0d0221), 0x7f020140);
        ((View) (obj)).findViewById(0x7f0d0222).setOnClickListener(new android.view.View.OnClickListener() {

            final ListEditingTourAdapter this$0;

            public void onClick(View view)
            {
                fragment.onViewProfileClicked();
            }

            
            {
                this$0 = ListEditingTourAdapter.this;
                super();
            }
        });
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

}
