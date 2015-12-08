// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import ch.boye.httpclientandroidlib.Header;
import ch.boye.httpclientandroidlib.HttpRequest;
import ch.boye.httpclientandroidlib.auth.AuthenticationException;
import ch.boye.httpclientandroidlib.auth.Credentials;
import ch.boye.httpclientandroidlib.auth.InvalidCredentialsException;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.auth.NTCredentials;
import ch.boye.httpclientandroidlib.message.BufferedHeader;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            AuthSchemeBase, NTLMEngine

public class NTLMScheme extends AuthSchemeBase
{
    static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State CHALLENGE_RECEIVED;
        public static final State FAILED;
        public static final State MSG_TYPE1_GENERATED;
        public static final State MSG_TYPE2_RECEVIED;
        public static final State MSG_TYPE3_GENERATED;
        public static final State UNINITIATED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(ch/boye/httpclientandroidlib/impl/auth/NTLMScheme$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            UNINITIATED = new State("UNINITIATED", 0);
            CHALLENGE_RECEIVED = new State("CHALLENGE_RECEIVED", 1);
            MSG_TYPE1_GENERATED = new State("MSG_TYPE1_GENERATED", 2);
            MSG_TYPE2_RECEVIED = new State("MSG_TYPE2_RECEVIED", 3);
            MSG_TYPE3_GENERATED = new State("MSG_TYPE3_GENERATED", 4);
            FAILED = new State("FAILED", 5);
            $VALUES = (new State[] {
                UNINITIATED, CHALLENGE_RECEIVED, MSG_TYPE1_GENERATED, MSG_TYPE2_RECEVIED, MSG_TYPE3_GENERATED, FAILED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private String challenge;
    private final NTLMEngine engine;
    private State state;

    public NTLMScheme(NTLMEngine ntlmengine)
    {
        if (ntlmengine == null)
        {
            throw new IllegalArgumentException("NTLM engine may not be null");
        } else
        {
            engine = ntlmengine;
            state = State.UNINITIATED;
            challenge = null;
            return;
        }
    }

    public Header authenticate(Credentials credentials, HttpRequest httprequest)
        throws AuthenticationException
    {
        try
        {
            httprequest = (NTCredentials)credentials;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            throw new InvalidCredentialsException((new StringBuilder()).append("Credentials cannot be used for NTLM authentication: ").append(credentials.getClass().getName()).toString());
        }
        if (state == State.CHALLENGE_RECEIVED || state == State.FAILED)
        {
            credentials = engine.generateType1Msg(httprequest.getDomain(), httprequest.getWorkstation());
            state = State.MSG_TYPE1_GENERATED;
        } else
        if (state == State.MSG_TYPE2_RECEVIED)
        {
            credentials = engine.generateType3Msg(httprequest.getUserName(), httprequest.getPassword(), httprequest.getDomain(), httprequest.getWorkstation(), challenge);
            state = State.MSG_TYPE3_GENERATED;
        } else
        {
            throw new AuthenticationException((new StringBuilder()).append("Unexpected state: ").append(state).toString());
        }
        httprequest = new CharArrayBuffer(32);
        if (isProxy())
        {
            httprequest.append("Proxy-Authorization");
        } else
        {
            httprequest.append("Authorization");
        }
        httprequest.append(": NTLM ");
        httprequest.append(credentials);
        return new BufferedHeader(httprequest);
    }

    public String getParameter(String s)
    {
        return null;
    }

    public String getRealm()
    {
        return null;
    }

    public String getSchemeName()
    {
        return "ntlm";
    }

    public boolean isComplete()
    {
        return state == State.MSG_TYPE3_GENERATED || state == State.FAILED;
    }

    public boolean isConnectionBased()
    {
        return true;
    }

    protected void parseChallenge(CharArrayBuffer chararraybuffer, int i, int j)
        throws MalformedChallengeException
    {
        chararraybuffer = chararraybuffer.substringTrimmed(i, j);
        if (chararraybuffer.length() == 0)
        {
            if (state == State.UNINITIATED)
            {
                state = State.CHALLENGE_RECEIVED;
            } else
            {
                state = State.FAILED;
            }
            challenge = null;
            return;
        } else
        {
            state = State.MSG_TYPE2_RECEVIED;
            challenge = chararraybuffer;
            return;
        }
    }
}
