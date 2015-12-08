// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import android.text.SpannableString;

// Referenced classes of package com.weather.util:
//            SpannableUtils

public static final class spanEnd
{

    public final int spanEnd;
    public final int spanStart;
    public final SpannableString theString;

    public (SpannableString spannablestring, int i, int j)
    {
        theString = spannablestring;
        spanStart = i;
        spanEnd = j;
    }
}
