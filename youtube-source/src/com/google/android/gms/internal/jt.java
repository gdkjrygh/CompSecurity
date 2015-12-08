// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ll, lm, js, jv

public abstract class jt
{

    protected int f;

    public jt()
    {
        f = -1;
    }

    public static final void a(jt jt1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = ll.a(abyte0, 0, j);
            jt1.a(((ll) (abyte0)));
            abyte0.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jt jt1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", jt1);
        }
    }

    public static final jt b(jt jt1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = js.a(abyte0, 0, j);
            jt1.a(abyte0);
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (jt jt1)
        {
            throw jt1;
        }
        // Misplaced declaration of an exception variable
        catch (jt jt1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return jt1;
    }

    public int a()
    {
        f = 0;
        return 0;
    }

    public abstract jt a(js js1);

    public abstract void a(ll ll1);

    public String toString()
    {
        return jv.a(this);
    }
}
