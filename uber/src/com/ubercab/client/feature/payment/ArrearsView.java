// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.core.vendor.google.GoogleWalletActivity;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.UnpaidBill;
import com.ubercab.ui.TextView;
import java.util.List;

public class ArrearsView extends LinearLayout
{

    private List a;
    TextView mTextViewArrearsAmount;
    TextView mTextViewArrearsMessage;

    public ArrearsView(Context context)
    {
        this(context, null);
    }

    public ArrearsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ArrearsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private String a()
    {
        String s = getContext().getString(0x7f070784);
        Object obj;
        if (a == null || a.isEmpty())
        {
            obj = s;
        } else
        {
            obj = (UnpaidBill)a.get(0);
            String s1 = ((UnpaidBill) (obj)).getAmountString();
            if (!TextUtils.isEmpty(s1))
            {
                return s1;
            }
            s1 = ((UnpaidBill) (obj)).getAmount();
            obj = s1;
            if (TextUtils.isEmpty(s1))
            {
                return s;
            }
        }
        return ((String) (obj));
    }

    private String b(Client client)
    {
        Context context;
        boolean flag;
        if (GoogleWalletActivity.a(getContext(), null) && client.getLastSelectedPaymentProfileIsGoogleWallet())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = getContext();
        if (flag)
        {
            client = context.getString(0x7f070067);
        } else
        {
            client = client.findPaymentProfileByUuid(client.getLastSelectedPaymentProfileUUID());
            if (client == null)
            {
                client = context.getString(0x7f070066, new Object[] {
                    context.getString(0x7f070785)
                });
            } else
            if ("PayPal".equals(client.getCardType()))
            {
                client = context.getString(0x7f070068, new Object[] {
                    client.getAccountName()
                });
            } else
            {
                client = context.getString(0x7f070066, new Object[] {
                    client.getCardNumber()
                });
            }
        }
        return (new StringBuilder()).append(client).append(" ").append(context.getString(0x7f070069)).toString();
    }

    public final void a(Client client)
    {
        mTextViewArrearsMessage.setText(b(client));
        mTextViewArrearsAmount.setText(a());
    }

    public final void a(List list)
    {
        a = list;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }
}
