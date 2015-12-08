// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CreditCardIconView extends ImageView
{

    public CreditCardIconView(Context context)
    {
        super(context);
    }

    public CreditCardIconView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CreditCardIconView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public CreditCardIconView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
    }

    public void setCardType(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 64
    //                   -1553624974: 124
    //                   2012639: 138
    //                   2634817: 110
    //                   160335816: 180
    //                   1055811561: 152
    //                   1469170623: 166;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_180;
_L8:
        switch (byte0)
        {
        default:
            setImageDrawable(null);
            return;

        case 0: // '\0'
            setImageResource(com.walmartlabs.android.payment.R.drawable.card_visa);
            return;

        case 1: // '\001'
            setImageResource(com.walmartlabs.android.payment.R.drawable.card_mastercard);
            return;

        case 2: // '\002'
            setImageResource(com.walmartlabs.android.payment.R.drawable.card_amex);
            return;

        case 3: // '\003'
            setImageResource(com.walmartlabs.android.payment.R.drawable.card_discover);
            return;

        case 4: // '\004'
            setImageResource(com.walmartlabs.android.payment.R.drawable.card_walmart);
            return;

        case 5: // '\005'
            setImageResource(com.walmartlabs.android.payment.R.drawable.credit_card_walmart);
            break;
        }
        break MISSING_BLOCK_LABEL_241;
_L4:
        if (s.equals("VISA"))
        {
            byte0 = 0;
        }
          goto _L8
_L2:
        if (s.equals("MASTERCARD"))
        {
            byte0 = 1;
        }
          goto _L8
_L3:
        if (s.equals("AMEX"))
        {
            byte0 = 2;
        }
          goto _L8
_L6:
        if (s.equals("DISCOVER"))
        {
            byte0 = 3;
        }
          goto _L8
_L7:
        if (s.equals("WMUSGESTORECARD"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("WMMASTERCARD"))
        {
            byte0 = 5;
        }
          goto _L8
    }
}
