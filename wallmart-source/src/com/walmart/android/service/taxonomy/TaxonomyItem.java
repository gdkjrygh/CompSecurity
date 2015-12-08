// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.taxonomy;


public final class TaxonomyItem
{

    public String browseToken;
    public TaxonomyItem children[];
    public int clientStyling;
    public String id;
    public String name;

    public TaxonomyItem()
    {
    }

    public String toString()
    {
        return name;
    }
}
