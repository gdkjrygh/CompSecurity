// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

class ezb
{

    List a;

    ezb()
    {
    }

    static ezb a(List list)
    {
        ezb ezb1 = new ezb();
        ezb1.a = list;
        return ezb1;
    }

    public String toString()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a.toString();
        }
    }
}
