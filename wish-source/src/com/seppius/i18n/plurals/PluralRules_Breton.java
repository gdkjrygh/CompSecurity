// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;


// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralRules_Breton extends PluralRules
{

    public PluralRules_Breton()
    {
    }

    public int quantityForNumber(int i)
    {
        if (i == 0)
        {
            return 1;
        }
        if (i == 1)
        {
            return 2;
        }
        if (i == 2)
        {
            return 4;
        }
        if (i == 3)
        {
            return 8;
        }
        return i != 6 ? 0 : 16;
    }
}
