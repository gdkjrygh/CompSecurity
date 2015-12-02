// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.payment;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import butterknife.ButterKnife;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.ui.TextView;
import dui;
import eqk;
import esj;
import eyy;
import java.util.List;

// Referenced classes of package com.ubercab.client.feature.payment:
//            PaymentProfileAdapter

class mImageViewCheck
    implements eqk
{

    final PaymentProfileAdapter a;
    private boolean b;
    TextView mDefaultTextView;
    ImageView mImageViewCheck;
    RadioButton mRadioButtonItem;
    TextView mTextView;

    public void a(PaymentProfile paymentprofile, List list, PaymentProfile paymentprofile1)
    {
        boolean flag1 = true;
        int i = 0;
        Object obj = esj.a(mTextView.getContext(), paymentprofile.getCardType());
        mTextView.setCompoundDrawablesWithIntrinsicBounds(((android.graphics.drawable.Drawable) (obj)), null, null, null);
        obj = mTextView;
        android.content.Context context = PaymentProfileAdapter.a(a);
        boolean flag;
        if (!PaymentProfileAdapter.b(a).f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((TextView) (obj)).setText(dui.a(context, paymentprofile, list, flag));
        PaymentProfileAdapter.a(a, paymentprofile, mDefaultTextView);
        if (paymentprofile1 != null && paymentprofile.getUuid().equals(paymentprofile1.getUuid()))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mRadioButtonItem.setChecked(flag);
        if (b)
        {
            paymentprofile = mImageViewCheck;
            if (!flag)
            {
                i = 8;
            }
            paymentprofile.setVisibility(i);
        }
    }

    (PaymentProfileAdapter paymentprofileadapter, View view, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        a = paymentprofileadapter;
        super();
        ButterKnife.inject(this, view);
        b = flag1;
        paymentprofileadapter = mRadioButtonItem;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        paymentprofileadapter.setVisibility(i);
        paymentprofileadapter = mImageViewCheck;
        if (flag1)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 8;
        }
        paymentprofileadapter.setVisibility(i);
    }
}
