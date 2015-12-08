// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;

import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.kofax.kmc.kut.utilities.appstats:
//            AppStatistics, AppStatsDsExportHandler

public abstract class AppStatsDataStore
{

    private static final String a = "AppStatsDataStore";
    protected AppStatistics appStats;
    protected AppStatistics.FriendAS asFriend;
    private String b;
    private File c;
    private List d;
    protected String dsUniqueId;
    private long e;
    private List f;
    private long g;

    public AppStatsDataStore()
    {
        appStats = AppStatistics.getInstance();
        AppStatistics appstatistics = appStats;
        appstatistics.getClass();
        asFriend = new AppStatistics.FriendAS(appstatistics, "com.kofax.kmc.kut.utilities.appstats");
        dsUniqueId = "";
        b = "";
        c = null;
        d = new ArrayList();
        e = 0L;
        f = new ArrayList();
        g = 0L;
    }

    static long a(AppStatsDataStore appstatsdatastore, long l)
    {
        appstatsdatastore.e = l;
        return l;
    }

    static List a(AppStatsDataStore appstatsdatastore)
    {
        return appstatsdatastore.d;
    }

    static long b(AppStatsDataStore appstatsdatastore, long l)
    {
        appstatsdatastore.g = l;
        return l;
    }

    static List b(AppStatsDataStore appstatsdatastore)
    {
        return appstatsdatastore.f;
    }

    static long c(AppStatsDataStore appstatsdatastore)
    {
        return appstatsdatastore.g;
    }

    static long c(AppStatsDataStore appstatsdatastore, long l)
    {
        l = appstatsdatastore.e + l;
        appstatsdatastore.e = l;
        return l;
    }

    static long d(AppStatsDataStore appstatsdatastore)
    {
        return appstatsdatastore.e;
    }

    static long d(AppStatsDataStore appstatsdatastore, long l)
    {
        l = appstatsdatastore.g + l;
        appstatsdatastore.g = l;
        return l;
    }

    public long calcDsSize()
    {
        if (b == null || c == null || b.isEmpty())
        {
            throw new NullPointerException("remove: dsFilePath parameter is null or empty");
        } else
        {
            return c.length();
        }
    }

    public abstract void close();

    public void export(String s, AppStatsDsExportHandler appstatsdsexporthandler, AppStatistics.DataStoreStatusCallback datastorestatuscallback)
    {
        (new Thread(new b(s, appstatsdsexporthandler, datastorestatuscallback))).start();
    }

    protected String getDsFilePath()
    {
        return b;
    }

    public abstract Object getDsHandle();

    protected String getDsUniqueId()
    {
        return dsUniqueId;
    }

    public abstract boolean isOpen();

    public abstract void open();

    public abstract void open(String s);

    public void remove()
    {
        if (b == null || b.isEmpty())
        {
            throw new NullPointerException("remove: dsFilePath parameter is null or empty");
        } else
        {
            boolean flag = (new File(b)).delete();
            Log.d("AppStatsDataStore", (new StringBuilder()).append("remove: file was deleted = ").append(flag).toString());
            return;
        }
    }

