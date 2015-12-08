// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

class RemoteInputCompatApi20
{

    RemoteInputCompatApi20()
    {
    }

    static void addResultsToIntent(RemoteInputCompatBase.RemoteInput aremoteinput[], Intent intent, Bundle bundle)
    {
        RemoteInput.addResultsToIntent(fromCompat(aremoteinput), intent, bundle);
    }

    static RemoteInput[] fromCompat(RemoteInputCompatBase.RemoteInput aremoteinput[])
    {
        if (aremoteinput != null) goto _L2; else goto _L1
_L1:
        RemoteInput aremoteinput1[] = null;
_L4:
        return aremoteinput1;
_L2:
        RemoteInput aremoteinput2[] = new RemoteInput[aremoteinput.length];
        int i = 0;
        do
        {
            aremoteinput1 = aremoteinput2;
            if (i >= aremoteinput.length)
            {
                continue;
            }
            RemoteInputCompatBase.RemoteInput remoteinput = aremoteinput[i];
            aremoteinput2[i] = (new android.app.RemoteInput.Builder(remoteinput.getResultKey())).setLabel(remoteinput.getLabel()).setChoices(remoteinput.getChoices()).setAllowFreeFormInput(remoteinput.getAllowFreeFormInput()).addExtras(remoteinput.getExtras()).build();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static Bundle getResultsFromIntent(Intent intent)
    {
        return RemoteInput.getResultsFromIntent(intent);
    }

    static RemoteInputCompatBase.RemoteInput[] toCompat(RemoteInput aremoteinput[], RemoteInputCompatBase.RemoteInput.Factory factory)
    {
        if (aremoteinput != null) goto _L2; else goto _L1
_L1:
        RemoteInputCompatBase.RemoteInput aremoteinput1[] = null;
_L4:
        return aremoteinput1;
_L2:
        RemoteInputCompatBase.RemoteInput aremoteinput2[] = factory.newArray(aremoteinput.length);
        int i = 0;
        do
        {
            aremoteinput1 = aremoteinput2;
            if (i >= aremoteinput.length)
            {
                continue;
            }
            RemoteInput remoteinput = aremoteinput[i];
            aremoteinput2[i] = factory.build(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
