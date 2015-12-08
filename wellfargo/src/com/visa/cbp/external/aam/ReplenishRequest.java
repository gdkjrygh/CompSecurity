// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.aam;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.external.aam:
//            ReplenishAckRequest, Signature

public class ReplenishRequest extends ReplenishAckRequest
{

    public static int b042E042E042E042E042E042E = 1;
    public static int b042E042E042E042E042E042E = 0;
    public static int b042E042E042E042E042E042E = 15;
    public static int b042E042E042E042E042E042E = 2;
    private Signature signature;
    private List tvls;

    public ReplenishRequest()
    {
_L8:
        0;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 51
    //                   1 0;
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
        0;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 103
    //                   1 0;
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
_L7:
        Object obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u015F\u052B\u012D\u0131\u012F\u0142\u052B\u012D\u0131\u012F\u0142\u012D\u0131\u012F\u0142\u012D\u0131\u012F\u0142", 'G', '\266', '\003'), new Class[0]);
        int i;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        switch ((i * (b042E042E042E042E042E042E + i)) % b042E042E042E042E042E042E)
        {
        default:
            Object obj1 = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFECA\u0296\uFE98\uFE9C\uFE9A\uFEAD\u0296\uFE98\uFE9C\uFE9A\uFEAD\uFE98\uFE9C\uFE9A\uFEAD\uFE98\uFE9C\uFE9A\uFEAD", '\314', '\003'), new Class[0]);
            int j;
            int k;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            j = ((Integer)obj1).intValue();
            k = b042E042E042E042E042E042E;
            obj1 = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u012E\u04FA\374\u0100\376\u0111\u04FA\374\u0100\376\u0111\374\u0100\376\u0111\374\u0100\376\u0111", 'D', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            if ((((Integer)obj1).intValue() * (k + j)) % b042E042E042E042E042E042E != b042E042E042E042E042E042E)
            {
                b042E042E042E042E042E042E = 85;
            }
            obj1 = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417(")\u03F5\uFFF7\uFFFB\uFFF9\f\u03F5\uFFF7\uFFFB\uFFF9\f\uFFF7\uFFFB\uFFF9\f\uFFF7\uFFFB\uFFF9\f", '\003', '<', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            super();
            return;
        }
    }

    public static int b042E042E042E042E042E042E()
    {
        return 67;
    }

    public Signature getSignature()
    {
        if (((b042E042E042E042E042E042E + b042E042E042E042E042E042E) * b042E042E042E042E042E042E) % b042E042E042E042E042E042E != b042E042E042E042E042E042E)
        {
            b042E042E042E042E042E042E = 18;
            Object obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u01CE\u059A\u019C\u01A0\u019E\u01B1\u059A\u019C\u01A0\u019E\u01B1\u019C\u01A0\u019E\u01B1\u019C\u01A0\u019E\u01B1", 'w', '\365', '\003'), new Class[0]);
            Object obj1;
            int i;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj).intValue();
        }
        obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u01E6\u05B2\u01B4\u01B8\u01B6\u01C9\u05B2\u01B4\u01B8\u01B6\u01C9\u01B4\u01B8\u01B6\u01C9\u01B4\u01B8\u01B6\u01C9", '\302', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        i = ((Integer)obj).intValue();
        switch ((i * (b042E042E042E042E042E042E + i)) % b042E042E042E042E042E042E)
        {
        default:
label0:
            while (true) 
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
            }
            obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u0196\u0562\u0164\u0168\u0166\u0179\u0562\u0164\u0168\u0166\u0179\u0164\u0168\u0166\u0179\u0164\u0168\u0166\u0179", '\232', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                throw ((InvocationTargetException) (obj1)).getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj).intValue();
            b042E042E042E042E042E042E = 85;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            obj = signature;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        return ((Signature) (obj));
    }

