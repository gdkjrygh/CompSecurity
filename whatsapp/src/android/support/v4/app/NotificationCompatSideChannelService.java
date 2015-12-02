// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;

// Referenced classes of package android.support.v4.app:
//            FragmentActivity

public abstract class NotificationCompatSideChannelService extends Service
{

    private static final String z[];

    public NotificationCompatSideChannelService()
    {
    }

    private void checkPermission(int i, String s)
    {
        int k = FragmentActivity.a;
        String as[] = getPackageManager().getPackagesForUid(i);
        int l = as.length;
        int j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            String s1 = as[j];
            boolean flag;
            try
            {
                flag = s1.equals(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                return;
            }
            j++;
        } while (k == 0);
        throw new SecurityException((new StringBuilder()).append(z[0]).append(i).append(z[1]).append(s).toString());
    }

    public abstract void cancel(String s, int i, String s1);

    public abstract void cancelAll(String s);

    public abstract void notify(String s, int i, String s1, Notification notification);

    public IBinder onBind(Intent intent)
    {
        Object obj = null;
        boolean flag;
        try
        {
            flag = intent.getAction().equals(z[2]);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        intent = obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (android.os.Build.VERSION.SDK_INT > 19)
        {
            return null;
        }
        intent = new NotificationSideChannelStub(null);
        return intent;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "i'\\3\023N+I.\034H&{3\021B\013@;\033I-D\t\020U>A9\020\035h}3\021\007";
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
                obj = "\007![z\033H<\b;\000S G(\034]-Lz\023H:\b*\024D#I=\020\007";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "F&L(\032N,\006)\000W8G(\001\t\na\0241x\006g\016<a\001k\033!n\007f\005&n\fm\0056o\tf\0240k";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 117;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 39;
          goto _L9
_L5:
        byte0 = 72;
          goto _L9
_L6:
        byte0 = 40;
          goto _L9
        byte0 = 90;
          goto _L9
    }


    private class NotificationSideChannelStub extends INotificationSideChannel.Stub
    {

        final NotificationCompatSideChannelService this$0;

        public void cancel(String s, int i, String s1)
        {
            long l;
            checkPermission(getCallingUid(), s);
            l = clearCallingIdentity();
            NotificationCompatSideChannelService.this.cancel(s, i, s1);
            restoreCallingIdentity(l);
            return;
            s;
            restoreCallingIdentity(l);
            throw s;
        }

        public void cancelAll(String s)
        {
            long l;
            checkPermission(getCallingUid(), s);
            l = clearCallingIdentity();
            NotificationCompatSideChannelService.this.cancelAll(s);
            restoreCallingIdentity(l);
            return;
            s;
            restoreCallingIdentity(l);
            throw s;
        }

        public void notify(String s, int i, String s1, Notification notification)
        {
            long l;
            checkPermission(getCallingUid(), s);
            l = clearCallingIdentity();
            NotificationCompatSideChannelService.this.notify(s, i, s1, notification);
            restoreCallingIdentity(l);
            return;
            s;
            restoreCallingIdentity(l);
            throw s;
        }

        private NotificationSideChannelStub()
        {
            this$0 = NotificationCompatSideChannelService.this;
            super();
        }

        NotificationSideChannelStub(_cls1 _pcls1)
        {
            this();
        }
    }

}
