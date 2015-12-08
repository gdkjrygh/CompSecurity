// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.external.common;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.external.common:
//            ExpirationDate, HCEData, Status

public class TokenInfo
{

    public static int b042504250425042504250425 = 42;
    public static int b042504250425042504250425 = 1;
    public static int b042504250425042504250425 = 2;
    public static int b042504250425042504250425;
    private String appPrgrmID;
    private ExpirationDate expirationDate;
    private HCEData hceData;
    private String lang;
    private String message;
    private List presentationType;
    private String storageType;
    private String token;
    private String tokenReferenceID;
    private String tokenRequestorID;
    private Status tokenStatus;

    public TokenInfo()
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
        Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFFEA\uFFB8\uFFBC\uFFBA\uFFBD\uFFB8\uFFBC\uFFBA\uFFBD\u03AD\uFFB8\uFFBC\uFFBA\uFFBD\u03AD\u03AD", '(', '\004'), new Class[0]);
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b042504250425042504250425;
        k = b042504250425042504250425;
        l = b042504250425042504250425;
        i1 = b042504250425042504250425;
        j1 = b042504250425042504250425;
        obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0180\u0543\u0543\u0543\u0543\u014E\u0152\u0150\u0153\u0543", '\217', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if (((k + l) * i1) % j1 != ((Integer)obj).intValue())
        {
            b042504250425042504250425 = 62;
            Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\316\234\240\236\241\234\240\236\241\u0491\234\240\236\241\u0491\u0491", '6', '\001'), new Class[0]);
            InvocationTargetException invocationtargetexception2;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
        obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFFBA\uFF88\uFF8C\uFF8A\uFF8D\uFF88\uFF8C\uFF8A\uFF8D\u037D\uFF88\uFF8C\uFF8A\uFF8D\u037D\u037D", '\250', '\0'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        if ((((Integer)obj1).intValue() * (i + j)) % b042504250425042504250425 != b042504250425042504250425)
        {
            b042504250425042504250425 = 41;
        }
    }

    public static int b042504250425042504250425()
    {
        return 71;
    }

    public static int b042504250425042504250425()
    {
        return 2;
    }

    public static int b042504250425042504250425()
    {
        return 1;
    }

    public static int b042504250425042504250425()
    {
        return 0;
    }

    public String getAppPrgrmID()
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
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
        {
            Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFE7A\uFE48\uFE4C\uFE4A\uFE4D\uFE48\uFE4C\uFE4A\uFE4D\u023D\uFE48\uFE4C\uFE4A\uFE4D\u023D\u023D", '\364', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            b042504250425042504250425 = 42;
        }
        return appPrgrmID;
    }

    public ExpirationDate getExpirationDate()
    {
        ExpirationDate expirationdate = expirationDate;
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
        {
        default:
            Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF3A\uFF08\uFF0C\uFF0A\uFF0D\uFF08\uFF0C\uFF0A\uFF0D\u02FD\uFF08\uFF0C\uFF0A\uFF0D\u02FD\u02FD", '\224', '\003'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            b042504250425042504250425 = 71;
            // fall through

        case 0: // '\0'
            return expirationdate;
        }
    }

    public HCEData getHceData()
    {
        return hceData;
    }

    public String getLang()
    {
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
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
            b042504250425042504250425 = 29;
            Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0163\u0131\u0135\u0133\u0136\u0131\u0135\u0133\u0136\u0526\u0131\u0135\u0133\u0136\u0526\u0526", '\021', '\360', '\003'), new Class[0]);
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
            b042504250425042504250425 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = lang;
            break;
        }
