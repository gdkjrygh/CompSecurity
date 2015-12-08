// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

// Referenced classes of package android.support.v4.widget:
//            AutoScrollHelper

public class ListViewAutoScrollHelper extends AutoScrollHelper
{

    private final ListView mTarget;

    public ListViewAutoScrollHelper(ListView listview)
    {
        super(listview);
        mTarget = listview;
    }

    public boolean canTargetScrollHorizontally(int i)
    {
        return false;
    }

    public boolean canTargetScrollVertically(int i)
    {
        ListView listview;
        int j;
        listview = mTarget;
        j = listview.getCount();
        if (j != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int l;
        int k = listview.getChildCount();
        l = listview.getFirstVisiblePosition();
        if (i <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l + k >= j && listview.getChildAt(k - 1).getBottom() <= listview.getHeight())
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        return true;
        if (i >= 0) goto _L1; else goto _L3
_L3:
        if (l <= 0 && listview.getChildAt(0).getTop() >= 0)
        {
            return false;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void scrollTargetBy(int i, int j)
    {
        ListView listview = mTarget;
        i = listview.getFirstVisiblePosition();
        View view;
        if (i != -1)
        {
            if ((view = listview.getChildAt(0)) != null)
            {
                listview.setSelectionFromTop(i, view.getTop() - j);
                return;
            }
        }
    }
}
