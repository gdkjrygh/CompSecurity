// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;


// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            NTLMScheme

static final class  extends Enum
{

    private static final FAILED $VALUES[];
    public static final FAILED CHALLENGE_RECEIVED;
    public static final FAILED FAILED;
    public static final FAILED MSG_TYPE1_GENERATED;
    public static final FAILED MSG_TYPE2_RECEVIED;
    public static final FAILED MSG_TYPE3_GENERATED;
    public static final FAILED UNINITIATED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(ch/boye/httpclientandroidlib/impl/auth/NTLMScheme$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNINITIATED = new <init>("UNINITIATED", 0);
        CHALLENGE_RECEIVED = new <init>("CHALLENGE_RECEIVED", 1);
        MSG_TYPE1_GENERATED = new <init>("MSG_TYPE1_GENERATED", 2);
        MSG_TYPE2_RECEVIED = new <init>("MSG_TYPE2_RECEVIED", 3);
        MSG_TYPE3_GENERATED = new <init>("MSG_TYPE3_GENERATED", 4);
        FAILED = new <init>("FAILED", 5);
        $VALUES = (new .VALUES[] {
            UNINITIATED, CHALLENGE_RECEIVED, MSG_TYPE1_GENERATED, MSG_TYPE2_RECEVIED, MSG_TYPE3_GENERATED, FAILED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
