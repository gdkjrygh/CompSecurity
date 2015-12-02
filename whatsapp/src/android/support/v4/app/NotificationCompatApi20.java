// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            RemoteInputCompatApi20

class NotificationCompatApi20
{

    public static void addAction(android.app.Notification.Builder builder, NotificationCompatBase.Action action)
    {
        boolean flag = NotificationCompatBase.Action.a;
        android.app.Notification.Action.Builder builder1 = new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null)
        {
            android.app.RemoteInput aremoteinput[] = RemoteInputCompatApi20.fromCompat(action.getRemoteInputs());
            int j = aremoteinput.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                builder1.addRemoteInput(aremoteinput[i]);
                i++;
            } while (!flag);
        }
        if (action.getExtras() != null)
        {
            builder1.addExtras(action.getExtras());
        }
        builder.addAction(builder1.build());
    }

    private static android.app.Notification.Action getActionFromActionCompat(NotificationCompatBase.Action action)
    {
        boolean flag = NotificationCompatBase.Action.a;
        android.app.Notification.Action.Builder builder = (new android.app.Notification.Action.Builder(action.getIcon(), action.getTitle(), action.getActionIntent())).addExtras(action.getExtras());
        action = action.getRemoteInputs();
        if (action != null)
        {
            action = RemoteInputCompatApi20.fromCompat(action);
            int j = action.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                builder.addRemoteInput(action[i]);
                i++;
            } while (!flag);
        }
        return builder.build();
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
            arraylist1.add(getActionFromActionCompat(aaction[i]));
            i++;
            if (flag)
            {
                return arraylist1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
