// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;

import java.util.Queue;

// Referenced classes of package ch.boye.httpclientandroidlib.auth:
//            AuthProtocolState, AuthScheme, AuthScope, Credentials

public class AuthState
{

    private Queue authOptions;
    private AuthScheme authScheme;
    private AuthScope authScope;
    private Credentials credentials;
    private AuthProtocolState state;

    public AuthState()
    {
        state = AuthProtocolState.UNCHALLENGED;
    }

    public Queue getAuthOptions()
    {
        return authOptions;
    }

    public AuthScheme getAuthScheme()
    {
        return authScheme;
    }

    public AuthScope getAuthScope()
    {
        return authScope;
    }

    public Credentials getCredentials()
    {
        return credentials;
    }

    public AuthProtocolState getState()
    {
        return state;
    }

    public boolean hasAuthOptions()
    {
        return authOptions != null && !authOptions.isEmpty();
    }

    public void invalidate()
    {
        reset();
    }

    public boolean isValid()
    {
        return authScheme != null;
    }

    public void reset()
    {
        state = AuthProtocolState.UNCHALLENGED;
        authOptions = null;
        authScheme = null;
        authScope = null;
        credentials = null;
    }

    public void setAuthScheme(AuthScheme authscheme)
    {
        if (authscheme == null)
        {
            reset();
            return;
        } else
        {
            authScheme = authscheme;
            return;
        }
    }

    public void setAuthScope(AuthScope authscope)
    {
        authScope = authscope;
    }

    public void setCredentials(Credentials credentials1)
    {
        credentials = credentials1;
    }

    public void setState(AuthProtocolState authprotocolstate)
    {
        if (authprotocolstate == null)
        {
            authprotocolstate = AuthProtocolState.UNCHALLENGED;
        }
        state = authprotocolstate;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("state:").append(state).append(";");
        if (authScheme != null)
        {
            stringbuilder.append("auth scheme:").append(authScheme.getSchemeName()).append(";");
        }
        if (credentials != null)
        {
            stringbuilder.append("credentials present");
        }
        return stringbuilder.toString();
    }

    public void update(AuthScheme authscheme, Credentials credentials1)
    {
        if (authscheme == null)
        {
            throw new IllegalArgumentException("Auth scheme may not be null or empty");
        }
        if (credentials1 == null)
        {
            throw new IllegalArgumentException("Credentials may not be null or empty");
        } else
        {
            authScheme = authscheme;
            credentials = credentials1;
            authOptions = null;
            return;
        }
    }

    public void update(Queue queue)
    {
        if (queue == null || queue.isEmpty())
        {
            throw new IllegalArgumentException("Queue of auth options may not be null or empty");
        } else
        {
            authOptions = queue;
            authScheme = null;
            credentials = null;
            return;
        }
    }
}
