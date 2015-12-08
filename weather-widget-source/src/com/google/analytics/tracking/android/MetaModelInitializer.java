// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.text.DecimalFormat;

// Referenced classes of package com.google.analytics.tracking.android:
//            MetaModel, Utils

class MetaModelInitializer
{

    private static final MetaModel.Formatter BOOLEAN_FORMATTER = new MetaModel.Formatter() {

        public String format(String s)
        {
            if (Utils.safeParseBoolean(s))
            {
                return "1";
            } else
            {
                return "0";
            }
        }

    };
    private static final MetaModel.Formatter UP_TO_TWO_DIGIT_FLOAT_FORMATTER = new MetaModel.Formatter() {

        private final DecimalFormat floatFormat = new DecimalFormat("0.##");

        public String format(String s)
        {
            return floatFormat.format(Utils.safeParseDouble(s));
        }

    };

    private MetaModelInitializer()
    {
    }

    public static void set(MetaModel metamodel)
    {
        metamodel.addField("apiVersion", "v", null, null);
        metamodel.addField("libraryVersion", "_v", null, null);
        metamodel.addField("anonymizeIp", "aip", "0", BOOLEAN_FORMATTER);
        metamodel.addField("trackingId", "tid", null, null);
        metamodel.addField("hitType", "t", null, null);
        metamodel.addField("sessionControl", "sc", null, null);
        metamodel.addField("adSenseAdMobHitId", "a", null, null);
        metamodel.addField("usage", "_u", null, null);
        metamodel.addField("title", "dt", null, null);
        metamodel.addField("referrer", "dr", null, null);
        metamodel.addField("language", "ul", null, null);
        metamodel.addField("encoding", "de", null, null);
        metamodel.addField("page", "dp", null, null);
        metamodel.addField("screenColors", "sd", null, null);
        metamodel.addField("screenResolution", "sr", null, null);
        metamodel.addField("viewportSize", "vp", null, null);
        metamodel.addField("javaEnabled", "je", "1", BOOLEAN_FORMATTER);
        metamodel.addField("flashVersion", "fl", null, null);
        metamodel.addField("clientId", "cid", null, null);
        metamodel.addField("campaignName", "cn", null, null);
        metamodel.addField("campaignSource", "cs", null, null);
        metamodel.addField("campaignMedium", "cm", null, null);
        metamodel.addField("campaignKeyword", "ck", null, null);
        metamodel.addField("campaignContent", "cc", null, null);
        metamodel.addField("campaignId", "ci", null, null);
        metamodel.addField("gclid", "gclid", null, null);
        metamodel.addField("dclid", "dclid", null, null);
        metamodel.addField("gmob_t", "gmob_t", null, null);
        metamodel.addField("eventCategory", "ec", null, null);
        metamodel.addField("eventAction", "ea", null, null);
        metamodel.addField("eventLabel", "el", null, null);
        metamodel.addField("eventValue", "ev", null, null);
        metamodel.addField("nonInteraction", "ni", "0", BOOLEAN_FORMATTER);
        metamodel.addField("socialNetwork", "sn", null, null);
        metamodel.addField("socialAction", "sa", null, null);
        metamodel.addField("socialTarget", "st", null, null);
        metamodel.addField("appName", "an", null, null);
        metamodel.addField("appVersion", "av", null, null);
        metamodel.addField("description", "cd", null, null);
        metamodel.addField("appId", "aid", null, null);
        metamodel.addField("appInstallerId", "aiid", null, null);
        metamodel.addField("transactionId", "ti", null, null);
        metamodel.addField("transactionAffiliation", "ta", null, null);
        metamodel.addField("transactionShipping", "ts", null, null);
        metamodel.addField("transactionTotal", "tr", null, null);
        metamodel.addField("transactionTax", "tt", null, null);
        metamodel.addField("currencyCode", "cu", null, null);
        metamodel.addField("itemPrice", "ip", null, null);
        metamodel.addField("itemCode", "ic", null, null);
        metamodel.addField("itemName", "in", null, null);
        metamodel.addField("itemCategory", "iv", null, null);
        metamodel.addField("itemQuantity", "iq", null, null);
        metamodel.addField("exDescription", "exd", null, null);
        metamodel.addField("exFatal", "exf", "1", BOOLEAN_FORMATTER);
        metamodel.addField("timingVar", "utv", null, null);
        metamodel.addField("timingValue", "utt", null, null);
        metamodel.addField("timingCategory", "utc", null, null);
        metamodel.addField("timingLabel", "utl", null, null);
        metamodel.addField("sampleRate", "sf", "100", UP_TO_TWO_DIGIT_FLOAT_FORMATTER);
        metamodel.addField("customDimension", "cd", null, null);
        metamodel.addField("customMetric", "cm", null, null);
        metamodel.addField("contentGrouping", "cg", null, null);
    }

}
