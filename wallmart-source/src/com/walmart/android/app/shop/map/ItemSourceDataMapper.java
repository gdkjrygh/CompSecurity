// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmart.android.data.StoreAvailabilityData;

// Referenced classes of package com.walmart.android.app.shop.map:
//            SourceDataMapper, AislePositions, MappedSections

public class ItemSourceDataMapper extends SourceDataMapper
{

    public ItemSourceDataMapper()
    {
    }

    private String getAnalyticsDetail(com.walmart.android.data.InStoreSearchResult.Detailed detailed)
    {
        try
        {
            detailed = (new StringBuilder()).append(detailed.zone).append(String.format("%02d", new Object[] {
                Integer.valueOf(Integer.parseInt(detailed.aisle))
            })).append(".").append(String.format("%02d", new Object[] {
                Integer.valueOf(Integer.parseInt(detailed.section))
            })).toString();
        }
        // Misplaced declaration of an exception variable
        catch (com.walmart.android.data.InStoreSearchResult.Detailed detailed)
        {
            return null;
        }
        return detailed;
    }

    protected MappedSections updateDetailedLocations(AislePositions aislepositions, StoreAvailabilityData storeavailabilitydata)
    {
        MappedSections.Builder builder = new MappedSections.Builder();
        if (storeavailabilitydata != null && storeavailabilitydata.detailedLocations != null && aislepositions != null)
        {
            int i = 0;
            while (i < storeavailabilitydata.detailedLocations.length) 
            {
                com.walmart.android.data.InStoreSearchResult.Detailed detailed = storeavailabilitydata.detailedLocations[i];
                if (detailed != null)
                {
                    float af[] = aislepositions.getAislePosition(getAisleSection(detailed));
                    MappedData.Builder builder1 = new MappedData.Builder();
                    if (af != null)
                    {
                        AisleSection.Builder builder2 = new AisleSection.Builder();
                        builder2.setDepartment(storeavailabilitydata.department).setName(getAisle(detailed)).setPosition(af);
                        builder1.setSourcePosition(i).setAisleSection(builder2.build()).setSourceData(storeavailabilitydata);
                    }
                    MappedData mappeddata = builder1.build();
                    if (mappeddata != null)
                    {
                        builder.addMappedData(mappeddata);
                        builder.addMappedAisle(getAnalyticsDetail(detailed));
                    } else
                    {
                        builder.addMissingAisle(getAnalyticsDetail(detailed));
                    }
                }
                i++;
            }
        }
        return builder.build();
    }

    protected volatile MappedSections updateDetailedLocations(AislePositions aislepositions, Object obj)
    {
        return updateDetailedLocations(aislepositions, (StoreAvailabilityData)obj);
    }
}
