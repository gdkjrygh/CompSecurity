// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.auth;

import ch.boye.httpclientandroidlib.util.LangUtils;
import java.io.Serializable;
import java.security.Principal;

// Referenced classes of package ch.boye.httpclientandroidlib.auth:
//            Credentials, BasicUserPrincipal

public class UsernamePasswordCredentials
    implements Credentials, Serializable
{

    private static final long serialVersionUID = 0x36087f34635c8cbL;
    private final String password;
    private final BasicUserPrincipal principal;

    public UsernamePasswordCredentials(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Username:password string may not be null");
        }
        int i = s.indexOf(':');
        if (i >= 0)
        {
            principal = new BasicUserPrincipal(s.substring(0, i));
            password = s.substring(i + 1);
            return;
        } else
        {
            principal = new BasicUserPrincipal(s);
            password = null;
            return;
        }
    }

    public UsernamePasswordCredentials(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Username may not be null");
        } else
        {
            principal = new BasicUserPrincipal(s);
            password = s1;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof UsernamePasswordCredentials) || !LangUtils.equals(principal, ((UsernamePasswordCredentials) (obj = (UsernamePasswordCredentials)obj)).principal))
            {
                return false;
            }
        }
        return true;
    }

    public String getPassword()
    {
        return password;
    }

    public String getUserName()
    {
        return principal.getName();
    }

    public Principal getUserPrincipal()
    {
        return principal;
    }

    public int hashCode()
    {
        return principal.hashCode();
    }

    public String toString()
    {
        return principal.toString();
    }
}
