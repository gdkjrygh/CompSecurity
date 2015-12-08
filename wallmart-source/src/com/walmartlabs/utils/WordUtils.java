// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.utils;


// Referenced classes of package com.walmartlabs.utils:
//            WLog

public class WordUtils
{

    private static final String TAG = com/walmartlabs/utils/WordUtils.getSimpleName();

    public WordUtils()
    {
    }

    public static String capitalizeFully(String s)
    {
        String s1;
        try
        {
            s1 = org.apache.commons.lang3.text.WordUtils.capitalizeFully(s);
        }
        catch (Exception exception)
        {
            WLog.e(TAG, "Failed to capitalize string", exception);
            return s;
        }
        return s1;
    }

}
