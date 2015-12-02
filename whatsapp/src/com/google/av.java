// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;

// Referenced classes of package com.google:
//            aB, bp, bR, fz, 
//            eL, z

public final class av extends aB
{

    public av()
    {
    }

    public bR a(eL el, z z)
    {
        z = bR.a();
        try
        {
            z.a(el);
        }
        // Misplaced declaration of an exception variable
        catch (eL el)
        {
            throw el.a(z.b());
        }
        // Misplaced declaration of an exception variable
        catch (eL el)
        {
            throw (new bp(el.getMessage())).a(z.b());
        }
        return z.b();
    }

    public Object a(eL el, z z)
    {
        return a(el, z);
    }
}
