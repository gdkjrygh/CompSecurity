// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.crashlytics.android.core.internal.models.SessionEventData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.DeliveryMechanism;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.crashlytics.android.core:
//            CrashlyticsCore, LogFileManager, ClsFileOutputStream, CLSUUID, 
//            CodedOutputStream, ExceptionUtils, UserMetaData, MetaDataStore, 
//            CrashlyticsListener, CrashlyticsExecutorServiceWrapper, Utils, SessionDataWriter, 
//            NativeCrashWriter, ReportUploader, SessionReport

class CrashlyticsUncaughtExceptionHandler
    implements Thread.UncaughtExceptionHandler
{
    private static class AnySessionPartFileFilter
        implements FilenameFilter
    {

        public boolean accept(File file, String s)
        {
            return !CrashlyticsUncaughtExceptionHandler.SESSION_FILE_FILTER.accept(file, s) && CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(s).matches();
        }

        private AnySessionPartFileFilter()
        {
        }

    }

    static class FileNameContainsFilter
        implements FilenameFilter
    {

        private final String string;

        public boolean accept(File file, String s)
        {
            return s.contains(string) && !s.endsWith(".cls_temp");
        }

        public FileNameContainsFilter(String s)
        {
            string = s;
        }
    }

    static class SessionPartFileFilter
        implements FilenameFilter
    {

        private final String sessionId;

        public boolean accept(File file, String s)
        {
            while (s.equals((new StringBuilder()).append(sessionId).append(".cls").toString()) || !s.contains(sessionId) || s.endsWith(".cls_temp")) 
            {
                return false;
            }
            return true;
        }

        public SessionPartFileFilter(String s)
        {
            sessionId = s;
        }
    }


    private static final int ANALYZER_VERSION = 1;
    static final FilenameFilter ANY_SESSION_FILENAME_FILTER = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return CrashlyticsUncaughtExceptionHandler.SESSION_FILE_PATTERN.matcher(s).matches();
        }

    };
    static final String CLS_CRASH_MARKER_FILE_NAME = "crash_marker";
    private static final String EVENT_TYPE_CRASH = "crash";
    private static final String EVENT_TYPE_LOGGED = "error";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    static final String INVALID_CLS_CACHE_DIR = "invalidClsFiles";
    static final Comparator LARGEST_FILE_NAME_FIRST = new Comparator() {

        public int compare(File file, File file1)
        {
            return file1.getName().compareTo(file.getName());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((File)obj, (File)obj1);
        }

    };
    private static final int MAX_COMPLETE_SESSIONS_COUNT = 4;
    private static final int MAX_LOCAL_LOGGED_EXCEPTIONS = 64;
    static final int MAX_OPEN_SESSIONS = 8;
    private static final Map SEND_AT_CRASHTIME_HEADER = Collections.singletonMap("X-CRASHLYTICS-SEND-FLAGS", "1");
    static final String SESSION_APP_TAG = "SessionApp";
    static final String SESSION_BEGIN_TAG = "BeginSession";
    static final String SESSION_DEVICE_TAG = "SessionDevice";
    static final String SESSION_FATAL_TAG = "SessionCrash";
    static final FilenameFilter SESSION_FILE_FILTER = new FilenameFilter() {

        public boolean accept(File file, String s)
        {
            return s.length() == ".cls".length() + 35 && s.endsWith(".cls");
        }

    };
    private static final Pattern SESSION_FILE_PATTERN = Pattern.compile("([\\d|A-Z|a-z]{12}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{4}\\-[\\d|A-Z|a-z]{12}).+");
    private static final int SESSION_ID_LENGTH = 35;
    static final String SESSION_NON_FATAL_TAG = "SessionEvent";
    static final String SESSION_OS_TAG = "SessionOS";
    static final String SESSION_USER_TAG = "SessionUser";
    static final Comparator SMALLEST_FILE_NAME_FIRST = new Comparator() {

        public int compare(File file, File file1)
        {
            return file.getName().compareTo(file1.getName());
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((File)obj, (File)obj1);
        }

    };
    private final CrashlyticsCore crashlyticsCore;
    private final Thread.UncaughtExceptionHandler defaultHandler;
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final CrashlyticsExecutorServiceWrapper executorServiceWrapper;
    private final File filesDir;
    private final IdManager idManager;
    private final AtomicBoolean isHandlingException = new AtomicBoolean(false);
    private final LogFileManager logFileManager;
    private boolean powerConnected;
    private final BroadcastReceiver powerConnectedReceiver = new BroadcastReceiver() {

        final CrashlyticsUncaughtExceptionHandler this$0;

        public void onReceive(Context context, Intent intent)
        {
            powerConnected = true;
        }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    };
    private final BroadcastReceiver powerDisconnectedReceiver = new BroadcastReceiver() {

        final CrashlyticsUncaughtExceptionHandler this$0;

        public void onReceive(Context context, Intent intent)
        {
            powerConnected = false;
        }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
    };
    private final AtomicBoolean receiversRegistered = new AtomicBoolean(false);
    private final SessionDataWriter sessionDataWriter;

    CrashlyticsUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashlyticsListener crashlyticslistener, CrashlyticsExecutorServiceWrapper crashlyticsexecutorservicewrapper, IdManager idmanager, SessionDataWriter sessiondatawriter, CrashlyticsCore crashlyticscore)
    {
        defaultHandler = uncaughtexceptionhandler;
        executorServiceWrapper = crashlyticsexecutorservicewrapper;
        idManager = idmanager;
        crashlyticsCore = crashlyticscore;
        sessionDataWriter = sessiondatawriter;
        filesDir = crashlyticscore.getSdkDirectory();
        logFileManager = new LogFileManager(crashlyticscore.getContext(), filesDir);
        notifyCrashlyticsListenerOfPreviousCrash(crashlyticslistener);
        uncaughtexceptionhandler = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
        crashlyticslistener = new IntentFilter("android.intent.action.ACTION_POWER_DISCONNECTED");
        crashlyticsexecutorservicewrapper = crashlyticscore.getContext();
        crashlyticsexecutorservicewrapper.registerReceiver(powerConnectedReceiver, uncaughtexceptionhandler);
        crashlyticsexecutorservicewrapper.registerReceiver(powerDisconnectedReceiver, crashlyticslistener);
        receiversRegistered.set(true);
    }

    private void closeWithoutRenamingOrLog(ClsFileOutputStream clsfileoutputstream)
    {
        if (clsfileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        clsfileoutputstream.closeInProgressStream();
        return;
        clsfileoutputstream;
        Fabric.getLogger().e("CrashlyticsCore", "Error closing session file stream in the presence of an exception", clsfileoutputstream);
        return;
    }

    private void deleteLegacyInvalidCacheDir()
    {
        File file = new File(crashlyticsCore.getSdkDirectory(), "invalidClsFiles");
        if (file.exists())
        {
            if (file.isDirectory())
            {
                File afile[] = file.listFiles();
                int j = afile.length;
                for (int i = 0; i < j; i++)
                {
                    afile[i].delete();
                }

            }
            file.delete();
        }
    }

    private void deleteSessionPartFilesFor(String s)
    {
        s = listSessionPartFilesFor(s);
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            s[i].delete();
        }

    }

    private void doCloseSessions(boolean flag)
        throws Exception
    {
        File afile[];
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        trimOpenSessions(i + 8);
        afile = listSessionBeginFiles();
        Arrays.sort(afile, LARGEST_FILE_NAME_FIRST);
        if (afile.length > i)
        {
            writeSessionUser(getSessionIdFromSessionFile(afile[i]));
            SessionSettingsData sessionsettingsdata = crashlyticsCore.getSessionSettingsData();
            if (sessionsettingsdata != null)
            {
                int j = sessionsettingsdata.maxCustomExceptionEvents;
                Fabric.getLogger().d("CrashlyticsCore", "Closing open sessions.");
                for (; i < afile.length; i++)
                {
                    File file = afile[i];
                    String s = getSessionIdFromSessionFile(file);
                    Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Closing session: ").append(s).toString());
                    writeSessionPartsToSessionFile(file, s, j);
                }

            } else
            {
                Fabric.getLogger().d("CrashlyticsCore", "Unable to close session. Settings are not loaded.");
            }
            return;
        } else
        {
            Fabric.getLogger().d("CrashlyticsCore", "No open sessions to be closed.");
            return;
        }
    }

    private void doOpenSession()
        throws Exception
    {
        Date date = new Date();
        String s = (new CLSUUID(idManager)).toString();
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Opening an new session with ID ").append(s).toString());
        writeBeginSession(s, date);
        writeSessionApp(s);
        writeSessionOS(s);
        writeSessionDevice(s);
        logFileManager.setCurrentSession(s);
    }

    private void doWriteNonFatal(Date date, Thread thread, Throwable throwable)
    {
        String s = getCurrentSessionId();
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        ClsFileOutputStream clsfileoutputstream;
        CodedOutputStream codedoutputstream;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        CrashlyticsCore.recordLoggedExceptionEvent(s);
        clsfileoutputstream = null;
        obj2 = null;
        obj5 = null;
        obj4 = null;
        obj3 = null;
        codedoutputstream = null;
        obj = obj5;
        obj1 = clsfileoutputstream;
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Crashlytics is logging non-fatal exception \"").append(throwable).append("\" from thread ").append(thread.getName()).toString());
        obj = obj5;
        obj1 = clsfileoutputstream;
        String s1 = CommonUtils.padWithZerosToMaxIntWidth(eventCounter.getAndIncrement());
        obj = obj5;
        obj1 = clsfileoutputstream;
        s1 = (new StringBuilder()).append(s).append("SessionEvent").append(s1).toString();
        obj = obj5;
        obj1 = clsfileoutputstream;
        clsfileoutputstream = new ClsFileOutputStream(filesDir, s1);
        obj = obj4;
        obj1 = obj3;
        codedoutputstream = CodedOutputStream.newInstance(clsfileoutputstream);
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        writeSessionEvent(codedoutputstream, date, thread, throwable, "error", false);
        CommonUtils.flushOrLog(codedoutputstream, "Failed to flush to non-fatal file.");
        CommonUtils.closeOrLog(clsfileoutputstream, "Failed to close non-fatal file output stream.");
        break MISSING_BLOCK_LABEL_215;
        throwable;
        thread = obj2;
        date = codedoutputstream;
