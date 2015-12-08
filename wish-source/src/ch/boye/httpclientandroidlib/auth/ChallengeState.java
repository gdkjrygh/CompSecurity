// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;


public final class ChallengeState extends Enum
{

    private static final ChallengeState $VALUES[];
    public static final ChallengeState PROXY;
    public static final ChallengeState TARGET;

    private ChallengeState(String s, int i)
    {
        super(s, i);
    }

    public static ChallengeState valueOf(String s)
    {
        return (ChallengeState)Enum.valueOf(ch/boye/httpclientandroidlib/auth/ChallengeState, s);
    }

    public static ChallengeState[] values()
    {
        return (ChallengeState[])$VALUES.clone();
    }

    static 
    {
        TARGET = new ChallengeState("TARGET", 0);
        PROXY = new ChallengeState("PROXY", 1);
        $VALUES = (new ChallengeState[] {
            TARGET, PROXY
        });
    }
}
