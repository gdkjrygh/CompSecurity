// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.drafts;


// Referenced classes of package com.mixpanel.android.java_websocket.drafts:
//            Draft

public static final class I extends Enum
{

    private static final TWOWAY ENUM$VALUES[];
    public static final TWOWAY NONE;
    public static final TWOWAY ONEWAY;
    public static final TWOWAY TWOWAY;

    public static I valueOf(String s)
    {
        return (I)Enum.valueOf(com/mixpanel/android/java_websocket/drafts/Draft$CloseHandshakeType, s);
    }

    public static I[] values()
    {
        I ai[] = ENUM$VALUES;
        int i = ai.length;
        I ai1[] = new ENUM.VALUES[i];
        System.arraycopy(ai, 0, ai1, 0, i);
        return ai1;
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        ONEWAY = new <init>("ONEWAY", 1);
        TWOWAY = new <init>("TWOWAY", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            NONE, ONEWAY, TWOWAY
        });
    }

    private I(String s, int i)
    {
        super(s, i);
    }
}
