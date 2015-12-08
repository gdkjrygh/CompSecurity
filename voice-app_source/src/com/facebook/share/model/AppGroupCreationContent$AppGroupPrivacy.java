// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;


// Referenced classes of package com.facebook.share.model:
//            AppGroupCreationContent

public static final class  extends Enum
{

    public static final Closed Closed;
    private static final Closed ENUM$VALUES[];
    public static final Closed Open;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy, s);
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
        Open = new <init>("Open", 0);
        Closed = new <init>("Closed", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            Open, Closed
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
