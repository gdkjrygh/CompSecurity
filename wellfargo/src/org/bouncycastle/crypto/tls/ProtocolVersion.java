// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;


// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsFatalAlert

public class ProtocolVersion
{

    public static final ProtocolVersion SSLv3 = new ProtocolVersion(768);
    public static final ProtocolVersion TLSv10 = new ProtocolVersion(769);
    public static final ProtocolVersion TLSv11 = new ProtocolVersion(770);
    public static final ProtocolVersion TLSv12 = new ProtocolVersion(771);
    private int version;

    private ProtocolVersion(int i)
    {
        version = 0xffff & i;
    }

    public static ProtocolVersion get(int i, int j)
    {
        switch (i)
        {
        case 3: // '\003'
            switch (j)
            {
            case 0: // '\0'
                return SSLv3;

            case 1: // '\001'
                return TLSv10;

            case 2: // '\002'
                return TLSv11;

            case 3: // '\003'
                return TLSv12;
            }
            break;
        }
        while (true) 
        {
            throw new TlsFatalAlert((short)47);
        }
    }

    public boolean equals(Object obj)
    {
        return this == obj;
    }

    public int getFullVersion()
    {
        return version;
    }

    public int getMajorVersion()
    {
        return version >> 8;
    }

    public int getMinorVersion()
    {
        return version & 0xff;
    }

    public int hashCode()
    {
        return version;
    }

}
