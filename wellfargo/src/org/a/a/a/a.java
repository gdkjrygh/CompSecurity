// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;


public class a
{

    static boolean a(CharSequence charsequence, boolean flag, int i, CharSequence charsequence1, int j, int k)
    {
        if ((charsequence instanceof String) && (charsequence1 instanceof String))
        {
            return ((String)charsequence).regionMatches(flag, i, (String)charsequence1, j, k);
        } else
        {
            return charsequence.toString().regionMatches(flag, i, charsequence1.toString(), j, k);
        }
    }
}