_L6:
        obj = date;
        obj1 = thread;
        Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the non-fatal exception logger", throwable);
        obj = date;
        obj1 = thread;
        ExceptionUtils.writeStackTraceIfNotNull(throwable, thread);
        CommonUtils.flushOrLog(date, "Failed to flush to non-fatal file.");
        CommonUtils.closeOrLog(thread, "Failed to close non-fatal file output stream.");
          goto _L3
        date;
_L5:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to non-fatal file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close non-fatal file output stream.");
        throw date;
_L3:
        try
        {
            trimSessionEventFiles(s, 64);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Date date)
        {
            Fabric.getLogger().e("CrashlyticsCore", "An error occurred when trimming non-fatal files.", date);
        }
        return;
_L2:
        Fabric.getLogger().e("CrashlyticsCore", "Tried to write a non-fatal exception while no session was open.", null);
        return;
        date;
        obj1 = clsfileoutputstream;
        if (true) goto _L5; else goto _L4
_L4:
        throwable;
        thread = clsfileoutputstream;
        date = ((Date) (obj1));
          goto _L6
    }

    private File[] ensureFileArrayNotNull(File afile[])
    {
        File afile1[] = afile;
        if (afile == null)
        {
            afile1 = new File[0];
        }
        return afile1;
    }

    private String getCurrentSessionId()
    {
        File afile[] = listSessionBeginFiles();
        Arrays.sort(afile, LARGEST_FILE_NAME_FIRST);
        if (afile.length > 0)
        {
            return getSessionIdFromSessionFile(afile[0]);
        } else
        {
            return null;
        }
    }

    private String getPreviousSessionId()
    {
        File afile[] = listSessionBeginFiles();
        Arrays.sort(afile, LARGEST_FILE_NAME_FIRST);
        if (afile.length > 1)
        {
            return getSessionIdFromSessionFile(afile[1]);
        } else
        {
            return null;
        }
    }

    private String getSessionIdFromSessionFile(File file)
    {
        return file.getName().substring(0, 35);
    }

    private UserMetaData getUserMetaData(String s)
    {
        if (isHandlingException())
        {
            return new UserMetaData(crashlyticsCore.getUserIdentifier(), crashlyticsCore.getUserName(), crashlyticsCore.getUserEmail());
        } else
        {
            return (new MetaDataStore(filesDir)).readUserData(s);
        }
    }

    private void handleUncaughtException(Date date, Thread thread, Throwable throwable)
        throws Exception
    {
        writeFatal(date, thread, throwable);
        doCloseSessions();
        doOpenSession();
        trimSessionFiles();
        if (!crashlyticsCore.shouldPromptUserBeforeSendingCrashReports())
        {
            sendSessionReports();
        }
    }

    private File[] listCompleteSessionFiles()
    {
        return listFilesMatching(SESSION_FILE_FILTER);
    }

    private File[] listFilesMatching(FilenameFilter filenamefilter)
    {
        return ensureFileArrayNotNull(filesDir.listFiles(filenamefilter));
    }

    private File[] listSessionPartFilesFor(String s)
    {
        return listFilesMatching(new SessionPartFileFilter(s));
    }

    private void notifyCrashlyticsListenerOfPreviousCrash(CrashlyticsListener crashlyticslistener)
    {
        Fabric.getLogger().d("CrashlyticsCore", "Checking for previous crash marker.");
        File file = new File(crashlyticsCore.getSdkDirectory(), "crash_marker");
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        file.delete();
        if (crashlyticslistener == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        crashlyticslistener.crashlyticsDidDetectCrashDuringPreviousExecution();
        return;
        crashlyticslistener;
        Fabric.getLogger().e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", crashlyticslistener);
        return;
    }

    private void sendSessionReports()
    {
        File afile[] = listCompleteSessionFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            final File toSend = afile[i];
            executorServiceWrapper.executeAsync(new Runnable() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final File val$toSend;

                public void run()
                {
                    if (CommonUtils.canTryConnection(crashlyticsCore.getContext()))
                    {
                        Fabric.getLogger().d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
                        Object obj = Settings.getInstance().awaitSettingsData();
                        obj = crashlyticsCore.getCreateReportSpiCall(((io.fabric.sdk.android.services.settings.SettingsData) (obj)));
                        if (obj != null)
                        {
                            (new ReportUploader(((CreateReportSpiCall) (obj)))).forceUpload(new SessionReport(toSend, CrashlyticsUncaughtExceptionHandler.SEND_AT_CRASHTIME_HEADER));
                        }
                    }
                }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                toSend = file;
                super();
            }
            });
        }

    }

    private void trimOpenSessions(int i)
    {
        HashSet hashset = new HashSet();
        File afile[] = listSessionBeginFiles();
        Arrays.sort(afile, LARGEST_FILE_NAME_FIRST);
        int j = Math.min(i, afile.length);
        for (i = 0; i < j; i++)
        {
            hashset.add(getSessionIdFromSessionFile(afile[i]));
        }

        logFileManager.discardOldLogFiles(hashset);
        afile = listFilesMatching(new AnySessionPartFileFilter());
        j = afile.length;
        for (i = 0; i < j; i++)
        {
            File file = afile[i];
            String s = file.getName();
            Matcher matcher = SESSION_FILE_PATTERN.matcher(s);
            matcher.matches();
            if (!hashset.contains(matcher.group(1)))
            {
                Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Trimming open session file: ").append(s).toString());
                file.delete();
            }
        }

    }

    private void trimSessionEventFiles(String s, int i)
    {
        Utils.capFileCount(filesDir, new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()), i, SMALLEST_FILE_NAME_FIRST);
    }

    private void writeBeginSession(String s, Date date)
        throws Exception
    {
        Object obj;
        Object obj1;
        CodedOutputStream codedoutputstream;
        String s1;
        Object obj3;
        Object obj4;
        obj1 = null;
        s1 = null;
        obj = null;
        obj4 = null;
        obj3 = null;
        codedoutputstream = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("BeginSession").toString());
        obj = obj4;
        obj1 = obj3;
        codedoutputstream = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        s1 = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[] {
            crashlyticsCore.getVersion()
        });
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        long l = date.getTime() / 1000L;
        obj = codedoutputstream;
        obj1 = codedoutputstream;
        sessionDataWriter.writeBeginSession(codedoutputstream, s, s1, l);
        CommonUtils.flushOrLog(codedoutputstream, "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close begin session file.");
        return;
        obj2;
        date = s1;
        s = codedoutputstream;
