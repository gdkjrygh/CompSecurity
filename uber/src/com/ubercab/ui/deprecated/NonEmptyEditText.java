// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui.deprecated;

import android.content.Context;
import android.util.AttributeSet;
import com.ubercab.ui.EditText;
import hrf;

public class NonEmptyEditText extends EditText
    implements hrf
{

    public NonEmptyEditText(Context context)
    {
        this(context, null);
    }

    public NonEmptyEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101006e);
    }

    public NonEmptyEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final boolean B_()
    {
        return length() > 0;
    }

    public final boolean c()
    {
        return true;
    }
}
