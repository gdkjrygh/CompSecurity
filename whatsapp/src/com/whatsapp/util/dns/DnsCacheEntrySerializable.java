// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util.dns;

import com.whatsapp.util.Log;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public final class DnsCacheEntrySerializable
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private static final String z[];
    private final Long expirationTime;
    private final boolean forceOverride;
    private final InetAddress inetAddress;
    private final Short portNumber;
    private final boolean secureSocket;

    public DnsCacheEntrySerializable(Long long1, InetAddress inetaddress)
    {
        this(long1, inetaddress, null, false, false);
    }

    public DnsCacheEntrySerializable(Long long1, InetAddress inetaddress, Short short1, boolean flag, boolean flag1)
    {
        expirationTime = long1;
        inetAddress = inetaddress;
        portNumber = short1;
        secureSocket = flag;
        forceOverride = flag1;
    }

    public static DnsCacheEntrySerializable parseFallbackIpString(String s)
    {
        String as[];
label0:
        {
            if (s == null)
            {
                return null;
            }
            as = s.split(z[1], 6);
            try
            {
                if (as.length == 6)
                {
                    break label0;
                }
                Log.c(z[2], null, new Object[] {
                    s
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return null;
        }
        DnsCacheEntrySerializable dnscacheentryserializable;
        InetAddress inetaddress = InetAddress.getByName(as[0]);
        short word0 = Short.parseShort(as[1]);
        dnscacheentryserializable = new DnsCacheEntrySerializable(Long.valueOf((Long.parseLong(as[2]) + Long.parseLong(as[3])) * 1000L), inetaddress, Short.valueOf(word0), Boolean.parseBoolean(as[4]), Boolean.parseBoolean(as[5]));
        return dnscacheentryserializable;
        Object obj;
        obj;
_L2:
        Log.c(z[3], ((Throwable) (obj)), new Object[] {
            s
        });
        return null;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean equals(Object obj)
    {
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        try
        {
            flag = obj instanceof DnsCacheEntrySerializable;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (flag) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        obj = (DnsCacheEntrySerializable)obj;
        Object obj1;
        Object obj2;
        obj1 = expirationTime;
        obj2 = ((DnsCacheEntrySerializable) (obj)).expirationTime;
        if (obj1 == obj2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = expirationTime;
        if (obj1 == null) goto _L2; else goto _L4
_L4:
        flag = expirationTime.equals(((DnsCacheEntrySerializable) (obj)).expirationTime);
        if (!flag) goto _L2; else goto _L5
_L5:
        obj1 = inetAddress;
        obj2 = ((DnsCacheEntrySerializable) (obj)).inetAddress;
        if (obj1 == obj2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = inetAddress;
        if (obj1 == null) goto _L2; else goto _L6
_L6:
        flag = inetAddress.equals(((DnsCacheEntrySerializable) (obj)).inetAddress);
        if (!flag) goto _L2; else goto _L7
_L7:
        obj1 = portNumber;
        obj2 = ((DnsCacheEntrySerializable) (obj)).portNumber;
        if (obj1 == obj2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = portNumber;
        if (obj1 == null) goto _L2; else goto _L8
_L8:
        try
        {
            flag = portNumber.equals(((DnsCacheEntrySerializable) (obj)).portNumber);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (!flag) goto _L2; else goto _L9
_L9:
        return true;
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw obj;
    }

    public Long getExpirationTime()
    {
        return expirationTime;
    }

    public InetAddress getInetAddress()
    {
        return inetAddress;
    }

    public InetSocketAddress getInetSocketAddress()
    {
        InetAddress inetaddress;
        try
        {
            inetaddress = inetAddress;
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                throw numberformatexception;
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        if (inetaddress == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (portNumber != null)
        {
            return new InetSocketAddress(inetAddress, portNumber.shortValue());
        }
        return null;
    }

    public Short getPortNumber()
    {
        return portNumber;
    }

    public int hashCode()
    {
        int k = 0;
        if (expirationTime == null) goto _L2; else goto _L1
_L1:
        int i = expirationTime.hashCode();
_L3:
        NumberFormatException numberformatexception;
        int j;
        try
        {
            if (inetAddress == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            j = inetAddress.hashCode();
        }
        catch (NumberFormatException numberformatexception1)
        {
            throw numberformatexception1;
        }
_L4:
        try
        {
            if (portNumber != null)
            {
                k = portNumber.hashCode();
            }
        }
        catch (NumberFormatException numberformatexception2)
        {
            throw numberformatexception2;
        }
        return (j + (i + 41) * 41) * 41 + k;
        numberformatexception;
        throw numberformatexception;
_L2:
        i = 0;
          goto _L3
        j = 0;
          goto _L4
    }

    public boolean isExpired()
    {
        Long long1;
        try
        {
            long1 = expirationTime;
        }
        catch (NumberFormatException numberformatexception)
        {
            try
            {
                throw numberformatexception;
            }
            catch (NumberFormatException numberformatexception1)
            {
                throw numberformatexception1;
            }
        }
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (System.currentTimeMillis() >= expirationTime.longValue())
        {
            return true;
        }
        return false;
    }

    public boolean isForceOverride()
    {
        return forceOverride;
    }

    public boolean isSecureSocket()
    {
        return secureSocket;
    }

    public String toString()
    {
        return String.format(z[0], new Object[] {
            inetAddress, portNumber, expirationTime
        });
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[4];
        obj = "\016MY+f\013{;^Ky{Y.'_]";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "wB";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "oP\020McHV\006Kl_L\032]gYW\002bkQ_\001bg\004N\002|qNx\002bnI_\000eK[m\027|kEYL+q";
                i = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "oP\020McHV\006Kl_L\032]gYW\002bkQ_\001bg\004N\002|qNx\002bnI_\000eK[m\027|kEYL+q";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 196
    //                   1 202
    //                   2 208
    //                   3 214;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_214;
_L3:
        byte byte0 = 2;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 43;
          goto _L9
_L5:
        byte0 = 62;
          goto _L9
_L6:
        byte0 = 99;
          goto _L9
        byte0 = 14;
          goto _L9
    }
}
