// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;


// Referenced classes of package com.mapbar.android.location:
//            q

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static [] a()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("PENDING", 0);
        b = new <init>("RUNNING", 1);
        c = new <init>("FINISHED", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
