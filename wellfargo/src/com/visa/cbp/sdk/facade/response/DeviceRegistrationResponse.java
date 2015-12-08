// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.response;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class DeviceRegistrationResponse
{

    public static int b044E044E044E044E044E044E = 0;
    public static int b044E044E044E044E044E044E = 2;
    public static int b044E044E044E044E044E044E = 79;
    public static int b044E044E044E044E044E044E = 1;
    private String deviceID;
    private String deviceIDFlag;

    public DeviceRegistrationResponse()
    {
        throw new Runtime("d2j fail translate: java.lang.IndexOutOfBoundsException: fromIndex < 0: -1\n\tat java.util.BitSet.nextSetBit(BitSet.java:701)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.makeSureAllElementAreAssigned(FillArrayTransformer.java:505)\n\tat com.googlecode.dex2jar.ir.ts.array.FillArrayTransformer.transformReportChanged(FillArrayTransformer.java:123)\n\tat com.googlecode.dex2jar.ir.ts.StatedTransformer.transform(StatedTransformer.java:10)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:149)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }

    public static int b044E044E044E044E044E044E()
    {
        return 64;
    }

    public String getDeviceID()
    {
        return deviceID;
    }

    public String getDeviceIDFlag()
    {
        String s;
        Object obj;
        Object obj1;
        int i;
        int j;
        int k;
        int l;
        int i1;
        try
        {
            s = deviceIDFlag;
            i = b044E044E044E044E044E044E;
            j = b044E044E044E044E044E044E;
            k = b044E044E044E044E044E044E;
            l = b044E044E044E044E044E044E;
            i1 = b044E044E044E044E044E044E;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((i + j) * k) % l == i1)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        obj1 = com/visa/cbp/sdk/facade/response/DeviceRegistrationResponse.getMethod(nuuuuu.b0417041704170417041704170417("\374\u04E8\312\316\316\337\312\316\316\337\u04E8\312\316\316\337\312\316\316\337", 'h', '2', '\003'), new Class[0]);
        obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        i = ((Integer)obj1).intValue();
        try
        {
            b044E044E044E044E044E044E = i;
            b044E044E044E044E044E044E = 59;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj1 = com/visa/cbp/sdk/facade/response/DeviceRegistrationResponse.getMethod(nuuuuu.b0417041704170417041704170417("\uFFB0\u039C\uFF7E\uFF82\uFF82\uFF93\uFF7E\uFF82\uFF82\uFF93\u039C\uFF7E\uFF82\uFF82\uFF93\uFF7E\uFF82\uFF82\uFF93", '\372', 'H', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        i = ((Integer)obj1).intValue();
        j = b044E044E044E044E044E044E;
        obj1 = com/visa/cbp/sdk/facade/response/DeviceRegistrationResponse.getMethod(nuuuuu.b0417041704170417041704170417("\u01BA\u05A6\u0188\u018C\u018C\u019D\u0188\u018C\u018C\u019D\u05A6\u0188\u018C\u018C\u019D\u0188\u018C\u018C\u019D", '\254', '\001'), new Class[0]);
        try
        {
            obj1 = ((Method) (obj1)).invoke(null, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw ((InvocationTargetException) (obj)).getCause();
        }
        if ((((Integer)obj1).intValue() * (j + i)) % b044E044E044E044E044E044E != b044E044E044E044E044E044E)
        {
            b044E044E044E044E044E044E = 44;
            b044E044E044E044E044E044E = 54;
        }
        return s;
        obj;
        throw ((InvocationTargetException) (obj)).getCause();
    }
}
