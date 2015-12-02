// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.rider.realtime.model.Balance;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public final class eqv
{

    private final Context a;

    public eqv(Context context)
    {
        a = context;
    }

    private static DecimalFormat a(String s)
    {
        s = new DecimalFormat(b(s));
        s.setRoundingMode(RoundingMode.DOWN);
        return s;
    }

    private static String b(String s)
    {
        DecimalFormat decimalformat = (DecimalFormat)NumberFormat.getCurrencyInstance();
        decimalformat.setGroupingUsed(false);
        decimalformat.setMaximumFractionDigits(0);
        s = Currency.getInstance(s).getSymbol(Locale.US);
        return decimalformat.toLocalizedPattern().replace("\244", s).replaceAll("'|\\s", "");
    }

    public final String a(Balance balance)
    {
        String s1 = balance.getCurrencyCode();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        s1 = NumberFormat.getIntegerInstance().format(balance.getRewardsAmount());
        balance = a(s).format(balance.getCurrencyAmount());
        return a.getString(0x7f0703ad, new Object[] {
            s1, balance
        });
    }
}
