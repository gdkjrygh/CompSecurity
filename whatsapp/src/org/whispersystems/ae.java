// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;


// Referenced classes of package org.whispersystems:
//            bs, a0

public class ae
{

    private final a0 a;

    public ae(a0 a0_1)
    {
        a = a0_1;
    }

    public ae(byte abyte0[], int i)
    {
        a = bs.a(abyte0, i);
    }

    public a0 a()
    {
        return a;
    }

    public byte[] b()
    {
        return a.a();
    }

    public boolean equals(Object obj)
    {
        while (obj == null || !(obj instanceof ae)) 
        {
            return false;
        }
        return a.equals(((ae)obj).a());
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
