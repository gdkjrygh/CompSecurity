// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ubercab.ui.TextView;
import hoq;

public class AddressTextView extends TextView
{

    private boolean a;
    private final float b;
    private final float c;
    private final Paint d;
    private final Paint e;
    private CharSequence f;

    public AddressTextView(Context context)
    {
        this(context, null, 0);
    }

    public AddressTextView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AddressTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = "";
        b = getResources().getDimension(0x7f080252);
        c = getResources().getDimension(0x7f0802c4);
        d = new Paint();
        d.setTextSize(b);
        e = new Paint();
        e.setTextSize(c);
        if (!isInEditMode())
        {
            context = hoq.a(context, 0x7f07069b);
            d.setTypeface(context);
            e.setTypeface(context);
        }
    }

    private void a()
    {
        if (!a)
        {
            setTextSize(0, b);
            b(false);
            setSingleLine();
            setEllipsize(android.text.TextUtils.TruncateAt.END);
            return;
        }
        if (!c())
        {
            setTextSize(0, b);
            b(false);
            setSingleLine();
            return;
        }
        if (d())
        {
            setTextSize(0, c);
            setSingleLine(false);
            b(false);
            return;
        } else
        {
            setSingleLine();
            b(true);
            return;
        }
    }

    private boolean c()
    {
        while (TextUtils.isEmpty(f) || getWidth() == 0 || d.measureText(f.toString()) <= (float)getWidth()) 
        {
            return false;
        }
        return true;
    }

    private boolean d()
    {
        while (TextUtils.isEmpty(f) || getWidth() == 0 || e.measureText(f.toString()) <= (float)getWidth()) 
        {
            return false;
        }
        return true;
    }

    final void a(CharSequence charsequence)
    {
        f = charsequence;
        a();
        setText(f);
    }

    final void a(boolean flag)
    {
        a = flag;
    }

    public void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (flag)
        {
            a();
        }
    }
}
