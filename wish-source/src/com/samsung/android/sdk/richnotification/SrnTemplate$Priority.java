// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;


// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnTemplate

protected static final class  extends Enum
{

    private static final SECONDARY ENUM$VALUES[];
    public static final SECONDARY PRIMARY;
    public static final SECONDARY SECONDARY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/samsung/android/sdk/richnotification/SrnTemplate$Priority, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    public String toString()
    {
        return super.toString().toLowerCase();
    }

    static 
    {
        PRIMARY = new <init>("PRIMARY", 0);
        SECONDARY = new <init>("SECONDARY", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            PRIMARY, SECONDARY
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
