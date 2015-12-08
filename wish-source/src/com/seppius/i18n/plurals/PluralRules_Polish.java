// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;


// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralRules_Polish extends PluralRules
{

    public PluralRules_Polish()
    {
    }

    public int quantityForNumber(int i)
    {
        int j = i % 100;
        int k = i % 10;
        if (i == 1)
        {
            return 2;
        }
        return k < 2 || k > 4 || j >= 12 && j <= 14 ? 0 : 8;
    }
}
