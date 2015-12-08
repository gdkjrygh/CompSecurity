// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v7.widget:
//            GridLayout

public static class D extends android.view.rams
{

    private static final int BOTTOM_MARGIN;
    private static final int COLUMN;
    private static final int COLUMN_SPAN;
    private static final int COLUMN_WEIGHT;
    private static final int DEFAULT_COLUMN = 0x80000000;
    private static final int DEFAULT_HEIGHT = -2;
    private static final int DEFAULT_MARGIN = 0x80000000;
    private static final int DEFAULT_ROW = 0x80000000;
    private static final  DEFAULT_SPAN;
    private static final int DEFAULT_SPAN_SIZE;
    private static final int DEFAULT_WIDTH = -2;
    private static final int GRAVITY;
    private static final int LEFT_MARGIN;
    private static final int MARGIN;
    private static final int RIGHT_MARGIN;
    private static final int ROW;
    private static final int ROW_SPAN;
    private static final int ROW_WEIGHT;
    private static final int TOP_MARGIN;
    public  columnSpec;
    public  rowSpec;

    private void init(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, android.support.v7.gridlayout.ayout);
        int i = context.getInt(GRAVITY, 0);
        int j = context.getInt(COLUMN, 0x80000000);
        int k = context.getInt(COLUMN_SPAN, DEFAULT_SPAN_SIZE);
        float f = context.getFloat(COLUMN_WEIGHT, 0.0F);
        columnSpec = GridLayout.spec(j, k, GridLayout.getAlignment(i, true), f);
        j = context.getInt(ROW, 0x80000000);
        k = context.getInt(ROW_SPAN, DEFAULT_SPAN_SIZE);
        f = context.getFloat(ROW_WEIGHT, 0.0F);
        rowSpec = GridLayout.spec(j, k, GridLayout.getAlignment(i, false), f);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void reInitSuper(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, android.support.v7.gridlayout.ayout);
        int i = context.getDimensionPixelSize(MARGIN, 0x80000000);
        leftMargin = context.getDimensionPixelSize(LEFT_MARGIN, i);
        topMargin = context.getDimensionPixelSize(TOP_MARGIN, i);
        rightMargin = context.getDimensionPixelSize(RIGHT_MARGIN, i);
        bottomMargin = context.getDimensionPixelSize(BOTTOM_MARGIN, i);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (BOTTOM_MARGIN)obj;
            if (!columnSpec.columnSpec(((columnSpec) (obj)).columnSpec))
            {
                return false;
            }
            if (!rowSpec.rowSpec(((rowSpec) (obj)).rowSpec))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return rowSpec.() * 31 + columnSpec.();
    }

    protected void setBaseAttributes(TypedArray typedarray, int i, int j)
    {
        width = typedarray.getLayoutDimension(i, -2);
        height = typedarray.getLayoutDimension(j, -2);
    }

    final void setColumnSpecSpan(height height)
    {
        columnSpec = columnSpec.eSpan(height);
    }

    public void setGravity(int i)
    {
        rowSpec = rowSpec.eAlignment(GridLayout.getAlignment(i, false));
        columnSpec = columnSpec.eAlignment(GridLayout.getAlignment(i, true));
    }

    final void setRowSpecSpan(eAlignment ealignment)
    {
        rowSpec = rowSpec.eSpan(ealignment);
    }

    static 
    {
        DEFAULT_SPAN = new t>(0x80000000, 0x80000001);
        DEFAULT_SPAN_SIZE = DEFAULT_SPAN.();
        MARGIN = android.support.v7.gridlayout.ayout_android_layout_margin;
        LEFT_MARGIN = android.support.v7.gridlayout.ayout_android_layout_marginLeft;
        TOP_MARGIN = android.support.v7.gridlayout.ayout_android_layout_marginTop;
        RIGHT_MARGIN = android.support.v7.gridlayout.ayout_android_layout_marginRight;
        BOTTOM_MARGIN = android.support.v7.gridlayout.ayout_android_layout_marginBottom;
        COLUMN = android.support.v7.gridlayout.ayout_layout_column;
        COLUMN_SPAN = android.support.v7.gridlayout.ayout_layout_columnSpan;
        COLUMN_WEIGHT = android.support.v7.gridlayout.ayout_layout_columnWeight;
        ROW = android.support.v7.gridlayout.ayout_layout_row;
        ROW_SPAN = android.support.v7.gridlayout.ayout_layout_rowSpan;
        ROW_WEIGHT = android.support.v7.gridlayout.ayout_layout_rowWeight;
        GRAVITY = android.support.v7.gridlayout.ayout_layout_gravity;
    }

    public ()
    {
        this(D, D);
    }

    private D(int i, int j, int k, int l, int i1, int j1, D d, 
            D d1)
    {
        super(i, j);
        rowSpec = D;
        columnSpec = D;
        setMargins(k, l, i1, j1);
        rowSpec = d;
        columnSpec = d1;
    }

    public columnSpec(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        rowSpec = D;
        columnSpec = D;
        reInitSuper(context, attributeset);
        init(context, attributeset);
    }

    public init(init init1)
    {
        super(init1);
        rowSpec = D;
        columnSpec = D;
        rowSpec = init1.rowSpec;
        columnSpec = init1.columnSpec;
    }

    public columnSpec(columnSpec columnspec, columnSpec columnspec1)
    {
        this(-2, -2, 0x80000000, 0x80000000, 0x80000000, 0x80000000, columnspec, columnspec1);
    }

    public <init>(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        rowSpec = D;
        columnSpec = D;
    }

    public D(android.view.rams rams)
    {
        super(rams);
        rowSpec = D;
        columnSpec = D;
    }
}
