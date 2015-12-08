// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

class ds extends ds
{

    private int size;
    final size this$0;

    protected int getOffset(GridLayout gridlayout, View view, nment nment, int i, boolean flag)
    {
        return Math.max(0, super.getOffset(gridlayout, view, nment, i, flag));
    }

    protected void include(int i, int j)
    {
        super.include(i, j);
        size = Math.max(size, i + j);
    }

    protected void reset()
    {
        super.reset();
        size = 0x80000000;
    }

    protected int size(boolean flag)
    {
        return Math.max(super.size(flag), size);
    }

    ds()
    {
        this$0 = this._cls0.this;
        super(null);
    }

    // Unreferenced inner class android/support/v7/widget/GridLayout$7

/* anonymous class */
    static final class GridLayout._cls7 extends GridLayout.Alignment
    {

        public int getAlignmentValue(View view, int i, int j)
        {
            if (view.getVisibility() == 8)
            {
                i = 0;
            } else
            {
                j = view.getBaseline();
                i = j;
                if (j == -1)
                {
                    return 0x80000000;
                }
            }
            return i;
        }

        public GridLayout.Bounds getBounds()
        {
            return new GridLayout._cls7._cls1();
        }

        String getDebugString()
        {
            return "BASELINE";
        }

        int getGravityOffset(View view, int i)
        {
            return 0;
        }

    }

}
