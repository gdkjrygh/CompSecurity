// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.sessionm.b.a;
import com.sessionm.core.Session;
import com.sessionm.core.StatsCollector;
import com.sessionm.core.b;
import com.sessionm.core.g;
import com.sessionm.core.h;
import com.sessionm.net.Request;
import com.sessionm.net.RequestQueue;
import com.sessionm.net.c;
import com.sessionm.net.http.d;
import com.sessionm.ui.fragment.ActivityFragment;
import com.sessionm.ui.fragment.FragmentActivityController;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URI;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.sessionm.ui:
//            VideoErrorListener, VideoProgressListener, SessionMVideoView, SessionMViewContainer, 
//            SessionMVideoActivity, JSInterfaceListener, SessionMActivity

public class ActivityController
    implements SessionMViewContainer.SessionMViewContainerListener, VideoErrorListener, VideoProgressListener
{
    public static final class ContentError extends Enum
    {

        private static final ContentError $VALUES[];
        public static final ContentError ANDROID_VIDEO_ERROR;
        public static final ContentError BROWSER_LOAD_FAILED;
        public static final ContentError CALENDAR_ACTIVITY_UNAVAILABLE_ERROR;
        public static final ContentError IMAGE_SAVE_CANCELLED_ERROR;
        public static final ContentError IMAGE_SAVE_ERROR;
        public static final ContentError MAKE_REQUEST_ERROR;
        public static final ContentError MISSING_EVENT_DATA;
        public static final ContentError MISSING_URL;
        public static final ContentError WEBVIEW_LOAD_ERROR;
        private int code;
        private String message;

        public static ContentError valueOf(String s)
        {
            return (ContentError)Enum.valueOf(com/sessionm/ui/ActivityController$ContentError, s);
        }

        public static ContentError[] values()
        {
            return (ContentError[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        public String getMessage()
        {
            return message;
        }

        static 
        {
            WEBVIEW_LOAD_ERROR = new ContentError("WEBVIEW_LOAD_ERROR", 0, 1, "Content Unavailable");
            MAKE_REQUEST_ERROR = new ContentError("MAKE_REQUEST_ERROR", 1, 2, "Cannot Connect");
            IMAGE_SAVE_ERROR = new ContentError("IMAGE_SAVE_ERROR", 2, 3, "Image Not Saved");
            IMAGE_SAVE_CANCELLED_ERROR = new ContentError("IMAGE_SAVE_CANCELLED_ERROR", 3, 4, "Image Save Cancelled");
            BROWSER_LOAD_FAILED = new ContentError("BROWSER_LOAD_FAILED", 4, 8, "URL failed to load in embedded browser.");
            ANDROID_VIDEO_ERROR = new ContentError("ANDROID_VIDEO_ERROR", 5, 9, "Video error occurred.");
            CALENDAR_ACTIVITY_UNAVAILABLE_ERROR = new ContentError("CALENDAR_ACTIVITY_UNAVAILABLE_ERROR", 6, 10, "Unable to spawn calendar activity.");
            MISSING_EVENT_DATA = new ContentError("MISSING_EVENT_DATA", 7, 11, "Missing data for calendar event.");
            MISSING_URL = new ContentError("MISSING_URL", 8, 12, "Expected URL not provided for command.");
            $VALUES = (new ContentError[] {
                WEBVIEW_LOAD_ERROR, MAKE_REQUEST_ERROR, IMAGE_SAVE_ERROR, IMAGE_SAVE_CANCELLED_ERROR, BROWSER_LOAD_FAILED, ANDROID_VIDEO_ERROR, CALENDAR_ACTIVITY_UNAVAILABLE_ERROR, MISSING_EVENT_DATA, MISSING_URL
            });
        }

        private ContentError(String s, int i, int j, String s1)
        {
            super(s, i);
            code = j;
            message = s1;
        }
    }

    public static interface LoadContentListener
    {

        public abstract void onContentLoaded(String s, String s1);

        public abstract void onFailure(Throwable throwable);
    }

    static interface LoadWebViewListener
    {

        public abstract void onFailure(Throwable throwable);

        public abstract void onWebViewLoaded();
    }

    public static interface PrepareListener
    {

        public abstract void onFailure(Throwable throwable);

        public abstract void onPrepared();
    }

    private class SessionMMediaScannerConnectionClient
        implements android.media.MediaScannerConnection.MediaScannerConnectionClient
    {

        private final String mFilename;
        private MediaScannerConnection mMediaScannerConnection;
        private final String mMimeType;
        final ActivityController this$0;

        private void setMediaScannerConnection(MediaScannerConnection mediascannerconnection)
        {
            mMediaScannerConnection = mediascannerconnection;
        }

        public void onMediaScannerConnected()
        {
            if (mMediaScannerConnection != null)
            {
                mMediaScannerConnection.scanFile(mFilename, mMimeType);
            }
        }

        public void onScanCompleted(String s, Uri uri)
        {
            if (mMediaScannerConnection != null)
            {
                mMediaScannerConnection.disconnect();
            }
        }


        private SessionMMediaScannerConnectionClient(String s, String s1)
        {
            this$0 = ActivityController.this;
            super();
            mFilename = s;
            mMimeType = s1;
        }

    }

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State DISMISSED;
        public static final State DISMISSING;
        public static final State LOADED_CONTENT;
        public static final State LOADED_WEBVIEW;
        public static final State LOADING_CONTENT;
        public static final State LOADING_WEBVIEW;
        public static final State PRESENTED;
        public static final State UNPRESENTABLE;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/sessionm/ui/ActivityController$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            DISMISSED = new State("DISMISSED", 0);
            LOADING_CONTENT = new State("LOADING_CONTENT", 1);
            LOADED_CONTENT = new State("LOADED_CONTENT", 2);
            LOADING_WEBVIEW = new State("LOADING_WEBVIEW", 3);
            LOADED_WEBVIEW = new State("LOADED_WEBVIEW", 4);
            PRESENTED = new State("PRESENTED", 5);
            DISMISSING = new State("DISMISSING", 6);
            UNPRESENTABLE = new State("UNPRESENTABLE", 7);
            $VALUES = (new State[] {
                DISMISSED, LOADING_CONTENT, LOADED_CONTENT, LOADING_WEBVIEW, LOADED_WEBVIEW, PRESENTED, DISMISSING, UNPRESENTABLE
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface StateChangeListener
    {

        public abstract void onStateChange(ActivityController activitycontroller, State state1);
    }


    static final boolean $assertionsDisabled;
    static final String ANDROID_CALENDAR_CONTENT_TYPE = "vnd.android.cursor.item/event";
    static final String TAG = "SessionM.Activity";
    private static final Map xPosFlagMap;
    private static final Map yPosFlagMap;
    private String activityContent;
    private Activity activityContext;
    private a activityData;
    private SessionMViewContainer browserViewContainer;
    private State browserViewState;
    private a contentData;
    private a contentData2;
    private String contentUrl;
    private a eventCreationMessage;
    private JSInterfaceListener jsInterfaceListener;
    private String lastBrowserUrl;
    private android.view.ViewGroup.LayoutParams layoutParams;
    private LoadWebViewListener loadWebViewListener;
    private long presentationStartTime;
    private FrameLayout providedViewGroup;
    private Session session;
    private SessionMViewContainer sessionMViewContainer;
    private State state;
    private StateChangeListener stateChangeListener;

    public ActivityController(Activity activity, String s)
    {
        browserViewState = State.DISMISSED;
        layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        state = State.DISMISSED;
        presentationStartTime = System.currentTimeMillis();
        session = Session.D();
        activityContext = activity;
        contentUrl = s;
    }

    static int convertDpToPixels(Context context, int i)
    {
        if (context == null || i <= 0)
        {
            return 0;
        } else
        {
            return (int)(context.getResources().getDisplayMetrics().density * (float)i);
        }
    }

    static int convertPixelsToDp(Context context, int i)
    {
        if (context == null || i <= 0)
        {
            return 0;
        } else
        {
            float f = context.getResources().getDisplayMetrics().density;
            return (int)((float)i / f);
        }
    }

    public static transient ActivityController createActivityController(Activity activity, String s, Object aobj[])
    {
        int i = Session.D().getFragmentFrameLayoutId();
        Object obj;
        if (i != -1)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                Log.w("SessionM.Activity", "Disabling fragment presentation for OS versions below 11");
                i = -1;
            } else
            {
                obj = activity.findViewById(i);
                if (!(obj instanceof FrameLayout))
                {
                    Log.e("SessionM.Activity", (new StringBuilder()).append("Fragment FrameLayout ID does not identify FrameLayout instance (").append(obj).append("). Using non-Fragment based presentation instead.").toString());
                    i = -1;
                }
            }
        }
        if (aobj != null && aobj.length > 0)
        {
            if (aobj.length > 0 && (aobj[0] instanceof a))
            {
                obj = (a)aobj[0];
            } else
            {
                obj = null;
            }
            if (aobj.length > 1 && (aobj[1] instanceof a))
            {
                a a1 = (a)aobj[1];
                aobj = ((Object []) (obj));
                obj = a1;
            } else
            {
                aobj = ((Object []) (obj));
                obj = null;
            }
        } else
        {
            obj = null;
            aobj = null;
        }
        if (i == -1)
        {
            activity = new ActivityController(activity, s);
            activity.setContentData(((a) (aobj)));
            activity.setContentData2(((a) (obj)));
            activity.setActivityContent(null);
            return activity;
        }
        activity = new ActivityFragment();
        obj = new Bundle();
        ((Bundle) (obj)).putString("URL_ARG_KEY", s);
        if (!$assertionsDisabled && aobj == null)
        {
            throw new AssertionError();
        } else
        {
            ((Bundle) (obj)).putString("JSON_DATA_ARG_KEY", ((a) (aobj)).toString());
            activity.setArguments(((Bundle) (obj)));
            activity = activity.getActivityController(Session.D().K());
            activity.setFragmentFrameLayoutId(i);
            activity.setActivityContent(null);
            return activity;
        }
    }

    private a createDispatchJsonObject(SessionMVideoView sessionmvideoview)
    {
        a a1 = a.aJ();
        int i = (int)TimeUnit.MILLISECONDS.toSeconds(sessionmvideoview.getDuration());
        int j = (int)TimeUnit.MILLISECONDS.toSeconds(sessionmvideoview.getCurrentPosition());
        a1.put("percentComplete", (int)(((float)j / (float)i) * 100F));
        a1.put("timeRemaining", i - j);
        a1.put("currentTime", j);
        return a1;
    }

    private void dispatchMessage(String s, String s1)
    {
        executeJavascript(String.format("GreyhoundEventDispatcher.dispatch('%s',%s);", new Object[] {
            s, s1
        }));
    }

    private void downloadImage(String s, final a message)
    {
        final File pictureStoragePath = getPictureStoragePath();
        pictureStoragePath.mkdirs();
        s = new Request(com.sessionm.net.Request.Type.gP, new Object[] {
            s
        });
        s.e(com.sessionm.net.Request.Header.go.getKey(), "no-cache");
        s.a(new c() {

            final ActivityController this$0;
            final a val$message;
            final File val$pictureStoragePath;

            public void onReplyReceived(Request request)
            {
                if (Log.isLoggable("SessionM.Activity", 3))
                {
                    Log.d("SessionM.Activity", String.format(Locale.US, "finished store picture request: %s", new Object[] {
                        request.getURL()
                    }));
                }
                if (request.bd() == com.sessionm.net.Request.State.gI)
                {
                    File file = request.aU().bC();
                    if (file == null)
                    {
                        notifyContentAboutError(ContentError.IMAGE_SAVE_ERROR, request.getURL());
                    } else
                    {
                        loadPictureIntoGalleryApp(file.getAbsolutePath());
                    }
                } else
                {
                    notifyContentAboutError(ContentError.IMAGE_SAVE_ERROR, request.getURL());
                }
                finishMessageHandling(message, null);
            }

            public File outputFileForRequest(Request request)
            {
                request = getFileNameForUriAndHeaderFields(URI.create(request.getURL()), request.a(com.sessionm.net.Request.Header.gq));
                return new File(pictureStoragePath, request);
            }

            
            {
                this$0 = ActivityController.this;
                message = a1;
                pictureStoragePath = file;
                super();
            }
        });
        s.send();
    }

    private a getActivityData()
    {
        int i = 0;
        if (activityData == null)
        {
            activityData = session.am();
            if (session.I() != null)
            {
                activityData.put("global_data", session.I());
            }
            if (session.H() != null)
            {
                java.util.Map.Entry entry;
                for (Iterator iterator = session.H().entrySet().iterator(); iterator.hasNext(); activityData.put((new StringBuilder()).append("user[data][").append((String)entry.getKey()).append("]").toString(), (String)entry.getValue()))
                {
                    entry = (java.util.Map.Entry)iterator.next();
                }

            }
            Activity activity = getActivityContext();
            View view = activity.getWindow().getDecorView();
            activityData.put("width", convertPixelsToDp(activity, view.getWidth()));
            activityData.put("height", convertPixelsToDp(activity, view.getHeight()));
            activityData.put("z", (new StringBuilder()).append("").append(System.currentTimeMillis()).toString());
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT > 16)
            {
                if (!session.isHardwareAccelerationDisabled() && view.isHardwareAccelerated())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            activityData.put("hardware_acceleration_enabled", flag);
            activityData.put("connection_type", h.j(getActivityContext()));
            if (contentData2 != null)
            {
                if (contentData == null)
                {
                    contentData = a.aJ();
                }
                String as[] = contentData2.aK();
                for (int j = as.length; i < j; i++)
                {
                    String s = as[i];
                    contentData.put(s, contentData2.getObject(s));
                }

            }
            activityData.put("data", contentData);
        }
        return activityData;
    }

    private String getFileNameForUriAndHeaderFields(URI uri, List list)
    {
label0:
        {
            uri = uri.getPath();
            if (uri == null)
            {
                return null;
            }
            uri = (new File(uri)).getName();
            if (list == null)
            {
                break label0;
            }
            list = list.iterator();
            String s;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                s = (String)list.next();
            } while (!s.contains("image/"));
            list = (new StringBuilder()).append(".").append(s.split("/")[1]).toString();
            if (!uri.endsWith(list))
            {
                return (new StringBuilder()).append(uri).append(list).toString();
            }
        }
        return uri;
    }

    private Method getJSHandlerMethod(String s)
    {
        Method amethod[] = com/sessionm/ui/ActivityController.getDeclaredMethods();
        int j = amethod.length;
        for (int i = 0; i < j; i++)
        {
            Method method = amethod[i];
            if (method.getName().equals(s))
            {
                return method;
            }
        }

        return null;
    }

    private File getPictureStoragePath()
    {
        return new File(Environment.getExternalStorageDirectory(), "Pictures");
    }

    private android.view.ViewGroup.LayoutParams getViewLayoutParams(a a1)
    {
        Activity activity;
        String s2;
        int i;
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        activity = getActivityContext();
        String s = a1.getString("vertical_alignment");
        String s1 = a1.getString("horizontal_alignment");
        if (s == null || s.equalsIgnoreCase("") || a1.isNull("vertical_alignment"))
        {
            s = "center";
        }
        if (s1 == null || s1.equalsIgnoreCase("") || a1.isNull("horizontal_alignment"))
        {
            s1 = "center";
        }
        s2 = a1.getString("display_type");
        l = a1.getInt("horizontal_offset");
        i1 = a1.getInt("vertical_offset");
        j1 = ((Integer)xPosFlagMap.get(s1)).intValue();
        k1 = ((Integer)yPosFlagMap.get(s)).intValue();
        j = convertDpToPixels(activity, a1.getInt("width"));
        int k = convertDpToPixels(activity, a1.getInt("height"));
        a1 = activity.getWindow().getDecorView();
        i = j;
        if (a1.getWidth() <= j)
        {
            i = -1;
        }
        j = k;
        if (a1.getHeight() <= k)
        {
            j = -1;
        }
        if (s2 == null || !s2.equalsIgnoreCase("frame")) goto _L2; else goto _L1
_L1:
        a1 = new android.widget.FrameLayout.LayoutParams(i, j);
        if (k1 == 48)
        {
            a1.topMargin = convertDpToPixels(activity, i1);
        }
        if (k1 == 80)
        {
            a1.bottomMargin = convertDpToPixels(activity, i1);
        }
        if (j1 != 3) goto _L4; else goto _L3
_L3:
        a1.leftMargin = convertDpToPixels(activity, l);
_L5:
        a1.gravity = j1 | k1;
        return a1;
_L4:
        if (j1 == 5)
        {
            a1.rightMargin = convertDpToPixels(activity, l);
        }
        if (true) goto _L5; else goto _L2
_L2:
        a1 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        a1.gravity = 17;
        return a1;
    }

    private a handleCheckInstalledMessage(a a1)
    {
        if (isApplicationInstalled(a1.getString("packageName")))
        {
            executeJavascript(String.format("GreyhoundEventDispatcher.dispatch('packageInstalled',{'installed':true});", new Object[0]));
        } else
        {
            executeJavascript(String.format("GreyhoundEventDispatcher.dispatch('packageInstalled',{'installed':false});", new Object[0]));
        }
        return null;
    }

    private a handleCloseMessage(a a1)
    {
        if (isBrowserDisplayed())
        {
            dismissBrowser();
            return null;
        } else
        {
            dismiss();
            return null;
        }
    }

    private a handleCreateCalendarEventMessage(a a1)
    {
        if (android.os.Build.VERSION.SDK_INT <= 14)
        {
            a1 = a.aJ();
            a1.put("error", "Unsupported operation below API 14.");
            notifyContentAboutError(ContentError.CALENDAR_ACTIVITY_UNAVAILABLE_ERROR, null);
            return a1;
        }
        if (eventCreationMessage != null)
        {
            eventCreationMessage = null;
        }
        eventCreationMessage = a1;
        Object obj = a1.B("eventData");
        if (obj == null)
        {
            a1 = a.aJ();
            a1.put("error", "Invalid event data.");
            notifyContentAboutError(ContentError.MISSING_EVENT_DATA, null);
            return a1;
        }
        a1 = ((a) (obj)).getString("title");
        long l = ((a) (obj)).getLong("startDate");
        long l1 = ((a) (obj)).getLong("endDate");
        String s = ((a) (obj)).getString("location");
        obj = ((a) (obj)).getString("notes");
        Intent intent = new Intent("android.intent.action.INSERT");
        if (!h.m(getActivityContext()))
        {
            notifyContentAboutError(ContentError.CALENDAR_ACTIVITY_UNAVAILABLE_ERROR, null);
        } else
        {
            intent.setType("vnd.android.cursor.item/event");
            intent.setData(android.provider.CalendarContract.Events.CONTENT_URI);
            intent.putExtra("beginTime", l * 1000L);
            intent.putExtra("endTime", l1 * 1000L);
            intent.putExtra("title", a1);
            intent.putExtra("description", ((String) (obj)));
            intent.putExtra("eventLocation", s);
            try
            {
                getActivityContext().startActivity(intent);
            }
            // Misplaced declaration of an exception variable
            catch (a a1)
            {
                notifyContentAboutError(ContentError.CALENDAR_ACTIVITY_UNAVAILABLE_ERROR, null);
            }
        }
        return null;
    }

    private a handleDisableCloseButtonMessage(a a1)
    {
        if (sessionMViewContainer == null || state == State.DISMISSED || state == State.DISMISSING)
        {
            return null;
        } else
        {
            sessionMViewContainer.removeCloseButton();
            return null;
        }
    }

    private void handleDisplayMessage(a a1)
    {
        if (!isFullScreenActivity())
        {
            launchDisplayContainer();
            layoutParams = getViewLayoutParams(a1);
            resizeView(layoutParams);
        }
        dispatchMessage("show", getActivityData().toString());
    }

    private a handleEnableCloseButtonMessage(a a1)
    {
        if (sessionMViewContainer == null || state == State.DISMISSED || state == State.DISMISSING)
        {
            return null;
        } else
        {
            sessionMViewContainer.showCloseButton();
            return null;
        }
    }

    private a handleGetCookieMessage(a a1)
    {
        String s2 = null;
        Object obj;
        String s;
        String s1;
        if (a1.has("domain"))
        {
            s = a1.getString("domain");
            CookieManager cookiemanager;
            String s3;
            String as[];
            int i;
            int j;
            if (s.startsWith("."))
            {
                obj = s.substring(1);
            } else
            {
                obj = s;
            }
        } else
        {
            obj = null;
            s = null;
        }
        if (a1.has("path"))
        {
            s1 = a1.getString("path");
        } else
        {
            s1 = "";
        }
        if (a1.has("name"))
        {
            s2 = a1.getString("name");
        }
        obj = (new StringBuilder()).append("http://").append(((String) (obj))).append(s1).toString();
        a1 = new JSONArray();
        cookiemanager = CookieManager.getInstance();
        if (s != null)
        {
            obj = cookiemanager.getCookie(((String) (obj)));
            if (obj != null)
            {
                obj = ((String) (obj)).split("; ");
                j = obj.length;
                i = 0;
                while (i < j) 
                {
                    Object obj1 = obj[i];
                    as = ((String) (obj1)).split("=");
                    s3 = as[0];
                    String s4 = as[1];
                    if (s2 == null || s2.equals(s3))
                    {
                        Log.d("SessionM", (new StringBuilder()).append("Found cookie: ").append(((String) (obj1))).toString());
                        obj1 = a.aJ();
                        ((a) (obj1)).put("domain", s);
                        ((a) (obj1)).put("path", s1);
                        ((a) (obj1)).put("value", s4);
                        a1.put(((a) (obj1)).aL());
                    }
                    i++;
                }
            }
        }
        obj = a.aJ();
        ((a) (obj)).put("cookies", a1.toString());
        return ((a) (obj));
    }

    private void handleGetSystemIdentifiersMessageAsync(final a message)
    {
        session.getExecutorService().execute(new Runnable() {

            final ActivityController this$0;
            final a val$message;

            public void run()
            {
                a aa[] = (a[])message.a("requestedIds", com/sessionm/b/a);
                JSONArray jsonarray = new JSONArray();
                if (aa != null)
                {
                    int j = aa.length;
                    for (int i = 0; i < j; i++)
                    {
                        Object obj = aa[i];
                        String s = ((a) (obj)).getString("algorithm");
                        obj = ((a) (obj)).getString("type");
                        String s1 = com.sessionm.a.a.c(((String) (obj)), s);
                        a a2 = a.aJ();
                        a2.put("value", s1);
                        a2.put("type", ((String) (obj)));
                        a2.put("algorithm", s);
                        jsonarray.put(a2.aL());
                    }

                } else
                if (Log.isLoggable("SessionM.Activity", 6))
                {
                    Log.e("SessionM.Activity", "requestedIds not specified for getSystemIdentifiers call!");
                }
                a a1 = a.aJ();
                a1.put("ids", jsonarray);
                session.getApplicationContext();
                a1.put("limitadtracking", com.sessionm.a.a.aH());
                finishMessageHandling(message, a1);
            }

            
            {
                this$0 = ActivityController.this;
                message = a1;
                super();
            }
        });
    }

    private void handleGetSystemVolumeMessage(a a1)
    {
        Object obj;
        Object obj1;
        AudioManager audiomanager;
        obj1 = "na";
        audiomanager = (AudioManager)getActivityContext().getSystemService("audio");
        obj = obj1;
        if (audiomanager == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = audiomanager.getStreamVolume(3);
        j = audiomanager.getStreamMaxVolume(3);
        obj = obj1;
        if (j == 0) goto _L2; else goto _L3
_L3:
        double d = (double)i / (double)j;
        obj = new DecimalFormat("0.00");
        if (Double.isNaN(d)) goto _L5; else goto _L4
_L4:
        obj = ((DecimalFormat) (obj)).format(d);
_L2:
        obj1 = a.aJ();
        ((a) (obj1)).put("volume", ((String) (obj)));
        finishMessageHandling(a1, ((a) (obj1)));
        return;
        obj;
        Log.e("SessionM.Activity", "Cannot cast system volume value to double.");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("SessionM.Activity", "Number format exception while trying to format volume.");
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "na";
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void handleMakeRequestMessageAsync(final a message)
    {
        if (message.getString("url") == null)
        {
            notifyContentAboutError(ContentError.MISSING_URL, null);
            finishMessageHandling(message, null);
            return;
        } else
        {
            session.getExecutorService().execute(new Runnable() {

                final ActivityController this$0;
                final a val$message;

                public void run()
                {
                    synchronized (session)
                    {
                        sendMakeRequest(message);
                    }
                    return;
                    exception;
                    session1;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = ActivityController.this;
                message = a1;
                super();
            }
            });
            return;
        }
    }

    private void handleOptinMessageAsync(final a message)
    {
        g g1 = session.C();
        if (!g1.isOptedOut())
        {
            if (Log.isLoggable("SessionM.Activity", 6))
            {
                Log.e("SessionM.Activity", "Opt in command called but user was already opted in.");
            }
            a a1 = a.aJ();
            a1.put("error", "Opt in command called but user was already opted in.");
            finishMessageHandling(message, a1);
        }
        g1.a(session.getApplicationContext(), false, new com.sessionm.core.g.a() {

            final ActivityController this$0;
            final a val$message;

            public void onOptInFailed()
            {
                a a2 = a.aJ();
                a2.put("error", "There was an error opting back in.");
                finishMessageHandling(message, a2);
            }

            public void onOptInSucceeded()
            {
                finishMessageHandling(message, null);
            }

            
            {
                this$0 = ActivityController.this;
                message = a1;
                super();
            }
        });
    }

    private void handlePlayMessage(a a1)
    {
        a1 = a1.getString("url");
        if (a1 == null)
        {
            notifyContentAboutError(ContentError.MISSING_URL, null);
        }
        if (!SessionMVideoActivity.start(getActivityContext(), a1))
        {
            notifyContentAboutError(ContentError.ANDROID_VIDEO_ERROR, a1);
        }
    }

    private void handleStorePictureMessageAsync(a a1)
    {
        String s = a1.getString("url");
        if (s == null)
        {
            notifyContentAboutError(ContentError.IMAGE_SAVE_ERROR, null);
            finishMessageHandling(a1, null);
            return;
        }
        if (getActivityContext().getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", getActivityContext().getPackageName()) != 0)
        {
            notifyContentAboutError(ContentError.IMAGE_SAVE_ERROR, s);
            finishMessageHandling(a1, null);
            return;
        } else
        {
            presentStorePictureDialog(s, a1);
            return;
        }
    }

    private a handleUpdateForecastMessage(final a message)
    {
        session.getExecutorService().execute(new Runnable() {

            final ActivityController this$0;
            final a val$message;

            public void run()
            {
                session.a(message);
            }

            
            {
                this$0 = ActivityController.this;
                message = a1;
                super();
            }
        });
        return null;
    }

    private a handleUserActionMessage(a a1)
    {
        com.sessionm.api.ActivityListener.UserAction auseraction[];
        a a2;
        int i;
        boolean flag;
        int j;
        int k;
        flag = false;
        j = a1.getInt("code");
        a2 = a1.B("data");
        auseraction = com.sessionm.api.ActivityListener.UserAction.values();
        k = auseraction.length;
        i = 0;
_L4:
        Object obj;
label0:
        {
            if (i >= k)
            {
                break MISSING_BLOCK_LABEL_153;
            }
            a1 = auseraction[i];
            String as[];
            String s;
            if (a1.getCode() == j)
            {
                break label0;
            } else
            {
                i++;
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        obj = a1;
        if (a1 == null)
        {
            obj = com.sessionm.api.ActivityListener.UserAction.OTHER;
            ((com.sessionm.api.ActivityListener.UserAction) (obj)).setCode(j);
        }
        a1 = new HashMap();
        if (a2 != null)
        {
            as = a2.aK();
            j = as.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                s = as[i];
                a1.put(s, a2.getString(s));
            }

        }
        session.a(((com.sessionm.api.ActivityListener.UserAction) (obj)), a1);
        return null;
        a1 = null;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean isApplicationInstalled(String s)
    {
        for (Iterator iterator = getActivityContext().getPackageManager().getInstalledPackages(8192).iterator(); iterator.hasNext();)
        {
            if (s.equalsIgnoreCase(((PackageInfo)iterator.next()).packageName))
            {
                return true;
            }
        }

        return false;
    }

    private void loadPictureIntoGalleryApp(String s)
    {
        s = new SessionMMediaScannerConnectionClient(s, null);
        MediaScannerConnection mediascannerconnection = new MediaScannerConnection(session.getApplicationContext(), s);
        s.setMediaScannerConnection(mediascannerconnection);
        mediascannerconnection.connect();
    }

    private void loadWebView(final String baseUrl, final String content, LoadWebViewListener loadwebviewlistener)
    {
        loadWebViewListener = loadwebviewlistener;
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController this$0;
            final String val$baseUrl;
            final String val$content;

            public void run()
            {
                if (getState() == State.DISMISSED)
                {
                    return;
                }
                if (Log.isLoggable("SessionM.Activity", 3))
                {
                    Log.d("SessionM.Activity", (new StringBuilder()).append("Start web view loading, url: ").append(baseUrl).toString());
                }
                if (Log.isLoggable("SessionM.Activity", 2))
                {
                    Log.v("SessionM.Activity", (new StringBuilder()).append("Web view content: ").append(content).toString());
                }
                setState(State.LOADING_WEBVIEW);
                getViewContainer().loadContent(baseUrl, content);
            }

            
            {
                this$0 = ActivityController.this;
                baseUrl = s;
                content = s1;
                super();
            }
        });
    }

    private void presentStorePictureDialog(final String url, final a message)
    {
        if (url == null)
        {
            if (Log.isLoggable("SessionM.Activity", 6))
            {
                Log.e("SessionM.Activity", "Null url provided for storePicture command.");
            }
            notifyContentAboutError(ContentError.IMAGE_SAVE_ERROR, null);
        }
        if (h.l(getActivityContext()))
        {
            if (Log.isLoggable("SessionM.Activity", 6))
            {
                Log.e("SessionM.Activity", "Store picture not supported by this phone.");
            }
            notifyContentAboutError(ContentError.IMAGE_SAVE_ERROR, url);
        }
        (new android.app.AlertDialog.Builder(getActivityContext())).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            final ActivityController this$0;
            final a val$message;
            final String val$url;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                notifyContentAboutError(ContentError.IMAGE_SAVE_CANCELLED_ERROR, url);
                finishMessageHandling(message, null);
            }

            
            {
                this$0 = ActivityController.this;
                url = s;
                message = a1;
                super();
            }
        }).setPositiveButton("Okay", new android.content.DialogInterface.OnClickListener() {

            final ActivityController this$0;
            final a val$message;
            final String val$url;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                downloadImage(url, message);
            }

            
            {
                this$0 = ActivityController.this;
                url = s;
                message = a1;
                super();
            }
        }).setCancelable(true).show();
    }

    private void sendContentRequest(final LoadContentListener loadContentListener)
    {
        Request request = new Request(com.sessionm.net.Request.Type.gP, new Object[] {
            contentUrl
        });
        request.a(com.sessionm.net.Request.Priority.gE);
        request.a(new c() {

            final ActivityController this$0;
            final LoadContentListener val$loadContentListener;

            public void onReplyReceived(Request request1)
            {
                getActivityContext().runOnUiThread(request1. new Runnable() {

                    final _cls2 this$1;
                    final Request val$request;

                    public void run()
                    {
                        if (request.aT() == null)
                        {
                            if (getState() == State.DISMISSED || getState() == State.DISMISSING)
                            {
                                return;
                            }
                            if (request.aU() != null)
                            {
                                setActivityContent(request.aU().bD());
                            }
                            loadContentListener.onContentLoaded(request.getURL(), activityContent);
                            return;
                        }
                        if (Log.isLoggable("SessionM.Activity", 3))
                        {
                            Log.d("SessionM.Activity", (new StringBuilder()).append("Failed to load activity content, reason: ").append(request.aT().getMessage()).toString());
                        }
                        setState(State.UNPRESENTABLE);
                        loadContentListener.onFailure(request.aT());
                    }

            
            {
                this$1 = final__pcls2;
                request = Request.this;
                super();
            }
                });
            }

            
            {
                this$0 = ActivityController.this;
                loadContentListener = loadcontentlistener;
                super();
            }
        });
        request.send();
    }

    private void sendJSLoadToContent()
    {
        dispatchMessage("load", getActivityData().toString());
    }

    private void sendMakeRequest(final a message)
    {
        final String url = message.getString("url");
        Object obj = message.getString("method");
        a a1 = message.B("params");
        RequestQueue requestqueue = session.N();
        obj = new Request(url, ((String) (obj)));
        ((Request) (obj)).d(a1);
        requestqueue.a(((Request) (obj)), new c() {

            final ActivityController this$0;
            final a val$message;
            final String val$url;

            public void onReplyReceived(Request request)
            {
                Activity activity = getActivityContext();
                if (activity == null)
                {
                    return;
                } else
                {
                    activity.runOnUiThread(request. new Runnable() {

                        final _cls20 this$1;
                        final Request val$request;

                        public void run()
                        {
                            if (Log.isLoggable("SessionM.Activity", 3))
                            {
                                Log.d("SessionM.Activity", String.format("Finished make request for url : %s", new Object[] {
                                    url
                                }));
                            }
                            if (request.bd().equals(com.sessionm.net.Request.State.gI))
                            {
                                a a1 = request.aZ();
                                finishMessageHandling(message, a1);
                                return;
                            } else
                            {
                                notifyContentAboutError(ContentError.MAKE_REQUEST_ERROR, request.getURL());
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls20;
                request = Request.this;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                this$0 = ActivityController.this;
                url = s;
                message = a1;
                super();
            }
        });
        requestqueue.f(((Request) (obj)));
    }

    private void setState(State state1)
    {
        if (state == State.PRESENTED && state1 != State.DISMISSING)
        {
            return;
        }
        if (state1 != state && stateChangeListener != null)
        {
            stateChangeListener.onStateChange(this, state1);
        }
        state = state1;
    }

    public void bridgeAction(final String action)
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", (new StringBuilder()).append("Process JavaScriptInterface command: ").append(action).toString());
        }
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController this$0;
            final String val$action;

            public void run()
            {
                if (getState() != State.DISMISSED) goto _L2; else goto _L1
_L1:
                if (Log.isLoggable("SessionM.Activity", 3))
                {
                    Log.d("SessionM.Activity", "Not executing JavaScriptInterface command since controller was dismissed.");
                }
_L4:
                return;
_L2:
                Object obj1;
                String s;
                obj1 = a.A(action);
                if (obj1 == null)
                {
                    Log.e("SessionM.Activity", (new StringBuilder()).append("Unable to parse JS JSON message for action ").append(action).toString());
                    return;
                }
                s = ((a) (obj1)).getString("handler");
                if (s == null)
                {
                    Log.e("SessionM.Activity", "JavaScriptInterface command handler not specified");
                    session.a("jsinterface-message-error", "JS command handler not specified", null);
                    return;
                }
                if (jsInterfaceListener != null)
                {
                    jsInterfaceListener.receivedJSInterfaceCommand(s);
                }
                Object obj;
                String s1;
                s1 = (new StringBuilder()).append("handle").append(s.substring(0, 1).toUpperCase(Locale.US)).append(s.substring(1)).append("Message").toString();
                obj = getJSHandlerMethod(s1);
                if (obj != null)
                {
                    break MISSING_BLOCK_LABEL_391;
                }
                obj = (new StringBuilder()).append(s1).append("Async").toString();
                obj = getJSHandlerMethod(((String) (obj)));
                boolean flag = true;
_L5:
                if (obj == null)
                {
                    try
                    {
                        Log.e("SessionM.Activity", (new StringBuilder()).append("JS command handler method not found: ").append(s).toString());
                        obj = String.format(Locale.US, "invalid JavaScriptInterface action: %s", new Object[] {
                            action
                        });
                        session.a("jsinterface-message-error", ((String) (obj)), null);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Log.e("SessionM.Activity", (new StringBuilder()).append("Exception processing JavaScriptInterface command ").append(action).toString(), ((Throwable) (obj)));
                    }
                    obj1 = String.format(Locale.US, "exception executing js interface message: %s", new Object[] {
                        ((a) (obj1)).toString()
                    });
                    session.a("jsinterface-message-exception", ((String) (obj1)), ((Throwable) (obj)));
                    return;
                }
                ((Method) (obj)).setAccessible(true);
                obj = ((Method) (obj)).invoke(ActivityController.this, new Object[] {
                    obj1
                });
                if (flag) goto _L4; else goto _L3
_L3:
                finishMessageHandling(((a) (obj1)), (a)obj);
                return;
                flag = false;
                  goto _L5
            }

            
            {
                this$0 = ActivityController.this;
                action = s;
                super();
            }
        });
    }

    public void dismiss()
    {
        dismiss(true);
    }

    protected void dismiss(final boolean notifyActivityListener)
    {
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController this$0;
            final boolean val$notifyActivityListener;

            public void run()
            {
                if (Log.isLoggable("SessionM.Activity", 3))
                {
                    Log.d("SessionM.Activity", String.format("Dismiss called with current state: %s", new Object[] {
                        state
                    }));
                }
                if (State.DISMISSED != state)
                {
                    if (state == State.UNPRESENTABLE)
                    {
                        if (notifyActivityListener)
                        {
                            session.au();
                        }
                        setState(State.DISMISSED);
                        session.b(ActivityController.this);
                        if (isFullScreenActivity())
                        {
                            ((SessionMActivity)getActivityContext()).finish(false);
                            return;
                        }
                    }
                    setState(State.DISMISSING);
                    if (isBrowserDisplayed())
                    {
                        dismissBrowser();
                        notifyActivityPaused();
                    }
                    notifyActivityPaused();
                    if (isFullScreenActivity())
                    {
                        ((SessionMActivity)getActivityContext()).finish(false);
                    }
                    removeView(sessionMViewContainer);
                    sessionMViewContainer = null;
                    if (Log.isLoggable("SessionM.Activity", 3))
                    {
                        Log.d("SessionM.Activity", "Destroyed view container.");
                    }
                    session.b(ActivityController.this);
                    boolean flag;
                    if (notifyActivityListener && getState() == State.DISMISSING)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    setState(State.DISMISSED);
                    if (Log.isLoggable("SessionM", 4))
                    {
                        Log.i("SessionM", String.format("Dismissed activity, fullScreen: %b url: %s", new Object[] {
                            Boolean.valueOf(isFullScreenActivity()), contentUrl
                        }));
                    }
                    if (flag)
                    {
                        session.au();
                        return;
                    }
                }
            }

            
            {
                this$0 = ActivityController.this;
                notifyActivityListener = flag;
                super();
            }
        });
    }

    void dismissBrowser()
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", "dismissing browser with animation.");
        }
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        translateanimation.setDuration(300L);
        translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final ActivityController this$0;

            public void onAnimationEnd(Animation animation)
            {
                getActivityContext().runOnUiThread(new Runnable() {

                    final _cls13 this$1;

                    public void run()
                    {
                        if (state == State.DISMISSED)
                        {
                            return;
                        } else
                        {
                            removeBrowserView();
                            return;
                        }
                    }

            
            {
                this$1 = _cls13.this;
                super();
            }
                });
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = ActivityController.this;
                super();
            }
        });
        browserViewContainer.getViewGroup().startAnimation(translateanimation);
        browserViewState = State.DISMISSING;
    }

    public void displayView()
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", "Display view");
        }
        sendJSLoadToContent();
        boolean flag;
        if (getState() != State.PRESENTED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !isFullScreenActivity())
        {
            setState(State.PRESENTED);
            session.at();
            StatsCollector.a(com.sessionm.core.StatsCollector.Stat.ez, presentationStartTime - System.currentTimeMillis());
            return;
        } else
        {
            getViewContainer().getViewGroup().setVisibility(0);
            setState(State.PRESENTED);
            getViewContainer().showCloseButton();
            return;
        }
    }

    public void executeJavascript(String s)
    {
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format(Locale.US, "executing javascript: %s with contorller: %s", new Object[] {
                s, this
            }));
        }
        if (sessionMViewContainer != null)
        {
            sessionMViewContainer.executeJavascript(s);
        } else
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", "Attempted to execute javascript on null webview container. Container may have been reset.");
            return;
        }
    }

    protected void finishMessageHandling(a a1, a a2)
    {
        if (jsInterfaceListener != null)
        {
            String s = a1.getString("handler");
            if (s != null)
            {
                jsInterfaceListener.processedJSInterfaceCommand(s, a2);
            }
        }
        a a3 = a1.B("callback");
        if (a3 == null)
        {
            return;
        }
        a1 = a2;
        if (a2 == null)
        {
            a1 = a.aJ();
        }
        a1.put("_id", a3.getString("_id"));
        executeJavascript(String.format(Locale.US, "%s(%s);", new Object[] {
            a3.getString("name"), a1.toString()
        }));
    }

    public Activity getActivityContext()
    {
        return activityContext;
    }

    public SessionMViewContainer getBrowserView()
    {
        return browserViewContainer;
    }

    public JSInterfaceListener getJsInterfaceListener()
    {
        return jsInterfaceListener;
    }

    public android.view.ViewGroup.LayoutParams getLayoutParams()
    {
        return layoutParams;
    }

    public State getState()
    {
        this;
        JVM INSTR monitorenter ;
        State state1 = state;
        this;
        JVM INSTR monitorexit ;
        return state1;
        Exception exception;
        exception;
        throw exception;
    }

    public SessionMViewContainer getViewContainer()
    {
        if (sessionMViewContainer == null)
        {
            sessionMViewContainer = new SessionMViewContainer(getActivityContext(), SessionMViewContainer.WebViewType.NORMAL, this);
            sessionMViewContainer.setListener(this);
            if (Log.isLoggable("SessionM.Activity", 3))
            {
                Log.d("SessionM.Activity", "Created web view");
            }
        }
        return sessionMViewContainer;
    }

    protected a handleBrowserMessage(a a1)
    {
        String s;
        s = a1.getString("action");
        a1 = a1.getString("url");
        if (!isFullScreenActivity() || !s.equalsIgnoreCase("open") || a1 == null || a1.length() <= 0) goto _L2; else goto _L1
_L1:
        if (browserViewContainer != null) goto _L4; else goto _L3
_L3:
        presentBrowser(a1);
_L6:
        return null;
_L4:
        if (Log.isLoggable("SessionM.Activity", 6))
        {
            Log.e("SessionM.Activity", "Browser is already open. Ignoring open browser command.");
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (isFullScreenActivity() && s.equalsIgnoreCase("close"))
        {
            if (browserViewContainer != null)
            {
                removeBrowserView();
            } else
            if (Log.isLoggable("SessionM.Activity", 5))
            {
                Log.w("SessionM.Activity", "Attempt to close browser via jsinterface but no browser was present.");
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void handleOpenMessageAsync(final a message)
    {
        final String url = message.getString("url");
        if (url == null)
        {
            message = String.format(Locale.US, "Open message has null URL, message: %s", new Object[] {
                message.toString()
            });
            session.a("open-error", message, null);
            dismiss();
            return;
        }
        if (isFullScreenActivity())
        {
            final ActivityController controller = createActivityController(getActivityContext(), url, new Object[0]);
            controller.prepare(new PrepareListener() {

                final ActivityController this$0;
                final ActivityController val$controller;
                final a val$message;
                final String val$url;

                public void onFailure(Throwable throwable)
                {
                    if (getState() == State.DISMISSED)
                    {
                        return;
                    } else
                    {
                        notifyContentAboutError(ContentError.WEBVIEW_LOAD_ERROR, url);
                        finishMessageHandling(message, null);
                        return;
                    }
                }

                public void onPrepared()
                {
                    getActivityContext().runOnUiThread(new Runnable() {

                        final _cls11 this$1;

                        public void run()
                        {
                            if (getState() == State.DISMISSED)
                            {
                                return;
                            } else
                            {
                                finishMessageHandling(message, null);
                                replaceDisplayContainer(controller);
                                session.b(_fld0);
                                setState(State.DISMISSED);
                                return;
                            }
                        }

            
            {
                this$1 = _cls11.this;
                super();
            }
                    });
                }

            
            {
                this$0 = ActivityController.this;
                message = a1;
                controller = activitycontroller1;
                url = s;
                super();
            }
            });
            return;
        } else
        {
            finishMessageHandling(message, null);
            dismiss(false);
            SessionMActivity.startSessionMActivity(getActivityContext(), url, null, false);
            return;
        }
    }

    public boolean isBrowserDisplayed()
    {
        return browserViewContainer != null;
    }

    protected boolean isFullScreenActivity()
    {
        return getActivityContext() instanceof SessionMActivity;
    }

    public boolean isInForeground()
    {
        boolean flag = isFullScreenActivity();
        SessionMActivity sessionmactivity = null;
        if (flag)
        {
            sessionmactivity = (SessionMActivity)getActivityContext();
        }
        return !flag || sessionmactivity != null && sessionmactivity.isInForeground();
    }

    protected void launchDisplayContainer()
    {
        Activity activity;
        ViewGroup viewgroup;
label0:
        {
            activity = getActivityContext();
            viewgroup = sessionMViewContainer.getViewGroup();
            if (viewgroup.getParent() == null)
            {
                if (providedViewGroup == null)
                {
                    break label0;
                }
                providedViewGroup.addView(viewgroup, viewgroup.getLayoutParams());
            }
            return;
        }
        activity.addContentView(viewgroup, viewgroup.getLayoutParams());
    }

    public void loadActivity(final LoadContentListener loadContentListener)
    {
        if (loadContentListener == null)
        {
            throw new NullPointerException("LoadContentListener is null.");
        }
        if (contentUrl == null)
        {
            throw new NullPointerException("content url is null.");
        }
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("Loading content, url: %s", new Object[] {
                contentUrl
            }));
        }
        setState(State.LOADING_CONTENT);
        session.getExecutorService().execute(new Runnable() {

            final ActivityController this$0;
            final LoadContentListener val$loadContentListener;

            public void run()
            {
                Object obj = session.av();
                if (((b) (obj)).b(contentUrl))
                {
                    obj = ((b) (obj)).g(contentUrl);
                    if (obj == null)
                    {
                        sendContentRequest(loadContentListener);
                        return;
                    } else
                    {
                        setActivityContent(((String) (obj)));
                        loadContentListener.onContentLoaded(contentUrl, activityContent);
                        return;
                    }
                } else
                {
                    sendContentRequest(loadContentListener);
                    return;
                }
            }

            
            {
                this$0 = ActivityController.this;
                loadContentListener = loadcontentlistener;
                super();
            }
        });
    }

    void notifyAboutVideoError(String s, int i, int j)
    {
        s = a.aJ();
        s.put("code", ContentError.ANDROID_VIDEO_ERROR.getCode());
        s.put("message", ContentError.ANDROID_VIDEO_ERROR.getMessage());
        s.put("what", i);
        s.put("extra", j);
        dispatchMessage("error", s.aL().toString());
    }

    void notifyActivityPaused()
    {
        if (isBrowserDisplayed())
        {
            browserViewContainer.onPause();
        } else
        if (sessionMViewContainer != null)
        {
            sessionMViewContainer.onPause();
            return;
        }
    }

    void notifyActivityResumed()
    {
        if (isBrowserDisplayed())
        {
            browserViewContainer.onResume();
        } else
        if (sessionMViewContainer != null)
        {
            sessionMViewContainer.onResume();
            return;
        }
    }

    void notifyContentAboutError(ContentError contenterror, String s)
    {
        a a1 = a.aJ();
        a1.put("code", contenterror.getCode());
        a1.put("message", contenterror.getMessage());
        if (s != null)
        {
            a1.put("url", s);
        }
        dispatchMessage("error", a1.aL().toString());
    }

    public void onClosePressed(final SessionMViewContainer view)
    {
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController this$0;
            final SessionMViewContainer val$view;

            public void run()
            {
                if (view == browserViewContainer)
                {
                    dismissBrowser();
                    return;
                } else
                {
                    dismiss();
                    return;
                }
            }

            
            {
                this$0 = ActivityController.this;
                view = sessionmviewcontainer;
                super();
            }
        });
    }

    public void onFailure(SessionMViewContainer sessionmviewcontainer, int i, final String description, String s)
    {
        if (sessionmviewcontainer == browserViewContainer)
        {
            notifyContentAboutError(ContentError.BROWSER_LOAD_FAILED, s);
            return;
        }
        if (loadWebViewListener != null)
        {
            getActivityContext().runOnUiThread(new Runnable() {

                final ActivityController this$0;
                final String val$description;

                public void run()
                {
                    loadWebViewListener.onFailure(new Throwable(description));
                    loadWebViewListener = null;
                }

            
            {
                this$0 = ActivityController.this;
                description = s;
                super();
            }
            });
        } else
        {
            notifyContentAboutError(ContentError.WEBVIEW_LOAD_ERROR, s);
        }
        StatsCollector.a(com.sessionm.core.StatsCollector.Stat.eB, 1L);
    }

    public void onValueCallback(SessionMViewContainer sessionmviewcontainer, ValueCallback valuecallback)
    {
        if (isFullScreenActivity())
        {
            ((SessionMActivity)getActivityContext()).setUploadFile(valuecallback);
        }
    }

    public void onVideoCompleted(SessionMVideoView sessionmvideoview)
    {
        dispatchMessage("video.ended", createDispatchJsonObject(sessionmvideoview).toString());
    }

    public boolean onVideoError(SessionMVideoView sessionmvideoview, int i, int j)
    {
        dispatchMessage("video.error", "{}");
        notifyAboutVideoError(sessionmvideoview.getUrl(), i, j);
        return false;
    }

    public void onVideoProgress(SessionMVideoView sessionmvideoview, int i)
    {
        dispatchMessage("video.progress", createDispatchJsonObject(sessionmvideoview).toString());
    }

    public void onVideoStarted(SessionMVideoView sessionmvideoview)
    {
        dispatchMessage("video.playing", "{}");
    }

    public void onViewLoadStarted(SessionMViewContainer sessionmviewcontainer, String s)
    {
        if (isBrowserDisplayed() && sessionmviewcontainer == browserViewContainer)
        {
            sessionmviewcontainer = a.aJ();
            sessionmviewcontainer.put("url", s);
            dispatchMessage("loadURL.callback", sessionmviewcontainer.aL().toString());
        }
    }

    public void onViewLoaded(SessionMViewContainer sessionmviewcontainer, String s)
    {
        if (isBrowserDisplayed() && browserViewContainer == sessionmviewcontainer)
        {
            if (browserViewState == State.LOADING_WEBVIEW)
            {
                browserViewState = State.PRESENTED;
            }
            lastBrowserUrl = s;
        } else
        {
            sessionmviewcontainer = getState();
            if (sessionmviewcontainer != State.PRESENTED)
            {
                if (sessionmviewcontainer == State.DISMISSED)
                {
                    if (Log.isLoggable("SessionM.Activity", 3))
                    {
                        Log.d("SessionM.Activity", "Cancel display due to DISMISSED state.");
                        return;
                    }
                } else
                {
                    if (loadWebViewListener == null)
                    {
                        displayView();
                    } else
                    {
                        loadWebViewListener.onWebViewLoaded();
                        loadWebViewListener = null;
                    }
                    setState(State.LOADED_WEBVIEW);
                    return;
                }
            }
        }
    }

    public void prepare(final PrepareListener prepareListener)
    {
        if (prepareListener == null)
        {
            throw new NullPointerException("Prepare listener is null");
        }
        if (!session.getSessionState().isStarted() && !session.C().isOptedOut())
        {
            setState(State.UNPRESENTABLE);
            prepareListener.onFailure(new IllegalStateException((new StringBuilder()).append("Session state is ").append(session.getSessionState()).toString()));
            return;
        }
        final LoadWebViewListener listener = new LoadWebViewListener() {

            final ActivityController this$0;
            final PrepareListener val$prepareListener;

            public void onFailure(Throwable throwable)
            {
                prepareListener.onFailure(throwable);
            }

            public void onWebViewLoaded()
            {
                prepareListener.onPrepared();
            }

            
            {
                this$0 = ActivityController.this;
                prepareListener = preparelistener;
                super();
            }
        };
        if (getState() == State.LOADED_CONTENT)
        {
            loadWebView(contentUrl, activityContent, listener);
            return;
        } else
        {
            loadActivity(new LoadContentListener() {

                final ActivityController this$0;
                final LoadWebViewListener val$listener;
                final PrepareListener val$prepareListener;

                public void onContentLoaded(String s, String s1)
                {
                    loadWebView(s, s1, listener);
                }

                public void onFailure(Throwable throwable)
                {
                    prepareListener.onFailure(throwable);
                }

            
            {
                this$0 = ActivityController.this;
                listener = loadwebviewlistener;
                prepareListener = preparelistener;
                super();
            }
            });
            return;
        }
    }

    public void present(boolean flag)
    {
        getActivityContext().runOnUiThread(new Runnable() {

            final ActivityController this$0;

            public void run()
            {
                if (Log.isLoggable("SessionM.Activity", 3))
                {
                    Log.d("SessionM.Activity", String.format(Locale.US, "Present activity, fullScreen: %b, URL: %s ", new Object[] {
                        Boolean.valueOf(isFullScreenActivity()), contentUrl
                    }));
                }
                prepare(new PrepareListener() {

                    final _cls4 this$1;

                    public void onFailure(Throwable throwable)
                    {
                        dismiss();
                    }

                    public void onPrepared()
                    {
                        displayView();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
            }

            
            {
                this$0 = ActivityController.this;
                super();
            }
        });
    }

    public void presentBrowser(String s)
    {
        boolean flag = false;
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("present browser with url: %s", new Object[] {
                s
            }));
        }
        SessionMViewContainer sessionmviewcontainer;
        if (browserViewState != State.DISMISSED)
        {
            s = lastBrowserUrl;
        } else
        {
            flag = true;
        }
        sessionmviewcontainer = new SessionMViewContainer(getActivityContext(), SessionMViewContainer.WebViewType.BROWSER, this);
        setBrowserView(sessionmviewcontainer);
        sessionmviewcontainer.loadUrl(s);
        lastBrowserUrl = s;
        s = sessionmviewcontainer.getViewGroup();
        if (flag)
        {
            TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
            translateanimation.setDuration(300L);
            browserViewContainer.getViewGroup().startAnimation(translateanimation);
        }
        getActivityContext().addContentView(s, s.getLayoutParams());
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", "browser presented.");
        }
        browserViewState = State.LOADING_WEBVIEW;
    }

    public void removeBrowserView()
    {
        browserViewContainer.onPause();
        browserViewContainer.getViewGroup().setVisibility(8);
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("Removing browser view %s", new Object[] {
                browserViewContainer
            }));
        }
        removeView(browserViewContainer);
        browserViewContainer = null;
        browserViewState = State.DISMISSED;
        executeJavascript("GreyhoundEventDispatcher.dispatch('browserDidClose',{});");
        lastBrowserUrl = null;
    }

    protected void removeView(SessionMViewContainer sessionmviewcontainer)
    {
        if (sessionmviewcontainer != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.view.ViewParent viewparent;
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("Removing view: %s", new Object[] {
                sessionmviewcontainer
            }));
        }
        viewparent = sessionmviewcontainer.getViewGroup().getParent();
        if (viewparent == null || !(viewparent instanceof ViewGroup))
        {
            break; /* Loop/switch isn't completed */
        }
        ((ViewGroup)viewparent).removeView(sessionmviewcontainer.getViewGroup());
        sessionmviewcontainer.destroy();
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("View removed and destroyed %s.", new Object[] {
                sessionmviewcontainer
            }));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (Log.isLoggable("SessionM.Activity", 3))
        {
            Log.d("SessionM.Activity", String.format("Unable to remove view: %s", new Object[] {
                sessionmviewcontainer
            }));
        }
        if (viewparent != null)
        {
            Log.e("SessionM.Activity", (new StringBuilder()).append("Problem removing web view from view hierarchy because parent is not ViewGroup, parent: ").append(viewparent).toString());
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void replaceDisplayContainer(ActivityController activitycontroller)
    {
        session.a(activitycontroller);
        ((SessionMActivity)getActivityContext()).pushActivityController(activitycontroller);
        session.b(this);
        setState(State.DISMISSED);
        activitycontroller.sendJSLoadToContent();
    }

    void resetWebView()
    {
        if (browserViewContainer != null)
        {
            removeView(browserViewContainer);
            browserViewContainer = null;
        }
        if (sessionMViewContainer != null)
        {
            removeView(sessionMViewContainer);
            sessionMViewContainer = null;
        }
    }

    protected void resizeView(android.view.ViewGroup.LayoutParams layoutparams)
    {
        getViewContainer().getViewGroup().setLayoutParams(layoutparams);
    }

    void setActivityContent(String s)
    {
        activityContent = s;
        if (activityContent != null)
        {
            setState(State.LOADED_CONTENT);
        }
    }

    public void setBrowserView(SessionMViewContainer sessionmviewcontainer)
    {
        browserViewContainer = sessionmviewcontainer;
        if (browserViewContainer != null)
        {
            browserViewContainer.setListener(this);
        }
    }

    void setContentData(a a1)
    {
        contentData = a1;
    }

    void setContentData2(a a1)
    {
        contentData2 = a1;
    }

    public void setJsInterfaceListener(JSInterfaceListener jsinterfacelistener)
    {
        jsInterfaceListener = jsinterfacelistener;
    }

    public void setProvidedView(FrameLayout framelayout)
    {
        providedViewGroup = framelayout;
    }

    public void setStateChangeListener(StateChangeListener statechangelistener)
    {
        stateChangeListener = statechangelistener;
    }

    static 
    {
        boolean flag;
        if (!com/sessionm/ui/ActivityController.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        xPosFlagMap = new HashMap();
        yPosFlagMap = new HashMap();
        xPosFlagMap.put("left", Integer.valueOf(3));
        xPosFlagMap.put("right", Integer.valueOf(5));
        xPosFlagMap.put("center", Integer.valueOf(1));
        xPosFlagMap.put("middle", Integer.valueOf(1));
        yPosFlagMap.put("bottom", Integer.valueOf(80));
        yPosFlagMap.put("top", Integer.valueOf(48));
        yPosFlagMap.put("center", Integer.valueOf(16));
        yPosFlagMap.put("middle", Integer.valueOf(16));
    }






/*
    static LoadWebViewListener access$1102(ActivityController activitycontroller, LoadWebViewListener loadwebviewlistener)
    {
        activitycontroller.loadWebViewListener = loadwebviewlistener;
        return loadwebviewlistener;
    }

*/











/*
    static SessionMViewContainer access$602(ActivityController activitycontroller, SessionMViewContainer sessionmviewcontainer)
    {
        activitycontroller.sessionMViewContainer = sessionmviewcontainer;
        return sessionmviewcontainer;
    }

*/



}
