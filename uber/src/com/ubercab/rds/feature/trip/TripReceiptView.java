// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.feature.trip;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ubercab.rds.core.model.TripReceipt;
import com.ubercab.rds.core.model.TripReceiptCharge;
import com.ubercab.rds.core.model.TripReceiptDetails;
import com.ubercab.rds.core.model.TripReceiptPayment;
import com.ubercab.rds.core.model.TripReceiptStats;
import com.ubercab.rds.core.model.TripReceiptStrings;
import com.ubercab.ui.TextView;
import cxg;
import hbk;
import hbm;
import hbo;
import hcr;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class TripReceiptView extends LinearLayout
{

    TextView a;
    TextView b;
    ImageView c;
    LinearLayout d;
    LinearLayout e;
    LinearLayout f;
    private LayoutInflater g;

    public TripReceiptView(Context context)
    {
        this(context, null);
    }

    public TripReceiptView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TripReceiptView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void a(LinearLayout linearlayout)
    {
        linearlayout.addView(g.inflate(hbm.ub__divider_padded, linearlayout, false));
    }

    private void a(LinearLayout linearlayout, String s, String s1, String s2)
    {
        LinearLayout linearlayout1 = (LinearLayout)g.inflate(hbm.ub__trip_problem_receipt_item, linearlayout, false);
        TextView textview = (TextView)linearlayout1.findViewById(hbk.ub__receipt_item_name);
        TextView textview1 = (TextView)linearlayout1.findViewById(hbk.ub__receipt_item_rate);
        TextView textview2 = (TextView)linearlayout1.findViewById(hbk.ub__receipt_item_amount);
        textview.setText(s);
        textview1.setText(s1);
        textview2.setText(s2);
        linearlayout.addView(linearlayout1);
    }

    public final void a(TripReceipt tripreceipt)
    {
        TripReceiptDetails tripreceiptdetails;
        List list;
        int i;
        d.removeAllViews();
        e.removeAllViews();
        f.removeAllViews();
        tripreceiptdetails = tripreceipt.getDetails();
        if (tripreceiptdetails == null)
        {
            break MISSING_BLOCK_LABEL_598;
        }
        list = tripreceiptdetails.getPrimaryCharges();
        if (list == null || list.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        i = 0;
_L3:
        if (i >= list.size()) goto _L2; else goto _L1
_L1:
        TripReceiptCharge tripreceiptcharge = (TripReceiptCharge)list.get(i);
        if (tripreceiptcharge == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj1 = tripreceiptcharge.getName();
        String s = tripreceiptcharge.getAmount();
        if (i == 0)
        {
            Object obj = tripreceipt.getStats();
            float f1;
            Exception exception;
            Object obj2;
            if (obj != null)
            {
                obj = ((TripReceiptStats) (obj)).getVehicleType();
            } else
            {
                obj = null;
            }
        } else
        {
label0:
            {
label1:
                {
                    obj2 = tripreceiptcharge.getInputAmount();
                    obj = tripreceiptcharge.getInputType();
                    if (obj2 == null || obj == null)
                    {
                        break MISSING_BLOCK_LABEL_672;
                    }
                    try
                    {
                        f1 = Float.parseFloat(((String) (obj2)));
                        if (!"fare.charges.distance".equals(tripreceiptcharge.getType()) || !"Miles".equals(obj) || !cxg.a(Locale.getDefault()))
                        {
                            break label1;
                        }
                        f1 = (float)cxg.c(f1);
                        obj1 = getResources().getString(hbo.ub__rds__km);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Exception exception)
                    {
                        exception = ((Exception) (obj2));
                        break label0;
                    }
                    obj = obj1;
                }
                try
                {
                    obj1 = String.format("%.2f", new Object[] {
                        Float.valueOf(f1)
                    });
                }
                // Misplaced declaration of an exception variable
                catch (Exception exception)
                {
                    exception = ((Exception) (obj2));
                }
            }
            obj2 = new StringBuilder();
            ((StringBuilder) (obj2)).append(((String) (obj1)));
            ((StringBuilder) (obj2)).append(" ");
            ((StringBuilder) (obj2)).append(((String) (obj)));
            obj1 = ((StringBuilder) (obj2)).toString();
            obj = null;
        }
        a(d, ((String) (obj1)), ((String) (obj)), s);
        i++;
          goto _L3
_L2:
        obj = tripreceiptdetails.getSurge();
        if (obj != null)
        {
            obj1 = tripreceiptdetails.getPrimarySubtotal();
            if (obj1 != null)
            {
                obj2 = getContext().getString(hbo.ub__rds__normal_fare);
                a(d, ((String) (obj2)), null, ((String) (obj1)));
            }
            a(d, ((TripReceiptCharge) (obj)).getName(), null, ((TripReceiptCharge) (obj)).getAmount());
        }
        a(d);
        d.setVisibility(0);
        obj = tripreceiptdetails.getChargeModifiers();
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj1 = tripreceipt.getStrings();
            if (obj1 != null)
            {
                obj1 = ((TripReceiptStrings) (obj1)).getSubtotal();
                obj2 = tripreceiptdetails.getSubtotal();
                if (!TextUtils.isEmpty(((CharSequence) (obj1))) && !TextUtils.isEmpty(((CharSequence) (obj2))))
                {
                    a(e, ((String) (obj1)), null, ((String) (obj2)));
                }
            }
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (TripReceiptCharge)((Iterator) (obj)).next();
                if (obj1 != null)
                {
                    a(e, ((TripReceiptCharge) (obj1)).getName(), null, ((TripReceiptCharge) (obj1)).getAmount());
                }
            } while (true);
            a(e);
            e.setVisibility(0);
        }
        obj = tripreceiptdetails.getSplitDeductions();
        if (obj != null && ((List) (obj)).size() > 0)
        {
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj1 = (TripReceiptCharge)((Iterator) (obj)).next();
                if (obj1 != null)
                {
                    a(f, ((TripReceiptCharge) (obj1)).getName(), null, ((TripReceiptCharge) (obj1)).getAmount());
                }
            } while (true);
            a(f);
            f.setVisibility(0);
        }
        obj = tripreceipt.getPayment();
        if (obj != null)
        {
            c.setImageDrawable(hcr.b(getContext(), ((TripReceiptPayment) (obj)).getCardIcon()));
            a.setText(Html.fromHtml(((TripReceiptPayment) (obj)).getCardDisplayName()));
            b.setText(tripreceipt.getAmountCharged());
        }
        return;
        obj = null;
        break MISSING_BLOCK_LABEL_121;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(hbk.ub__trip_problem_receipt_card_name);
        b = (TextView)findViewById(hbk.ub__trip_problem_receipt_payment);
        c = (ImageView)findViewById(hbk.ub__trip_problem_receipt_card_icon);
        d = (LinearLayout)findViewById(hbk.ub__receipt_primary_charges_container);
        e = (LinearLayout)findViewById(hbk.ub__receipt_charge_modifiers_container);
        f = (LinearLayout)findViewById(hbk.ub__receipt_split_deductions_container);
        g = LayoutInflater.from(getContext());
    }
}
