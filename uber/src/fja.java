// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.shoppingcart.model.Inventory;

public final class fja
{

    private final Exception a;
    private final Inventory b;
    private final String c;

    public fja(String s, Inventory inventory)
    {
        b = inventory;
        c = s;
        a = null;
    }

    public fja(String s, Exception exception)
    {
        a = exception;
        c = s;
        b = null;
    }

    public final Inventory a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final boolean c()
    {
        return b != null;
    }
}
