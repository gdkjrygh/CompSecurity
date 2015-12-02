// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

class RemoteInputCompatApi20
{

    static RemoteInput[] fromCompat(RemoteInputCompatBase.RemoteInput aremoteinput[])
    {
        boolean flag = NotificationCompatBase.Action.a;
        if (aremoteinput == null)
        {
            return null;
        }
        RemoteInput aremoteinput1[] = new RemoteInput[aremoteinput.length];
        int i = 0;
        do
        {
            if (i >= aremoteinput.length)
            {
                break;
            }
            RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
            aremoteinput1[i] = (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
            i++;
        } while (!flag);
        return aremoteinput1;
    }

    static Bundle getResultsFromIntent(Intent intent)
    {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
