// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems.curve25519;


// Referenced classes of package org.whispersystems.curve25519:
//            p, q, N

public class o
{

    public static void a(int ai[], int ai1[])
    {
        boolean flag = true;
        boolean flag1 = p.d;
        int ai2[] = new int[10];
        int ai3[] = new int[10];
        int ai4[] = new int[10];
        q.a(ai2, ai1);
        q.a(ai3, ai2);
        int i = 1;
        do
        {
            if (i >= 2)
            {
                break;
            }
            q.a(ai3, ai3);
            i++;
        } while (!flag1);
        N.a(ai3, ai1, ai3);
        N.a(ai2, ai2, ai3);
        q.a(ai2, ai2);
        N.a(ai2, ai3, ai2);
        q.a(ai3, ai2);
        i = 1;
        do
        {
            if (i >= 5)
            {
                break;
            }
            q.a(ai3, ai3);
            i++;
        } while (!flag1);
        N.a(ai2, ai3, ai2);
        q.a(ai3, ai2);
        i = 1;
        do
        {
            if (i >= 10)
            {
                break;
            }
            q.a(ai3, ai3);
            i++;
        } while (!flag1);
        N.a(ai3, ai3, ai2);
        q.a(ai4, ai3);
        i = 1;
        do
        {
            if (i >= 20)
            {
                break;
            }
            q.a(ai4, ai4);
            i++;
        } while (!flag1);
        N.a(ai3, ai4, ai3);
        q.a(ai3, ai3);
        i = 1;
        do
        {
            if (i >= 10)
            {
                break;
            }
            q.a(ai3, ai3);
            i++;
        } while (!flag1);
        N.a(ai2, ai3, ai2);
        q.a(ai3, ai2);
        i = 1;
        do
        {
            if (i >= 50)
            {
                break;
            }
            q.a(ai3, ai3);
            i++;
        } while (!flag1);
        N.a(ai3, ai3, ai2);
        q.a(ai4, ai3);
        i = 1;
        do
        {
            if (i >= 100)
            {
                break;
            }
            q.a(ai4, ai4);
            i++;
        } while (!flag1);
        N.a(ai3, ai4, ai3);
        q.a(ai3, ai3);
        i = 1;
        do
        {
            if (i >= 50)
            {
                break;
            }
            q.a(ai3, ai3);
            i++;
        } while (!flag1);
        N.a(ai2, ai3, ai2);
        q.a(ai2, ai2);
        i = ((flag) ? 1 : 0);
        do
        {
            if (i >= 2)
            {
                break;
            }
            q.a(ai2, ai2);
            i++;
        } while (!flag1);
        N.a(ai, ai2, ai1);
    }
}
