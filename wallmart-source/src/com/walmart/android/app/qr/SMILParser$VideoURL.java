// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;


// Referenced classes of package com.walmart.android.app.qr:
//            SMILParser

private static class <init>
    implements Comparable
{

    private Integer bitRate;
    private String url;

    public int compareTo(<init> <init>1)
    {
        return bitRate.compareTo(<init>1.bitRate);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append(bitRate).append(", ").append(url).toString();
    }



    private (int i, String s)
    {
        bitRate = Integer.valueOf(i);
        url = s;
    }

    url(int i, String s, url url1)
    {
        this(i, s);
    }
}
