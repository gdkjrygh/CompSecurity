// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;


// Referenced classes of package com.urbanairship.actions:
//            ActionResult

public static final class  extends Enum
{

    private static final EXECUTION_ERROR $VALUES[];
    public static final EXECUTION_ERROR ACTION_NOT_FOUND;
    public static final EXECUTION_ERROR COMPLETED;
    public static final EXECUTION_ERROR EXECUTION_ERROR;
    public static final EXECUTION_ERROR REJECTED_ARGUMENTS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/urbanairship/actions/ActionResult$Status, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        COMPLETED = new <init>("COMPLETED", 0);
        REJECTED_ARGUMENTS = new <init>("REJECTED_ARGUMENTS", 1);
        ACTION_NOT_FOUND = new <init>("ACTION_NOT_FOUND", 2);
        EXECUTION_ERROR = new <init>("EXECUTION_ERROR", 3);
        $VALUES = (new .VALUES[] {
            COMPLETED, REJECTED_ARGUMENTS, ACTION_NOT_FOUND, EXECUTION_ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
