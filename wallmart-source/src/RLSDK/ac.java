// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

public final class ac
{

    public static final ac a = new ac("OTHER");
    public static final ac b = new ac("ORIENTATION");
    public static final ac c = new ac("BYTE_SEGMENTS");
    public static final ac d = new ac("ERROR_CORRECTION_LEVEL");
    public static final ac e = new ac("ISSUE_NUMBER");
    public static final ac f = new ac("SUGGESTED_PRICE");
    public static final ac g = new ac("POSSIBLE_COUNTRY");
    private static final Hashtable h = new Hashtable();
    private final String i;

    private ac(String s)
    {
        i = s;
        h.put(s, this);
    }

    public final String toString()
    {
        return i;
    }

}
