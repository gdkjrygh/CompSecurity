// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;


// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralRules_Lithuanian extends PluralRules
{

    public PluralRules_Lithuanian()
    {
    }

    public int quantityForNumber(int i)
    {
        int j = i % 100;
        i %= 10;
        if (i == 1 && (j < 11 || j > 19))
        {
            return 2;
        }
        return i < 2 || i > 9 || j >= 11 && j <= 19 ? 0 : 8;
    }
}
