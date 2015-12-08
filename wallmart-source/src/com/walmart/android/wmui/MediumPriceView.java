// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.walmartlabs.ui.PriceView;

// Referenced classes of package com.walmart.android.wmui:
//            Typefaces

public class MediumPriceView extends PriceView
{

    private static final String TAG = com/walmart/android/wmui/MediumPriceView.getSimpleName();

    public MediumPriceView(Context context)
    {
        super(context);
        init();
    }

    public MediumPriceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public MediumPriceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        if (isInEditMode())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        setTypeface(Typefaces.create(getContext(), Typefaces.Family.MEDIUM));
        return;
        Exception exception;
        exception;
        Log.w(TAG, "Failed to set correct typeface", exception);
        return;
    }

}
