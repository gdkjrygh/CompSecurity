// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import com.walmart.android.service.item.model.DrugFacts;
import com.walmart.android.service.item.model.Nutrition;
import com.walmart.android.service.item.model.SupplementFacts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.item:
//            ItemResponse

public static class Modules.warranties
{
    public static class DisplayabilityMatrix
    {

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

        public DisplayabilityMatrix()
        {
        }
    }

    public static class DisplayabilityMatrix.Item
    {

        public String headline;
        public String image;
        public String message;

        public DisplayabilityMatrix.Item()
        {
        }
    }

    public static class DisplayabilityMatrix.LegalBadges
    {

        public List legalContentList;

        public boolean isEmpty()
        {
            return legalContentList == null || legalContentList.isEmpty();
        }

        public DisplayabilityMatrix.LegalBadges()
        {
            legalContentList = Collections.emptyList();
        }
    }

    public static class Modules
    {

        public List directions;
        public DrugFacts drugFacts;
        public List esrbRating;
        public List indications;
        public List ingredients;
        public List longDescription;
        public SupplementFacts mSupplementFacts;
        public List mpaaRating;
        public Nutrition nutrition;
        public List shortDescription;
        public List specifications;
        public List trackListing;
        public List warnings;
        public List warranties;
        public List whatsIncluded;

        public Modules()
        {
            specifications = Collections.emptyList();
            ingredients = Collections.emptyList();
            directions = Collections.emptyList();
            warnings = Collections.emptyList();
            indications = Collections.emptyList();
            trackListing = Collections.emptyList();
            whatsIncluded = Collections.emptyList();
            longDescription = Collections.emptyList();
            shortDescription = Collections.emptyList();
            esrbRating = Collections.emptyList();
            mpaaRating = Collections.emptyList();
            warranties = Collections.emptyList();
        }
    }


    public DisplayabilityMatrix displayabilityMatrix;
    public Modules modules;

    public Modules.warranties()
    {
    }
}
