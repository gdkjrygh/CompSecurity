// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            DEROutputStream, DLOutputStream, ASN1Primitive, ASN1Encodable

public class ASN1OutputStream
{

    private OutputStream os;

    public ASN1OutputStream(OutputStream outputstream)
    {
        os = outputstream;
    }

    public void close()
    {
        os.close();
    }

    public void flush()
    {
        os.flush();
    }

    ASN1OutputStream getDERSubStream()
    {
        return new DEROutputStream(os);
    }

    ASN1OutputStream getDLSubStream()
    {
        return new DLOutputStream(os);
    }

    void write(int i)
    {
        os.write(i);
    }

    void write(byte abyte0[])
    {
        os.write(abyte0);
    }

    void write(byte abyte0[], int i, int j)
    {
        os.write(abyte0, i, j);
    }

    void writeEncoded(int i, int j, byte abyte0[])
    {
        writeTag(i, j);
        writeLength(abyte0.length);
        write(abyte0);
    }

    void writeEncoded(int i, byte abyte0[])
    {
        write(i);
        writeLength(abyte0.length);
        write(abyte0);
    }

    void writeImplicitObject(ASN1Primitive asn1primitive)
    {
        if (asn1primitive != null)
        {
            asn1primitive.encode(new ImplicitOutputStream(os));
            return;
        } else
        {
            throw new IOException("null object detected");
        }
    }

    void writeLength(int i)
    {
        if (i > 127)
        {
            int j = 1;
            int k = i;
            do
            {
                k >>>= 8;
                if (k == 0)
                {
                    break;
                }
                j++;
            } while (true);
            write((byte)(j | 0x80));
            for (j = (j - 1) * 8; j >= 0; j -= 8)
            {
                write((byte)(i >> j));
            }

        } else
        {
            write((byte)i);
        }
    }

    protected void writeNull()
    {
        os.write(5);
        os.write(0);
    }

    public void writeObject(ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodable.toASN1Primitive().encode(this);
            return;
        } else
        {
            throw new IOException("null object detected");
        }
    }

    void writeTag(int i, int j)
    {
        if (j < 31)
        {
            write(i | j);
            return;
        }
        write(i | 0x1f);
        if (j < 128)
        {
            write(j);
            return;
        }
        byte abyte0[] = new byte[5];
        i = abyte0.length - 1;
        abyte0[i] = (byte)(j & 0x7f);
        int k;
        int l;
        do
        {
            k = j >> 7;
            l = i - 1;
            abyte0[l] = (byte)(k & 0x7f | 0x80);
            i = l;
            j = k;
        } while (k > 127);
        write(abyte0, l, abyte0.length - l);
    }

    private class ImplicitOutputStream extends ASN1OutputStream
    {

        private boolean first;
        final ASN1OutputStream this$0;

        public void write(int i)
        {
            if (first)
            {
                first = false;
                return;
            } else
            {
                write(i);
                return;
            }
        }

        public ImplicitOutputStream(OutputStream outputstream)
        {
            this$0 = ASN1OutputStream.this;
            super(outputstream);
            first = true;
        }
    }

}
