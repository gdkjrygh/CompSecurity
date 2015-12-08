// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import java.io.Serializable;

public class b
{
    public static class a
        implements Serializable
    {

        a()
        {
        }
    }


    public static final a a = new a();

    public static boolean a(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public String toString()
    {
        return super.toString();
    }

}
