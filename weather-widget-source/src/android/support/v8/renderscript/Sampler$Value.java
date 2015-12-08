// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Sampler

public static final class mID extends Enum
{

    private static final MIRRORED_REPEAT $VALUES[];
    public static final MIRRORED_REPEAT CLAMP;
    public static final MIRRORED_REPEAT LINEAR;
    public static final MIRRORED_REPEAT LINEAR_MIP_LINEAR;
    public static final MIRRORED_REPEAT LINEAR_MIP_NEAREST;
    public static final MIRRORED_REPEAT MIRRORED_REPEAT;
    public static final MIRRORED_REPEAT NEAREST;
    public static final MIRRORED_REPEAT WRAP;
    int mID;

    public static mID valueOf(String s)
    {
        return (mID)Enum.valueOf(android/support/v8/renderscript/Sampler$Value, s);
    }

    public static mID[] values()
    {
        return (mID[])$VALUES.clone();
    }

    static 
    {
        NEAREST = new <init>("NEAREST", 0, 0);
        LINEAR = new <init>("LINEAR", 1, 1);
        LINEAR_MIP_LINEAR = new <init>("LINEAR_MIP_LINEAR", 2, 2);
        LINEAR_MIP_NEAREST = new <init>("LINEAR_MIP_NEAREST", 3, 5);
        WRAP = new <init>("WRAP", 4, 3);
        CLAMP = new <init>("CLAMP", 5, 4);
        MIRRORED_REPEAT = new <init>("MIRRORED_REPEAT", 6, 6);
        $VALUES = (new .VALUES[] {
            NEAREST, LINEAR, LINEAR_MIP_LINEAR, LINEAR_MIP_NEAREST, WRAP, CLAMP, MIRRORED_REPEAT
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mID = j;
    }
}
