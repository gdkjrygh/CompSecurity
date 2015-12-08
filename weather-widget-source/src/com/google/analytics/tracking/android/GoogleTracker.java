// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.analytics.tracking.android:
//            Tracker, TrackerHandler, GAUsage, Utils, 
//            Transaction, Item, Log, ExceptionParser

public class GoogleTracker
    implements Tracker
{
    private static class SimpleModel
    {

        private Map permanentMap;
        private Map temporaryMap;

        public void clearTemporaryValues()
        {
            this;
            JVM INSTR monitorenter ;
            temporaryMap.clear();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public String get(String s)
        {
            this;
            JVM INSTR monitorenter ;
            String s1 = (String)temporaryMap.get(s);
            if (s1 == null) goto _L2; else goto _L1
_L1:
            s = s1;
_L4:
            this;
            JVM INSTR monitorexit ;
            return s;
_L2:
            s = (String)permanentMap.get(s);
            if (true) goto _L4; else goto _L3
_L3:
            s;
            throw s;
        }

        public Map getKeysAndValues()
        {
            this;
            JVM INSTR monitorenter ;
            HashMap hashmap;
            hashmap = new HashMap(permanentMap);
            hashmap.putAll(temporaryMap);
            this;
            JVM INSTR monitorexit ;
            return hashmap;
            Exception exception;
            exception;
            throw exception;
        }

        public void set(String s, String s1)
        {
            this;
            JVM INSTR monitorenter ;
            permanentMap.put(s, s1);
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            throw s;
        }

        public void setAll(Map map, Boolean boolean1)
        {
            this;
            JVM INSTR monitorenter ;
            if (!boolean1.booleanValue()) goto _L2; else goto _L1
_L1:
            temporaryMap.putAll(map);
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            permanentMap.putAll(map);
            if (true) goto _L4; else goto _L3
_L3:
            map;
            throw map;
        }

        public void setForNextHit(String s, String s1)
        {
            this;
            JVM INSTR monitorenter ;
            temporaryMap.put(s, s1);
            this;
            JVM INSTR monitorexit ;
            return;
            s;
            throw s;
        }

        private SimpleModel()
        {
            temporaryMap = new HashMap();
            permanentMap = new HashMap();
        }

    }


    private static final DecimalFormat DF;
    private volatile ExceptionParser exceptionParser;
    private final TrackerHandler handler;
    private final SimpleModel model;
    private volatile boolean trackerClosed;
    private volatile boolean trackingStarted;

    GoogleTracker(String s, TrackerHandler trackerhandler)
    {
        trackerClosed = false;
        trackingStarted = false;
        if (s == null)
        {
            throw new IllegalArgumentException("trackingId cannot be null");
        } else
        {
            handler = trackerhandler;
            model = new SimpleModel();
            model.set("trackingId", s);
            model.set("sampleRate", "100");
            model.setForNextHit("sessionControl", "start");
            return;
        }
    }

    private void assertTrackerOpen()
    {
        if (trackerClosed)
        {
            throw new IllegalStateException("Tracker closed");
        } else
        {
            return;
        }
    }

    private void internalSend(String s, Map map)
    {
        trackingStarted = true;
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
        }
        ((Map) (obj)).put("hitType", s);
        model.setAll(((Map) (obj)), Boolean.valueOf(true));
        handler.sendHit(model.getKeysAndValues());
        model.clearTemporaryValues();
    }

    private static String microsToCurrencyString(long l)
    {
        return DF.format((double)l / 1000000D);
    }

    public boolean anonymizeIpEnabled()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_ANONYMIZE_IP);
        return Utils.safeParseBoolean(model.get("anonymizeIp"));
    }

    public void close()
    {
        trackerClosed = true;
        handler.closeTracker(this);
    }

    public Map constructEvent(String s, String s1, String s2, Long long1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("eventCategory", s);
        hashmap.put("eventAction", s1);
        hashmap.put("eventLabel", s2);
        if (long1 != null)
        {
            hashmap.put("eventValue", Long.toString(long1.longValue()));
        }
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_EVENT);
        return hashmap;
    }

    public Map constructException(String s, boolean flag)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("exDescription", s);
        hashmap.put("exFatal", Boolean.toString(flag));
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_EXCEPTION);
        return hashmap;
    }

    Map constructItem(Item item, Transaction transaction)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("transactionId", transaction.getTransactionId());
        hashmap.put("currencyCode", transaction.getCurrencyCode());
        hashmap.put("itemCode", item.getProductSKU());
        hashmap.put("itemName", item.getProductName());
        hashmap.put("itemCategory", item.getProductCategory());
        hashmap.put("itemPrice", microsToCurrencyString(item.getItemPriceInMicros()));
        hashmap.put("itemQuantity", Long.toString(item.getItemQuantity()));
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_ITEM);
        return hashmap;
    }

    public Map constructRawException(String s, Throwable throwable, boolean flag)
        throws IOException
    {
        HashMap hashmap = new HashMap();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(throwable);
        objectoutputstream.close();
        hashmap.put("rawException", Utils.hexEncode(bytearrayoutputstream.toByteArray()));
        if (s != null)
        {
            hashmap.put("exceptionThreadName", s);
        }
        hashmap.put("exFatal", Boolean.toString(flag));
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_RAW_EXCEPTION);
        return hashmap;
    }

    public Map constructSocial(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("socialNetwork", s);
        hashmap.put("socialAction", s1);
        hashmap.put("socialTarget", s2);
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_SOCIAL);
        return hashmap;
    }

    public Map constructTiming(String s, long l, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("timingCategory", s);
        hashmap.put("timingValue", Long.toString(l));
        hashmap.put("timingVar", s1);
        hashmap.put("timingLabel", s2);
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_TIMING);
        return hashmap;
    }

    public Map constructTransaction(Transaction transaction)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("transactionId", transaction.getTransactionId());
        hashmap.put("transactionAffiliation", transaction.getAffiliation());
        hashmap.put("transactionShipping", microsToCurrencyString(transaction.getShippingCostInMicros()));
        hashmap.put("transactionTax", microsToCurrencyString(transaction.getTotalTaxInMicros()));
        hashmap.put("transactionTotal", microsToCurrencyString(transaction.getTotalCostInMicros()));
        hashmap.put("currencyCode", transaction.getCurrencyCode());
        GAUsage.getInstance().setUsage(GAUsage.Field.CONSTRUCT_TRANSACTION);
        return hashmap;
    }

    public String get(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET);
        return model.get(s);
    }

    public String getAppId()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_APP_ID);
        return model.get("appId");
    }

    public String getAppInstallerId()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_APP_INSTALLER_ID);
        return model.get("appInstallerId");
    }

    public ExceptionParser getExceptionParser()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_EXCEPTION_PARSER);
        return exceptionParser;
    }

    public double getSampleRate()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_SAMPLE_RATE);
        return Utils.safeParseDouble(model.get("sampleRate"));
    }

    public String getTrackingId()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_TRACKING_ID);
        return model.get("trackingId");
    }

    public boolean getUseSecure()
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.GET_USE_SECURE);
        return Boolean.parseBoolean(model.get("useSecure"));
    }

    public void send(String s, Map map)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.SEND);
        internalSend(s, map);
    }

    public void set(String s, String s1)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET);
        model.set(s, s1);
    }

    public void setAnonymizeIp(boolean flag)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_ANONYMIZE_IP);
        model.set("anonymizeIp", Boolean.toString(flag));
    }

    public void setAppId(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_ID);
        model.set("appId", s);
    }

    public void setAppInstallerId(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_INSTALLER_ID);
        model.set("appInstallerId", s);
    }

    public void setAppName(String s)
    {
        if (trackingStarted)
        {
            Log.wDebug("Tracking already started, setAppName call ignored");
            return;
        }
        if (TextUtils.isEmpty(s))
        {
            Log.wDebug("setting appName to empty value not allowed, call ignored");
            return;
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_NAME);
            model.set("appName", s);
            return;
        }
    }

    public void setAppScreen(String s)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_SCREEN);
        model.set("description", s);
    }

    public void setAppVersion(String s)
    {
        if (trackingStarted)
        {
            Log.wDebug("Tracking already started, setAppVersion call ignored");
            return;
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.SET_APP_VERSION);
            model.set("appVersion", s);
            return;
        }
    }

    public void setCampaign(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_CAMPAIGN);
        model.setForNextHit("campaign", s);
    }

    public void setCustomDimension(int i, String s)
    {
        if (i < 1)
        {
            Log.w((new StringBuilder()).append("slot must be > 0, ignoring setCustomDimension call for ").append(i).append(", ").append(s).toString());
            return;
        } else
        {
            model.setForNextHit(Utils.getSlottedModelField("customDimension", i), s);
            return;
        }
    }

    public void setCustomDimensionsAndMetrics(Map map, Map map1)
    {
        if (map != null)
        {
            Integer integer1;
            for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); setCustomDimension(integer1.intValue(), (String)map.get(integer1)))
            {
                integer1 = (Integer)iterator.next();
            }

        }
        if (map1 != null)
        {
            Integer integer;
            for (map = map1.keySet().iterator(); map.hasNext(); setCustomMetric(integer.intValue(), (Long)map1.get(integer)))
            {
                integer = (Integer)map.next();
            }

        }
    }

    public void setCustomMetric(int i, Long long1)
    {
        if (i < 1)
        {
            Log.w((new StringBuilder()).append("slot must be > 0, ignoring setCustomMetric call for ").append(i).append(", ").append(long1).toString());
            return;
        }
        String s = null;
        if (long1 != null)
        {
            s = Long.toString(long1.longValue());
        }
        model.setForNextHit(Utils.getSlottedModelField("customMetric", i), s);
    }

    public void setExceptionParser(ExceptionParser exceptionparser)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_EXCEPTION_PARSER);
        exceptionParser = exceptionparser;
    }

    public void setReferrer(String s)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_REFERRER);
        model.setForNextHit("referrer", s);
    }

    public void setSampleRate(double d)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_SAMPLE_RATE);
        model.set("sampleRate", Double.toString(d));
    }

    public void setStartSession(boolean flag)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_START_SESSION);
        SimpleModel simplemodel = model;
        String s;
        if (flag)
        {
            s = "start";
        } else
        {
            s = null;
        }
        simplemodel.setForNextHit("sessionControl", s);
    }

    public void setUseSecure(boolean flag)
    {
        GAUsage.getInstance().setUsage(GAUsage.Field.SET_USE_SECURE);
        model.set("useSecure", Boolean.toString(flag));
    }

    public void trackEvent(String s, String s1, String s2, Long long1)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_EVENT);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("event", constructEvent(s, s1, s2, long1));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void trackException(String s, Throwable throwable, boolean flag)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_EXCEPTION_WITH_THROWABLE);
        if (exceptionParser != null)
        {
            s = exceptionParser.getDescription(s, throwable);
        } else
        {
            try
            {
                GAUsage.getInstance().setDisableUsage(true);
                internalSend("exception", constructRawException(s, throwable, flag));
                GAUsage.getInstance().setDisableUsage(false);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.w("trackException: couldn't serialize, sending \"Unknown Exception\"");
            }
            s = "Unknown Exception";
        }
        GAUsage.getInstance().setDisableUsage(true);
        trackException(s, flag);
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void trackException(String s, boolean flag)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_EXCEPTION_WITH_DESCRIPTION);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("exception", constructException(s, flag));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void trackSocial(String s, String s1, String s2)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_SOCIAL);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("social", constructSocial(s, s1, s2));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void trackTiming(String s, long l, String s1, String s2)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_TIMING);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("timing", constructTiming(s, l, s1, s2));
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void trackTransaction(Transaction transaction)
    {
        assertTrackerOpen();
        GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_TRANSACTION);
        GAUsage.getInstance().setDisableUsage(true);
        internalSend("tran", constructTransaction(transaction));
        for (Iterator iterator = transaction.getItems().iterator(); iterator.hasNext(); internalSend("item", constructItem((Item)iterator.next(), transaction))) { }
        GAUsage.getInstance().setDisableUsage(false);
    }

    public void trackView()
    {
        assertTrackerOpen();
        if (TextUtils.isEmpty(model.get("description")))
        {
            throw new IllegalStateException("trackView requires a appScreen to be set");
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_VIEW);
            internalSend("appview", null);
            return;
        }
    }

    public void trackView(String s)
    {
        assertTrackerOpen();
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalStateException("trackView requires a appScreen to be set");
        } else
        {
            GAUsage.getInstance().setUsage(GAUsage.Field.TRACK_VIEW_WITH_APPSCREEN);
            model.set("description", s);
            internalSend("appview", null);
            return;
        }
    }

    static 
    {
        DF = new DecimalFormat("0.######", new DecimalFormatSymbols(Locale.US));
    }
}
