// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;


// Referenced classes of package com.mixpanel.android.java_websocket.drafts:
//            Draft

public static final class  extends Enum
{

    private static final NOT_MATCHED ENUM$VALUES[];
    public static final NOT_MATCHED MATCHED;
    public static final NOT_MATCHED NOT_MATCHED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mixpanel/android/java_websocket/drafts/Draft$HandshakeState, s);
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
        MATCHED = new <init>("MATCHED", 0);
        NOT_MATCHED = new <init>("NOT_MATCHED", 1);
        ENUM$VALUES = (new ENUM.VALUES[] {
            MATCHED, NOT_MATCHED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
