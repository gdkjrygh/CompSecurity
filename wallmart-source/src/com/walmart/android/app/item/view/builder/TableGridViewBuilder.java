// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view.builder;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayout;
import android.view.View;

// Referenced classes of package com.walmart.android.app.item.view.builder:
//            ViewBuilder

public class TableGridViewBuilder extends ViewBuilder
{
    static class TableGridViewLayoutBuilder
    {

        protected int columnCount;
        protected int columnSpan;
        protected int columnStart;
        private final int gravity = 119;
        protected android.support.v7.widget.GridLayout.LayoutParams layoutParams;
        private final int weight = 1;

        public android.view.ViewGroup.LayoutParams build()
        {
            layoutParams.columnSpec = GridLayout.spec(columnStart, columnSpan, 1.0F);
            return layoutParams;
        }

        public TableGridViewLayoutBuilder span(int i)
        {
            columnSpan = i;
            return this;
        }

        public TableGridViewLayoutBuilder(GridLayout gridlayout)
        {
            columnStart = 0x80000000;
            columnSpan = 1;
            columnCount = gridlayout.getColumnCount();
            layoutParams = new android.support.v7.widget.GridLayout.LayoutParams();
            layoutParams.width = 0;
            layoutParams.height = -2;
            layoutParams.setGravity(119);
        }
    }


    private int mColorableChildIdx;
    private int mEvenRowColor;
    private int mOddRowColor;

    public TableGridViewBuilder(Context context, int i)
    {
        super(context);
        mColorableChildIdx = 0;
        mEvenRowColor = 0;
        mOddRowColor = 0;
        mView = new GridLayout(context);
        ((GridLayout)mView).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        ((GridLayout)mView).setColumnCount(i);
    }

    private android.view.ViewGroup.LayoutParams getDefaultParams()
    {
        return (new TableGridViewLayoutBuilder((GridLayout)mView)).build();
    }

    private boolean isEvenColorableRow()
    {
        return (mColorableChildIdx / ((GridLayout)mView).getColumnCount()) % 2 == 0;
    }

    private View title(String s)
    {
        s = text(s).build();
        s.setLayoutParams(layout().span(((GridLayout)mView).getColumnCount()).build());
        return s;
    }

    public View colorable(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        int i;
        if (isEvenColorableRow())
        {
            i = mEvenRowColor;
        } else
        {
            i = mOddRowColor;
        }
        view.setBackgroundColor(i);
        view.setPadding(TWO_DP, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        if (layoutparams == null)
        {
            layoutparams = getDefaultParams();
        }
        view.setLayoutParams(layoutparams);
        mColorableChildIdx = mColorableChildIdx + 1;
        return view;
    }

    public View colorable(ViewBuilder.TextViewBuilder textviewbuilder)
    {
        return colorable(((View) (textviewbuilder.build())), getDefaultParams());
    }

    public View footer(String s)
    {
        return title(s);
    }

    protected int getColor(int i)
    {
        return mContext.getResources().getColor(i);
    }

    public View header(String s)
    {
        return title(s);
    }

    protected void setColorableRowColor(int i, int j)
    {
        mEvenRowColor = i;
        mOddRowColor = j;
    }
}
