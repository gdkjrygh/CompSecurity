// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import java.util.Locale;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            AbsActionBarView

public class CapitalizingButton extends Button
{

    private static final boolean IS_GINGERBREAD;
    private static final int R_styleable_Button[] = {
        0x101038c
    };
    private static final boolean SANS_ICE_CREAM;
    private boolean mAllCaps;

    public CapitalizingButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, R_styleable_Button);
        mAllCaps = context.getBoolean(0, true);
        context.recycle();
    }

    public void setTextCompat(CharSequence charsequence)
    {
        int i = AbsActionBarView.b;
        if (!SANS_ICE_CREAM) goto _L2; else goto _L1
_L1:
        boolean flag = mAllCaps;
        if (!flag || charsequence == null) goto _L2; else goto _L3
_L3:
        try
        {
            flag = IS_GINGERBREAD;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (!flag) goto _L5; else goto _L4
_L4:
        setText(charsequence.toString().toUpperCase(Locale.ROOT));
_L6:
        return;
        charsequence;
        try
        {
            throw charsequence;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence) { }
        throw charsequence;
        NoSuchFieldError nosuchfielderror;
        nosuchfielderror;
        setText(charsequence.toString().toUpperCase());
        if (i == 0) goto _L6; else goto _L5
_L5:
        try
        {
            setText(charsequence.toString().toUpperCase());
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            throw charsequence;
        }
        if (i == 0) goto _L6; else goto _L2
_L2:
        setText(charsequence);
        return;
        charsequence;
        throw charsequence;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SANS_ICE_CREAM = flag;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_GINGERBREAD = flag;
    }
}
