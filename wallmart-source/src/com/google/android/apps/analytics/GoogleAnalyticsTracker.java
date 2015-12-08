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
//            Event, EventStore, CustomVariableBuffer, Item, 
//            Transaction, Dispatcher, CustomVariable, PersistentEventStore, 
//            NetworkDispatcher

public class GoogleAnalyticsTracker
{
    final class DispatcherCallbacks
        implements Dispatcher.Callbacks
    {

        final GoogleAnalyticsTracker this$0;

        public void dispatchFinished()
        {
            handler.post(new Runnable() {

                final DispatcherCallbacks this$1;

                public void run()
                {
                    dispatchFinished();
                }

            
            {
                this$1 = DispatcherCallbacks.this;
                super();
            }
            });
        }

        public void eventDispatched(long l)
        {
            eventStore.deleteEvent(l);
        }

        DispatcherCallbacks()
        {
            this$0 = GoogleAnalyticsTracker.this;
            super();
        }
    }


    private static final GoogleAnalyticsTracker INSTANCE = new GoogleAnalyticsTracker();
    public static final String LOG_TAG = "GoogleAnalyticsTracker";
    public static final String PRODUCT = "GoogleAnalytics";
    public static final String VERSION = "1.2";
    public static final String WIRE_VERSION = "4.6ma";
    private String accountId;
    private ConnectivityManager connetivityManager;
    private CustomVariableBuffer customVariableBuffer;
    private boolean debug;
    private int dispatchPeriod;
    private Runnable dispatchRunner;
    private Dispatcher dispatcher;
    private boolean dispatcherIsBusy;
    private boolean dryRun;
    private EventStore eventStore;
    private Handler handler;
    private Map itemMap;
    private Context parent;
    private boolean powerSaveMode;
    private Map transactionMap;
    private String userAgentProduct;
    private String userAgentVersion;

    private GoogleAnalyticsTracker()
    {
        debug = false;
        dryRun = false;
        userAgentProduct = "GoogleAnalytics";
        userAgentVersion = "1.2";
        transactionMap = new HashMap();
        itemMap = new HashMap();
        dispatchRunner = new Runnable() {

            final GoogleAnalyticsTracker this$0;

            public void run()
            {
                dispatch();
            }

            
            {
                this$0 = GoogleAnalyticsTracker.this;
                super();
            }
        };
    }

    private void cancelPendingDispatches()
    {
        handler.removeCallbacks(dispatchRunner);
    }

    private void createEvent(String s, String s1, String s2, String s3, int i)
    {
        s = new Event(eventStore.getStoreId(), s, s1, s2, s3, i, parent.getResources().getDisplayMetrics().widthPixels, parent.getResources().getDisplayMetrics().heightPixels);
        s.setCustomVariableBuffer(customVariableBuffer);
        customVariableBuffer = new CustomVariableBuffer();
        eventStore.putEvent(s);
        resetPowerSaveMode();
    }

    public static GoogleAnalyticsTracker getInstance()
    {
        return INSTANCE;
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
            NetworkInfo networkinfo = connetivityManager.getActiveNetworkInfo();
            if (networkinfo == null || !networkinfo.isAvailable())
            {
                if (debug)
                {
                    Log.v("GoogleAnalyticsTracker", "...but there was no network available");
                }
                maybeScheduleNextDispatch();
                return false;
            }
            if (eventStore.getNumStoredEvents() != 0)
            {
                Event aevent[] = eventStore.peekEvents();
                dispatcher.dispatchEvents(aevent);
                dispatcherIsBusy = true;
                maybeScheduleNextDispatch();
                if (debug)
                {
                    Log.v("GoogleAnalyticsTracker", (new StringBuilder()).append("Sending ").append(aevent.length).append(" to dispatcher").toString());
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

    public boolean getDebug()
    {
        return debug;
    }

    Dispatcher getDispatcher()
    {
        return dispatcher;
    }

    EventStore getEventStore()
    {
        return eventStore;
    }

    public String getVisitorCustomVar(int i)
    {
        if (i < 1 || i > 5)
        {
            throw new IllegalArgumentException("Index must be between 1 and 5 inclusive.");
        } else
        {
            return eventStore.getVisitorCustomVar(i);
        }
    }

    public boolean isDryRun()
    {
        return dryRun;
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

    public void start(String s, int i, Context context)
    {
        Object obj;
        Object obj1;
        if (eventStore == null)
        {
            obj = new PersistentEventStore(new PersistentEventStore.DataBaseHelper(context));
        } else
        {
            obj = eventStore;
        }
        if (dispatcher == null)
        {
            obj1 = new NetworkDispatcher(userAgentProduct, userAgentVersion);
            ((Dispatcher) (obj1)).setDryRun(dryRun);
        } else
        {
            obj1 = dispatcher;
        }
        start(s, i, context, ((EventStore) (obj)), ((Dispatcher) (obj1)));
    }

    void start(String s, int i, Context context, EventStore eventstore, Dispatcher dispatcher1)
    {
        start(s, i, context, eventstore, dispatcher1, ((Dispatcher.Callbacks) (new DispatcherCallbacks())));
    }

    void start(String s, int i, Context context, EventStore eventstore, Dispatcher dispatcher1, Dispatcher.Callbacks callbacks)
    {
        accountId = s;
        parent = context;
        eventStore = eventstore;
        eventStore.startNewVisit();
        dispatcher = dispatcher1;
        dispatcher.init(callbacks, eventStore.getReferrer());
        dispatcherIsBusy = false;
        if (connetivityManager == null)
        {
            connetivityManager = (ConnectivityManager)parent.getSystemService("connectivity");
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

    public void start(String s, Context context)
    {
        start(s, -1, context);
    }

    public void stop()
    {
        dispatcher.stop();
        cancelPendingDispatches();
    }

    public void trackEvent(String s, String s1, String s2, int i)
    {
        createEvent(accountId, s, s1, s2, i);
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
            Event event = new Event(eventStore.getStoreId(), accountId, "__##GOOGLETRANSACTION##__", "", "", 0, parent.getResources().getDisplayMetrics().widthPixels, parent.getResources().getDisplayMetrics().heightPixels);
            event.setTransaction(((Transaction) (obj)));
            eventStore.putEvent(event);
            obj = (Map)itemMap.get(((Transaction) (obj)).getOrderId());
            if (obj != null)
            {
                obj = ((Map) (obj)).values().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    Item item = (Item)((Iterator) (obj)).next();
                    Event event1 = new Event(eventStore.getStoreId(), accountId, "__##GOOGLEITEM##__", "", "", 0, parent.getResources().getDisplayMetrics().widthPixels, parent.getResources().getDisplayMetrics().heightPixels);
                    event1.setItem(item);
                    eventStore.putEvent(event1);
                }
            }
        } while (true);
        clearTransactions();
        resetPowerSaveMode();
    }



}
