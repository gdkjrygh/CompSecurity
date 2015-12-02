// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import butterknife.ButterKnife;
import com.ubercab.client.core.model.Client;
import com.ubercab.ui.TextView;

class a
{

    private final Context a;
    TextView mTextViewCode;
    TextView mTextViewDescription;

    public final void a(Client client)
    {
        String s = client.getReferralCode();
        client = client.getPromotion();
        if (s == null || client == null)
        {
            return;
        } else
        {
            mTextViewCode.setText(s.toUpperCase());
            (new SpannableString(client)).setSpan(new StyleSpan(1), 0, client.length(), 18);
            client = a.getString(0x7f0703f2, new Object[] {
                client
            });
            mTextViewDescription.setText(client);
            return;
        }
    }

    public (View view)
    {
        ButterKnife.inject(this, view);
        a = view.getContext();
    }
}
