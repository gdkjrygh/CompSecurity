// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;


// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralRules_French extends PluralRules
{

    public PluralRules_French()
    {
    }

    public int quantityForNumber(int i)
    {
        return i < 0 || i >= 2 ? 0 : 2;
    }
}
