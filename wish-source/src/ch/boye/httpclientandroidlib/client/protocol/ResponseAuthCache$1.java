// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.client.protocol;

import ch.boye.httpclientandroidlib.auth.AuthProtocolState;

// Referenced classes of package ch.boye.httpclientandroidlib.client.protocol:
//            ResponseAuthCache

static class 
{

    static final int $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[];

    static 
    {
        $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState = new int[AuthProtocolState.values().length];
        try
        {
            $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[AuthProtocolState.CHALLENGED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$ch$boye$httpclientandroidlib$auth$AuthProtocolState[AuthProtocolState.FAILURE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
