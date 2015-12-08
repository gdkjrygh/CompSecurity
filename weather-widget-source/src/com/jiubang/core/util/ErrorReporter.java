// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gtp.a.a.b.a;
import com.gtp.a.a.b.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.jiubang.core.util:
//            ReportingInteractionMode, HttpUtils, CrashReportDialog

public class ErrorReporter
    implements Thread.UncaughtExceptionHandler
{

    private static final String ANDROID_VERSION_KEY = "AndroidVersion";
    private static final String APP_CHANNEL_KEY = "PackageChannel";
    private static final String AVAILABLE_MEM_SIZE_KEY = "AvaliableMemSize";
    private static final String BOARD_KEY = "BOARD";
    private static final String BRAND_KEY = "BRAND";
    private static final String CUSTOM_DATA_KEY = "CustomData";
    private static final String DEVICE_KEY = "DEVICE";
    private static final String DISPLAY_KEY = "DISPLAY";
    static final String ERROR_FILE_TYPE = "_stk.txt";
    static final String EXTRA_REPORT_FILE_NAME = "REPORT_FILE_NAME";
    private static final String FILE_PATH_KEY = "FilePath";
    private static final String FINGERPRINT_KEY = "FINGERPRINT";
    private static final String HOST_KEY = "HOST";
    private static final String ID_KEY = "ID";
    static final String IS_SILENT_KEY = "silent";
    private static final String LOG_TAG = "ACRA";
    private static final int MAX_SEND_REPORTS = 5;
    private static final String MODEL_KEY = "MODEL";
    private static final String OUT_OF_MEMORY_ERROR = "bitmap size exceeds VM";
    private static final String PACKAGE_NAME_KEY = "PackageName";
    private static final String PHONE_MODEL_KEY = "PhoneModel";
    private static final String PRODUCT_KEY = "PRODUCT";
    static final String SILENT_PREFIX = "silent-";
    private static final String STACK_TRACE_KEY = "StackTrace";
    private static final String SVN_KEY = "SVN";
    private static final String TAGS_KEY = "TAGS";
    private static final String TIME_KEY = "TIME";
    private static final String TOTAL_MEM_SIZE_KEY = "TotalMemSize";
    private static final String TYPE_KEY = "TYPE";
    private static final String UPGRADE_ERROR = "result:3java.lang.ArrayIndexOutOfBoundsException: result:3";
    static final String USER_COMMENT_KEY = "user.comment";
    private static final String USER_KEY = "USER";
    private static final String VERSION_CODE_KEY = "VersionCode";
    private static final String VERSION_NAME_KEY = "VersionName";
    private static final String WIDGET_INIT = "android.widget.RemoteViews.<init>";
    private static ErrorReporter sInstanceSingleton;
    private Context mContext;
    private String mCrashFilePath;
    private Properties mCrashProperties;
    private Bundle mCrashResources;
    Map mCustomParameters;
    private Thread.UncaughtExceptionHandler mDfltExceptionHandler;
    private Uri mFormUri;
    private boolean mIsOutOfMemoryError;
    private boolean mIsUpgradeError;
    private ReportingInteractionMode mReportingInteractionMode;

    public ErrorReporter()
    {
        mCrashProperties = new Properties();
        mCustomParameters = new HashMap();
        mReportingInteractionMode = ReportingInteractionMode.SILENT;
        mCrashResources = new Bundle();
        mCrashFilePath = null;
        mIsOutOfMemoryError = false;
        mIsUpgradeError = false;
    }

    private String createCustomInfoString()
    {
        Iterator iterator = mCustomParameters.keySet().iterator();
        String s;
        String s1;
        String s2;
        for (s = ""; iterator.hasNext(); s = (new StringBuilder()).append(s).append(s1).append(" = ").append(s2).append("\n").toString())
        {
            s1 = (String)iterator.next();
            s2 = (String)mCustomParameters.get(s1);
        }

        return s;
    }

    private String createSaveFilePath()
    {
        if (mCrashFilePath == null)
        {
            mCrashFilePath = a.a;
            File file = new File(mCrashFilePath);
            if (!file.exists())
            {
                file.mkdirs();
            }
        }
        return mCrashFilePath;
    }

    public static long getAvailableInternalMemorySize()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        return (long)statfs.getAvailableBlocks() * l;
    }

    public static ErrorReporter getInstance()
    {
        com/jiubang/core/util/ErrorReporter;
        JVM INSTR monitorenter ;
        if (sInstanceSingleton == null)
        {
            sInstanceSingleton = new ErrorReporter();
        }
        com/jiubang/core/util/ErrorReporter;
        JVM INSTR monitorexit ;
        return sInstanceSingleton;
        Exception exception;
        exception;
        com/jiubang/core/util/ErrorReporter;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static long getTotalInternalMemorySize()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l = statfs.getBlockSize();
        return (long)statfs.getBlockCount() * l;
    }

    private void retrieveCrashData(Context context)
    {
        String s;
        PackageInfo packageinfo;
        Properties properties;
        try
        {
            packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            c.b("ACRA", "Error while retrieving crash data", context);
            return;
        }
        if (packageinfo == null) goto _L2; else goto _L1
_L1:
        mCrashProperties.put("SVN", w.g(mContext));
        properties = mCrashProperties;
        if (packageinfo.versionName == null)
        {
            break MISSING_BLOCK_LABEL_442;
        }
        s = packageinfo.versionName;
_L5:
        properties.put("VersionName", s);
        mCrashProperties.put("VersionCode", Integer.toString(packageinfo.versionCode));
_L4:
        mCrashProperties.put("PackageChannel", w.f(mContext));
        mCrashProperties.put("PackageName", context.getPackageName());
        mCrashProperties.put("PhoneModel", Build.MODEL);
        mCrashProperties.put("AndroidVersion", android.os.Build.VERSION.RELEASE);
        mCrashProperties.put("BOARD", Build.BOARD);
        mCrashProperties.put("BRAND", Build.BRAND);
        mCrashProperties.put("DEVICE", Build.DEVICE);
        mCrashProperties.put("DISPLAY", Build.DISPLAY);
        mCrashProperties.put("FINGERPRINT", Build.FINGERPRINT);
        mCrashProperties.put("HOST", Build.HOST);
        mCrashProperties.put("ID", Build.ID);
        mCrashProperties.put("MODEL", Build.MODEL);
        mCrashProperties.put("PRODUCT", Build.PRODUCT);
        mCrashProperties.put("TAGS", Build.TAGS);
        mCrashProperties.put("TIME", (new StringBuilder()).append("").append(Build.TIME).toString());
        mCrashProperties.put("TYPE", Build.TYPE);
        mCrashProperties.put("USER", Build.USER);
        mCrashProperties.put("TotalMemSize", (new StringBuilder()).append("").append(getTotalInternalMemorySize()).toString());
        mCrashProperties.put("AvaliableMemSize", (new StringBuilder()).append("").append(getAvailableInternalMemorySize()).toString());
        mCrashProperties.put("FilePath", context.getFilesDir().getAbsolutePath());
        return;
_L2:
        mCrashProperties.put("VersionName", "Package info unavailable");
        mCrashProperties.put("VersionCode", "Package info unavailable");
        if (true) goto _L4; else goto _L3
_L3:
        s = "not set";
          goto _L5
    }

    private String saveCrashReportFile()
    {
        Object obj;
        Object obj1;
        String s;
        long l;
        try
        {
            c.a("ACRA", "Writing crash report file.");
            l = System.currentTimeMillis();
            obj = mCrashProperties.getProperty("silent");
            obj1 = createSaveFilePath();
            obj1 = (new StringBuilder()).append(((String) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            c.b("ACRA", "An error occured while writing the report file...", ((Throwable) (obj)));
            return null;
        }
        if (obj != null)
        {
            obj = "silent-";
        } else
        {
            obj = "";
        }
        obj = ((StringBuilder) (obj1)).append(((String) (obj))).append("stack-").append(l).append("_stk.txt").toString();
        obj1 = new FileOutputStream(new File(((String) (obj))), true);
        c.a("ACRA", ((String) (obj)), this);
        s = mCrashProperties.getProperty("StackTrace");
        if (!s.contains("bitmap size exceeds VM") || !s.contains("android.widget.RemoteViews.<init>")) goto _L2; else goto _L1
_L1:
        mIsOutOfMemoryError = true;
_L4:
        s = s.replaceAll("\\n\\t", "\n");
        mCrashProperties.setProperty("StackTrace", s);
        storeToOutputStream(((OutputStream) (obj1)), mCrashProperties);
        ((FileOutputStream) (obj1)).flush();
        ((FileOutputStream) (obj1)).close();
        return ((String) (obj));
_L2:
        if (!s.contains("result:3java.lang.ArrayIndexOutOfBoundsException: result:3")) goto _L4; else goto _L3
_L3:
        mIsUpgradeError = true;
          goto _L4
    }

    private void sendCrashReport(Context context, Properties properties)
    {
        properties.put("pageNumber", "0");
        properties.put("backupCache", "");
        properties.put("submit", "Envoyer");
        context = new URL(mFormUri.toString());
        c.a("ACRA", (new StringBuilder()).append("Connect to ").append(context.toString()).toString());
        HttpUtils.doPost(properties, context);
    }

    private void sendMail(Context context, String s, String s1)
    {
        c.a("ACRA", s, this);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(0x10000000);
        Object obj = context.getPackageManager();
        String s2;
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((android.content.pm.PackageManager.NameNotFoundException) (obj)).printStackTrace();
            obj = null;
        }
        if (obj != null)
        {
            obj = ((PackageInfo) (obj)).versionName;
        } else
        {
            obj = "unknow";
        }
        s2 = w.f(mContext);
        obj = (new StringBuilder()).append(" v").append(((String) (obj))).append(" ").append(s2).append(" Fix ").toString();
        obj = (new StringBuilder()).append("GO Weather EX").append(((String) (obj))).append("Error").toString();
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            "gowidgetbugs@gmail.com"
        });
        intent.putExtra("android.intent.extra.SUBJECT", ((String) (obj)));
        if (s1 != null)
        {
            intent.putExtra("android.intent.extra.TEXT", s1);
        }
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(s)));
        intent.setType("plain/text");
        context.startActivity(intent);
    }

    public void addCustomData(String s, String s1)
    {
        mCustomParameters.put(s, s1);
    }

    void checkAndSendReports(Context context, String s)
    {
        String as[];
        TreeSet treeset;
        as = getCrashReportFilesList();
        treeset = new TreeSet();
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        treeset.addAll(Arrays.asList(as));
        if (as == null) goto _L2; else goto _L1
_L1:
        if (as.length <= 0) goto _L2; else goto _L3
_L3:
        Properties properties;
        Iterator iterator;
        properties = new Properties();
        iterator = treeset.iterator();
        int i = 0;
_L14:
        if (!iterator.hasNext()) goto _L2; else goto _L4
_L4:
        String s2;
        s2 = (String)iterator.next();
        c.b("ACRA", s2);
        if (i >= 5) goto _L6; else goto _L5
_L5:
        FileInputStream fileinputstream = context.openFileInput(s2);
        properties.load(fileinputstream);
        fileinputstream.close();
        if (!s2.equals(s) && (i != treeset.size() - 1 || !mCustomParameters.containsKey("user.comment"))) goto _L8; else goto _L7
_L7:
        String s1 = properties.getProperty("CustomData");
        if (s1 != null) goto _L10; else goto _L9
_L9:
        s1 = "";
_L11:
        properties.put("CustomData", (new StringBuilder()).append(s1).append("user.comment").append(" = ").append((String)mCustomParameters.get("user.comment")).toString());
        mCustomParameters.remove("user.comment");
_L8:
        sendCrashReport(context, properties);
        (new File(context.getFilesDir(), s2)).delete();
          goto _L6
_L10:
        s1 = (new StringBuilder()).append(s1).append("\n").toString();
          goto _L11
        context;
        context.printStackTrace();
        context = mCustomParameters;
_L12:
        context.remove("user.comment");
        return;
        context;
        mCustomParameters.remove("user.comment");
        throw context;
_L2:
        context = mCustomParameters;
        if (true) goto _L12; else goto _L6
_L6:
        i++;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public void checkReportsOnApplicationStart()
    {
        String as[] = getCrashReportFilesList();
        if (as != null && as.length > 0)
        {
            boolean flag = containsOnlySilentReports(as);
            if (mReportingInteractionMode == ReportingInteractionMode.SILENT || mReportingInteractionMode == ReportingInteractionMode.TOAST || mReportingInteractionMode == ReportingInteractionMode.NOTIFICATION && flag)
            {
                if (mReportingInteractionMode == ReportingInteractionMode.TOAST)
                {
                    Toast.makeText(mContext, mCrashResources.getInt("RES_TOAST_TEXT"), 1).show();
                }
                (new ReportsSenderWorker()).start();
            } else
            if (mReportingInteractionMode == ReportingInteractionMode.NOTIFICATION)
            {
                getInstance().notifySendReport(as[as.length - 1]);
                return;
            }
        }
    }

    public boolean containsOnlySilentReports(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (!as[i].startsWith("silent-"))
            {
                return false;
            }
        }

        return true;
    }

    public void deletePendingReports()
    {
        String as[] = getCrashReportFilesList();
        if (as != null)
        {
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                (new File(mContext.getFilesDir(), s)).delete();
            }

        }
    }

    public void disable()
    {
        if (mDfltExceptionHandler != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(mDfltExceptionHandler);
        }
    }

    String[] getCrashReportFilesList()
    {
        File file = mContext.getFilesDir();
        _cls2 _lcls2 = new _cls2();
        if (file != null)
        {
            return file.list(_lcls2);
        } else
        {
            return null;
        }
    }

    public void handleException(Throwable throwable)
    {
        handleException(throwable, mReportingInteractionMode);
    }

    void handleException(Throwable throwable, ReportingInteractionMode reportinginteractionmode)
    {
        ReportingInteractionMode reportinginteractionmode1 = reportinginteractionmode;
        if (reportinginteractionmode == null)
        {
            reportinginteractionmode1 = mReportingInteractionMode;
        }
        reportinginteractionmode = throwable;
        if (throwable == null)
        {
            reportinginteractionmode = new Exception("Report requested by developer");
        }
        if (reportinginteractionmode1 == ReportingInteractionMode.TOAST)
        {
            (new _cls1()).start();
        }
        retrieveCrashData(mContext);
        mCrashProperties.put("CustomData", createCustomInfoString());
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        printwriter.append(reportinginteractionmode.getMessage());
        reportinginteractionmode.printStackTrace(printwriter);
        c.a(reportinginteractionmode);
        for (throwable = reportinginteractionmode.getCause(); throwable != null; throwable = throwable.getCause())
        {
            throwable.printStackTrace(printwriter);
        }

        mCrashProperties.put("StackTrace", stringwriter.toString());
        printwriter.close();
        mIsOutOfMemoryError = false;
        mIsUpgradeError = false;
        throwable = saveCrashReportFile();
        c.a("ACRA", throwable, this);
        if (!mIsOutOfMemoryError && !mIsUpgradeError)
        {
            if (reportinginteractionmode1 == ReportingInteractionMode.SILENT || reportinginteractionmode1 == ReportingInteractionMode.TOAST)
            {
                checkAndSendReports(mContext, null);
            } else
            if (reportinginteractionmode1 == ReportingInteractionMode.NOTIFICATION)
            {
                notifySendReport(throwable);
                return;
            }
        }
    }

    public void handleSilentException(Throwable throwable)
    {
        mCrashProperties.put("silent", "true");
        handleException(throwable, ReportingInteractionMode.SILENT);
    }

    public void init(Context context)
    {
        mDfltExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        mContext = context;
    }

    void notifySendReport(String s)
    {
        NotificationManager notificationmanager = (NotificationManager)mContext.getSystemService("notification");
        int i = 0x1080078;
        if (mCrashResources.containsKey("RES_NOTIF_ICON"))
        {
            i = mCrashResources.getInt("RES_NOTIF_ICON");
        }
        CharSequence charsequence = mContext.getText(mCrashResources.getInt("RES_NOTIF_TICKER_TEXT"));
        long l = System.currentTimeMillis();
        Notification notification = new Notification();
        notification.icon = i;
        notification.tickerText = charsequence;
        notification.when = l;
        charsequence = mContext.getText(mCrashResources.getInt("RES_NOTIF_TITLE"));
        CharSequence charsequence1 = mContext.getText(mCrashResources.getInt("RES_NOTIF_TEXT"));
        Intent intent = new Intent(mContext, com/jiubang/core/util/CrashReportDialog);
        intent.putExtra("REPORT_FILE_NAME", s);
        c.a("ACRA", s, this);
        s = PendingIntent.getActivity(mContext, 0, intent, 0);
        notification.setLatestEventInfo(mContext, charsequence, charsequence1, s);
        notificationmanager.notify(666, notification);
    }

    void setCrashResources(Bundle bundle)
    {
        mCrashResources = bundle;
    }

    public void setFormUri(Uri uri)
    {
        mFormUri = uri;
    }

    void setReportingInteractionMode(ReportingInteractionMode reportinginteractionmode)
    {
        mReportingInteractionMode = reportinginteractionmode;
    }

    public void storeToOutputStream(OutputStream outputstream, Properties properties)
    {
        this;
        JVM INSTR monitorenter ;
        if (properties != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s = System.getProperty("line.separator");
        if (s == null)
        {
            s = "\n";
        }
        StringBuilder stringbuilder = new StringBuilder();
        outputstream = new OutputStreamWriter(outputstream, "ISO8859_1");
        outputstream.write("#");
        outputstream.write((new Date()).toString());
        outputstream.write(s);
        for (properties = properties.entrySet().iterator(); properties.hasNext(); stringbuilder.setLength(0))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)properties.next();
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append('=');
            stringbuilder.append((String)entry.getValue());
            stringbuilder.append(s);
            outputstream.write(stringbuilder.toString());
        }

        break MISSING_BLOCK_LABEL_170;
        outputstream;
        throw outputstream;
        outputstream.flush();
          goto _L1
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (thread != null && thread.getName().startsWith("AdWorker"))
        {
            c.a("ADMOB", "AdWorker thread thrown an exception.", throwable);
            return;
        }
        try
        {
            disable();
            handleException(throwable);
        }
        catch (Exception exception) { }
        if (mReportingInteractionMode == ReportingInteractionMode.TOAST)
        {
            try
            {
                Thread.sleep(4000L);
            }
            catch (InterruptedException interruptedexception)
            {
                c.b("ACRA", "Error : ", interruptedexception);
            }
        }
        if (mReportingInteractionMode == ReportingInteractionMode.SILENT)
        {
            mDfltExceptionHandler.uncaughtException(thread, throwable);
            return;
        }
        thread = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 0).loadLabel(mContext.getPackageManager());
        c.b("ACRA", (new StringBuilder()).append(thread).append(" fatal error : ").append(throwable.getMessage()).toString(), throwable);
        c.a("ACRA", (new StringBuilder()).append("process id").append(Process.myPid()).toString(), this);
        Process.killProcess(Process.myPid());
