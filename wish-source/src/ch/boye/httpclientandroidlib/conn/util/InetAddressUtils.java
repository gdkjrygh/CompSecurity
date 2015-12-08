// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InetAddressUtils
{

    private static final Pattern IPV4_PATTERN = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern IPV6_HEX_COMPRESSED_PATTERN = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    private static final Pattern IPV6_STD_PATTERN = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    private InetAddressUtils()
    {
    }

    public static boolean isIPv4Address(String s)
    {
        return IPV4_PATTERN.matcher(s).matches();
    }

    public static boolean isIPv6Address(String s)
    {
        return isIPv6StdAddress(s) || isIPv6HexCompressedAddress(s);
    }

    public static boolean isIPv6HexCompressedAddress(String s)
    {
        return IPV6_HEX_COMPRESSED_PATTERN.matcher(s).matches();
    }

    public static boolean isIPv6StdAddress(String s)
    {
        return IPV6_STD_PATTERN.matcher(s).matches();
    }

}
