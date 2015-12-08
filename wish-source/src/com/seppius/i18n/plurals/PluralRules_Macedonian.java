// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;


// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralRules_Macedonian extends PluralRules
{

    public PluralRules_Macedonian()
    {
    }

    public int quantityForNumber(int i)
    {
        return i % 10 != 1 || i == 11 ? 0 : 2;
    }
}