    protected transient void remove(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            if (s == null || s.isEmpty())
            {
                throw new NullPointerException("remove: dsFilePath parameter is null or empty");
            }
            boolean flag = (new File(s)).delete();
            Log.d("AppStatsDataStore", (new StringBuilder()).append("remove: (").append(s).append(") file was deleted = ").append(flag).toString());
        }

    }

    protected void setDsFilePath(String s)
    {
        if (s == null || s.isEmpty())
        {
            throw new NullPointerException("setDsFilePath: dsFilePath parameter is null or empty");
        } else
        {
            b = s;
            c = new File(s);
            return;
        }
    }

    public abstract void upgrade(String s);

    private class b
        implements Runnable
    {

        final AppStatsDataStore a;
        private String b;
        private AppStatsDsExportHandler c;
        private AppStatistics.DataStoreStatusCallback d;
        private ErrorInfo e;

        private void a(AppStatsExportListener.ExportStatus exportstatus, int i, ErrorInfo errorinfo)
        {
            a.asFriend.fireExportStatusEvent(new AppStatsExportEvent(a.appStats, exportstatus, i, errorinfo));
        }

        public void run()
        {
            Iterator iterator;
            int i;
            boolean flag = false;
            Log.d("AppStatsDataStore", "AppStatsExportRunnable: run() start");
            AppStatsDataStore.a(a).clear();
            AppStatsDataStore.b(a).clear();
            AppStatsDataStore.a(a, 0L);
            AppStatsDataStore.b(a, 0L);
            c.configDsExpFilePath(b);
            a(AppStatsExportListener.ExportStatus.EXPORTING, 0, e);
            a aa[] = a.values();
            int k = aa.length;
            i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                a a1 = aa[i];
                try
                {
                    Class class1 = Class.forName(a1.a());
                    Long long1 = (Long)class1.getMethod("countRows", (Class[])null).invoke(null, new Object[0]);
                    if (long1.longValue() > 0L)
                    {
                        AppStatsDataStore.a(a).add(class1);
                        AppStatsDataStore.b(a).add(long1);
                        AppStatsDataStore.c(a, long1.longValue());
                    }
                }
                catch (ClassNotFoundException classnotfoundexception)
                {
                    classnotfoundexception.printStackTrace();
                    throw new TypeNotPresentException(a1.a(), new Throwable(classnotfoundexception));
                }
                catch (IllegalAccessException illegalaccessexception1)
                {
                    illegalaccessexception1.printStackTrace();
                    throw new TypeNotPresentException(a1.a(), new Throwable(illegalaccessexception1));
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    illegalargumentexception.printStackTrace();
                    throw illegalargumentexception;
                }
                catch (InvocationTargetException invocationtargetexception)
                {
                    invocationtargetexception.printStackTrace();
                    throw new IllegalArgumentException(invocationtargetexception.getMessage(), invocationtargetexception);
                }
                catch (NoSuchMethodException nosuchmethodexception)
                {
                    nosuchmethodexception.printStackTrace();
                    throw new IllegalArgumentException(nosuchmethodexception.getMessage(), nosuchmethodexception);
                }
                i++;
            } while (true);
            iterator = AppStatsDataStore.a(a).iterator();
            i = ((flag) ? 1 : 0);
_L3:
            Object obj;
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_551;
            }
            obj = (Class)iterator.next();
            int j;
            ((Class) (obj)).getMethod("export", new Class[] {
                java/lang/String, com/kofax/kmc/kut/utilities/appstats/AppStatsDsExportHandler
            }).invoke(null, new Object[] {
                b, c
            });
            AppStatsDataStore.d(a, ((Long)AppStatsDataStore.b(a).get(i)).longValue());
            j = (int)Math.round((double)((float)AppStatsDataStore.c(a) / (float)AppStatsDataStore.d(a)) * 100D);
            if (AppStatsDataStore.c(a) != AppStatsDataStore.d(a))
            {
                break MISSING_BLOCK_LABEL_483;
            }
            obj = AppStatsExportListener.ExportStatus.COMPLETE;
_L1:
            if (obj != AppStatsExportListener.ExportStatus.EXPORTING)
            {
                d.dataStoreExportComplete(e);
            }
            a(((AppStatsExportListener.ExportStatus) (obj)), j, e);
            i++;
            continue; /* Loop/switch isn't completed */
            try
            {
                obj = AppStatsExportListener.ExportStatus.EXPORTING;
            }
            catch (NoSuchMethodException nosuchmethodexception1)
            {
                nosuchmethodexception1.printStackTrace();
                throw new IllegalArgumentException(nosuchmethodexception1.getMessage(), nosuchmethodexception1);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                illegalargumentexception1.printStackTrace();
                throw illegalargumentexception1;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                illegalaccessexception.printStackTrace();
                throw new IllegalArgumentException(illegalaccessexception.getMessage(), illegalaccessexception);
            }
            catch (InvocationTargetException invocationtargetexception1)
            {
                invocationtargetexception1.printStackTrace();
                throw new IllegalArgumentException(invocationtargetexception1.getMessage(), invocationtargetexception1);
            }
              goto _L1
            if (AppStatsDataStore.d(a) == 0L)
            {
                d.dataStoreExportComplete(e);
                a(AppStatsExportListener.ExportStatus.COMPLETE, 100, ErrorInfo.KMC_UT_STATS_NOTHING_TO_EXPORT);
            }
            Log.d("AppStatsDataStore", "AppStatsExportRunnable: run() end");
            return;
            if (true) goto _L3; else goto _L2