_L4:
        obj = s;
        obj1 = date;
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj2)), date);
        obj = s;
        obj1 = date;
        throw obj2;
        s;
_L2:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close begin session file.");
        throw s;
        s;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        date = ((Date) (obj2));
        s = ((String) (obj1));
        obj2 = exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeExternalCrashEvent(SessionEventData sessioneventdata)
        throws IOException
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Map map;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        map = null;
        obj7 = null;
        obj2 = null;
        obj3 = null;
        obj8 = null;
        obj5 = null;
        obj4 = null;
        obj6 = null;
        obj = obj8;
        obj1 = obj7;
        String s = getPreviousSessionId();
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = obj8;
        obj1 = obj7;
        CrashlyticsCore.recordFatalExceptionEvent(s);
        obj = obj8;
        obj1 = obj7;
        obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionCrash").toString());
        obj = obj5;
        obj3 = obj4;
        obj1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        obj = obj1;
        obj3 = obj1;
        map = (new MetaDataStore(filesDir)).readKeyData(s);
        obj = obj1;
        obj3 = obj1;
        NativeCrashWriter.writeNativeCrash(sessioneventdata, new LogFileManager(crashlyticsCore.getContext(), filesDir, s), map, ((CodedOutputStream) (obj1)));
        sessioneventdata = ((SessionEventData) (obj2));
