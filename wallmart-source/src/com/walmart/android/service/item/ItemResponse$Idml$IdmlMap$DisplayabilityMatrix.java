// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse

public static class LegalBadges.legalContentList
{
    public static class Item
    {

        public String headline;
        public String image;
        public String message;

        public Item()
        {
        }
    }

    public static class LegalBadges
    {

        public List legalContentList;

        public boolean isEmpty()
        {
            return legalContentList == null || legalContentList.isEmpty();
        }

        public LegalBadges()
        {
            legalContentList = Collections.emptyList();
        }
    }


    public LegalBadges legalBadges;
    public LegalBadges legalBadgesChokingHazard;

    public List getAllLegalBadges()
    {
        ArrayList arraylist = new ArrayList();
        if (legalBadgesChokingHazard != null && legalBadgesChokingHazard.legalContentList != null)
        {
            arraylist.addAll(legalBadgesChokingHazard.legalContentList);
        }
        if (legalBadges != null && legalBadges.legalContentList != null)
        {
            arraylist.addAll(legalBadges.legalContentList);
        }
        return arraylist;
    }

    public LegalBadges.legalContentList()
    {
    }
}
