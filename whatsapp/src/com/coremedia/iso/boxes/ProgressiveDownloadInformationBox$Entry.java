// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes;


// Referenced classes of package com.coremedia.iso.boxes:
//            ProgressiveDownloadInformationBox

public static class initialDelay
{

    long initialDelay;
    long rate;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (initialDelay)obj;
            if (initialDelay != ((initialDelay) (obj)).initialDelay)
            {
                return false;
            }
            if (rate != ((rate) (obj)).rate)
            {
                return false;
            }
        }
        return true;
    }

    public long getInitialDelay()
    {
        return initialDelay;
    }

    public long getRate()
    {
        return rate;
    }

    public int hashCode()
    {
        return (int)(rate ^ rate >>> 32) * 31 + (int)(initialDelay ^ initialDelay >>> 32);
    }

    public void setInitialDelay(long l)
    {
        initialDelay = l;
    }

    public void setRate(long l)
    {
        rate = l;
    }

    public String toString()
    {
        return (new StringBuilder("Entry{rate=")).append(rate).append(", initialDelay=").append(initialDelay).append('}').toString();
    }

    public (long l, long l1)
    {
        rate = l;
        initialDelay = l1;
    }
}
