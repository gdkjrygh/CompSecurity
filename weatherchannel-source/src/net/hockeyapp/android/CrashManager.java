// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.hockeyapp.android.utils.ConnectionManager;
import net.hockeyapp.android.utils.PrefsUtil;
import net.hockeyapp.android.utils.Util;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package net.hockeyapp.android:
//            CrashManagerListener, Constants, ExceptionHandler, Strings

public class CrashManager
{

    private static final String ALWAYS_SEND_KEY = "always_send_crash_reports";
    private static String identifier = null;
    private static boolean submitting = false;
    private static String urlString = null;

    public CrashManager()
    {
    }

    private static String contentsOfFile(WeakReference weakreference, String s)
    {
        if (weakreference == null) goto _L2; else goto _L1
_L1:
        Context context = (Context)weakreference.get();
        if (context == null) goto _L2; else goto _L3
_L3:
        Object obj;
        Object obj1;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        obj1 = null;
        weakreference = null;
        obj = null;
        s = new BufferedReader(new InputStreamReader(context.openFileInput(s)));
_L6:
        weakreference = s.readLine();
        if (weakreference == null) goto _L5; else goto _L4
_L4:
        stringbuilder.append(weakreference);
        stringbuilder.append(System.getProperty("line.separator"));
          goto _L6
        weakreference;
_L12:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference) { }
        }
_L7:
        return stringbuilder.toString();
_L5:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference) { }
        }
          goto _L7
        obj;
        s = obj1;
_L10:
        weakreference = s;
        ((IOException) (obj)).printStackTrace();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference) { }
        }
          goto _L7
        s;
_L9:
        if (weakreference != null)
        {
            try
            {
                weakreference.close();
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference) { }
        }
        throw s;
_L2:
        return null;
        obj;
        weakreference = s;
        s = ((String) (obj));
        if (true) goto _L9; else goto _L8
