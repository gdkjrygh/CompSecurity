// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.util;

import ch.boye.httpclientandroidlib.protocol.HTTP;
import java.io.Serializable;

// Referenced classes of package ch.boye.httpclientandroidlib.util:
//            ByteArrayBuffer

public final class CharArrayBuffer
    implements Serializable
{

    private static final long serialVersionUID = 0xa9d55e649986df41L;
    private char buffer[];
    private int len;

    public CharArrayBuffer(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Buffer capacity may not be negative");
        } else
        {
            buffer = new char[i];
            return;
        }
    }

    private void expand(int i)
    {
        char ac[] = new char[Math.max(buffer.length << 1, i)];
        System.arraycopy(buffer, 0, ac, 0, len);
        buffer = ac;
    }

    public void append(char c)
    {
        int i = len + 1;
        if (i > buffer.length)
        {
            expand(i);
        }
        buffer[len] = c;
        len = i;
    }

    public void append(ByteArrayBuffer bytearraybuffer, int i, int j)
    {
        if (bytearraybuffer == null)
        {
            return;
        } else
        {
            append(bytearraybuffer.buffer(), i, j);
            return;
        }
    }

    public void append(CharArrayBuffer chararraybuffer)
    {
        if (chararraybuffer == null)
        {
            return;
        } else
        {
            append(chararraybuffer.buffer, 0, chararraybuffer.len);
            return;
        }
    }

    public void append(CharArrayBuffer chararraybuffer, int i, int j)
    {
        if (chararraybuffer == null)
        {
            return;
        } else
        {
            append(chararraybuffer.buffer, i, j);
            return;
        }
    }

    public void append(Object obj)
    {
        append(String.valueOf(obj));
    }

    public void append(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "null";
        }
        int i = s1.length();
        int j = len + i;
        if (j > buffer.length)
        {
            expand(j);
        }
        s1.getChars(0, i, buffer, len);
        len = j;
    }

    public void append(byte abyte0[], int i, int j)
    {
        if (abyte0 != null)
        {
            if (i < 0 || i > abyte0.length || j < 0 || i + j < 0 || i + j > abyte0.length)
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("off: ").append(i).append(" len: ").append(j).append(" b.length: ").append(abyte0.length).toString());
            }
            if (j != 0)
            {
                int k = len;
                int l = k + j;
                if (l > buffer.length)
                {
                    expand(l);
                }
                for (j = k; j < l; j++)
                {
                    buffer[j] = (char)(abyte0[i] & 0xff);
                    i++;
                }

                len = l;
                return;
            }
        }
    }

    public void append(char ac[], int i, int j)
    {
        if (ac != null)
        {
            if (i < 0 || i > ac.length || j < 0 || i + j < 0 || i + j > ac.length)
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append("off: ").append(i).append(" len: ").append(j).append(" b.length: ").append(ac.length).toString());
            }
            if (j != 0)
            {
                int k = len + j;
                if (k > buffer.length)
                {
                    expand(k);
                }
                System.arraycopy(ac, i, buffer, len, j);
                len = k;
                return;
            }
        }
    }

    public char[] buffer()
    {
        return buffer;
    }

    public int capacity()
    {
        return buffer.length;
    }

    public char charAt(int i)
    {
        return buffer[i];
    }

    public void clear()
    {
        len = 0;
    }

    public void ensureCapacity(int i)
    {
        while (i <= 0 || i <= buffer.length - len) 
        {
            return;
        }
        expand(len + i);
    }

    public int indexOf(int i)
    {
        return indexOf(i, 0, len);
    }

    public int indexOf(int i, int j, int k)
    {
        int l;
        int i1;
        l = j;
        if (j < 0)
        {
            l = 0;
        }
        i1 = k;
        if (k > len)
        {
            i1 = len;
        }
        if (l <= i1) goto _L2; else goto _L1
_L1:
        k = -1;
_L4:
        return k;
_L2:
        j = l;
label0:
        do
        {
label1:
            {
                if (j >= i1)
                {
                    break label1;
                }
                k = j;
                if (buffer[j] == i)
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public boolean isEmpty()
    {
        return len == 0;
    }

    public boolean isFull()
    {
        return len == buffer.length;
    }

    public int length()
    {
        return len;
    }

    public void setLength(int i)
    {
        if (i < 0 || i > buffer.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("len: ").append(i).append(" < 0 or > buffer len: ").append(buffer.length).toString());
        } else
        {
            len = i;
            return;
        }
    }

    public String substring(int i, int j)
    {
        return new String(buffer, i, j - i);
    }

    public String substringTrimmed(int i, int j)
    {
        if (i < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Negative beginIndex: ").append(i).toString());
        }
        if (j > len)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("endIndex: ").append(j).append(" > length: ").append(len).toString());
        }
        int k = i;
        if (i > j)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("beginIndex: ").append(i).append(" > endIndex: ").append(j).toString());
        }
        do
        {
            i = j;
            if (k >= j)
            {
                break;
            }
            i = j;
            if (!HTTP.isWhitespace(buffer[k]))
            {
                break;
            }
            k++;
        } while (true);
        for (; i > k && HTTP.isWhitespace(buffer[i - 1]); i--) { }
        return new String(buffer, k, i - k);
    }

    public char[] toCharArray()
    {
        char ac[] = new char[len];
        if (len > 0)
        {
            System.arraycopy(buffer, 0, ac, 0, len);
        }
        return ac;
    }

    public String toString()
    {
        return new String(buffer, 0, len);
    }
}
