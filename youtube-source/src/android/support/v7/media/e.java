// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;

// Referenced classes of package android.support.v7.media:
//            s

public final class e
{

    private final Bundle a;
    private s b;

    private e(Bundle bundle)
    {
        a = bundle;
    }

    public e(s s1, boolean flag)
    {
        if (s1 == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            a = new Bundle();
            b = s1;
            a.putBundle("selector", s1.d());
            a.putBoolean("activeScan", flag);
            return;
        }
    }

    public static e a(Bundle bundle)
    {
        if (bundle != null)
        {
            return new e(bundle);
        } else
        {
            return null;
        }
    }

    private void e()
    {
        if (b == null)
        {
            b = s.a(a.getBundle("selector"));
            if (b == null)
            {
                b = s.a;
            }
        }
    }

    public final s a()
    {
        e();
        return b;
    }

    public final boolean b()
    {
        return a.getBoolean("activeScan");
    }

    public final boolean c()
    {
        e();
        return b.c();
    }

    public final Bundle d()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof e)
        {
            obj = (e)obj;
            flag = flag1;
            if (a().equals(((e) (obj)).a()))
            {
                flag = flag1;
                if (b() == ((e) (obj)).b())
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int i = a().hashCode();
        boolean flag;
        if (b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag ^ i;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DiscoveryRequest{ selector=").append(a());
        stringbuilder.append(", activeScan=").append(b());
        stringbuilder.append(", isValid=").append(c());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
