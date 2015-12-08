// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.a;

import java.io.InputStream;
import org.a.c.a.a.a;

// Referenced classes of package org.a.c.b.a:
//            a, c

public class b extends org.a.c.a.b
    implements org.a.c.b.a.a
{

    public b()
    {
        a();
    }

    public final void a(a a1, c c1)
    {
        a a2 = null;
        a1 = a1.a();
        a2 = a1;
        a(((InputStream) (a1)), e, "Not a Valid JPEG File: doesn't begin with 0xffd8");
        a2 = a1;
        int i = b();
_L8:
        a2 = a1;
        byte abyte0[] = a("markerBytes", 2, ((InputStream) (a1)), "markerBytes");
        a2 = a1;
        int j = c("marker", abyte0, i);
        if (j != 65497 && j != 65498) goto _L2; else goto _L1
_L1:
        a2 = a1;
        boolean flag = c1.a();
        if (flag) goto _L4; else goto _L3
_L3:
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        a1.close();
_L6:
        return;
        a1;
        org.a.c.c.a.a(a1);
        return;
_L4:
        a2 = a1;
        flag = c1.a(abyte0, a1);
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (a1 == null || i == 0) goto _L6; else goto _L5
_L5:
        try
        {
            a1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            org.a.c.c.a.a(a1);
        }
        return;
_L2:
        a2 = a1;
        byte abyte1[] = a("segmentLengthBytes", 2, ((InputStream) (a1)), "segmentLengthBytes");
        a2 = a1;
        flag = c1.a(j, abyte0, abyte1, a("Segment Data", c("segmentLength", abyte1, i) - 2, ((InputStream) (a1)), "Invalid Segment: insufficient data"));
        if (flag) goto _L8; else goto _L7
_L7:
        if (a1 == null) goto _L6; else goto _L9
_L9:
        try
        {
            a1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            org.a.c.c.a.a(a1);
        }
        return;
        a1;
        if (a2 != null)
        {
            try
            {
                a2.close();
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                org.a.c.c.a.a(c1);
            }
        }
        throw a1;
    }
}
