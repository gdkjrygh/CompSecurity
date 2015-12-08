// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            ButtonManager

public static final class  extends Enum
{

    private static final LABEL_STATE_HIDDEN $VALUES[];
    public static final LABEL_STATE_HIDDEN LABEL_STATE_HIDDEN;
    public static final LABEL_STATE_HIDDEN LABEL_STATE_NORMAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/ui/ButtonManager$LabelState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LABEL_STATE_NORMAL = new <init>("LABEL_STATE_NORMAL", 0);
        LABEL_STATE_HIDDEN = new <init>("LABEL_STATE_HIDDEN", 1);
        $VALUES = (new .VALUES[] {
            LABEL_STATE_NORMAL, LABEL_STATE_HIDDEN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
