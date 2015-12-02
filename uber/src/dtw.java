// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.text.NumberFormat;
import java.util.Currency;

public final class dtw
{

    public static final Currency a = Currency.getInstance("USD");

    public static NumberFormat a(Currency currency)
    {
        return b(currency);
    }

    public static Currency a(String s, Currency currency)
    {
        if (TextUtils.isEmpty(s))
        {
            return currency;
        }
        try
        {
            s = Currency.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return currency;
        }
        return s;
    }

    private static NumberFormat b(Currency currency)
    {
        NumberFormat numberformat = NumberFormat.getCurrencyInstance();
        if (currency != null)
        {
            numberformat.setCurrency(currency);
        }
        return numberformat;
    }

}
