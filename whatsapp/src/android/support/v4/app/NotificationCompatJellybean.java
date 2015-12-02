// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithBuilderAccessor, RemoteInputCompatJellybean

class NotificationCompatJellybean
{

    private static final Object sActionsLock;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock;
    private static final String z[];

    public static void addBigPictureStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, Bitmap bitmap, Bitmap bitmap1, boolean flag1)
    {
        notificationbuilderwithbuilderaccessor = (new android.app.Notification.BigPictureStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigPicture(bitmap);
        if (flag1)
        {
            notificationbuilderwithbuilderaccessor.bigLargeIcon(bitmap1);
        }
        if (flag)
        {
            notificationbuilderwithbuilderaccessor.setSummaryText(charsequence1);
        }
    }

    public static void addBigTextStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, CharSequence charsequence2)
    {
        notificationbuilderwithbuilderaccessor = (new android.app.Notification.BigTextStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence).bigText(charsequence2);
        if (flag)
        {
            notificationbuilderwithbuilderaccessor.setSummaryText(charsequence1);
        }
    }

    public static void addInboxStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, CharSequence charsequence, boolean flag, CharSequence charsequence1, ArrayList arraylist)
    {
        boolean flag1 = NotificationCompatBase.Action.a;
        notificationbuilderwithbuilderaccessor = (new android.app.Notification.InboxStyle(notificationbuilderwithbuilderaccessor.getBuilder())).setBigContentTitle(charsequence);
        if (flag)
        {
            notificationbuilderwithbuilderaccessor.setSummaryText(charsequence1);
        }
        charsequence = arraylist.iterator();
        do
        {
            if (!charsequence.hasNext())
            {
                break;
            }
            notificationbuilderwithbuilderaccessor.addLine((CharSequence)charsequence.next());
        } while (!flag1);
    }

    public static SparseArray buildActionExtrasMap(List list)
    {
        boolean flag = NotificationCompatBase.Action.a;
        SparseArray sparsearray = null;
        int j = list.size();
        int i = 0;
        do
        {
            SparseArray sparsearray1;
label0:
            {
                sparsearray1 = sparsearray;
                if (i < j)
                {
                    Bundle bundle = (Bundle)list.get(i);
                    sparsearray1 = sparsearray;
                    if (bundle != null)
                    {
                        sparsearray1 = sparsearray;
                        if (sparsearray == null)
                        {
                            sparsearray1 = new SparseArray();
                        }
                        sparsearray1.put(i, bundle);
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return sparsearray1;
            }
            i++;
            sparsearray = sparsearray1;
        } while (true);
    }

    private static Bundle getBundleForAction(NotificationCompatBase.Action action)
    {
        Bundle bundle = new Bundle();
        bundle.putInt(z[0], action.getIcon());
        bundle.putCharSequence(z[4], action.getTitle());
        bundle.putParcelable(z[2], action.getActionIntent());
        bundle.putBundle(z[1], action.getExtras());
        bundle.putParcelableArray(z[3], RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()));
        return bundle;
    }

    public static Bundle getExtras(Notification notification)
    {
label0:
        {
            synchronized (sExtrasLock)
            {
                if (!sExtrasFieldAccessFailed)
                {
                    break label0;
                }
            }
            return null;
        }
        Object obj;
        if (sExtrasField != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = android/app/Notification.getDeclaredField(z[6]);
        if (android/os/Bundle.isAssignableFrom(((Field) (obj)).getType()))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        Log.e(z[7], z[10]);
        sExtrasFieldAccessFailed = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        ((Field) (obj)).setAccessible(true);
        sExtrasField = ((Field) (obj));
        Bundle bundle = (Bundle)sExtrasField.get(notification);
        obj = bundle;
        if (bundle != null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        obj = new Bundle();
        sExtrasField.set(notification, obj);
        obj1;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj));
        notification;
        obj1;
        JVM INSTR monitorexit ;
        throw notification;
        notification;
        Log.e(z[8], z[12], notification);
_L1:
        sExtrasFieldAccessFailed = true;
        obj1;
        JVM INSTR monitorexit ;
        return null;
        notification;
        Log.e(z[11], z[9], notification);
          goto _L1
    }

    public static ArrayList getParcelableArrayListForActions(NotificationCompatBase.Action aaction[])
    {
        boolean flag = NotificationCompatBase.Action.a;
        if (aaction != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = null;
_L4:
        return arraylist;
_L2:
        ArrayList arraylist1 = new ArrayList(aaction.length);
        int j = aaction.length;
        int i = 0;
        do
        {
            arraylist = arraylist1;
            if (i >= j)
            {
                continue; /* Loop/switch isn't completed */
            }
            arraylist1.add(getBundleForAction(aaction[i]));
            i++;
            if (flag)
            {
                return arraylist1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Bundle writeActionAndGetExtras(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
    {
        builder.addAction(action.getIcon(), action.getTitle(), action.getActionIntent());
        builder = new Bundle(action.getExtras());
        if (action.getRemoteInputs() != null)
        {
            builder.putParcelableArray(z[5], RemoteInputCompatJellybean.toBundleArray(action.getRemoteInputs()));
        }
        return builder;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[13];
        obj = "%\021xb";
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
                obj = ")\nc~\f?";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "-\021ce\002\";yx\b\"\006";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ">\027zc\031);y|\0308\001";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "8\033c`\b";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "-\034s~\002%\0269\177\030<\002x~\031b\000ra\0028\027^b\0359\006d";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = ")\nc~\f?";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\002\035ce\013%\021vx\004#\034Tc\000<\023c";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\002\035ce\013%\021vx\004#\034Tc\000<\023c";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\031\034vn\001)RccM-\021ti\036?Ryc\031%\024~o\f8\033xbM)\nc~\f?";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\002\035ce\013%\021vx\004#\0349i\0258\000v\177M*\033r`\tl\033d,\003#\0067c\013l\006n|\bl0bb\t \027";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\002\035ce\013%\021vx\004#\034Tc\000<\023c";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "\031\034vn\001)RccM-\021ti\036?Ryc\031%\024~o\f8\033xbM)\nc~\f?";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                z = as;
                sExtrasLock = new Object();
                sActionsLock = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 388
    //                   0 411
    //                   1 418
    //                   2 425
    //                   3 432;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_432;
_L3:
        byte byte1 = 109;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 76;
          goto _L9
_L5:
        byte1 = 114;
          goto _L9
_L6:
        byte1 = 23;
          goto _L9
        byte1 = 12;
          goto _L9
    }
}
