// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity, NotificationCompat

public class NotificationManagerCompat
{

    private static final Impl IMPL;
    private static final int SIDE_CHANNEL_BIND_FLAGS;
    private static Set sEnabledNotificationListenerPackages;
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock;
    private static final Object sLock;
    private static SideChannelManager sSideChannelManager;
    private static final String z[];
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    private NotificationManagerCompat(Context context)
    {
        mContext = context;
        mNotificationManager = (NotificationManager)mContext.getSystemService(z[1]);
    }

    public static NotificationManagerCompat from(Context context)
    {
        return new NotificationManagerCompat(context);
    }

    public static Set getEnabledListenerPackages(Context context)
    {
        int j = FragmentActivity.a;
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), z[2]);
        if (context != null && !context.equals(sEnabledNotificationListeners))
        {
            String as[] = context.split(":");
            HashSet hashset = new HashSet(as.length);
            int k = as.length;
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break;
                }
                ComponentName componentname = ComponentName.unflattenFromString(as[i]);
                if (componentname != null)
                {
                    hashset.add(componentname.getPackageName());
                }
                i++;
            } while (j == 0);
            synchronized (sEnabledNotificationListenersLock)
            {
                sEnabledNotificationListenerPackages = hashset;
                sEnabledNotificationListeners = context;
            }
        }
        return sEnabledNotificationListenerPackages;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void pushSideChannelQueue(Task task)
    {
        synchronized (sLock)
        {
            if (sSideChannelManager == null)
            {
                sSideChannelManager = new SideChannelManager(mContext.getApplicationContext());
            }
        }
        sSideChannelManager.queueTask(task);
        return;
        task;
        obj;
        JVM INSTR monitorexit ;
        throw task;
    }

    private static boolean useSideChannelForNotification(Notification notification)
    {
        boolean flag1 = false;
        notification = NotificationCompat.getExtras(notification);
        boolean flag = flag1;
        if (notification != null)
        {
            flag = flag1;
            if (notification.getBoolean(z[0]))
            {
                flag = true;
            }
        }
        return flag;
    }

    public void cancel(int i)
    {
        cancel(null, i);
    }

    public void cancel(String s, int i)
    {
        IMPL.cancelNotification(mNotificationManager, s, i);
        if (android.os.Build.VERSION.SDK_INT <= 19)
        {
            pushSideChannelQueue(new CancelTask(mContext.getPackageName(), i, s));
        }
    }

    public void notify(int i, Notification notification)
    {
        notify(null, i, notification);
    }

    public void notify(String s, int i, Notification notification)
    {
label0:
        {
            if (useSideChannelForNotification(notification))
            {
                pushSideChannelQueue(new NotifyTask(mContext.getPackageName(), i, s, notification));
                IMPL.cancelNotification(mNotificationManager, s, i);
                if (FragmentActivity.a == 0)
                {
                    break label0;
                }
            }
            IMPL.postNotification(mNotificationManager, s, i, notification);
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "g:~HDo04I^v$uH_(!i_xo0\177yCg:t_G";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "h;nSMo7{NBi:";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "c:{XGc0ETDr=|SHg sUEY8sI_c:\177HX";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                sEnabledNotificationListenersLock = new Object();
                sEnabledNotificationListenerPackages = new HashSet();
                sLock = new Object();
                byte byte0;
                char c;
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    IMPL = new ImplIceCreamSandwich();
                } else
                if (android.os.Build.VERSION.SDK_INT >= 5)
                {
                    IMPL = new ImplEclair();
                } else
                {
                    IMPL = new ImplBase();
                }
                SIDE_CHANNEL_BIND_FLAGS = IMPL.getSideChannelBindFlags();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 237
    //                   1 243
    //                   2 249
    //                   3 255;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_255;
_L3:
        byte0 = 43;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 6;
          goto _L9
_L5:
        byte0 = 84;
          goto _L9
_L6:
        byte0 = 26;
          goto _L9
        byte0 = 58;
          goto _L9
    }


    private class SideChannelManager
        implements android.os.Handler.Callback, ServiceConnection
    {

        private static final String z[];
        private Set mCachedEnabledPackages;
        private final Context mContext;
        private final Handler mHandler;
        private final HandlerThread mHandlerThread;
        private final Map mRecordMap = new HashMap();

        private boolean ensureServiceBound(ListenerRecord listenerrecord)
        {
            class ListenerRecord
            {

                public boolean bound;
                public final ComponentName componentName;
                public int retryCount;
                public INotificationSideChannel service;
                public LinkedList taskQueue;

                public ListenerRecord(ComponentName componentname)
                {
                    bound = false;
                    taskQueue = new LinkedList();
                    retryCount = 0;
                    componentName = componentname;
                }
            }

label0:
            {
                if (listenerrecord.bound)
                {
                    return true;
                }
                Intent intent = (new Intent(z[30])).setComponent(listenerrecord.componentName);
                listenerrecord.bound = mContext.bindService(intent, this, NotificationManagerCompat.SIDE_CHANNEL_BIND_FLAGS);
                if (listenerrecord.bound)
                {
                    listenerrecord.retryCount = 0;
                    if (FragmentActivity.a == 0)
                    {
                        break label0;
                    }
                }
                Log.w(z[29], (new StringBuilder()).append(z[31]).append(listenerrecord.componentName).toString());
                mContext.unbindService(this);
            }
            return listenerrecord.bound;
        }

        private void ensureServiceUnbound(ListenerRecord listenerrecord)
        {
            if (listenerrecord.bound)
            {
                mContext.unbindService(this);
                listenerrecord.bound = false;
            }
            listenerrecord.service = null;
        }

        private void handleQueueTask(Task task)
        {
            int i = FragmentActivity.a;
            updateListenerMap();
            Iterator iterator = mRecordMap.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ListenerRecord listenerrecord = (ListenerRecord)iterator.next();
                listenerrecord.taskQueue.add(task);
                processListenerQueue(listenerrecord);
            } while (i == 0);
        }

        private void handleRetryListenerQueue(ComponentName componentname)
        {
            componentname = (ListenerRecord)mRecordMap.get(componentname);
            if (componentname != null)
            {
                processListenerQueue(componentname);
            }
        }

        private void handleServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            componentname = (ListenerRecord)mRecordMap.get(componentname);
            if (componentname != null)
            {
                componentname.service = INotificationSideChannel.Stub.asInterface(ibinder);
                componentname.retryCount = 0;
                processListenerQueue(componentname);
            }
        }

        private void handleServiceDisconnected(ComponentName componentname)
        {
            componentname = (ListenerRecord)mRecordMap.get(componentname);
            if (componentname != null)
            {
                ensureServiceUnbound(componentname);
            }
        }

        private void processListenerQueue(ListenerRecord listenerrecord)
        {
            int i;
            i = FragmentActivity.a;
            boolean flag;
            try
            {
                if (Log.isLoggable(z[12], 3))
                {
                    Log.d(z[13], (new StringBuilder()).append(z[14]).append(listenerrecord.componentName).append(z[7]).append(listenerrecord.taskQueue.size()).append(z[15]).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (ListenerRecord listenerrecord)
            {
                throw listenerrecord;
            }
            try
            {
                flag = listenerrecord.taskQueue.isEmpty();
            }
            // Misplaced declaration of an exception variable
            catch (ListenerRecord listenerrecord)
            {
                throw listenerrecord;
            }
            if (!flag) goto _L2; else goto _L1
_L1:
            return;
_L2:
            Object obj;
            if (!ensureServiceBound(listenerrecord))
            {
                break MISSING_BLOCK_LABEL_119;
            }
            obj = listenerrecord.service;
            if (obj != null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            try
            {
                scheduleListenerRetry(listenerrecord);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ListenerRecord listenerrecord)
            {
                throw listenerrecord;
            }
            listenerrecord;
            throw listenerrecord;
_L4:
            obj = (Task)listenerrecord.taskQueue.peek();
            if (obj == null && i == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (Log.isLoggable(z[5], 3))
            {
                Log.d(z[8], (new StringBuilder()).append(z[6]).append(obj).toString());
            }
            ((Task) (obj)).send(listenerrecord.service);
            listenerrecord.taskQueue.remove();
_L7:
            if (i == 0) goto _L4; else goto _L3
_L3:
            if (listenerrecord.taskQueue.isEmpty()) goto _L1; else goto _L5
_L5:
            scheduleListenerRetry(listenerrecord);
            return;
            listenerrecord;
            throw listenerrecord;
            Object obj1;
            obj1;
            throw obj1;
            obj1;
            if (!Log.isLoggable(z[9], 3)) goto _L3; else goto _L6
_L6:
            Log.d(z[11], (new StringBuilder()).append(z[10]).append(listenerrecord.componentName).toString());
              goto _L3
              goto _L1
            listenerrecord;
            throw listenerrecord;
            obj1;
            try
            {
                Log.w(z[3], (new StringBuilder()).append(z[4]).append(listenerrecord.componentName).toString(), ((Throwable) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (ListenerRecord listenerrecord)
            {
                throw listenerrecord;
            }
            if (i == 0) goto _L3; else goto _L7
        }

        private void scheduleListenerRetry(ListenerRecord listenerrecord)
        {
            if (mHandler.hasMessages(3, listenerrecord.componentName))
            {
                return;
            }
            listenerrecord.retryCount = listenerrecord.retryCount + 1;
            if (listenerrecord.retryCount > 6)
            {
                Log.w(z[17], (new StringBuilder()).append(z[20]).append(listenerrecord.taskQueue.size()).append(z[23]).append(listenerrecord.componentName).append(z[21]).append(listenerrecord.retryCount).append(z[18]).toString());
                listenerrecord.taskQueue.clear();
                return;
            }
            int i = (1 << listenerrecord.retryCount - 1) * 1000;
            if (Log.isLoggable(z[16], 3))
            {
                Log.d(z[19], (new StringBuilder()).append(z[24]).append(i).append(z[22]).toString());
            }
            listenerrecord = mHandler.obtainMessage(3, listenerrecord.componentName);
            mHandler.sendMessageDelayed(listenerrecord, i);
        }

        private void updateListenerMap()
        {
            int i = FragmentActivity.a;
            Object obj = NotificationManagerCompat.getEnabledListenerPackages(mContext);
            if (!((Set) (obj)).equals(mCachedEnabledPackages))
            {
                mCachedEnabledPackages = ((Set) (obj));
                Object obj1 = mContext.getPackageManager().queryIntentServices((new Intent()).setAction(z[32]), 4);
                HashSet hashset = new HashSet();
                obj1 = ((List) (obj1)).iterator();
label0:
                do
                {
                    ComponentName componentname1;
                    do
                    {
                        ResolveInfo resolveinfo;
                        do
                        {
                            if (!((Iterator) (obj1)).hasNext())
                            {
                                break label0;
                            }
                            resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
                        } while (!((Set) (obj)).contains(resolveinfo.serviceInfo.packageName) && i == 0);
                        componentname1 = new ComponentName(resolveinfo.serviceInfo.packageName, resolveinfo.serviceInfo.name);
                        if (resolveinfo.serviceInfo.permission == null)
                        {
                            break;
                        }
                        Log.w(z[37], (new StringBuilder()).append(z[41]).append(componentname1).append(z[33]).toString());
                    } while (i == 0);
                    hashset.add(componentname1);
                } while (i == 0);
                obj = hashset.iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    ComponentName componentname = (ComponentName)((Iterator) (obj)).next();
                    if (!mRecordMap.containsKey(componentname))
                    {
                        if (Log.isLoggable(z[34], 3))
                        {
                            Log.d(z[40], (new StringBuilder()).append(z[38]).append(componentname).toString());
                        }
                        mRecordMap.put(componentname, new ListenerRecord(componentname));
                    }
                } while (i == 0);
                obj = mRecordMap.entrySet().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    if (!hashset.contains(entry.getKey()))
                    {
                        if (Log.isLoggable(z[39], 3))
                        {
                            Log.d(z[35], (new StringBuilder()).append(z[36]).append(entry.getKey()).toString());
                        }
                        ensureServiceUnbound((ListenerRecord)entry.getValue());
                        ((Iterator) (obj)).remove();
                    }
                } while (i == 0);
            }
            break MISSING_BLOCK_LABEL_448;
            while (true) 
            {
                return;
            }
        }

        public boolean handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 0: // '\0'
                handleQueueTask((Task)message.obj);
                return true;

            case 1: // '\001'
                message = (ServiceConnectedEvent)message.obj;
                handleServiceConnected(((ServiceConnectedEvent) (message)).componentName, ((ServiceConnectedEvent) (message)).iBinder);
                return true;

            case 2: // '\002'
                handleServiceDisconnected((ComponentName)message.obj);
                return true;

            case 3: // '\003'
                handleRetryListenerQueue((ComponentName)message.obj);
                break;
            }
            return true;
        }

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            if (Log.isLoggable(z[1], 3))
            {
                Log.d(z[0], (new StringBuilder()).append(z[2]).append(componentname).toString());
            }
            mHandler.obtainMessage(1, new ServiceConnectedEvent(componentname, ibinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            if (Log.isLoggable(z[26], 3))
            {
                Log.d(z[27], (new StringBuilder()).append(z[25]).append(componentname).toString());
            }
            mHandler.obtainMessage(2, componentname).sendToTarget();
        }

        public void queueTask(Task task)
        {
            mHandler.obtainMessage(0, task).sendToTarget();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[42];
            obj = "\tF!\f\033\nH;&\022*Y4\021";
            byte0 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "\004F;\013\030$]0\001]3Fu\026\0305_<\006\030g";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    obj = "\025L8\n\t\"l-\006\0307]<\n\023gJ:\b\0202G<\006\0343@;\002]0@!\r]";
                    i = 4;
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    i = 5;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 4;
                    break;

                case 4: // '\004'
                    as1[i] = ((String) (obj));
                    i = 6;
                    obj = "\024L;\001\024)Nu\021\0344Bu";
                    byte0 = 5;
                    break;

                case 5: // '\005'
                    as1[i] = ((String) (obj));
                    i = 7;
                    obj = "k\t";
                    byte0 = 6;
                    break;

                case 6: // '\006'
                    as1[i] = ((String) (obj));
                    i = 8;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 7;
                    break;

                case 7: // '\007'
                    as1[i] = ((String) (obj));
                    i = 9;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 8;
                    break;

                case 8: // '\b'
                    as1[i] = ((String) (obj));
                    i = 10;
                    obj = "\025L8\n\t\"\t&\000\0171@6\000]/H&E\031.L1_]";
                    byte0 = 9;
                    break;

                case 9: // '\t'
                    as1[i] = ((String) (obj));
                    i = 11;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 10;
                    break;

                case 10: // '\n'
                    as1[i] = ((String) (obj));
                    i = 12;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 11;
                    break;

                case 11: // '\013'
                    as1[i] = ((String) (obj));
                    i = 13;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 12;
                    break;

                case 12: // '\f'
                    as1[i] = ((String) (obj));
                    i = 14;
                    obj = "\027[:\006\0304Z<\013\032gJ:\b\r(G0\013\tg";
                    byte0 = 13;
                    break;

                case 13: // '\r'
                    as1[i] = ((String) (obj));
                    i = 15;
                    obj = "gX \000\b\"Mu\021\0344B&";
                    byte0 = 14;
                    break;

                case 14: // '\016'
                    as1[i] = ((String) (obj));
                    i = 16;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 15;
                    break;

                case 15: // '\017'
                    as1[i] = ((String) (obj));
                    i = 17;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 16;
                    break;

                case 16: // '\020'
                    as1[i] = ((String) (obj));
                    i = 18;
                    obj = "g[0\021\017.L&";
                    byte0 = 17;
                    break;

                case 17: // '\021'
                    as1[i] = ((String) (obj));
                    i = 19;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 18;
                    break;

                case 18: // '\022'
                    as1[i] = ((String) (obj));
                    i = 20;
                    obj = "\000@#\f\023 \t \025](Gu\001\030+@#\000\017.G2E";
                    byte0 = 19;
                    break;

                case 19: // '\023'
                    as1[i] = ((String) (obj));
                    i = 21;
                    obj = "gH3\021\0305\t";
                    byte0 = 20;
                    break;

                case 20: // '\024'
                    as1[i] = ((String) (obj));
                    i = 22;
                    obj = "gD&";
                    byte0 = 21;
                    break;

                case 21: // '\025'
                    as1[i] = ((String) (obj));
                    i = 23;
                    obj = "g]4\026\0264\t!\n]";
                    byte0 = 22;
                    break;

                case 22: // '\026'
                    as1[i] = ((String) (obj));
                    i = 24;
                    obj = "\024J=\000\0312E<\013\032g[0\021\017>\t3\n\017g";
                    byte0 = 23;
                    break;

                case 23: // '\027'
                    as1[i] = ((String) (obj));
                    i = 25;
                    obj = "\003@&\006\022)G0\006\t\"Mu\003\017(Du\026\0305_<\006\030g";
                    byte0 = 24;
                    break;

                case 24: // '\030'
                    as1[i] = ((String) (obj));
                    i = 26;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 25;
                    break;

                case 25: // '\031'
                    as1[i] = ((String) (obj));
                    i = 27;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 26;
                    break;

                case 26: // '\032'
                    as1[i] = ((String) (obj));
                    i = 28;
                    obj = "\tF!\f\033.J4\021\024(G\030\004\023&N0\027>(D%\004\t";
                    byte0 = 27;
                    break;

                case 27: // '\033'
                    as1[i] = ((String) (obj));
                    i = 29;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 28;
                    break;

                case 28: // '\034'
                    as1[i] = ((String) (obj));
                    i = 30;
                    obj = "&G1\027\022.M{\026\b7Y:\027\tik\034+9\030g\03214\001`\026$)\016f\033:.\016m\020:>\017h\033+8\013";
                    byte0 = 29;
                    break;

                case 29: // '\035'
                    as1[i] = ((String) (obj));
                    i = 31;
                    obj = "\022G4\007\021\"\t!\n]%@;\001]3Fu\t\0244]0\013\0305\t";
                    byte0 = 30;
                    break;

                case 30: // '\036'
                    as1[i] = ((String) (obj));
                    i = 32;
                    obj = "&G1\027\022.M{\026\b7Y:\027\tik\034+9\030g\03214\001`\026$)\016f\033:.\016m\020:>\017h\033+8\013";
                    byte0 = 31;
                    break;

                case 31: // '\037'
                    as1[i] = ((String) (obj));
                    i = 33;
                    obj = "k\t;\n\tgH1\001\024)Nu\t\0244]0\013\0305\t'\000\036([1K";
                    byte0 = 32;
                    break;

                case 32: // ' '
                    as1[i] = ((String) (obj));
                    i = 34;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 33;
                    break;

                case 33: // '!'
                    as1[i] = ((String) (obj));
                    i = 35;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 34;
                    break;

                case 34: // '"'
                    as1[i] = ((String) (obj));
                    i = 36;
                    obj = "\025L8\n\013.G2E\021.Z!\000\023\"[u\027\030$F'\001]!F'E";
                    byte0 = 35;
                    break;

                case 35: // '#'
                    as1[i] = ((String) (obj));
                    i = 37;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 36;
                    break;

                case 36: // '$'
                    as1[i] = ((String) (obj));
                    i = 38;
                    obj = "\006M1\f\023 \t9\f\0163L;\000\017g[0\006\0225Mu\003\0225\t";
                    byte0 = 37;
                    break;

                case 37: // '%'
                    as1[i] = ((String) (obj));
                    i = 39;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 38;
                    break;

                case 38: // '&'
                    as1[i] = ((String) (obj));
                    i = 40;
                    obj = "\tF!\f\033\nH;&\022*Y4\021";
                    byte0 = 39;
                    break;

                case 39: // '\''
                    as1[i] = ((String) (obj));
                    i = 41;
                    obj = "\027L'\b\0244Z<\n\023gY'\000\016\"G!E\022)\t6\n\0207F;\000\0233\t";
                    byte0 = 40;
                    break;

                case 40: // '('
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 1004
        //                       0 1027
        //                       1 1034
        //                       2 1041
        //                       3 1048;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_1048;
_L3:
            byte byte1 = 125;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 71;
              goto _L9
_L5:
            byte1 = 41;
              goto _L9
_L6:
            byte1 = 85;
              goto _L9
            byte1 = 101;
              goto _L9
        }

        public SideChannelManager(Context context)
        {
            mCachedEnabledPackages = new HashSet();
            mContext = context;
            mHandlerThread = new HandlerThread(z[28]);
            mHandlerThread.start();
            mHandler = new Handler(mHandlerThread.getLooper(), this);
        }

        private class Task
        {

            public abstract void send(INotificationSideChannel inotificationsidechannel);
        }


        private class ServiceConnectedEvent
        {

            final ComponentName componentName;
            final IBinder iBinder;

            public ServiceConnectedEvent(ComponentName componentname, IBinder ibinder)
            {
                componentName = componentname;
                iBinder = ibinder;
            }
        }

    }


    private class Impl
    {

        public abstract void cancelNotification(NotificationManager notificationmanager, String s, int i);

        public abstract int getSideChannelBindFlags();

        public abstract void postNotification(NotificationManager notificationmanager, String s, int i, Notification notification);
    }


    private class CancelTask
        implements Task
    {

        private static final String z[];
        final boolean all = false;
        final int id;
        final String packageName;
        final String tag;

        public void send(INotificationSideChannel inotificationsidechannel)
        {
label0:
            {
                if (all)
                {
                    inotificationsidechannel.cancelAll(packageName);
                    if (FragmentActivity.a == 0)
                    {
                        break label0;
                    }
                }
                inotificationsidechannel.cancel(packageName, id, tag);
            }
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(z[1]);
            stringbuilder.append(z[2]).append(packageName);
            stringbuilder.append(z[3]).append(id);
            stringbuilder.append(z[0]).append(tag);
            stringbuilder.append(z[4]).append(all);
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte0;
            int i;
            as = new String[5];
            obj = "H\037K`I^";
            byte0 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte0)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = "'^QbK\bk^rE?";
                    i = 1;
                    byte0 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "\024^\\jO\003Zq`C\001\005";
                    i = 2;
                    byte0 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    obj = "H\037Ve\024";
                    i = 3;
                    byte0 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    i = 4;
                    obj = "H\037^mB^";
                    byte0 = 3;
                    break;

                case 3: // '\003'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 192
        //                       0 215
        //                       1 222
        //                       2 229
        //                       3 236;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_236;
_L3:
            byte byte1 = 46;
_L9:
            obj[j] = (char)(byte1 ^ c);
            j++;
              goto _L8
_L4:
            byte1 = 100;
              goto _L9
_L5:
            byte1 = 63;
              goto _L9
_L6:
            byte1 = 63;
              goto _L9
            byte1 = 1;
              goto _L9
        }

        public CancelTask(String s, int i, String s1)
        {
            packageName = s;
            id = i;
            tag = s1;
        }
    }


    private class NotifyTask
        implements Task
    {

        private static final String z[];
        final int id;
        final Notification notif;
        final String packageName;
        final String tag;

        public void send(INotificationSideChannel inotificationsidechannel)
        {
            inotificationsidechannel.notify(packageName, id, tag, notif);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder(z[1]);
            stringbuilder.append(z[2]).append(packageName);
            stringbuilder.append(z[0]).append(id);
            stringbuilder.append(z[3]).append(tag);
            stringbuilder.append("]");
            return stringbuilder.toString();
        }

        static 
        {
            Object obj;
            String as[];
            byte byte1;
            int i;
            as = new String[4];
            obj = "yb\025a,";
            byte1 = -1;
            i = 0;
_L2:
            String as1[];
            int j;
            int k;
            as1 = as;
            obj = ((String) (obj)).toCharArray();
            k = obj.length;
            j = 0;
_L8:
label0:
            {
                if (k > j)
                {
                    break label0;
                }
                obj = (new String(((char []) (obj)))).intern();
                switch (byte1)
                {
                default:
                    as1[i] = ((String) (obj));
                    obj = "\033-\blp,\026\035v}\016";
                    i = 1;
                    byte1 = 0;
                    break;

                case 0: // '\0'
                    as1[i] = ((String) (obj));
                    obj = "%#\037nw2'2d{0x";
                    i = 2;
                    byte1 = 1;
                    break;

                case 1: // '\001'
                    as1[i] = ((String) (obj));
                    i = 3;
                    obj = "yb\bdqo";
                    byte1 = 2;
                    break;

                case 2: // '\002'
                    as1[i] = ((String) (obj));
                    z = as;
                    return;
                }
            }
            if (true) goto _L2; else goto _L1
_L1:
            char c = obj[j];
            j % 5;
            JVM INSTR tableswitch 0 3: default 176
        //                       0 197
        //                       1 203
        //                       2 209
        //                       3 215;
               goto _L3 _L4 _L5 _L6 _L7
_L7:
            break MISSING_BLOCK_LABEL_215;
_L3:
            byte byte0 = 22;
_L9:
            obj[j] = (char)(byte0 ^ c);
            j++;
              goto _L8
_L4:
            byte0 = 85;
              goto _L9
_L5:
            byte0 = 66;
              goto _L9
_L6:
            byte0 = 124;
              goto _L9
            byte0 = 5;
              goto _L9
        }

        public NotifyTask(String s, int i, String s1, Notification notification)
        {
            packageName = s;
            id = i;
            tag = s1;
            notif = notification;
        }
    }


    private class ImplIceCreamSandwich extends ImplEclair
    {
        private class ImplEclair extends ImplBase
        {
            private class ImplBase
                implements Impl
            {

                public void cancelNotification(NotificationManager notificationmanager, String s, int i)
                {
                    notificationmanager.cancel(i);
                }

                public int getSideChannelBindFlags()
                {
                    return 1;
                }

                public void postNotification(NotificationManager notificationmanager, String s, int i, Notification notification)
                {
                    notificationmanager.notify(i, notification);
                }

                ImplBase()
                {
                }
            }


            public void cancelNotification(NotificationManager notificationmanager, String s, int i)
            {
                NotificationManagerCompatEclair.cancelNotification(notificationmanager, s, i);
            }

            public void postNotification(NotificationManager notificationmanager, String s, int i, Notification notification)
            {
                NotificationManagerCompatEclair.postNotification(notificationmanager, s, i, notification);
            }

            ImplEclair()
            {
            }
        }


        public int getSideChannelBindFlags()
        {
            return 33;
        }

        ImplIceCreamSandwich()
        {
        }
    }

}
