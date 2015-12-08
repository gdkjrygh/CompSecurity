// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.kobjects.pim;


// Referenced classes of package org.kobjects.pim:
//            PimItem

public class VCard extends PimItem
{

    public VCard()
    {
    }

    public VCard(VCard vcard)
    {
        super(vcard);
    }

    public int getArraySize(String s)
    {
        if (s.equals("n"))
        {
            return 5;
        }
        return !s.equals("adr") ? -1 : 6;
    }

    public String getType()
    {
        return "vcard";
    }
}