_L4:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(sessioneventdata, "Failed to close fatal exception file output stream.");
        return;
_L2:
        obj = obj8;
        obj1 = obj7;
        Fabric.getLogger().e("CrashlyticsCore", "Tried to write a native crash while no session was open.", null);
        obj1 = obj6;
        sessioneventdata = ((SessionEventData) (obj2));
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        sessioneventdata = map;
_L8:
        obj = obj3;
        obj1 = sessioneventdata;
        Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the native crash logger", ((Throwable) (obj2)));
        obj = obj3;
        obj1 = sessioneventdata;
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj2)), sessioneventdata);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj3)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(sessioneventdata, "Failed to close fatal exception file output stream.");
        return;
        sessioneventdata;
_L6:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
        throw sessioneventdata;
        sessioneventdata;
        obj1 = obj2;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        sessioneventdata = ((SessionEventData) (obj2));
        obj2 = exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void writeFatal(Date date, Thread thread, Throwable throwable)
    {
        Object obj;
        Object obj1;
        ClsFileOutputStream clsfileoutputstream;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        obj3 = null;
        obj7 = null;
        clsfileoutputstream = null;
        obj2 = null;
        obj8 = null;
        obj5 = null;
        obj4 = null;
        obj6 = null;
        obj = obj8;
        obj1 = obj7;
        (new File(filesDir, "crash_marker")).createNewFile();
        obj = obj8;
        obj1 = obj7;
        String s = getCurrentSessionId();
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = obj8;
        obj1 = obj7;
        CrashlyticsCore.recordFatalExceptionEvent(s);
        obj = obj8;
        obj1 = obj7;
        clsfileoutputstream = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionCrash").toString());
        obj = obj5;
        obj2 = obj4;
        obj1 = CodedOutputStream.newInstance(clsfileoutputstream);
        obj = obj1;
        obj2 = obj1;
        writeSessionEvent(((CodedOutputStream) (obj1)), date, thread, throwable, "crash", true);
        date = clsfileoutputstream;
_L4:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(date, "Failed to close fatal exception file output stream.");
        return;
_L2:
        obj = obj8;
        obj1 = obj7;
        Fabric.getLogger().e("CrashlyticsCore", "Tried to write a fatal exception while no session was open.", null);
        obj1 = obj6;
        date = clsfileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
        thread;
        date = obj3;
_L8:
        obj = obj2;
        obj1 = date;
        Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the fatal exception logger", thread);
        obj = obj2;
        obj1 = date;
        ExceptionUtils.writeStackTraceIfNotNull(thread, date);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj2)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(date, "Failed to close fatal exception file output stream.");
        return;
        date;
