// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            Shape_ShoppingCartTopLineCharge

public abstract class ShoppingCartTopLineCharge
{

    public static final String CREDIT = "credit";
    public static final String DEBIT = "debit";

    public ShoppingCartTopLineCharge()
    {
    }

    public static ShoppingCartTopLineCharge create(String s, String s1, String s2)
    {
        return (new Shape_ShoppingCartTopLineCharge()).setLabel(s).setType(s1).setValue(s2);
    }

    public abstract String getLabel();

    public abstract String getType();

    public abstract String getValue();

    abstract ShoppingCartTopLineCharge setLabel(String s);

    abstract ShoppingCartTopLineCharge setType(String s);

    abstract ShoppingCartTopLineCharge setValue(String s);
}
