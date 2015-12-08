// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public final class CardType extends Enum
{

    private static final CardType $VALUES[];
    public static final CardType CHARGE;
    public static final CardType CREDIT;
    public static final CardType DEBIT;
    public static final CardType DEBIT_CREDIT;
    public static final CardType DEFERRED_DEBIT;
    public static final CardType NONE;
    public static final CardType PREPAID;
    public static int b043F043F043F043F043F043F = 1;
    public static int b043F043F043F043F043F043F = 0;
    public static int b043F043F043F043F043F043F = 5;
    public static int b043F043F043F043F043F043F = 2;

    private CardType(String s, int i)
    {
        try
        {
            super(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i = 3;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("\u017B\u0149\u014D\u014C\u015F\u0558\u0149\u014D\u014C\u015F\u0149\u014D\u014C\u015F\u0558\u0558", '?', '\332', '\003'), new Class[0]);
        }
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        b043F043F043F043F043F043F = ((Integer)s).intValue();
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
    }

    public static int b043F043F043F043F043F043F()
    {
        return 58;
    }

    public static int b043F043F043F043F043F043F()
    {
        return 0;
    }

    public static CardType valueOf(String s)
    {
        Method method = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\uFF4E\uFF39\uFF44\uFF4D\uFF3D\uFF27\uFF3E", '\251', '\177', '\0'), new Class[] {
            java/lang/Class, java/lang/String
        });
        s = ((String) (method.invoke(null, new Object[] {
            com/visa/cbp/external/common/CardType, s
        })));
        s = (Enum)s;
        Object obj = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("T\"&%8\u0431\"&%8\"&%8\u0431\u0431", '\267', '\305', '\002'), new Class[0]);
        int i;
        int k;
        int l;
        int i1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b043F043F043F043F043F043F;
        obj = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("H\026\032\031,\u0425\026\032\031,\026\032\031,\u0425\u0425", '%', '\013', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        l = ((Integer)obj).intValue();
        i1 = b043F043F043F043F043F043F;
        obj = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("\u021C\u05F9\u01EA\u01EE\u01ED\u0200\u01EA\u01EE\u01ED\u0200\u01EA\u01EE\u01ED\u0200\u05F9\u05F9", '\335', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((l * (k + i)) % i1 != ((Integer)obj).intValue())
        {
            int j = b043F043F043F043F043F043F;
            switch ((j * (b043F043F043F043F043F043F + j)) % b043F043F043F043F043F043F)
            {
            default:
                b043F043F043F043F043F043F = 42;
                Object obj1 = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("\006\uFFD4\uFFD8\uFFD7\uFFEA\u03E3\uFFD4\uFFD8\uFFD7\uFFEA\uFFD4\uFFD8\uFFD7\uFFEA\u03E3\u03E3", '.', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b043F043F043F043F043F043F = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                obj1 = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("\340\256\262\261\304\u04BD\256\262\261\304\256\262\261\304\u04BD\u04BD", '~', '\005'), new Class[0]);
                break;
            }
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB8\uFF86\uFF8A\uFF89\uFF9C\u0395\uFF86\uFF8A\uFF89\uFF9C\uFF86\uFF8A\uFF89\uFF9C\u0395\u0395", '\252', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
        }
        try
        {
            s = (CardType)s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        return s;
        s;
        try
        {
            throw s.getCause();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public static CardType[] values()
    {
        int i = b043F043F043F043F043F043F;
        switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
        {
        default:
            b043F043F043F043F043F043F = 30;
            Object obj = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("\b\uFFD6\uFFDA\uFFD9\uFFEC\u03E5\uFFD6\uFFDA\uFFD9\uFFEC\uFFD6\uFFDA\uFFD9\uFFEC\u03E5\u03E5", '\036', '\004'), new Class[0]);
            CardType acardtype[];
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            acardtype = (CardType[])$VALUES.clone();
            break;
        }
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
label1:
                    switch (1)
                    {
                    case 0: // '\0'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (0)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label2;

                            case 1: // '\001'
                                break label1;
                            }
                        }
                        // fall through

                    case 1: // '\001'
                        j = b043F043F043F043F043F043F;
                        switch ((j * (b043F043F043F043F043F043F + j)) % b043F043F043F043F043F043F)
                        {
                        default:
                            b043F043F043F043F043F043F = 6;
                            b043F043F043F043F043F043F = 14;
                            // fall through

                        case 0: // '\0'
                            switch (1)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                continue label0;

                            case 1: // '\001'
                                break label0;
                            }
                            break;
                        }
                        break;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        return acardtype;
    }

    static 
    {
        CREDIT = new CardType("CREDIT", 0);
        DEBIT = new CardType("DEBIT", 1);
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        if (((b043F043F043F043F043F043F + b043F043F043F043F043F043F) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            int i = b043F043F043F043F043F043F;
            switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
            {
            default:
                b043F043F043F043F043F043F = 30;
                Object obj = com/visa/cbp/external/common/CardType.getMethod(nuuuuu.b0417041704170417041704170417("\u025D\u022B\u022F\u022E\u0241\u063A\u022B\u022F\u022E\u0241\u022B\u022F\u022E\u0241\u063A\u063A", '\251', '\006'), new Class[0]);
                CardType cardtype;
                CardType cardtype1;
                CardType cardtype2;
                CardType cardtype3;
                CardType cardtype4;
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b043F043F043F043F043F043F = ((Integer)obj).intValue();
                // fall through

            case 0: // '\0'
                b043F043F043F043F043F043F = 47;
                b043F043F043F043F043F043F = 85;
                break;
            }
        }
        CHARGE = new CardType("CHARGE", 2);
        DEBIT_CREDIT = new CardType("DEBIT_CREDIT", 3);
        NONE = new CardType("NONE", 4);
        PREPAID = new CardType("PREPAID", 5);
        DEFERRED_DEBIT = new CardType("DEFERRED_DEBIT", 6);
        obj = CREDIT;
        cardtype = DEBIT;
        cardtype1 = CHARGE;
        cardtype2 = DEBIT_CREDIT;
        cardtype3 = NONE;
        cardtype4 = PREPAID;
label1:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (0)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        break label1;

                    case 1: // '\001'
                        continue label1;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label1;
            }
        } while (true);
        $VALUES = (new CardType[] {
            obj, cardtype, cardtype1, cardtype2, cardtype3, cardtype4, DEFERRED_DEBIT
        });
    }
}
