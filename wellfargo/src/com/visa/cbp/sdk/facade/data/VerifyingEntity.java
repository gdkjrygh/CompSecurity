// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public final class VerifyingEntity extends Enum
{

    private static final VerifyingEntity $VALUES[];
    public static final VerifyingEntity CO_RESIDE_SE;
    public static final VerifyingEntity MG;
    public static final VerifyingEntity MOBILE_APP;
    public static final VerifyingEntity NO_CD_CVM;
    public static final VerifyingEntity TEE;
    public static final VerifyingEntity TERMINAL;
    public static final VerifyingEntity VERIFIED_CLOUD;
    public static final VerifyingEntity VERIFIED_MOBILE_DEVICE;
    public static final VerifyingEntity VMPA;
    public static int b041204120412041204120412 = 58;
    public static int b041204120412041204120412 = 0;
    public static int b041204120412041204120412 = 2;
    public static int b041204120412041204120412 = 1;
    private final byte value;

    private VerifyingEntity(String s, int i, byte byte0)
    {
        super(s, i);
        s = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\u01D6\u0586\u01A4\u01A8\u01A5\u01A6\u0586\u0586\u01A4\u01A8\u01A5\u01A6\u0586", '\272', '\001'), new Class[0]);
        int j;
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
        j = b041204120412041204120412;
        s = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("8\u03E8\006\n\007\b\u03E8\u03E8\006\n\007\b\u03E8", '\016', '\004'), new Class[0]);
        try
        {
            s = ((String) (s.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((((Integer)s).intValue() * (j + i)) % b041204120412041204120412 != b041204120412041204120412)
        {
            b041204120412041204120412 = 57;
            b041204120412041204120412 = 28;
        }
        value = byte0;
        i = b041204120412041204120412;
        switch ((i * (b041204120412041204120412 + i)) % b041204120412041204120412)
        {
        default:
            b041204120412041204120412 = 68;
            s = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("{\u040B)-(+\u040B\u040B)-(+\u040B", '\031', '\002'), new Class[0]);
            try
            {
                s = ((String) (s.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041204120412041204120412 = ((Integer)s).intValue();
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public static int b041204120412041204120412()
    {
        return 58;
    }

    public static VerifyingEntity valueOf(String s)
    {
        Object obj = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\uFEAA\u025A\uFE78\uFE7C\uFE79\uFE7A\u025A\u025A\uFE78\uFE7C\uFE79\uFE7A\u025A", '\334', '\003'), new Class[0]);
        int i;
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
        i = ((Integer)obj).intValue();
        j = b041204120412041204120412;
        obj = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\320\u0480\236\242\237\240\u0480\u0480\236\242\237\240\u0480", '7', '\001'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        if ((((Integer)obj).intValue() * (j + i)) % b041204120412041204120412 != b041204120412041204120412)
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
            Object obj1 = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\347\u0497\265\271\266\267\u0497\u0497\265\271\266\267\u0497", '\205', '\005'), new Class[0]);
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s.getCause();
            }
            b041204120412041204120412 = ((Integer)obj1).intValue();
            b041204120412041204120412 = 39;
        }
        obj1 = java/lang/Enum.getMethod(nuuuuu.b0417041704170417041704170417("\u0128\u0113\u011E\u0127\u0117\u0101\u0118", '\262', '\005'), new Class[] {
            java/lang/Class, java/lang/String
        });
        try
        {
            s = ((String) (((Method) (obj1)).invoke(null, new Object[] {
                com/visa/cbp/sdk/facade/data/VerifyingEntity, s
            })));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s.getCause();
        }
        s = (VerifyingEntity)(Enum)s;
label1:
        do
        {
            if (((b041204120412041204120412 + b041204120412041204120412) * b041204120412041204120412) % b041204120412041204120412 != b041204120412041204120412)
            {
                b041204120412041204120412 = 39;
                b041204120412041204120412 = 8;
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
        return s;
    }

    public static VerifyingEntity[] values()
    {
        int i = b041204120412041204120412;
        switch ((i * (b041204120412041204120412 + i)) % b041204120412041204120412)
        {
        default:
            Object obj = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\u0131\u04E1\377\u0103\u0100\u0101\u04E1\u04E1\377\u0103\u0100\u0101\u04E1", 'E', '\006'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b041204120412041204120412 = ((Integer)obj).intValue();
            obj = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\u011D\u04CD\353\357\354\355\u04CD\u04CD\353\357\354\355\u04CD", '\273', '\005'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                throw invocationtargetexception1.getCause();
            }
            b041204120412041204120412 = ((Integer)obj).intValue();
            if (((b041204120412041204120412 + b041204120412041204120412) * b041204120412041204120412) % b041204120412041204120412 != b041204120412041204120412)
            {
                Object obj1 = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\u0103\u04B3\321\325\322\323\u04B3\u04B3\321\325\322\323\u04B3", '\217', '\022', '\003'), new Class[0]);
                VerifyingEntity averifyingentity[];
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception2)
                {
                    throw invocationtargetexception2.getCause();
                }
                b041204120412041204120412 = ((Integer)obj1).intValue();
                obj1 = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\u0136\u04E6\u0104\u0108\u0105\u0106\u04E6\u04E6\u0104\u0108\u0105\u0106\u04E6", 'j', '\001'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                catch (InvocationTargetException invocationtargetexception3)
                {
                    throw invocationtargetexception3.getCause();
                }
                b041204120412041204120412 = ((Integer)obj1).intValue();
            }
            // fall through

        case 0: // '\0'
            averifyingentity = $VALUES;
            break;
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
        return (VerifyingEntity[])averifyingentity.clone();
    }

    static 
    {
        NO_CD_CVM = new VerifyingEntity("NO_CD_CVM", 0, (byte)0);
        VMPA = new VerifyingEntity("VMPA", 1, (byte)16);
        MG = new VerifyingEntity("MG", 2, (byte)32);
        CO_RESIDE_SE = new VerifyingEntity("CO_RESIDE_SE", 3, (byte)48);
        TEE = new VerifyingEntity("TEE", 4, (byte)64);
        MOBILE_APP = new VerifyingEntity("MOBILE_APP", 5, (byte)80);
        TERMINAL = new VerifyingEntity("TERMINAL", 6, (byte)96);
        VERIFIED_CLOUD = new VerifyingEntity("VERIFIED_CLOUD", 7, (byte)112);
        VERIFIED_MOBILE_DEVICE = new VerifyingEntity("VERIFIED_MOBILE_DEVICE", 8, (byte)-128);
        VerifyingEntity verifyingentity = NO_CD_CVM;
        VerifyingEntity verifyingentity1 = VMPA;
        VerifyingEntity verifyingentity2 = MG;
        VerifyingEntity verifyingentity3 = CO_RESIDE_SE;
        VerifyingEntity verifyingentity4 = TEE;
        VerifyingEntity verifyingentity5 = MOBILE_APP;
        Object obj = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\uFFDB\u038B\uFFA9\uFFAD\uFFAA\uFFAB\u038B\u038B\uFFA9\uFFAD\uFFAA\uFFAB\u038B", '\334', 'U', '\001'), new Class[0]);
        int i;
        int k;
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception1)
        {
            throw invocationtargetexception1.getCause();
        }
        i = ((Integer)obj).intValue();
        k = b041204120412041204120412;
        obj = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\uFDFB\u01AB\uFDC9\uFDCD\uFDCA\uFDCB\u01AB\u01AB\uFDC9\uFDCD\uFDCA\uFDCB\u01AB", '\315', '\004'), new Class[0]);
        try
        {
            obj = ((Method) (obj)).invoke(null, new Object[0]);
        }
        catch (InvocationTargetException invocationtargetexception2)
        {
            throw invocationtargetexception2.getCause();
        }
        if ((((Integer)obj).intValue() * (k + i)) % b041204120412041204120412 != b041204120412041204120412)
        {
            Object obj1 = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\uFF1C\u02CC\uFEEA\uFEEE\uFEEB\uFEEC\u02CC\u02CC\uFEEA\uFEEE\uFEEB\uFEEC\u02CC", '\372', 'L', '\0'), new Class[0]);
            InvocationTargetException invocationtargetexception;
            VerifyingEntity verifyingentity6;
            VerifyingEntity verifyingentity7;
            Object obj2;
            int j;
            int l;
            try
            {
                obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception3)
            {
                throw invocationtargetexception3.getCause();
            }
            b041204120412041204120412 = ((Integer)obj1).intValue();
            b041204120412041204120412 = 70;
        }
        obj1 = TERMINAL;
        verifyingentity6 = VERIFIED_CLOUD;
        verifyingentity7 = VERIFIED_MOBILE_DEVICE;
        obj2 = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\u029F\u064F\u026D\u0271\u026E\u026F\u064F\u064F\u026D\u0271\u026E\u026F\u064F", '\277', '\006'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        j = ((Integer)obj2).intValue();
        l = b041204120412041204120412;
        obj2 = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\346\u0496\264\270\265\266\u0496\u0496\264\270\265\266\u0496", ',', '\006'), new Class[0]);
        try
        {
            obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (InvocationTargetException invocationtargetexception)
        {
            throw invocationtargetexception.getCause();
        }
        if ((((Integer)obj2).intValue() * (l + j)) % b041204120412041204120412 != b041204120412041204120412)
        {
            obj2 = com/visa/cbp/sdk/facade/data/VerifyingEntity.getMethod(nuuuuu.b0417041704170417041704170417("\366\u0486\244\240\245\246\u0486\u0486\244\240\245\246\u0486", '\224', '\002'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception4)
            {
                throw invocationtargetexception4.getCause();
            }
            b041204120412041204120412 = ((Integer)obj2).intValue();
            b041204120412041204120412 = 83;
        }
        $VALUES = (new VerifyingEntity[] {
            verifyingentity, verifyingentity1, verifyingentity2, verifyingentity3, verifyingentity4, verifyingentity5, obj1, verifyingentity6, verifyingentity7
        });
    }
}
