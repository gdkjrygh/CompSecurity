// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


public class cs
{

    public String a;
    public int b;

    public cs(String s, int i)
    {
        if (s == null || i != 1 && i != 2 && i != 3 && i != 4)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        } else
        {
            a = s;
            b = i;
            return;
        }
    }
}