_L2:
        System.exit(10);
        return;
        thread;
        c.b("ACRA", "Error : ", thread);
        c.a("ACRA", (new StringBuilder()).append("process id").append(Process.myPid()).toString(), this);
        Process.killProcess(Process.myPid());
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        c.a("ACRA", (new StringBuilder()).append("process id").append(Process.myPid()).toString(), this);
        Process.killProcess(Process.myPid());
        System.exit(10);
        throw thread;
    }




    private class ReportsSenderWorker extends Thread
    {

        private String mBody;
        private String mReportFileName;
        final ErrorReporter this$0;

        public void run()
        {
            try
            {
                sendMail(mContext, mReportFileName, mBody);
                return;
            }
            catch (Exception exception)
            {
                c.b("ACRA", "", this);
            }
        }

        void setCommentReportFileName(String s)
        {
            mReportFileName = s;
        }

        void setCustomComment(String s)
        {
            mBody = s;
        }

        ReportsSenderWorker()
        {
            this$0 = ErrorReporter.this;
            super();
            mBody = null;
            mReportFileName = null;
        }
    }


    private class _cls2
        implements FilenameFilter
    {

        final ErrorReporter this$0;

        public boolean accept(File file, String s)
        {
            return s.endsWith("_stk.txt");
        }

        _cls2()
        {
            this$0 = ErrorReporter.this;
            super();
        }
    }


    private class _cls1 extends Thread
    {

        final ErrorReporter this$0;

        public void run()
        {
            Looper.prepare();
            Toast.makeText(mContext, mCrashResources.getInt("RES_TOAST_TEXT"), 1).show();
            Looper.loop();
        }

        _cls1()
        {
            this$0 = ErrorReporter.this;
            super();
        }
    }

}
