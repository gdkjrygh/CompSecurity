// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;


// Referenced classes of package com.google.common.hash:
//            AbstractCompositeHashFunction, Hashing, HashFunction, Hasher, 
//            HashCode

static final class bits extends AbstractCompositeHashFunction
{

    private final int bits;

    public int bits()
    {
        return bits;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof bits)) goto _L2; else goto _L1
_L1:
        obj = (bits)obj;
        if (bits == ((bits) (obj)).bits && functions.length == ((functions) (obj)).functions.length) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= functions.length)
                {
                    break label1;
                }
                if (!functions[i].equals(((functions) (obj)).functions[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L2; else goto _L4
_L4:
        return true;
    }

    public int hashCode()
    {
        int j = bits;
        HashFunction ahashfunction[] = functions;
        int k = ahashfunction.length;
        for (int i = 0; i < k; i++)
        {
            j ^= ahashfunction[i].hashCode();
        }

        return j;
    }

    HashCode makeHash(Hasher ahasher[])
    {
        byte abyte0[] = new byte[bits / 8];
        int j = 0;
        int k = ahasher.length;
        for (int i = 0; i < k; i++)
        {
            HashCode hashcode = ahasher[i].hash();
            j += hashcode.writeBytesTo(abyte0, j, hashcode.bits() / 8);
        }

        return HashCode.fromBytesNoCopy(abyte0);
    }

    transient (HashFunction ahashfunction[])
    {
        super(ahashfunction);
        int j = 0;
        int k = ahashfunction.length;
        for (int i = 0; i < k; i++)
        {
            j += ahashfunction[i].bits();
        }

        bits = j;
    }
}
