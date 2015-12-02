// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            AddFundsDefaultValues, TaggedLocationDistanceConstraints

public class RiderAppConfig
{

    public static final String SETTING_SLIDER_STYLE_STACKED = "stacked";
    public static final String SETTING_SLIDER_STYLE_STACKED_USE_GROUP = "stacked_use_group";
    public static final String SETTING_SLIDER_STYLE_STACKED_USE_PARENT = "stacked_use_parent";
    AddFundsDefaultValues addFundsDefaultValues;
    private Boolean enableSafetyNet;
    private Boolean enableUnison;
    private TaggedLocationDistanceConstraints favoriteLocationDistanceConstraints;
    private Boolean newProductPanelEnabled;
    String sliderStyle;
    private String surgeRationale;
    private String tagTokens;

    public RiderAppConfig()
    {
    }

    private void setTaggedLocationDistanceConstraints(TaggedLocationDistanceConstraints taggedlocationdistanceconstraints)
    {
        favoriteLocationDistanceConstraints = taggedlocationdistanceconstraints;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RiderAppConfig)obj;
            if (addFundsDefaultValues == null ? ((RiderAppConfig) (obj)).addFundsDefaultValues != null : !addFundsDefaultValues.equals(((RiderAppConfig) (obj)).addFundsDefaultValues))
            {
                return false;
            }
            if (enableUnison == null ? ((RiderAppConfig) (obj)).enableUnison != null : !enableUnison.equals(((RiderAppConfig) (obj)).enableUnison))
            {
                return false;
            }
            if (favoriteLocationDistanceConstraints == null ? ((RiderAppConfig) (obj)).favoriteLocationDistanceConstraints != null : !favoriteLocationDistanceConstraints.equals(((RiderAppConfig) (obj)).favoriteLocationDistanceConstraints))
            {
                return false;
            }
            if (newProductPanelEnabled == null ? ((RiderAppConfig) (obj)).newProductPanelEnabled != null : !newProductPanelEnabled.equals(((RiderAppConfig) (obj)).newProductPanelEnabled))
            {
                return false;
            }
            if (sliderStyle == null ? ((RiderAppConfig) (obj)).sliderStyle != null : !sliderStyle.equals(((RiderAppConfig) (obj)).sliderStyle))
            {
                return false;
            }
            if (surgeRationale == null ? ((RiderAppConfig) (obj)).surgeRationale != null : !surgeRationale.equals(((RiderAppConfig) (obj)).surgeRationale))
            {
                return false;
            }
            if (tagTokens == null ? ((RiderAppConfig) (obj)).tagTokens != null : !tagTokens.equals(((RiderAppConfig) (obj)).tagTokens))
            {
                return false;
            }
            if (enableSafetyNet == null ? ((RiderAppConfig) (obj)).enableSafetyNet != null : !enableSafetyNet.equals(((RiderAppConfig) (obj)).enableSafetyNet))
            {
                return false;
            }
        }
        return true;
    }

    public AddFundsDefaultValues getAddFundsDefaultValues()
    {
        return addFundsDefaultValues;
    }

    public String getSliderStyle()
    {
        return sliderStyle;
    }

    public String getSurgeRationale()
    {
        return surgeRationale;
    }

    public String getTagTokens()
    {
        if (tagTokens != null)
        {
            return tagTokens;
        } else
        {
            return "";
        }
    }

    public TaggedLocationDistanceConstraints getTaggedLocationDistanceConstraints()
    {
        return favoriteLocationDistanceConstraints;
    }

    public int hashCode()
    {
        int l1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        if (sliderStyle != null)
        {
            i = sliderStyle.hashCode();
        } else
        {
            i = 0;
        }
        if (enableUnison != null)
        {
            j = enableUnison.hashCode();
        } else
        {
            j = 0;
        }
        if (newProductPanelEnabled != null)
        {
            k = newProductPanelEnabled.hashCode();
        } else
        {
            k = 0;
        }
        if (addFundsDefaultValues != null)
        {
            l = addFundsDefaultValues.hashCode();
        } else
        {
            l = 0;
        }
        if (favoriteLocationDistanceConstraints != null)
        {
            i1 = favoriteLocationDistanceConstraints.hashCode();
        } else
        {
            i1 = 0;
        }
        if (surgeRationale != null)
        {
            j1 = surgeRationale.hashCode();
        } else
        {
            j1 = 0;
        }
        if (tagTokens != null)
        {
            k1 = tagTokens.hashCode();
        } else
        {
            k1 = 0;
        }
        if (enableSafetyNet != null)
        {
            l1 = enableSafetyNet.hashCode();
        }
        return (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l1;
    }

    public boolean isSafetyNetEnabled()
    {
        if (enableSafetyNet != null)
        {
            return enableSafetyNet.booleanValue();
        } else
        {
            return false;
        }
    }

    public void setSafetyNetEnabled(boolean flag)
    {
        enableSafetyNet = Boolean.valueOf(flag);
    }

    public void setSliderStyle(String s)
    {
        sliderStyle = s;
    }

    public void setUnisonEnabled(boolean flag)
    {
        enableUnison = Boolean.valueOf(flag);
    }
}
