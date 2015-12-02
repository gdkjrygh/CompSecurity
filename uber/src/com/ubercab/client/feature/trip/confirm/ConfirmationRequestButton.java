// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.confirm;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.Button;
import dth;

public class ConfirmationRequestButton extends Button
{

    private final String a;

    public ConfirmationRequestButton(Context context)
    {
        this(context, null);
    }

    public ConfirmationRequestButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010048);
    }

    public ConfirmationRequestButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = getResources().getString(0x7f07039d);
    }

    private void a(SpannableStringBuilder spannablestringbuilder, boolean flag)
    {
        if (flag)
        {
            Object obj = getResources();
            Object obj1 = ((Resources) (obj)).getDrawable(0x7f0200e7);
            ((Drawable) (obj1)).setBounds(0, 0, ((Drawable) (obj1)).getIntrinsicWidth(), ((Drawable) (obj1)).getIntrinsicHeight());
            obj1 = new dth(((Drawable) (obj1)));
            ((dth) (obj1)).a(((Resources) (obj)).getDimensionPixelSize(0x7f080073));
            obj = getContext().getString(0x7f070454);
            spannablestringbuilder.insert(0, ((CharSequence) (obj)));
            spannablestringbuilder.setSpan(obj1, 0, ((String) (obj)).length(), 17);
            spannablestringbuilder.insert(((String) (obj)).length(), " ");
            setGravity(49);
        } else
        {
            setGravity(17);
        }
        setText(spannablestringbuilder);
    }

    public final void a(VehicleView vehicleview, boolean flag)
    {
        String s1 = a;
        String s = s1;
        if (vehicleview != null)
        {
            String s2 = vehicleview.getDescription();
            vehicleview = vehicleview.getRequestPickupButtonString();
            s = s1;
            if (!TextUtils.isEmpty(s2))
            {
                s = s1;
                if (!TextUtils.isEmpty(vehicleview))
                {
                    s = vehicleview.replace("{string}", s2);
                }
            }
        }
        a(new SpannableStringBuilder(s), flag);
    }
}
