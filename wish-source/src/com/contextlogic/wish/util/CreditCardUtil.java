// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.util;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardUtil
{
    public static final class CardType extends Enum
    {

        private static final CardType $VALUES[];
        public static final CardType Amex;
        public static final CardType DinersClub;
        public static final CardType Discover;
        public static final CardType HiperCard;
        public static final CardType Invalid;
        public static final CardType MasterCard;
        public static final CardType Visa;

        public static CardType valueOf(String s)
        {
            return (CardType)Enum.valueOf(com/contextlogic/wish/util/CreditCardUtil$CardType, s);
        }

        public static CardType[] values()
        {
            return (CardType[])$VALUES.clone();
        }

        static 
        {
            Visa = new CardType("Visa", 0);
            MasterCard = new CardType("MasterCard", 1);
            Amex = new CardType("Amex", 2);
            Discover = new CardType("Discover", 3);
            HiperCard = new CardType("HiperCard", 4);
            DinersClub = new CardType("DinersClub", 5);
            Invalid = new CardType("Invalid", 6);
            $VALUES = (new CardType[] {
                Visa, MasterCard, Amex, Discover, HiperCard, DinersClub, Invalid
            });
        }

        private CardType(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int FIRST_CARD_GROUP_LENGTH = 4;
    public static final String REGEX_AMEX_TYPE = "^3[47][0-9]{2}$";
    public static final String REGEX_DINERSCLUB_TYPE = "^3(?:0[0-5]|[68][0-9])[0-9]$";
    public static final String REGEX_DISCOVER_TYPE = "^6(?:011|5[0-9]{2})$";
    public static final String REGEX_HIPERCARD_TYPE = "^(6[0-9]{3}|3841)$";
    public static final String REGEX_MASTERCARD_TYPE = "^5[1-5][0-9]{2}$";
    public static final String REGEX_VISA_TYPE = "^4[0-9]{3}?";

    public CreditCardUtil()
    {
    }

    public static CardType getCardType(String s)
    {
        if (s.length() >= 4) goto _L2; else goto _L1
_L1:
        CardType cardtype = CardType.Invalid;
_L13:
        return cardtype;
_L2:
        String s1;
        CardType acardtype[];
        int i;
        int j;
        s1 = null;
        acardtype = CardType.values();
        j = acardtype.length;
        i = 0;
_L14:
        if (i >= j) goto _L4; else goto _L3
_L3:
        cardtype = acardtype[i];
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType = new int[CardType.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[CardType.Visa.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[CardType.MasterCard.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[CardType.Amex.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[CardType.Discover.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[CardType.DinersClub.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[CardType.HiperCard.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$util$CreditCardUtil$CardType[CardType.Invalid.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()];
        JVM INSTR tableswitch 1 6: default 84
    //                   1 130
    //                   2 124
    //                   3 112
    //                   4 118
    //                   5 136
    //                   6 142;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
        if (Pattern.compile(s1).matcher(s.substring(0, 4)).matches()) goto _L13; else goto _L12
_L12:
        i++;
          goto _L14
_L8:
        s1 = "^3[47][0-9]{2}$";
          goto _L5
_L9:
        s1 = "^6(?:011|5[0-9]{2})$";
          goto _L5
_L7:
        s1 = "^5[1-5][0-9]{2}$";
          goto _L5
_L6:
        s1 = "^4[0-9]{3}?";
          goto _L5
_L10:
        s1 = "^3(?:0[0-5]|[68][0-9])[0-9]$";
          goto _L5
_L11:
        s1 = "^(6[0-9]{3}|3841)$";
          goto _L5
_L4:
        return CardType.Invalid;
          goto _L14
    }

    public static String getCreditCardTypeDisplayString(CardType cardtype)
    {
        switch (_cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()])
        {
        default:
            return "Invalid";

        case 1: // '\001'
            return "Visa";

        case 2: // '\002'
            return "MasterCard";

        case 3: // '\003'
            return "American Express";

        case 4: // '\004'
            return "Discover";

        case 5: // '\005'
            return "Diners Club";

        case 6: // '\006'
            return "Hipercard";
        }
    }

    public static String getCreditCardTypeString(CardType cardtype)
    {
        switch (_cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()])
        {
        default:
            return "Invalid";

        case 1: // '\001'
            return "visa";

        case 2: // '\002'
            return "mastercard";

        case 3: // '\003'
            return "american express";

        case 4: // '\004'
            return "discover";

        case 5: // '\005'
            return "diners club";

        case 6: // '\006'
            return "hipercard";
        }
    }

    public static String getFormattedCardNumber(String s, CardType cardtype)
    {
        ArrayList arraylist;
        String s1;
        int ai[];
        int i;
        s1 = sanitizeCreditCardNumber(s);
        i = s1.length();
        if (i <= 4)
        {
            return s1;
        }
        arraylist = new ArrayList();
        ai = new int[3];
        ai;
        ai[0] = 0;
        ai[1] = 0;
        ai[2] = 0;
        _cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()];
        JVM INSTR tableswitch 1 6: default 92
    //                   1 94
    //                   2 94
    //                   3 302
    //                   4 94
    //                   5 263
    //                   6 342;
           goto _L1 _L2 _L2 _L3 _L2 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_342;
_L1:
        return s;
_L2:
        arraylist.add(" ");
        ai[0] = 4;
        arraylist.add(" ");
        ai[1] = 4;
        arraylist.add(" ");
        ai[2] = 4;
_L6:
        s = s1.substring(0, 4);
        String s2;
        int j;
        int k;
        if (ai[0] + 4 > i)
        {
            k = i;
        } else
        {
            k = 4 + ai[0];
        }
        cardtype = s1.substring(4, k);
        if (ai[1] + k > i)
        {
            j = i;
        } else
        {
            j = k + ai[1];
        }
        s2 = s1.substring(k, j);
        if (ai[2] + j <= i)
        {
            i = j + ai[2];
        }
        s1 = s1.substring(j, i);
        return String.format("%s%s%s%s%s%s%s", new Object[] {
            s, arraylist.get(0), cardtype, arraylist.get(1), s2, arraylist.get(2), s1
        }).trim();
_L4:
        arraylist.add(" ");
        ai[0] = 4;
        arraylist.add(" ");
        ai[1] = 4;
        arraylist.add(" ");
        ai[2] = 2;
          goto _L6
_L3:
        arraylist.add(" ");
        ai[0] = 6;
        arraylist.add(" ");
        ai[1] = 5;
        arraylist.add("");
        ai[2] = 0;
          goto _L6
        arraylist.add(" ");
        ai[0] = 4;
        arraylist.add(" ");
        ai[1] = 4;
        arraylist.add(" ");
        ai[2] = 7;
          goto _L6
    }

    public static int getLengthOfFormattedString(CardType cardtype)
    {
        switch (_cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
            return 19;

        case 6: // '\006'
            return 22;

        case 3: // '\003'
            return 17;

        case 5: // '\005'
            return 17;
        }
    }

    public static int getValidSecurityCodeLength(CardType cardtype)
    {
        switch (_cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()])
        {
        case 3: // '\003'
        default:
            return 4;

        case 1: // '\001'
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return 3;
        }
    }

    public static boolean isValidCardNumber(String s)
    {
        String s2;
        CardType cardtype;
        boolean flag1;
        flag1 = true;
        s2 = sanitizeCreditCardNumber(s);
        cardtype = getCardType(s2);
        _cls1..SwitchMap.com.contextlogic.wish.util.CreditCardUtil.CardType[cardtype.ordinal()];
        JVM INSTR tableswitch 1 6: default 60
    //                   1 137
    //                   2 131
    //                   3 66
    //                   4 125
    //                   5 143
    //                   6 149;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        boolean flag = false;
_L11:
        return flag;
_L4:
        String s1 = "^3[47][0-9]{2}$";
_L13:
        s = Pattern.compile(s1).matcher(s.substring(0, 4));
        if (cardtype != CardType.HiperCard) goto _L9; else goto _L8
_L8:
        if (!s.matches())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (s2.length() == 16) goto _L11; else goto _L10
_L10:
        flag = flag1;
        if (s2.length() == 19) goto _L11; else goto _L12
_L12:
        return false;
_L5:
        s1 = "^6(?:011|5[0-9]{2})$";
          goto _L13
_L3:
        s1 = "^5[1-5][0-9]{2}$";
          goto _L13
_L2:
        s1 = "^4[0-9]{3}?";
          goto _L13
_L6:
        s1 = "^3(?:0[0-5]|[68][0-9])[0-9]$";
          goto _L13
_L7:
        s1 = "^(6[0-9]{3}|3841)$";
          goto _L13
_L9:
        if (!s.matches())
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (validateCardNumber(s2)) goto _L11; else goto _L14
_L14:
        return false;
    }

    public static String sanitizeCreditCardNumber(String s)
    {
        return s.replaceAll("\\s", "");
    }

    private static boolean validateCardNumber(String s)
    {
        int i;
        int j;
        boolean flag;
        int k;
        k = 0;
        flag = false;
        int l;
        try
        {
            j = s.length() - 1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
_L2:
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = Integer.parseInt(s.substring(j, j + 1));
        if (flag)
        {
            l = i * 2;
            i = l;
            if (l > 9)
            {
                i = l - 9;
            }
        }
        break MISSING_BLOCK_LABEL_71;
        return k % 10 == 0;
        k += i;
        if (!flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j--;
        flag = i;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
