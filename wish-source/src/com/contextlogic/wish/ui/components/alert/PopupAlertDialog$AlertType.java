// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.alert;


// Referenced classes of package com.contextlogic.wish.ui.components.alert:
//            PopupAlertDialog

public static final class  extends Enum
{

    private static final Success $VALUES[];
    public static final Success Error;
    public static final Success Success;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/contextlogic/wish/ui/components/alert/PopupAlertDialog$AlertType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Error = new <init>("Error", 0);
        Success = new <init>("Success", 1);
        $VALUES = (new .VALUES[] {
            Error, Success
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