    public List getTvls()
    {
        if (((b042E042E042E042E042E042E + b042E042E042E042E042E042E) * b042E042E042E042E042E042E) % b042E042E042E042E042E042E != b042E042E042E042E042E042E)
        {
            Object obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFF68\u0334\uFF36\uFF3A\uFF38\uFF4B\u0334\uFF36\uFF3A\uFF38\uFF4B\uFF36\uFF3A\uFF38\uFF4B\uFF36\uFF3A\uFF38\uFF4B", '\372', '\0'), new Class[0]);
            Object obj1;
            int i;
            int j;
            int k;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u021D\u05E9\u01EB\u01EF\u01ED\u0200\u05E9\u01EB\u01EF\u01ED\u0200\u01EB\u01EF\u01ED\u0200\u01EB\u01EF\u01ED\u0200", '\356', '\315', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj).intValue();
        }
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
        try
        {
            obj = tvls;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        try
        {
            i = b042E042E042E042E042E042E;
            j = b042E042E042E042E042E042E;
            k = b042E042E042E042E042E042E;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        switch ((i * (j + i)) % k)
        {
        default:
            obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFF04\u02D0\uFED2\uFED6\uFED4\uFEE7\u02D0\uFED2\uFED6\uFED4\uFEE7\uFED2\uFED6\uFED4\uFEE7\uFED2\uFED6\uFED4\uFEE7", '\257', '\003'), new Class[0]);
            break;

        case 0: // '\0'
            break MISSING_BLOCK_LABEL_245;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b042E042E042E042E042E042E = i;
        b042E042E042E042E042E042E = 0;
        tvls = new ArrayList();
        obj = tvls;
        return ((List) (obj));
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public void setSignature(Signature signature1)
    {
label0:
        do
        {
            switch (1)
            {
            default:
                while (true) 
                {
label1:
                    switch (0)
                    {
                    case 1: // '\001'
                        break;

                    default:
label2:
                        while (true) 
                        {
                            switch (1)
                            {
                            default:
                                break;

                            case 0: // '\0'
                                break label1;

                            case 1: // '\001'
                                break label2;
                            }
                        }
                        // fall through

                    case 0: // '\0'
                        switch (0)
                        {
                        default:
                            break;

                        case 0: // '\0'
                            break label0;

                        case 1: // '\001'
                            continue label0;
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
        signature = signature1;
        if (((b042E042E042E042E042E042E + b042E042E042E042E042E042E) * b042E042E042E042E042E042E) % b042E042E042E042E042E042E != b042E042E042E042E042E042E)
        {
            b042E042E042E042E042E042E = 89;
            signature1 = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u0184\u0550\u0152\u0156\u0154\u0167\u0550\u0152\u0156\u0154\u0167\u0152\u0156\u0154\u0167\u0152\u0156\u0154\u0167", '\244', '~', '\003'), new Class[0]);
            int i;
            try
            {
                signature1 = ((Signature) (signature1.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Signature signature1)
            {
                throw signature1.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)signature1).intValue();
            signature1 = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\u0120\u04EC\356\362\360\u0103\u04EC\356\362\360\u0103\356\362\360\u0103\356\362\360\u0103", '_', '\001'), new Class[0]);
            try
            {
                signature1 = ((Signature) (signature1.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Signature signature1)
            {
                throw signature1.getCause();
            }
            i = ((Integer)signature1).intValue();
            switch ((i * (b042E042E042E042E042E042E + i)) % b042E042E042E042E042E042E)
            {
            default:
                signature1 = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\310\u0494\226\232\230\253\u0494\226\232\230\253\226\232\230\253\226\232\230\253", 'E', '\253', '\001'), new Class[0]);
                try
                {
                    signature1 = ((Signature) (signature1.invoke(null, new Object[0])));
                }
                // Misplaced declaration of an exception variable
                catch (Signature signature1)
                {
                    throw signature1.getCause();
                }
                b042E042E042E042E042E042E = ((Integer)signature1).intValue();
                b042E042E042E042E042E042E = 23;
                break;

            case 0: // '\0'
                break;
            }
        }
    }

    public void setTvls(List list)
    {
        int i = b042E042E042E042E042E042E;
        switch ((i * (b042E042E042E042E042E042E + i)) % b042E042E042E042E042E042E)
        {
        default:
            Object obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\uFFAE\u037A\uFF7C\uFF80\uFF7E\uFF91\u037A\uFF7C\uFF80\uFF7E\uFF91\uFF7C\uFF80\uFF7E\uFF91\uFF7C\uFF80\uFF7E\uFF91", '\257', '\005', '\0'), new Class[0]);
            int j;
            int k;
            int l;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/aam/ReplenishRequest.getMethod(nuuuuu.b0417041704170417041704170417("\330\u04A4\246\252\250\273\u04A4\246\252\250\273\246\252\250\273\246\252\250\273", '\032', '\220', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b042E042E042E042E042E042E = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            j = b042E042E042E042E042E042E;
            k = b042E042E042E042E042E042E;
            l = b042E042E042E042E042E042E;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 193
    //                   0 166;
           goto _L1 _L2
_L1:
        try
        {
            b042E042E042E042E042E042E = 42;
            b042E042E042E042E042E042E = 92;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
_L2:
        try
        {
            tvls = list;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        throw list;
    }
}