_L6:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush to session begin file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close fatal exception file output stream.");
        throw date;
        date;
        obj1 = clsfileoutputstream;
        if (true) goto _L6; else goto _L5
_L5:
        thread;
        date = clsfileoutputstream;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void writeInitialPartsTo(CodedOutputStream codedoutputstream, String s)
        throws IOException
    {
        String as[] = new String[4];
        as[0] = "SessionUser";
        as[1] = "SessionApp";
        as[2] = "SessionOS";
        as[3] = "SessionDevice";
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s1 = as[i];
            File afile[] = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append(s1).toString()));
            if (afile.length == 0)
            {
                Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Can't find ").append(s1).append(" data for session ID ").append(s).toString(), null);
            } else
            {
                Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Collecting ").append(s1).append(" data for session ID ").append(s).toString());
                writeToCosFromFile(codedoutputstream, afile[0]);
            }
            i++;
        }
    }

    private void writeNonFatalEventsTo(CodedOutputStream codedoutputstream, File afile[], String s)
    {
        Arrays.sort(afile, CommonUtils.FILE_MODIFIED_COMPARATOR);
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            try
            {
                Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Found Non Fatal for session ID %s in %s ", new Object[] {
                    s, file.getName()
                }));
                writeToCosFromFile(codedoutputstream, file);
            }
            catch (Exception exception)
            {
                Fabric.getLogger().e("CrashlyticsCore", "Error writting non-fatal to session.", exception);
            }
            i++;
        }
    }

    private void writeSessionApp(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj3;
        String s1;
        String s2;
        String s3;
        obj1 = null;
        obj3 = null;
        obj = null;
        s3 = null;
        s2 = null;
        s1 = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionApp").toString());
        s = s3;
        obj = s2;
        obj1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        s = ((String) (obj1));
        obj = obj1;
        obj3 = crashlyticsCore.getPackageName();
        s = ((String) (obj1));
        obj = obj1;
        s1 = crashlyticsCore.getVersionCode();
        s = ((String) (obj1));
        obj = obj1;
        s2 = crashlyticsCore.getVersionName();
        s = ((String) (obj1));
        obj = obj1;
        s3 = idManager.getAppInstallIdentifier();
        s = ((String) (obj1));
        obj = obj1;
        int i = DeliveryMechanism.determineFrom(crashlyticsCore.getInstallerPackageName()).getId();
        s = ((String) (obj1));
        obj = obj1;
        sessionDataWriter.writeSessionApp(((CodedOutputStream) (obj1)), ((String) (obj3)), s1, s2, s3, i);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session app file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session app file.");
        return;
        s;
        obj2 = obj3;
        obj3 = s;
        s = s1;
_L4:
        obj = s;
        obj1 = obj2;
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj3)), ((java.io.OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        obj2;
        s = ((String) (obj));
        obj = obj2;
_L2:
        CommonUtils.flushOrLog(s, "Failed to flush to session app file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session app file.");
        throw obj;
        obj;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionDevice(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj3;
        String s1;
        Object obj4;
        Object obj5;
        obj1 = null;
        obj3 = null;
        obj = null;
        obj5 = null;
        obj4 = null;
        s1 = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionDevice").toString());
        s = obj5;
        obj = obj4;
        obj1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        s = ((String) (obj1));
        obj = obj1;
        obj3 = crashlyticsCore.getContext();
        s = ((String) (obj1));
        obj = obj1;
        obj4 = new StatFs(Environment.getDataDirectory().getPath());
        s = ((String) (obj1));
        obj = obj1;
        s1 = idManager.getDeviceUUID();
        s = ((String) (obj1));
        obj = obj1;
        int i = CommonUtils.getCpuArchitectureInt();
        s = ((String) (obj1));
        obj = obj1;
        int j = Runtime.getRuntime().availableProcessors();
        s = ((String) (obj1));
        obj = obj1;
        long l = CommonUtils.getTotalRamInBytes();
        s = ((String) (obj1));
        obj = obj1;
        long l1 = ((StatFs) (obj4)).getBlockCount();
        s = ((String) (obj1));
        obj = obj1;
        long l2 = ((StatFs) (obj4)).getBlockSize();
        s = ((String) (obj1));
        obj = obj1;
        boolean flag = CommonUtils.isEmulator(((Context) (obj3)));
        s = ((String) (obj1));
        obj = obj1;
        obj4 = idManager.getDeviceIdentifiers();
        s = ((String) (obj1));
        obj = obj1;
        int k = CommonUtils.getDeviceState(((Context) (obj3)));
        s = ((String) (obj1));
        obj = obj1;
        sessionDataWriter.writeSessionDevice(((CodedOutputStream) (obj1)), s1, i, Build.MODEL, j, l, l1 * l2, flag, ((Map) (obj4)), k, Build.MANUFACTURER, Build.PRODUCT);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush session device info.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session device file.");
        return;
        s;
        obj2 = obj3;
        obj3 = s;
        s = s1;
_L4:
        obj = s;
        obj1 = obj2;
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj3)), ((java.io.OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        obj2;
        s = ((String) (obj));
        obj = obj2;
_L2:
        CommonUtils.flushOrLog(s, "Failed to flush session device info.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session device file.");
        throw obj;
        obj;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionEvent(CodedOutputStream codedoutputstream, Date date, Thread thread, Throwable throwable, String s, boolean flag)
        throws Exception
    {
        float f;
        Thread athread[];
        Context context;
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        LinkedList linkedlist;
        StackTraceElement astacktraceelement[];
        int j;
        int k;
        long l;
        long l1;
        long l2;
        long l3;
        boolean flag1;
        context = crashlyticsCore.getContext();
        l = date.getTime() / 1000L;
        f = CommonUtils.getBatteryLevel(context);
        j = CommonUtils.getBatteryVelocity(context, powerConnected);
        flag1 = CommonUtils.getProximitySensorEnabled(context);
        k = context.getResources().getConfiguration().orientation;
        l1 = CommonUtils.getTotalRamInBytes();
        l2 = CommonUtils.calculateFreeRamInBytes(context);
        l3 = CommonUtils.calculateUsedDiskSpaceInBytes(Environment.getDataDirectory().getPath());
        runningappprocessinfo = CommonUtils.getAppProcessInfo(context.getPackageName(), context);
        linkedlist = new LinkedList();
        astacktraceelement = throwable.getStackTrace();
        if (flag)
        {
            Map map = Thread.getAllStackTraces();
            date = new Thread[map.size()];
            int i = 0;
            Iterator iterator = map.entrySet().iterator();
            do
            {
                athread = date;
                if (!iterator.hasNext())
                {
                    break;
                }
                athread = (java.util.Map.Entry)iterator.next();
                date[i] = (Thread)athread.getKey();
                linkedlist.add(athread.getValue());
                i++;
            } while (true);
        } else
        {
            athread = new Thread[0];
        }
        if (CommonUtils.getBooleanResourceValue(context, "com.crashlytics.CollectCustomKeys", true)) goto _L2; else goto _L1
_L1:
        date = new TreeMap();
_L4:
        sessionDataWriter.writeSessionEvent(codedoutputstream, l, thread, throwable, s, athread, f, j, flag1, k, l1 - l2, l3, runningappprocessinfo, linkedlist, astacktraceelement, logFileManager, date);
        return;
_L2:
        Map map1 = crashlyticsCore.getAttributes();
        date = map1;
        if (map1 != null)
        {
            date = map1;
            if (map1.size() > 1)
            {
                date = new TreeMap(map1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionOS(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj1 = null;
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj4 = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionOS").toString());
        s = obj6;
        obj = obj5;
        obj1 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        s = ((String) (obj1));
        obj = obj1;
        boolean flag = CommonUtils.isRooted(crashlyticsCore.getContext());
        s = ((String) (obj1));
        obj = obj1;
        sessionDataWriter.writeSessionOS(((CodedOutputStream) (obj1)), flag);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj1)), "Failed to flush to session OS file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session OS file.");
        return;
        s;
        obj2 = obj3;
        obj3 = s;
        s = obj4;
_L4:
        obj = s;
        obj1 = obj2;
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj3)), ((java.io.OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        obj2;
        s = ((String) (obj));
_L2:
        CommonUtils.flushOrLog(s, "Failed to flush to session OS file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session OS file.");
        throw obj2;
        obj;
        obj1 = obj2;
        obj2 = obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        s = ((String) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeSessionPartsToSessionFile(File file, String s, int i)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Collecting session parts for ID ").append(s).toString());
        File afile1[] = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionCrash").toString()));
        File afile[];
        Object obj5;
        Object obj6;
        boolean flag;
        boolean flag1;
        if (afile1 != null && afile1.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has fatal exception: %s", new Object[] {
            s, Boolean.valueOf(flag)
        }));
        afile = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()));
        if (afile != null && afile.length > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Session %s has non-fatal exceptions: %s", new Object[] {
            s, Boolean.valueOf(flag1)
        }));
        if (!flag && !flag1) goto _L2; else goto _L1