label1:
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
        } while (true);
        j = b042504250425042504250425;
        switch ((j * (b042504250425042504250425 + j)) % b042504250425042504250425)
        {
        default:
            obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFFFA\uFFC8\uFFCC\uFFCA\uFFCD\uFFC8\uFFCC\uFFCA\uFFCD\u03BD\uFFC8\uFFCC\uFFCA\uFFCD\u03BD\u03BD", 'p', '\b', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\311\227\233\231\234\227\233\231\234\u048C\227\233\231\234\u048C\u048C", 'W', '\276', '\001'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            // fall through

        case 0: // '\0'
            return ((String) (obj));
        }
    }

    public String getMessage()
    {
        Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u019D\u016B\u016F\u016D\u0170\u016B\u016F\u016D\u0170\u0560\u016B\u016F\u016D\u0170\u0560\u0560", 'u', '\306', '\003'), new Class[0]);
        int i;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b042504250425042504250425;
        obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0341\u030F\u0313\u0311\u0314\u030F\u0313\u0311\u0314\u0704\u030F\u0313\u0311\u0314\u0704\u0704", '\365', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((((Integer)obj).intValue() * (k + i)) % b042504250425042504250425 != b042504250425042504250425)
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
            Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\006\uFFD4\uFFD8\uFFD6\uFFD9\uFFD4\uFFD8\uFFD6\uFFD9\u03C9\uFFD4\uFFD8\uFFD6\uFFD9\u03C9\u03C9", 'w', '\033', '\001'), new Class[0]);
            int j;
            int l;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            b042504250425042504250425 = 57;
            obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("V$(&)$(&)\u0419$(&)\u0419\u0419", '\266', '\302', '\002'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            j = ((Integer)obj1).intValue();
            l = b042504250425042504250425;
            obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u02B7\u0285\u0289\u0287\u028A\u0285\u0289\u0287\u028A\u067A\u067A\u0285\u0289\u0287\u028A\u067A", '\307', '\006'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            switch (((l + j) * j) % ((Integer)obj1).intValue())
            {
            default:
                b042504250425042504250425 = 46;
                Object obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\203QUSVQUSV\u0446QUSV\u0446\u0446", '&', '\005', '\002'), new Class[0]);
                Exception exception;
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception5)
                {
                    throw invocationtargetexception5.getCause();
                }
                b042504250425042504250425 = ((Integer)obj2).intValue();
                break;

            case 0: // '\0'
                break;
            }
        }
        try
        {
            obj2 = message;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
        return ((String) (obj2));
    }

    public List getPresentationType()
    {
        if (presentationType != null) goto _L2; else goto _L1
_L1:
        presentationType = new ArrayList();
        int i = 2;
        Object obj;
        Object obj1;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        catch (Exception exception) { }
          goto _L3
_L5:
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        try
        {
            b042504250425042504250425 = i;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
        {
        default:
            obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\030\uFFE6\uFFEA\uFFE8\uFFEB\uFFE6\uFFEA\uFFE8\uFFEB\u03DB\uFFE6\uFFEA\uFFE8\uFFEB\u03DB\u03DB", 'J', '\0'), new Class[0]);
            Object obj2;
            Object obj3;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            b042504250425042504250425 = 97;
            break;

        case 0: // '\0'
            break;
        }
_L2:
        obj1 = presentationType;
        return ((List) (obj1));
        obj1;
        throw obj1;
        obj1;
        throw obj1;
_L7:
        b042504250425042504250425 = 62;
_L4:
        obj1 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF9C\uFF95\uFF9E\uFF97\uFFA4\uFF98", '\022', '\342', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        ((Integer)obj1).intValue();
          goto _L4
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\342\260\264\262\265\260\264\262\265\u04A5\260\264\262\265\u04A5\u04A5", '\200', '\002'), new Class[0]);
        }
          goto _L5
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
_L3:
        b042504250425042504250425 = 14;
_L6:
        obj2 = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\u02C7\u02C0\u02C9\u02C2\u02CF\u02C3", '\311', '\006'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        ((Integer)obj2).intValue();
          goto _L6
        obj3;
        try
        {
            throw ((InvocationTargetException) (obj3)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
          goto _L7
        obj3;
        throw obj3;
          goto _L4
    }

    public String getStorageType()
    {
        int i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
        {
        default:
            Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("k9=;>9=;>\u042E9=;>\u042E\u042E", '\003', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u021A\u01E8\u01EC\u01EA\u01ED\u01E8\u01EC\u01EA\u01ED\u05DD\u01E8\u01EC\u01EA\u01ED\u05DD\u05DD", '\334', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
            {
                Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("_-1/2-1/2\u0422-1/2\u0422\u0422", '\003', '\0'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                b042504250425042504250425 = 43;
            }
            // fall through

        case 0: // '\0'
            obj1 = storageType;
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
        return ((String) (obj1));
    }

    public String getToken()
    {
        int i = 3;
        Object obj;
        try
        {
            do
            {
                i /= 0;
            } while (true);
        }
        catch (Exception exception)
        {
            obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u024A\u0218\u021C\u021A\u021D\u0218\u021C\u021A\u021D\u060D\u0218\u021C\u021A\u021D\u060D\u060D", '\364', '\001'), new Class[0]);
        }
        Object obj1;
        int j;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception3)
        {
            throw invocationtargetexception3.getCause();
        }
        b042504250425042504250425 = ((Integer)obj).intValue();
        try
        {
            obj = token;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\235kompkomp\u0460komp\u0460\u0460", '\026', 'Q', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj1).intValue();
        j = b042504250425042504250425;
        obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFFCE\uFF9C\uFFA0\uFF9E\uFFA1\uFF9C\uFFA0\uFF9E\uFFA1\u0391\uFF9C\uFFA0\uFF9E\uFFA1\u0391\u0391", '\324', '@', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        k = ((Integer)obj1).intValue();
        obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\203QUSVQUSV\u0446\u0446QUSV\u0446", '\013', '\006'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        if (((j + i) * k) % ((Integer)obj1).intValue() != b042504250425042504250425)
        {
            b042504250425042504250425 = 44;
            Object obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0193\u0161\u0165\u0163\u0166\u0161\u0165\u0163\u0166\u0556\u0161\u0165\u0163\u0166\u0556\u0556", '\316', 'c', '\003'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            b042504250425042504250425 = ((Integer)obj2).intValue();
        }
        return ((String) (obj));
    }

    public String getTokenReferenceID()
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
        int i = b042504250425042504250425;
        int k = b042504250425042504250425;
        int i1 = b042504250425042504250425;
        int k1 = b042504250425042504250425;
        Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFFE4\u03A7\u03A7\u03A7\u03A7\uFFB2\uFFB6\uFFB4\uFFB7\u03A7", '\261', '3', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((i + k) * i1) % k1 != ((Integer)obj).intValue())
        {
            Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF5A\uFF28\uFF2C\uFF2A\uFF2D\uFF28\uFF2C\uFF2A\uFF2D\u031D\uFF28\uFF2C\uFF2A\uFF2D\u031D\u031D", 'X', '\004'), new Class[0]);
            InvocationTargetException invocationtargetexception1;
            Object obj2;
            int j;
            int l;
            int j1;
            int l1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception2)
            {
                throw invocationtargetexception2.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            b042504250425042504250425 = 61;
        }
        obj1 = tokenReferenceID;
label1:
        do
        {
            obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\356\274\270\276\271\274\270\276\271\u04A9\274\270\276\271\u04A9\u04A9", '\214', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            j = ((Integer)obj2).intValue();
            l = b042504250425042504250425;
            obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\324\242\246\244\247\242\246\244\247\u0497\242\246\244\247\u0497\u0497", '\332', 'h', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            j1 = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("4\002\006\004\007\002\006\004\007\u03F7\u03F7\002\006\004\007\u03F7", '=', '\017', '\001'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            l1 = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u013C\u04FF\u04FF\u04FF\u04FF\u010A\u010E\u010C\u010F\u04FF", '\177', '[', '\003'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            if (((l + j) * j1) % l1 != ((Integer)obj2).intValue())
            {
                b042504250425042504250425 = 73;
                obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u011B\351\355\353\356\351\355\353\356\u04DE\351\355\353\356\u04DE\u04DE", '(', '\221', '\003'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception3)
                {
                    throw invocationtargetexception3.getCause();
                }
                b042504250425042504250425 = ((Integer)obj2).intValue();
            }
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
                        continue label1;

                    case 1: // '\001'
                        break label1;
                    }
                }
                break;

            case 0: // '\0'
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
        return ((String) (obj1));
    }

    public String getTokenRequestorID()
    {
        String s;
        Object obj;
        int i;
        int j;
        try
        {
            s = tokenRequestorID;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\347\265\271\267\272\265\271\267\272\u04AA\265\271\267\272\u04AA\u04AA", 'F', '?', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b042504250425042504250425;
        obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0206\u01D4\u01D8\u01D6\u01D9\u01D4\u01D8\u01D6\u01D9\u05C9\u01D4\u01D8\u01D6\u01D9\u05C9\u05C9", '\214', '\006'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        if ((((Integer)obj).intValue() * (j + i)) % b042504250425042504250425 != b042504250425042504250425)
        {
            b042504250425042504250425 = 83;
            b042504250425042504250425 = 13;
        }
        return s;
    }

    public Status getTokenStatus()
    {
        return tokenStatus;
    }

    public void setAppPrgrmID(String s)
    {
        int i;
        int k;
        int l;
        try
        {
            appPrgrmID = s;
            i = b042504250425042504250425;
            k = b042504250425042504250425;
            l = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 44
    //                   0 191;
           goto _L1 _L2
_L1:
        s = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\265\203\207\205\210\203\207\205\210\u0478\203\207\205\210\u0478\u0478", '\004', 'O', '\003'), new Class[0]);
        s = ((String) (s.invoke(null, new Object[0])));
        int j = ((Integer)s).intValue();
        try
        {
            b042504250425042504250425 = j;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u022C\u01FA\u01FE\u01FC\u01FF\u01FA\u01FE\u01FC\u01FF\u05EF\u01FA\u01FE\u01FC\u01FF\u05EF\u05EF", '\345', '\001'), new Class[0]);
        s = ((String) (s.invoke(null, new Object[0])));
        j = ((Integer)s).intValue();
        b042504250425042504250425 = j;
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
        {
            b042504250425042504250425 = 41;
            s = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\213\331\335\333\334\331\335\333\334\u04CC\331\335\333\334\u04CC\u04CC", '\351', '\002'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b042504250425042504250425 = ((Integer)s).intValue();
        }
_L2:
        return;
        s;
        throw s.getCause();
        s;
        throw s.getCause();
    }

    public void setExpirationDate(ExpirationDate expirationdate)
    {
        Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u020C\u01DA\u01DE\u01DC\u01DF\u01DA\u01DE\u01DC\u01DF\u05CF\u01DA\u01DE\u01DC\u01DF\u05CF\u05CF", '\216', '\006'), new Class[0]);
        int i;
        int j;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ExpirationDate expirationdate)
        {
            throw expirationdate.getCause();
        }
        i = ((Integer)obj).intValue();
        j = b042504250425042504250425;
        obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\016\uFFDC\uFFE0\uFFDE\uFFE1\uFFDC\uFFE0\uFFDE\uFFE1\u03D1\uFFDC\uFFE0\uFFDE\uFFE1\u03D1\u03D1", 'T', '\0'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (ExpirationDate expirationdate)
        {
            throw expirationdate.getCause();
        }
        if ((((Integer)obj).intValue() * (j + i)) % b042504250425042504250425 != b042504250425042504250425)
        {
            Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFE92\uFE60\uFE64\uFE62\uFE65\uFE60\uFE64\uFE62\uFE65\u0255\uFE60\uFE64\uFE62\uFE65\u0255\u0255", '\342', '\356', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (ExpirationDate expirationdate)
            {
                throw expirationdate.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            b042504250425042504250425 = 71;
        }
        try
        {
            expirationDate = expirationdate;
        }
        // Misplaced declaration of an exception variable
        catch (ExpirationDate expirationdate)
        {
            throw expirationdate;
        }
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
        {
            b042504250425042504250425 = 81;
            expirationdate = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF39\uFF07\uFF0B\uFF09\uFF0C\uFF07\uFF0B\uFF09\uFF0C\u02FC\uFF07\uFF0B\uFF09\uFF0C\u02FC\u02FC", 'c', '\004'), new Class[0]);
            try
            {
                expirationdate = ((ExpirationDate) (expirationdate.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (ExpirationDate expirationdate)
            {
                throw expirationdate.getCause();
            }
            b042504250425042504250425 = ((Integer)expirationdate).intValue();
        }
    }

    public void setHceData(HCEData hcedata)
    {
        Object obj;
        int i;
        int k;
        int l;
        try
        {
            i = b042504250425042504250425;
            k = b042504250425042504250425;
            l = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (HCEData hcedata)
        {
            throw hcedata;
        }
        (i * (k + i)) % l;
        JVM INSTR tableswitch 0 0: default 40
    //                   0 87;
           goto _L1 _L2
_L1:
        obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\223aecfaecf\u0456aecf\u0456\u0456", '\026', '\033', '\003'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        int j = ((Integer)obj).intValue();
        try
        {
            b042504250425042504250425 = j;
            b042504250425042504250425 = 56;
        }
        // Misplaced declaration of an exception variable
        catch (HCEData hcedata)
        {
            throw hcedata;
        }
_L2:
        j = b042504250425042504250425;
        switch ((j * (b042504250425042504250425 + j)) % b042504250425042504250425)
        {
        default:
            b042504250425042504250425 = 21;
            obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u01BE\u018C\u0190\u018E\u0191\u018C\u0190\u018E\u0191\u0581\u018C\u0190\u018E\u0191\u0581\u0581", 't', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (HCEData hcedata)
            {
                throw hcedata.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            hceData = hcedata;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HCEData hcedata) { }
        throw hcedata;
        hcedata;
        throw hcedata.getCause();
    }

    public void setLang(String s)
    {
        try
        {
            lang = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setMessage(String s)
    {
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
        {
            int i = b042504250425042504250425;
            int j = b042504250425042504250425;
            Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF27\uFEF5\uFEF9\uFEF7\uFEFA\uFEF5\uFEF9\uFEF7\uFEFA\u02EA\u02EA\uFEF5\uFEF9\uFEF7\uFEFA\u02EA", 'X', '\343', '\0'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            switch (((j + i) * i) % ((Integer)obj).intValue())
            {
            default:
                b042504250425042504250425 = 30;
                Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0122\360\364\362\365\360\364\362\365\u04E5\360\364\362\365\u04E5\u04E5", '\264', '\f', '\003'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                // fall through

            case 0: // '\0'
                b042504250425042504250425 = 16;
                obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0136\u0104\u0108\u0106\u0109\u0104\u0108\u0106\u0109\u04F9\u0104\u0108\u0106\u0109\u04F9\u04F9", '\324', '\005'), new Class[0]);
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
            b042504250425042504250425 = ((Integer)obj1).intValue();
        }
        message = s;
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
    }

    public void setPresentationType(List list)
    {
        int i;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            i = b042504250425042504250425;
            k = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        try
        {
            l = b042504250425042504250425;
            i1 = b042504250425042504250425;
            j1 = b042504250425042504250425;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        if (((i + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        i = b042504250425042504250425;
        switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
        {
        default:
            b042504250425042504250425 = 60;
            Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF30\uFEFE\uFF02\uFF00\uFF03\uFEFE\uFF02\uFF00\uFF03\u02F3\uFEFE\uFF02\uFF00\uFF03\u02F3\u02F3", '\231', '\003'), new Class[0]);
            int j;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                throw list.getCause();
            }
            b042504250425042504250425 = ((Integer)obj).intValue();
            // fall through

        case 0: // '\0'
            obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\276\214\220\216\221\214\220\216\221\u0481\214\220\216\221\u0481\u0481", '\207', '+', '\002'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        j = ((Integer)obj).intValue();
        b042504250425042504250425 = j;
        b042504250425042504250425 = 70;
        try
        {
            presentationType = list;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        break MISSING_BLOCK_LABEL_180;
        list;
        throw list.getCause();
        throw list;
    }

    public void setStorageType(String s)
    {
        int i = 4;
        do
        {
            Exception exception;
            int j;
            try
            {
                j = i / 0;
            }
            catch (Exception exception1)
            {
                b042504250425042504250425 = 0;
                do
                {
                    try
                    {
                        i /= 0;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Exception exception)
                    {
                        b042504250425042504250425 = 73;
                        storageType = s;
                        return;
                    }
                } while (true);
            }
            i = j;
        } while (true);
    }

    public void setToken(String s)
    {
        token = s;
    }

    public void setTokenReferenceID(String s)
    {
        if (((b042504250425042504250425 + b042504250425042504250425) * b042504250425042504250425) % b042504250425042504250425 != b042504250425042504250425)
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
            Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\u0191\u015F\u0163\u0161\u0164\u015F\u0163\u0161\u0164\u0554\u015F\u0163\u0161\u0164\u0554\u0554", '\323', '\\', '\003'), new Class[0]);
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
            b042504250425042504250425 = ((Integer)obj).intValue();
            b042504250425042504250425 = 64;
            i = b042504250425042504250425;
            switch ((i * (b042504250425042504250425 + i)) % b042504250425042504250425)
            {
            default:
                b042504250425042504250425 = 27;
                Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF7\uFFC5\uFFC9\uFFC7\uFFCA\uFFC5\uFFC9\uFFC7\uFFCA\u03BA\uFFC5\uFFC9\uFFC7\uFFCA\u03BA\u03BA", 'U', '\300', '\002'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s.getCause();
                }
                b042504250425042504250425 = ((Integer)obj1).intValue();
                break;

            case 0: // '\0'
                break;
            }
        }
        try
        {
            tokenReferenceID = s;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void setTokenRequestorID(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public void setTokenStatus(Status status)
    {
        int i = b042504250425042504250425;
        int k = b042504250425042504250425;
        Object obj = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("E\023\027\025\030\023\027\025\030\u0408\u0408\023\027\025\030\u0408", '\311', '\254', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Status status)
        {
            throw status.getCause();
        }
        switch (((k + i) * i) % ((Integer)obj).intValue())
        {
        default:
            Object obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFF8C\uFF5A\uFF5E\uFF5C\uFF5F\uFF5A\uFF5E\uFF5C\uFF5F\u034F\uFF5A\uFF5E\uFF5C\uFF5F\u034F\u034F", 'k', '\003'), new Class[0]);
            int j;
            int l;
            int i1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Status status)
            {
                throw status.getCause();
            }
            b042504250425042504250425 = ((Integer)obj1).intValue();
            j = b042504250425042504250425;
            l = b042504250425042504250425;
            i1 = b042504250425042504250425;
            obj1 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("`.203.203\u0423\u0423.203\u0423", '\002', '\0'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Status status)
            {
                throw status.getCause();
            }
            if ((i1 * (j + l)) % ((Integer)obj1).intValue() != b042504250425042504250425)
            {
                Object obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("\uFFF8\uFFC6\uFFCA\uFFC8\uFFCB\uFFC6\uFFCA\uFFC8\uFFCB\u03BB\uFFC6\uFFCA\uFFC8\uFFCB\u03BB\u03BB", '5', '\003'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Status status)
                {
                    throw status.getCause();
                }
                b042504250425042504250425 = ((Integer)obj2).intValue();
                obj2 = com/visa/cbp/external/common/TokenInfo.getMethod(nuuuuu.b0417041704170417041704170417("+y}{|y}{|\u046Cy}{|\u046C\u046C", 'I', '\002'), new Class[0]);
                try
                {
                    obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Status status)
                {
                    throw status.getCause();
                }
                b042504250425042504250425 = ((Integer)obj2).intValue();
            }
            b042504250425042504250425 = 75;
            // fall through

        case 0: // '\0'
            tokenStatus = status;
            return;
        }
    }
}
