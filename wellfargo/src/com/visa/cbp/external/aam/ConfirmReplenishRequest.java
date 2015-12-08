// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.aam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.external.aam:
//            ReplenishAckRequest

public class ConfirmReplenishRequest extends ReplenishAckRequest
{

    public static int b041204120412041204120412 = 1;
    public static int b041204120412041204120412 = 56;
    public static int b041204120412041204120412 = 2;

    public ConfirmReplenishRequest()
    {
        Object obj;
        int i;
        int k;
        int l;
        try
        {
            i = b041204120412041204120412;
            k = b041204120412041204120412;
            l = b041204120412041204120412;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 124;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_124;
_L1:
        obj = com/visa/cbp/external/aam/ConfirmReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\013\uFFD9\uFFDD\uFFDA\uFFDB\u03BB\uFFD9\uFFDD\uFFDA\uFFDB\uFFD9\uFFDD\uFFDA\uFFDB\uFFD9\uFFDD\uFFDA\uFFDB\uFFD9\uFFDD\uFFDA\uFFDB", '\307', 'p', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        InvocationTargetException invocationtargetexception;
        try
        {
            b041204120412041204120412 = j;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/external/aam/ConfirmReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFF00\uFECE\uFED2\uFECF\uFED0\u02B0\uFECE\uFED2\uFECF\uFED0\uFECE\uFED2\uFECF\uFED0\uFECE\uFED2\uFECF\uFED0\uFECE\uFED2\uFECF\uFED0", '\261', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b041204120412041204120412 = j;
_L4:
        1;
        JVM INSTR tableswitch 0 1: default 148
    //                   0 124
    //                   1 175;
           goto _L3 _L4 _L5
_L3:
        1;
        JVM INSTR tableswitch 0 1: default 172
    //                   0 124
    //                   1 175;
           goto _L3 _L4 _L5
_L5:
        super();
        obj = com/visa/cbp/external/aam/ConfirmReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFDCB\uFD99\uFD9D\uFD9A\uFD9B\u017B\uFD99\uFD9D\uFD9A\uFD9B\uFD99\uFD9D\uFD9A\uFD9B\uFD99\uFD9D\uFD9A\uFD9B\uFD99\uFD9D\uFD9A\uFD9B", '\335', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        j = ((Integer)obj).intValue();
        switch ((j * (b041204120412041204120412 + j)) % b041204120412041204120412)
        {
        default:
            obj = com/visa/cbp/external/aam/ConfirmReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\266\204\210\205\206\u0466\204\210\205\206\204\210\205\206\204\210\205\206\204\210\205\206", '*', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b041204120412041204120412 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/aam/ConfirmReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u01C0\u018E\u0192\u018F\u0190\u0570\u018E\u0192\u018F\u0190\u018E\u0192\u018F\u0190\u018E\u0192\u018F\u0190\u018E\u0192\u018F\u0190", '\350', 'v', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b041204120412041204120412 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
        invocationtargetexception;
        throw invocationtargetexception.getCause();
        invocationtargetexception1;
        throw invocationtargetexception1.getCause();
    }

    public static int b041204120412041204120412()
    {
        return 21;
    }
}
