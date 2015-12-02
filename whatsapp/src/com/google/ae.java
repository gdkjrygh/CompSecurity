// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;

// Referenced classes of package com.google:
//            aB, bp, ds, ez, 
//            eL, z

class ae extends aB
{

    final ds b;

    ae(ds ds1)
    {
        b = ds1;
        super();
    }

    public ds a(eL el, z z)
    {
        ez ez1 = ds.b(ds.a(b));
        try
        {
            ez1.a(el, z);
        }
        // Misplaced declaration of an exception variable
        catch (eL el)
        {
            throw el.a(ez1.b());
        }
        // Misplaced declaration of an exception variable
        catch (eL el)
        {
            throw (new bp(el.getMessage())).a(ez1.b());
        }
        return ez1.b();
    }

    public Object a(eL el, z z)
    {
        return a(el, z);
    }
}
