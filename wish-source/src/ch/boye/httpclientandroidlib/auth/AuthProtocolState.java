// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;


public final class AuthProtocolState extends Enum
{

    private static final AuthProtocolState $VALUES[];
    public static final AuthProtocolState CHALLENGED;
    public static final AuthProtocolState FAILURE;
    public static final AuthProtocolState HANDSHAKE;
    public static final AuthProtocolState SUCCESS;
    public static final AuthProtocolState UNCHALLENGED;

    private AuthProtocolState(String s, int i)
    {
        super(s, i);
    }

    public static AuthProtocolState valueOf(String s)
    {
        return (AuthProtocolState)Enum.valueOf(ch/boye/httpclientandroidlib/auth/AuthProtocolState, s);
    }

    public static AuthProtocolState[] values()
    {
        return (AuthProtocolState[])$VALUES.clone();
    }

    static 
    {
        UNCHALLENGED = new AuthProtocolState("UNCHALLENGED", 0);
        CHALLENGED = new AuthProtocolState("CHALLENGED", 1);
        HANDSHAKE = new AuthProtocolState("HANDSHAKE", 2);
        FAILURE = new AuthProtocolState("FAILURE", 3);
        SUCCESS = new AuthProtocolState("SUCCESS", 4);
        $VALUES = (new AuthProtocolState[] {
            UNCHALLENGED, CHALLENGED, HANDSHAKE, FAILURE, SUCCESS
        });
    }
}
