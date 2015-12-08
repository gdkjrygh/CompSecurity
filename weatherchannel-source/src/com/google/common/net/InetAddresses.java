// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import com.google.common.primitives.Ints;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class InetAddresses
{
    public static final class TeredoInfo
    {

        private final Inet4Address client;
        private final int flags;
        private final int port;
        private final Inet4Address server;

        public Inet4Address getClient()
        {
            return client;
        }

        public int getFlags()
        {
            return flags;
        }

        public int getPort()
        {
            return port;
        }

        public Inet4Address getServer()
        {
            return server;
        }

        public TeredoInfo(Inet4Address inet4address, Inet4Address inet4address1, int i, int j)
        {
            boolean flag;
            if (i >= 0 && i <= 65535)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "port '%s' is out of range (0 <= port <= 0xffff)", new Object[] {
                Integer.valueOf(i)
            });
            if (j >= 0 && j <= 65535)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "flags '%s' is out of range (0 <= flags <= 0xffff)", new Object[] {
                Integer.valueOf(j)
            });
            server = (Inet4Address)MoreObjects.firstNonNull(inet4address, InetAddresses.ANY4);
            client = (Inet4Address)MoreObjects.firstNonNull(inet4address1, InetAddresses.ANY4);
            port = i;
            flags = j;
        }
    }


    private static final Inet4Address ANY4 = (Inet4Address)forString("0.0.0.0");
    private static final int IPV4_PART_COUNT = 4;
    private static final int IPV6_PART_COUNT = 8;
    private static final Inet4Address LOOPBACK4 = (Inet4Address)forString("127.0.0.1");

    private InetAddresses()
    {
    }

    private static InetAddress bytesToInetAddress(byte abyte0[])
    {
        try
        {
            abyte0 = InetAddress.getByAddress(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
    }

    public static int coerceToInteger(InetAddress inetaddress)
    {
        return ByteStreams.newDataInput(getCoercedIPv4Address(inetaddress).getAddress()).readInt();
    }

    private static void compressLongestRunOfZeroes(int ai[])
    {
        int k = -1;
        byte byte0 = -1;
        int j = -1;
        int i = 0;
        while (i < ai.length + 1) 
        {
            int l;
            int i1;
            int j1;
            if (i < ai.length && ai[i] == 0)
            {
                i1 = byte0;
                j1 = k;
                l = j;
                if (j < 0)
                {
                    l = i;
                    j1 = k;
                    i1 = byte0;
                }
            } else
            {
                i1 = byte0;
                j1 = k;
                l = j;
                if (j >= 0)
                {
                    i1 = i - j;
                    l = byte0;
                    if (i1 > byte0)
                    {
                        l = i1;
                        k = j;
                    }
                    j = -1;
                    i1 = l;
                    j1 = k;
                    l = j;
                }
            }
            i++;
            byte0 = i1;
            k = j1;
            j = l;
        }
        if (byte0 >= 2)
        {
            Arrays.fill(ai, k, k + byte0, -1);
        }
    }

    private static String convertDottedQuadToHex(String s)
    {
        int i = s.lastIndexOf(':');
        String s1 = s.substring(0, i + 1);
        byte abyte0[] = textToNumericFormatV4(s.substring(i + 1));
        if (abyte0 == null)
        {
            return null;
        } else
        {
            s = Integer.toHexString((abyte0[0] & 0xff) << 8 | abyte0[1] & 0xff);
            String s2 = Integer.toHexString((abyte0[2] & 0xff) << 8 | abyte0[3] & 0xff);
            s1 = String.valueOf(String.valueOf(s1));
            s = String.valueOf(String.valueOf(s));
            s2 = String.valueOf(String.valueOf(s2));
            return (new StringBuilder(s1.length() + 1 + s.length() + s2.length())).append(s1).append(s).append(":").append(s2).toString();
        }
    }

    public static InetAddress decrement(InetAddress inetaddress)
    {
        byte abyte0[] = inetaddress.getAddress();
        int i;
        for (i = abyte0.length - 1; i >= 0 && abyte0[i] == 0; i--)
        {
            abyte0[i] = -1;
        }

        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Decrementing %s would wrap.", new Object[] {
            inetaddress
        });
        abyte0[i] = (byte)(abyte0[i] - 1);
        return bytesToInetAddress(abyte0);
    }

    public static InetAddress forString(String s)
    {
        byte abyte0[] = ipStringToBytes(s);
        if (abyte0 == null)
        {
            throw new IllegalArgumentException(String.format("'%s' is not an IP string literal.", new Object[] {
                s
            }));
        } else
        {
            return bytesToInetAddress(abyte0);
        }
    }

    public static InetAddress forUriString(String s)
    {
        Preconditions.checkNotNull(s);
        byte abyte0[];
        byte byte0;
        if (s.startsWith("[") && s.endsWith("]"))
        {
            abyte0 = s.substring(1, s.length() - 1);
            byte0 = 16;
        } else
        {
            abyte0 = s;
            byte0 = 4;
        }
        abyte0 = ipStringToBytes(abyte0);
        if (abyte0 == null || abyte0.length != byte0)
        {
            throw new IllegalArgumentException(String.format("Not a valid URI IP literal: '%s'", new Object[] {
                s
            }));
        } else
        {
            return bytesToInetAddress(abyte0);
        }
    }

    public static Inet4Address fromInteger(int i)
    {
        return getInet4Address(Ints.toByteArray(i));
    }

    public static InetAddress fromLittleEndianByteArray(byte abyte0[])
        throws UnknownHostException
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = abyte0[abyte0.length - i - 1];
        }

        return InetAddress.getByAddress(abyte1);
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6address)
    {
        Preconditions.checkArgument(is6to4Address(inet6address), "Address '%s' is not a 6to4 address.", new Object[] {
            toAddrString(inet6address)
        });
        return getInet4Address(Arrays.copyOfRange(inet6address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress inetaddress)
    {
        if (inetaddress instanceof Inet4Address)
        {
            return (Inet4Address)inetaddress;
        }
        byte abyte0[] = inetaddress.getAddress();
        boolean flag = true;
        int i = 0;
        int j;
label0:
        do
        {
label1:
            {
                j = ((flag) ? 1 : 0);
                if (i < 15)
                {
                    if (abyte0[i] == 0)
                    {
                        break label1;
                    }
                    j = 0;
                }
                if (j && abyte0[15] == 1)
                {
                    return LOOPBACK4;
                }
                break label0;
            }
            i++;
        } while (true);
        if (j && abyte0[15] == 0)
        {
            return ANY4;
        }
        inetaddress = (Inet6Address)inetaddress;
        long l;
        if (hasEmbeddedIPv4ClientAddress(inetaddress))
        {
            l = getEmbeddedIPv4ClientAddress(inetaddress).hashCode();
        } else
        {
            l = ByteBuffer.wrap(inetaddress.getAddress(), 0, 8).getLong();
        }
        j = Hashing.murmur3_32().hashLong(l).asInt() | 0xe0000000;
        i = j;
        if (j == -1)
        {
            i = -2;
        }
        return getInet4Address(Ints.toByteArray(i));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6address)
    {
        Preconditions.checkArgument(isCompatIPv4Address(inet6address), "Address '%s' is not IPv4-compatible.", new Object[] {
            toAddrString(inet6address)
        });
        return getInet4Address(Arrays.copyOfRange(inet6address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address inet6address)
    {
        if (isCompatIPv4Address(inet6address))
        {
            return getCompatIPv4Address(inet6address);
        }
        if (is6to4Address(inet6address))
        {
            return get6to4IPv4Address(inet6address);
        }
        if (isTeredoAddress(inet6address))
        {
            return getTeredoInfo(inet6address).getClient();
        } else
        {
            throw new IllegalArgumentException(String.format("'%s' has no embedded IPv4 address.", new Object[] {
                toAddrString(inet6address)
            }));
        }
    }

    private static Inet4Address getInet4Address(byte abyte0[])
    {
        boolean flag;
        if (abyte0.length == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Byte array has invalid length for an IPv4 address: %s != 4.", new Object[] {
            Integer.valueOf(abyte0.length)
        });
        return (Inet4Address)bytesToInetAddress(abyte0);
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6address)
    {
        Preconditions.checkArgument(isIsatapAddress(inet6address), "Address '%s' is not an ISATAP address.", new Object[] {
            toAddrString(inet6address)
        });
        return getInet4Address(Arrays.copyOfRange(inet6address.getAddress(), 12, 16));
    }

    public static TeredoInfo getTeredoInfo(Inet6Address inet6address)
    {
        Preconditions.checkArgument(isTeredoAddress(inet6address), "Address '%s' is not a Teredo address.", new Object[] {
            toAddrString(inet6address)
        });
        byte abyte0[] = inet6address.getAddress();
        inet6address = getInet4Address(Arrays.copyOfRange(abyte0, 4, 8));
        short word0 = ByteStreams.newDataInput(abyte0, 8).readShort();
        short word1 = ByteStreams.newDataInput(abyte0, 10).readShort();
        abyte0 = Arrays.copyOfRange(abyte0, 12, 16);
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)(~abyte0[i]);
        }

        return new TeredoInfo(inet6address, getInet4Address(abyte0), ~word1 & 0xffff, word0 & 0xffff);
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6address)
    {
        return isCompatIPv4Address(inet6address) || is6to4Address(inet6address) || isTeredoAddress(inet6address);
    }

    private static String hextetsToIPv6String(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder(39);
        boolean flag1 = false;
        int i = 0;
        while (i < ai.length) 
        {
            boolean flag;
            if (ai[i] >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (flag1)
                {
                    stringbuilder.append(':');
                }
                stringbuilder.append(Integer.toHexString(ai[i]));
            } else
            if (i == 0 || flag1)
            {
                stringbuilder.append("::");
            }
            i++;
            flag1 = flag;
        }
        return stringbuilder.toString();
    }

    public static InetAddress increment(InetAddress inetaddress)
    {
        byte abyte0[] = inetaddress.getAddress();
        int i;
        for (i = abyte0.length - 1; i >= 0 && abyte0[i] == -1; i--)
        {
            abyte0[i] = 0;
        }

        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Incrementing %s would wrap.", new Object[] {
            inetaddress
        });
        abyte0[i] = (byte)(abyte0[i] + 1);
        return bytesToInetAddress(abyte0);
    }

    private static byte[] ipStringToBytes(String s)
    {
        int i;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        i = 0;
_L5:
        if (i >= s.length()) goto _L2; else goto _L1
_L1:
        char c = s.charAt(i);
        if (c != '.') goto _L4; else goto _L3
_L3:
        flag = true;
_L10:
        i++;
          goto _L5
_L4:
        if (c != ':') goto _L7; else goto _L6
_L6:
        if (!flag) goto _L9; else goto _L8
_L8:
        return null;
_L9:
        flag1 = true;
          goto _L10
_L7:
        if (Character.digit(c, 16) != -1) goto _L10; else goto _L11
_L11:
        return null;
_L2:
        String s1;
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = s;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = convertDottedQuadToHex(s);
        if (s1 == null) goto _L8; else goto _L12
_L12:
        return textToNumericFormatV6(s1);
        if (!flag) goto _L8; else goto _L13
_L13:
        return textToNumericFormatV4(s);
          goto _L10
    }

    public static boolean is6to4Address(Inet6Address inet6address)
    {
        inet6address = inet6address.getAddress();
        return inet6address[0] == 32 && inet6address[1] == 2;
    }

    public static boolean isCompatIPv4Address(Inet6Address inet6address)
    {
        if (inet6address.isIPv4CompatibleAddress())
        {
            if ((inet6address = inet6address.getAddress())[12] != 0 || inet6address[13] != 0 || inet6address[14] != 0 || inet6address[15] != 0 && inet6address[15] != 1)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isInetAddress(String s)
    {
        return ipStringToBytes(s) != null;
    }

    public static boolean isIsatapAddress(Inet6Address inet6address)
    {
        if (!isTeredoAddress(inet6address))
        {
            if (((inet6address = inet6address.getAddress())[8] | 3) == 3 && inet6address[9] == 0 && inet6address[10] == 94 && inet6address[11] == -2)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isMappedIPv4Address(String s)
    {
        s = ipStringToBytes(s);
        if (s == null || s.length != 16) goto _L2; else goto _L1
_L1:
        int i = 0;
_L8:
        if (i >= 10) goto _L4; else goto _L3
_L3:
        if (s[i] == 0) goto _L5; else goto _L2
_L2:
        return false;
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        int j = 10;
label0:
        do
        {
label1:
            {
                if (j >= 12)
                {
                    break label1;
                }
                if (s[j] != -1)
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L2; else goto _L6
_L6:
        return true;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean isMaximum(InetAddress inetaddress)
    {
        inetaddress = inetaddress.getAddress();
        for (int i = 0; i < inetaddress.length; i++)
        {
            if (inetaddress[i] != -1)
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isTeredoAddress(Inet6Address inet6address)
    {
        inet6address = inet6address.getAddress();
        return inet6address[0] == 32 && inet6address[1] == 1 && inet6address[2] == 0 && inet6address[3] == 0;
    }

    public static boolean isUriInetAddress(String s)
    {
        try
        {
            forUriString(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    private static short parseHextet(String s)
    {
        int i = Integer.parseInt(s, 16);
        if (i > 65535)
        {
            throw new NumberFormatException();
        } else
        {
            return (short)i;
        }
    }

    private static byte parseOctet(String s)
    {
        int i = Integer.parseInt(s);
        if (i > 255 || s.startsWith("0") && s.length() > 1)
        {
            throw new NumberFormatException();
        } else
        {
            return (byte)i;
        }
    }

    private static byte[] textToNumericFormatV4(String s)
    {
        String as[] = s.split("\\.", 5);
        if (as.length == 4) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        byte abyte0[];
        int i;
        abyte0 = new byte[4];
        i = 0;
_L5:
        s = abyte0;
        if (i >= abyte0.length) goto _L4; else goto _L3
_L3:
        abyte0[i] = parseOctet(as[i]);
        i++;
          goto _L5
        s;
        return null;
    }

    private static byte[] textToNumericFormatV6(String s)
    {
        s = s.split(":", 10);
        if (s.length >= 3 && s.length <= 9) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        int i;
        int j;
        j = -1;
        i = 1;
_L6:
        if (i >= s.length - 1) goto _L4; else goto _L3
_L3:
        int l;
        l = j;
        if (s[i].length() != 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (j >= 0) goto _L1; else goto _L5
_L5:
        l = i;
        i++;
        j = l;
          goto _L6
_L4:
        if (j < 0) goto _L8; else goto _L7
_L7:
        int j1;
        i = j;
        j1 = s.length - j - 1;
        l = i;
        if (s[0].length() != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = i - 1;
        if (l != 0) goto _L1; else goto _L9
_L9:
        int i1;
        i1 = l;
        i = j1;
        if (s[s.length - 1].length() != 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        i = j1 - 1;
        if (i != 0) goto _L1; else goto _L10
_L10:
        i1 = l;
_L14:
        l = 8 - (i1 + i);
        if (j < 0) goto _L12; else goto _L11
_L11:
        ByteBuffer bytebuffer;
        if (l < 1) goto _L1; else goto _L13
_L8:
        i1 = s.length;
        i = 0;
          goto _L14
_L12:
        if (l != 0)
        {
            return null;
        }
_L13:
        bytebuffer = ByteBuffer.allocate(16);
        int k = 0;
        while (k < i1) 
        {
            try
            {
                bytebuffer.putShort(parseHextet(s[k]));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            k++;
        }
        k = 0;
_L16:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.putShort((short)0);
        k++;
        if (true) goto _L16; else goto _L15
_L15:
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.putShort(parseHextet(s[s.length - i]));
        i--;
        if (true) goto _L15; else goto _L17
_L17:
        return bytebuffer.array();
          goto _L14
    }

    public static String toAddrString(InetAddress inetaddress)
    {
        Preconditions.checkNotNull(inetaddress);
        if (inetaddress instanceof Inet4Address)
        {
            return inetaddress.getHostAddress();
        }
        Preconditions.checkArgument(inetaddress instanceof Inet6Address);
        inetaddress = inetaddress.getAddress();
        int ai[] = new int[8];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = Ints.fromBytes((byte)0, (byte)0, inetaddress[i * 2], inetaddress[i * 2 + 1]);
        }

        compressLongestRunOfZeroes(ai);
        return hextetsToIPv6String(ai);
    }

    public static String toUriString(InetAddress inetaddress)
    {
        if (inetaddress instanceof Inet6Address)
        {
            inetaddress = String.valueOf(String.valueOf(toAddrString(inetaddress)));
            return (new StringBuilder(inetaddress.length() + 2)).append("[").append(inetaddress).append("]").toString();
        } else
        {
            return toAddrString(inetaddress);
        }
    }


}
