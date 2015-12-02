// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            BlockCipher, StreamCipher, DataLengthException

public abstract class StreamBlockCipher
    implements BlockCipher, StreamCipher
{

    private static final String z[];
    private final BlockCipher cipher;

    protected StreamBlockCipher(BlockCipher blockcipher)
    {
        cipher = blockcipher;
    }

    protected abstract byte calculateByte(byte byte0);

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int i1 = DataLengthException.a;
        try
        {
            if (k + j > abyte1.length)
            {
                throw new DataLengthException(z[0]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            if (i + j > abyte0.length)
            {
                throw new DataLengthException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        int l = k;
        k = i;
        do
        {
label0:
            {
                if (k < i + j)
                {
                    abyte1[l] = calculateByte(abyte0[k]);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                return j;
            }
            l++;
            k++;
        } while (true);
    }

    public final byte returnByte(byte byte0)
    {
        return calculateByte(byte0);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "b1M\034\017yd[\031\034k!KL\016b+\031\037\022b6M".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "d*I\031\016-&L\n\034h6\031\030\025bdJ\001\033a(".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 142
    //                   3 148;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_148;
_L1:
        byte0 = 122;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 13;
          goto _L7
_L3:
        byte0 = 68;
          goto _L7
_L4:
        byte0 = 57;
          goto _L7
        byte0 = 108;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 222
    //                   3 228;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_228;
_L8:
        byte byte1 = 122;
_L15:
        ac[i] = (char)(byte1 ^ c);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 13;
          goto _L15
_L10:
        byte1 = 68;
          goto _L15
_L11:
        byte1 = 57;
          goto _L15
        byte1 = 108;
          goto _L15
    }
}
