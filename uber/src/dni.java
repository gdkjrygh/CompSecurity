// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.ShoppingCartCharges;
import retrofit.RetrofitError;
import retrofit.client.Response;

public final class dni extends dmx
{

    private final String a;
    private final String b;

    public dni(String s, String s1, ShoppingCartCharges shoppingcartcharges, Response response)
    {
        super(shoppingcartcharges, response);
        a = s;
        b = s1;
    }

    public dni(String s, String s1, RetrofitError retrofiterror)
    {
        super(retrofiterror);
        a = s;
        b = s1;
    }

    public final String a()
    {
        return b;
    }
}
