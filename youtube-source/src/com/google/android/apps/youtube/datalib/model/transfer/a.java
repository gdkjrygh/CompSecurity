// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.model.transfer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class a
{

    private final Map a;

    public a()
    {
        a = new HashMap();
    }

    public a(byte abyte0[])
    {
        a = new HashMap();
        a(abyte0);
    }

    private void a(byte abyte0[])
    {
        String s;
        int i;
        byte byte0;
        int k;
        try
        {
            a.clear();
            abyte0 = new DataInputStream(new ByteArrayInputStream(abyte0));
            k = abyte0.readInt();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        i = 0;
_L27:
        if (i >= k) goto _L2; else goto _L1
_L1:
        s = abyte0.readUTF();
        byte0 = abyte0.readByte();
        byte0;
        JVM INSTR tableswitch 1 10: default 529
    //                   1 143
    //                   2 161
    //                   3 215
    //                   4 236
    //                   5 289
    //                   6 310
    //                   7 363
    //                   8 384
    //                   9 437
    //                   10 458;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L3:
        throw new RuntimeException((new StringBuilder("Couldn't read extra of type: ")).append(byte0).toString());
_L4:
        a.put(s, abyte0.readUTF());
          goto _L14
_L5:
        Object aobj[];
        int l;
        l = abyte0.readInt();
        aobj = new String[l];
        int j = 0;
_L16:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[j] = abyte0.readUTF();
        j++;
        if (true) goto _L16; else goto _L15
_L15:
        a.put(s, ((Object) (aobj)));
          goto _L14
_L6:
        a.put(s, Long.valueOf(abyte0.readLong()));
          goto _L14
_L7:
        l = abyte0.readInt();
        aobj = new long[l];
        j = 0;
_L18:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[j] = abyte0.readLong();
        j++;
        if (true) goto _L18; else goto _L17
_L17:
        a.put(s, ((Object) (aobj)));
          goto _L14
_L8:
        a.put(s, Integer.valueOf(abyte0.readInt()));
          goto _L14
_L9:
        l = abyte0.readInt();
        aobj = new int[l];
        j = 0;
_L20:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[j] = abyte0.readInt();
        j++;
        if (true) goto _L20; else goto _L19
_L19:
        a.put(s, ((Object) (aobj)));
          goto _L14
_L10:
        a.put(s, Boolean.valueOf(abyte0.readBoolean()));
          goto _L14
_L11:
        l = abyte0.readInt();
        aobj = new boolean[l];
        j = 0;
_L22:
        if (j >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj[j] = abyte0.readBoolean();
        j++;
        if (true) goto _L22; else goto _L21
_L21:
        a.put(s, ((Object) (aobj)));
          goto _L14
_L12:
        a.put(s, Byte.valueOf(abyte0.readByte()));
          goto _L14
_L13:
        l = abyte0.readInt();
        aobj = new byte[l];
        j = 0;
_L28:
        if (j >= l) goto _L24; else goto _L23
_L23:
        int i1 = abyte0.read(((byte []) (aobj)), j, l - j);
        if (i1 != -1) goto _L26; else goto _L25
_L25:
        throw new IOException("Unexpected end of stream");
_L24:
        a.put(s, ((Object) (aobj)));
          goto _L14
_L2:
        abyte0.close();
        return;
_L14:
        i++;
          goto _L27
_L26:
        j += i1;
          goto _L28
    }

    public final void a(String s, int i)
    {
        a.put(s, Integer.valueOf(i));
    }

    public final void a(String s, long l)
    {
        a.put(s, Long.valueOf(l));
    }

    public final void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public final void a(String s, boolean flag)
    {
        a.put(s, Boolean.valueOf(flag));
    }

    public final void a(String s, byte abyte0[])
    {
        a.put(s, abyte0);
    }

    public final boolean a(String s)
    {
        return a.containsKey(s);
    }

    public final byte[] a()
    {
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        Iterator iterator;
        bytearrayoutputstream = new ByteArrayOutputStream();
        obj = new DataOutputStream(bytearrayoutputstream);
        ((DataOutputStream) (obj)).writeInt(a.size());
        iterator = a.entrySet().iterator();
_L3:
        Object obj1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_500;
        }
        obj1 = (java.util.Map.Entry)iterator.next();
        ((DataOutputStream) (obj)).writeUTF((String)((java.util.Map.Entry) (obj1)).getKey());
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        if (!(obj1 instanceof String)) goto _L2; else goto _L1
_L1:
        ((DataOutputStream) (obj)).writeByte(1);
        ((DataOutputStream) (obj)).writeUTF((String)obj1);
          goto _L3
_L2:
        if (!(obj1 instanceof String[]))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        ((DataOutputStream) (obj)).writeByte(2);
        obj1 = (String[])obj1;
        ((DataOutputStream) (obj)).writeInt(obj1.length);
        int i = 0;
_L5:
        if (i >= obj1.length) goto _L3; else goto _L4
_L4:
        ((DataOutputStream) (obj)).writeUTF(obj1[i]);
        i++;
          goto _L5
label0:
        {
            if (!(obj1 instanceof Long))
            {
                break label0;
            }
            ((DataOutputStream) (obj)).writeByte(3);
            ((DataOutputStream) (obj)).writeLong(((Long)obj1).longValue());
        }
          goto _L3
        if (!(obj1 instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_263;
        }
        ((DataOutputStream) (obj)).writeByte(4);
        obj1 = (long[])obj1;
        ((DataOutputStream) (obj)).writeInt(obj1.length);
        i = 0;
_L7:
        if (i >= obj1.length) goto _L3; else goto _L6
_L6:
        ((DataOutputStream) (obj)).writeLong(obj1[i]);
        i++;
          goto _L7
label1:
        {
            if (!(obj1 instanceof Integer))
            {
                break label1;
            }
            ((DataOutputStream) (obj)).writeByte(5);
            ((DataOutputStream) (obj)).writeInt(((Integer)obj1).intValue());
        }
          goto _L3
        if (!(obj1 instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_348;
        }
        ((DataOutputStream) (obj)).writeByte(6);
        obj1 = (int[])obj1;
        ((DataOutputStream) (obj)).writeInt(obj1.length);
        i = 0;
_L9:
        if (i >= obj1.length) goto _L3; else goto _L8
_L8:
        ((DataOutputStream) (obj)).writeInt(obj1[i]);
        i++;
          goto _L9
label2:
        {
            if (!(obj1 instanceof Boolean))
            {
                break label2;
            }
            ((DataOutputStream) (obj)).writeByte(7);
            ((DataOutputStream) (obj)).writeBoolean(((Boolean)obj1).booleanValue());
        }
          goto _L3
        if (!(obj1 instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_434;
        }
        ((DataOutputStream) (obj)).writeByte(8);
        obj1 = (boolean[])obj1;
        ((DataOutputStream) (obj)).writeInt(obj1.length);
        i = 0;
_L11:
        if (i >= obj1.length) goto _L3; else goto _L10
_L10:
        ((DataOutputStream) (obj)).writeBoolean(obj1[i]);
        i++;
          goto _L11
        if (!(obj1 instanceof Byte)) goto _L13; else goto _L12
_L12:
        ((DataOutputStream) (obj)).writeByte(9);
        ((DataOutputStream) (obj)).writeByte(((Byte)obj1).byteValue());
          goto _L3
_L13:
        if (!(obj1 instanceof byte[])) goto _L3; else goto _L14
_L14:
        ((DataOutputStream) (obj)).writeByte(10);
        byte abyte1[] = (byte[])obj1;
        ((DataOutputStream) (obj)).writeInt(abyte1.length);
        ((DataOutputStream) (obj)).write(abyte1);
          goto _L3
        byte abyte0[];
        try
        {
            ((DataOutputStream) (obj)).flush();
            bytearrayoutputstream.flush();
            abyte0 = bytearrayoutputstream.toByteArray();
            ((DataOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        return abyte0;
    }

    public final int b(String s, int i)
    {
        if (a.containsKey(s))
        {
            return ((Integer)a.get(s)).intValue();
        } else
        {
            return 0;
        }
    }

    public final long b(String s, long l)
    {
        if (a.containsKey(s))
        {
            l = ((Long)a.get(s)).longValue();
        }
        return l;
    }

    public final String b(String s)
    {
        if (a.containsKey(s))
        {
            return (String)a.get(s);
        } else
        {
            return null;
        }
    }

    public final boolean b(String s, boolean flag)
    {
        if (a.containsKey(s))
        {
            flag = ((Boolean)a.get(s)).booleanValue();
        }
        return flag;
    }

    public final byte[] c(String s)
    {
        if (a.containsKey(s))
        {
            return (byte[])a.get(s);
        } else
        {
            return null;
        }
    }
}
