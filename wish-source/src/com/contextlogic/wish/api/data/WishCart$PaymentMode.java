// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishCart

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value Boleto;
    public static final value CreditCard;
    public static final value Default;
    public static final value GoogleWallet;
    public static final value Klarna;
    public static final value Oxxo;
    public static final value PayPal;
    private static Map map;
    private int value;

    public static value getPaymentModeFromPreference(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 64
    //                   -559751798: 150
    //                   -416515006: 136
    //                   -305175410: 178
    //                   -171506468: 122
    //                   1876906729: 164
    //                   2053347017: 108;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_178;
_L8:
        switch (byte0)
        {
        default:
            return Default;

        case 0: // '\0'
            return CreditCard;

        case 1: // '\001'
            return PayPal;

        case 2: // '\002'
            return GoogleWallet;

        case 3: // '\003'
            return Boleto;

        case 4: // '\004'
            return Oxxo;

        case 5: // '\005'
            return Klarna;
        }
_L7:
        if (s.equals("PaymentModeCC"))
        {
            byte0 = 0;
        }
          goto _L8
_L5:
        if (s.equals("PaymentModePayPal"))
        {
            byte0 = 1;
        }
          goto _L8
_L3:
        if (s.equals("PaymentModeGoogle"))
        {
            byte0 = 2;
        }
          goto _L8
_L2:
        if (s.equals("PaymentModeBoleto"))
        {
            byte0 = 3;
        }
          goto _L8
_L6:
        if (s.equals("PaymentModeOxxo"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("PaymentModeKlarna"))
        {
            byte0 = 5;
        }
          goto _L8
    }

    public static Klarna valueOf(int i)
    {
        return (Klarna)map.get(Integer.valueOf(i));
    }

    public static map valueOf(String s)
    {
        return (map)Enum.valueOf(com/contextlogic/wish/api/data/WishCart$PaymentMode, s);
    }

    public static map[] values()
    {
        return (map[])$VALUES.clone();
    }

    static 
    {
        Default = new <init>("Default", 0, -1);
        CreditCard = new <init>("CreditCard", 1, 1);
        PayPal = new <init>("PayPal", 2, 2);
        GoogleWallet = new <init>("GoogleWallet", 3, 3);
        Boleto = new <init>("Boleto", 4, 4);
        Klarna = new <init>("Klarna", 5, 5);
        Oxxo = new <init>("Oxxo", 6, 6);
        $VALUES = (new .VALUES[] {
            Default, CreditCard, PayPal, GoogleWallet, Boleto, Klarna, Oxxo
        });
        map = new HashMap();
        e_3B_.clone aclone[] = values();
        int j = aclone.length;
        for (int i = 0; i < j; i++)
        {
            e_3B_.clone clone = aclone[i];
            map.put(Integer.valueOf(clone.value), clone);
        }

    }

    private _cls9(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }
}
