// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            InStoreSearchResult

public static final class 
{

    private String aisle[];
    public aisle detailed[];

    public void setAisle(String as[])
    {
        if (as != null)
        {
            String as1[] = new String[as.length];
            for (int i = 0; i < as1.length; i++)
            {
                as1[i] = as[i].replace(".", "");
            }

            aisle = as1;
        }
    }


    public ()
    {
    }
}