_L1:
        obj1 = null;
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj4 = null;
        obj2 = new ClsFileOutputStream(filesDir, s);
        obj = obj6;
        obj1 = obj5;
        obj3 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        obj = obj3;
        obj1 = obj3;
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Collecting SessionStart data for session ID ").append(s).toString());
        obj = obj3;
        obj1 = obj3;
        writeToCosFromFile(((CodedOutputStream) (obj3)), file);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeUInt64(4, (new Date()).getTime() / 1000L);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeBool(5, flag);
        obj = obj3;
        obj1 = obj3;
        writeInitialPartsTo(((CodedOutputStream) (obj3)), s);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        file = afile;
        obj = obj3;
        obj1 = obj3;
        if (afile.length <= i)
        {
            break MISSING_BLOCK_LABEL_480;
        }
        obj = obj3;
        obj1 = obj3;
        Fabric.getLogger().d("CrashlyticsCore", String.format(Locale.US, "Trimming down to %d logged exceptions.", new Object[] {
            Integer.valueOf(i)
        }));
        obj = obj3;
        obj1 = obj3;
        trimSessionEventFiles(s, i);
        obj = obj3;
        obj1 = obj3;
        file = listFilesMatching(new FileNameContainsFilter((new StringBuilder()).append(s).append("SessionEvent").toString()));
        obj = obj3;
        obj1 = obj3;
        writeNonFatalEventsTo(((CodedOutputStream) (obj3)), file, s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_519;
        }
        obj = obj3;
        obj1 = obj3;
        writeToCosFromFile(((CodedOutputStream) (obj3)), afile1[0]);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeUInt32(11, 1);
        obj = obj3;
        obj1 = obj3;
        ((CodedOutputStream) (obj3)).writeEnum(12, 3);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj3)), "Error flushing session file stream");
        if (false)
        {
            closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj2)));
        } else
        {
            CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close CLS file");
        }
