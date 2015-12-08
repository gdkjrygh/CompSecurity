// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class ApduResponseAction
{

    public static final int VCPCS_ACTION_CODE_CVM_REQUIRED = 100;
    public static final int VCPCS_ACTION_CODE_INCREMENT_ATC = 101;
    public static final int VCPCS_ACTION_CODE_NONE = 0;
    public static final String VCPCS_ACTION_MSG_CVM_REQUIRED = "CVM Verification Required";
    public static final String VCPCS_ACTION_MSG_INCREMENT_ATC = "Increment the ATC";
    public static int b043A043A043A043A043A043A = 94;
    public static int b043A043A043A043A043A043A = 2;
    public static int b043A043A043A043A043A043A = 0;
    public static int b043A043A043A043A043A043A = 1;
    private int vcpcsActionCode;
    private String vcpcsActionMsg;

    public ApduResponseAction()
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
        super();
        int i = b043A043A043A043A043A043A;
        switch ((i * (b043A043A043A043A043A043A + i)) % b043A043A043A043A043A043A)
        {
        default:
label1:
            while (true) 
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
                            continue label1;

                        case 1: // '\001'
                            break label1;
                        }
                    }
                    break;

                case 0: // '\0'
                    break;

                case 1: // '\001'
                    break label1;
                }
            }
            if (((b043A043A043A043A043A043A + b043A043A043A043A043A043A) * b043A043A043A043A043A043A) % b043A043A043A043A043A043A != b043A043A043A043A043A043A)
            {
                b043A043A043A043A043A043A = 11;
                Object obj = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\344\266\262\265\307\266\262\265\307\u04BC\u04BC\266\262\265\307\266\262\265\307", '\206', '\002'), new Class[0]);
                try
                {
                    obj = ((Method) (obj)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    throw invocationtargetexception.getCause();
                }
                b043A043A043A043A043A043A = ((Integer)obj).intValue();
            }
            b043A043A043A043A043A043A = 54;
            b043A043A043A043A043A043A = 42;
            // fall through

        case 0: // '\0'
            vcpcsActionCode = 0;
            vcpcsActionMsg = "";
            return;
        }
    }

    public ApduResponseAction(int i, String s)
    {
        Object obj;
        int j;
        try
        {
            super();
            vcpcsActionCode = 0;
            vcpcsActionMsg = "";
            vcpcsActionCode = i;
            i = b043A043A043A043A043A043A;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\226\u046E\u046Edhgu\u046Edhgudhgu", '%', 'Y', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        obj = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("|JNM[\u0454JNM[\u0454JNM[JNM[", 'f', 'L', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        (i * (j + i)) % ((Integer)obj).intValue();
        JVM INSTR tableswitch 0 0: default 124
    //                   0 172;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_172;
_L1:
        try
        {
            b043A043A043A043A043A043A = 73;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7D\uFF4B\uFF4F\uFF4E\uFF5C\uFF4B\uFF4F\uFF4E\uFF5C\u0355\u0355\uFF4B\uFF4F\uFF4E\uFF5C\uFF4B\uFF4F\uFF4E\uFF5C", '\367', '\022', '\001'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043A043A043A043A043A043A = i;
        vcpcsActionMsg = s;
        return;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    public static int b043A043A043A043A043A043A()
    {
        return 29;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 2;
    }

    public static int b043A043A043A043A043A043A()
    {
        return 1;
    }

    public int getVcpcsActionCode()
    {
        Object obj = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFF12\uFEE0\uFEE4\uFEE3\uFEF1\uFEE0\uFEE4\uFEE3\uFEF1\u02EA\u02EA\uFEE0\uFEE4\uFEE3\uFEF1\uFEE0\uFEE4\uFEE3\uFEF1", 'p', '\004'), new Class[0]);
        int i;
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b043A043A043A043A043A043A;
        obj = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("X&*)7\u0430&*)7\u0430&*)7&*)7", '\222', '\234', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        switch (((j + i) * i) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("%\uFFF3\uFFF7\uFFF6\004\uFFF3\uFFF7\uFFF6\004\u03FD\u03FD\uFFF3\uFFF7\uFFF6\004\uFFF3\uFFF7\uFFF6\004", '\031', 'V', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\u01E4\u01B2\u01B6\u01B5\u01C3\u01B2\u01B6\u01B5\u01C3\u05BC\u05BC\u01B2\u01B6\u01B5\u01C3\u01B2\u01B6\u01B5\u01C3", '\301', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            return vcpcsActionCode;
        }
    }

    public String getVcpcsActionMsg()
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u01AA\u01A3\u01AC\u01A5\u01B2\u01A6", 'r', '\314', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        Object obj2;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            obj2 = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\032\uFFE8\uFFEC\uFFEB\uFFF9\uFFE8\uFFEC\uFFEB\uFFF9\u03F2\u03F2\uFFE8\uFFEC\uFFEB\uFFF9\uFFE8\uFFEC\uFFEB\uFFF9", '$', '\003'), new Class[0]);
        }
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw ((InvocationTargetException) (obj2)).getCause();
        }
        b043A043A043A043A043A043A = ((Integer)obj2).intValue();
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
        obj2 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBF\uFFB8\uFFC1\uFFBA\uFFC7\uFFBB", '*', '\203', '\0'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        ((Integer)obj2).intValue();
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_139;
        }
        obj2;
        Object obj3 = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFF7F\uFF4D\uFF51\uFF50\uFF5E\uFF4D\uFF51\uFF50\uFF5E\u0357\u0357\uFF4D\uFF51\uFF50\uFF5E\uFF4D\uFF51\uFF50\uFF5E", '\343', '\0'), new Class[0]);
        try
        {
            obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            throw ((InvocationTargetException) (obj3)).getCause();
        }
        b043A043A043A043A043A043A = ((Integer)obj3).intValue();
        return vcpcsActionMsg;
        obj3;
        throw ((InvocationTargetException) (obj3)).getCause();
    }

    public void setVcpcsActionCode(int i)
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
        int j = b043A043A043A043A043A043A;
        int k = b043A043A043A043A043A043A;
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
        int l = b043A043A043A043A043A043A;
        int i1 = b043A043A043A043A043A043A;
        int j1 = b043A043A043A043A043A043A;
        Object obj = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\315\233\237\236\254\u04A5\233\237\236\254\u04A5\233\237\236\254\233\237\236\254", 'k', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        switch (((j1 + i1) * i1) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\uFF30\uFEFE\uFF02\uFF01\uFF0F\uFEFE\uFF02\uFF01\uFF0F\u0308\u0308\uFEFE\uFF02\uFF01\uFF0F\uFEFE\uFF02\uFF01\uFF0F", '\231', '\003'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\u025A\u0228\u022C\u022B\u0239\u0228\u022C\u022B\u0239\u0632\u0632\u0228\u022C\u022B\u0239\u0228\u022C\u022B\u0239", '\374', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b043A043A043A043A043A043A = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            switch ((j * (k + j)) % l)
            {
            default:
                b043A043A043A043A043A043A = 85;
                obj1 = com/visa/cbp/sdk/facade/data/ApduResponseAction.getMethod(nuuuuu.b0417041704170417041704170417("\u0115\343\347\346\364\343\347\346\364\u04ED\u04ED\343\347\346\364\343\347\346\364", '\227', '\034', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b043A043A043A043A043A043A = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                vcpcsActionCode = i;
                return;
            }
        }
    }

    public void setVcpcsActionMsg(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
}
