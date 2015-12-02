// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring.tracks;


// Referenced classes of package com.googlecode.mp4parser.authoring.tracks:
//            H264TrackImpl

private static final class  extends Enum
{

    public static final END BUFFER;
    public static final END END;
    private static final END ENUM$VALUES[];
    public static final END IGNORE;
    public static final END STORE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/googlecode/mp4parser/authoring/tracks/H264TrackImpl$NALActions, s);
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
        IGNORE = new <init>("IGNORE", 0);
        BUFFER = new <init>("BUFFER", 1);
        STORE = new <init>("STORE", 2);
        END = new <init>("END", 3);
        ENUM$VALUES = (new ENUM.VALUES[] {
            IGNORE, BUFFER, STORE, END
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
