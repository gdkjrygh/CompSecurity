// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;


// Referenced classes of package com.samsung.android.sdk.richnotification.actions:
//            SrnRemoteInputAction

public static final class Mode
{

    public static  createKeyboardInputMode()
    {
        return new (.KeyboardType.NORMAL, null);
    }

    public static  createKeyboardInputMode(.KeyboardType keyboardtype)
    {
        if (keyboardtype == null)
        {
            throw new NullPointerException("keyboard type is null.");
        } else
        {
            return new (keyboardtype, null);
        }
    }

    public static ode createMultiSelectInputMode()
    {
        return new ode(null, null);
    }

    public static Mode createSingleSelectInputMode()
    {
        return new Mode(null, null);
    }

    private Mode()
    {
    }
}
