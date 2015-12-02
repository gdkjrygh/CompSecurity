// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.deprecated.view;

import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.ubercab.ui.EditText;
import gke;
import hrf;
import hro;
import hrp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZipEditText extends EditText
    implements hrf
{

    private static final gke a = gke.a("US", "CA", "GB");
    private static final Pattern b = Pattern.compile("^\\d{5}$");
    private boolean c;
    private hro d;
    private String e;

    public ZipEditText(Context context)
    {
        this(context, null);
    }

    public ZipEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public ZipEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setSingleLine();
        addTextChangedListener(new hrp(this, (byte)0));
    }

    public static void a(ZipEditText zipedittext)
    {
        zipedittext.d();
    }

    private void d()
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        if (TextUtils.isEmpty(e)) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (!a.contains(e.toUpperCase())) goto _L2; else goto _L3
_L3:
        if (!"US".equals(e)) goto _L5; else goto _L4
_L4:
        flag = b.matcher(getText()).matches();
_L2:
        if (flag != c)
        {
            c = flag;
            if (d != null)
            {
                d.a();
            }
        }
        return;
_L5:
        flag = flag1;
        if (getText().length() <= 0)
        {
            flag = false;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void e()
    {
        if (!TextUtils.isEmpty(e) && a.contains(e.toUpperCase()))
        {
            setVisibility(0);
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    public final boolean B_()
    {
        return c;
    }

    public final void a(hro hro1)
    {
        d = hro1;
        setText(getText());
    }

    public final void a(String s)
    {
        e = s;
        if ("US".equalsIgnoreCase(e))
        {
            setInputType(2);
            setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(5)
            });
        } else
        {
            setInputType(1);
            setFilters(new InputFilter[0]);
        }
        d();
        e();
    }

    public final boolean c()
    {
        return "US".equals(e) && B_();
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            super.onRestoreInstanceState(parcelable.getSuperState());
            a(SavedState.a(parcelable));
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        SavedState.a(savedstate, e);
        return savedstate;
    }


    /* member class not found */
    class SavedState {}

}
