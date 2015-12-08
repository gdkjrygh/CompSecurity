// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.apps.analytics:
//            Event, AdHitIdGenerator, CustomVariableBuffer, HitStore, 
//            Item, Transaction, Dispatcher, CustomVariable, 
//            PersistentHitStore, NetworkDispatcher

public class GoogleAnalyticsTracker
{

    public static final String LOG_TAG = "GoogleAnalyticsTracker";
    public static final String PRODUCT = "GoogleAnalytics";
    public static final String VERSION = "1.4.2";
    public static final String WIRE_VERSION = "4.8.1ma";
    private static GoogleAnalyticsTracker instance = new GoogleAnalyticsTracker();
    private String accountId;
    private AdHitIdGenerator adHitIdGenerator;
    private boolean anonymizeIp;
    private ConnectivityManager connectivityManager;
    private CustomVariableBuffer customVariableBuffer;
    private boolean debug;
    private int dispatchPeriod;
    private Runnable dispatchRunner;
    private Dispatcher dispatcher;
    private boolean dispatcherIsBusy;
    private boolean dryRun;
    private Handler handler;
    private HitStore hitStore;
    private Map itemMap;
    private Context parent;
    private boolean powerSaveMode;
    private int sampleRate;
    private Map transactionMap;
    private boolean useServerTime;
    private String userAgentProduct;
    private String userAgentVersion;

    private GoogleAnalyticsTracker()
    {
        debug = false;
        dryRun = false;
        anonymizeIp = false;
        useServerTime = false;
        sampleRate = 100;
        userAgentProduct = "GoogleAnalytics";
        userAgentVersion = "1.4.2";
        transactionMap = new HashMap();
        itemMap = new HashMap();
        dispatchRunner = new _cls1();
    }

    private void cancelPendingDispatches()
    {
        if (handler != null)
        {
            handler.removeCallbacks(dispatchRunner);
        }
    }

    private void createEvent(String s, String s1, String s2, String s3, int i)
    {
        s = new Event(s, s1, s2, s3, i, parent.getResources().getDisplayMetrics().widthPixels, parent.getResources().getDisplayMetrics().heightPixels);
        s.setCustomVariableBuffer(customVariableBuffer);
        s.setAdHitId(adHitIdGenerator.getAdHitId());
        s.setUseServerTime(useServerTime);
        customVariableBuffer = new CustomVariableBuffer();
        hitStore.putEvent(s);
        resetPowerSaveMode();
    }

    public static GoogleAnalyticsTracker getInstance()
    {
        return instance;
    }

    private void maybeScheduleNextDispatch()
    {
        while (dispatchPeriod < 0 || !handler.postDelayed(dispatchRunner, dispatchPeriod * 1000) || !debug) 
        {
            return;
        }
        Log.v("GoogleAnalyticsTracker", "Scheduled next dispatch");
    }

    private void resetPowerSaveMode()
    {
        if (powerSaveMode)
        {
            powerSaveMode = false;
            maybeScheduleNextDispatch();
        }
    }

    public void addItem(Item item)
    {
        if ((Transaction)transactionMap.get(item.getOrderId()) == null)
        {
            Log.i("GoogleAnalyticsTracker", (new StringBuilder()).append("No transaction with orderId ").append(item.getOrderId()).append(" found, creating one").toString());
            Transaction transaction = (new Transaction.Builder(item.getOrderId(), 0.0D)).build();
            transactionMap.put(item.getOrderId(), transaction);
        }
        Map map = (Map)itemMap.get(item.getOrderId());
        Object obj = map;
        if (map == null)
        {
            obj = new HashMap();
            itemMap.put(item.getOrderId(), obj);
        }
        ((Map) (obj)).put(item.getItemSKU(), item);
    }

    public void addTransaction(Transaction transaction)
    {
        transactionMap.put(transaction.getOrderId(), transaction);
    }

    public void clearTransactions()
    {
        transactionMap.clear();
        itemMap.clear();
    }

