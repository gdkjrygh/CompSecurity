// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.analytics;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.weather.commons.analytics.allergy.AllergyFeedScreenTag;
import com.weather.commons.analytics.allergy.AllergyModuleViewedAttribute;
import com.weather.commons.analytics.allergy.ColdFluModuleViewedAttribute;
import com.weather.commons.analytics.feed.LocalyticsMainFeedTag;
import com.weather.commons.analytics.hurricane.HurricaneCentralTag;
import com.weather.commons.analytics.hurricane.HurricaneModuleViewedAttribute;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.weather.commons.analytics:
//            LocalyticsRecorder, Attribute

public final class LocalyticsRecorders
{
    private static final class RecorderWithDefaults extends LocalyticsRecorder
    {

        private final Map defaultAttributeMap;

        public Map getAttributesMap()
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = defaultAttributeMap.entrySet().iterator(); iterator.hasNext(); putValueIfAbsent((Attribute)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            return super.getAttributesMap();
        }

        RecorderWithDefaults(Map map, Iterable iterable)
        {
            defaultAttributeMap = ImmutableMap.copyOf(map);
            for (map = iterable.iterator(); map.hasNext(); initIncrementalValue((Attribute)map.next())) { }
        }
    }


    private LocalyticsRecorders()
    {
    }

    public static LocalyticsRecorder createAllergyFeedSummaryRecorder()
    {
        boolean flag = false;
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        Object aobj[] = AllergyFeedScreenTag.values();
        int k = aobj.length;
        for (int i = 0; i < k; i++)
        {
            builder.put(aobj[i], LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        }

        aobj = AllergyModuleViewedAttribute.values();
        k = aobj.length;
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            builder.put(aobj[j], LocalyticsAttributeValues.AttributeValue.NOT_DISPLAYED.getAttributeValue());
        }

        builder.put(LocalyticsMainFeedTag.SCROLLED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        builder.put(LocalyticsMainFeedTag.PREVIOUS_SCREEN, LocalyticsAttributeValues.AttributeValue.NOT_AVAILABLE.getAttributeValue());
        return new RecorderWithDefaults(builder.build(), ImmutableList.of());
    }

    public static LocalyticsRecorder createColdFluFeedSummaryRecorder()
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        ColdFluModuleViewedAttribute acoldflumoduleviewedattribute[] = ColdFluModuleViewedAttribute.values();
        int j = acoldflumoduleviewedattribute.length;
        for (int i = 0; i < j; i++)
        {
            builder.put(acoldflumoduleviewedattribute[i], LocalyticsAttributeValues.AttributeValue.NOT_DISPLAYED.getAttributeValue());
        }

        builder.put(LocalyticsMainFeedTag.SCROLLED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        builder.put(LocalyticsMainFeedTag.PREVIOUS_SCREEN, LocalyticsAttributeValues.AttributeValue.NOT_AVAILABLE.getAttributeValue());
        return new RecorderWithDefaults(builder.build(), ImmutableList.of());
    }

    public static LocalyticsRecorder createHurricaneCentralFeedRecorder()
    {
        com.google.common.collect.ImmutableMap.Builder builder = ImmutableMap.builder();
        HurricaneModuleViewedAttribute ahurricanemoduleviewedattribute[] = HurricaneModuleViewedAttribute.values();
        int j = ahurricanemoduleviewedattribute.length;
        for (int i = 0; i < j; i++)
        {
            builder.put(ahurricanemoduleviewedattribute[i], LocalyticsAttributeValues.AttributeValue.NOT_DISPLAYED.getAttributeValue());
        }

        builder.put(HurricaneCentralTag.SCROLLED, LocalyticsAttributeValues.AttributeValue.BOOLEAN_NO.getAttributeValue());
        builder.put(HurricaneCentralTag.STORM_ID, LocalyticsAttributeValues.AttributeValue.NOT_AVAILABLE.getAttributeValue());
        builder.put(HurricaneCentralTag.STORM_CATEGORY, LocalyticsAttributeValues.AttributeValue.NOT_AVAILABLE.getAttributeValue());
        return new RecorderWithDefaults(builder.build(), ImmutableList.of());
    }

    public static LocalyticsRecorder createHurricaneCentralMapRecorder()
    {
        return new RecorderWithDefaults(ImmutableMap.of(HurricaneCentralTag.PREVIOUS_SCREEN, LocalyticsAttributeValues.AttributeValue.NOT_AVAILABLE.getAttributeValue()), ImmutableList.of());
    }

    public static LocalyticsRecorder createTropicalOutlookRecorder()
    {
        return new RecorderWithDefaults(ImmutableMap.of(), ImmutableList.of(HurricaneCentralTag.OUTLOOKS_EXPANDED));
    }
}
