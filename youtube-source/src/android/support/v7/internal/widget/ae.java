// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.a.c;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;

final class ae extends ListView
{

    private boolean a;
    private boolean b;

    public ae(Context context, boolean flag)
    {
        super(context, null, c.h);
        b = flag;
        setCacheColorHint(0);
    }

    static boolean a(ae ae1, boolean flag)
    {
        ae1.a = flag;
        return flag;
    }

    final int a(int i, int j, int k)
    {
        Object obj;
        ListAdapter listadapter;
        int l;
        int i1;
        k = getListPaddingTop();
        i1 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        l = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        k += i1;
_L4:
        return k;
_L2:
        k = i1 + k;
        int j1;
        int l1;
        if (l <= 0 || obj == null)
        {
            l = 0;
        }
        l1 = listadapter.getCount();
        i1 = 0;
        j1 = 0;
        obj = null;
        do
        {
label0:
            {
                if (i1 >= l1)
                {
                    break label0;
                }
                int k1 = listadapter.getItemViewType(i1);
                if (k1 != j1)
                {
                    j1 = k1;
                    obj = null;
                }
                obj = listadapter.getView(i1, ((View) (obj)), this);
                k1 = ((View) (obj)).getLayoutParams().height;
                if (k1 > 0)
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
                } else
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                ((View) (obj)).measure(i, k1);
                if (i1 > 0)
                {
                    k += l;
                }
                k1 = ((View) (obj)).getMeasuredHeight() + k;
                k = j;
                if (k1 >= j)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
                k = k1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return k;
    }

    public final boolean hasFocus()
    {
        return b || super.hasFocus();
    }

    public final boolean hasWindowFocus()
    {
        return b || super.hasWindowFocus();
    }

    public final boolean isFocused()
    {
        return b || super.isFocused();
    }

    public final boolean isInTouchMode()
    {
        return b && a || super.isInTouchMode();
    }
}