    public boolean dispatch()
    {
        if (debug)
        {
            Log.v("GoogleAnalyticsTracker", "Called dispatch");
        }
        if (dispatcherIsBusy)
        {
            if (debug)
            {
                Log.v("GoogleAnalyticsTracker", "...but dispatcher was busy");
            }
            maybeScheduleNextDispatch();
        } else
        {
            NetworkInfo networkinfo = connectivityManager.getActiveNetworkInfo();
            if (networkinfo == null || !networkinfo.isAvailable())
            {
                if (debug)
                {
                    Log.v("GoogleAnalyticsTracker", "...but there was no network available");
                }
                maybeScheduleNextDispatch();
                return false;
            }
            if (hitStore.getNumStoredHits() != 0)
            {
                Hit ahit[] = hitStore.peekHits();
                dispatcher.dispatchHits(ahit);
                dispatcherIsBusy = true;
                maybeScheduleNextDispatch();
                if (debug)
                {
                    Log.v("GoogleAnalyticsTracker", (new StringBuilder()).append("Sending ").append(ahit.length).append(" hits to dispatcher").toString());
                }
                return true;
            }
            powerSaveMode = true;
            if (debug)
            {
                Log.v("GoogleAnalyticsTracker", "...but there was nothing to dispatch");
                return false;
            }
        }
        return false;
    }

    void dispatchFinished()
    {
        dispatcherIsBusy = false;
    }

    public boolean getAnonymizeIp()
    {
        return anonymizeIp;
    }

    public boolean getDebug()
    {
        return debug;
    }

    Dispatcher getDispatcher()
    {
        return dispatcher;
    }

    HitStore getHitStore()
    {
        return hitStore;
    }

    public int getSampleRate()
    {
        return sampleRate;
    }

    String getSessionIdForAds()
    {
        if (hitStore == null)
        {
            return null;
        } else
        {
            return hitStore.getSessionId();
        }
    }

    public String getVisitorCustomVar(int i)
    {
        if (i < 1 || i > 5)
        {
            throw new IllegalArgumentException("Index must be between 1 and 5 inclusive.");
        } else
        {
            return hitStore.getVisitorCustomVar(i);
        }
    }

    String getVisitorIdForAds()
    {
        if (hitStore == null)
        {
            return null;
        } else
        {
            return hitStore.getVisitorId();
        }
    }

    public boolean isDryRun()
    {
        return dryRun;
    }

    void returnToInitialState()
    {
        instance = new GoogleAnalyticsTracker();
    }

    void setAdHitIdGenerator(AdHitIdGenerator adhitidgenerator)
    {
        adHitIdGenerator = adhitidgenerator;
    }

    public void setAnonymizeIp(boolean flag)
    {
        anonymizeIp = flag;
        if (hitStore != null)
        {
            hitStore.setAnonymizeIp(anonymizeIp);
        }
    }

    public boolean setCustomVar(int i, String s, String s1)
    {
        return setCustomVar(i, s, s1, 3);
    }

