// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.auth;

import ch.boye.httpclientandroidlib.HeaderElement;
import ch.boye.httpclientandroidlib.auth.ChallengeState;
import ch.boye.httpclientandroidlib.auth.MalformedChallengeException;
import ch.boye.httpclientandroidlib.message.BasicHeaderValueParser;
import ch.boye.httpclientandroidlib.message.HeaderValueParser;
import ch.boye.httpclientandroidlib.message.ParserCursor;
import ch.boye.httpclientandroidlib.util.CharArrayBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.auth:
//            AuthSchemeBase

public abstract class RFC2617Scheme extends AuthSchemeBase
{

    private final Map params;

    public RFC2617Scheme()
    {
        this(null);
    }

    public RFC2617Scheme(ChallengeState challengestate)
    {
        super(challengestate);
        params = new HashMap();
    }

    public String getParameter(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (String)params.get(s.toLowerCase(Locale.ENGLISH));
        }
    }

    protected Map getParameters()
    {
        return params;
    }

    public String getRealm()
    {
        return getParameter("realm");
    }

    protected void parseChallenge(CharArrayBuffer chararraybuffer, int i, int j)
        throws MalformedChallengeException
    {
        chararraybuffer = BasicHeaderValueParser.DEFAULT.parseElements(chararraybuffer, new ParserCursor(i, chararraybuffer.length()));
        if (chararraybuffer.length == 0)
        {
            throw new MalformedChallengeException("Authentication challenge is empty");
        }
        params.clear();
        j = chararraybuffer.length;
        for (i = 0; i < j; i++)
        {
            HeaderElement headerelement = chararraybuffer[i];
            params.put(headerelement.getName(), headerelement.getValue());
        }

    }
}
