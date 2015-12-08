// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;


public final class a
{

    public static int a(int i)
    {
label0:
        {
            int j = i;
            switch (i)
            {
            default:
                if (!b(i))
                {
                    break label0;
                }
                j = 99;
                break;

            case -2: 
            case -1: 
            case 0: // '\0'
            case 1: // '\001'
                break;
            }
            return j;
        }
        return -3;
    }

    public static boolean b(int i)
    {
        return i > 0;
    }

    public static boolean c(int i)
    {
        return i < 0;
    }
}
