// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.capacity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.ui.TextView;
import fuf;
import gjz;
import java.util.List;

public class CapacityActionSheetView extends LinearLayout
{

    LayoutInflater a;
    private fuf b;
    ViewGroup mActionViewGroup;
    TextView mFooter;
    TextView mHeader;

    public CapacityActionSheetView(Context context)
    {
        this(context, null);
    }

    public CapacityActionSheetView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CapacityActionSheetView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = LayoutInflater.from(getContext());
    }

    static fuf a(CapacityActionSheetView capacityactionsheetview)
    {
        return capacityactionsheetview.b;
    }

    public final void a(fuf fuf1)
    {
        b = (fuf)gjz.a(fuf1);
    }

    public final void a(List list)
    {
        gjz.a(list);
        mActionViewGroup.removeAllViews();
        for (int i = 0; i < list.size(); i++)
        {
            TextView textview = (TextView)a.inflate(0x7f0301cc, mActionViewGroup, false);
            mActionViewGroup.addView(textview);
            textview.setText((CharSequence)list.get(i));
            textview.setOnClickListener(new android.view.View.OnClickListener(i) {

                final int a;
                final CapacityActionSheetView b;

                public final void onClick(View view)
                {
                    if (CapacityActionSheetView.a(b) != null)
                    {
                        CapacityActionSheetView.a(b).a(a);
                    }
                }

            
            {
                b = CapacityActionSheetView.this;
                a = i;
                super();
            }
            });
        }

    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            return;
        }
    }
}
