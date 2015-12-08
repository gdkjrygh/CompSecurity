// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class Status
{

    public static int b043204320432043204320432 = 80;
    public static int b043204320432043204320432 = 1;
    public static int b043204320432043204320432 = 2;
    public static int b043204320432043204320432;
    private String reasonCode;
    private String reasonDesc;
    private String status;

    public Status()
    {
        int i = b043204320432043204320432;
        int j = b043204320432043204320432;
        int k = b043204320432043204320432;
        Object obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA0\uFE6E\uFE72\uFE71\uFE70\u0270\u0270\uFE6E\uFE72\uFE71\uFE70\u0270\u0270", '\341', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if ((k * (i + j)) % ((Integer)obj).intValue() != b043204320432043204320432)
        {
            Object obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\u015E\u052E\u052E\u012C\u0130\u012F\u012E\u052E\u052E\u052E", 'T', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043204320432043204320432 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\224\u0464\u0464bfed\u0464\u0464\u0464", '\307', '\225', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043204320432043204320432 = ((Integer)obj1).intValue();
        }
        super();
    }

    public static int b043204320432043204320432()
    {
        return 2;
    }

    public static int b043204320432043204320432()
    {
        return 1;
    }

    public static int b043204320432043204320432()
    {
        return 75;
    }

    public String getReasonCode()
    {
        String s;
        try
        {
            s = reasonCode;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return s;
    }

    public String getReasonDesc()
    {
        Object obj;
        int i;
        int j;
        int k;
        int i1;
        try
        {
            i = b043204320432043204320432;
            j = b043204320432043204320432;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        k = b043204320432043204320432;
        i1 = b043204320432043204320432;
        obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB6\uFF84\uFF88\uFF87\uFF86\u0386\u0386\uFF84\uFF88\uFF87\uFF86\u0386\u0386", 'V', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        switch (((i1 + k) * k) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7E\u034E\u034E\uFF4C\uFF50\uFF4F\uFF4E\u034E\u034E\u034E", 'L', '\230', '\0'), new Class[0]);
            Object obj2;
            int l;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043204320432043204320432 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFF39\u0309\u0309\uFF07\uFF0B\uFF0A\uFF09\u0309\u0309\u0309", '\356', ';', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043204320432043204320432 = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            l = b043204320432043204320432;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        ((i + j) * i) % l;
        JVM INSTR tableswitch 0 0: default 192
    //                   0 276;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_276;
_L1:
        obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\u01C0\u0590\u0590\u018E\u0192\u0191\u0190\u0590\u0590\u0590", '\214', '\322', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b043204320432043204320432 = i;
        obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("&\u03F6\u03F6\uFFF4\uFFF8\uFFF7\uFFF6\u03F6\u03F6\u03F6", '\024', '\004'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        b043204320432043204320432 = i;
        obj1 = reasonDesc;
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        return ((String) (obj1));
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
    }

    public String getStatus()
    {
        int i = b043204320432043204320432;
        int j = b043204320432043204320432;
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
        if (((i + j) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
        {
            Object obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\275\u048D\u048D\213\217\216\215\u048D\u048D\u048D", '\177', '\332', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\u0290\u0660\u0660\u025E\u0262\u0261\u0260\u0660\u0660\u0660", '\272', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
            if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
            {
                b043204320432043204320432 = 71;
                Object obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFF48\u0318\u0318\uFF16\uFF1A\uFF19\uFF18\u0318\u0318\u0318", '^', '\004'), new Class[0]);
                Exception exception;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b043204320432043204320432 = ((Integer)obj1).intValue();
            }
        }
        try
        {
            obj1 = status;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        return ((String) (obj1));
    }

    public void setReasonCode(String s)
    {
        if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
        {
            b043204320432043204320432 = 28;
            b043204320432043204320432 = 54;
        }
        reasonCode = s;
        int i = b043204320432043204320432;
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    switch (1)
                    {
                    default:
                        break;

                    case 0: // '\0'
                        continue label0;

                    case 1: // '\001'
                        break label0;
                    }
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        switch ((i * (b043204320432043204320432 + i)) % b043204320432043204320432)
        {
        default:
            s = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\u0101\u04D1\u04D1\317\323\322\321\u04D1\u04D1\u04D1", '\234', '\003', '\003'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043204320432043204320432 = ((Integer)s).intValue();
            s = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("T\u0424\u0424\"&%$\u0424\u0424\u0424", '\353', '\371', '\002'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043204320432043204320432 = ((Integer)s).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public void setReasonDesc(String s)
    {
        int i = b043204320432043204320432;
        Object obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB7\u0387\uFF85\uFF89\uFF88\uFF87\u0387\uFF85\uFF89\uFF88\uFF87\u0387\u0387", '\253', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        switch (((((Integer)obj).intValue() + i) * i) % b043204320432043204320432)
        {
        default:
            b043204320432043204320432 = 42;
            Object obj1 = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\300\u0490\u0490\216\222\221\220\u0490\u0490\u0490", '/', '\001'), new Class[0]);
            Exception exception;
            int j;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043204320432043204320432 = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            j = 5;
            break;
        }
        try
        {
            do
            {
                j /= 0;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            b043204320432043204320432 = 28;
        }
        1;
        JVM INSTR tableswitch 0 1: default 156
    //                   0 132
    //                   1 183;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break label0;
            }
        }
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 208
    //                   0 235
    //                   1 132;
           goto _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_132;
_L7:
        reasonDesc = s;
        return;
    }

    public void setStatus(String s)
    {
        if (((b043204320432043204320432 + b043204320432043204320432) * b043204320432043204320432) % b043204320432043204320432 != b043204320432043204320432)
        {
            b043204320432043204320432 = 13;
            Object obj = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\uFF39\u0309\u0309\uFF07\uFF0B\uFF0A\uFF09\u0309\u0309\u0309", '\303', 'f', '\0'), new Class[0]);
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043204320432043204320432 = ((Integer)obj).intValue();
        }
        status = s;
        1;
        JVM INSTR tableswitch 0 1: default 96
    //                   0 72
    //                   1 123;
           goto _L1 _L2 _L3
_L2:
        continue; /* Loop/switch isn't completed */
_L1:
label0:
        while (true) 
        {
            switch (0)
            {
            default:
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                continue; /* Loop/switch isn't completed */
            }
        }
_L3:
        0;
        JVM INSTR tableswitch 0 1: default 148
    //                   0 283
    //                   1 72;
           goto _L4 _L5 _L6
_L6:
        continue; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            s = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("\214\u045C\u045CZ^]\\\u045C\u045C\u045C", '\016', '\006'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            i = ((Integer)s).intValue();
            switch ((i * (b043204320432043204320432 + i)) % b043204320432043204320432)
            {
            default:
                s = com/visa/cbp/external/common/Status.getMethod(nuuuuu.b0417041704170417041704170417("g\u0437\u04375167\u0437\u0437\u0437", '\005', '\002'), new Class[0]);
                try
                {
                    s = ((String) (s.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b043204320432043204320432 = ((Integer)s).intValue();
                b043204320432043204320432 = 42;
                // fall through

            case 0: // '\0'
                switch (1)
                {
                default:
                    break;

                case 0: // '\0'
                    continue; /* Loop/switch isn't completed */

                case 1: // '\001'
                    break; /* Loop/switch isn't completed */
                }
                break;
            }
        }
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_72;
_L7:
    }
}
