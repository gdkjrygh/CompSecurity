// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class UpdateReason
{

    public static int b041404140414041404140414 = 2;
    public static int b041404140414041404140414 = 99;
    public static int b041404140414041404140414 = 1;
    public static int b041404140414041404140414;
    private String reasonCode;
    private String reasonDesc;

    public UpdateReason()
    {
        int i;
        try
        {
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            b041404140414041404140414 = 68;
            b041404140414041404140414 = 75;
            if (((b041404140414041404140414 + b041404140414041404140414) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
            {
                Object obj = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF7\uFFC5\uFFC9\uFFC6\uFFC9\u03A9\uFFC5\uFFC9\uFFC6\uFFC9\u03A9\uFFC5\uFFC9\uFFC6\uFFC9\u03A9", '}', '\022', '\001'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b041404140414041404140414 = ((Integer)obj).intValue();
                obj = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\227\305\301\304\301\u04E1\305\301\304\301\u04E1\305\301\304\301\u04E1", '\365', '\002'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b041404140414041404140414 = ((Integer)obj).intValue();
            }
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b041404140414041404140414()
    {
        return 81;
    }

    public static int b041404140414041404140414()
    {
        return 1;
    }

    public String getReasonCode()
    {
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
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF05\uFEFE\uFF07\uFF00\uFF0D\uFF01", 'w', '\360', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        InvocationTargetException invocationtargetexception;
        invocationtargetexception;
        try
        {
            throw invocationtargetexception.getCause();
        }
        catch (Exception exception)
        {
            b041404140414041404140414 = 96;
        }
        return reasonCode;
    }

    public String getReasonDesc()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void setReasonCode(String s)
    {
label0:
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
                        break label0;

                    case 1: // '\001'
                        continue label0;
                    }
                }
                break;

            case 0: // '\0'
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            reasonCode = s;
            i = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF9\u03AB\u03AB\u03AB\uFFC7\uFFCB\uFFC8\uFFCB\uFFC7\uFFCB\uFFC8\uFFCB\u03AB", '#', '\004'), new Class[0]);
        s = ((String) (s.invoke(null, new Object[0])));
        j = ((Integer)s).intValue();
        k = b041404140414041404140414;
        l = b041404140414041404140414;
        i1 = b041404140414041404140414;
        if (((j + i) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            s = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\257}\201~\201\u0461}\201~\201\u0461}\201~\201\u0461", 'p', '\275', '\001'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)s).intValue();
            b041404140414041404140414 = 72;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            b041404140414041404140414 = 0;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\uFD6E\uFD3C\uFD40\uFD3D\uFD40\u0120\uFD3C\uFD40\uFD3D\uFD40\u0120\uFD3C\uFD40\uFD3D\uFD40\u0120", '\374', '\004'), new Class[0]);
        s = ((String) (s.invoke(null, new Object[0])));
        i = ((Integer)s).intValue();
        b041404140414041404140414 = i;
        return;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    public void setReasonDesc(String s)
    {
        reasonDesc = s;
        int i;
        int j;
        int k;
        try
        {
            i = b041404140414041404140414;
            j = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        try
        {
            k = b041404140414041404140414;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 44
    //                   0 131;
           goto _L1 _L2
_L1:
        i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            b041404140414041404140414 = 1;
            s = com/visa/cbp/external/common/UpdateReason.getMethod(nuuuuu.b0417041704170417041704170417("\313\231\235\232\235\u047D\231\235\232\235\u047D\231\235\232\235\u047D", '/', '\230', '\001'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041404140414041404140414 = ((Integer)s).intValue();
            break;

        case 0: // '\0'
            break;
        }
        b041404140414041404140414 = 15;
        b041404140414041404140414 = 82;
_L2:
        return;
        s;
        throw s;
    }
}
