// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            RenderScript

public static final class mID extends Enum
{

    private static final NORMAL $VALUES[];
    public static final NORMAL LOW;
    public static final NORMAL NORMAL;
    int mID;

    public static mID valueOf(String s)
    {
        return (mID)Enum.valueOf(android/support/v8/renderscript/RenderScript$Priority, s);
    }

    public static mID[] values()
    {
        return (mID[])$VALUES.clone();
    }

    static 
    {
        LOW = new <init>("LOW", 0, 15);
        NORMAL = new <init>("NORMAL", 1, -4);
        $VALUES = (new .VALUES[] {
            LOW, NORMAL
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mID = j;
    }
}
