// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;


// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralRules_Langi extends PluralRules
{

    public PluralRules_Langi()
    {
    }

    public int quantityForNumber(int i)
    {
        byte byte0 = 2;
        if (i == 0)
        {
            byte0 = 1;
        } else
        if (i <= 0 || i >= 2)
        {
            return 0;
        }
        return byte0;
    }
}