_L8:
        obj;
          goto _L10
        weakreference;
        s = ((String) (obj));
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static void deleteStackTrace(WeakReference weakreference, String s)
    {
        if (weakreference != null)
        {
            weakreference = (Context)weakreference.get();
            if (weakreference != null)
            {
                weakreference.deleteFile(s);
                weakreference.deleteFile(s.replace(".stacktrace", ".user"));
                weakreference.deleteFile(s.replace(".stacktrace", ".contact"));
                weakreference.deleteFile(s.replace(".stacktrace", ".description"));
            }
        }
    }

    public static void deleteStackTraces(WeakReference weakreference)
    {
        String as[];
        int i;
        as = searchForStackTraces();
        if (as == null || as.length <= 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        Log.d("HockeyApp", (new StringBuilder()).append("Found ").append(as.length).append(" stacktrace(s).").toString());
        i = 0;
_L3:
        if (i >= as.length) goto _L2; else goto _L1
_L1:
        if (weakreference == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        Context context;
        Log.d("HockeyApp", (new StringBuilder()).append("Delete stacktrace ").append(as[i]).append(".").toString());
        deleteStackTrace(weakreference, as[i]);
        context = (Context)weakreference.get();
        if (context != null)
        {
            try
            {
                context.deleteFile(as[i]);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        i++;
          goto _L3
_L2:
    }

    public static void execute(Context context, CrashManagerListener crashmanagerlistener)
    {
        Boolean boolean2;
        WeakReference weakreference;
        int i;
        boolean flag;
        if (crashmanagerlistener != null && crashmanagerlistener.ignoreDefaultHandler())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        boolean2 = Boolean.valueOf(flag);
        weakreference = new WeakReference(context);
        i = hasStackTraces(weakreference);
        if (i == 1)
        {
            context = PreferenceManager.getDefaultSharedPreferences(context);
            Boolean boolean1 = Boolean.valueOf(Boolean.valueOf(false).booleanValue() | context.getBoolean("always_send_crash_reports", false));
            context = boolean1;
            if (crashmanagerlistener != null)
            {
                context = Boolean.valueOf(Boolean.valueOf(boolean1.booleanValue() | crashmanagerlistener.shouldAutoUploadCrashes()).booleanValue() | crashmanagerlistener.onCrashesFound());
                crashmanagerlistener.onNewCrashesFound();
            }
            if (!context.booleanValue())
            {
                showDialog(weakreference, crashmanagerlistener, boolean2.booleanValue());
                return;
            } else
            {
                sendCrashes(weakreference, crashmanagerlistener, boolean2.booleanValue());
                return;
            }
        }
        if (i == 2)
        {
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onConfirmedCrashesFound();
            }
            sendCrashes(weakreference, crashmanagerlistener, boolean2.booleanValue());
            return;
        } else
        {
            registerHandler(weakreference, crashmanagerlistener, boolean2.booleanValue());
            return;
        }
    }

    private static String getURLString()
    {
        return (new StringBuilder()).append(urlString).append("api/2/apps/").append(identifier).append("/crashes/").toString();
    }

    public static int hasStackTraces(WeakReference weakreference)
    {
        Object obj;
        String as[];
        byte byte0;
        boolean flag;
        as = searchForStackTraces();
        obj = null;
        flag = false;
        byte0 = flag;
        if (as == null) goto _L2; else goto _L1
_L1:
        byte0 = flag;
        if (as.length <= 0) goto _L2; else goto _L3
_L3:
        List list;
        list = obj;
        if (weakreference == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        weakreference = (Context)weakreference.get();
        list = obj;
        int i;
        byte byte1;
        int j;
        if (weakreference != null)
        {
            try
            {
                list = Arrays.asList(weakreference.getSharedPreferences("HockeySDK", 0).getString("ConfirmedFilenames", "").split("\\|"));
            }
            // Misplaced declaration of an exception variable
            catch (WeakReference weakreference)
            {
                list = obj;
            }
        }
        if (list == null) goto _L5; else goto _L4
_L4:
        byte1 = 2;
        j = as.length;
        i = 0;
_L9:
        byte0 = byte1;
        if (i >= j) goto _L2; else goto _L6
_L6:
        if (list.contains(as[i])) goto _L8; else goto _L7
_L7:
        byte0 = 1;
_L2:
        return byte0;
_L8:
        i++;
        if (true) goto _L9; else goto _L5
_L5:
        return 1;
    }

    public static void initialize(Context context, String s, String s1, CrashManagerListener crashmanagerlistener)
    {
        initialize(context, s, s1, crashmanagerlistener, true);
    }

    private static void initialize(Context context, String s, String s1, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        if (context != null)
        {
            urlString = s;
            identifier = Util.sanitizeAppIdentifier(s1);
            Constants.loadFromContext(context);
            if (identifier == null)
            {
                identifier = Constants.APP_PACKAGE;
            }
            if (flag)
            {
                if (crashmanagerlistener != null && crashmanagerlistener.ignoreDefaultHandler())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                registerHandler(new WeakReference(context), crashmanagerlistener, Boolean.valueOf(flag).booleanValue());
            }
        }
    }

    public static void initialize(Context context, String s, CrashManagerListener crashmanagerlistener)
    {
        initialize(context, "https://sdk.hockeyapp.net/", s, crashmanagerlistener, true);
    }

    private static String joinArray(String as[], String s)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for (int i = 0; i < as.length; i++)
        {
            stringbuffer.append(as[i]);
            if (i < as.length - 1)
            {
                stringbuffer.append(s);
            }
        }

        return stringbuffer.toString();
    }

    public static void register(Context context, String s)
    {
        register(context, "https://sdk.hockeyapp.net/", s, null);
    }

    public static void register(Context context, String s, String s1, CrashManagerListener crashmanagerlistener)
    {
        initialize(context, s, s1, crashmanagerlistener, false);
        execute(context, crashmanagerlistener);
    }

    public static void register(Context context, String s, CrashManagerListener crashmanagerlistener)
    {
        register(context, "https://sdk.hockeyapp.net/", s, crashmanagerlistener);
    }

    private static void registerHandler(WeakReference weakreference, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        if (Constants.APP_VERSION != null && Constants.APP_PACKAGE != null)
        {
            weakreference = Thread.getDefaultUncaughtExceptionHandler();
            if (weakreference != null)
            {
                Log.d("HockeyApp", (new StringBuilder()).append("Current handler class = ").append(weakreference.getClass().getName()).toString());
            }
            if (weakreference instanceof ExceptionHandler)
            {
                ((ExceptionHandler)weakreference).setListener(crashmanagerlistener);
                return;
            } else
            {
                Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(weakreference, crashmanagerlistener, flag));
                return;
            }
        } else
        {
            Log.d("HockeyApp", "Exception handler not set because version or package is null.");
            return;
        }
    }

    private static void saveConfirmedStackTraces(WeakReference weakreference)
    {
        Object obj;
        if (weakreference == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = (Context)weakreference.get();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        weakreference = searchForStackTraces();
        obj = ((Context) (obj)).getSharedPreferences("HockeySDK", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("ConfirmedFilenames", joinArray(weakreference, "|"));
        PrefsUtil.applyChanges(((android.content.SharedPreferences.Editor) (obj)));
        return;
        weakreference;
    }

    private static String[] searchForStackTraces()
    {
        if (Constants.FILES_PATH != null)
        {
            Log.d("HockeyApp", (new StringBuilder()).append("Looking for exceptions in: ").append(Constants.FILES_PATH).toString());
            File file = new File((new StringBuilder()).append(Constants.FILES_PATH).append("/").toString());
            if (!file.mkdir() && !file.exists())
            {
                return new String[0];
            } else
            {
                return file.list(new FilenameFilter() {

                    public boolean accept(File file1, String s)
                    {
                        return s.endsWith(".stacktrace");
                    }

                });
            }
        } else
        {
            Log.d("HockeyApp", "Can't search for exception as file path is null.");
            return null;
        }
    }

    private static void sendCrashes(WeakReference weakreference, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        saveConfirmedStackTraces(weakreference);
        registerHandler(weakreference, crashmanagerlistener, flag);
        if (!submitting)
        {
            submitting = true;
            (new Thread(weakreference, crashmanagerlistener) {

                final CrashManagerListener val$listener;
                final WeakReference val$weakContext;

                public void run()
                {
                    CrashManager.submitStackTraces(weakContext, listener);
                    CrashManager.submitting = false;
                }

            
            {
                weakContext = weakreference;
                listener = crashmanagerlistener;
                super();
            }
            }).start();
        }
    }

    private static void showDialog(WeakReference weakreference, CrashManagerListener crashmanagerlistener, boolean flag)
    {
        Object obj = null;
        if (weakreference != null)
        {
            obj = (Context)weakreference.get();
        }
        if (obj == null)
        {
            return;
        } else
        {
            obj = new android.app.AlertDialog.Builder(((Context) (obj)));
            ((android.app.AlertDialog.Builder) (obj)).setTitle(Strings.get(crashmanagerlistener, 0));
            ((android.app.AlertDialog.Builder) (obj)).setMessage(Strings.get(crashmanagerlistener, 1));
            ((android.app.AlertDialog.Builder) (obj)).setNegativeButton(Strings.get(crashmanagerlistener, 2), new android.content.DialogInterface.OnClickListener(crashmanagerlistener, weakreference, flag) {

                final boolean val$ignoreDefaultHandler;
                final CrashManagerListener val$listener;
                final WeakReference val$weakContext;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (listener != null)
                    {
                        listener.onUserDeniedCrashes();
                    }
                    CrashManager.deleteStackTraces(weakContext);
                    CrashManager.registerHandler(weakContext, listener, ignoreDefaultHandler);
                }

            
            {
                listener = crashmanagerlistener;
                weakContext = weakreference;
                ignoreDefaultHandler = flag;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).setNeutralButton(Strings.get(crashmanagerlistener, 3), new android.content.DialogInterface.OnClickListener(weakreference, crashmanagerlistener, flag) {

                final boolean val$ignoreDefaultHandler;
                final CrashManagerListener val$listener;
                final WeakReference val$weakContext;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = null;
                    if (weakContext != null)
                    {
                        dialoginterface = (Context)weakContext.get();
                    }
                    if (dialoginterface == null)
                    {
                        return;
                    } else
                    {
                        PreferenceManager.getDefaultSharedPreferences(dialoginterface).edit().putBoolean("always_send_crash_reports", true).commit();
                        CrashManager.sendCrashes(weakContext, listener, ignoreDefaultHandler);
                        return;
                    }
                }

            
            {
                weakContext = weakreference;
                listener = crashmanagerlistener;
                ignoreDefaultHandler = flag;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(Strings.get(crashmanagerlistener, 4), new android.content.DialogInterface.OnClickListener(weakreference, crashmanagerlistener, flag) {

                final boolean val$ignoreDefaultHandler;
                final CrashManagerListener val$listener;
                final WeakReference val$weakContext;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    CrashManager.sendCrashes(weakContext, listener, ignoreDefaultHandler);
                }

            
            {
                weakContext = weakreference;
                listener = crashmanagerlistener;
                ignoreDefaultHandler = flag;
                super();
            }
            });
            ((android.app.AlertDialog.Builder) (obj)).create().show();
            return;
        }
    }

    public static void submitStackTraces(WeakReference weakreference, CrashManagerListener crashmanagerlistener)
    {
        Object obj;
        String as[];
        as = searchForStackTraces();
        obj = Boolean.valueOf(false);
        if (as == null || as.length <= 0) goto _L2; else goto _L1
_L1:
        int i;
        Log.d("HockeyApp", (new StringBuilder()).append("Found ").append(as.length).append(" stacktrace(s).").toString());
        i = 0;
_L3:
        Object obj3;
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = as[i];
        String s = contentsOfFile(weakreference, ((String) (obj3)));
        Object obj1 = obj;
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        Log.d("HockeyApp", (new StringBuilder()).append("Transmitting crash data: \n").append(s).toString());
        obj1 = (DefaultHttpClient)ConnectionManager.getInstance().getHttpClient();
        HttpPost httppost = new HttpPost(getURLString());
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("raw", s));
        arraylist.add(new BasicNameValuePair("userID", contentsOfFile(weakreference, ((String) (obj3)).replace(".stacktrace", ".user"))));
        arraylist.add(new BasicNameValuePair("contact", contentsOfFile(weakreference, ((String) (obj3)).replace(".stacktrace", ".contact"))));
        arraylist.add(new BasicNameValuePair("description", contentsOfFile(weakreference, ((String) (obj3)).replace(".stacktrace", ".description"))));
        arraylist.add(new BasicNameValuePair("sdk", "HockeySDK"));
        arraylist.add(new BasicNameValuePair("sdk_version", "3.5.0"));
        httppost.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
        ((DefaultHttpClient) (obj1)).execute(httppost);
        obj1 = Boolean.valueOf(true);
        if (((Boolean) (obj1)).booleanValue())
        {
            Log.d("HockeyApp", "Transmission succeeded");
            deleteStackTrace(weakreference, as[i]);
            obj3 = obj1;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesSent();
                obj3 = obj1;
            }
        } else
        {
            Log.d("HockeyApp", "Transmission failed, will retry on next register() call");
            obj3 = obj1;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesNotSent();
                obj3 = obj1;
            }
        }
_L4:
        i++;
        obj = obj3;
        if (true) goto _L3; else goto _L2
        Object obj2;
        obj2;
        ((Exception) (obj2)).printStackTrace();
        if (((Boolean) (obj)).booleanValue())
        {
            Log.d("HockeyApp", "Transmission succeeded");
            deleteStackTrace(weakreference, as[i]);
            obj3 = obj;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesSent();
                obj3 = obj;
            }
        } else
        {
            Log.d("HockeyApp", "Transmission failed, will retry on next register() call");
            obj3 = obj;
            if (crashmanagerlistener != null)
            {
                crashmanagerlistener.onCrashesNotSent();
                obj3 = obj;
            }
        }
          goto _L4
        obj2;
        if (!((Boolean) (obj)).booleanValue()) goto _L6; else goto _L5
_L5:
        Log.d("HockeyApp", "Transmission succeeded");
        deleteStackTrace(weakreference, as[i]);
        if (crashmanagerlistener != null)
        {
            crashmanagerlistener.onCrashesSent();
        }
_L7:
        throw obj2;
_L6:
        Log.d("HockeyApp", "Transmission failed, will retry on next register() call");
        if (crashmanagerlistener != null)
        {
            crashmanagerlistener.onCrashesNotSent();
        }
        if (true) goto _L7; else goto _L2
_L2:
    }





/*
    static boolean access$202(boolean flag)
    {
        submitting = flag;
        return flag;
    }

*/
}