_L3:
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Removing session part files for ID ").append(s).toString());
        deleteSessionPartFilesFor(s);
        return;
        file;
        obj2 = obj3;
        obj3 = file;
        file = obj4;
_L5:
        obj = file;
        obj1 = obj2;
        Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Failed to write session file for session ID: ").append(s).toString(), ((Throwable) (obj3)));
        obj = file;
        obj1 = obj2;
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj3)), ((java.io.OutputStream) (obj2)));
        CommonUtils.flushOrLog(file, "Error flushing session file stream");
        if (true)
        {
            closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj2)));
        } else
        {
            CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close CLS file");
        }
          goto _L3
        file;
_L4:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Error flushing session file stream");
        if (false)
        {
            closeWithoutRenamingOrLog(((ClsFileOutputStream) (obj1)));
        } else
        {
            CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close CLS file");
        }
        throw file;
_L2:
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("No events present for session ID ").append(s).toString());
          goto _L3
        file;
        obj1 = obj2;
          goto _L4
        obj3;
        file = ((File) (obj1));
          goto _L5
    }

    private void writeSessionUser(String s)
        throws Exception
    {
        Object obj;
        Object obj1;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        obj1 = null;
        obj3 = null;
        obj = null;
        obj6 = null;
        obj5 = null;
        obj4 = null;
        Object obj2 = new ClsFileOutputStream(filesDir, (new StringBuilder()).append(s).append("SessionUser").toString());
        obj = obj6;
        obj1 = obj5;
        obj3 = CodedOutputStream.newInstance(((java.io.OutputStream) (obj2)));
        obj = obj3;
        obj1 = obj3;
        s = getUserMetaData(s);
        obj = obj3;
        obj1 = obj3;
        boolean flag = s.isEmpty();
        if (flag)
        {
            CommonUtils.flushOrLog(((java.io.Flushable) (obj3)), "Failed to flush session user file.");
            CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session user file.");
            return;
        }
        obj = obj3;
        obj1 = obj3;
        sessionDataWriter.writeSessionUser(((CodedOutputStream) (obj3)), ((UserMetaData) (s)).id, ((UserMetaData) (s)).name, ((UserMetaData) (s)).email);
        CommonUtils.flushOrLog(((java.io.Flushable) (obj3)), "Failed to flush session user file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj2)), "Failed to close session user file.");
        return;
        s;
        obj2 = obj3;
        obj3 = s;
        s = obj4;
_L4:
        obj = s;
        obj1 = obj2;
        ExceptionUtils.writeStackTraceIfNotNull(((Throwable) (obj3)), ((java.io.OutputStream) (obj2)));
        obj = s;
        obj1 = obj2;
        throw obj3;
        s;
_L2:
        CommonUtils.flushOrLog(((java.io.Flushable) (obj)), "Failed to flush session user file.");
        CommonUtils.closeOrLog(((java.io.Closeable) (obj1)), "Failed to close session user file.");
        throw s;
        s;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        s = ((String) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void writeToCosFromFile(CodedOutputStream codedoutputstream, File file)
        throws IOException
    {
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        Object obj;
        byte abyte0[];
        abyte0 = new byte[(int)file.length()];
        obj = null;
        file = new FileInputStream(file);
        int i = 0;
_L4:
        int j;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        j = file.read(abyte0, i, abyte0.length - i);
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        CommonUtils.closeOrLog(file, "Failed to close file input stream.");
        codedoutputstream.writeRawBytes(abyte0);
        return;
        file;
        codedoutputstream = obj;
_L6:
        CommonUtils.closeOrLog(codedoutputstream, "Failed to close file input stream.");
        throw file;
_L2:
        Fabric.getLogger().e("CrashlyticsCore", (new StringBuilder()).append("Tried to include a file that doesn't exist: ").append(file.getName()).toString(), null);
        return;
        Exception exception;
        exception;
        codedoutputstream = file;
        file = exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    void cacheKeyData(final Map keyData)
    {
        executorServiceWrapper.executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final Map val$keyData;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                String s = getCurrentSessionId();
                (new MetaDataStore(filesDir)).writeKeyData(s, keyData);
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                keyData = map;
                super();
            }
        });
    }

    void cacheUserData(final String userId, final String userName, final String userEmail)
    {
        executorServiceWrapper.executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final String val$userEmail;
            final String val$userId;
            final String val$userName;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                String s = getCurrentSessionId();
                (new MetaDataStore(filesDir)).writeUserData(s, new UserMetaData(userId, userName, userEmail));
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                userId = s;
                userName = s1;
                userEmail = s2;
                super();
            }
        });
    }

    void cleanInvalidTempFiles()
    {
        executorServiceWrapper.executeAsync(new Runnable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public void run()
            {
                doCleanInvalidTempFiles(listFilesMatching(ClsFileOutputStream.TEMP_FILENAME_FILTER));
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    void doCleanInvalidTempFiles(File afile[])
    {
        deleteLegacyInvalidCacheDir();
        int k = afile.length;
        for (int i = 0; i < k; i++)
        {
            final String sessionId = afile[i];
            Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Found invalid session part file: ").append(sessionId).toString());
            sessionId = getSessionIdFromSessionFile(sessionId);
            FilenameFilter filenamefilter = new FilenameFilter() {

                final CrashlyticsUncaughtExceptionHandler this$0;
                final String val$sessionId;

                public boolean accept(File file1, String s)
                {
                    return s.startsWith(sessionId);
                }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                sessionId = s;
                super();
            }
            };
            Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Deleting all part files for invalid session: ").append(sessionId).toString());
            File afile1[] = listFilesMatching(filenamefilter);
            int l = afile1.length;
            for (int j = 0; j < l; j++)
            {
                File file = afile1[j];
                Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Deleting session file: ").append(file).toString());
                file.delete();
            }

        }

    }

    void doCloseSessions()
        throws Exception
    {
        doCloseSessions(false);
    }

    boolean finalizeSessions()
    {
        return ((Boolean)executorServiceWrapper.executeSyncLoggingException(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public Boolean call()
                throws Exception
            {
                if (!isHandlingException.get())
                {
                    Fabric.getLogger().d("CrashlyticsCore", "Finalizing previously open sessions.");
                    SessionEventData sessioneventdata = crashlyticsCore.getExternalCrashEventData();
                    if (sessioneventdata != null)
                    {
                        writeExternalCrashEvent(sessioneventdata);
                    }
                    doCloseSessions(true);
                    Fabric.getLogger().d("CrashlyticsCore", "Closed all previously open sessions");
                    return Boolean.valueOf(true);
                } else
                {
                    Fabric.getLogger().d("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
                    return Boolean.valueOf(false);
                }
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        })).booleanValue();
    }

    boolean hasOpenSession()
    {
        return listSessionBeginFiles().length > 0;
    }

    boolean isHandlingException()
    {
        return isHandlingException.get();
    }

    File[] listSessionBeginFiles()
    {
        return listFilesMatching(new FileNameContainsFilter("BeginSession"));
    }

    void openSession()
    {
        executorServiceWrapper.executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                doOpenSession();
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                super();
            }
        });
    }

    void trimSessionFiles()
    {
        Utils.capFileCount(filesDir, SESSION_FILE_FILTER, 4, SMALLEST_FILE_NAME_FIRST);
    }

    public void uncaughtException(final Thread thread, final Throwable ex)
    {
        this;
        JVM INSTR monitorenter ;
        isHandlingException.set(true);
        Fabric.getLogger().d("CrashlyticsCore", (new StringBuilder()).append("Crashlytics is handling uncaught exception \"").append(ex).append("\" from thread ").append(thread.getName()).toString());
        if (!receiversRegistered.getAndSet(true))
        {
            Fabric.getLogger().d("CrashlyticsCore", "Unregistering power receivers.");
            Context context = crashlyticsCore.getContext();
            context.unregisterReceiver(powerConnectedReceiver);
            context.unregisterReceiver(powerDisconnectedReceiver);
        }
        final Date now = new Date();
        executorServiceWrapper.executeSyncLoggingException(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final Throwable val$ex;
            final Date val$now;
            final Thread val$thread;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                handleUncaughtException(now, thread, ex);
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                now = date;
                thread = thread1;
                ex = throwable;
                super();
            }
        });
        Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, ex);
        isHandlingException.set(false);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Fabric.getLogger().e("CrashlyticsCore", "An error occurred in the uncaught exception handler", ((Throwable) (obj)));
        Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, ex);
        isHandlingException.set(false);
        if (true) goto _L2; else goto _L1
