// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;


// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralRules_Czech extends PluralRules
{

    public PluralRules_Czech()
    {
    }

    public int quantityForNumber(int i)
    {
        if (i == 1)
        {
            return 2;
        }
        return i < 2 || i > 4 ? 0 : 8;
    }
}
