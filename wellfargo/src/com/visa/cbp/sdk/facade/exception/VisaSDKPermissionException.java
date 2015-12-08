// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.exception;

import com.visa.cbp.sdk.facade.error.ReasonCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class VisaSDKPermissionException extends RuntimeException
{

    public static int b044404440444044404440444 = 2;
    public static int b044404440444044404440444 = 0;
    public static int b044404440444044404440444 = 1;
    public static int b044404440444044404440444 = 63;
    private int errorCode;
    private ReasonCode reasonCode;

    public VisaSDKPermissionException(String s, ReasonCode reasoncode, int i)
    {
        super(s);
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
                    int j = b044404440444044404440444;
                    switch ((j * (b044404440444044404440444 + j)) % b044404440444044404440444)
                    {
                    default:
                        b044404440444044404440444 = 39;
                        s = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\222\u0474\u0474`ddd`ddd`ddd\u0474", '\030', '\001'), new Class[0]);
                        int k;
                        int l;
                        try
                        {
                            s = ((String) (s.invoke(null, new Object[0])));
                        }
                        // Misplaced declaration of an exception variable
                        catch (String s)
                        {
                            throw s.getCause();
                        }
                        b044404440444044404440444 = ((Integer)s).intValue();
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
                }
                break;

            case 0: // '\0'
                break;

            case 1: // '\001'
                break label0;
            }
        } while (true);
        errorCode = i;
        reasonCode = reasoncode;
        i = b044404440444044404440444;
        k = b044404440444044404440444;
        l = b044404440444044404440444;
        s = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE4\uFFB2\uFFB6\uFFB6\uFFB6\uFFB2\uFFB6\uFFB6\uFFB6\u03C6\uFFB2\uFFB6\uFFB6\uFFB6\uFFB2\uFFB6\uFFB6\uFFB6\u03C6", '?', '\003'), new Class[0]);
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((l * (i + k)) % ((Integer)s).intValue() != b044404440444044404440444)
        {
            s = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1A\u02FC\u02FC\uFEE8\uFEEC\uFEEC\uFEEC\uFEE8\uFEEC\uFEEC\uFEEC\uFEE8\uFEEC\uFEEC\uFEEC\u02FC", 'Z', '\356', '\0'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044404440444044404440444 = ((Integer)s).intValue();
            s = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\225\u0477\u0477cgggcgggcggg\u0477", '\021', '"', '\003'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044404440444044404440444 = ((Integer)s).intValue();
        }
    }

    public VisaSDKPermissionException(String s, Throwable throwable, ReasonCode reasoncode, int i)
    {
        super(s, throwable);
        int j = b044404440444044404440444;
        int k = b044404440444044404440444;
        int l = b044404440444044404440444;
        s = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\uFED6\uFEA4\uFEA8\uFEA8\uFEA8\uFEA4\uFEA8\uFEA8\uFEA8\u02B8\uFEA4\uFEA8\uFEA8\uFEA8\uFEA4\uFEA8\uFEA8\uFEA8\u02B8", '\204', '\004'), new Class[0]);
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((l * (j + k)) % ((Integer)s).intValue() != b044404440444044404440444)
        {
            b044404440444044404440444 = 53;
            s = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\313\u04AD\u04AD\231\235\235\235\231\235\235\235\231\235\235\235\u04AD", '@', '\251', '\001'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b044404440444044404440444 = ((Integer)s).intValue();
        }
        errorCode = i;
        if (((b044404440444044404440444 + b044404440444044404440444) * b044404440444044404440444) % b044404440444044404440444 != b044404440444044404440444)
        {
            b044404440444044404440444 = 18;
            b044404440444044404440444 = 74;
        }
        reasonCode = reasoncode;
    }

    public static int b044404440444044404440444()
    {
        return 2;
    }

    public static int b044404440444044404440444()
    {
        return 1;
    }

    public static int b044404440444044404440444()
    {
        return 72;
    }

    public int getErrorCode()
    {
        int i;
        try
        {
            i = errorCode;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return i;
    }

    public ReasonCode getReasonCode()
    {
        int i = b044404440444044404440444;
        int j = b044404440444044404440444;
        int k = b044404440444044404440444;
        Object obj = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("7\005\t\t\t\005\t\t\t\u0419\005\t\t\t\005\t\t\t\u0419", 'O', 'z', '\002'), new Class[0]);
        int l;
        int i1;
        int j1;
        int k1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        l = ((Integer)obj).intValue();
        i1 = b044404440444044404440444;
        j1 = b044404440444044404440444;
        obj = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\u0117\u04F9\345\351\351\351\345\351\351\351\345\351\351\351\345\351\351\351\u04F9", '\265', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        k1 = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("X&***&***\u043A&***&***\u043A", '\n', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        switch ((j1 * (k1 + j1)) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\366\u04D8\u04D8\304\310\310\310\304\310\310\310\304\310\310\310\u04D8", '7', '\313', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception3;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            b044404440444044404440444 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\u0126\u0508\u0508\364\370\370\370\364\370\370\370\364\370\370\370\u0508", 'b', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception5)
            {
                throw invocationtargetexception5.getCause();
            }
            b044404440444044404440444 = ((Integer)obj1).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if ((k * (i + j)) % l != i1)
        {
            b044404440444044404440444 = 82;
            obj1 = com/visa/cbp/sdk/facade/exception/VisaSDKPermissionException.getMethod(nuuuuu.b0417041704170417041704170417("\uFE0A\u01EC\u01EC\uFDD8\uFDDC\uFDDC\uFDDC\uFDD8\uFDDC\uFDDC\uFDDC\uFDD8\uFDDC\uFDDC\uFDDC\u01EC", '\310', '\004'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b044404440444044404440444 = ((Integer)obj1).intValue();
        }
        0;
        JVM INSTR tableswitch 0 1: default 324
    //                   0 351
    //                   1 301;
           goto _L1 _L2 _L3
_L3:
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
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 376
    //                   0 301
    //                   1 403;
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
        break MISSING_BLOCK_LABEL_301;
_L7:
        return reasonCode;
    }
}