_L1:
        thread;
        throw thread;
        obj;
        Fabric.getLogger().d("CrashlyticsCore", "Crashlytics completed exception processing. Invoking default exception handler.");
        defaultHandler.uncaughtException(thread, ex);
        isHandlingException.set(false);
        throw obj;
    }

    void writeNonFatalException(final Thread thread, final Throwable ex)
    {
        final Date now = new Date();
        executorServiceWrapper.executeAsync(new Runnable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final Throwable val$ex;
            final Date val$now;
            final Thread val$thread;

            public void run()
            {
                if (!isHandlingException.get())
                {
                    doWriteNonFatal(now, thread, ex);
                }
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                now = date;
                thread = thread1;
                ex = throwable;
                super();
            }
        });
    }

    void writeToLog(final long timestamp, final String msg)
    {
        executorServiceWrapper.executeAsync(new Callable() {

            final CrashlyticsUncaughtExceptionHandler this$0;
            final String val$msg;
            final long val$timestamp;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                if (!isHandlingException.get())
                {
                    logFileManager.writeToLog(timestamp, msg);
                }
                return null;
            }

            
            {
                this$0 = CrashlyticsUncaughtExceptionHandler.this;
                timestamp = l;
                msg = s;
                super();
            }
        });
    }





/*
    static boolean access$102(CrashlyticsUncaughtExceptionHandler crashlyticsuncaughtexceptionhandler, boolean flag)
    {
        crashlyticsuncaughtexceptionhandler.powerConnected = flag;
        return flag;
    }

*/











}
