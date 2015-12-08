// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.activeaccountmanagement;

import android.content.Intent;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

// Referenced classes of package com.visa.cbp.sdk.facade.activeaccountmanagement:
//            ActiveAccountService

public class CheckStatusService extends ActiveAccountService
{

    private static final String TAG;
    public static int b042204220422042204220422 = 0;
    public static int b042204220422042204220422 = 2;
    public static int b042204220422042204220422 = 12;
    public static int b042204220422042204220422 = 1;

    public CheckStatusService()
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
        if (((b042204220422042204220422 + b042204220422042204220422) * b042204220422042204220422) % b042204220422042204220422 != b042204220422042204220422)
        {
            b042204220422042204220422 = 96;
            Object obj = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("\244\u0464rvttrvttrvtt\u0464rvtt", 'k', '\255', '\001'), new Class[0]);
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042204220422042204220422 = ((Integer)obj).intValue();
            if (((b042204220422042204220422 + b042204220422042204220422) * b042204220422042204220422) % b042204220422042204220422 != b042204220422042204220422)
            {
                b042204220422042204220422 = 20;
                b042204220422042204220422 = 23;
            }
        }
    }

    public static int b042204220422042204220422()
    {
        return 2;
    }

    public static int b042204220422042204220422()
    {
        return 4;
    }

    public IBinder onBind(Intent intent)
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
        int i = b042204220422042204220422;
label1:
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
                        break label1;

                    case 1: // '\001'
                        continue label1;
                    }
                }
                break;

            case 0: // '\0'
                break label1;

            case 1: // '\001'
                break;
            }
        } while (true);
        int j = b042204220422042204220422;
        int k = b042204220422042204220422;
        intent = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("\217]a__]a__]a__\u044F]a__]a__", '\233', 'n', '\002'), new Class[0]);
        try
        {
            intent = ((Intent) (intent.invoke(null, new Object[0])));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent.getCause();
        }
        switch (((k + j) * j) % ((Integer)intent).intValue())
        {
        default:
            b042204220422042204220422 = 70;
            b042204220422042204220422 = 57;
            break;

        case 0: // '\0'
            break;
        }
        if (((b042204220422042204220422 + i) * b042204220422042204220422) % b042204220422042204220422 != b042204220422042204220422)
        {
            intent = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("S\u0413!%##!%##!%##\u0413!%##", '\n', '\031', '\002'), new Class[0]);
            try
            {
                intent = ((Intent) (intent.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent.getCause();
            }
            b042204220422042204220422 = ((Integer)intent).intValue();
            intent = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("\uFFA5\u0365\uFF73\uFF77\uFF75\uFF75\uFF73\uFF77\uFF75\uFF75\uFF73\uFF77\uFF75\uFF75\u0365\uFF73\uFF77\uFF75\uFF75", '?', '\004'), new Class[0]);
            try
            {
                intent = ((Intent) (intent.invoke(null, new Object[0])));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent.getCause();
            }
            b042204220422042204220422 = ((Integer)intent).intValue();
        }
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
_L2:
        Object obj = java/lang/String.getMethod(nuuuuu.b0417041704170417041704170417("\uFF56\uFF4F\uFF58\uFF51\uFF5E\uFF52", 'c', '\263', '\0'), new Class[0]);
        obj = ((Method) (obj)).invoke(null, new Object[0]);
        ((Integer)obj).intValue();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        int k;
        obj1;
        try
        {
            throw ((InvocationTargetException) (obj1)).getCause();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            b042204220422042204220422 = 64;
            k = b042204220422042204220422;
            switch ((k * (b042204220422042204220422 + k)) % b042204220422042204220422)
            {
            default:
                obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("\u0158\u0518\u0126\u012A\u0128\u0128\u0126\u012A\u0128\u0128\u0126\u012A\u0128\u0128\u0518\u0126\u012A\u0128\u0128", 'R', '\006'), new Class[0]);
                try
                {
                    obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    throw intent.getCause();
                }
                b042204220422042204220422 = ((Integer)obj1).intValue();
                b042204220422042204220422 = 71;
                break;

            case 0: // '\0'
                break;
            }
            try
            {
                i = super.onStartCommand(intent, i, j);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            return i;
        }
    }

    public int processCommand(Intent intent, int i, int j)
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    static 
    {
        Object obj = java/lang/Class.getMethod(nuuuuu.b0417041704170417041704170417(":8)\01640-18\023<08", ']', '\002'), new Class[0]);
        obj = ((Method) (obj)).invoke(com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService, new Object[0]);
        obj = (String)obj;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            i = b042204220422042204220422;
            j = b042204220422042204220422;
            k = b042204220422042204220422;
            l = b042204220422042204220422;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        i1 = b042204220422042204220422;
        switch ((i1 * (b042204220422042204220422 + i1)) % b042204220422042204220422)
        {
        default:
            Object obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("\u01EE\u05AE\u01BC\u01C0\u01BE\u01BE\u01BC\u01C0\u01BE\u01BE\u01BC\u01C0\u01BE\u01BE\u05AE\u01BC\u01C0\u01BE\u01BE", '\204', '\006'), new Class[0]);
            Object obj1;
            int j1;
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042204220422042204220422 = ((Integer)obj2).intValue();
            b042204220422042204220422 = 45;
            break;

        case 0: // '\0'
            break;
        }
        j1 = b042204220422042204220422;
        if ((k * (i + j)) % l == j1)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        try
        {
            b042204220422042204220422 = 17;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            throw obj1;
        }
        obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("\u01BE\u057E\u018C\u0190\u018E\u018E\u018C\u0190\u018E\u018E\u018C\u0190\u018E\u018E\u057E\u018C\u0190\u018E\u018E", '\251', '\263', '\003'), new Class[0]);
        obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
        i = ((Integer)obj2).intValue();
        b042204220422042204220422 = i;
        TAG = ((String) (obj));
        return;
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
        obj1;
        throw ((InvocationTargetException) (obj1)).getCause();
    }


/*
    static String access$000()
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            obj = TAG;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        try
        {
            i = b042204220422042204220422;
            j = b042204220422042204220422;
            k = b042204220422042204220422;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        l = b042204220422042204220422;
        i1 = b042204220422042204220422;
        obj1 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("~LPNNLPNNLPNN\u043ELPNNLPNN", '\016', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        switch (((i1 + l) * l) % ((Integer)obj1).intValue())
        {
        default:
            b042204220422042204220422 = 53;
            Object obj2 = com/visa/cbp/sdk/facade/activeaccountmanagement/CheckStatusService.getMethod(nuuuuu.b0417041704170417041704170417("\u0114\u04D4\342\346\344\344\342\346\344\344\342\346\344\344\u04D4\342\346\344\344", '\253', '\007', '\003'), new Class[0]);
            try
            {
                obj2 = ((Method) (obj2)).invoke(null, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw ((InvocationTargetException) (obj)).getCause();
            }
            b042204220422042204220422 = ((Integer)obj2).intValue();
            break;

        case 0: // '\0'
            break;
        }
        if (((j + i) * k) % b042204220422042204220422 == b042204220422042204220422)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        b042204220422042204220422 = 48;
        b042204220422042204220422 = 93;
        return ((String) (obj));
        return ((String) (obj));
    }

*/
}
