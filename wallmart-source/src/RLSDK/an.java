// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Vector;

// Referenced classes of package RLSDK:
//            ao

public final class an
{

    public static void a(Vector vector, ao ao1)
    {
        int k = vector.size();
        for (int i = 1; i < k; i++)
        {
            Object obj = vector.elementAt(i);
            int j = i - 1;
            do
            {
                if (j < 0)
                {
                    break;
                }
                Object obj1 = vector.elementAt(j);
                if (ao1.a(obj1, obj) <= 0)
                {
                    break;
                }
                vector.setElementAt(obj1, j + 1);
                j--;
            } while (true);
            vector.setElementAt(obj, j + 1);
        }

    }
}
