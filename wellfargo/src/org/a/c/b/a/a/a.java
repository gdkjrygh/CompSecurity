// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.a.a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.a.c.a.b;
import org.a.c.b.b.c.c;
import org.a.c.b.b.c.g;
import org.a.c.b.b.c.m;

// Referenced classes of package org.a.c.b.a.a:
//            c, d, g, f, 
//            b, h

public class a extends b
    implements org.a.c.b.a.a
{

    public a()
    {
        a();
    }

    private void a(OutputStream outputstream, List list, byte abyte0[])
    {
        int k;
        int l;
        k = 0;
        l = b();
        outputstream.write(e);
        boolean flag;
        int j;
        j = 0;
        flag = false;
_L6:
        if (j < list.size()) goto _L2; else goto _L1
_L1:
        if (flag || abyte0 == null) goto _L4; else goto _L3
_L3:
        byte abyte1[];
        abyte1 = a(65505, l);
        if (abyte0.length > 65535)
        {
            throw new org.a.c.b.a.a.c((new StringBuilder("APP1 Segment is too long: ")).append(abyte0.length).toString());
        }
          goto _L5
        list;
        byte abyte2[];
        int i;
        try
        {
            outputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            org.a.c.c.a.a(outputstream);
        }
        throw list;
_L5:
        abyte2 = a(abyte0.length + 2, l);
        i = ((f)list.get(0)).a;
        list.add(0, new org.a.c.b.a.a.g(65505, abyte1, abyte2, abyte0));
          goto _L4
_L7:
        k = list.size();
        if (j >= k)
        {
            try
            {
                outputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                org.a.c.c.a.a(outputstream);
            }
            break MISSING_BLOCK_LABEL_310;
        }
        abyte1 = (d)list.get(j);
        if (!(abyte1 instanceof org.a.c.b.a.a.g))
        {
            break MISSING_BLOCK_LABEL_288;
        }
        if (i)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        abyte1 = a(65505, l);
        if (abyte0.length > 65535)
        {
            throw new org.a.c.b.a.a.c((new StringBuilder("APP1 Segment is too long: ")).append(abyte0.length).toString());
        }
        abyte2 = a(abyte0.length + 2, l);
        outputstream.write(abyte1);
        outputstream.write(abyte2);
        outputstream.write(abyte0);
        i = 1;
        break MISSING_BLOCK_LABEL_336;
        abyte1.a(outputstream);
        break MISSING_BLOCK_LABEL_336;
        return;
        i = 1;
        break MISSING_BLOCK_LABEL_336;
_L2:
        if ((d)list.get(j) instanceof org.a.c.b.a.a.g)
        {
            flag = true;
        }
        j++;
          goto _L6
_L4:
        i = 0;
        j = k;
          goto _L7
        j++;
          goto _L7
    }

    public final void a(byte abyte0[], OutputStream outputstream, m m1)
    {
        abyte0 = new org.a.c.a.a.b(abyte0);
        Object obj = new ArrayList();
        Object obj1 = new ArrayList();
        org.a.c.b.a.a.b b1 = new org.a.c.b.a.a.b(this, ((ArrayList) (obj)), ((List) (obj1)));
        (new org.a.c.b.a.b()).a(abyte0, b1);
        abyte0 = new h(((List) (obj)), ((List) (obj1)));
        obj = ((h) (abyte0)).a;
        if (((h) (abyte0)).b.size() > 0)
        {
            abyte0 = a("trimmed exif bytes", ((f)((h) (abyte0)).b.get(0)).d);
            abyte0 = new c(m1.a, abyte0);
        } else
        {
            abyte0 = new g(m1.a);
        }
        obj1 = new ByteArrayOutputStream();
        ((ByteArrayOutputStream) (obj1)).write(c);
        ((ByteArrayOutputStream) (obj1)).write(0);
        ((ByteArrayOutputStream) (obj1)).write(0);
        abyte0.a(((OutputStream) (obj1)), m1);
        a(outputstream, ((List) (obj)), ((ByteArrayOutputStream) (obj1)).toByteArray());
    }
}
