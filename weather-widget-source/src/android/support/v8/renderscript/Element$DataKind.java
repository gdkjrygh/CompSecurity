// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Element

public static final class mID extends Enum
{

    private static final PIXEL_YUV $VALUES[];
    public static final PIXEL_YUV PIXEL_A;
    public static final PIXEL_YUV PIXEL_DEPTH;
    public static final PIXEL_YUV PIXEL_L;
    public static final PIXEL_YUV PIXEL_LA;
    public static final PIXEL_YUV PIXEL_RGB;
    public static final PIXEL_YUV PIXEL_RGBA;
    public static final PIXEL_YUV PIXEL_YUV;
    public static final PIXEL_YUV USER;
    int mID;

    public static mID valueOf(String s)
    {
        return (mID)Enum.valueOf(android/support/v8/renderscript/Element$DataKind, s);
    }

    public static mID[] values()
    {
        return (mID[])$VALUES.clone();
    }

    static 
    {
        USER = new <init>("USER", 0, 0);
        PIXEL_L = new <init>("PIXEL_L", 1, 7);
        PIXEL_A = new <init>("PIXEL_A", 2, 8);
        PIXEL_LA = new <init>("PIXEL_LA", 3, 9);
        PIXEL_RGB = new <init>("PIXEL_RGB", 4, 10);
        PIXEL_RGBA = new <init>("PIXEL_RGBA", 5, 11);
        PIXEL_DEPTH = new <init>("PIXEL_DEPTH", 6, 12);
        PIXEL_YUV = new <init>("PIXEL_YUV", 7, 13);
        $VALUES = (new .VALUES[] {
            USER, PIXEL_L, PIXEL_A, PIXEL_LA, PIXEL_RGB, PIXEL_RGBA, PIXEL_DEPTH, PIXEL_YUV
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        mID = j;
    }
}
