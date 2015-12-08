// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.environment;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.environment:
//            Environment

public class EnvironmentRepo
{

    public static int b041404140414041404140414 = 0;
    public static int b041404140414041404140414 = 2;
    public static int b041404140414041404140414 = 1;
    public static int b041404140414041404140414 = 8;
    protected static volatile EnvironmentRepo instance;
    private HashMap endpointMap;

    private EnvironmentRepo()
    {
        int i = b041404140414041404140414;
        Object obj = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("\u013B\u04ED\u04ED\u0109\u010D\u010A\u010D\u0109\u010D\u010A\u010D\u0109\u010D\u010A\u010D\u0109\u010D\u010A\u010D", '\214', 'M', '\003'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
        {
            b041404140414041404140414 = 94;
            b041404140414041404140414 = 46;
        }
        Object obj1;
        try
        {
            super();
        }
        catch (Exception exception)
        {
            throw exception;
        }
        switch (1)
        {
        case 0: // '\0'
            break MISSING_BLOCK_LABEL_72;

        default:
label0:
            while (true) 
            {
                switch (1)
                {
                default:
                    break;

                case 0: // '\0'
                    break MISSING_BLOCK_LABEL_72;

                case 1: // '\001'
                    break label0;
                }
            }
            // fall through

        case 1: // '\001'
            obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFD84\uFD7D\uFD86\uFD7F\uFD8C\uFD80", '\370', '\004'), new Class[0]);
            break;
        }
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        break MISSING_BLOCK_LABEL_72;
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                endpointMap = new HashMap();
                return;
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
        }
    }

    public static int b043C043C043C043C043C043C()
    {
        return 35;
    }

    public static int b041404140414041404140414()
    {
        return 1;
    }

    public static Environment getEnvironmentFromString(String s)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static EnvironmentRepo getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/visa/cbp/sdk/facade/environment/EnvironmentRepo;
        JVM INSTR monitorenter ;
        EnvironmentRepo environmentrepo;
        if (instance != null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        environmentrepo = new EnvironmentRepo();
        Method method = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getDeclaredMethod(nuuuuu.b0417041704170417041704170417("\u016B\u0170\u016B\u0176", '_', '\243', '\003'), new Class[0]);
        method.invoke(environmentrepo, new Object[0]);
        instance = environmentrepo;
        com/visa/cbp/sdk/facade/environment/EnvironmentRepo;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Object obj;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
        obj;
        com/visa/cbp/sdk/facade/environment/EnvironmentRepo;
        JVM INSTR monitorexit ;
        throw obj;
    }

    private void init()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        int i;
        int j;
        int k;
        try
        {
            obj = endpointMap;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        try
        {
            obj2 = Environment.SANDBOX;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj3 = java/util/HashMap.getMethod(nuuuuu.b0417041704170417041704170417("\uFDBB\uFDC0\uFDBF", '\347', '\004'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        obj = ((Method) (obj3)).invoke(obj, new Object[] {
            obj2, "https://sandbox.digital.visa.com"
        });
        obj = (Object)obj;
_L2:
        1;
        JVM INSTR tableswitch 0 1: default 84
    //                   0 62
    //                   1 111;
           goto _L1 _L2 _L3
_L1:
        1;
        JVM INSTR tableswitch 0 1: default 108
    //                   0 62
    //                   1 111;
           goto _L1 _L2 _L3
_L3:
        obj = endpointMap;
        i = b041404140414041404140414;
        switch ((i * (b041404140414041404140414 + i)) % b041404140414041404140414)
        {
        default:
            obj2 = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("\u02DE\u02AC\u02B0\u02AF\u02BF\u06B8\u06B8\u06B8\u06B8\u06B8", '\324', '\006'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041404140414041404140414 = ((Integer)obj2).intValue();
            obj2 = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("J\030\034\033+\u0424\u0424\u0424\u0424\u0424", '\b', '\004'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041404140414041404140414 = ((Integer)obj2).intValue();
            break;

        case 0: // '\0'
            break;
        }
        obj2 = Environment.PROD;
        i = b041404140414041404140414;
        j = b041404140414041404140414;
        k = b041404140414041404140414;
        if (((i + j) * k) % b041404140414041404140414 == b041404140414041404140414) goto _L5; else goto _L4
_L4:
        b041404140414041404140414 = 92;
        obj3 = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("\222`dcs\u046C\u046C\u046C\u046C\u046C", '\030', '\001'), new Class[0]);
        obj3 = ((Method) (obj3)).invoke(null, new Object[0]);
        i = ((Integer)obj3).intValue();
        b041404140414041404140414 = i;
_L5:
        obj3 = java/util/HashMap.getMethod(nuuuuu.b0417041704170417041704170417("\021\026\025", '_', '\0'), new Class[] {
            java/lang/Object, java/lang/Object
        });
        obj = ((Method) (obj3)).invoke(obj, new Object[] {
            obj2, "https://digital.visa.com"
        });
        obj = (Object)obj;
        return;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }

    public String getEndpoint(Environment environment)
    {
        int i = b041404140414041404140414;
        Object obj = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("~\u0408\u0408,(-(,(-(,(-(,(-(", '\034', '\002'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Environment environment)
        {
            throw environment.getCause();
        }
        if (((((Integer)obj).intValue() + i) * b041404140414041404140414) % b041404140414041404140414 != b041404140414041404140414)
        {
            Object obj1 = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("V$('7\u0430\u0430\u0430\u0430\u0430", '&', '2', '\002'), new Class[0]);
            Method method;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Environment environment)
            {
                throw environment.getCause();
            }
            b041404140414041404140414 = ((Integer)obj1).intValue();
            b041404140414041404140414 = 65;
        }
        try
        {
            obj1 = endpointMap;
        }
        // Misplaced declaration of an exception variable
        catch (Environment environment)
        {
            throw environment;
        }
        method = java/util/HashMap.getMethod(nuuuuu.b0417041704170417041704170417("\uFE36\uFE34\uFE43", '\273', '\004'), new Class[] {
            java/lang/Object
        });
        environment = ((Environment) (method.invoke(obj1, new Object[] {
            environment
        })));
        environment = ((Environment) ((Object)environment));
        j = b041404140414041404140414;
        k = b041404140414041404140414;
        l = b041404140414041404140414;
        i1 = b041404140414041404140414;
        j1 = b041404140414041404140414;
        if (((j + k) * l) % i1 == j1)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        obj1 = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("\u0134\u0102\u0106\u0105\u0115\u050E\u050E\u050E\u050E\u050E", 'E', '\215', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        try
        {
            b041404140414041404140414 = j;
        }
        // Misplaced declaration of an exception variable
        catch (Environment environment)
        {
            throw environment;
        }
        obj1 = com/visa/cbp/sdk/facade/environment/EnvironmentRepo.getMethod(nuuuuu.b0417041704170417041704170417("\f^Z]-\u0452\u0452\u0452\u0452\u0452", 'n', '\002'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        j = ((Integer)obj1).intValue();
        b041404140414041404140414 = j;
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
        return (String)environment;
        environment;
        throw environment.getCause();
        environment;
        throw environment.getCause();
        environment;
        throw environment.getCause();
    }
}
