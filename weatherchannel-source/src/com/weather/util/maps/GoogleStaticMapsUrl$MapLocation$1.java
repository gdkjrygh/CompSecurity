// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.maps;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

// Referenced classes of package com.weather.util.maps:
//            GoogleStaticMapsUrl

static final class  extends ThreadLocal
{

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected DecimalFormat initialValue()
    {
        return new DecimalFormat("#.######", DecimalFormatSymbols.getInstance(Locale.US));
    }

    ()
    {
    }
}
