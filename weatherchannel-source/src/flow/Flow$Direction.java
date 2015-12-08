// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;


// Referenced classes of package flow:
//            Flow

public static final class > extends Enum
{

    private static final REPLACE $VALUES[];
    public static final REPLACE BACKWARD;
    public static final REPLACE FORWARD;
    public static final REPLACE REPLACE;

    public static > valueOf(String s)
    {
        return (>)Enum.valueOf(flow/Flow$Direction, s);
    }

    public static Of[] values()
    {
        return (Of[])$VALUES.clone();
    }

    static 
    {
        FORWARD = new <init>("FORWARD", 0);
        BACKWARD = new <init>("BACKWARD", 1);
        REPLACE = new <init>("REPLACE", 2);
        $VALUES = (new .VALUES[] {
            FORWARD, BACKWARD, REPLACE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