_L2:
        }

        b(String s, AppStatsDsExportHandler appstatsdsexporthandler, AppStatistics.DataStoreStatusCallback datastorestatuscallback)
        {
            a = AppStatsDataStore.this;
            super();
            e = ErrorInfo.KMC_SUCCESS;
            b = s;
            c = appstatsdsexporthandler;
            d = datastorestatuscallback;
        }

        private class a extends Enum
        {

            public static final a a;
            public static final a b;
            public static final a c;
            public static final a d;
            public static final a e;
            public static final a f;
            public static final a g;
            public static final a h;
            public static final a i;
            public static final a j;
            public static final a k;
            public static final a l;
            public static final a m;
            private static final a o[];
            private String n;

            public static a valueOf(String s)
            {
                return (a)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatsDataStore$a, s);
            }

            public static a[] values()
            {
                return (a[])o.clone();
            }

            public String a()
            {
                return n;
            }

            static 
            {
                a = new a("DAO_CLASS_ENVIRONMENT_EVENT", 0, "com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao");
                b = new a("DAO_CLASS_ERROR_LOG_EVENT", 1, "com.kofax.kmc.kut.utilities.appstats.dao.ErrorLogEventDao");
                c = new a("DAO_CLASS_DOCUMENT_EVENT", 2, "com.kofax.kmc.kut.utilities.appstats.dao.DocumentEventDao");
                d = new a("DAO_CLASS_SESSION_EVENT", 3, "com.kofax.kmc.kut.utilities.appstats.dao.SessEventDao");
                e = new a("DAO_CLASS_IMAGE", 4, "com.kofax.kmc.kut.utilities.appstats.dao.ImageDao");
                f = new a("DAO_CLASS_EVENT_INSTANCE", 5, "com.kofax.kmc.kut.utilities.appstats.dao.EventInstanceDao");
                g = new a("DAO_CLASS_IMG_CLASSIFIER_EVENT", 6, "com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventDao");
                h = new a("DAO_CLASS_IMG_CLASSIFIER_EVENT_ALT", 7, "com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventAltDao");
                i = new a("DAO_CLASS_IMG_CAPTURE_EVENT", 8, "com.kofax.kmc.kut.utilities.appstats.dao.ImgCaptureEventDao");
                j = new a("DAO_CLASS_PROPERTY_CHANGE_EVENT", 9, "com.kofax.kmc.kut.utilities.appstats.dao.PropertyChangeEventDao");
                k = new a("DAO_CLASS_IMG_FIELD_CHANGED_EVENT", 10, "com.kofax.kmc.kut.utilities.appstats.dao.FieldEventDao");
                l = new a("DAO_CLASS_IMAGE_PROCESSED_EVENT", 11, "com.kofax.kmc.kut.utilities.appstats.dao.ImageProcessEventDao");
                m = new a("DAO_CLASS_OCR_EVENT", 12, "com.kofax.kmc.kut.utilities.appstats.dao.OCREventDao");
                o = (new a[] {
                    a, b, c, d, e, f, g, h, i, j, 
                    k, l, m
                });
            }

            private a(String s, int i1, String s1)
            {
                super(s, i1);
                n = s1;
            }
        }

    }

}
