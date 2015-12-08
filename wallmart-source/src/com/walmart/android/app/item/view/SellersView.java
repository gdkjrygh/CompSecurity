// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;

public class SellersView extends LinearLayout
{

    private TextView mHeader;
    private TextView mStartingFromText;

    public SellersView(Context context)
    {
        super(context);
    }

    public SellersView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SellersView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public SellersView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        mHeader = (TextView)ViewUtil.findViewById(this, 0x7f1001ea);
        mStartingFromText = (TextView)ViewUtil.findViewById(this, 0x7f1001ec);
    }

    public void setAdditionalSellersCount(int i)
    {
        mHeader.setText(String.valueOf(i));
        SpannableStringBuilder spannablestringbuilder = (new SpannableStringBuilder(getContext().getString(0x7f0901c7))).append(" ");
        int j = spannablestringbuilder.length();
        spannablestringbuilder.append("(").append(String.valueOf(i)).append(")");
        spannablestringbuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(0x7f0f0109)), j, spannablestringbuilder.length(), 18);
        mHeader.setText(spannablestringbuilder);
    }

    public void setStartingPrice(String s)
    {
        SpannableStringBuilder spannablestringbuilder = (new SpannableStringBuilder(getContext().getString(0x7f0901c8))).append(" ");
        int i = spannablestringbuilder.length();
        if (!s.startsWith("$"))
        {
            spannablestringbuilder.append("$");
        }
        spannablestringbuilder.append(s);
        int j = spannablestringbuilder.length();
        spannablestringbuilder.append(getResources().getString(0x7f09019a));
        spannablestringbuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(0x7f0f006e)), i, j, 18);
        spannablestringbuilder.setSpan(new TextAppearanceSpan(getContext(), 0x7f0b00d0), j, spannablestringbuilder.length(), 33);
        mStartingFromText.setText(spannablestringbuilder);
    }
}
