// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.boxes;

import com.coremedia.iso.Hex;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.boxes:
//            AbstractSampleEncryptionBox

public class pairs
{
    public class Pair
    {

        public int clear;
        public long encrypted;
        final AbstractSampleEncryptionBox.Entry this$1;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (Pair)obj;
                if (clear != ((Pair) (obj)).clear)
                {
                    return false;
                }
                if (encrypted != ((Pair) (obj)).encrypted)
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return clear * 31 + (int)(encrypted ^ encrypted >>> 32);
        }

        public String toString()
        {
            return (new StringBuilder("clr:")).append(clear).append(" enc:").append(encrypted).toString();
        }

        public Pair(int i, long l)
        {
            this$1 = AbstractSampleEncryptionBox.Entry.this;
            super();
            clear = i;
            encrypted = l;
        }
    }


    public byte iv[];
    public List pairs;
    final AbstractSampleEncryptionBox this$0;

    public Pair createPair(int i, long l)
    {
        return new Pair(i, l);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Pair)obj;
            if (!(new BigInteger(iv)).equals(new BigInteger(((iv) (obj)).iv)))
            {
                return false;
            }
            if (pairs == null ? ((pairs) (obj)).pairs != null : !pairs.equals(((pairs) (obj)).pairs))
            {
                return false;
            }
        }
        return true;
    }

    public int getSize()
    {
        Iterator iterator;
        int i;
        int j;
        if (isOverrideTrackEncryptionBoxParameters())
        {
            i = ivSize;
        } else
        {
            i = iv.length;
        }
        j = i;
        if (!isSubSampleEncryption()) goto _L2; else goto _L1
_L1:
        i += 2;
        iterator = pairs.iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        j = i;
_L2:
        return j;
_L4:
        Pair pair = (Pair)iterator.next();
        i += 6;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (iv != null)
        {
            i = Arrays.hashCode(iv);
        } else
        {
            i = 0;
        }
        if (pairs != null)
        {
            j = pairs.hashCode();
        }
        return i * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{iv=")).append(Hex.encodeHex(iv)).append(", pairs=").append(pairs).append('}').toString();
    }

    public Pair.encrypted()
    {
        this$0 = AbstractSampleEncryptionBox.this;
        super();
        pairs = new LinkedList();
    }
}
