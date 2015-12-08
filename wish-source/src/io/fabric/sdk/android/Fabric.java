// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import io.fabric.sdk.android.services.concurrency.PriorityThreadPoolExecutor;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package io.fabric.sdk.android:
//            DefaultLogger, Kit, KitGroup, ActivityLifecycleManager, 
//            InitializationTask, FabricKitsFinder, Onboarding, InitializationCallback, 
//            Logger

public class Fabric
{
    public static class Builder
    {

        private String appIdentifier;
        private String appInstallIdentifier;
        private final Context context;
        private boolean debuggable;
        private Handler handler;
        private InitializationCallback initializationCallback;
        private Kit kits[];
        private Logger logger;
        private PriorityThreadPoolExecutor threadPoolExecutor;

        public Builder appIdentifier(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("appIdentifier must not be null.");
            }
            if (appIdentifier != null)
            {
                throw new IllegalStateException("appIdentifier already set.");
            } else
            {
                appIdentifier = s;
                return this;
            }
        }

        public Builder appInstallIdentifier(String s)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("appInstallIdentifier must not be null.");
            }
            if (appInstallIdentifier != null)
            {
                throw new IllegalStateException("appInstallIdentifier already set.");
            } else
            {
                appInstallIdentifier = s;
                return this;
            }
        }

        public Fabric build()
        {
            if (threadPoolExecutor == null)
            {
                threadPoolExecutor = PriorityThreadPoolExecutor.create();
            }
            if (handler == null)
            {
                handler = new Handler(Looper.getMainLooper());
            }
            Object obj;
            IdManager idmanager;
            if (logger == null)
            {
                if (debuggable)
                {
                    logger = new DefaultLogger(3);
                } else
                {
                    logger = new DefaultLogger();
                }
            }
            if (appIdentifier == null)
            {
                appIdentifier = context.getPackageName();
            }
            if (initializationCallback == null)
            {
                initializationCallback = InitializationCallback.EMPTY;
            }
            if (kits == null)
            {
                obj = new HashMap();
            } else
            {
                obj = Fabric.getKitMap(Arrays.asList(kits));
            }
            idmanager = new IdManager(context, appIdentifier, appInstallIdentifier, ((Map) (obj)).values());
            return new Fabric(context, ((Map) (obj)), threadPoolExecutor, handler, logger, debuggable, initializationCallback, idmanager);
        }

        public Builder debuggable(boolean flag)
        {
            debuggable = flag;
            return this;
        }

        public Builder executorService(ExecutorService executorservice)
        {
            return this;
        }

        public Builder handler(Handler handler1)
        {
            return this;
        }

        public Builder initializationCallback(InitializationCallback initializationcallback)
        {
            if (initializationcallback == null)
            {
                throw new IllegalArgumentException("initializationCallback must not be null.");
            }
            if (initializationCallback != null)
            {
                throw new IllegalStateException("initializationCallback already set.");
            } else
            {
                initializationCallback = initializationcallback;
                return this;
            }
        }

        public transient Builder kits(Kit akit[])
        {
            if (kits != null)
            {
                throw new IllegalStateException("Kits already set.");
            } else
            {
                kits = akit;
                return this;
            }
        }

        public Builder logger(Logger logger1)
        {
            if (logger1 == null)
            {
                throw new IllegalArgumentException("Logger must not be null.");
            }
            if (logger != null)
            {
                throw new IllegalStateException("Logger already set.");
            } else
            {
                logger = logger1;
                return this;
            }
        }

        public Builder threadPoolExecutor(PriorityThreadPoolExecutor prioritythreadpoolexecutor)
        {
            if (prioritythreadpoolexecutor == null)
            {
                throw new IllegalArgumentException("PriorityThreadPoolExecutor must not be null.");
            }
            if (threadPoolExecutor != null)
            {
                throw new IllegalStateException("PriorityThreadPoolExecutor already set.");
            } else
            {
                threadPoolExecutor = prioritythreadpoolexecutor;
                return this;
            }
        }

        public Builder(Context context1)
        {
            if (context1 == null)
            {
                throw new IllegalArgumentException("Context must not be null.");
            } else
            {
                context = context1.getApplicationContext();
                return;
            }
        }
    }


    static final boolean DEFAULT_DEBUGGABLE = false;
    static final Logger DEFAULT_LOGGER = new DefaultLogger();
    static final String ROOT_DIR = ".Fabric";
    public static final String TAG = "Fabric";
    static volatile Fabric singleton;
    private WeakReference activity;
    private ActivityLifecycleManager activityLifecycleManager;
    private final Context context;
    final boolean debuggable;
    private final ExecutorService executorService;
    private final IdManager idManager;
    private final InitializationCallback initializationCallback;
    private AtomicBoolean initialized;
    private final InitializationCallback kitInitializationCallback;
    private final Map kits;
    final Logger logger;
    private final Handler mainHandler;

    Fabric(Context context1, Map map, PriorityThreadPoolExecutor prioritythreadpoolexecutor, Handler handler, Logger logger1, boolean flag, InitializationCallback initializationcallback, 
            IdManager idmanager)
    {
        context = context1;
        kits = map;
        executorService = prioritythreadpoolexecutor;
        mainHandler = handler;
        logger = logger1;
        debuggable = flag;
        initializationCallback = initializationcallback;
        initialized = new AtomicBoolean(false);
        kitInitializationCallback = createKitInitializationCallback(map.size());
        idManager = idmanager;
    }

    private static void addToKitMap(Map map, Collection collection)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            Kit kit = (Kit)collection.next();
            map.put(kit.getClass(), kit);
            if (kit instanceof KitGroup)
            {
                addToKitMap(map, ((KitGroup)kit).getKits());
            }
        } while (true);
    }

    private Activity extractActivity(Context context1)
    {
        if (context1 instanceof Activity)
        {
            return (Activity)context1;
        } else
        {
            return null;
        }
    }

    public static Kit getKit(Class class1)
    {
        return (Kit)singleton().kits.get(class1);
    }

    private static Map getKitMap(Collection collection)
    {
        HashMap hashmap = new HashMap(collection.size());
        addToKitMap(hashmap, collection);
        return hashmap;
    }

    public static Logger getLogger()
    {
        if (singleton == null)
        {
            return DEFAULT_LOGGER;
        } else
        {
            return singleton.logger;
        }
    }

    private void init()
    {
        setCurrentActivity(extractActivity(context));
        activityLifecycleManager = new ActivityLifecycleManager(context);
        activityLifecycleManager.registerCallbacks(new ActivityLifecycleManager.Callbacks() {

            final Fabric this$0;

            public void onActivityCreated(Activity activity1, Bundle bundle)
            {
                setCurrentActivity(activity1);
            }

            public void onActivityResumed(Activity activity1)
            {
                setCurrentActivity(activity1);
            }

            public void onActivityStarted(Activity activity1)
            {
                setCurrentActivity(activity1);
            }

            
            {
                this$0 = Fabric.this;
                super();
            }
        });
        initializeKits(context);
    }

    public static boolean isDebuggable()
    {
        if (singleton == null)
        {
            return false;
        } else
        {
            return singleton.debuggable;
        }
    }

    public static boolean isInitialized()
    {
        return singleton != null && singleton.initialized.get();
    }

    private static void setFabric(Fabric fabric)
    {
        singleton = fabric;
        fabric.init();
    }

    static Fabric singleton()
    {
        if (singleton == null)
        {
            throw new IllegalStateException("Must Initialize Fabric before using singleton()");
        } else
        {
            return singleton;
        }
    }

    public static transient Fabric with(Context context1, Kit akit[])
    {
        if (singleton != null) goto _L2; else goto _L1
_L1:
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorenter ;
        if (singleton == null)
        {
            setFabric((new Builder(context1)).kits(akit).build());
        }
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorexit ;
_L2:
        return singleton;
        context1;
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorexit ;
        throw context1;
    }

    public static Fabric with(Fabric fabric)
    {
        if (singleton != null) goto _L2; else goto _L1
_L1:
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorenter ;
        if (singleton == null)
        {
            setFabric(fabric);
        }
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorexit ;
_L2:
        return singleton;
        fabric;
        io/fabric/sdk/android/Fabric;
        JVM INSTR monitorexit ;
        throw fabric;
    }

    void addAnnotatedDependencies(Map map, Kit kit)
    {
        DependsOn dependson = (DependsOn)kit.getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn);
        if (dependson != null)
        {
            Class aclass[] = dependson.value();
            int j = aclass.length;
label0:
            for (int i = 0; i < j; i++)
            {
                Class class1 = aclass[i];
                if (class1.isInterface())
                {
                    Iterator iterator = map.values().iterator();
                    do
                    {
                        Kit kit1;
                        do
                        {
                            if (!iterator.hasNext())
                            {
                                continue label0;
                            }
                            kit1 = (Kit)iterator.next();
                        } while (!class1.isAssignableFrom(kit1.getClass()));
                        kit.initializationTask.addDependency(kit1.initializationTask);
                    } while (true);
                }
                if ((Kit)map.get(class1) == null)
                {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
                kit.initializationTask.addDependency(((Kit)map.get(class1)).initializationTask);
            }

        }
    }

    InitializationCallback createKitInitializationCallback(final int size)
    {
        return new InitializationCallback() {

            final CountDownLatch kitInitializedLatch;
            final Fabric this$0;
            final int val$size;

            public void failure(Exception exception)
            {
                initializationCallback.failure(exception);
            }

            public void success(Object obj)
            {
                kitInitializedLatch.countDown();
                if (kitInitializedLatch.getCount() == 0L)
                {
                    initialized.set(true);
                    initializationCallback.success(Fabric.this);
                }
            }

            
            {
                this$0 = Fabric.this;
                size = i;
                super();
                kitInitializedLatch = new CountDownLatch(size);
            }
        };
    }

    public ActivityLifecycleManager getActivityLifecycleManager()
    {
        return activityLifecycleManager;
    }

    public String getAppIdentifier()
    {
        return idManager.getAppIdentifier();
    }

    public String getAppInstallIdentifier()
    {
        return idManager.getAppInstallIdentifier();
    }

    public Activity getCurrentActivity()
    {
        if (activity != null)
        {
            return (Activity)activity.get();
        } else
        {
            return null;
        }
    }

    public ExecutorService getExecutorService()
    {
        return executorService;
    }

    public String getIdentifier()
    {
        return "io.fabric.sdk.android:fabric";
    }

    public Collection getKits()
    {
        return kits.values();
    }

    Future getKitsFinderFuture(Context context1)
    {
        context1 = new FabricKitsFinder(context1.getPackageCodePath());
        return getExecutorService().submit(context1);
    }

    public Handler getMainHandler()
    {
        return mainHandler;
    }

    public String getVersion()
    {
        return "1.3.6.79";
    }

    void initializeKits(Context context1)
    {
        Object obj = getKitsFinderFuture(context1);
        Object obj1 = getKits();
        obj = new Onboarding(((Future) (obj)), ((Collection) (obj1)));
        obj1 = new ArrayList(((Collection) (obj1)));
        Collections.sort(((List) (obj1)));
        ((Onboarding) (obj)).injectParameters(context1, this, InitializationCallback.EMPTY, idManager);
        for (Iterator iterator = ((List) (obj1)).iterator(); iterator.hasNext(); ((Kit)iterator.next()).injectParameters(context1, this, kitInitializationCallback, idManager)) { }
        ((Onboarding) (obj)).initialize();
        if (getLogger().isLoggable("Fabric", 3))
        {
            context1 = (new StringBuilder("Initializing ")).append(getIdentifier()).append(" [Version: ").append(getVersion()).append("], with the following kits:\n");
        } else
        {
            context1 = null;
        }
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Kit kit = (Kit)((Iterator) (obj1)).next();
            kit.initializationTask.addDependency(((Onboarding) (obj)).initializationTask);
            addAnnotatedDependencies(kits, kit);
            kit.initialize();
            if (context1 != null)
            {
                context1.append(kit.getIdentifier()).append(" [Version: ").append(kit.getVersion()).append("]\n");
            }
        } while (true);
        if (context1 != null)
        {
            getLogger().d("Fabric", context1.toString());
        }
    }

    public Fabric setCurrentActivity(Activity activity1)
    {
        activity = new WeakReference(activity1);
        return this;
    }




}
