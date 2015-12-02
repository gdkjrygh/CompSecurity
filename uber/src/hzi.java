// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class hzi
    implements Serializable
{

    static final char a[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    public static final hzi b = a(new byte[0]);
    private static final long serialVersionUID = 1L;
    final byte c[];
    transient int d;
    transient String e;

    hzi(byte abyte0[])
    {
        c = abyte0;
    }

    private static hzi a(InputStream inputstream, int i)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("in == null");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("byteCount < 0: ")).append(i).toString());
        }
        byte abyte0[] = new byte[i];
        int k;
        for (int j = 0; j < i; j += k)
        {
            k = inputstream.read(abyte0, j, i - j);
            if (k == -1)
            {
                throw new EOFException();
            }
        }

        return new hzi(abyte0);
    }

    public static hzi a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("s == null");
        } else
        {
            hzi hzi1 = new hzi(s.getBytes(hzy.a));
            hzi1.e = s;
            return hzi1;
        }
    }

    public static transient hzi a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("data == null");
        } else
        {
            return new hzi((byte[])abyte0.clone());
        }
    }

    public static hzi b(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("base64 == null");
        }
        s = hze.a(s);
        if (s != null)
        {
            return new hzi(s);
        } else
        {
            return null;
        }
    }

    private hzi c(String s)
    {
        try
        {
            s = a(MessageDigest.getInstance(s).digest(c));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError(s);
        }
        return s;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream = a(objectinputstream, objectinputstream.readInt());
        try
        {
            Field field = hzi.getDeclaredField("c");
            field.setAccessible(true);
            field.set(this, ((hzi) (objectinputstream)).c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw new AssertionError();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeInt(c.length);
        objectoutputstream.write(c);
    }

    public byte a(int i)
    {
        return c[i];
    }

    public String a()
    {
        String s = e;
        if (s != null)
        {
            return s;
        } else
        {
            String s1 = new String(c, hzy.a);
            e = s1;
            return s1;
        }
    }

    void a(hzf hzf1)
    {
        hzf1.b(c, 0, c.length);
    }

    public boolean a(int i, hzi hzi1, int j, int k)
    {
        return hzi1.a(0, c, 0, k);
    }

    public boolean a(int i, byte abyte0[], int j, int k)
    {
        return i <= c.length - k && j <= abyte0.length - k && hzy.a(c, i, abyte0, j, k);
    }

    public String b()
    {
        return hze.a(c);
    }

    public hzi c()
    {
        return c("MD5");
    }

    public String d()
    {
        int i = 0;
        char ac[] = new char[c.length * 2];
        byte abyte0[] = c;
        int k = abyte0.length;
        int j = 0;
        for (; i < k; i++)
        {
            byte byte0 = abyte0[i];
            int l = j + 1;
            ac[j] = a[byte0 >> 4 & 0xf];
            j = l + 1;
            ac[l] = a[byte0 & 0xf];
        }

        return new String(ac);
    }

    public hzi e()
    {
        int i = 0;
        do
        {
label0:
            {
                Object obj = this;
                if (i < c.length)
                {
                    byte byte0 = c[i];
                    if (byte0 < 65 || byte0 > 90)
                    {
                        break label0;
                    }
                    obj = (byte[])c.clone();
                    obj[i] = (byte)(byte0 + 32);
                    for (i++; i < obj.length; i++)
                    {
                        byte byte1 = obj[i];
                        if (byte1 >= 65 && byte1 <= 90)
                        {
                            obj[i] = (byte)(byte1 + 32);
                        }
                    }

                    obj = new hzi(((byte []) (obj)));
                }
                return ((hzi) (obj));
            }
            i++;
        } while (true);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        return (obj instanceof hzi) && ((hzi)obj).f() == c.length && ((hzi)obj).a(0, c, 0, c.length);
    }

    public int f()
    {
        return c.length;
    }

    public byte[] g()
    {
        return (byte[])c.clone();
    }

    public int hashCode()
    {
        int i = d;
        if (i != 0)
        {
            return i;
        } else
        {
            int j = Arrays.hashCode(c);
            d = j;
            return j;
        }
    }

    public String toString()
    {
        if (c.length == 0)
        {
            return "ByteString[size=0]";
        }
        if (c.length <= 16)
        {
            return String.format("ByteString[size=%s data=%s]", new Object[] {
                Integer.valueOf(c.length), d()
            });
        } else
        {
            return String.format("ByteString[size=%s md5=%s]", new Object[] {
                Integer.valueOf(c.length), c().d()
            });
        }
    }

}
