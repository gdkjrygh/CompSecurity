// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

public static final class  extends Enum
{

    public static final SI B;
    private static final SI ENUM$VALUES[];
    public static final SI I;
    public static final SI P;
    public static final SI SI;
    public static final SI SP;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl$SliceHeader$SliceType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        P = new <init>("P", 0);
        B = new <init>("B", 1);
        I = new <init>("I", 2);
        SP = new <init>("SP", 3);
        SI = new <init>("SI", 4);
        ENUM$VALUES = (new ENUM.VALUES[] {
            P, B, I, SP, SI
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
