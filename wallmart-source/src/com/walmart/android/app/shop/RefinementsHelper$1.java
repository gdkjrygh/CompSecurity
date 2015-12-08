// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmartlabs.utils.WLog;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Comparator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.walmart.android.app.shop:
//            RefinementsHelper

static final class mUSNumberFormat
    implements Comparator
{

    private final Pattern mPriceRangePattern = Pattern.compile("\\${0,1}([\\d\\.\\,]+)(\\+|\\s*-.*)");
    private final NumberFormat mUSNumberFormat;

    private double extractLowerEndValue(String s)
    {
        Matcher matcher = mPriceRangePattern.matcher(s);
        if (!matcher.matches()) goto _L2; else goto _L1
_L1:
        double d = mUSNumberFormat.parse(matcher.group(1)).doubleValue();
        return d;
        ParseException parseexception;
        parseexception;
        WLog.e(RefinementsHelper.access$000(), (new StringBuilder()).append("Current price range could not be parsed: <").append(s).append(">").toString(), parseexception);
_L4:
        return 0.0D;
_L2:
        WLog.e(RefinementsHelper.access$000(), "Current price range does not match the regex");
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int compare(com.walmart.android.data.inement inement, com.walmart.android.data.inement inement1)
    {
        return Double.compare(extractLowerEndValue(inement.getName()), extractLowerEndValue(inement1.getName()));
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((com.walmart.android.data.inement)obj, (com.walmart.android.data.inement)obj1);
    }

    ent()
    {
        mUSNumberFormat = NumberFormat.getInstance(Locale.US);
    }
}
