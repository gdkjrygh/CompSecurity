// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.Preconditions;
import java.text.ParseException;

// Referenced classes of package com.google.common.net:
//            HostAndPort, InetAddresses, InternetDomainName

public final class HostSpecifier
{

    private final String canonicalForm;

    private HostSpecifier(String s)
    {
        canonicalForm = s;
    }

    public static HostSpecifier from(String s)
        throws ParseException
    {
        HostSpecifier hostspecifier;
        try
        {
            hostspecifier = fromValid(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Invalid host specifier: ".concat(s);
            } else
            {
                s = new String("Invalid host specifier: ");
            }
            s = new ParseException(s, 0);
            s.initCause(illegalargumentexception);
            throw s;
        }
        return hostspecifier;
    }

    public static HostSpecifier fromValid(String s)
    {
        String s1;
        s = HostAndPort.fromString(s);
        java.net.InetAddress inetaddress;
        boolean flag;
        if (!s.hasPort())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        s1 = s.getHostText();
        s = null;
        inetaddress = InetAddresses.forString(s1);
        s = inetaddress;
_L2:
        if (s != null)
        {
            return new HostSpecifier(InetAddresses.toUriString(s));
        }
        s = InternetDomainName.from(s1);
        if (s.hasPublicSuffix())
        {
            return new HostSpecifier(s.toString());
        }
        s = String.valueOf(s1);
        if (s.length() != 0)
        {
            s = "Domain name does not have a recognized public suffix: ".concat(s);
        } else
        {
            s = new String("Domain name does not have a recognized public suffix: ");
        }
        throw new IllegalArgumentException(s);
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean isValid(String s)
    {
        try
        {
            fromValid(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof HostSpecifier)
        {
            obj = (HostSpecifier)obj;
            return canonicalForm.equals(((HostSpecifier) (obj)).canonicalForm);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return canonicalForm.hashCode();
    }

    public String toString()
    {
        return canonicalForm;
    }
}
