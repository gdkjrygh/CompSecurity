// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import java.util.Locale;

// Referenced classes of package com.walmart.android.util:
//            WalmartPrice

public static class decimalPart
{

    public int decimalPart;
    public int integerPart;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof decimalPart)
            {
                obj = (decimalPart)obj;
                flag = flag1;
                if (integerPart == ((integerPart) (obj)).integerPart)
                {
                    flag = flag1;
                    if (decimalPart == ((decimalPart) (obj)).decimalPart)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public boolean hasValue()
    {
        return integerPart != 0 || decimalPart != 0;
    }

    public int hashCode()
    {
        return toString().hashCode();
    }

    public String toString()
    {
        return String.format(Locale.US, "$%,d.%02d", new Object[] {
            Integer.valueOf(integerPart), Integer.valueOf(decimalPart)
        });
    }

    public ()
    {
    }

    public (int i, int j)
    {
        integerPart = i;
        decimalPart = j;
    }
}
