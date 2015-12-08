// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view.builder;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.walmart.android.app.WalmartLinkMovementMethod;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.Typefaces;

public class ViewBuilder
{
    static class GridViewLayoutBuilder
    {

        private android.support.v7.widget.GridLayout.Alignment alignment;
        private int columnSpan;
        private int columnStart;
        private android.support.v7.widget.GridLayout.LayoutParams layoutParams;

        public GridViewLayoutBuilder align(android.support.v7.widget.GridLayout.Alignment alignment1)
        {
            alignment = alignment1;
            return this;
        }

        public android.support.v7.widget.GridLayout.LayoutParams build()
        {
            layoutParams.columnSpec = GridLayout.spec(columnStart, columnSpan, alignment);
            return layoutParams;
        }

        public GridViewLayoutBuilder column(int i)
        {
            columnStart = i;
            return this;
        }

        public GridViewLayoutBuilder leftMargin(int i)
        {
            layoutParams.leftMargin = i;
            return this;
        }

        public GridViewLayoutBuilder span(int i)
        {
            columnSpan = i;
            return this;
        }

        public GridViewLayoutBuilder topMargin(int i)
        {
            layoutParams.topMargin = i;
            return this;
        }

        public GridViewLayoutBuilder width(int i)
        {
            layoutParams.width = i;
            return this;
        }

        public GridViewLayoutBuilder()
        {
            columnStart = 0;
            columnSpan = 1;
            alignment = GridLayout.FILL;
            layoutParams = new android.support.v7.widget.GridLayout.LayoutParams();
        }
    }

    static class TextViewBuilder
    {

        final TextView textView;

        public TextViewBuilder background(int i)
        {
            textView.setBackgroundColor(i);
            return this;
        }

        public TextViewBuilder bold()
        {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            return this;
        }

        public TextView build()
        {
            return textView;
        }

        public TextViewBuilder medium()
        {
            textView.setTypeface(Typefaces.create(textView.getContext(), com.walmart.android.wmui.Typefaces.Family.MEDIUM));
            return this;
        }

        public TextViewBuilder padding(int i)
        {
            textView.setPadding(i, i, i, i);
            return this;
        }

        public TextViewBuilder paddingBottom(int i)
        {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingBottom(), textView.getPaddingRight(), i);
            return this;
        }

        public TextViewBuilder paddingLeft(int i)
        {
            textView.setPadding(i, textView.getPaddingTop(), textView.getPaddingRight(), textView.getPaddingBottom());
            return this;
        }

        public TextViewBuilder paddingTop(int i)
        {
            textView.setPadding(textView.getPaddingLeft(), i, textView.getPaddingRight(), textView.getPaddingBottom());
            return this;
        }

        public TextViewBuilder size(int i)
        {
            textView.setTextSize(1, i);
            return this;
        }

        public TextViewBuilder text(CharSequence charsequence)
        {
            textView.setText(charsequence);
            return this;
        }

        public TextViewBuilder(Context context)
        {
            textView = new TextView(context);
            textView.setMovementMethod(WalmartLinkMovementMethod.getInstance(context));
            textView.setLinkTextColor(context.getResources().getColorStateList(0x7f0f014e));
        }
    }


    protected final int TWO_DP;
    protected Context mContext;
    protected ViewGroup mView;

    public ViewBuilder(Context context)
    {
        mContext = context;
        TWO_DP = ViewUtil.dpToPixels(2, mContext);
    }

    protected ViewBuilder add(View view)
    {
        mView.addView(view);
        return this;
    }

    protected ViewBuilder add(TextViewBuilder textviewbuilder)
    {
        add(((View) (textviewbuilder.build())));
        return this;
    }

    protected View divider(int i)
    {
        if (mView instanceof GridLayout)
        {
            View view = new View(mContext);
            view.setBackgroundColor(0xff000000);
            android.support.v7.widget.GridLayout.LayoutParams layoutparams = new android.support.v7.widget.GridLayout.LayoutParams();
            layoutparams.topMargin = TWO_DP;
            layoutparams.bottomMargin = TWO_DP;
            layoutparams.height = ViewUtil.dpToPixels(i, mContext);
            layoutparams.columnSpec = GridLayout.spec(0, ((GridLayout)mView).getColumnCount());
            view.setLayoutParams(layoutparams);
            return view;
        } else
        {
            throw new IllegalStateException("mView must be a GridLayout");
        }
    }

    protected GridViewLayoutBuilder layout()
    {
        return new GridViewLayoutBuilder();
    }

    protected TextViewBuilder text(int i)
    {
        return text(((CharSequence) (mContext.getString(i))));
    }

    protected TextViewBuilder text(CharSequence charsequence)
    {
        return (new TextViewBuilder(mContext)).text(charsequence);
    }

    protected transient TextViewBuilder[] texts(TextViewBuilder atextviewbuilder[])
    {
        return atextviewbuilder;
    }

    protected transient TextViewBuilder[] texts(CharSequence acharsequence[])
    {
        TextViewBuilder atextviewbuilder[] = new TextViewBuilder[acharsequence.length];
        int k = acharsequence.length;
        int j = 0;
        for (int i = 0; j < k; i++)
        {
            atextviewbuilder[i] = text(acharsequence[j]);
            j++;
        }

        return atextviewbuilder;
    }

    protected void withLayout(android.view.ViewGroup.LayoutParams layoutparams)
    {
        mView.getChildAt(mView.getChildCount() - 1).setLayoutParams(layoutparams);
    }

    protected void withLayout(GridViewLayoutBuilder gridviewlayoutbuilder)
    {
        withLayout(((android.view.ViewGroup.LayoutParams) (gridviewlayoutbuilder.build())));
    }
}