    public boolean setCustomVar(int i, String s, String s1, int j)
    {
        try
        {
            s = new CustomVariable(i, s, s1, j);
            if (customVariableBuffer == null)
            {
                customVariableBuffer = new CustomVariableBuffer();
            }
            customVariableBuffer.setCustomVariable(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public void setDebug(boolean flag)
    {
        debug = flag;
    }

    public void setDispatchPeriod(int i)
    {
        int j = dispatchPeriod;
        dispatchPeriod = i;
        if (j <= 0)
        {
            maybeScheduleNextDispatch();
        } else
        if (j > 0)
        {
            cancelPendingDispatches();
            maybeScheduleNextDispatch();
            return;
        }
    }

    public boolean setDispatcher(Dispatcher dispatcher1)
    {
        if (dispatcherIsBusy)
        {
            return false;
        }
        if (dispatcher != null)
        {
            dispatcher.stop();
        }
        dispatcher = dispatcher1;
        dispatcher.init(new DispatcherCallbacks());
        dispatcher.setDryRun(dryRun);
        return true;
    }

    public void setDryRun(boolean flag)
    {
        dryRun = flag;
        if (dispatcher != null)
        {
            dispatcher.setDryRun(flag);
        }
    }

    public void setProductVersion(String s, String s1)
    {
        userAgentProduct = s;
        userAgentVersion = s1;
    }

    public boolean setReferrer(String s)
    {
        if (hitStore == null)
        {
            throw new IllegalStateException("Can't set a referrer before starting the tracker");
        } else
        {
            return hitStore.setReferrer(s);
        }
    }

    public void setSampleRate(int i)
    {
        if (i < 0 || i > 100)
        {
            Log.w("GoogleAnalyticsTracker", (new StringBuilder()).append("Invalid sample rate: ").append(i).append(" (should be between 0 and 100").toString());
        } else
        {
            sampleRate = i;
            if (hitStore != null)
            {
                hitStore.setSampleRate(sampleRate);
                return;
            }
        }
    }

    public void setUseServerTime(boolean flag)
    {
        useServerTime = flag;
    }

    public void start(String s, int i, Context context)
    {
        startNewSession(s, i, context);
    }

    void start(String s, int i, Context context, HitStore hitstore, Dispatcher dispatcher1, boolean flag)
    {
        start(s, i, context, hitstore, dispatcher1, flag, ((Dispatcher.Callbacks) (new DispatcherCallbacks())));
    }

    void start(String s, int i, Context context, HitStore hitstore, Dispatcher dispatcher1, boolean flag, Dispatcher.Callbacks callbacks)
    {
        accountId = s;
        if (context == null)
        {
            throw new NullPointerException("Context cannot be null");
        }
        parent = context.getApplicationContext();
        hitStore = hitstore;
        adHitIdGenerator = new AdHitIdGenerator();
        if (flag)
        {
            hitStore.startNewVisit();
        }
        dispatcher = dispatcher1;
        dispatcher.init(callbacks);
        dispatcherIsBusy = false;
        if (connectivityManager == null)
        {
            connectivityManager = (ConnectivityManager)parent.getSystemService("connectivity");
        }
        if (handler == null)
        {
            handler = new Handler(context.getMainLooper());
        } else
        {
            cancelPendingDispatches();
        }
        setDispatchPeriod(i);
    }

    void start(String s, int i, Context context, boolean flag)
    {
        if (context == null)
        {
            throw new NullPointerException("Context cannot be null");
        }
        Object obj;
        Object obj1;
        if (hitStore == null)
        {
            obj = new PersistentHitStore(context);
            ((HitStore) (obj)).setAnonymizeIp(anonymizeIp);
            ((HitStore) (obj)).setSampleRate(sampleRate);
        } else
        {
            obj = hitStore;
        }
        if (dispatcher == null)
        {
            obj1 = new NetworkDispatcher(userAgentProduct, userAgentVersion);
            ((Dispatcher) (obj1)).setDryRun(dryRun);
        } else
        {
            obj1 = dispatcher;
        }
        start(s, i, context, ((HitStore) (obj)), ((Dispatcher) (obj1)), flag);
    }

    public void start(String s, Context context)
    {
        start(s, -1, context);
    }

    public void startNewSession(String s, int i, Context context)
    {
        start(s, i, context, true);
    }

    public void startNewSession(String s, Context context)
    {
        startNewSession(s, -1, context);
    }

    public void stop()
    {
        if (dispatcher != null)
        {
            dispatcher.stop();
        }
        cancelPendingDispatches();
    }

    public void stopSession()
    {
        stop();
    }

    public void trackEvent(String s, String s1, String s2, int i)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("category cannot be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("action cannot be null");
        } else
        {
            createEvent(accountId, s, s1, s2, i);
            return;
        }
    }

    public void trackPageView(String s)
    {
        createEvent(accountId, "__##GOOGLEPAGEVIEW##__", s, null, -1);
    }

    public void trackTransactions()
    {
        Iterator iterator = transactionMap.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (Transaction)iterator.next();
            Event event = new Event(accountId, "__##GOOGLETRANSACTION##__", "", "", 0, parent.getResources().getDisplayMetrics().widthPixels, parent.getResources().getDisplayMetrics().heightPixels);
            event.setTransaction(((Transaction) (obj)));
            hitStore.putEvent(event);
            obj = (Map)itemMap.get(((Transaction) (obj)).getOrderId());
            if (obj != null)
            {
                obj = ((Map) (obj)).values().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Item item = (Item)((Iterator) (obj)).next();
                    Event event1 = new Event(accountId, "__##GOOGLEITEM##__", "", "", 0, parent.getResources().getDisplayMetrics().widthPixels, parent.getResources().getDisplayMetrics().heightPixels);
                    event1.setItem(item);
                    hitStore.putEvent(event1);
                }
            }
        } while (true);
        clearTransactions();
        resetPowerSaveMode();
    }




    private class _cls1
        implements Runnable
    {

        final GoogleAnalyticsTracker this$0;

        public void run()
        {
            dispatch();
        }

        _cls1()
        {
            this$0 = GoogleAnalyticsTracker.this;
            super();
        }
    }


    private class DispatcherCallbacks
        implements Dispatcher.Callbacks
    {

        final GoogleAnalyticsTracker this$0;

        public void dispatchFinished()
        {
            class _cls1
                implements Runnable
            {

                final DispatcherCallbacks this$1;

                public void run()
                {
                    dispatchFinished();
                }

                _cls1()
                {
                    this$1 = DispatcherCallbacks.this;
                    super();
                }
            }

            handler.post(new _cls1());
        }

        public void hitDispatched(long l)
        {
            hitStore.deleteHit(l);
        }

        DispatcherCallbacks()
        {
            this$0 = GoogleAnalyticsTracker.this;
            super();
        }
    }

}
