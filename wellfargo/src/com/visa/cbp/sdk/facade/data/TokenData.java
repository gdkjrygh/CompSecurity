// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import com.visa.cbp.external.common.Status;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.data:
//            TokenKey

public class TokenData
{

    public static int b043F043F043F043F043F043F = 0;
    public static int b043F043F043F043F043F043F = 4;
    public static int b043F043F043F043F043F043F = 1;
    public static int b043F043F043F043F043F043F = 2;
    private String cardArtUri;
    private String cardLastFour;
    private String cardReference;
    private String channel;
    private TokenKey tokenKey;
    private String tokenLastFour;
    private Status tokenStatus;

    public TokenData()
    {
        int i = b043F043F043F043F043F043F;
        Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u02F3\u02C1\u02C5\u02C4\u02D7\u02C1\u02C5\u02C4\u02D7\u02C1\u02C5\u02C4\u02D7\u06D0\u02C1\u02C5\u02C4\u02D7\u06D0", '\333', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            b043F043F043F043F043F043F = 34;
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\263\201\205\204\227\u0490\u0490\201\205\204\227\201\205\204\227\u0490", 'Q', '\005'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            int j;
            int k;
            int l;
            int i1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
        }
        j = b043F043F043F043F043F043F;
        k = b043F043F043F043F043F043F;
        l = b043F043F043F043F043F043F;
        obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\032\uFFE8\uFFEC\uFFEB\uFFFE\u03F7\uFFE8\uFFEC\uFFEB\uFFFE\u03F7\uFFE8\uFFEC\uFFEB\uFFFE\u03F7", 'H', '\0'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i1 = ((Integer)obj1).intValue();
        obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\376\314\320\317\342\314\320\317\342\u04DB\u04DB\314\320\317\342\u04DB", '4', '\006'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if ((l * (j + k)) % i1 != ((Integer)obj1).intValue())
        {
            b043F043F043F043F043F043F = 67;
            b043F043F043F043F043F043F = 85;
        }
        super();
    }

    public TokenData(TokenKey tokenkey, String s, String s1, String s2, String s3)
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
        int i;
        int j;
        int k;
        try
        {
            super();
            tokenKey = tokenkey;
            cardArtUri = s;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        try
        {
            cardReference = s1;
            i = b043F043F043F043F043F043F;
            j = b043F043F043F043F043F043F;
            k = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey;
        }
        (i * (j + i)) % k;
        JVM INSTR tableswitch 0 0: default 116
    //                   0 201;
           goto _L1 _L2
_L1:
        tokenkey = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\314\232\236\235\260\u04A9\u04A9\232\236\235\260\232\236\235\260\u04A9", 'j', '\005'), new Class[0]);
        tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
        i = ((Integer)tokenkey).intValue();
        b043F043F043F043F043F043F = i;
        tokenkey = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF79\uFF47\uFF4B\uFF4A\uFF5D\u0356\u0356\uFF47\uFF4B\uFF4A\uFF5D\uFF47\uFF4B\uFF4A\uFF5D\u0356", '\351', '\0'), new Class[0]);
        tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
        i = ((Integer)tokenkey).intValue();
        b043F043F043F043F043F043F = i;
_L2:
        tokenkey = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE4\uFFB2\uFFB6\uFFB5\uFFC8\u03C1\u03C1\uFFB2\uFFB6\uFFB5\uFFC8\uFFB2\uFFB6\uFFB5\uFFC8\u03C1", '\365', 'w', '\001'), new Class[0]);
        try
        {
            tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (TokenKey tokenkey)
        {
            throw tokenkey.getCause();
        }
        i = ((Integer)tokenkey).intValue();
        switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
        {
        default:
            b043F043F043F043F043F043F = 53;
            b043F043F043F043F043F043F = 34;
            break;

        case 0: // '\0'
            break;
        }
        channel = s2;
        cardLastFour = s3;
        return;
        tokenkey;
        throw tokenkey.getCause();
        tokenkey;
        throw tokenkey.getCause();
    }

    public static int b043F043F043F043F043F043F()
    {
        return 1;
    }

    public static int b043F043F043F043F043F043F()
    {
        return 0;
    }

    public static int b043F043F043F043F043F043F()
    {
        return 2;
    }

    public static int b043F043F043F043F043F043F()
    {
        return 49;
    }

    public String getCardArtUri()
    {
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    int i = b043F043F043F043F043F043F;
                    switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
                    {
                    default:
                        Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("X&*)<\u0435\u0435&*)<&*)<\u0435", '\242', '\230', '\001'), new Class[0]);
                        Object obj1;
                        int j;
                        int k;
                        int l;
                        try
                        {
                            obj = ((Method) (obj)).invoke(null, new Object[0]);
                        }
                        catch (InvocationTargetException invocationtargetexception)
                        {
                            throw invocationtargetexception.getCause();
                        }
                        b043F043F043F043F043F043F = ((Integer)obj).intValue();
                        b043F043F043F043F043F043F = 45;
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
                break label0;

            case 1: // '\001'
                break;
            }
        } while (true);
        try
        {
            j = b043F043F043F043F043F043F;
            k = b043F043F043F043F043F043F;
            l = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 172
    //                   0 217;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_217;
_L1:
        obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\235kon\201\u047A\u047Akon\201kon\201\u047A", ';', '\005'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        try
        {
            b043F043F043F043F043F043F = j;
            b043F043F043F043F043F043F = 19;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj = cardArtUri;
        return ((String) (obj));
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public String getCardReference()
    {
        return cardReference;
    }

    public String getChannel()
    {
        int i = b043F043F043F043F043F043F;
        switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("zHLK^\u0457\u0457HLK^HLK^\u0457", '\b', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj).intValue();
            b043F043F043F043F043F043F = 9;
            // fall through

        case 0: // '\0'
            obj = channel;
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
        return ((String) (obj));
    }

    public String getLastFour()
    {
label0:
        do
        {
            switch (0)
            {
            default:
                while (true) 
                {
                    int i = b043F043F043F043F043F043F;
                    Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\222`dcv`dcv`dcv\u046F`dcv\u046F", '\030', '\001'), new Class[0]);
                    try
                    {
                        obj = ((Method) (obj)).invoke(null, new Object[0]);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj2)
                    {
                        throw ((InvocationTargetException) (obj2)).getCause();
                    }
                    if (((((Integer)obj).intValue() + i) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
                    {
                        b043F043F043F043F043F043F = 81;
                        Object obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF0A\uFED8\uFEDC\uFEDB\uFEEE\u02E7\u02E7\uFED8\uFEDC\uFEDB\uFEEE\uFED8\uFEDC\uFEDB\uFEEE\u02E7", '\254', '\003'), new Class[0]);
                        Object obj2;
                        int j;
                        int k;
                        int l;
                        try
                        {
                            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                        }
                        catch (InvocationTargetException invocationtargetexception)
                        {
                            throw invocationtargetexception.getCause();
                        }
                        b043F043F043F043F043F043F = ((Integer)obj1).intValue();
                    }
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
        try
        {
            j = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        try
        {
            k = b043F043F043F043F043F043F;
            l = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            throw obj2;
        }
        (j * (k + j)) % l;
        JVM INSTR tableswitch 0 0: default 192
    //                   0 241;
           goto _L1 _L2
_L2:
        break MISSING_BLOCK_LABEL_241;
_L1:
        b043F043F043F043F043F043F = 25;
        obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\234jnm\200\u0479\u0479jnm\200jnm\200\u0479", '\220', '\312', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        b043F043F043F043F043F043F = j;
        return cardLastFour;
        obj2;
        throw ((InvocationTargetException) (obj2)).getCause();
    }

    public TokenKey getTokenKey()
    {
        int i = b043F043F043F043F043F043F;
        switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u014E\u011C\u0120\u011F\u0132\u052B\u052B\u011C\u0120\u011F\u0132\u011C\u0120\u011F\u0132\u052B", 'U', '\227', '\003'), new Class[0]);
            Object obj1;
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
            b043F043F043F043F043F043F = 52;
            // fall through

        case 0: // '\0'
            obj = tokenKey;
            break;
        }
label0:
        do
        {
            j = b043F043F043F043F043F043F;
            switch ((j * (b043F043F043F043F043F043F + j)) % b043F043F043F043F043F043F)
            {
            default:
                obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u024C\u021A\u021E\u021D\u0230\u0629\u0629\u021A\u021E\u021D\u0230\u021A\u021E\u021D\u0230\u0629", '\365', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception1)
                {
                    throw invocationtargetexception1.getCause();
                }
                b043F043F043F043F043F043F = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("D\022\026\025(\u0421\u0421\022\026\025(\022\026\025(\u0421", '\017', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b043F043F043F043F043F043F = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
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
                break;
            }
        } while (true);
        return ((TokenKey) (obj));
    }

    public String getTokenLastFour()
    {
        if (((b043F043F043F043F043F043F + b043F043F043F043F043F043F) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            b043F043F043F043F043F043F = 45;
            b043F043F043F043F043F043F = 1;
        }
        String s;
        try
        {
            s = tokenLastFour;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return s;
    }

    public Status getTokenStatus()
    {
        Status status;
        try
        {
            status = tokenStatus;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return status;
    }

    public void setCardArtUri(String s)
    {
        int i = b043F043F043F043F043F043F;
        Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u0105\323\327\326\351\323\327\326\351\323\327\326\351\u04E2\323\327\326\351\u04E2", '\302', '\037', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCE\uFF9C\uFFA0\uFF9F\uFFB2\u03AB\u03AB\uFF9C\uFFA0\uFF9F\uFFB2\uFF9C\uFFA0\uFF9F\uFFB2\u03AB", '\224', '\0'), new Class[0]);
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
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\251\373\377\370\215\u04F4\u04F4\373\377\370\215\373\377\370\215\u04F4", '\313', '\002'), new Class[0]);
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
            j = b043F043F043F043F043F043F;
            switch ((j * (b043F043F043F043F043F043F + j)) % b043F043F043F043F043F043F)
            {
            default:
                Object obj2 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\241\363\367\360\205\u04FC\u04FC\363\367\360\205\363\367\360\205\u04FC", '\303', '\002'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b043F043F043F043F043F043F = ((Integer)obj2).intValue();
                b043F043F043F043F043F043F = 18;
                break;

            case 0: // '\0'
                break;
            }
        }
        try
        {
            cardArtUri = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setCardReferenceId(String s)
    {
        if (((b043F043F043F043F043F043F + b043F043F043F043F043F043F) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC4\uFF92\uFF96\uFF95\uFFA8\u03A1\u03A1\uFF92\uFF96\uFF95\uFFA8\uFF92\uFF96\uFF95\uFFA8\u03A1", '\236', '\0'), new Class[0]);
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
            b043F043F043F043F043F043F = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFD89\uFD57\uFD5B\uFD5A\uFD6D\u0166\u0166\uFD57\uFD5B\uFD5A\uFD6D\uFD57\uFD5B\uFD5A\uFD6D\u0166", '\363', '\004'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj).intValue();
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
        try
        {
            cardReference = s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        i = 4;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            b043F043F043F043F043F043F = 71;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setChannel(String s)
    {
        if (((b043F043F043F043F043F043F + b043F043F043F043F043F043F) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417(";\t\r\f\037\u0418\u0418\t\r\f\037\t\r\f\037\u0418", '\r', '\004'), new Class[0]);
            int i;
            int j;
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
            b043F043F043F043F043F043F = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u016C\u013A\u013E\u013D\u0150\u0549\u0549\u013A\u013E\u013D\u0150\u013A\u013E\u013D\u0150\u0549", 'u', '\225', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj).intValue();
        }
        try
        {
            i = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF61\uFF2F\uFF33\uFF32\uFF45\uFF2F\uFF33\uFF32\uFF45\uFF2F\uFF33\uFF32\uFF45\u033E\uFF2F\uFF33\uFF32\uFF45\u033E", '\253', 'V', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        try
        {
            k = b043F043F043F043F043F043F;
            l = b043F043F043F043F043F043F;
            i1 = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((j + i) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u0251\u021F\u0223\u0222\u0235\u062E\u062E\u021F\u0223\u0222\u0235\u021F\u0223\u0222\u0235\u062E", '\245', '\006'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        i = ((Integer)obj).intValue();
        b043F043F043F043F043F043F = i;
        b043F043F043F043F043F043F = 35;
        channel = s;
        return;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    public void setLastFour(String s)
    {
        int i;
        int l;
        int i1;
        try
        {
            i = b043F043F043F043F043F043F;
            l = b043F043F043F043F043F043F;
            i1 = b043F043F043F043F043F043F;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        (i * (l + i)) % i1;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 234;
           goto _L1 _L2
_L1:
        Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u01A3\u0171\u0175\u0174\u0187\u0580\u0580\u0171\u0175\u0174\u0187\u0171\u0175\u0174\u0187\u0580", 'k', '\006'), new Class[0]);
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        j = ((Integer)obj).intValue();
        switch ((j * (b043F043F043F043F043F043F + j)) % b043F043F043F043F043F043F)
        {
        default:
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\205SWVi\u0462\u0462SWViSWVi\u0462", '\257', '\322', '\001'), new Class[0]);
            int k;
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
            obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFE0A\uFDD8\uFDDC\uFDDB\uFDEE\u01E7\u01E7\uFDD8\uFDDC\uFDDB\uFDEE\uFDD8\uFDDC\uFDDB\uFDEE\u01E7", '\310', '\004'), new Class[0]);
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
            break;

        case 0: // '\0'
            break;
        }
        b043F043F043F043F043F043F = 88;
        obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\364\302\306\305\330\u04D1\u04D1\302\306\305\330\302\306\305\330\u04D1", 'I', '\001'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        k = ((Integer)obj1).intValue();
        b043F043F043F043F043F043F = k;
_L2:
        try
        {
            cardLastFour = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s;
        throw s.getCause();
    }

    public void setTokenKey(TokenKey tokenkey)
    {
        tokenKey = tokenkey;
        int i = b043F043F043F043F043F043F;
        switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
        {
        default:
            tokenkey = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\002\uFFD0\uFFD4\uFFD3\uFFE6\u03DF\u03DF\uFFD0\uFFD4\uFFD3\uFFE6\uFFD0\uFFD4\uFFD3\uFFE6\u03DF", '\n', 'V', '\0'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)tokenkey).intValue();
            tokenkey = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u0146\u0114\u0118\u0117\u012A\u0523\u0523\u0114\u0118\u0117\u012A\u0114\u0118\u0117\u012A\u0523", 'r', '\001'), new Class[0]);
            try
            {
                tokenkey = ((TokenKey) (tokenkey.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (TokenKey tokenkey)
            {
                throw tokenkey.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)tokenkey).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public void setTokenLastFour(String s)
    {
        tokenLastFour = s;
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
        s = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFFC3\uFF91\uFF95\uFF94\uFFA7\u03A0\u03A0\uFF91\uFF95\uFF94\uFFA7\uFF91\uFF95\uFF94\uFFA7\u03A0", 'z', '%', '\0'), new Class[0]);
        int i;
        int j;
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
        i = ((Integer)s).intValue();
        j = b043F043F043F043F043F043F;
        k = b043F043F043F043F043F043F;
        switch ((k * (b043F043F043F043F043F043F + k)) % b043F043F043F043F043F043F)
        {
        default:
            s = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\326\244\250\247\272\u04B3\u04B3\244\250\247\272\244\250\247\272\u04B3", '\002', 'r', '\003'), new Class[0]);
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
            b043F043F043F043F043F043F = 20;
            // fall through

        case 0: // '\0'
            s = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\uFF31\uFEFF\uFF03\uFF02\uFF15\u030E\u030E\uFEFF\uFF03\uFF02\uFF15\uFEFF\uFF03\uFF02\uFF15\u030E", '\321', '`', '\0'), new Class[0]);
            break;
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
        if ((((Integer)s).intValue() * (i + j)) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            b043F043F043F043F043F043F = 18;
            b043F043F043F043F043F043F = 27;
        }
    }

    public void setTokenStatus(Status status)
    {
        int i = b043F043F043F043F043F043F;
        switch ((i * (b043F043F043F043F043F043F + i)) % b043F043F043F043F043F043F)
        {
        default:
            b043F043F043F043F043F043F = 39;
            b043F043F043F043F043F043F = 12;
            // fall through

        case 0: // '\0'
            i = b043F043F043F043F043F043F;
            break;
        }
        Object obj = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\u0117\345\351\350\373\345\351\350\373\345\351\350\373\u04F4\345\351\350\373\u04F4", '\265', '\005'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            throw status.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b043F043F043F043F043F043F) % b043F043F043F043F043F043F != b043F043F043F043F043F043F)
        {
            b043F043F043F043F043F043F = 44;
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
            Object obj1 = com/visa/cbp/sdk/facade/data/TokenData.getMethod(nuuuuu.b0417041704170417041704170417("\007\uFFD5\uFFD9\uFFD8\uFFEB\u03E4\u03E4\uFFD5\uFFD9\uFFD8\uFFEB\uFFD5\uFFD9\uFFD8\uFFEB\u03E4", '[', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Status status)
            {
                throw status.getCause();
            }
            b043F043F043F043F043F043F = ((Integer)obj1).intValue();
        }
        try
        {
            tokenStatus = status;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            throw status;
        }
    }
}
