// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.hurricane.modules;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.weather.Weather.hurricane.modules:
//            TropicalOutlookDetails

private static final class lastUpdated
{

    private final TextView basinTitle;
    private final TextView lastUpdated;

    public void setData(CharSequence charsequence, CharSequence charsequence1)
    {
        basinTitle.setText(charsequence);
        lastUpdated.setText(charsequence1);
    }

    (View view)
    {
        basinTitle = (TextView)view.findViewById(0x7f0d02c8);
        lastUpdated = (TextView)view.findViewById(0x7f0d02c9);
    }
}
