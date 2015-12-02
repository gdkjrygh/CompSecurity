// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.signup.payment;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import dbf;
import gmg;
import gpp;
import gsa;
import java.util.List;

public final class CashPaymentTypeAdapter extends ArrayAdapter
{

    private final gmg a;

    public CashPaymentTypeAdapter(Context context, List list, gmg gmg1)
    {
        super(context, 0, list);
        a = gmg1;
    }

    private CharSequence a(String s)
    {
        if (a.b(dbf.m) || s == null)
        {
            return s;
        }
        String s1 = a();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        if (a.a(dbf.m, "type", "").equals("below_text"))
        {
            spannablestringbuilder.append("\n");
        } else
        {
            s1 = String.format(" (%s)", new Object[] {
                s1
            });
        }
        spannablestringbuilder.append(s1);
        spannablestringbuilder.setSpan(new ForegroundColorSpan(b()), s.length(), spannablestringbuilder.length(), 33);
        spannablestringbuilder.setSpan(new StyleSpan(0x7f0901eb), s.length(), spannablestringbuilder.length(), 33);
        return spannablestringbuilder;
    }

    private String a()
    {
        String s;
        double d = a.a(dbf.m, "handle_fee", 0.0D);
        s = gpp.a(getContext(), d);
        String s1;
        s1 = a.b(dbf.m, "handle_fee_message");
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        s1 = String.format(s1, new Object[] {
            s
        });
        return s1;
        Exception exception;
        exception;
        return getContext().getString(0x7f070088, new Object[] {
            s
        });
    }

    private int b()
    {
        int i;
        String s = a.b(dbf.m, "handle_fee_color");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_28;
        }
        i = Color.parseColor(s);
        return i;
        Exception exception;
        exception;
        return getContext().getResources().getColor(0x7f0d0078);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(getContext()).inflate(0x7f030126, viewgroup, false);
            view1.setTag(new ViewHolder(view1));
        }
        view = (gsa)getItem(i);
        viewgroup = view.b();
        ((ViewHolder)view1.getTag()).a(view, a(viewgroup));
        return view1;
    }

    private class ViewHolder
    {

        private final Resources a;
        TextView mTextViewType;

        public final void a(gsa gsa1, CharSequence charsequence)
        {
            mTextViewType.setText(charsequence);
            mTextViewType.setCompoundDrawablesWithIntrinsicBounds(gsa1.c(), null, null, null);
        }

        public ViewHolder(View view)
        {
            a = view.getResources();
            ButterKnife.inject(this, view);
        }
    }

}
