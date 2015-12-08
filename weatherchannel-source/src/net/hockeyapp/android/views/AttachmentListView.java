// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentView

public class AttachmentListView extends ViewGroup
{

    static final boolean $assertionsDisabled;
    private int line_height;

    public AttachmentListView(Context context)
    {
        super(context);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof android.view.ViewGroup.LayoutParams;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.view.ViewGroup.LayoutParams(1, 1);
    }

    public ArrayList getAttachments()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < getChildCount(); i++)
        {
            arraylist.add(((AttachmentView)getChildAt(i)).getAttachmentUri());
        }

        return arraylist;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int l1 = getChildCount();
        l = getPaddingLeft();
        j = getPaddingTop();
        for (int j1 = 0; j1 < l1;)
        {
            View view = getChildAt(j1);
            int k1 = l;
            int i1 = j;
            if (view.getVisibility() != 8)
            {
                view.invalidate();
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                k1 = l;
                i1 = j;
                if (l + i2 > k - i)
                {
                    k1 = getPaddingLeft();
                    i1 = j + line_height;
                }
                view.layout(k1, i1, k1 + i2, i1 + j2);
                k1 += layoutparams.width + i2 + ((AttachmentView)view).getGap();
            }
            j1++;
            l = k1;
            j = i1;
        }

    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int k1;
        int l2;
        if (!$assertionsDisabled && android.view.View.MeasureSpec.getMode(i) == 0)
        {
            throw new AssertionError();
        }
        l2 = android.view.View.MeasureSpec.getSize(i);
        int i3 = getChildCount();
        i1 = 0;
        k1 = 0;
        int k = getPaddingLeft();
        i = getPaddingTop();
        for (int j1 = 0; j1 < i3;)
        {
            View view = getChildAt(j1);
            AttachmentView attachmentview = (AttachmentView)view;
            int k2 = attachmentview.getEffectiveMaxHeight() + attachmentview.getPaddingTop();
            int j2 = k1;
            int i2 = k;
            int l1 = i;
            if (view.getVisibility() != 8)
            {
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x80000000));
                l1 = view.getMeasuredWidth();
                j2 = Math.max(k1, view.getMeasuredHeight() + layoutparams.height);
                k1 = k;
                i1 = i;
                if (k + l1 > l2)
                {
                    k1 = getPaddingLeft();
                    i1 = i + j2;
                }
                i2 = k1 + (layoutparams.width + l1);
                l1 = i1;
            }
            j1++;
            i1 = k2;
            k1 = j2;
            k = i2;
            i = l1;
        }

        line_height = k1;
        if (android.view.View.MeasureSpec.getMode(j) != 0) goto _L2; else goto _L1
_L1:
        int l = i + k1 + getPaddingBottom();
_L4:
        setMeasuredDimension(l2, l);
        return;
_L2:
        l = i1;
        if (android.view.View.MeasureSpec.getMode(j) == 0x80000000)
        {
            l = i1;
            if (i + k1 + getPaddingBottom() < i1)
            {
                l = i + k1 + getPaddingBottom();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        boolean flag;
        if (!net/hockeyapp/android/views/AttachmentListView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
