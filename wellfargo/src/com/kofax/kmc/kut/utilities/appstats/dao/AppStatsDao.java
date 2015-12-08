// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.dao;

import android.util.Log;
import com.kofax.kmc.kut.utilities.Sizeof;
import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public abstract class AppStatsDao
    implements com.kofax.kmc.kut.utilities.Sizeof.SizeOfNewObject, Cloneable
{

    private static final String a = "AppStatsDao";
    private static final int b = 2;
    private static final int c = 50;
    private static final int d = 50;
    private static final int e = 50;
    private static final int f = 3;
    private static final b g;
    private static long h = 0L;
    private static long i = 0L;
    private static long j = 0L;
    private static long k = 0L;
    private static List l = new ArrayList();
    private static int m = 0;
    private static AppStatsDaoCalcObjSize n = null;
    private static TaskRunner o = null;
    protected List daoFields;
    protected AppStatsDsOpType dsOperation;
    private AppStatistics p;
    private com.kofax.kmc.kut.utilities.appstats.AppStatistics.FriendAS q;

    public AppStatsDao()
    {
        daoFields = new ArrayList();
        dsOperation = AppStatsDsOpType.APP_STATS_DS_INSERT;
        p = AppStatistics.getInstance();
        AppStatistics appstatistics = p;
        appstatistics.getClass();
        q = new com.kofax.kmc.kut.utilities.appstats.AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
        Sizeof.registerNewObjectListener(this);
    }

    static int a(AppStatsDao appstatsdao)
    {
        return appstatsdao.d();
    }

    private long a(boolean flag)
    {
        m = 0;
        l.clear();
        i = Runtime.getRuntime().freeMemory();
        Log.d("AppStatsDao", (new StringBuilder()).append("heapFreeSize (start) = ").append(NumberFormat.getInstance().format(i)).toString());
        int i1 = 0;
        while (i1 < 50) 
        {
            k = h;
            h = Runtime.getRuntime().freeMemory();
            Log.d("AppStatsDao", (new StringBuilder()).append("heapFreeSize = ").append(NumberFormat.getInstance().format(h)).toString());
            long l1;
            if (k == 0L)
            {
                l1 = h;
            } else
            {
                l1 = k;
            }
            k = l1;
            if (flag)
            {
                AppStatsDao appstatsdao = createDaoSampleSizingObj();
                l.add(appstatsdao);
                m++;
            }
            i1++;
        }
        j = Runtime.getRuntime().freeMemory();
        Log.d("AppStatsDao", (new StringBuilder()).append("heapFreeSize (end) = ").append(NumberFormat.getInstance().format(j)).toString());
        long l2 = i;
        long l3 = j;
        l.clear();
        return l2 - l3;
    }

    static AppStatsDaoCalcObjSize a()
    {
        return n;
    }

    private static void a(long l1)
    {
        try
        {
            Thread.sleep(l1);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
    }

    public static void addAppStatsDaoCalcObjSizeListener(AppStatsDaoCalcObjSize appstatsdaocalcobjsize)
    {
        n = appstatsdaocalcobjsize;
    }

    static int b(AppStatsDao appstatsdao)
    {
        return appstatsdao.e();
    }

    static b b()
    {
        return g;
    }

    private static void c()
    {
        int i1 = 0;
        while (i1 < 2) 
        {
            System.gc();
            try
            {
                Thread.sleep(50L);
            }
            catch (InterruptedException interruptedexception)
            {
                interruptedexception.printStackTrace();
            }
            i1++;
        }
    }

    private int d()
    {
        int j1 = 0;
        int i1 = 0;
        do
        {
label0:
            {
                if (j1 < 3)
                {
                    try
                    {
                        Sizeof.computeObjectSize(com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_OBJECT_SHELL, 50);
                        i1 = Sizeof.computeObjectSize(com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_APP_CREATED, 50);
                        Sizeof.computeObjectSize(com.kofax.kmc.kut.utilities.Sizeof.ObjectDataTypes.DATA_TYPE_OBJECT_SHELL, 50);
                    }
                    catch (Exception exception)
                    {
                        exception.printStackTrace();
                        throw new IllegalThreadStateException(exception.getMessage());
                    }
                    if (i1 <= 0)
                    {
                        break label0;
                    }
                }
                if (i1 > 0)
                {
                    return i1;
                } else
                {
                    return 0;
                }
            }
            j1++;
        } while (true);
    }

    private int e()
    {
        Log.d("AppStatsDao", "runComputeHeapSizeUsage(false)");
        c();
        a(50L);
        long l1 = a(false);
        c();
        a(50L);
        Log.d("AppStatsDao", "runComputeHeapSizeUsage(true)");
        long l2 = a(true);
        Log.d("AppStatsDao", (new StringBuilder()).append("heapUsedBase: ").append(l1).toString());
        Log.d("AppStatsDao", (new StringBuilder()).append("heapUsedAppStatObj: ").append(l2).toString());
        Log.d("AppStatsDao", (new StringBuilder()).append("instanceDao objects created: ").append(m).toString());
        return (int)((l2 - l1) / (long)m);
    }

    private static TaskRunner f()
    {
        if (o == null)
        {
            o = new TaskRunner(1);
        }
        return o;
    }

    public Integer calcObjSize(boolean flag, String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (getAppStatsDaoObjSize() != null && !flag) goto _L2; else goto _L1
_L1:
        Integer integer = getAppStatsDaoObjSizeInstCnt();
        setAppStatsDaoObjSizeInstCnt(Integer.valueOf(integer.intValue() + 1));
        if (integer.intValue() == 0)
        {
            TaskRunner taskrunner = f();
            s = new a(s);
            taskrunner.addOnTaskCompletedListener(new c(null), s, false);
            taskrunner.submit(s);
        }
_L4:
        s = getAppStatsDaoObjSize();
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (getAppStatsDaoObjSize() == null) goto _L4; else goto _L3
_L3:
        Log.d("AppStatsDao", (new StringBuilder()).append(getClass().getSimpleName()).append(".calcObjSize() returned ").append(getAppStatsDaoObjSize()).toString());
          goto _L4
        s;
        throw s;
    }

    public AppStatsDao clone()
    {
        Object obj;
        try
        {
            obj = (AppStatsDao)super.clone();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((CloneNotSupportedException) (obj)).printStackTrace();
            throw new InternalError("AppStatsDao: unexpected clone not supported exception");
        }
        obj.dsOperation = dsOperation;
        obj.daoFields = new ArrayList();
        AppStatsDaoField appstatsdaofield1;
        for (Iterator iterator = daoFields.iterator(); iterator.hasNext(); ((AppStatsDao) (obj)).daoFields.add(appstatsdaofield1))
        {
            AppStatsDaoField appstatsdaofield = (AppStatsDaoField)iterator.next();
            appstatsdaofield1 = new AppStatsDaoField(appstatsdaofield.getDsFieldName(), appstatsdaofield.getDsFieldType(), appstatsdaofield.getDbFieldType(), appstatsdaofield.getDbFieldKeyType(), appstatsdaofield.getDsValueString());
            appstatsdaofield1.setDsValueFloat(appstatsdaofield.getDsValueFloat());
            appstatsdaofield1.setDsValueInt(appstatsdaofield.getDsValueInt());
            appstatsdaofield1.setDsValueLong(appstatsdaofield.getDsValueLong());
            appstatsdaofield1.setDsValueDate(appstatsdaofield.getDsValueDate());
        }

        return ((AppStatsDao) (obj));
    }

    public volatile Object clone()
    {
        return clone();
    }

    protected abstract AppStatsDao createDaoSampleSizingObj();

    public Object genNextNewObject()
    {
        return createDaoSampleSizingObj();
    }

    protected String generateNewUniqueID()
    {
        return UUID.randomUUID().toString();
    }

    public String getAppStatsCategory()
    {
        return q.getCategory();
    }

    protected abstract Integer getAppStatsDaoObjSize();

    protected abstract Integer getAppStatsDaoObjSizeInstCnt();

    public String getAppStatsSessionKey()
    {
        return q.getSessionKey();
    }

    public AppStatsDsOpType getDsOperation()
    {
        return dsOperation;
    }

    public String getEnvironmentId()
    {
        return null;
    }

    public String getInstanceId()
    {
        return null;
    }

    protected abstract void setAppStatsDaoObjSize(Integer integer);

    protected abstract void setAppStatsDaoObjSizeInstCnt(Integer integer);

    public void setDsOperation(AppStatsDsOpType appstatsdsoptype)
    {
        dsOperation = appstatsdsoptype;
    }

    public void setEnvironmentId(String s)
    {
        throw new UnsupportedOperationException("cannot set environmentId on AppStatsDao superclass; sub-class must implement this.");
    }

    public void setInstanceId(String s)
    {
        throw new UnsupportedOperationException("cannot set instanceId on AppStatsDao superclass; sub-class must implement this.");
    }

    public abstract void writeToDb();

    static 
    {
        g = b.a;
    }

    private class a
        implements Callable
    {

        int a;
        final AppStatsDao b;
        private String c;

        public AppStatsDaoCalcObjSizeResult a()
        {
            _cls1.a[AppStatsDao.b().ordinal()];
            JVM INSTR tableswitch 1 2: default 32
        //                       1 98
        //                       2 112;
               goto _L1 _L2 _L3
_L1:
            Log.d("AppStatsDao", (new StringBuilder()).append("Bytes used per ").append(b.getClass().getSimpleName()).append(" object = ").append(a).toString());
            return b. new AppStatsDaoCalcObjSizeResult(a, c);
_L2:
            a = AppStatsDao.a(b);
            continue; /* Loop/switch isn't completed */
_L3:
            a = AppStatsDao.b(b);
            if (true) goto _L1; else goto _L4
_L4:
        }

        public Object call()
        {
            return a();
        }

        a(String s)
        {
            b = AppStatsDao.this;
            super();
            a = 0;
            c = s;
        }

        private class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }


        private class AppStatsDaoCalcObjSizeResult
        {

            final AppStatsDao a;
            public int daoObjSize;
            public String daoObjSizeId;

            public AppStatsDaoCalcObjSizeResult(int i1, String s)
            {
                a = AppStatsDao.this;
                super();
                daoObjSize = i1;
                daoObjSizeId = s;
            }
        }

    }


    private class c
        implements com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedListener
    {

        final AppStatsDao a;

        public void onTaskCompleted(com.kofax.kmc.kut.utilities.async.TaskRunner.TaskCompletedEvent taskcompletedevent)
        {
            AppStatsDao appstatsdao = a;
            appstatsdao;
            JVM INSTR monitorenter ;
            if (taskcompletedevent.getTaskError() != ErrorInfo.KMC_SUCCESS)
            {
                break MISSING_BLOCK_LABEL_193;
            }
            if (AppStatsDao.a() == null)
            {
                throw new NullPointerException("daoCalcObjSizeListener is null, indicating no listener is registered");
            }
            break MISSING_BLOCK_LABEL_38;
            taskcompletedevent;
            appstatsdao;
            JVM INSTR monitorexit ;
            throw taskcompletedevent;
            taskcompletedevent = (AppStatsDaoCalcObjSizeResult)taskcompletedevent.getTaskReturnValue();
            a.setAppStatsDaoObjSize(Integer.valueOf(((AppStatsDaoCalcObjSizeResult) (taskcompletedevent)).daoObjSize));
            Log.d("AppStatsDao", (new StringBuilder()).append(a.getClass().getSimpleName()).append(".getAppStatsDaoObjSizeInstCnt() = ").append(a.getAppStatsDaoObjSizeInstCnt()).toString());
            Integer integer = Integer.valueOf(a.getAppStatsDaoObjSizeInstCnt().intValue() * ((AppStatsDaoCalcObjSizeResult) (taskcompletedevent)).daoObjSize);
            AppStatsDao.a().daoCalcObjSizeResult(integer.intValue(), ((AppStatsDaoCalcObjSizeResult) (taskcompletedevent)).daoObjSizeId);
            Log.d("AppStatsDao", (new StringBuilder()).append(a.getClass().getSimpleName()).append(".daoCalcObjSizeResult(").append(integer).append(")").toString());
            a.setAppStatsDaoObjSizeInstCnt(Integer.valueOf(0));
            appstatsdao;
            JVM INSTR monitorexit ;
        }

        private c()
        {
            a = AppStatsDao.this;
            super();
        }

        c(_cls1 _pcls1)
        {
            this();
        }

        private class AppStatsDaoCalcObjSize
        {

            public abstract void daoCalcObjSizeResult(int i1, String s);
        }

    }


    private class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b c[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/dao/AppStatsDao$b, s);
        }

        public static b[] values()
        {
            return (b[])c.clone();
        }

        static 
        {
            a = new b("SIZEOF_ALGORITHM", 0);
            b = new b("HEAP_SIZE_USAGE_ALGORITHM", 1);
            c = (new b[] {
                a, b
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }

}
