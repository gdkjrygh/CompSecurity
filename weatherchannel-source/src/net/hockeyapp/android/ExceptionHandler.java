// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.os.Process;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package net.hockeyapp.android:
//            Constants, CrashManagerListener

public class ExceptionHandler
    implements Thread.UncaughtExceptionHandler
{

    private Thread.UncaughtExceptionHandler defaultExceptionHandler;
    private boolean ignoreDefaultHandler;
    private CrashManagerListener listener;

    public ExceptionHandler(Thread.UncaughtExceptionHandler uncaughtexceptionhandler, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        ignoreDefaultHandler = false;
        defaultExceptionHandler = uncaughtexceptionhandler;
        ignoreDefaultHandler = flag;
        listener = crashmanagerlistener;
    }

    private static String limitedString(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.length() > 255)
            {
                s1 = s.substring(0, 255);
            }
        }
        return s1;
    }

    public static void saveException(Throwable throwable, CrashManagerListener crashmanagerlistener)
    {
        Date date = new Date();
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        Object obj;
        try
        {
            throwable = UUID.randomUUID().toString();
            obj = (new StringBuilder()).append(Constants.FILES_PATH).append("/").append(throwable).append(".stacktrace").toString();
            Log.d("HockeyApp", (new StringBuilder()).append("Writing unhandled exception to: ").append(((String) (obj))).toString());
            obj = new BufferedWriter(new FileWriter(((String) (obj))));
            ((BufferedWriter) (obj)).write((new StringBuilder()).append("Package: ").append(Constants.APP_PACKAGE).append("\n").toString());
            ((BufferedWriter) (obj)).write((new StringBuilder()).append("Version Code: ").append(Constants.APP_VERSION).append("\n").toString());
            ((BufferedWriter) (obj)).write((new StringBuilder()).append("Version Name: ").append(Constants.APP_VERSION_NAME).append("\n").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            Log.e("HockeyApp", "Error saving exception stacktrace!\n", throwable);
            return;
        }
        if (crashmanagerlistener == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (!crashmanagerlistener.includeDeviceData())
        {
            break MISSING_BLOCK_LABEL_308;
        }
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Android: ").append(Constants.ANDROID_VERSION).append("\n").toString());
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Manufacturer: ").append(Constants.PHONE_MANUFACTURER).append("\n").toString());
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Model: ").append(Constants.PHONE_MODEL).append("\n").toString());
        if (Constants.CRASH_IDENTIFIER == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        if (crashmanagerlistener == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        if (!crashmanagerlistener.includeDeviceIdentifier())
        {
            break MISSING_BLOCK_LABEL_356;
        }
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("CrashReporter Key: ").append(Constants.CRASH_IDENTIFIER).append("\n").toString());
        ((BufferedWriter) (obj)).write((new StringBuilder()).append("Date: ").append(date).append("\n").toString());
        ((BufferedWriter) (obj)).write("\n");
        ((BufferedWriter) (obj)).write(stringwriter.toString());
        ((BufferedWriter) (obj)).flush();
        ((BufferedWriter) (obj)).close();
        if (crashmanagerlistener == null)
        {
            break MISSING_BLOCK_LABEL_499;
        }
        writeValueToFile(limitedString(crashmanagerlistener.getUserID()), (new StringBuilder()).append(throwable).append(".user").toString());
        writeValueToFile(limitedString(crashmanagerlistener.getContact()), (new StringBuilder()).append(throwable).append(".contact").toString());
        writeValueToFile(crashmanagerlistener.getDescription(), (new StringBuilder()).append(throwable).append(".description").toString());
    }

    private static void writeValueToFile(String s, String s1)
    {
        try
        {
            s1 = (new StringBuilder()).append(Constants.FILES_PATH).append("/").append(s1).toString();
            if (s.trim().length() > 0)
            {
                s1 = new BufferedWriter(new FileWriter(s1));
                s1.write(s);
                s1.flush();
                s1.close();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void setListener(CrashManagerListener crashmanagerlistener)
    {
        listener = crashmanagerlistener;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (Constants.FILES_PATH == null)
        {
            defaultExceptionHandler.uncaughtException(thread, throwable);
            return;
        }
        saveException(throwable, listener);
        if (!ignoreDefaultHandler)
        {
            defaultExceptionHandler.uncaughtException(thread, throwable);
            return;
        } else
        {
            Process.killProcess(Process.myPid());
            System.exit(10);
            return;
        }
    }
}
