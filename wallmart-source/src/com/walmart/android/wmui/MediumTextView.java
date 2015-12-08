// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.wmui:
//            Typefaces

public class MediumTextView extends TextView
{

    public MediumTextView(Context context)
    {
        super(context);
        init();
    }

    public MediumTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public MediumTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        if (!isInEditMode())
        {
            setTypeface(Typefaces.create(getContext(), Typefaces.Family.MEDIUM));
        }
    }
}
