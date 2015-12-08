// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;


public final class Size
{

    private final int zznP;
    private final int zznQ;

    public Size(int i, int j)
    {
        zznP = i;
        zznQ = j;
    }

    public static Size parseSize(String s)
        throws NumberFormatException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("string must not be null");
        }
        int j = s.indexOf('*');
        int i = j;
        if (j < 0)
        {
            i = s.indexOf('x');
        }
        if (i < 0)
        {
            throw zzcg(s);
        }
        Size size;
        try
        {
            size = new Size(Integer.parseInt(s.substring(0, i)), Integer.parseInt(s.substring(i + 1)));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw zzcg(s);
        }
        return size;
    }

    private static NumberFormatException zzcg(String s)
    {
        throw new NumberFormatException((new StringBuilder()).append("Invalid Size: \"").append(s).append("\"").toString());
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (obj != null)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj instanceof Size)
            {
                obj = (Size)obj;
                if (zznP != ((Size) (obj)).zznP || zznQ != ((Size) (obj)).zznQ)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    public int getHeight()
    {
        return zznQ;
    }

    public int getWidth()
    {
        return zznP;
    }

    public int hashCode()
    {
        return zznQ ^ (zznP << 16 | zznP >>> 16);
    }

    public String toString()
    {
        return (new StringBuilder()).append(zznP).append("x").append(zznQ).toString();
    }
}
