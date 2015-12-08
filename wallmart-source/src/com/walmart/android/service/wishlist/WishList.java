// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.wishlist;

import android.content.Context;
import android.text.TextUtils;
import com.walmartlabs.utils.WordUtils;
import java.lang.annotation.Annotation;

public class WishList
{
    public static interface ListAccess
        extends Annotation
    {
    }

    public static class Registrant
    {

        public String firstName;
        public String lastName;

        public Registrant()
        {
            firstName = "";
            lastName = "";
        }
    }


    public static final String ACCESS_PRIVATE = "private";
    public static final String ACCESS_PUBLIC = "public";
    public String access;
    public String barCode;
    public Registrant coRegistrant;
    public String id;
    public long modifiedDate;
    public String name;
    public Registrant registrant;
    public String state;
    public String type;

    public WishList()
    {
        registrant = new Registrant();
        coRegistrant = new Registrant();
    }

    public WishList(WishList wishlist)
    {
        registrant = new Registrant();
        coRegistrant = new Registrant();
        id = wishlist.id;
        name = wishlist.name;
        access = wishlist.access;
        registrant.firstName = wishlist.registrant.firstName;
        registrant.lastName = wishlist.registrant.lastName;
        state = wishlist.state;
        coRegistrant.firstName = wishlist.coRegistrant.firstName;
        coRegistrant.lastName = wishlist.coRegistrant.lastName;
        modifiedDate = wishlist.modifiedDate;
    }

    public String getListOwners(Context context)
    {
        StringBuilder stringbuilder;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (registrant != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && !TextUtils.isEmpty(registrant.firstName))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 && !TextUtils.isEmpty(registrant.lastName))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (coRegistrant != null)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (flag3 && !TextUtils.isEmpty(coRegistrant.firstName))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag3 && !TextUtils.isEmpty(coRegistrant.lastName))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        stringbuilder = new StringBuilder();
        if (flag)
        {
            stringbuilder.append(WordUtils.capitalizeFully(registrant.firstName));
        }
        if (flag1)
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" ");
            }
            stringbuilder.append(WordUtils.capitalizeFully(registrant.lastName));
        }
        if (stringbuilder.length() > 0 && (flag2 || flag3))
        {
            stringbuilder.append(context.getString(0x7f09064a));
        }
        if (flag2)
        {
            stringbuilder.append(WordUtils.capitalizeFully(coRegistrant.firstName));
        }
        if (flag3)
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(" ");
            }
            stringbuilder.append(WordUtils.capitalizeFully(coRegistrant.lastName));
        }
        return stringbuilder.toString();
    }

    public boolean hasCoRegistrant()
    {
        return coRegistrant != null && (!TextUtils.isEmpty(coRegistrant.firstName) || !TextUtils.isEmpty(coRegistrant.lastName));
    }

    public boolean hasRegistrant()
    {
        return registrant != null && (!TextUtils.isEmpty(registrant.firstName) || !TextUtils.isEmpty(registrant.lastName));
    }

    public boolean isPublic()
    {
        return "public".equalsIgnoreCase(access);
    }

    public void setCoRegistrant(Registrant registrant1)
    {
        if (registrant1 != null)
        {
            coRegistrant = registrant1;
        }
    }

    public void setRegistrant(Registrant registrant1)
    {
        if (registrant1 != null)
        {
            registrant = registrant1;
        }
    }
}
