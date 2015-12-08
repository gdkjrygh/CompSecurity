// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import uuuuuu.nuuuuu;

public class CardArt
{

    public static int b042904290429042904290429 = 1;
    public static int b042904290429042904290429 = 2;
    public static int b042904290429042904290429 = 67;
    public static int b042904290429042904290429;
    String baseImageFileName;
    int height;
    String orient;
    int width;

    public CardArt()
    {
        if (((b042904290429042904290429 + b042904290429042904290429) * b042904290429042904290429) % b042904290429042904290429 != b042904290429042904290429)
        {
            Object obj = com/visa/cbp/sdk/facade/data/CardArt.getMethod(nuuuuu.b0417041704170417041704170417("\uFF71\uFF3F\uFF43\uFF41\uFF48\uFF3F\uFF43\uFF41\uFF48\uFF3F\uFF43\uFF41\uFF48\u0338\u0338\u0338", '\305', ',', '\0'), new Class[0]);
            Exception exception;
            try
            {
                obj = ((Method) (obj)).invoke(null, new Object[0]);
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                throw invocationtargetexception.getCause();
            }
            b042904290429042904290429 = ((Integer)obj).intValue();
            b042904290429042904290429 = 31;
        }
        try
        {
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public static int b042904290429042904290429()
    {
        return 12;
    }
}
