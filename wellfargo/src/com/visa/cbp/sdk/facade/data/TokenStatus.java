// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import uuuuuu.nuuuuu;

public final class TokenStatus extends Enum
{

    private static final TokenStatus $VALUES[];
    public static final TokenStatus ACTIVE;
    public static final TokenStatus DELETED;
    public static final TokenStatus NOT_FOUND;
    public static final TokenStatus OBSOLETE;
    public static final TokenStatus RESUME;
    public static final TokenStatus SUSPENDED;
    public static int b042F042F042F042F042F042F = 42;
    public static int b042F042F042F042F042F042F = 2;
    public static int b042F042F042F042F042F042F = 0;
    public static int b042F042F042F042F042F042F = 1;
    private static final HashMap mapping;
    private String value;

    private TokenStatus(String s, int i, String s1)
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
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
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
            s = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\177-)/[-)/[-)/[\u0432-)/[\u0432", '\035', '\002'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)s).intValue();
            s = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\uFF73\uFF41\uFF45\uFF43\uFF57\uFF41\uFF45\uFF43\uFF57\uFF41\uFF45\uFF43\uFF57\u0340\uFF41\uFF45\uFF43\uFF57\u0340", '\357', '\0'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)s).intValue();
            if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
            {
                b042F042F042F042F042F042F = 93;
                s = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\301\223\227\221\345\223\227\221\345\223\227\221\345\u048C\223\227\221\345\u048C", '\243', '\002'), new Class[0]);
                try
                {
                    s = ((String) (s.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042F042F042F042F042F042F = ((Integer)s).intValue();
            }
        }
        try
        {
            value = s1;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public static int b042F042F042F042F042F042F()
    {
        return 60;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 1;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 2;
    }

    public static int b042F042F042F042F042F042F()
    {
        return 0;
    }

    public static TokenStatus getTokenStatus(String s)
    {
        HashMap hashmap = mapping;
        Method method = java/util/HashMap.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8D\uFF8B\uFF9A", '\031', '\301', '\0'), new Class[] {
            java/lang/Object
        });
        try
        {
            s = ((String) (method.invoke(hashmap, new Object[] {
                s
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        return (TokenStatus)(Object)s;
    }

    public static TokenStatus valueOf(String s)
    {
        Object obj = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("%\020\033$\024\uFFFE\025", '\033', '\004'), new Class[] {
            java/lang/Class, java/lang/String
        });
        int i;
        int j;
        int k;
        int l;
        try
        {
            s = ((String) (((Method) (obj)).invoke(null, new Object[] {
                com/visa/cbp/sdk/facade/data/TokenStatus, s
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = (TokenStatus)(Enum)s;
        i = b042F042F042F042F042F042F;
        j = b042F042F042F042F042F042F;
        k = b042F042F042F042F042F042F;
        l = b042F042F042F042F042F042F;
        obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u021C\u05E9\u05E9\u05E9\u01EA\u01EE\u01EC\u0200\u01EA\u01EE\u01EC\u0200\u05E9", '\335', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u010D\333\337\335\361\333\337\335\361\333\337\335\361\u04DA\333\337\335\361\u04DA", '2', 'y', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
            b042F042F042F042F042F042F = 19;
        }
        return s;
    }

    public static TokenStatus[] values()
    {
        Object obj = $VALUES.clone();
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("!\uFFEF\uFFF3\uFFF1\005\uFFEF\uFFF3\uFFF1\005\uFFEF\uFFF3\uFFF1\005\u03EE\uFFEF\uFFF3\uFFF1\005\u03EE", 'A', '\0'), new Class[0]);
            TokenStatus atokenstatus[];
            int i;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj1).intValue();
            b042F042F042F042F042F042F = 95;
        }
        atokenstatus = (TokenStatus[])obj;
        i = b042F042F042F042F042F042F;
        switch ((i * (b042F042F042F042F042F042F + i)) % b042F042F042F042F042F042F)
        {
        default:
label0:
            while (true) 
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
            }
            b042F042F042F042F042F042F = 53;
            b042F042F042F042F042F042F = 31;
            break;

        case 0: // '\0'
            break;
        }
label1:
        do
        {
            switch (0)
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
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
        return atokenstatus;
    }

    public String getValue()
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b042F042F042F042F042F042F;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\uFEC8\uFE96\uFE9A\uFE98\uFEAC\u0295\u0295\uFE96\uFE9A\uFE98\uFEAC\uFE96\uFE9A\uFE98\uFEAC\u0295", '\247', '\363', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        k = b042F042F042F042F042F042F;
        l = b042F042F042F042F042F042F;
        i1 = b042F042F042F042F042F042F;
        if (((j + i) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u01A3\u0171\u0175\u0173\u0187\u0171\u0175\u0173\u0187\u0171\u0175\u0173\u0187\u0570\u0171\u0175\u0173\u0187\u0570", 'k', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        try
        {
            b042F042F042F042F042F042F = i;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\351\273\277\271\315\273\277\271\315\273\277\271\315\u04A4\273\277\271\315\u04A4", '\213', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042F042F042F042F042F042F = i;
        i = b042F042F042F042F042F042F;
        j = b042F042F042F042F042F042F;
        k = b042F042F042F042F042F042F;
        l = b042F042F042F042F042F042F;
        obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("_\u042C\u042C\u042C-1/C-1/C\u042C", '\200', '\203', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        if (((i + j) * k) % l != ((Integer)obj).intValue())
        {
            obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\u016D\u013B\u013F\u013D\u0151\u013B\u013F\u013D\u0151\u013B\u013F\u013D\u0151\u053A\u013B\u013F\u013D\u0151\u053A", 'Y', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj).intValue();
            b042F042F042F042F042F042F = 70;
        }
        return value;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    static 
    {
        Object obj;
        TokenStatus atokenstatus[];
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Method method;
        int i;
        int j;
        try
        {
            ACTIVE = new TokenStatus("ACTIVE", 0, "ACTIVE");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        try
        {
            i = b042F042F042F042F042F042F;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        j = b042F042F042F042F042F042F;
        obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDE\u03AB\uFFAC\uFFB0\uFFAE\uFFC2\u03AB\uFFAC\uFFB0\uFFAE\uFFC2\uFFAC\uFFB0\uFFAE\uFFC2\u03AB", 'B', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((j + i) * i) % ((Integer)obj).intValue();
        JVM INSTR tableswitch 0 0: default 88
    //                   0 98;
           goto _L1 _L2
_L1:
        b042F042F042F042F042F042F = 33;
        b042F042F042F042F042F042F = 33;
_L2:
        RESUME = new TokenStatus("RESUME", 1, "RESUME");
        SUSPENDED = new TokenStatus("SUSPENDED", 2, "SUSPENDED");
        OBSOLETE = new TokenStatus("OBSOLETE", 3, "OBSOLETE");
        DELETED = new TokenStatus("DELETED", 4, "DELETED");
        NOT_FOUND = new TokenStatus("NOT_FOUND", 5, "NOT_FOUND");
        obj = ACTIVE;
          goto _L3
_L7:
        obj2 = RESUME;
        if (((b042F042F042F042F042F042F + b042F042F042F042F042F042F) * b042F042F042F042F042F042F) % b042F042F042F042F042F042F != b042F042F042F042F042F042F)
        {
            b042F042F042F042F042F042F = 42;
            obj3 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\350\266\272\270\314\266\272\270\314\266\272\270\314\u04B5\266\272\270\314\u04B5", '\206', '\005'), new Class[0]);
            try
            {
                obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042F042F042F042F042F042F = ((Integer)obj3).intValue();
        }
        $VALUES = (new TokenStatus[] {
            obj, obj2, SUSPENDED, OBSOLETE, DELETED, NOT_FOUND
        });
        mapping = new HashMap();
        obj = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9B\uFF86\uFF91\uFF9A\uFF8A\uFF98", '\245', '6', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        atokenstatus = (TokenStatus[])obj;
        j = atokenstatus.length;
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = atokenstatus[i];
        obj3 = mapping;
        obj4 = com/visa/cbp/sdk/facade/data/TokenStatus.getMethod(nuuuuu.b0417041704170417041704170417("\302\300\321\363\304\311\320\300", '\245', '\002'), new Class[0]);
        obj4 = ((Method) (obj4)).invoke(obj2, new Object[0]);
        obj4 = (String)obj4;
        method = java/util/HashMap.getMethod(nuuuuu.b0417041704170417041704170417("\315\322\321", ']', '\005'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        obj2 = method.invoke(obj3, new Object[] {
            obj4, obj2
        });
        obj2 = (Object)obj2;
        i++;
        if (true) goto _L5; else goto _L4
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
_L4:
        return;
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 516
    //                   0 180
    //                   1 491;
           goto _L6 _L7 _L3
_L6:
        0;
        JVM INSTR tableswitch 0 1: default 540
    //                   0 180
    //                   1 491;
           goto _L6 _L7 _L3
    }
}
