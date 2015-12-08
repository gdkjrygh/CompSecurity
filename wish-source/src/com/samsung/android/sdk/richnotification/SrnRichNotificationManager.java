// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            SrnRichNotification, SrnValidationException, ErrorToast, GsonHelper

public class SrnRichNotificationManager
{
    public static final class ErrorType extends Enum
    {

        private static final ErrorType ENUM$VALUES[];
        public static final ErrorType UNDEFINED;

        static ErrorType get(int i)
        {
            if (i >= 0 && i < values().length)
            {
                return values()[i];
            } else
            {
                return UNDEFINED;
            }
        }

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/samsung/android/sdk/richnotification/SrnRichNotificationManager$ErrorType, s);
        }

        public static ErrorType[] values()
        {
            ErrorType aerrortype[] = ENUM$VALUES;
            int i = aerrortype.length;
            ErrorType aerrortype1[] = new ErrorType[i];
            System.arraycopy(aerrortype, 0, aerrortype1, 0, i);
            return aerrortype1;
        }

        static 
        {
            UNDEFINED = new ErrorType("UNDEFINED", 0);
            ENUM$VALUES = (new ErrorType[] {
                UNDEFINED
            });
        }

        private ErrorType(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface EventListener
    {

        public abstract void onError(UUID uuid, ErrorType errortype);

        public abstract void onRead(UUID uuid);

        public abstract void onRemoved(UUID uuid);
    }

    private static class ForwardHandler extends Handler
    {

        private static final int FORWARD_DISMISS = 1;
        private static final int FORWARD_DISMISS_ALL = 2;
        private static final int FORWARD_NOTIFY = 0;
        private static final int FORWARD_SHOW_ERROR_TOAST = 3;
        private final Context mContext;

        private void handleDismiss(UUID uuid)
        {
            Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
            intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_DISMISS");
            intent.putExtra("notification.sdk.uuid", uuid.toString());
            SrnRichNotificationManager.sendToNotificationService(mContext, intent);
        }

        private void handleDismissAll()
        {
            Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
            intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_DISMISS_ALL");
            SrnRichNotificationManager.sendToNotificationService(mContext, intent);
        }

        private void handleNotify(SrnRichNotification srnrichnotification)
        {
            Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
            String s = GsonHelper.getGson().toJson(srnrichnotification);
            intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_SEND");
            intent.putExtra("notification.sdk.message", s);
            intent.putExtra("notification.sdk.uuid", srnrichnotification.getUuid().toString());
            intent.putExtra("ASSOCIATED_NOTI_ID", srnrichnotification.getAssociatedAndroidNotification());
            intent.putExtra("ASSOCIATED_NOTI_TAG", srnrichnotification.getAssociatedAndroidNotificationTag());
            SrnRichNotificationManager.sendToNotificationService(mContext, intent);
        }

        private void handleShowErrorToast(ErrorToast errortoast)
        {
            Intent intent = new Intent("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_FORWARD");
            intent.putExtra("ACTION_RICH_NOTIFICATION_FORWARD_TYPE", "RICH_NOTIFICATION_SHOW_ERROR_TOAST");
            intent.putExtra("notification.sdk.uuid", errortoast.getUuid().toString());
            intent.putExtra("notification.sdk.message", GsonHelper.getGson().toJson(errortoast));
            SrnRichNotificationManager.sendToNotificationService(mContext, intent);
        }

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                handleNotify((SrnRichNotification)message.obj);
                return;

            case 1: // '\001'
                handleDismiss((UUID)message.obj);
                return;

            case 2: // '\002'
                handleDismissAll();
                return;

            case 3: // '\003'
                handleShowErrorToast((ErrorToast)message.obj);
                break;
            }
        }

        private ForwardHandler(Context context, Looper looper)
        {
            super(looper);
            mContext = context;
        }

        ForwardHandler(Context context, Looper looper, ForwardHandler forwardhandler)
        {
            this(context, looper);
        }
    }

    private static class LocalHandler extends Handler
    {

        private static final String CALLBACK_EXTRA_ERROR = "error";
        private static final String CALLBACK_EXTRA_UUID = "uuid";
        private static final String CALLBACK_EXTRA_UUID_LIST = "uuid_list";
        private static final int CALLBACK_TYPE_ALL_REMOVED = 2;
        private static final int CALLBACK_TYPE_ERROR = 3;
        private static final int CALLBACK_TYPE_READ = 0;
        private static final int CALLBACK_TYPE_REMOVED = 1;
        private final WeakReference mManagerRef;

        private void handleAllRemoved(SrnRichNotificationManager srnrichnotificationmanager, Bundle bundle)
        {
            bundle = bundle.getStringArrayList("uuid_list");
            if (bundle == null)
            {
                Log.e("RichNotification", "RICH_NOTIFICATION_CALLBACK_ALL_REMOVED : uuid list is null.");
            } else
            {
                bundle = bundle.iterator();
                while (bundle.hasNext()) 
                {
                    String s = (String)bundle.next();
                    try
                    {
                        notifyRemoved(srnrichnotificationmanager, UUID.fromString(s));
                    }
                    catch (IllegalArgumentException illegalargumentexception)
                    {
                        Log.e("RichNotification", String.format("RICH_NOTIFICATION_CALLBACK_ALL_REMOVED : uuid is not formatted correctly. (%s)", new Object[] {
                            s
                        }));
                    }
                }
            }
        }

        private void handleCallbacks(SrnRichNotificationManager srnrichnotificationmanager, Bundle bundle, int i)
        {
            String s = bundle.getString("uuid");
            if (s != null) goto _L2; else goto _L1
_L1:
            Log.e("RichNotification", "RICH_NOTIFICATION_CALLBACK : uuid is null.");
_L4:
            return;
_L2:
            UUID uuid;
            try
            {
                uuid = UUID.fromString(s);
            }
            // Misplaced declaration of an exception variable
            catch (SrnRichNotificationManager srnrichnotificationmanager)
            {
                Log.e("RichNotification", String.format("RICH_NOTIFICATION_CALLBACK : uuid is not formatted correctly. (%s)", new Object[] {
                    s
                }));
                return;
            }
            switch (i)
            {
            case 2: // '\002'
            default:
                return;

            case 0: // '\0'
                Log.d("RichNotification", (new StringBuilder("RICH_NOTIFICATION_CALLBACK_READ : ")).append(s).toString());
                srnrichnotificationmanager = srnrichnotificationmanager.mListeners.iterator();
                while (srnrichnotificationmanager.hasNext()) 
                {
                    ((EventListener)srnrichnotificationmanager.next()).onRead(uuid);
                }
                break;

            case 1: // '\001'
                notifyRemoved(srnrichnotificationmanager, uuid);
                return;

            case 3: // '\003'
                i = bundle.getInt("error", 0);
                Log.d("RichNotification", (new StringBuilder("RICH_NOTIFICATION_CALLBACK_REMOVED : ")).append(s).append(", ").append(i).toString());
                bundle = ErrorType.get(i);
                srnrichnotificationmanager = srnrichnotificationmanager.mListeners.iterator();
                break; /* Loop/switch isn't completed */
            }
            if (true) goto _L4; else goto _L3
_L3:
            while (srnrichnotificationmanager.hasNext()) 
            {
                ((EventListener)srnrichnotificationmanager.next()).onError(uuid, bundle);
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        private void notifyRemoved(SrnRichNotificationManager srnrichnotificationmanager, UUID uuid)
        {
            Log.d("RichNotification", (new StringBuilder("RICH_NOTIFICATION_CALLBACK_REMOVED : ")).append(uuid).toString());
            srnrichnotificationmanager = srnrichnotificationmanager.mListeners.iterator();
            do
            {
                if (!srnrichnotificationmanager.hasNext())
                {
                    return;
                }
                ((EventListener)srnrichnotificationmanager.next()).onRemoved(uuid);
            } while (true);
        }

        public void handleMessage(Message message)
        {
            SrnRichNotificationManager srnrichnotificationmanager = (SrnRichNotificationManager)mManagerRef.get();
            if (srnrichnotificationmanager == null)
            {
                return;
            }
            if (srnrichnotificationmanager.mListeners == null || srnrichnotificationmanager.mListeners.size() == 0)
            {
                Log.w("RichNotification", "No event listener registered.");
                return;
            }
            message = (Bundle)message.obj;
            int i = message.getInt("notification.sdk.actiontype", -1);
            if (i == 2)
            {
                handleAllRemoved(srnrichnotificationmanager, message);
                return;
            } else
            {
                handleCallbacks(srnrichnotificationmanager, message, i);
                return;
            }
        }

        private LocalHandler(Context context, SrnRichNotificationManager srnrichnotificationmanager)
        {
            super(context.getMainLooper());
            mManagerRef = new WeakReference(srnrichnotificationmanager);
        }

        LocalHandler(Context context, SrnRichNotificationManager srnrichnotificationmanager, LocalHandler localhandler)
        {
            this(context, srnrichnotificationmanager);
        }
    }

    private class RichNotificationReceiver extends BroadcastReceiver
    {

        final SrnRichNotificationManager this$0;

        public void onReceive(Context context, Intent intent)
        {
label0:
            {
                if (intent.getAction().equals("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_BACKWARD"))
                {
                    String s = intent.getStringExtra("notification.sdk.packagename");
                    if (context.getPackageName().equals(s))
                    {
                        break label0;
                    }
                }
                return;
            }
            context = mHandler.obtainMessage();
            context.obj = intent.getExtras();
            mHandler.sendMessage(context);
        }

        private RichNotificationReceiver()
        {
            this$0 = SrnRichNotificationManager.this;
            super();
        }

        RichNotificationReceiver(RichNotificationReceiver richnotificationreceiver)
        {
            this();
        }
    }


    private static final int ENABLE_NOTIFICATION = 1;
    private static final String EXTRA_ENABLE_PANEL_NOTI = "[NS]extra_enable_panel_noti";
    private static final String TAG = "RichNotification";
    private static Boolean sHasPermission;
    private final Context mContext;
    private ForwardHandler mForwardHandler;
    private final LocalHandler mHandler;
    private boolean mIsStarted;
    private final List mListeners = new ArrayList();
    private RichNotificationReceiver mReceiver;

    public SrnRichNotificationManager(Context context)
    {
        mContext = context.getApplicationContext();
        mHandler = new LocalHandler(context, this, null);
    }

    private void sendRichNotification(SrnRichNotification srnrichnotification)
    {
        Log.i("RichNotification", "sendRichNotification(RichNotification notification)");
        srnrichnotification = new SrnRichNotification(srnrichnotification);
        mForwardHandler.obtainMessage(0, srnrichnotification).sendToTarget();
    }

    private static void sendToNotificationService(Context context, Intent intent)
    {
        intent.putExtra("notification.sdk.packagename", context.getPackageName());
        intent.setPackage("com.samsung.accessory.goproviders");
        context.sendBroadcast(intent);
    }

    public static void setRouteCondition(Notification notification)
    {
        if (notification != null)
        {
            notification.extras.putInt("[NS]extra_enable_panel_noti", 1);
        }
    }

    public void dismiss(UUID uuid)
    {
        if (!mIsStarted)
        {
            throw new IllegalStateException("The manager is not started.");
        }
        if (uuid == null)
        {
            throw new NullPointerException("uuid is null.");
        } else
        {
            Log.i("RichNotification", "dismiss");
            mForwardHandler.obtainMessage(1, uuid).sendToTarget();
            return;
        }
    }

    public void dismissAll()
    {
        if (!mIsStarted)
        {
            throw new IllegalStateException("The manager is not started.");
        } else
        {
            Log.i("RichNotification", "dismissAll");
            mForwardHandler.obtainMessage(2).sendToTarget();
            return;
        }
    }

    public boolean isConnected()
    {
        return android.provider.Settings.System.getInt(mContext.getContentResolver(), "RICH_NOTIFICATION_AVAILABLE", 0) == 1;
    }

    public UUID notify(SrnRichNotification srnrichnotification)
    {
        int i;
        i = 0;
        if (!mIsStarted)
        {
            throw new IllegalStateException("The manager is not started.");
        }
        if (srnrichnotification == null)
        {
            throw new NullPointerException("notification is null");
        }
        if (sHasPermission != null) goto _L2; else goto _L1
_L1:
        sHasPermission = Boolean.valueOf(false);
        PackageInfo packageinfo = mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 4096);
        if (packageinfo == null) goto _L2; else goto _L3
_L3:
        if (packageinfo.requestedPermissions == null) goto _L2; else goto _L4
_L4:
        String as[];
        int j;
        as = packageinfo.requestedPermissions;
        j = as.length;
_L8:
        if (i < j) goto _L5; else goto _L2
_L2:
        if (!sHasPermission.booleanValue())
        {
            throw new SecurityException("com.samsung.wmanager.ENABLE_NOTIFICATION permission is required");
        }
        break; /* Loop/switch isn't completed */
_L5:
        try
        {
            if (!"com.samsung.wmanager.ENABLE_NOTIFICATION".equals(as[i]))
            {
                break; /* Loop/switch isn't completed */
            }
            sHasPermission = Boolean.valueOf(true);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        if (true) goto _L2; else goto _L6
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
        try
        {
            srnrichnotification.validateSelf();
            sendRichNotification(srnrichnotification);
            srnrichnotification = srnrichnotification.getUuid();
        }
        // Misplaced declaration of an exception variable
        catch (SrnRichNotification srnrichnotification)
        {
            throw new IllegalArgumentException(srnrichnotification.getMessage());
        }
        return srnrichnotification;
    }

    public void registerRichNotificationListener(EventListener eventlistener)
    {
        if (eventlistener == null)
        {
            throw new NullPointerException("listener is null.");
        }
        if (mListeners.size() == 0)
        {
            mReceiver = new RichNotificationReceiver(null);
            mContext.registerReceiver(mReceiver, new IntentFilter("com.samsung.notifications.rich.ACTION_RICH_NOTIFICATION_BACKWARD"));
        }
        mListeners.add(eventlistener);
    }

    public void showErrorToast(UUID uuid, String s)
    {
        if (!mIsStarted)
        {
            throw new IllegalStateException("The manager is not started.");
        }
        if (uuid == null)
        {
            throw new NullPointerException("uuid is null.");
        }
        if (s == null)
        {
            throw new NullPointerException("errorMessage is null.");
        } else
        {
            mForwardHandler.obtainMessage(3, new ErrorToast(uuid, s)).sendToTarget();
            return;
        }
    }

    public void start()
    {
        if (mIsStarted)
        {
            throw new IllegalStateException("The manager is already started.");
        }
        mIsStarted = true;
        Object obj = new HandlerThread("ForwardThread");
        ((HandlerThread) (obj)).start();
        Looper looper = ((HandlerThread) (obj)).getLooper();
        obj = looper;
        if (looper == null)
        {
            obj = Looper.getMainLooper();
        }
        mForwardHandler = new ForwardHandler(mContext, ((Looper) (obj)), null);
    }

    public void stop()
    {
        if (!mIsStarted)
        {
            throw new IllegalStateException("The manager is not started.");
        } else
        {
            mIsStarted = false;
            mForwardHandler.getLooper().quitSafely();
            mForwardHandler = null;
            return;
        }
    }

    public void unregisterRichNotificationListener(EventListener eventlistener)
    {
        if (mListeners.size() != 0)
        {
            mListeners.remove(eventlistener);
            if (mListeners.size() == 0)
            {
                mContext.unregisterReceiver(mReceiver);
                mReceiver = null;
                return;
            }
        }
    }



}
