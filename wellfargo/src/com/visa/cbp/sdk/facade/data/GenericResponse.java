// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import uuuuuu.nuuuuu;

public class GenericResponse
{

    public static int b044804480448044804480448 = 0;
    public static int b044804480448044804480448 = 1;
    public static int b044804480448044804480448 = 2;
    public static int b044804480448044804480448 = 13;
    private final Map headers;
    private final String reason;
    private final int statusCode;

    public GenericResponse(int i, String s, Map map)
    {
        statusCode = i;
        reason = s;
        i = b044804480448044804480448;
        int j = b044804480448044804480448;
        s = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7E\u0264\uFE4C\uFE50\uFE50\uFE54\u0264\uFE4C\uFE50\uFE50\uFE54\uFE4C\uFE50\uFE50\uFE54\u0264", '\362', '\003'), new Class[0]);
        int k;
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        switch (((j + i) * i) % ((Integer)s).intValue())
        {
        default:
            b044804480448044804480448 = 42;
            b044804480448044804480448 = 31;
            // fall through

        case 0: // '\0'
            headers = map;
            break;
        }
        i = b044804480448044804480448;
        j = b044804480448044804480448;
        k = b044804480448044804480448;
        s = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDA\u03C0\uFFA8\uFFAC\uFFAC\uFFB0\u03C0\uFFA8\uFFAC\uFFAC\uFFB0\uFFA8\uFFAC\uFFAC\uFFB0\u03C0", ';', 'M', '\0'), new Class[0]);
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((k * (i + j)) % ((Integer)s).intValue() != b044804480448044804480448)
        {
            s = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\f\u03F2\u03F2\uFFDA\uFFDE\uFFDE\uFFE2\uFFDA\uFFDE\uFFDE\uFFE2\uFFDA\uFFDE\uFFDE\uFFE2\u03F2", '\230', 'B', '\001'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044804480448044804480448 = ((Integer)s).intValue();
            s = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFEA0\u0286\u0286\uFE6E\uFE72\uFE72\uFE76\uFE6E\uFE72\uFE72\uFE76\uFE6E\uFE72\uFE72\uFE76\u0286", '\341', '\003'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044804480448044804480448 = ((Integer)s).intValue();
        }
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

    public static int b044804480448044804480448()
    {
        return 1;
    }

    public static int b044804480448044804480448()
    {
        return 2;
    }

    public static int b044804480448044804480448()
    {
        return 85;
    }

    public Map getHeaders()
    {
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
        Map map = headers;
        int i = b044804480448044804480448;
        int k = b044804480448044804480448;
        int l = b044804480448044804480448;
        Object obj = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u017E\u0564\u014C\u0150\u0150\u0154\u0564\u014C\u0150\u0150\u0154\u014C\u0150\u0150\u0154\u0564", '\234', '\200', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if ((l * (i + k)) % ((Integer)obj).intValue() != b044804480448044804480448)
        {
            int j = b044804480448044804480448;
            switch ((j * (b044804480448044804480448 + j)) % b044804480448044804480448)
            {
            default:
                Object obj1 = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u01C4\u05AA\u05AA\u0192\u0196\u0196\u019A\u0192\u0196\u0196\u019A\u0192\u0196\u0196\u019A\u05AA", '\343', '\177', '\003'), new Class[0]);
                InvocationTargetException invocationtargetexception1;
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b044804480448044804480448 = ((Integer)obj1).intValue();
                b044804480448044804480448 = 76;
                // fall through

            case 0: // '\0'
                obj1 = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u016A\u0550\u0550\u0138\u013C\u013C\u0140\u0138\u013C\u013C\u0140\u0138\u013C\u013C\u0140\u0550", 'X', '\006'), new Class[0]);
                break;
            }
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b044804480448044804480448 = ((Integer)obj1).intValue();
            b044804480448044804480448 = 65;
        }
        return map;
    }

    public String getReason()
    {
        if (((b044804480448044804480448 + b044804480448044804480448) * b044804480448044804480448) % b044804480448044804480448 != b044804480448044804480448)
        {
            b044804480448044804480448 = 19;
            Object obj = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\227\u04BD\u04BD\305\301\301\315\305\301\301\315\305\301\301\315\u04BD", '\365', '\002'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            Object obj1;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b044804480448044804480448 = ((Integer)obj).intValue();
        }
        1;
        JVM INSTR tableswitch 0 1: default 88
    //                   0 65
    //                   1 115;
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
        1;
        JVM INSTR tableswitch 0 1: default 140
    //                   0 65
    //                   1 167;
           goto _L4 _L5 _L6
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        while (true) 
        {
            switch (1)
            {
            default:
                break;

            case 0: // '\0'
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                break; /* Loop/switch isn't completed */
            }
        }
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_65;
_L7:
        obj = reason;
        i = b044804480448044804480448;
        obj1 = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u020D\u01DB\u01DF\u01DF\u01E3\u05F3\u05F3\u05F3\u05F3\u01DB\u01DF\u01DF\u01E3", '\322', '\331', '\003'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((((Integer)obj1).intValue() + i) * b044804480448044804480448) % b044804480448044804480448 != b044804480448044804480448)
        {
            obj1 = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u0179\u055F\u055F\u0147\u014B\u014B\u014F\u0147\u014B\u014B\u014F\u0147\u014B\u014B\u014F\u055F", '\351', '.', '\003'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b044804480448044804480448 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u029C\u0682\u0682\u026A\u026E\u026E\u0272\u026A\u026E\u026E\u0272\u026A\u026E\u026E\u0272\u0682", '\276', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b044804480448044804480448 = ((Integer)obj1).intValue();
        }
        return ((String) (obj));
    }

    public int getStatusCode()
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
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCD\uFFC6\uFFCF\uFFC8\uFFD5\uFFC9", '5', '\004'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj1 = com/visa/cbp/sdk/facade/data/GenericResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA8\u038E\u038E\uFF76\uFF7A\uFF7A\uFF7E\uFF76\uFF7A\uFF7A\uFF7E\uFF76\uFF7A\uFF7A\uFF7E\u038E", '\276', '\004', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b044804480448044804480448 = ((Integer)obj1).intValue();
            return statusCode;
        }
    }
}
