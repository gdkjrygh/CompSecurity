// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;
import java.io.Reader;

class k extends BufferedReader
{

    private long a;

    public k(Reader reader)
    {
        super(reader);
    }

    public String readLine()
    {
        long l = System.currentTimeMillis();
        String s = super.readLine();
        a = (System.currentTimeMillis() - l) + a;
        return s;
    }
}
