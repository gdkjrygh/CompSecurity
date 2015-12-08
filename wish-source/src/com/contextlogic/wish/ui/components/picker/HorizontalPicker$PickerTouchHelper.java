// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.picker;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package com.contextlogic.wish.ui.components.picker:
//            HorizontalPicker

private static class mPicker extends ExploreByTouchHelper
{

    private HorizontalPicker mPicker;

    protected int getVirtualViewAt(float f, float f1)
    {
        f1 = (float)HorizontalPicker.access$100(mPicker) + HorizontalPicker.access$200(mPicker);
        f = (((float)mPicker.getScrollX() + f) - (float)HorizontalPicker.access$300(mPicker) * f1) / f1;
        if (f < 0.0F || f > (float)HorizontalPicker.access$400(mPicker).length)
        {
            return 0x80000000;
        } else
        {
            return (int)f;
        }
    }

    protected void getVisibleVirtualViews(List list)
    {
        int k;
        int i1;
        float f = (float)HorizontalPicker.access$100(mPicker) + HorizontalPicker.access$200(mPicker);
        float f1 = (float)mPicker.getScrollX() - (float)HorizontalPicker.access$300(mPicker) * f;
        i1 = (int)(f1 / f);
        int i = HorizontalPicker.access$300(mPicker) * 2 + 1;
        k = i;
        if (f1 % f != 0.0F)
        {
            k = i + 1;
        }
        if (i1 >= 0) goto _L2; else goto _L1
_L1:
        int j;
        int l;
        j = k + i1;
        l = 0;
_L4:
        for (k = 0; k < j; k++)
        {
            list.add(Integer.valueOf(l + k));
        }

        break; /* Loop/switch isn't completed */
_L2:
        l = i1;
        j = k;
        if (i1 + k > HorizontalPicker.access$400(mPicker).length)
        {
            j = HorizontalPicker.access$400(mPicker).length - i1;
            l = i1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected boolean onPerformActionForVirtualView(int i, int j, Bundle bundle)
    {
        return false;
    }

    protected void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityevent)
    {
        accessibilityevent.setContentDescription(HorizontalPicker.access$400(mPicker)[i]);
    }

    protected void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        float f = (float)HorizontalPicker.access$100(mPicker) + HorizontalPicker.access$200(mPicker);
        float f1 = mPicker.getScrollX();
        float f2 = HorizontalPicker.access$300(mPicker);
        int j = (int)((float)i * f - (f1 - f2 * f));
        int k = HorizontalPicker.access$100(mPicker);
        accessibilitynodeinfocompat.setContentDescription(HorizontalPicker.access$400(mPicker)[i]);
        accessibilitynodeinfocompat.setBoundsInParent(new Rect(j, 0, j + k, mPicker.getHeight()));
        accessibilitynodeinfocompat.addAction(16);
    }

    public (HorizontalPicker horizontalpicker)
    {
        super(horizontalpicker);
        mPicker = horizontalpicker;
    }
}
