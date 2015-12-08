// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import java.io.Serializable;

public final class HostAndPort
    implements Serializable
{

    private static final int NO_PORT = -1;
    private static final long serialVersionUID = 0L;
    private final boolean hasBracketlessColons;
    private final String host;
    private final int port;

    private HostAndPort(String s, int i, boolean flag)
    {
        host = s;
        port = i;
        hasBracketlessColons = flag;
    }

    public static HostAndPort fromHost(String s)
    {
        HostAndPort hostandport = fromString(s);
        boolean flag;
        if (!hostandport.hasPort())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Host has a port: %s", new Object[] {
            s
        });
        return hostandport;
    }

    public static HostAndPort fromParts(String s, int i)
    {
        Preconditions.checkArgument(isValidPort(i), "Port out of range: %s", new Object[] {
            Integer.valueOf(i)
        });
        HostAndPort hostandport = fromString(s);
        boolean flag;
        if (!hostandport.hasPort())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Host has a port: %s", new Object[] {
            s
        });
        return new HostAndPort(hostandport.host, i, hostandport.hasBracketlessColons);
    }

    public static HostAndPort fromString(String s)
    {
        Preconditions.checkNotNull(s);
        Object obj = null;
        boolean flag = false;
        String s1;
        int i;
        if (s.startsWith("["))
        {
            obj = getHostAndPortFromBracketedHost(s);
            s1 = obj[0];
            obj = obj[1];
        } else
        {
            int j = s.indexOf(':');
            if (j >= 0 && s.indexOf(':', j + 1) == -1)
            {
                s1 = s.substring(0, j);
                obj = s.substring(j + 1);
            } else
            {
                s1 = s;
                if (j >= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        }
        i = -1;
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            boolean flag1;
            if (!((String) (obj)).startsWith("+"))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1, "Unparseable port number: %s", new Object[] {
                s
            });
            try
            {
                i = Integer.parseInt(((String) (obj)));
            }
            catch (NumberFormatException numberformatexception)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Unparseable port number: ".concat(s);
                } else
                {
                    s = new String("Unparseable port number: ");
                }
                throw new IllegalArgumentException(s);
            }
            Preconditions.checkArgument(isValidPort(i), "Port number out of range: %s", new Object[] {
                s
            });
        }
        return new HostAndPort(s1, i, flag);
    }

    private static String[] getHostAndPortFromBracketedHost(String s)
    {
        String s1;
        int i;
        int k;
        boolean flag;
        if (s.charAt(0) == '[')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Bracketed host-port string must start with a bracket: %s", new Object[] {
            s
        });
        i = s.indexOf(':');
        k = s.lastIndexOf(']');
        if (i > -1 && k > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid bracketed host/port: %s", new Object[] {
            s
        });
        s1 = s.substring(1, k);
        if (k + 1 == s.length())
        {
            return (new String[] {
                s1, ""
            });
        }
        if (s.charAt(k + 1) == ':')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Only a colon may follow a close bracket: %s", new Object[] {
            s
        });
        for (int j = k + 2; j < s.length(); j++)
        {
            Preconditions.checkArgument(Character.isDigit(s.charAt(j)), "Port must be numeric: %s", new Object[] {
                s
            });
        }

        return (new String[] {
            s1, s.substring(k + 2)
        });
    }

    private static boolean isValidPort(int i)
    {
        return i >= 0 && i <= 65535;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof HostAndPort)
            {
                if (!Objects.equal(host, ((HostAndPort) (obj = (HostAndPort)obj)).host) || port != ((HostAndPort) (obj)).port || hasBracketlessColons != ((HostAndPort) (obj)).hasBracketlessColons)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public String getHostText()
    {
        return host;
    }

    public int getPort()
    {
        Preconditions.checkState(hasPort());
        return port;
    }

    public int getPortOrDefault(int i)
    {
        if (hasPort())
        {
            i = port;
        }
        return i;
    }

    public boolean hasPort()
    {
        return port >= 0;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            host, Integer.valueOf(port), Boolean.valueOf(hasBracketlessColons)
        });
    }

    public HostAndPort requireBracketsForIPv6()
    {
        boolean flag;
        if (!hasBracketlessColons)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Possible bracketless IPv6 literal: %s", new Object[] {
            host
        });
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(host.length() + 8);
        if (host.indexOf(':') >= 0)
        {
            stringbuilder.append('[').append(host).append(']');
        } else
        {
            stringbuilder.append(host);
        }
        if (hasPort())
        {
            stringbuilder.append(':').append(port);
        }
        return stringbuilder.toString();
    }

    public HostAndPort withDefaultPort(int i)
    {
        Preconditions.checkArgument(isValidPort(i));
        if (hasPort() || port == i)
        {
            return this;
        } else
        {
            return new HostAndPort(host, i, hasBracketlessColons);
        }
    }
}
